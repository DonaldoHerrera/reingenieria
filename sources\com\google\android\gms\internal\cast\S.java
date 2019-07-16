package com.google.android.gms.internal.cast;

final class S implements Runnable {
    private final /* synthetic */ N a;
    private final /* synthetic */ zzdb b;

    S(P p, N n, zzdb zzdb) {
        this.a = n;
        this.b = zzdb;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
