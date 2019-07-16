package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Iterator;

public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;
    @LazyInit
    private transient Converter<B, A> reverse;

    private static final class ConverterComposition<A, B, C> extends Converter<A, C> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> first;
        final Converter<B, C> second;

        ConverterComposition(Converter<A, B> converter, Converter<B, C> converter2) {
            this.first = converter;
            this.second = converter2;
        }

        /* access modifiers changed from: 0000 */
        public A correctedDoBackward(C c) {
            return this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        /* access modifiers changed from: 0000 */
        public C correctedDoForward(A a) {
            return this.second.correctedDoForward(this.first.correctedDoForward(a));
        }

        /* access modifiers changed from: protected */
        public A doBackward(C c) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public C doForward(A a) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ConverterComposition)) {
                return false;
            }
            ConverterComposition converterComposition = (ConverterComposition) obj;
            if (!this.first.equals(converterComposition.first) || !this.second.equals(converterComposition.second)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.first);
            sb.append(".andThen(");
            sb.append(this.second);
            sb.append(")");
            return sb.toString();
        }
    }

    private static final class FunctionBasedConverter<A, B> extends Converter<A, B> implements Serializable {
        private final Function<? super B, ? extends A> backwardFunction;
        private final Function<? super A, ? extends B> forwardFunction;

        /* access modifiers changed from: protected */
        public A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        /* access modifiers changed from: protected */
        public B doForward(A a) {
            return this.forwardFunction.apply(a);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof FunctionBasedConverter)) {
                return false;
            }
            FunctionBasedConverter functionBasedConverter = (FunctionBasedConverter) obj;
            if (!this.forwardFunction.equals(functionBasedConverter.forwardFunction) || !this.backwardFunction.equals(functionBasedConverter.backwardFunction)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Converter.from(");
            sb.append(this.forwardFunction);
            sb.append(", ");
            sb.append(this.backwardFunction);
            sb.append(")");
            return sb.toString();
        }

        private FunctionBasedConverter(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            Preconditions.checkNotNull(function);
            this.forwardFunction = function;
            Preconditions.checkNotNull(function2);
            this.backwardFunction = function2;
        }
    }

    private static final class IdentityConverter<T> extends Converter<T, T> implements Serializable {
        static final IdentityConverter INSTANCE = new IdentityConverter();
        private static final long serialVersionUID = 0;

        private IdentityConverter() {
        }

        private Object readResolve() {
            return INSTANCE;
        }

        /* access modifiers changed from: 0000 */
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            Preconditions.checkNotNull(converter, "otherConverter");
            return converter;
        }

        /* access modifiers changed from: protected */
        public T doBackward(T t) {
            return t;
        }

        /* access modifiers changed from: protected */
        public T doForward(T t) {
            return t;
        }

        public IdentityConverter<T> reverse() {
            return this;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    private static final class ReverseConverter<A, B> extends Converter<B, A> implements Serializable {
        private static final long serialVersionUID = 0;
        final Converter<A, B> original;

        ReverseConverter(Converter<A, B> converter) {
            this.original = converter;
        }

        /* access modifiers changed from: 0000 */
        public B correctedDoBackward(A a) {
            return this.original.correctedDoForward(a);
        }

        /* access modifiers changed from: 0000 */
        public A correctedDoForward(B b) {
            return this.original.correctedDoBackward(b);
        }

        /* access modifiers changed from: protected */
        public B doBackward(A a) {
            throw new AssertionError();
        }

        /* access modifiers changed from: protected */
        public A doForward(B b) {
            throw new AssertionError();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ReverseConverter)) {
                return false;
            }
            return this.original.equals(((ReverseConverter) obj).original);
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        public Converter<A, B> reverse() {
            return this.original;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.original);
            sb.append(".reverse()");
            return sb.toString();
        }
    }

    protected Converter() {
        this(true);
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new FunctionBasedConverter(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return IdentityConverter.INSTANCE;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final B apply(A a) {
        return convert(a);
    }

    @CanIgnoreReturnValue
    public final B convert(A a) {
        return correctedDoForward(a);
    }

    @CanIgnoreReturnValue
    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() {
            public Iterator<B> iterator() {
                return new Iterator<B>() {
                    private final Iterator<? extends A> fromIterator = iterable.iterator();

                    public boolean hasNext() {
                        return this.fromIterator.hasNext();
                    }

                    public B next() {
                        return Converter.this.convert(this.fromIterator.next());
                    }

                    public void remove() {
                        this.fromIterator.remove();
                    }
                };
            }
        };
    }

    /* access modifiers changed from: 0000 */
    public A correctedDoBackward(B b) {
        A a;
        if (!this.handleNullAutomatically) {
            return doBackward(b);
        }
        if (b == null) {
            a = null;
        } else {
            a = doBackward(b);
            Preconditions.checkNotNull(a);
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    public B correctedDoForward(A a) {
        B b;
        if (!this.handleNullAutomatically) {
            return doForward(a);
        }
        if (a == null) {
            b = null;
        } else {
            b = doForward(a);
            Preconditions.checkNotNull(b);
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        Preconditions.checkNotNull(converter);
        return new ConverterComposition(this, converter);
    }

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract A doBackward(B b);

    /* access modifiers changed from: protected */
    @ForOverride
    public abstract B doForward(A a);

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        ReverseConverter reverseConverter = new ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }
}
