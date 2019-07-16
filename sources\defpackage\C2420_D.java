package defpackage;

import java.util.Iterator;

/* renamed from: _D reason: default package and case insensitive filesystem */
/* compiled from: Sets */
class C2420_D extends C2400ZC<E> {
    final Iterator<? extends E> c = this.e.a.iterator();
    final Iterator<? extends E> d = this.e.b.iterator();
    final /* synthetic */ C2439aE e;

    C2420_D(C2439aE aEVar) {
        this.e = aEVar;
    }

    /* access modifiers changed from: protected */
    public E a() {
        if (this.c.hasNext()) {
            return this.c.next();
        }
        while (this.d.hasNext()) {
            E next = this.d.next();
            if (!this.e.a.contains(next)) {
                return next;
            }
        }
        return b();
    }
}
