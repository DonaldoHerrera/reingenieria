package com.soundcloud.android;

import com.soundcloud.android.properties.j;

/* renamed from: com.soundcloud.android.y reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideCrashReportingHelperFactory */
public final class C2946y implements C4961HMa<C3236rN> {
    private final C7054oVa<j> a;
    private final C7054oVa<C7319sKa> b;

    public C2946y(C7054oVa<j> ova, C7054oVa<C7319sKa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C2946y a(C7054oVa<j> ova, C7054oVa<C7319sKa> ova2) {
        return new C2946y(ova, ova2);
    }

    public static C3236rN a(j jVar, C7319sKa ska) {
        C3236rN a2 = C2933l.a(jVar, ska);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3236rN get() {
        return a((j) this.a.get(), (C7319sKa) this.b.get());
    }
}
