package com.google.android.gms.measurement.internal;

final class Jc implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1174sc b;

    Jc(C1174sc scVar, long j) {
        this.b = scVar;
        this.a = j;
    }

    public final void run() {
        this.b.b().r.a(this.a);
        this.b.e().z().a("Session timeout duration set", Long.valueOf(this.a));
    }
}
