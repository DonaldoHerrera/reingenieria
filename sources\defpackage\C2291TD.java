package defpackage;

import com.google.common.base.Function;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Comparator;

/* renamed from: TD reason: default package and case insensitive filesystem */
/* compiled from: Ordering */
public abstract class C2291TD<T> implements Comparator<T> {
    protected C2291TD() {
    }

    public static <T> C2291TD<T> a(Comparator<T> comparator) {
        return comparator instanceof C2291TD ? (C2291TD) comparator : new C3168oD(comparator);
    }

    @CanIgnoreReturnValue
    public abstract int compare(T t, T t2);

    public <F> C2291TD<F> a(Function<F, ? extends T> function) {
        return new C3025hD(function, this);
    }
}
