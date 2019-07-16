package com.soundcloud.android;

import android.app.Application;

/* compiled from: ApplicationModule_ProvideNumberFormatterFactory */
public final class L implements C4961HMa<C5408WFa> {
    private final C7054oVa<Application> a;

    public L(C7054oVa<Application> ova) {
        this.a = ova;
    }

    public static L a(C7054oVa<Application> ova) {
        return new L(ova);
    }

    public static C5408WFa a(Application application) {
        C5408WFa h = C2933l.h(application);
        C5023JMa.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }

    public C5408WFa get() {
        return a((Application) this.a.get());
    }
}
