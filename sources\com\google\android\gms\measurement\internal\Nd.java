package com.google.android.gms.measurement.internal;

final class Nd implements Runnable {
    private final /* synthetic */ Qd a;
    private final /* synthetic */ Kd b;

    Nd(Kd kd, Qd qd) {
        this.b = kd;
        this.a = qd;
    }

    public final void run() {
        this.b.a(this.a);
        this.b.b();
    }
}
