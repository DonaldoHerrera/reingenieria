package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.cb reason: case insensitive filesystem */
final class C1094cb implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ C1082a b;

    C1094cb(C1082a aVar, long j) {
        this.b = aVar;
        this.a = j;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
