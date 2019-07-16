package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.ads.Oc;
import com.soundcloud.android.ads.Yb;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.playback.ui.view.g;
import com.soundcloud.android.settings.C5956m;

/* renamed from: com.soundcloud.android.playback.ha reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionController_Factory */
public final class C4315ha implements C4961HMa<S> {
    private final C7054oVa<C4416rb> a;
    private final C7054oVa<Fa> b;
    private final C7054oVa<Context> c;
    private final C7054oVa<Qb> d;
    private final C7054oVa<C3814lca> e;
    private final C7054oVa<P> f;
    private final C7054oVa<C4526xc> g;
    private final C7054oVa<C5327TLa> h;
    private final C7054oVa<C3700b> i;
    private final C7054oVa<Yb> j;
    private final C7054oVa<Na> k;
    private final C7054oVa<g> l;
    private final C7054oVa<C5956m> m;
    private final C7054oVa<C3678e> n;
    private final C7054oVa<Oc> o;
    private final C7054oVa<Yaa> p;
    private final C7054oVa<HPa> q;

    public C4315ha(C7054oVa<C4416rb> ova, C7054oVa<Fa> ova2, C7054oVa<Context> ova3, C7054oVa<Qb> ova4, C7054oVa<C3814lca> ova5, C7054oVa<P> ova6, C7054oVa<C4526xc> ova7, C7054oVa<C5327TLa> ova8, C7054oVa<C3700b> ova9, C7054oVa<Yb> ova10, C7054oVa<Na> ova11, C7054oVa<g> ova12, C7054oVa<C5956m> ova13, C7054oVa<C3678e> ova14, C7054oVa<Oc> ova15, C7054oVa<Yaa> ova16, C7054oVa<HPa> ova17) {
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
        this.o = ova15;
        this.p = ova16;
        this.q = ova17;
    }

    public static C4315ha a(C7054oVa<C4416rb> ova, C7054oVa<Fa> ova2, C7054oVa<Context> ova3, C7054oVa<Qb> ova4, C7054oVa<C3814lca> ova5, C7054oVa<P> ova6, C7054oVa<C4526xc> ova7, C7054oVa<C5327TLa> ova8, C7054oVa<C3700b> ova9, C7054oVa<Yb> ova10, C7054oVa<Na> ova11, C7054oVa<g> ova12, C7054oVa<C5956m> ova13, C7054oVa<C3678e> ova14, C7054oVa<Oc> ova15, C7054oVa<Yaa> ova16, C7054oVa<HPa> ova17) {
        C4315ha haVar = new C4315ha(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12, ova13, ova14, ova15, ova16, ova17);
        return haVar;
    }

    public S get() {
        S s = new S((C4416rb) this.a.get(), (Fa) this.b.get(), (Context) this.c.get(), (Qb) this.d.get(), (C3814lca) this.e.get(), (P) this.f.get(), (C4526xc) this.g.get(), (C5327TLa) this.h.get(), (C3700b) this.i.get(), (Yb) this.j.get(), (Na) this.k.get(), (g) this.l.get(), (C5956m) this.m.get(), (C3678e) this.n.get(), (Oc) this.o.get(), (Yaa) this.p.get(), (HPa) this.q.get());
        return s;
    }
}
