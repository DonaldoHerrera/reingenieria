package com.google.android.gms.measurement.internal;

import android.os.Bundle;

final class Wc implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ Uc b;
    private final /* synthetic */ Uc c;
    private final /* synthetic */ Tc d;

    Wc(Tc tc, boolean z, Uc uc, Uc uc2) {
        this.d = tc;
        this.a = z;
        this.b = uc;
        this.c = uc2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        if (com.google.android.gms.measurement.internal.Vd.e(r10.b.a, r10.c.a) != false) goto L_0x0064;
     */
    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.d.f().r(this.d.p().B())) {
            z = this.a && this.d.c != null;
            if (z) {
                Tc tc = this.d;
                tc.a(tc.c, true);
            }
        } else {
            if (this.a) {
                Tc tc2 = this.d;
                Uc uc = tc2.c;
                if (uc != null) {
                    tc2.a(uc, true);
                }
            }
            z = false;
        }
        Uc uc2 = this.b;
        if (uc2 != null) {
            long j = uc2.c;
            Uc uc3 = this.c;
            if (j == uc3.c) {
                if (Vd.e(uc2.b, uc3.b)) {
                }
            }
        }
        z2 = true;
        if (z2) {
            Bundle bundle = new Bundle();
            Tc.a(this.c, bundle, true);
            Uc uc4 = this.b;
            if (uc4 != null) {
                String str = uc4.a;
                if (str != null) {
                    bundle.putString("_pn", str);
                }
                bundle.putString("_pc", this.b.b);
                bundle.putLong("_pi", this.b.c);
            }
            if (this.d.f().r(this.d.p().B()) && z) {
                long C = this.d.t().C();
                if (C > 0) {
                    this.d.l().a(bundle, C);
                }
            }
            this.d.o().c("auto", "_vs", bundle);
        }
        Tc tc3 = this.d;
        tc3.c = this.c;
        tc3.q().a(this.c);
    }
}
