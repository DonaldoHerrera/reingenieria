package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.b reason: case insensitive filesystem */
final class C0818b<E> extends ud<E> {
    static final ud<Object> c = new C0818b(new Object[0], 0);
    private final transient Object[] d;
    private final transient int e;

    C0818b(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    /* access modifiers changed from: 0000 */
    public final Object[] d() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public final int f() {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final int g() {
        return this.e;
    }

    public final E get(int i) {
        Db.a(i, this.e);
        return this.d[i];
    }

    public final int size() {
        return this.e;
    }
}
