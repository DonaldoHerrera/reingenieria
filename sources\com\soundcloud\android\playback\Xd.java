package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.q;

/* compiled from: TrackSessionAnalyticsDispatcher_Factory */
public final class Xd implements C4961HMa<Jd> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C3760eea> b;
    private final C7054oVa<C3814lca> c;
    private final C7054oVa<q> d;
    private final C7054oVa<C4298dd> e;
    private final C7054oVa<C5628bIa> f;
    private final C7054oVa<C5425Wta> g;
    private final C7054oVa<C3017gO> h;
    private final C7054oVa<E> i;
    private final C7054oVa<C3700b> j;

    public Xd(C7054oVa<C5327TLa> ova, C7054oVa<C3760eea> ova2, C7054oVa<C3814lca> ova3, C7054oVa<q> ova4, C7054oVa<C4298dd> ova5, C7054oVa<C5628bIa> ova6, C7054oVa<C5425Wta> ova7, C7054oVa<C3017gO> ova8, C7054oVa<E> ova9, C7054oVa<C3700b> ova10) {
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

    public static Xd a(C7054oVa<C5327TLa> ova, C7054oVa<C3760eea> ova2, C7054oVa<C3814lca> ova3, C7054oVa<q> ova4, C7054oVa<C4298dd> ova5, C7054oVa<C5628bIa> ova6, C7054oVa<C5425Wta> ova7, C7054oVa<C3017gO> ova8, C7054oVa<E> ova9, C7054oVa<C3700b> ova10) {
        Xd xd = new Xd(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10);
        return xd;
    }

    public Jd get() {
        Jd jd = new Jd((C5327TLa) this.a.get(), (C3760eea) this.b.get(), (C3814lca) this.c.get(), (q) this.d.get(), (C4298dd) this.e.get(), (C5628bIa) this.f.get(), (C5425Wta) this.g.get(), (C3017gO) this.h.get(), (E) this.i.get(), (C3700b) this.j.get());
        return jd;
    }
}
