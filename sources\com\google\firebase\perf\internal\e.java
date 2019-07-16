package com.google.firebase.perf.internal;

import com.google.android.gms.internal.firebase-perf.Da;
import com.google.android.gms.internal.firebase-perf.V;

final class e implements Runnable {
    private final /* synthetic */ Da a;
    private final /* synthetic */ V b;
    private final /* synthetic */ c c;

    e(c cVar, Da da, V v) {
        this.c = cVar;
        this.a = da;
        this.b = v;
    }

    public final void run() {
        this.c.b(this.a, this.b);
    }
}
