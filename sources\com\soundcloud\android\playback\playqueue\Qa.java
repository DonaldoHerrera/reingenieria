package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.Yc;

/* compiled from: PlayQueuePresenter_Factory */
public final class Qa implements C4961HMa<Pa> {
    private final C7054oVa<C3814lca> a;
    private final C7054oVa<C4412qb> b;
    private final C7054oVa<C4392qa> c;
    private final C7054oVa<Yc> d;
    private final C7054oVa<C5327TLa> e;
    private final C7054oVa<C3700b> f;
    private final C7054oVa<Xa> g;
    private final C7054oVa<C2014EO> h;
    private final C7054oVa<HPa> i;

    public static Pa a(C3814lca lca, C4412qb qbVar, C4392qa qaVar, Yc yc, C5327TLa tLa, C3700b bVar, Object obj, C2014EO eo, HPa hPa) {
        Pa pa = new Pa(lca, qbVar, qaVar, yc, tLa, bVar, (Xa) obj, eo, hPa);
        return pa;
    }

    public Pa get() {
        Pa pa = new Pa((C3814lca) this.a.get(), (C4412qb) this.b.get(), (C4392qa) this.c.get(), (Yc) this.d.get(), (C5327TLa) this.e.get(), (C3700b) this.f.get(), (Xa) this.g.get(), (C2014EO) this.h.get(), (HPa) this.i.get());
        return pa;
    }
}
