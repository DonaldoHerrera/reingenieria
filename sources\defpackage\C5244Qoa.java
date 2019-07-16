package defpackage;

import java.util.List;

/* renamed from: Qoa reason: default package and case insensitive filesystem */
/* compiled from: AddToPlaylistPresenter.kt */
public final class C5244Qoa extends C7318sJa<List<? extends C5333Toa>, Long, RVa, C5304Soa> {
    /* access modifiers changed from: private */
    public final HPa l;
    /* access modifiers changed from: private */
    public final C4909Fra m;
    /* access modifiers changed from: private */
    public final C2436_U n;
    /* access modifiers changed from: private */
    public final C5606ava o;

    public C5244Qoa(HPa hPa, C4909Fra fra, C2436_U _u, C5606ava ava) {
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(fra, "playlistOperations");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(ava, "observerFactory");
        super(hPa);
        this.l = hPa;
        this.m = fra;
        this.n = _u;
        this.o = ava;
    }

    public /* bridge */ /* synthetic */ APa f(Object obj) {
        return a(((Number) obj).longValue());
    }

    public void a(C5304Soa soa) {
        C7471uYa.b(soa, "view");
        super.a(soa);
        UPa b = b();
        VPa f = soa.Ya().f((C6776kQa<? super T>) new C5154Noa<Object>(this, soa));
        C7471uYa.a((Object) f, "view.addTrackToPlaylistC…             })\n        }");
        XUa.a(b, f);
        UPa b2 = b();
        VPa f2 = soa.gb().f((C6776kQa<? super T>) new C5184Ooa<Object>(soa));
        C7471uYa.a((Object) f2, "view.createPlaylistClick…view.createPlaylist(it) }");
        XUa.a(b2, f2);
    }

    public APa<List<C5333Toa>> a(long j) {
        C4909Fra fra = this.m;
        C3508cda d = C3508cda.d(j);
        C7471uYa.a((Object) d, "Urn.forTrack(pageParams)");
        APa<List<C5333Toa>> j2 = fra.a(d).e(new C5214Poa(this)).c().j();
        C7471uYa.a((Object) j2, "playlistOperations.loadP…)\n        .toObservable()");
        return j2;
    }

    /* renamed from: a */
    public APa<List<C5333Toa>> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<List<C5333Toa>> e = APa.e();
        C7471uYa.a((Object) e, "Observable.empty()");
        return e;
    }
}
