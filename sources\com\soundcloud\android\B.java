package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvideFabricReporterFactory */
public final class B implements C4961HMa<C3824mea> {
    private static final B a = new B();

    public static B a() {
        return a;
    }

    public static C3824mea b() {
        C3824mea d = C2933l.d();
        C5023JMa.a(d, "Cannot return null from a non-@Nullable @Provides method");
        return d;
    }

    public C3824mea get() {
        return b();
    }
}
