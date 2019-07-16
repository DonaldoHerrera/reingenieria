package com.soundcloud.android;

/* compiled from: ApplicationModule_ProvideGooglePlayServicesWrapperFactory */
public final class E implements C4961HMa<C7730yHa> {
    private final C2933l a;

    public E(C2933l lVar) {
        this.a = lVar;
    }

    public static E a(C2933l lVar) {
        return new E(lVar);
    }

    public static C7730yHa b(C2933l lVar) {
        C7730yHa f = lVar.f();
        C5023JMa.a(f, "Cannot return null from a non-@Nullable @Provides method");
        return f;
    }

    public C7730yHa get() {
        return b(this.a);
    }
}
