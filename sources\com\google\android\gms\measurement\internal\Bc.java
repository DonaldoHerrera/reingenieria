package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

final class Bc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ C1174sc e;

    Bc(C1174sc scVar, AtomicReference atomicReference, String str, String str2, String str3) {
        this.e = scVar;
        this.a = atomicReference;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final void run() {
        this.e.a.z().a(this.a, this.b, this.c, this.d);
    }
}
