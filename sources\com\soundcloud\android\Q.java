package com.soundcloud.android;

import android.app.Application;
import com.soundcloud.android.features.record.J;
import com.soundcloud.android.features.record.ba;

/* compiled from: ApplicationModule_ProvideSoundRecorderFactory */
public final class Q implements C4961HMa<ba> {
    private final C7054oVa<J> a;
    private final C7054oVa<Application> b;

    public Q(C7054oVa<J> ova, C7054oVa<Application> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Q a(C7054oVa<J> ova, C7054oVa<Application> ova2) {
        return new Q(ova, ova2);
    }

    public static ba a(J j, Application application) {
        ba a2 = C2933l.a(j, application);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public ba get() {
        return a((J) this.a.get(), (Application) this.b.get());
    }
}
