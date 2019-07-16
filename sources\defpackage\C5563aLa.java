package defpackage;

import java.util.Iterator;

/* renamed from: aLa reason: default package and case insensitive filesystem */
/* compiled from: QueryResult */
class C5563aLa implements Iterator<C5326TKa> {
    final /* synthetic */ C5631bLa a;

    C5563aLa(C5631bLa bla) {
        this.a = bla;
    }

    public boolean hasNext() {
        boolean d = this.a.a.d();
        if (!d) {
            this.a.a.b();
        }
        return d;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public C5326TKa next() {
        this.a.a.a();
        return this.a.a;
    }
}
