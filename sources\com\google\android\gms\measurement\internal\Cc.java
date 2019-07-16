package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zf;

final class Cc implements Runnable {
    private final /* synthetic */ zf a;
    private final /* synthetic */ AppMeasurementDynamiteService b;

    Cc(AppMeasurementDynamiteService appMeasurementDynamiteService, zf zfVar) {
        this.b = appMeasurementDynamiteService;
        this.a = zfVar;
    }

    public final void run() {
        this.b.a.z().a(this.a);
    }
}
