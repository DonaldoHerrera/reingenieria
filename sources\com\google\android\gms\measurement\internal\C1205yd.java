package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* renamed from: com.google.android.gms.measurement.internal.yd reason: case insensitive filesystem */
final /* synthetic */ class C1205yd implements Runnable {
    private final C1195wd a;
    private final C1124ib b;
    private final JobParameters c;

    C1205yd(C1195wd wdVar, C1124ib ibVar, JobParameters jobParameters) {
        this.a = wdVar;
        this.b = ibVar;
        this.c = jobParameters;
    }

    public final void run() {
        this.a.a(this.b, this.c);
    }
}
