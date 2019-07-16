package com.soundcloud.android;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.O;

/* compiled from: UserPropertiesLogger.kt */
public final class ta {
    private final C2436_U a;
    private final C3700b b;
    private final C7181qKa c;
    private final C6699jHa d;

    public ta(C2436_U _u, C3700b bVar, C7181qKa qka, C6699jHa jha) {
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(qka, "appConfig");
        C7471uYa.b(jha, "deviceHelper");
        this.a = _u;
        this.b = bVar;
        this.c = qka;
        this.d = jha;
    }

    public final void a() {
        this.b.a(O.ANDROID_VERSION_CODE, String.valueOf(this.c.b()));
        this.b.a(O.UNIQUE_DEVICE_ID, this.d.i());
        this.b.a(O.SUBSCRIPTION_STATUS, this.a.q().a());
    }
}
