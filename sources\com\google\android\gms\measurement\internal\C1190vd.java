package com.google.android.gms.measurement.internal;

import android.content.Intent;

/* renamed from: com.google.android.gms.measurement.internal.vd reason: case insensitive filesystem */
final /* synthetic */ class C1190vd implements Runnable {
    private final C1195wd a;
    private final int b;
    private final C1124ib c;
    private final Intent d;

    C1190vd(C1195wd wdVar, int i, C1124ib ibVar, Intent intent) {
        this.a = wdVar;
        this.b = i;
        this.c = ibVar;
        this.d = intent;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d);
    }
}
