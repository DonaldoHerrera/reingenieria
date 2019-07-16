package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.wc reason: case insensitive filesystem */
final class C1194wc implements Runnable {
    private final /* synthetic */ C1150nc a;
    private final /* synthetic */ C1174sc b;

    C1194wc(C1174sc scVar, C1150nc ncVar) {
        this.b = scVar;
        this.a = ncVar;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
