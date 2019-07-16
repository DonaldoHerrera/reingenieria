package com.soundcloud.android.collection.playhistory;

/* compiled from: PlayHistorySyncer_Factory */
public final class Aa implements C4961HMa<za> {
    private final C7054oVa<va> a;
    private final C7054oVa<C2788p> b;
    private final C7054oVa<Fa> c;
    private final C7054oVa<C6620iAa> d;
    private final C7054oVa<C3768fea> e;
    private final C7054oVa<C5327TLa> f;

    public Aa(C7054oVa<va> ova, C7054oVa<C2788p> ova2, C7054oVa<Fa> ova3, C7054oVa<C6620iAa> ova4, C7054oVa<C3768fea> ova5, C7054oVa<C5327TLa> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static Aa a(C7054oVa<va> ova, C7054oVa<C2788p> ova2, C7054oVa<Fa> ova3, C7054oVa<C6620iAa> ova4, C7054oVa<C3768fea> ova5, C7054oVa<C5327TLa> ova6) {
        Aa aa = new Aa(ova, ova2, ova3, ova4, ova5, ova6);
        return aa;
    }

    public za get() {
        za zaVar = new za((va) this.a.get(), (C2788p) this.b.get(), (Fa) this.c.get(), (C6620iAa) this.d.get(), (C3768fea) this.e.get(), (C5327TLa) this.f.get());
        return zaVar;
    }
}
