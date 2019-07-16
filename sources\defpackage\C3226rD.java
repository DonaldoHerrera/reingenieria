package defpackage;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import java.util.Arrays;

/* renamed from: rD reason: default package and case insensitive filesystem */
/* compiled from: FluentIterable */
public abstract class C3226rD<E> implements Iterable<E> {
    private final Optional<Iterable<E>> a = Optional.absent();

    protected C3226rD() {
    }

    public static <T> C3226rD<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        return b(iterable, iterable2);
    }

    private static <T> C3226rD<T> b(Iterable<? extends T>... iterableArr) {
        for (Iterable<? extends T> checkNotNull : iterableArr) {
            Preconditions.checkNotNull(checkNotNull);
        }
        return new C3206qD(iterableArr);
    }

    private Iterable<E> f() {
        return (Iterable) this.a.or(this);
    }

    public String toString() {
        return C1943BD.b(f());
    }

    public static <T> C3226rD<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2, Iterable<? extends T> iterable3) {
        return b(iterable, iterable2, iterable3);
    }

    public static <T> C3226rD<T> a(Iterable<? extends T>... iterableArr) {
        return b((Iterable[]) Arrays.copyOf(iterableArr, iterableArr.length));
    }
}
