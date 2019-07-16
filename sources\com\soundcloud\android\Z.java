package com.soundcloud.android;

import com.soundcloud.android.properties.a;

/* compiled from: ApplicationModule_ProvidesPerformanceReporterFactory */
public final class Z implements C4961HMa<C2034FO> {
    private final C7054oVa<a> a;

    public Z(C7054oVa<a> ova) {
        this.a = ova;
    }

    public static Z a(C7054oVa<a> ova) {
        return new Z(ova);
    }

    public static C2034FO a(a aVar) {
        C2034FO a2 = C2933l.a(aVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2034FO get() {
        return a((a) this.a.get());
    }
}
