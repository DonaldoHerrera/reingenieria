package com.soundcloud.android.collection.recentlyplayed;

/* compiled from: RecentlyPlayedSyncer_Factory */
public final class La implements C4961HMa<Ka> {
    private final C7054oVa<Ga> a;
    private final C7054oVa<C2813h> b;
    private final C7054oVa<C2817j> c;
    private final C7054oVa<C6416fAa> d;
    private final C7054oVa<Hda> e;
    private final C7054oVa<C6824lAa> f;
    private final C7054oVa<C3800jea> g;
    private final C7054oVa<C5327TLa> h;
    private final C7054oVa<Vda> i;

    public La(C7054oVa<Ga> ova, C7054oVa<C2813h> ova2, C7054oVa<C2817j> ova3, C7054oVa<C6416fAa> ova4, C7054oVa<Hda> ova5, C7054oVa<C6824lAa> ova6, C7054oVa<C3800jea> ova7, C7054oVa<C5327TLa> ova8, C7054oVa<Vda> ova9) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
    }

    public static La a(C7054oVa<Ga> ova, C7054oVa<C2813h> ova2, C7054oVa<C2817j> ova3, C7054oVa<C6416fAa> ova4, C7054oVa<Hda> ova5, C7054oVa<C6824lAa> ova6, C7054oVa<C3800jea> ova7, C7054oVa<C5327TLa> ova8, C7054oVa<Vda> ova9) {
        La la = new La(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return la;
    }

    public Ka get() {
        Ka ka = new Ka((Ga) this.a.get(), (C2813h) this.b.get(), (C2817j) this.c.get(), (C6416fAa) this.d.get(), (Hda) this.e.get(), (C6824lAa) this.f.get(), (C3800jea) this.g.get(), (C5327TLa) this.h.get(), (Vda) this.i.get());
        return ka;
    }
}
