package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.e reason: case insensitive filesystem */
final class C0832e extends ud<Object> {
    private final transient Object[] c;
    private final transient int d;
    private final transient int e;

    C0832e(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    public final Object get(int i) {
        Db.a(i, this.e);
        return this.c[(i * 2) + this.d];
    }

    public final int size() {
        return this.e;
    }
}
