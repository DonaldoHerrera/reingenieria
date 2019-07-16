package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.xd reason: case insensitive filesystem */
final class C1200xd implements Runnable {
    private final /* synthetic */ Kd a;
    private final /* synthetic */ Runnable b;

    C1200xd(C1195wd wdVar, Kd kd, Runnable runnable) {
        this.a = kd;
        this.b = runnable;
    }

    public final void run() {
        this.a.o();
        this.a.a(this.b);
        this.a.n();
    }
}
