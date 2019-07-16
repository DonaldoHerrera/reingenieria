package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* renamed from: com.google.android.gms.measurement.internal.ud reason: case insensitive filesystem */
final class C1185ud implements Runnable {
    private final /* synthetic */ C1166qd a;

    C1185ud(C1166qd qdVar) {
        this.a = qdVar;
    }

    public final void run() {
        Yc yc = this.a.c;
        Context context = yc.getContext();
        this.a.c.a();
        yc.a(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
