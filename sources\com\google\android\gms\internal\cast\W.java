package com.google.android.gms.internal.cast;

final class W implements Runnable {
    private final /* synthetic */ N a;
    private final /* synthetic */ zzcj b;

    W(P p, N n, zzcj zzcj) {
        this.a = n;
        this.b = zzcj;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
