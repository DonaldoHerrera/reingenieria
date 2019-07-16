package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Ec implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ boolean e;
    private final /* synthetic */ C1174sc f;

    Ec(C1174sc scVar, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.f = scVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
    }

    public final void run() {
        this.f.a.z().a(this.a, this.b, this.c, this.d, this.e);
    }
}
