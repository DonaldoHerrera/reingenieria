package com.google.android.gms.measurement.internal;

final class Ob implements Runnable {
    private final /* synthetic */ C1160pc a;
    private final /* synthetic */ Mb b;

    Ob(Mb mb, C1160pc pcVar) {
        this.b = mb;
        this.a = pcVar;
    }

    public final void run() {
        this.b.a(this.a);
        this.b.f();
    }
}
