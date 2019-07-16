package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zf;

final class Dd implements Runnable {
    private final /* synthetic */ zf a;
    private final /* synthetic */ zzai b;
    private final /* synthetic */ String c;
    private final /* synthetic */ AppMeasurementDynamiteService d;

    Dd(AppMeasurementDynamiteService appMeasurementDynamiteService, zf zfVar, zzai zzai, String str) {
        this.d = appMeasurementDynamiteService;
        this.a = zfVar;
        this.b = zzai;
        this.c = str;
    }

    public final void run() {
        this.d.a.z().a(this.a, this.b, this.c);
    }
}
