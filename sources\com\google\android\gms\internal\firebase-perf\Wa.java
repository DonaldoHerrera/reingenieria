package com.google.android.gms.internal.firebase-perf;

final class Wa {
    private final C0838fb a;
    private final byte[] b;

    private Wa(int i) {
        this.b = new byte[i];
        this.a = C0838fb.a(this.b);
    }

    public final Oa a() {
        this.a.b();
        return new Ya(this.b);
    }

    public final C0838fb b() {
        return this.a;
    }

    /* synthetic */ Wa(int i, Ra ra) {
        this(i);
    }
}
