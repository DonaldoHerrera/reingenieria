package com.soundcloud.android;

import android.app.Application;

/* compiled from: ApplicationModule_ProvideLocalBroadcastManagerFactory */
public final class J implements C4961HMa<C1600pd> {
    private final C7054oVa<Application> a;

    public static C1600pd a(Application application) {
        C1600pd f = C2933l.f(application);
        C5023JMa.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    public C1600pd get() {
        return a((Application) this.a.get());
    }
}
