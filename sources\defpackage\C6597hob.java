package defpackage;

import java.util.Iterator;

/* renamed from: hob reason: default package and case insensitive filesystem */
/* compiled from: UnmodifiableLazyStringList */
class C6597hob implements Iterator<String> {
    Iterator<String> a = this.b.a.iterator();
    final /* synthetic */ C6665iob b;

    C6597hob(C6665iob iob) {
        this.b = iob;
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String next() {
        return (String) this.a.next();
    }
}
