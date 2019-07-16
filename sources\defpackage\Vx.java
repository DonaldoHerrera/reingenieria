package defpackage;

import java.util.Iterator;

/* renamed from: Vx reason: default package */
final class Vx implements Iterator<String> {
    private Iterator<String> a = this.b.a.iterator();
    private final /* synthetic */ Tx b;

    Vx(Tx tx) {
        this.b = tx;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
