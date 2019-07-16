package com.google.android.gms.internal.firebase-perf;

public final class Wb<K, V> {
    private final Vb<K, V> a;
    private final K b;
    private final V c;

    private Wb(Yc yc, K k, Yc yc2, V v) {
        this.a = new Vb<>(yc, k, yc2, v);
        this.b = k;
        this.c = v;
    }

    public static <K, V> Wb<K, V> a(Yc yc, K k, Yc yc2, V v) {
        return new Wb<>(yc, k, yc2, v);
    }

    static <K, V> int a(Vb<K, V> vb, K k, V v) {
        return C0870nb.a(vb.a, 1, k) + C0870nb.a(vb.c, 2, v);
    }

    public final int a(int i, K k, V v) {
        return C0838fb.l(i) + C0838fb.f(a(this.a, k, v));
    }

    /* access modifiers changed from: 0000 */
    public final Vb<K, V> a() {
        return this.a;
    }
}
