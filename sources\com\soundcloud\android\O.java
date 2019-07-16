package com.soundcloud.android;

import android.app.Application;
import android.content.res.Resources;

/* compiled from: ApplicationModule_ProvideResourcesFactory */
public final class O implements C4961HMa<Resources> {
    private final C7054oVa<Application> a;

    public O(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static O a(C7054oVa<Application> ova) {
        return new O(ova);
    }

    public static Resources a(Application application) {
        Resources j = C2933l.j(application);
        C5023JMa.a(j, "Cannot return null from a non-@Nullable @Provides method");
        return j;
    }

    public Resources get() {
        return a((Application) this.a.get());
    }
}
