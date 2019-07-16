package com.soundcloud.android.stream;

import com.soundcloud.android.ads.gd;
import com.soundcloud.android.ads.od;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.upsell.a;

/* compiled from: StreamPresenter_Factory */
public final class jb implements C4961HMa<ib> {
    private final C7054oVa<C6115ya> a;
    private final C7054oVa<Z> b;
    private final C7054oVa<C6093n> c;
    private final C7054oVa<gd> d;
    private final C7054oVa<C6070ba> e;
    private final C7054oVa<C4655rja> f;
    private final C7054oVa<C3700b> g;
    private final C7054oVa<C3240rR> h;
    private final C7054oVa<od> i;
    private final C7054oVa<ke> j;
    private final C7054oVa<a> k;
    private final C7054oVa<Yaa> l;
    private final C7054oVa<Db> m;
    private final C7054oVa<HPa> n;

    public jb(C7054oVa<C6115ya> ova, C7054oVa<Z> ova2, C7054oVa<C6093n> ova3, C7054oVa<gd> ova4, C7054oVa<C6070ba> ova5, C7054oVa<C4655rja> ova6, C7054oVa<C3700b> ova7, C7054oVa<C3240rR> ova8, C7054oVa<od> ova9, C7054oVa<ke> ova10, C7054oVa<a> ova11, C7054oVa<Yaa> ova12, C7054oVa<Db> ova13, C7054oVa<HPa> ova14) {
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
        this.k = ova11;
        this.l = ova12;
        this.m = ova13;
        this.n = ova14;
    }

    public static jb a(C7054oVa<C6115ya> ova, C7054oVa<Z> ova2, C7054oVa<C6093n> ova3, C7054oVa<gd> ova4, C7054oVa<C6070ba> ova5, C7054oVa<C4655rja> ova6, C7054oVa<C3700b> ova7, C7054oVa<C3240rR> ova8, C7054oVa<od> ova9, C7054oVa<ke> ova10, C7054oVa<a> ova11, C7054oVa<Yaa> ova12, C7054oVa<Db> ova13, C7054oVa<HPa> ova14) {
        jb jbVar = new jb(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12, ova13, ova14);
        return jbVar;
    }

    public ib get() {
        ib ibVar = new ib((C6115ya) this.a.get(), (Z) this.b.get(), (C6093n) this.c.get(), (gd) this.d.get(), (C6070ba) this.e.get(), (C4655rja) this.f.get(), (C3700b) this.g.get(), (C3240rR) this.h.get(), (od) this.i.get(), (ke) this.j.get(), (a) this.k.get(), (Yaa) this.l.get(), (Db) this.m.get(), (HPa) this.n.get());
        return ibVar;
    }
}
