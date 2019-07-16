package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzx;

final class Fb implements Runnable {
    private final /* synthetic */ Mb a;
    private final /* synthetic */ long b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ Context d;
    private final /* synthetic */ C1124ib e;
    private final /* synthetic */ PendingResult f;

    Fb(Cb cb, Mb mb, long j, Bundle bundle, Context context, C1124ib ibVar, PendingResult pendingResult) {
        this.a = mb;
        this.b = j;
        this.c = bundle;
        this.d = context;
        this.e = ibVar;
        this.f = pendingResult;
    }

    public final void run() {
        long a2 = this.a.g().k.a();
        long j = this.b;
        if (a2 > 0 && (j >= a2 || j <= 0)) {
            j = a2 - 1;
        }
        if (j > 0) {
            this.c.putLong("click_timestamp", j);
        }
        this.c.putString("_cis", "referrer broadcast");
        Mb.a(this.d, (zzx) null).x().b("auto", "_cmp", this.c);
        this.e.A().a("Install campaign recorded");
        PendingResult pendingResult = this.f;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
