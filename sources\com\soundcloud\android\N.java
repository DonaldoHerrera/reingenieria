package com.soundcloud.android;

import android.app.Application;
import android.os.PowerManager;

/* compiled from: ApplicationModule_ProvidePowerManagerFactory */
public final class N implements C4961HMa<PowerManager> {
    private final C7054oVa<Application> a;

    public N(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static N a(C7054oVa<Application> ova) {
        return new N(ova);
    }

    public static PowerManager a(Application application) {
        PowerManager i = C2933l.i(application);
        C5023JMa.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }

    public PowerManager get() {
        return a((Application) this.a.get());
    }
}
