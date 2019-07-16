package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.ba reason: case insensitive filesystem */
final class C1088ba implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ long b;
    private final /* synthetic */ C1082a c;

    C1088ba(C1082a aVar, String str, long j) {
        this.c = aVar;
        this.a = str;
        this.b = j;
    }

    public final void run() {
        this.c.c(this.a, this.b);
    }
}
