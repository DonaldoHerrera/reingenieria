package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cc reason: case insensitive filesystem */
abstract class C1095cc extends Ca {
    private boolean b;

    C1095cc(Mb mb) {
        super(mb);
        this.a.a(this);
    }

    public final void u() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!y()) {
            this.a.s();
            this.b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean v() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void w() {
        if (!v()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void x() {
        if (!this.b) {
            z();
            this.a.s();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean y();

    /* access modifiers changed from: protected */
    public void z() {
    }
}
