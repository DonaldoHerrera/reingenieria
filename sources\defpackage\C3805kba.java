package defpackage;

import android.os.Handler;

/* renamed from: kba reason: default package and case insensitive filesystem */
/* compiled from: ExoPlayerProgressHandler.kt */
public final class C3805kba extends Handler {
    private boolean a;
    private final long b;
    private final PXa<RVa> c;

    public C3805kba(long j, PXa<RVa> pXa) {
        C7471uYa.b(pXa, "action");
        this.b = j;
        this.c = pXa;
    }

    public final PXa<RVa> a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final void c() {
        if (!this.a) {
            this.a = true;
            postDelayed(new C3797jba(this), this.b);
        }
    }

    public final void d() {
        this.a = false;
        removeCallbacksAndMessages(null);
    }
}
