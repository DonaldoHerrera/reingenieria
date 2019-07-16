package com.google.android.gms.internal.cast;

final class T implements Runnable {
    private final /* synthetic */ N a;
    private final /* synthetic */ int b;

    T(P p, N n, int i) {
        this.a = n;
        this.b = i;
    }

    public final void run() {
        this.a.f.b(this.b);
    }
}
