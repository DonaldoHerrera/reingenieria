package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.stations.Ga;

/* compiled from: RecentlyPlayedPresenter_Factory */
public final class ra implements C4961HMa<C2816ia> {
    private final C7054oVa<J> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<C3700b> c;
    private final C7054oVa<F> d;
    private final C7054oVa<C4655rja> e;
    private final C7054oVa<Ga> f;
    private final C7054oVa<C5052KJa> g;
    private final C7054oVa<C2014EO> h;
    private final C7054oVa<HPa> i;

    public ra(C7054oVa<J> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C3700b> ova3, C7054oVa<F> ova4, C7054oVa<C4655rja> ova5, C7054oVa<Ga> ova6, C7054oVa<C5052KJa> ova7, C7054oVa<C2014EO> ova8, C7054oVa<HPa> ova9) {
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

    public static ra a(C7054oVa<J> ova, C7054oVa<C5327TLa> ova2, C7054oVa<C3700b> ova3, C7054oVa<F> ova4, C7054oVa<C4655rja> ova5, C7054oVa<Ga> ova6, C7054oVa<C5052KJa> ova7, C7054oVa<C2014EO> ova8, C7054oVa<HPa> ova9) {
        ra raVar = new ra(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9);
        return raVar;
    }

    public C2816ia get() {
        C2816ia iaVar = new C2816ia((J) this.a.get(), (C5327TLa) this.b.get(), (C3700b) this.c.get(), (F) this.d.get(), (C4655rja) this.e.get(), (Ga) this.f.get(), (C5052KJa) this.g.get(), (C2014EO) this.h.get(), (HPa) this.i.get());
        return iaVar;
    }
}
