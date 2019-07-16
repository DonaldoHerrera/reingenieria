package defpackage;

import java.util.Iterator;

/* renamed from: axb reason: default package and case insensitive filesystem */
/* compiled from: Sequences.kt */
public final class C5611axb implements Iterator<R>, MYa {
    private final Iterator<T> a;
    final /* synthetic */ C5679bxb b;

    C5611axb(C5679bxb bxb) {
        this.b = bxb;
        this.a = bxb.a.iterator();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public R next() {
        return this.b.b.invoke(this.a.next());
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
