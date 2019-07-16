package com.google.android.gms.internal.firebase-perf;

final class zd extends ud<E> {
    private final transient int c;
    private final transient int d;
    private final /* synthetic */ ud e;

    zd(ud udVar, int i, int i2) {
        this.e = udVar;
        this.c = i;
        this.d = i2;
    }

    /* renamed from: a */
    public final ud<E> subList(int i, int i2) {
        Db.a(i, i2, this.d);
        ud udVar = this.e;
        int i3 = this.c;
        return (ud) udVar.subList(i + i3, i2 + i3);
    }

    /* access modifiers changed from: 0000 */
    public final Object[] d() {
        return this.e.d();
    }

    /* access modifiers changed from: 0000 */
    public final int f() {
        return this.e.f() + this.c;
    }

    /* access modifiers changed from: 0000 */
    public final int g() {
        return this.e.f() + this.c + this.d;
    }

    public final E get(int i) {
        Db.a(i, this.d);
        return this.e.get(i + this.c);
    }

    public final int size() {
        return this.d;
    }
}
