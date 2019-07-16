package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

public final class Predicates {

    private static class AndPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (!((Predicate) this.components.get(i)).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof AndPredicate)) {
                return false;
            }
            return this.components.equals(((AndPredicate) obj).components);
        }

        public int hashCode() {
            return this.components.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.components);
        }

        private AndPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }
    }

    private static class CompositionPredicate<A, B> implements Predicate<A>, Serializable {
        private static final long serialVersionUID = 0;
        final Function<A, ? extends B> f;
        final Predicate<B> p;

        public boolean apply(A a) {
            return this.p.apply(this.f.apply(a));
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof CompositionPredicate)) {
                return false;
            }
            CompositionPredicate compositionPredicate = (CompositionPredicate) obj;
            if (!this.f.equals(compositionPredicate.f) || !this.p.equals(compositionPredicate.p)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.p.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.p);
            sb.append("(");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }

        private CompositionPredicate(Predicate<B> predicate, Function<A, ? extends B> function) {
            Preconditions.checkNotNull(predicate);
            this.p = predicate;
            Preconditions.checkNotNull(function);
            this.f = function;
        }
    }

    private static class ContainsPatternFromStringPredicate extends ContainsPatternPredicate {
        private static final long serialVersionUID = 0;

        ContainsPatternFromStringPredicate(String str) {
            super(Platform.compilePattern(str));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.containsPattern(");
            sb.append(this.pattern.pattern());
            sb.append(")");
            return sb.toString();
        }
    }

    private static class ContainsPatternPredicate implements Predicate<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;
        final CommonPattern pattern;

        ContainsPatternPredicate(CommonPattern commonPattern) {
            Preconditions.checkNotNull(commonPattern);
            this.pattern = commonPattern;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ContainsPatternPredicate)) {
                return false;
            }
            ContainsPatternPredicate containsPatternPredicate = (ContainsPatternPredicate) obj;
            if (!Objects.equal(this.pattern.pattern(), containsPatternPredicate.pattern.pattern()) || this.pattern.flags() != containsPatternPredicate.pattern.flags()) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return Objects.hashCode(this.pattern.pattern(), Integer.valueOf(this.pattern.flags()));
        }

        public String toString() {
            String str = "pattern.flags";
            String toStringHelper = MoreObjects.toStringHelper((Object) this.pattern).add("pattern", (Object) this.pattern.pattern()).add(str, this.pattern.flags()).toString();
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.contains(");
            sb.append(toStringHelper);
            sb.append(")");
            return sb.toString();
        }

        public boolean apply(CharSequence charSequence) {
            return this.pattern.matcher(charSequence).find();
        }
    }

    private static class InPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Collection<?> target;

        public boolean apply(T t) {
            try {
                return this.target.contains(t);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InPredicate)) {
                return false;
            }
            return this.target.equals(((InPredicate) obj).target);
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.in(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }

        private InPredicate(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            this.target = collection;
        }
    }

    private static class InstanceOfPredicate implements Predicate<Object>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public boolean apply(Object obj) {
            return this.clazz.isInstance(obj);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof InstanceOfPredicate)) {
                return false;
            }
            if (this.clazz == ((InstanceOfPredicate) obj).clazz) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.instanceOf(");
            sb.append(this.clazz.getName());
            sb.append(")");
            return sb.toString();
        }

        private InstanceOfPredicate(Class<?> cls) {
            Preconditions.checkNotNull(cls);
            this.clazz = cls;
        }
    }

    private static class IsEqualToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final T target;

        public boolean apply(T t) {
            return this.target.equals(t);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof IsEqualToPredicate)) {
                return false;
            }
            return this.target.equals(((IsEqualToPredicate) obj).target);
        }

        public int hashCode() {
            return this.target.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.equalTo(");
            sb.append(this.target);
            sb.append(")");
            return sb.toString();
        }

        private IsEqualToPredicate(T t) {
            this.target = t;
        }
    }

    private static class NotPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        final Predicate<T> predicate;

        NotPredicate(Predicate<T> predicate2) {
            Preconditions.checkNotNull(predicate2);
            this.predicate = predicate2;
        }

        public boolean apply(T t) {
            return !this.predicate.apply(t);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof NotPredicate)) {
                return false;
            }
            return this.predicate.equals(((NotPredicate) obj).predicate);
        }

        public int hashCode() {
            return ~this.predicate.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.not(");
            sb.append(this.predicate);
            sb.append(")");
            return sb.toString();
        }
    }

    enum ObjectPredicate implements Predicate<Object> {
        ALWAYS_TRUE {
            public boolean apply(Object obj) {
                return true;
            }

            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE {
            public boolean apply(Object obj) {
                return false;
            }

            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL {
            public boolean apply(Object obj) {
                return obj == null;
            }

            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL {
            public boolean apply(Object obj) {
                return obj != null;
            }

            public String toString() {
                return "Predicates.notNull()";
            }
        };

        /* access modifiers changed from: 0000 */
        public <T> Predicate<T> withNarrowedType() {
            return this;
        }
    }

    private static class OrPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends Predicate<? super T>> components;

        public boolean apply(T t) {
            for (int i = 0; i < this.components.size(); i++) {
                if (((Predicate) this.components.get(i)).apply(t)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof OrPredicate)) {
                return false;
            }
            return this.components.equals(((OrPredicate) obj).components);
        }

        public int hashCode() {
            return this.components.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.components);
        }

        private OrPredicate(List<? extends Predicate<? super T>> list) {
            this.components = list;
        }
    }

    private static class SubtypeOfPredicate implements Predicate<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;
        private final Class<?> clazz;

        public boolean equals(Object obj) {
            if (!(obj instanceof SubtypeOfPredicate)) {
                return false;
            }
            if (this.clazz == ((SubtypeOfPredicate) obj).clazz) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.clazz.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Predicates.subtypeOf(");
            sb.append(this.clazz.getName());
            sb.append(")");
            return sb.toString();
        }

        private SubtypeOfPredicate(Class<?> cls) {
            Preconditions.checkNotNull(cls);
            this.clazz = cls;
        }

        public boolean apply(Class<?> cls) {
            return this.clazz.isAssignableFrom(cls);
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return ObjectPredicate.ALWAYS_FALSE.withNarrowedType();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new AndPredicate(defensiveCopy(iterable));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(new Predicate[]{predicate, predicate2});
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new CompositionPredicate(predicate, function);
    }

    public static Predicate<CharSequence> contains(Pattern pattern) {
        return new ContainsPatternPredicate(new JdkPattern(pattern));
    }

    public static Predicate<CharSequence> containsPattern(String str) {
        return new ContainsPatternFromStringPredicate(str);
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy((Iterable<T>) Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(T t) {
        return t == null ? isNull() : new IsEqualToPredicate(t);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new InPredicate(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new InstanceOfPredicate(cls);
    }

    public static <T> Predicate<T> isNull() {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new NotPredicate(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new OrPredicate(defensiveCopy(iterable));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new SubtypeOfPredicate(cls);
    }

    /* access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb = new StringBuilder("Predicates.");
        sb.append(str);
        sb.append('(');
        boolean z = true;
        for (Object next : iterable) {
            if (!z) {
                sb.append(',');
            }
            sb.append(next);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new AndPredicate(defensiveCopy((T[]) predicateArr));
    }

    static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            Preconditions.checkNotNull(next);
            arrayList.add(next);
        }
        return arrayList;
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new OrPredicate(defensiveCopy((T[]) predicateArr));
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        Preconditions.checkNotNull(predicate);
        Predicate predicate3 = predicate;
        Preconditions.checkNotNull(predicate2);
        return new AndPredicate(asList(predicate3, predicate2));
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        Preconditions.checkNotNull(predicate);
        Predicate predicate3 = predicate;
        Preconditions.checkNotNull(predicate2);
        return new OrPredicate(asList(predicate3, predicate2));
    }
}
