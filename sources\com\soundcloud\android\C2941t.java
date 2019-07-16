package com.soundcloud.android;

/* renamed from: com.soundcloud.android.t reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideConnectionChangeListenerFactory */
public final class C2941t implements C4961HMa<C6766kGa> {
    private final C7054oVa<C5327TLa> a;

    public C2941t(C7054oVa<C5327TLa> ova) {
        this.a = ova;
    }

    public static C2941t a(C7054oVa<C5327TLa> ova) {
        return new C2941t(ova);
    }

    public static C6766kGa a(C5327TLa tLa) {
        C6766kGa a2 = C2933l.a(tLa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C6766kGa get() {
        return a((C5327TLa) this.a.get());
    }
}
