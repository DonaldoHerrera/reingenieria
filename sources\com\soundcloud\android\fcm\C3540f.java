package com.soundcloud.android.fcm;

/* renamed from: com.soundcloud.android.fcm.f reason: case insensitive filesystem */
/* compiled from: DefaultFcmManager_Factory */
public final class C3540f implements C4961HMa<C3539e> {
    private final C7054oVa<C7181qKa> a;
    private final C7054oVa<C3856qea> b;
    private final C7054oVa<C7730yHa> c;

    public C3540f(C7054oVa<C7181qKa> ova, C7054oVa<C3856qea> ova2, C7054oVa<C7730yHa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C3540f a(C7054oVa<C7181qKa> ova, C7054oVa<C3856qea> ova2, C7054oVa<C7730yHa> ova3) {
        return new C3540f(ova, ova2, ova3);
    }

    public C3539e get() {
        return new C3539e((C7181qKa) this.a.get(), (C3856qea) this.b.get(), (C7730yHa) this.c.get());
    }
}
