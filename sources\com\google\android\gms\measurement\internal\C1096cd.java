package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zf;

/* renamed from: com.google.android.gms.measurement.internal.cd reason: case insensitive filesystem */
final class C1096cd implements Runnable {
    private final /* synthetic */ zf a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ boolean d;
    private final /* synthetic */ AppMeasurementDynamiteService e;

    C1096cd(AppMeasurementDynamiteService appMeasurementDynamiteService, zf zfVar, String str, String str2, boolean z) {
        this.e = appMeasurementDynamiteService;
        this.a = zfVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final void run() {
        this.e.a.z().a(this.a, this.b, this.c, this.d);
    }
}
