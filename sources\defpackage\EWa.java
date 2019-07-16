package defpackage;

import java.util.Iterator;

/* renamed from: EWa reason: default package */
/* compiled from: Iterators.kt */
public final class EWa<T> implements Iterator<CWa<? extends T>>, MYa {
    private int a;
    private final Iterator<T> b;

    public EWa(Iterator<? extends T> it) {
        C7471uYa.b(it, "iterator");
        this.b = it;
    }

    public final boolean hasNext() {
        return this.b.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final CWa<T> next() {
        int i = this.a;
        this.a = i + 1;
        if (i >= 0) {
            return new CWa<>(i, this.b.next());
        }
        C6782kWa.c();
        throw null;
    }
}
