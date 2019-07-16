package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zf;

final class Yd implements Runnable {
    private final /* synthetic */ zf a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    Yd(AppMeasurementDynamiteService appMeasurementDynamiteService, zf zfVar, String str, String str2) {
        this.d = appMeasurementDynamiteService;
        this.a = zfVar;
        this.b = str;
        this.c = str2;
    }

    public final void run() {
        this.d.a.z().a(this.a, this.b, this.c);
    }
}
