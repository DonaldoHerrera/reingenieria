package com.google.firebase.perf.internal;

final class j implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ c b;

    j(c cVar, boolean z) {
        this.b = cVar;
        this.a = z;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
