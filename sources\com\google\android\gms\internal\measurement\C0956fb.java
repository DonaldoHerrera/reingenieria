package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fb reason: case insensitive filesystem */
final class C0956fb {
    private final C1007nb a;
    private final byte[] b;

    private C0956fb(int i) {
        this.b = new byte[i];
        this.a = C1007nb.a(this.b);
    }

    public final Ya a() {
        this.a.c();
        return new C0970hb(this.b);
    }

    public final C1007nb b() {
        return this.a;
    }

    /* synthetic */ C0956fb(int i, Xa xa) {
        this(i);
    }
}
