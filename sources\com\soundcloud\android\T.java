package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvideWaveformCacheFactory */
public final class T implements C4961HMa<Z<C3508cda, C5325TJa>> {
    private static final T a = new T();

    public static Z<C3508cda, C5325TJa> a() {
        Z<C3508cda, C5325TJa> h = C2933l.h();
        C5023JMa.a(h, "Cannot return null from a non-@Nullable @Provides method");
        return h;
    }

    public Z<C3508cda, C5325TJa> get() {
        return a();
    }
}
