package com.soundcloud.android;

import android.app.Application;
import android.net.wifi.WifiManager;

/* compiled from: ApplicationModule_ProvideWifiManagerFactory */
public final class U implements C4961HMa<WifiManager> {
    private final C7054oVa<Application> a;

    public static WifiManager a(Application application) {
        WifiManager l = C2933l.l(application);
        C5023JMa.a(l, "Cannot return null from a non-@Nullable @Provides method");
        return l;
    }

    public WifiManager get() {
        return a((Application) this.a.get());
    }
}
