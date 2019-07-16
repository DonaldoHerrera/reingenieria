package com.soundcloud.android.foundation.ads;

import java.util.List;

/* compiled from: VisualAdData.kt */
public abstract class ca extends C3676c {
    private boolean d;
    private boolean e;
    private boolean f;

    public ca() {
        this(false, false, false, 7, null);
    }

    public /* synthetic */ ca(boolean z, boolean z2, boolean z3, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        this(z, z2, z3);
    }

    public abstract List<Y> m();

    public abstract List<Y> n();

    public final boolean o() {
        return this.e;
    }

    public final boolean p() {
        return this.f;
    }

    public final boolean q() {
        return this.d;
    }

    public final void r() {
        this.f = false;
        this.e = false;
    }

    public final void s() {
        this.e = true;
    }

    public final void t() {
        this.f = true;
    }

    public final void u() {
        this.d = true;
    }

    public ca(boolean z, boolean z2, boolean z3) {
        this.d = z;
        this.e = z2;
        this.f = z3;
    }
}
