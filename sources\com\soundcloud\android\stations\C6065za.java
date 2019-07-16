package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.foundation.playqueue.m;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.za reason: case insensitive filesystem */
/* compiled from: LikedStationsPresenter.kt */
public final class C6065za extends C7318sJa<List<? extends Nb>, RVa, RVa, Fa> {
    private final ic l;
    private final C5327TLa m;
    private final C2014EO n;
    private final C3814lca o;
    /* access modifiers changed from: private */
    public final C3700b p;
    private final C5606ava q;
    private final HPa r;

    public C6065za(ic icVar, C5327TLa tLa, C2014EO eo, C3814lca lca, C3700b bVar, C5606ava ava, HPa hPa) {
        C7471uYa.b(icVar, "stationsOperations");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(eo, "performanceMetricsEngine");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(ava, "observerFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = icVar;
        this.m = tLa;
        this.n = eo;
        this.o = lca;
        this.p = bVar;
        this.q = ava;
        this.r = hPa;
    }

    private final void h() {
        this.n.a(u.LOAD_STATION);
    }

    /* access modifiers changed from: private */
    public final IPa<List<Nb>> g() {
        IPa<List<Nb>> e = this.l.a(7).e(new C6059xa(this));
        C7471uYa.a((Object) e, "stationsOperations.colle…lectionUrn == it.urn) } }");
        return e;
    }

    /* renamed from: b */
    public APa<List<Nb>> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<List<Nb>> j = this.l.b().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C6056wa<Object,Object>(this)).j();
        C7471uYa.a((Object) j, "stationsOperations.syncL…          .toObservable()");
        return j;
    }

    public final C3814lca f() {
        return this.o;
    }

    /* renamed from: a */
    public APa<List<Nb>> f(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        C5327TLa tLa = this.m;
        C5443XLa<C3490aba> xLa = C3876taa.o;
        C7471uYa.a((Object) xLa, "EventQueue.URN_STATE_CHANGED");
        APa a = tLa.a(xLa).a((C7256rQa<? super T>) C6047ta.a);
        C7471uYa.a((Object) a, "eventBus.queue(EventQueu…IONS_COLLECTION_UPDATED }");
        APa<List<Nb>> d = a(a).m(new C6050ua(this)).a((DPa<? extends R, ? super T>) C5229QDa.a.a(new C6053va(this))).d();
        C7471uYa.a((Object) d, "eventBus.queue(EventQueu…  .distinctUntilChanged()");
        return d;
    }

    public void a(Fa fa) {
        C7471uYa.b(fa, "view");
        super.a(fa);
        b().a((VPa) fa.d().h(C6039qa.a).c(this.q.b(new C6041ra(this))), fa.J().f((C6776kQa<? super T>) new C6044sa<Object>(this, fa)));
    }

    /* access modifiers changed from: private */
    public final void a(Fa fa, C3508cda cda) {
        h();
        C4621nja b = C4621nja.b(cda, C4928GKa.a(), C4928GKa.c(m.STATIONS), C4928GKa.a());
        C7471uYa.a((Object) b, "NavigationTarget.forStat…IONS), Optional.absent())");
        fa.a(b);
    }

    private final <E> APa<RVa> a(APa<E> aPa) {
        APa<RVa> e = aPa.h(C6062ya.a).e(RVa.a);
        C7471uYa.a((Object) e, "this.map { Unit }.startWith(Unit)");
        return e;
    }

    /* access modifiers changed from: private */
    public final void a(List<Nb> list) {
        C1994DO b = C1994DO.a().a(u.LIKED_STATIONS_LOAD).a(t.a(s.STATIONS_COUNT, (long) list.size())).b();
        C2014EO eo = this.n;
        C7471uYa.a((Object) b, "performanceMetric");
        eo.b(b);
    }
}
