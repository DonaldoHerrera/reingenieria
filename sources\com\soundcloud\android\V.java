package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvidesAppConfigurationReporterFactory */
public final class V implements C4961HMa<C6336dua> {
    private final C7054oVa<C3236rN> a;
    private final C7054oVa<C6404eua> b;

    public V(C7054oVa<C3236rN> ova, C7054oVa<C6404eua> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static V a(C7054oVa<C3236rN> ova, C7054oVa<C6404eua> ova2) {
        return new V(ova, ova2);
    }

    public static C6336dua a(C3236rN rNVar, C4806CMa<C6404eua> cMa) {
        C6336dua a2 = C2933l.a(rNVar, cMa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C6336dua get() {
        return a((C3236rN) this.a.get(), C4930GMa.a(this.b));
    }
}
