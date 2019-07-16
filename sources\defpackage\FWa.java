package defpackage;

import java.util.Iterator;

/* renamed from: FWa reason: default package */
/* compiled from: Iterators.kt */
public abstract class FWa implements Iterator<Integer>, MYa {
    public abstract int nextInt();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Integer next() {
        return Integer.valueOf(nextInt());
    }
}
