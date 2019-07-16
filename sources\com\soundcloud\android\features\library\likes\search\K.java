package com.soundcloud.android.features.library.likes.search;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.G;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.likes.V;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* compiled from: TrackLikesSearchPresenter.kt */
public class K extends C7658xEa<N, C3605a, RVa, RVa, M> {
    private final C2350WH<String> l;
    /* access modifiers changed from: private */
    public final Db m;
    /* access modifiers changed from: private */
    public final C4425ta n;
    /* access modifiers changed from: private */
    public final C3700b o;
    private final HPa p;
    private final C3614j q;

    public K(Db db, C4425ta taVar, C3700b bVar, HPa hPa, C3614j jVar) {
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(taVar, "expandPlayerCommand");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(jVar, "likesSearchDataSource");
        super(hPa);
        this.m = db;
        this.n = taVar;
        this.o = bVar;
        this.p = hPa;
        this.q = jVar;
        C2314UH f = C2314UH.f("");
        C7471uYa.a((Object) f, "BehaviorRelay.createDefault(\"\")");
        this.l = f;
    }

    /* renamed from: b */
    public APa<d<C3605a, N>> e(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<d<C3605a, N>> h = this.q.b(this.l).h(J.a);
        C7471uYa.a((Object) h, "likesSearchDataSource.sy…kesSearchViewModel>(it) }");
        return h;
    }

    private APa<G> b(M m2) {
        APa<G> a = APa.a((EPa<? extends T1>) this.l, (EPa<? extends T2>) m2.o(), (C6504gQa<? super T1, ? super T2, ? extends R>) H.a);
        C7471uYa.a((Object) a, "Observable.combineLatest…\n            )\n        })");
        return a;
    }

    public void a(M m2) {
        C7471uYa.b(m2, "view");
        super.a(m2);
        UPa b = b();
        VPa[] vPaArr = new VPa[6];
        vPaArr[0] = m2.Ma().f((C6776kQa<? super T>) this.l);
        vPaArr[1] = b(m2).f((C6776kQa<? super T>) new B<Object>(this));
        vPaArr[2] = a(m2.o()).f((C6776kQa<? super T>) new C<Object>(this, m2));
        vPaArr[3] = m2.d().f((C6776kQa<? super T>) new D<Object>(this));
        vPaArr[4] = m2.Ga().f((C6776kQa<? super T>) new E<Object>(m2));
        C2350WH<String> wh = this.l;
        if (wh != null) {
            vPaArr[5] = wh.f((C6776kQa<? super T>) new F<Object>(m2));
            b.a(vPaArr);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* renamed from: a */
    public APa<d<C3605a, N>> d(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<d<C3605a, N>> h = this.q.a(this.l).h(I.a);
        C7471uYa.a((Object) h, "likesSearchDataSource.ge…kesSearchViewModel>(it) }");
        return h;
    }

    private APa<C4536zc> a(APa<HVa<Integer, List<x>>> aPa) {
        APa<C4536zc> g = aPa.g(new G(this));
        C7471uYa.a((Object) g, "flatMapSingle { (positio…)\n            )\n        }");
        return g;
    }

    /* access modifiers changed from: private */
    public u a(V v) {
        u a = u.a(v.b().a());
        C7471uYa.a((Object) a, "PlayableWithReposter.from(trackItem.urn)");
        return a;
    }
}
