package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

final class Od implements Callable<String> {
    private final /* synthetic */ zzn a;
    private final /* synthetic */ Kd b;

    Od(Kd kd, zzn zzn) {
        this.b = kd;
        this.a = zzn;
    }

    public final /* synthetic */ Object call() throws Exception {
        Db a2 = this.b.e(this.a);
        if (a2 != null) {
            return a2.a();
        }
        this.b.e().v().a("App info was null when attempting to get app instance id");
        return null;
    }
}
