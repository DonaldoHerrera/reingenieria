package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.V;

final /* synthetic */ class o implements Runnable {
    private final GaugeManager a;
    private final String b;
    private final V c;

    o(GaugeManager gaugeManager, String str, V v) {
        this.a = gaugeManager;
        this.b = str;
        this.c = v;
    }

    public final void run() {
        this.a.zzd(this.b, this.c);
    }
}
