package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: LikedStationsPresenter_Factory */
public final class Aa implements C4961HMa<C6065za> {
    private final C7054oVa<ic> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<C2014EO> c;
    private final C7054oVa<C3814lca> d;
    private final C7054oVa<C3700b> e;
    private final C7054oVa<C5606ava> f;
    private final C7054oVa<HPa> g;

    public Aa(C7054oVa<ic> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C2014EO> ova3, C7054oVa<C3814lca> ova4, C7054oVa<C3700b> ova5, C7054oVa<C5606ava> ova6, C7054oVa<HPa> ova7) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
    }

    public static Aa a(C7054oVa<ic> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C2014EO> ova3, C7054oVa<C3814lca> ova4, C7054oVa<C3700b> ova5, C7054oVa<C5606ava> ova6, C7054oVa<HPa> ova7) {
        Aa aa = new Aa(ova, ova2, ova3, ova4, ova5, ova6, ova7);
        return aa;
    }

    public C6065za get() {
        C6065za zaVar = new C6065za((ic) this.a.get(), (C5327TLa) this.b.get(), (C2014EO) this.c.get(), (C3814lca) this.d.get(), (C3700b) this.e.get(), (C5606ava) this.f.get(), (HPa) this.g.get());
        return zaVar;
    }
}
