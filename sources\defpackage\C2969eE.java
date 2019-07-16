package defpackage;

import java.util.ListIterator;

/* renamed from: eE reason: default package and case insensitive filesystem */
/* compiled from: TransformedListIterator */
abstract class C2969eE<F, T> extends C2950dE<F, T> implements ListIterator<T> {
    C2969eE(ListIterator<? extends F> listIterator) {
        super(listIterator);
    }

    private ListIterator<? extends F> a() {
        return C2023FD.a(this.a);
    }

    public void add(T t) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasPrevious() {
        return a().hasPrevious();
    }

    public final int nextIndex() {
        return a().nextIndex();
    }

    public final T previous() {
        return a(a().previous());
    }

    public final int previousIndex() {
        return a().previousIndex();
    }

    public void set(T t) {
        throw new UnsupportedOperationException();
    }
}
