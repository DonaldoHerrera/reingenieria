package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.hc reason: case insensitive filesystem */
abstract class C1120hc extends C1125ic {
    private boolean b;

    C1120hc(Mb mb) {
        super(mb);
        this.a.a(this);
    }

    public final void m() {
        if (this.b) {
            throw new IllegalStateException("Can't initialize twice");
        } else if (!q()) {
            this.a.s();
            this.b = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean n() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final void o() {
        if (!n()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (!this.b) {
            r();
            this.a.s();
            this.b = true;
            return;
        }
        throw new IllegalStateException("Can't initialize twice");
    }

    /* access modifiers changed from: protected */
    public abstract boolean q();

    /* access modifiers changed from: protected */
    public void r() {
    }
}
