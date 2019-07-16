package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.z reason: case insensitive filesystem */
final class C1206z implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ C1082a c;

    C1206z(C1082a aVar, String str, long j) {
        this.c = aVar;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.d(this.a, this.b);
    }
}
