package com.soundcloud.android.playback;

import com.soundcloud.android.offline.C4165se;
import com.soundcloud.android.settings.streamingquality.e;

/* compiled from: StreamSelector_Factory */
public final class Fd implements C4961HMa<C4527xd> {
    private final C7054oVa<C4517wa> a;
    private final C7054oVa<Gd> b;
    private final C7054oVa<C4165se> c;
    private final C7054oVa<C4735ADa> d;
    private final C7054oVa<e> e;
    private final C7054oVa<Yla> f;
    private final C7054oVa<C3789iba> g;
    private final C7054oVa<C6834lGa> h;
    private final C7054oVa<Nea> i;
    private final C7054oVa<C3469VY> j;

    public Fd(C7054oVa<C4517wa> ova, C7054oVa<Gd> ova2, C7054oVa<C4165se> ova3, C7054oVa<C4735ADa> ova4, C7054oVa<e> ova5, C7054oVa<Yla> ova6, C7054oVa<C3789iba> ova7, C7054oVa<C6834lGa> ova8, C7054oVa<Nea> ova9, C7054oVa<C3469VY> ova10) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
    }

    public static Fd a(C7054oVa<C4517wa> ova, C7054oVa<Gd> ova2, C7054oVa<C4165se> ova3, C7054oVa<C4735ADa> ova4, C7054oVa<e> ova5, C7054oVa<Yla> ova6, C7054oVa<C3789iba> ova7, C7054oVa<C6834lGa> ova8, C7054oVa<Nea> ova9, C7054oVa<C3469VY> ova10) {
        Fd fd = new Fd(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10);
        return fd;
    }

    public C4527xd get() {
        C4527xd xdVar = new C4527xd((C4517wa) this.a.get(), (Gd) this.b.get(), (C4165se) this.c.get(), (C4735ADa) this.d.get(), (e) this.e.get(), (Yla) this.f.get(), (C3789iba) this.g.get(), (C6834lGa) this.h.get(), (Nea) this.i.get(), (C3469VY) this.j.get());
        return xdVar;
    }
}
