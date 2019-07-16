package com.soundcloud.android.ads;

/* renamed from: com.soundcloud.android.ads.yb reason: case insensitive filesystem */
/* compiled from: DefaultForceAdTestingIdRepository_Factory */
public final class C2646yb implements C4961HMa<C2642xb> {
    private final C7054oVa<C2436_U> a;

    public C2646yb(C7054oVa<C2436_U> ova) {
        this.a = ova;
    }

    public static C2646yb a(C7054oVa<C2436_U> ova) {
        return new C2646yb(ova);
    }

    public C2642xb get() {
        return new C2642xb((C2436_U) this.a.get());
    }
}
