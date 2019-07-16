package com.google.android.gms.measurement.internal;

abstract class Ld extends Id {
    private boolean c;

    Ld(Kd kd) {
        super(kd);
        this.b.a(this);
    }

    public final void q() {
        if (!this.c) {
            t();
            this.b.p();
            this.c = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: 0000 */
    public final boolean r() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final void s() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean t();
}
