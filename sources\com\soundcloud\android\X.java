package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvidesObserverFactoryFactory */
public final class X implements C4961HMa<C5606ava> {
    private static final X a = new X();

    public static X a() {
        return a;
    }

    public static C5606ava b() {
        C5606ava i = C2933l.i();
        C5023JMa.a(i, "Cannot return null from a non-@Nullable @Provides method");
        return i;
    }

    public C5606ava get() {
        return b();
    }
}
