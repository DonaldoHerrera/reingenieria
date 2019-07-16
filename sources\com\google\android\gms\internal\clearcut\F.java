package com.google.android.gms.internal.clearcut;

final class F {
    private final M a;
    private final byte[] b;

    private F(int i) {
        this.b = new byte[i];
        this.a = M.a(this.b);
    }

    /* synthetic */ F(int i, B b2) {
        this(i);
    }

    public final A a() {
        if (this.a.b() == 0) {
            return new H(this.b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public final M b() {
        return this.a;
    }
}
