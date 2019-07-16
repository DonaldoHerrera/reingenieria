package defpackage;

import java.util.Iterator;

/* renamed from: GWa reason: default package */
/* compiled from: Iterators.kt */
public abstract class GWa implements Iterator<Long>, MYa {
    public abstract long nextLong();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Long next() {
        return Long.valueOf(nextLong());
    }
}
