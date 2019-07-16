package com.google.android.gms.measurement.internal;

final class Bb implements Runnable {
    private final /* synthetic */ Mb a;
    private final /* synthetic */ C1124ib b;

    Bb(Cb cb, Mb mb, C1124ib ibVar) {
        this.a = mb;
        this.b = ibVar;
    }

    public final void run() {
        if (this.a.j() == null) {
            this.b.s().a("Install Referrer Reporter is null");
            return;
        }
        C1198xb j = this.a.j();
        j.a.v();
        j.a(j.a.getContext().getPackageName());
    }
}
