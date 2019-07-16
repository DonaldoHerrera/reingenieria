package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.foundation.events.y;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.Db;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.ob reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
public final class C6034ob extends C7037oEa<Pb, List<? extends Za>, C6973nJa, StationFragmentArgs, StationFragmentArgs, C6051ub> {
    private C3508cda k;
    /* access modifiers changed from: private */
    public final ic l;
    /* access modifiers changed from: private */
    public final C6054vb m;
    /* access modifiers changed from: private */
    public final Db n;
    private C2014EO o;
    /* access modifiers changed from: private */
    public final C3700b p;
    /* access modifiers changed from: private */
    public final y q;
    private final r r;
    private final HPa s;

    public C6034ob(ic icVar, C6054vb vbVar, Db db, C2014EO eo, C3700b bVar, y yVar, r rVar, HPa hPa) {
        C7471uYa.b(icVar, "stationOperations");
        C7471uYa.b(vbVar, "stationInfoViewModelMapper");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(eo, "performanceMetricsEngine");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(yVar, "screenProvider");
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = icVar;
        this.m = vbVar;
        this.n = db;
        this.o = eo;
        this.p = bVar;
        this.q = yVar;
        this.r = rVar;
        this.s = hPa;
    }

    /* access modifiers changed from: private */
    public final void f() {
        C3700b bVar = this.p;
        Yca yca = Yca.STATIONS_INFO;
        C3508cda cda = this.k;
        if (cda != null) {
            Zca zca = new Zca(yca, cda, null, null, null, 28, null);
            bVar.a(zca);
            return;
        }
        C7471uYa.b("stationUrn");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, Pb>> c(StationFragmentArgs stationFragmentArgs) {
        C7471uYa.b(stationFragmentArgs, "pageParams");
        return b(stationFragmentArgs);
    }

    /* access modifiers changed from: private */
    public final void b(Pb pb) {
        C1994DO b = C1994DO.a().a(u.LOAD_STATION).a(t.a(s.TRACKS_COUNT, (long) pb.d().size())).b();
        C2014EO eo = this.o;
        C7471uYa.a((Object) b, "performanceMetric");
        eo.b(b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, Pb>> b(StationFragmentArgs stationFragmentArgs) {
        C7471uYa.b(stationFragmentArgs, "pageParams");
        this.k = stationFragmentArgs.c();
        ic icVar = this.l;
        C3508cda c = stationFragmentArgs.c();
        C4928GKa b = C4928GKa.b(stationFragmentArgs.b());
        C7471uYa.a((Object) b, "Optional.fromNullable(pa…Params.getSeedTrackUrn())");
        APa g = icVar.a(c, b).b((C6776kQa<? super T>) new C6028mb<Object>(this)).g();
        C7471uYa.a((Object) g, "stationOperations.statio…          .toObservable()");
        return C7594wJa.a(g, null, 1, null);
    }

    /* access modifiers changed from: protected */
    public APa<List<Za>> a(Pb pb) {
        C7471uYa.b(pb, "domainModel");
        APa e = this.r.a().h(C6025lb.a).d().e(q.a);
        C7471uYa.a((Object) e, "playQueueUpdates.current…With(PlayQueueItem.EMPTY)");
        _Ua _ua = _Ua.a;
        APa c = APa.c(pb);
        C7471uYa.a((Object) c, "Observable.just(domainModel)");
        APa<List<Za>> a = APa.a((EPa<? extends T1>) c, (EPa<? extends T2>) e, (C6504gQa<? super T1, ? super T2, ? extends R>) new C6022kb<Object,Object,Object>(this));
        C7471uYa.a((Object) a, "Observables.combineLates…tPlayQueueItem)\n        }");
        return a;
    }

    public void a(C6051ub ubVar) {
        C7471uYa.b(ubVar, "view");
        super.a(ubVar);
        b().a((VPa) ubVar.d().c(C5220Pua.a((C6776kQa<T>) new C5992ab<T>(this))), (VPa) ubVar.Q().c(C5220Pua.a((C6776kQa<T>) new C6004eb<T>(this, ubVar))), (VPa) ubVar.o().c(C5220Pua.a((C6776kQa<T>) new C6016ib<T>(this, ubVar))), (VPa) ubVar.M().c(C5220Pua.a((C6776kQa<T>) new C6019jb<T>(this))));
    }
}
