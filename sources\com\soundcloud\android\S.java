package com.soundcloud.android;

import android.app.Application;
import android.telephony.TelephonyManager;

/* compiled from: ApplicationModule_ProvideTelephonyManagerFactory */
public final class S implements C4961HMa<TelephonyManager> {
    private final C7054oVa<Application> a;

    public S(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static S a(C7054oVa<Application> ova) {
        return new S(ova);
    }

    public static TelephonyManager a(Application application) {
        TelephonyManager k = C2933l.k(application);
        C5023JMa.a(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }

    public TelephonyManager get() {
        return a((Application) this.a.get());
    }
}
