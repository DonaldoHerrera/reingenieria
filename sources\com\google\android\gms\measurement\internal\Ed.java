package com.google.android.gms.measurement.internal;

final class Ed implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1210zd b;

    Ed(C1210zd zdVar, long j) {
        this.b = zdVar;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
