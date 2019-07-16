package com.soundcloud.android;

import android.app.Application;
import android.net.ConnectivityManager;

/* renamed from: com.soundcloud.android.v reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideConnectivityManagerFactory */
public final class C2943v implements C4961HMa<ConnectivityManager> {
    private final C7054oVa<Application> a;

    public C2943v(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static C2943v a(C7054oVa<Application> ova) {
        return new C2943v(ova);
    }

    public static ConnectivityManager a(Application application) {
        ConnectivityManager d = C2933l.d(application);
        C5023JMa.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public ConnectivityManager get() {
        return a((Application) this.a.get());
    }
}
