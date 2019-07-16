package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.pa reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionStateProvider_Factory */
public final class C4355pa implements C4961HMa<C4350oa> {
    private final C7054oVa<C4421sb> a;
    private final C7054oVa<C4526xc> b;
    private final C7054oVa<C5327TLa> c;

    public C4355pa(C7054oVa<C4421sb> ova, C7054oVa<C4526xc> ova2, C7054oVa<C5327TLa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4355pa a(C7054oVa<C4421sb> ova, C7054oVa<C4526xc> ova2, C7054oVa<C5327TLa> ova3) {
        return new C4355pa(ova, ova2, ova3);
    }

    public C4350oa get() {
        return new C4350oa((C4421sb) this.a.get(), (C4526xc) this.b.get(), (C5327TLa) this.c.get());
    }
}
