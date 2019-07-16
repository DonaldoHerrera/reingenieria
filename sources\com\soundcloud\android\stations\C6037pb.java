package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.y;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.Db;

/* renamed from: com.soundcloud.android.stations.pb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter_Factory */
public final class C6037pb implements C4961HMa<C6034ob> {
    private final C7054oVa<ic> a;
    private final C7054oVa<C6054vb> b;
    private final C7054oVa<Db> c;
    private final C7054oVa<C2014EO> d;
    private final C7054oVa<C3700b> e;
    private final C7054oVa<y> f;
    private final C7054oVa<r> g;
    private final C7054oVa<HPa> h;

    public C6037pb(C7054oVa<ic> ova, C7054oVa<C6054vb> ova2, C7054oVa<Db> ova3, C7054oVa<C2014EO> ova4, C7054oVa<C3700b> ova5, C7054oVa<y> ova6, C7054oVa<r> ova7, C7054oVa<HPa> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static C6037pb a(C7054oVa<ic> ova, C7054oVa<C6054vb> ova2, C7054oVa<Db> ova3, C7054oVa<C2014EO> ova4, C7054oVa<C3700b> ova5, C7054oVa<y> ova6, C7054oVa<r> ova7, C7054oVa<HPa> ova8) {
        C6037pb pbVar = new C6037pb(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return pbVar;
    }

    public C6034ob get() {
        C6034ob obVar = new C6034ob((ic) this.a.get(), (C6054vb) this.b.get(), (Db) this.c.get(), (C2014EO) this.d.get(), (C3700b) this.e.get(), (y) this.f.get(), (r) this.g.get(), (HPa) this.h.get());
        return obVar;
    }
}
