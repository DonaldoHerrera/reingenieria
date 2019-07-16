package com.google.android.gms.measurement.internal;

final class Kc implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1174sc b;

    Kc(C1174sc scVar, long j) {
        this.b = scVar;
        this.a = j;
    }

    public final void run() {
        this.b.b().q.a(this.a);
        this.b.e().z().a("Minimum session duration set", Long.valueOf(this.a));
    }
}
