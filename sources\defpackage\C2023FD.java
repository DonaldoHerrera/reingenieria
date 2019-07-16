package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: FD reason: default package and case insensitive filesystem */
/* compiled from: Iterators */
public final class C2023FD {

    /* renamed from: FD$a */
    /* compiled from: Iterators */
    private static final class a<T> extends C2363XC<T> {
        static final C3007gE<Object> c = new a(new Object[0], 0, 0, 0);
        private final T[] d;
        private final int e;

        a(T[] tArr, int i, int i2, int i3) {
            super(i2, i3);
            this.d = tArr;
            this.e = i;
        }

        /* access modifiers changed from: protected */
        public T a(int i) {
            return this.d[this.e + i];
        }
    }

    /* renamed from: FD$b */
    /* compiled from: Iterators */
    private static class b<T> implements Iterator<T> {
        private Iterator<? extends T> a;
        private Iterator<? extends T> b = C2023FD.a();
        private Iterator<? extends Iterator<? extends T>> c;
        private Deque<Iterator<? extends Iterator<? extends T>>> d;

        b(Iterator<? extends Iterator<? extends T>> it) {
            Preconditions.checkNotNull(it);
            this.c = it;
        }

        private Iterator<? extends Iterator<? extends T>> a() {
            while (true) {
                Iterator<? extends Iterator<? extends T>> it = this.c;
                if (it != null && it.hasNext()) {
                    return this.c;
                }
                Deque<Iterator<? extends Iterator<? extends T>>> deque = this.d;
                if (deque != null && !deque.isEmpty()) {
                    this.c = (Iterator) this.d.removeFirst();
                }
            }
            return null;
        }

        public boolean hasNext() {
            while (true) {
                Iterator<? extends T> it = this.b;
                Preconditions.checkNotNull(it);
                if (it.hasNext()) {
                    return true;
                }
                this.c = a();
                Iterator<? extends Iterator<? extends T>> it2 = this.c;
                if (it2 == null) {
                    return false;
                }
                this.b = (Iterator) it2.next();
                Iterator<? extends T> it3 = this.b;
                if (it3 instanceof b) {
                    b bVar = (b) it3;
                    this.b = bVar.b;
                    if (this.d == null) {
                        this.d = new ArrayDeque();
                    }
                    this.d.addFirst(this.c);
                    if (bVar.d != null) {
                        while (!bVar.d.isEmpty()) {
                            this.d.addFirst(bVar.d.removeLast());
                        }
                    }
                    this.c = bVar.c;
                }
            }
        }

        public T next() {
            if (hasNext()) {
                Iterator<? extends T> it = this.b;
                this.a = it;
                return it.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            C3044iD.a(this.a != null);
            this.a.remove();
            this.a = null;
        }
    }

    static <T> C2988fE<T> a() {
        return b();
    }

    static <T> C3007gE<T> b() {
        return a.c;
    }

    public static <T> Iterator<T> c(Iterator<? extends Iterator<? extends T>> it) {
        return new b(it);
    }

    public static <T> int d(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate, "predicate");
        int i = 0;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @CanIgnoreReturnValue
    public static <T> boolean e(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(predicate);
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.apply(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> Optional<T> f(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            Object next = it.next();
            if (predicate.apply(next)) {
                return Optional.of(next);
            }
        }
        return Optional.absent();
    }

    @CanIgnoreReturnValue
    public static boolean a(Iterator<?> it, Collection<?> collection) {
        Preconditions.checkNotNull(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> C2988fE<T> b(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        return new C1963CD(it, predicate);
    }

    public static <T> T c(Iterator<T> it, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    static void b(Iterator<?> it) {
        Preconditions.checkNotNull(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static <T> T d(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static String e(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }

    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return false;
            }
            if (!Objects.equal(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        Preconditions.checkNotNull(collection);
        Preconditions.checkNotNull(it);
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static <T> boolean a(Iterator<T> it, Predicate<? super T> predicate) {
        return d(it, predicate) != -1;
    }

    public static <T> T a(Iterator<? extends T> it, Predicate<? super T> predicate, T t) {
        Preconditions.checkNotNull(it);
        Preconditions.checkNotNull(predicate);
        while (it.hasNext()) {
            T next = it.next();
            if (predicate.apply(next)) {
                return next;
            }
        }
        return t;
    }

    public static <F, T> Iterator<T> a(Iterator<F> it, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(function);
        return new C1983DD(it, function);
    }

    public static <T> T a(Iterator<? extends T> it, T t) {
        return it.hasNext() ? it.next() : t;
    }

    public static <T> C2988fE<T> a(T t) {
        return new C2003ED(t);
    }

    static <T> ListIterator<T> a(Iterator<T> it) {
        return (ListIterator) it;
    }
}
