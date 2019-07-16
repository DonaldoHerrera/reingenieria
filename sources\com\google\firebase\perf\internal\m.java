package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.V;

final /* synthetic */ class m implements Runnable {
    private final GaugeManager a;
    private final String b;
    private final V c;

    m(GaugeManager gaugeManager, String str, V v) {
        this.a = gaugeManager;
        this.b = str;
        this.c = v;
    }

    public final void run() {
        this.a.zze(this.b, this.c);
    }
}
