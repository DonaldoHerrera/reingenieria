package defpackage;

import java.util.Iterator;

/* renamed from: ywb reason: default package and case insensitive filesystem */
/* compiled from: Sequences.kt */
public final class C7781ywb implements Iterator<T>, MYa {
    private final Iterator<T> a;
    private int b;
    final /* synthetic */ C7850zwb c;

    C7781ywb(C7850zwb zwb) {
        this.c = zwb;
        this.a = zwb.a.iterator();
        this.b = zwb.b;
    }

    private final void a() {
        while (this.b > 0 && this.a.hasNext()) {
            this.a.next();
            this.b--;
        }
    }

    public boolean hasNext() {
        a();
        return this.a.hasNext();
    }

    public T next() {
        a();
        return this.a.next();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
