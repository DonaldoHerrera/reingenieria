package com.google.android.gms.internal.firebase-perf;

/* renamed from: com.google.android.gms.internal.firebase-perf.f reason: case insensitive filesystem */
final class C0836f<K> extends Ad<K> {
    private final transient yd<K, ?> c;
    private final transient ud<K> d;

    C0836f(yd<K, ?> ydVar, ud<K> udVar) {
        this.c = ydVar;
        this.d = udVar;
    }

    /* access modifiers changed from: 0000 */
    public final int a(Object[] objArr, int i) {
        return h().a(objArr, i);
    }

    /* renamed from: c */
    public final C0840g<K> iterator() {
        return (C0840g) h().iterator();
    }

    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    public final ud<K> h() {
        return this.d;
    }

    public final int size() {
        return this.c.size();
    }
}
