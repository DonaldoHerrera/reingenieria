package com.soundcloud.android;

import android.app.Application;
import android.content.Context;

/* renamed from: com.soundcloud.android.w reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideContextFactory */
public final class C2944w implements C4961HMa<Context> {
    private final C7054oVa<Application> a;

    public C2944w(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static C2944w a(C7054oVa<Application> ova) {
        return new C2944w(ova);
    }

    public static Context a(Application application) {
        C2933l.e(application);
        C5023JMa.a(application, "Cannot return null from a non-@Nullable @Provides method");
        return application;
    }

    public Context get() {
        return a((Application) this.a.get());
    }
}
