package defpackage;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: BD reason: default package and case insensitive filesystem */
/* compiled from: Iterables */
public final class C1943BD {
    private static <T> boolean a(List<T> list, Predicate<? super T> predicate) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            Object obj = list.get(i);
            if (!predicate.apply(obj)) {
                if (i > i2) {
                    try {
                        list.set(i2, obj);
                    } catch (UnsupportedOperationException unused) {
                        a(list, predicate, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        a(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            z = true;
        }
        return z;
    }

    public static String b(Iterable<?> iterable) {
        return C2023FD.e(iterable.iterator());
    }

    public static <T> T c(Iterable<T> iterable, Predicate<? super T> predicate) {
        return C2023FD.c(iterable.iterator(), predicate);
    }

    public static <T> int d(Iterable<T> iterable, Predicate<? super T> predicate) {
        return C2023FD.d(iterable.iterator(), predicate);
    }

    @CanIgnoreReturnValue
    public static <T> boolean e(Iterable<T> iterable, Predicate<? super T> predicate) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return C2023FD.e(iterable.iterator(), predicate);
        }
        List list = (List) iterable;
        Preconditions.checkNotNull(predicate);
        return a(list, predicate);
    }

    public static <T> Optional<T> f(Iterable<T> iterable, Predicate<? super T> predicate) {
        return C2023FD.f(iterable.iterator(), predicate);
    }

    public static <T> Iterable<T> b(Iterable<T> iterable, Predicate<? super T> predicate) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(predicate);
        return new C3386zD(iterable, predicate);
    }

    private static <T> void a(List<T> list, Predicate<? super T> predicate, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (predicate.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return collection.addAll(C3063jD.a(iterable));
        }
        Preconditions.checkNotNull(iterable);
        return C2023FD.a(collection, iterable.iterator());
    }

    public static <T> Iterable<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return C3226rD.a(iterable, iterable2);
    }

    public static <T> Iterable<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return C3226rD.a(iterable, iterable2, iterable3);
    }

    @SafeVarargs
    public static <T> Iterable<T> a(Iterable<? extends T>... iterableArr) {
        return C3226rD.a(iterableArr);
    }

    public static <T> boolean a(Iterable<T> iterable, Predicate<? super T> predicate) {
        return C2023FD.a(iterable.iterator(), predicate);
    }

    public static <T> T a(Iterable<? extends T> iterable, Predicate<? super T> predicate, T t) {
        return C2023FD.a(iterable.iterator(), predicate, t);
    }

    public static <F, T> Iterable<T> a(Iterable<F> iterable, Function<? super F, ? extends T> function) {
        Preconditions.checkNotNull(iterable);
        Preconditions.checkNotNull(function);
        return new C1923AD(iterable, function);
    }

    public static <T> T a(Iterable<? extends T> iterable, T t) {
        return C2023FD.a(iterable.iterator(), t);
    }

    public static <T> T a(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return C2023FD.d(iterable.iterator());
        }
        List list = (List) iterable;
        if (!list.isEmpty()) {
            return a(list);
        }
        throw new NoSuchElementException();
    }

    private static <T> T a(List<T> list) {
        return list.get(list.size() - 1);
    }
}
