package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvideIoSchedulerFactory */
public final class G implements C4961HMa<HPa> {
    private static final G a = new G();

    public static G a() {
        return a;
    }

    public static HPa b() {
        HPa g = C2933l.g();
        C5023JMa.a(g, "Cannot return null from a non-@Nullable @Provides method");
        return g;
    }

    public HPa get() {
        return b();
    }
}
