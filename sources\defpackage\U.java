package defpackage;

import java.util.Map;

/* renamed from: U reason: default package */
/* compiled from: ArraySet */
class U extends C0300aa<E, E> {
    final /* synthetic */ V d;

    U(V v) {
        this.d = v;
    }

    /* access modifiers changed from: protected */
    public Object a(int i, int i2) {
        return this.d.h[i];
    }

    /* access modifiers changed from: protected */
    public int b(Object obj) {
        return this.d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    public int c() {
        return this.d.i;
    }

    /* access modifiers changed from: protected */
    public int a(Object obj) {
        return this.d.indexOf(obj);
    }

    /* access modifiers changed from: protected */
    public Map<E, E> b() {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    public void a(E e, E e2) {
        this.d.add(e);
    }

    /* access modifiers changed from: protected */
    public E a(int i, E e) {
        throw new UnsupportedOperationException("not a map");
    }

    /* access modifiers changed from: protected */
    public void a(int i) {
        this.d.m(i);
    }

    /* access modifiers changed from: protected */
    public void a() {
        this.d.clear();
    }
}
