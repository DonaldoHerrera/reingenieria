package defpackage;

import java.util.ListIterator;

/* renamed from: gob reason: default package and case insensitive filesystem */
/* compiled from: UnmodifiableLazyStringList */
class C6529gob implements ListIterator<String> {
    ListIterator<String> a = this.c.a.listIterator(this.b);
    final /* synthetic */ int b;
    final /* synthetic */ C6665iob c;

    C6529gob(C6665iob iob, int i) {
        this.c = iob;
        this.b = i;
    }

    public void a(String str) {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ void add(Object obj) {
        a((String) obj);
        throw null;
    }

    public void b(String str) {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext() {
        return this.a.hasNext();
    }

    public boolean hasPrevious() {
        return this.a.hasPrevious();
    }

    public int nextIndex() {
        return this.a.nextIndex();
    }

    public int previousIndex() {
        return this.a.previousIndex();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        b((String) obj);
        throw null;
    }

    public String next() {
        return (String) this.a.next();
    }

    public String previous() {
        return (String) this.a.previous();
    }
}
