package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.C0837fa;
import com.google.android.gms.internal.firebase-perf.V;

final class g implements Runnable {
    private final /* synthetic */ C0837fa a;
    private final /* synthetic */ V b;
    private final /* synthetic */ c c;

    g(c cVar, C0837fa faVar, V v) {
        this.c = cVar;
        this.a = faVar;
        this.b = v;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
