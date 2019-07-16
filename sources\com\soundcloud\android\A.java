package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvideEventBusFactory */
public final class A implements C4961HMa<C5327TLa> {
    private static final A a = new A();

    public static A a() {
        return a;
    }

    public static C5327TLa b() {
        C5327TLa c = C2933l.c();
        C5023JMa.a(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    public C5327TLa get() {
        return b();
    }
}
