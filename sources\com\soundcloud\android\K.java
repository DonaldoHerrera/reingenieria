package com.soundcloud.android;

import android.app.Application;
import androidx.core.app.n;

/* compiled from: ApplicationModule_ProvideNotificationManagerFactory */
public final class K implements C4961HMa<n> {
    private final C7054oVa<Application> a;

    public K(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static K a(C7054oVa<Application> ova) {
        return new K(ova);
    }

    public static n a(Application application) {
        n g = C2933l.g(application);
        C5023JMa.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }

    public n get() {
        return a((Application) this.a.get());
    }
}
