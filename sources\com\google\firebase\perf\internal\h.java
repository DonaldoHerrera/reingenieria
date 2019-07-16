package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.C0857ka;
import com.google.android.gms.internal.firebase-perf.V;

final class h implements Runnable {
    private final /* synthetic */ C0857ka a;
    private final /* synthetic */ V b;
    private final /* synthetic */ c c;

    h(c cVar, C0857ka kaVar, V v) {
        this.c = cVar;
        this.a = kaVar;
        this.b = v;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
