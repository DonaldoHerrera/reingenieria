package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.tc reason: case insensitive filesystem */
final class C1179tc implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ Object c;
    private final /* synthetic */ long d;
    private final /* synthetic */ C1174sc e;

    C1179tc(C1174sc scVar, String str, String str2, Object obj, long j) {
        this.e = scVar;
        this.a = str;
        this.b = str2;
        this.c = obj;
        this.d = j;
    }

    public final void run() {
        this.e.a(this.a, this.b, this.c, this.d);
    }
}
