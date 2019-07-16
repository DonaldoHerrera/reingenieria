package com.soundcloud.android.ads;

/* renamed from: com.soundcloud.android.ads.qa reason: case insensitive filesystem */
/* compiled from: AdIdSyncer_Factory */
public final class C2614qa implements C4961HMa<C2610pa> {
    private final C7054oVa<C2594la> a;

    public C2614qa(C7054oVa<C2594la> ova) {
        this.a = ova;
    }

    public static C2614qa a(C7054oVa<C2594la> ova) {
        return new C2614qa(ova);
    }

    public C2610pa get() {
        return new C2610pa((C2594la) this.a.get());
    }
}
