package com.soundcloud.android;

/* renamed from: com.soundcloud.android.x reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideCountryProviderFactory */
public final class C2945x implements C4961HMa<C6291dHa> {
    private final C7054oVa<C5381VHa> a;

    public C2945x(C7054oVa<C5381VHa> ova) {
        this.a = ova;
    }

    public static C2945x a(C7054oVa<C5381VHa> ova) {
        return new C2945x(ova);
    }

    public static C6291dHa a(C4806CMa<C5381VHa> cMa) {
        C6291dHa a2 = C2933l.a(cMa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C6291dHa get() {
        return a(C4930GMa.a(this.a));
    }
}
