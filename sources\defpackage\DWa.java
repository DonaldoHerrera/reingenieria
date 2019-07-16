package defpackage;

import java.util.Iterator;

/* renamed from: DWa reason: default package */
/* compiled from: Iterables.kt */
public final class DWa<T> implements Iterable<CWa<? extends T>>, MYa {
    private final PXa<Iterator<T>> a;

    public DWa(PXa<? extends Iterator<? extends T>> pXa) {
        C7471uYa.b(pXa, "iteratorFactory");
        this.a = pXa;
    }

    public Iterator<CWa<T>> iterator() {
        return new EWa((Iterator) this.a.d());
    }
}
