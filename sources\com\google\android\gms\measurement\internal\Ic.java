package com.google.android.gms.measurement.internal;

final class Ic implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ C1174sc b;

    Ic(C1174sc scVar, boolean z) {
        this.b = scVar;
        this.a = z;
    }

    public final void run() {
        this.b.d(this.a);
    }
}
