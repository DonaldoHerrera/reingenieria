package com.soundcloud.android.app;

import com.soundcloud.android.properties.a;

/* compiled from: MediaBrowserUiModule_ProvidesMediaBrowserDataSourceFactory */
public final class ha implements C4961HMa<C4649qma> {
    private final C7054oVa<Fba> a;
    private final C7054oVa<a> b;

    public static C4649qma a(C7054oVa<Fba> ova, a aVar) {
        C4649qma a2 = ga.a(ova, aVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C4649qma get() {
        return a(this.a, (a) this.b.get());
    }
}
