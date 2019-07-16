package defpackage;

import java.util.Iterator;

/* renamed from: qD reason: default package and case insensitive filesystem */
/* compiled from: FluentIterable */
class C3206qD extends C3226rD<T> {
    final /* synthetic */ Iterable[] b;

    C3206qD(Iterable[] iterableArr) {
        this.b = iterableArr;
    }

    public Iterator<T> iterator() {
        return C2023FD.c(new C3187pD(this, this.b.length));
    }
}
