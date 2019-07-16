package com.soundcloud.android.stream;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import com.soundcloud.android.ads.gd;
import com.soundcloud.android.ads.od;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.f;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.ke;
import com.soundcloud.android.stream.rb.b;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.upsell.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: StreamPresenter.kt */
public final class ib extends C7589wEa<sb, C6973nJa, RVa, b, rb> {
    /* access modifiers changed from: private */
    public final C6115ya l;
    /* access modifiers changed from: private */
    public final Z m;
    /* access modifiers changed from: private */
    public final C6093n n;
    /* access modifiers changed from: private */
    public final gd o;
    /* access modifiers changed from: private */
    public final C6070ba p;
    /* access modifiers changed from: private */
    public final C4655rja q;
    /* access modifiers changed from: private */
    public final C3700b r;
    private final C3240rR s;
    private final od t;
    private final ke u;
    private final a v;
    private final Yaa w;
    private final Db x;
    private final HPa y;

    public ib(C6115ya yaVar, Z z, C6093n nVar, gd gdVar, C6070ba baVar, C4655rja rja, C3700b bVar, C3240rR rRVar, od odVar, ke keVar, a aVar, Yaa yaa, Db db, HPa hPa) {
        C7471uYa.b(yaVar, "streamOperations");
        C7471uYa.b(z, "streamDataSource");
        C7471uYa.b(nVar, "imagePauseOnScrollListener");
        C7471uYa.b(gdVar, "streamAdsController");
        C7471uYa.b(baVar, "streamDepthConsumer");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(rRVar, "followingOperations");
        C7471uYa.b(odVar, "whyAdsDialogPresenter");
        C7471uYa.b(keVar, "videoSurfaceProvider");
        C7471uYa.b(aVar, "upsellOperations");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = yaVar;
        this.m = z;
        this.n = nVar;
        this.o = gdVar;
        this.p = baVar;
        this.q = rja;
        this.r = bVar;
        this.s = rRVar;
        this.t = odVar;
        this.u = keVar;
        this.v = aVar;
        this.w = yaa;
        this.x = db;
        this.y = hPa;
    }

    /* access modifiers changed from: private */
    public final void f() {
        C4655rja rja = this.q;
        C4621nja a = C4621nja.a(C3920yea.GENERAL);
        C7471uYa.a((Object) a, "NavigationTarget.forUpgrade(UpsellContext.GENERAL)");
        rja.a(a);
        C3700b bVar = this.r;
        Waa b = Waa.b(h.UPSELL_HEADER_FROM_STREAM);
        C7471uYa.a((Object) b, "UpgradeFunnelEvent.forUp…PSELL_HEADER_FROM_STREAM)");
        bVar.a((J) b);
    }

    /* access modifiers changed from: private */
    public final void g() {
        C4655rja rja = this.q;
        C4621nja a = C4621nja.a(C3920yea.PREMIUM_CONTENT);
        C7471uYa.a((Object) a, "NavigationTarget.forUpgr…lContext.PREMIUM_CONTENT)");
        rja.a(a);
        C3700b bVar = this.r;
        Waa K = Waa.K();
        C7471uYa.a((Object) K, "UpgradeFunnelEvent.forStreamClick()");
        bVar.a((J) K);
    }

    /* access modifiers changed from: private */
    public final void h() {
        C3700b bVar = this.r;
        Waa L = Waa.L();
        C7471uYa.a((Object) L, "UpgradeFunnelEvent.forStreamImpression()");
        bVar.a((J) L);
    }

    /* access modifiers changed from: private */
    public final void i() {
        this.v.c();
    }

    private final APa<List<C6109va>> b(rb rbVar) {
        APa<List<C6109va>> a = APa.a((EPa<? extends T1>) c().h(Za.a).a((C7256rQa<? super T>) _a.a), (EPa<? extends T2>) rbVar.pa().a((C7256rQa<? super T>) Xa.a), (C6504gQa<? super T1, ? super T2, ? extends R>) Ya.a);
        C7471uYa.a((Object) a, "Observable.combineLatest…tems, _ -> streamItems })");
        return a;
    }

    private final List<u> c(List<? extends C6109va> list) {
        u uVar;
        ArrayList arrayList = new ArrayList();
        for (C6109va vaVar : list) {
            if (vaVar instanceof tb) {
                tb tbVar = (tb) vaVar;
                uVar = u.a(tbVar.n(), tbVar.m().y());
            } else if (vaVar instanceof C6102s) {
                C6102s sVar = (C6102s) vaVar;
                uVar = u.a(sVar.n(), sVar.k().y());
            } else {
                uVar = null;
            }
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    private final PromotedSourceInfo b(C3855qda qda) {
        PromotedSourceInfo.a aVar = PromotedSourceInfo.a;
        C3508cda a = qda.a();
        C3879tda t2 = qda.t();
        if (t2 != null) {
            return aVar.a(a, t2);
        }
        C7471uYa.a();
        throw null;
    }

    private final IPa<List<u>> b(List<? extends C6109va> list) {
        IPa<List<u>> a = this.m.a().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new hb<Object,Object>(list));
        C7471uYa.a((Object) a, "streamDataSource.playabl…)\n            }\n        }");
        return a;
    }

    /* access modifiers changed from: private */
    public final PXa<APa<d<C6973nJa, sb>>> b(sb sbVar) {
        APa a = this.m.a(sbVar.b());
        if (a != null) {
            return new db(a, this);
        }
        return null;
    }

    public void a(rb rbVar) {
        C7471uYa.b(rbVar, "view");
        super.a(rbVar);
        UPa b = b();
        _Ua _ua = _Ua.a;
        b.a(APa.a((EPa<? extends T1>) rbVar.pa(), (EPa<? extends T2>) rbVar.va(), (C6504gQa<? super T1, ? super T2, ? extends R>) new Ea<Object,Object,Object>()).f((C6776kQa<? super T>) new Pa<Object>(this)), b(rbVar).d((C7118pQa<? super T, ? extends C7255rPa>) new Qa<Object,Object>(this)).g(), rbVar.pa().f((C6776kQa<? super T>) new Ra<Object>(this)), rbVar.za().f((C6776kQa<? super T>) new Sa<Object>(this)), rbVar.La().f((C6776kQa<? super T>) new Ta<Object>(this)), rbVar.l().d((C6776kQa<? super T>) new Ua<Object>(this)).m(new Va(this)).f((C6776kQa<? super T>) new Wa<Object>(rbVar)), rbVar.k().d((C6776kQa<? super T>) new Fa<Object>(this)).h(new Ga(this)).f((C6776kQa<? super T>) new Ha<Object>(this)), rbVar.ya().f((C6776kQa<? super T>) new Ia<Object>(this)), rbVar.Ra().f((C6776kQa<? super T>) new Ja<Object>(this)), rbVar.ua().f((C6776kQa<? super T>) new Ka<Object>(this)), rbVar.ra().f((C6776kQa<? super T>) new La<Object>(this)), rbVar.Ca().f((C6776kQa<? super T>) new Ma<Object>(this)), rbVar.pa().f((C6776kQa<? super T>) new Na<Object>(this)), APa.b((EPa<? extends T>) this.s.a(), (EPa<? extends T>) this.s.b()).f((C6776kQa<? super T>) new Oa<Object>(this)));
    }

    /* access modifiers changed from: private */
    public final void a(C6102s sVar) {
        if (sVar.h()) {
            C3700b bVar = this.r;
            Qaa a = Qaa.a(sVar.n(), sVar.f(), Yca.STREAM.a());
            C7471uYa.a((Object) a, "PromotedTrackingEvent.fo…ies, Screen.STREAM.get())");
            bVar.a((J) a);
        }
    }

    /* access modifiers changed from: private */
    public final void a(tb tbVar) {
        if (tbVar.h()) {
            C3700b bVar = this.r;
            Qaa a = Qaa.a(tbVar.n(), tbVar.m().t(), Yca.STREAM.a());
            C7471uYa.a((Object) a, "PromotedTrackingEvent.fo…s(), Screen.STREAM.get())");
            bVar.a((J) a);
        }
    }

    public void a() {
        this.n.a();
        this.o.e();
        super.a();
    }

    /* access modifiers changed from: private */
    public final C4621nja a(C3863rda rda) {
        C3508cda a = rda.a();
        Yca yca = Yca.STREAM;
        C4928GKa a2 = C4928GKa.a();
        C4928GKa a3 = a((Wca) rda);
        f fVar = K.a;
        C3508cda a4 = rda.a();
        C7471uYa.a((Object) a4, "playlistItem.urn");
        C4621nja a5 = C4621nja.a(a, yca, a2, a3, C4928GKa.c(fVar.e(a4, a((C3855qda) rda))));
        C7471uYa.a((Object) a5, "NavigationTarget.forPlay…playlistItem)))\n        )");
        return a5;
    }

    private final C3710l a(C3855qda qda) {
        String a = Yca.STREAM.a();
        C7471uYa.a((Object) a, "Screen.STREAM.get()");
        p pVar = p.SELF;
        C3508cda cda = C3508cda.a;
        C7471uYa.a((Object) cda, "Urn.NOT_SET");
        return C5672bua.a(qda, a, null, pVar, cda);
    }

    private final C4928GKa<PromotedSourceInfo> a(Wca wca) {
        C4928GKa<PromotedSourceInfo> gKa;
        String str;
        if (wca instanceof C3855qda) {
            C3855qda qda = (C3855qda) wca;
            if (qda.n()) {
                gKa = C4928GKa.c(b(qda));
                str = "Optional.of(promotedSourceInfoFromPlayable(item))";
                C7471uYa.a((Object) gKa, str);
                return gKa;
            }
        }
        gKa = C4928GKa.a();
        str = "Optional.absent()";
        C7471uYa.a((Object) gKa, str);
        return gKa;
    }

    /* access modifiers changed from: private */
    public final IPa<C4536zc> a(ub ubVar) {
        tb c = ubVar.c();
        C6185ma m2 = c.m();
        PlaySessionSource playSessionSource = new PlaySessionSource(Yca.STREAM.a());
        String str = "trackItem.urn";
        if (c.h()) {
            PromotedSourceInfo.a aVar = PromotedSourceInfo.a;
            C3508cda a = m2.a();
            C7471uYa.a((Object) a, str);
            C3879tda t2 = m2.t();
            if (t2 != null) {
                playSessionSource.a(aVar.a(a, t2));
            } else {
                C7471uYa.a();
                throw null;
            }
        }
        Db db = this.x;
        IPa a2 = a(ubVar.b());
        C3508cda a3 = m2.a();
        C7471uYa.a((Object) a3, str);
        return db.a(a2, a3, ubVar.a(), playSessionSource);
    }

    private final IPa<List<u>> a(List<? extends C6109va> list) {
        C5573aVa ava = C5573aVa.a;
        IPa a = IPa.a(c(list));
        C7471uYa.a((Object) a, "just(visibleItems.toPlayableItems())");
        IPa<List<u>> a2 = IPa.a((MPa<? extends T1>) a, (MPa<? extends T2>) b(list), (C6504gQa<? super T1, ? super T2, ? extends R>) new Da<Object,Object,Object>());
        C7471uYa.a((Object) a2, "Single.zip(s1, s2, BiFun…-> zipper.invoke(t, u) })");
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, sb>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa a = Z.a(this.m, false, 1, null).a(RPa.a()).a((DPa<? extends R, ? super T>) new C7500uua<Object,Object>(new ab(this)));
        C7471uYa.a((Object) a, "streamDataSource.initial…Controller.insertAds() })");
        return C7594wJa.a(a, new bb(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, sb>> c(b bVar) {
        C7471uYa.b(bVar, "refreshType");
        APa a = IPa.a(bVar).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new eb<Object,Object>(this)).a(RPa.a()).a((DPa<? extends R, ? super T>) new C7500uua<Object,Object>(new fb(this)));
        C7471uYa.a((Object) a, "just(refreshType).flatMa…Controller.insertAds() })");
        return C7594wJa.a(a, new gb(this));
    }

    /* access modifiers changed from: protected */
    public APa<sb> a(sb sbVar) {
        C7471uYa.b(sbVar, "domainModel");
        APa<sb> c = APa.c(sbVar);
        C7471uYa.a((Object) c, "Observable.just(domainModel)");
        return c;
    }

    /* access modifiers changed from: protected */
    public sb a(sb sbVar, sb sbVar2) {
        C7471uYa.b(sbVar, "firstPage");
        C7471uYa.b(sbVar2, "nextPage");
        return new sb(C7676xWa.c((Collection) sbVar.b(), (Iterable) sbVar2.b()), sbVar.a());
    }

    /* access modifiers changed from: private */
    public final void a(C3676c cVar) {
        HVa hVa;
        C3676c cVar2 = cVar;
        if (cVar2 instanceof C3692t) {
            C3692t tVar = (C3692t) cVar2;
            hVa = NVa.a(C3416DZ.a(tVar, this.w), tVar.m());
        } else if (cVar2 instanceof aa) {
            aa aaVar = (aa) cVar2;
            Yaa yaa = this.w;
            String a = Yca.STREAM.a();
            C7471uYa.a((Object) a, "Screen.STREAM.get()");
            I i = r3;
            I i2 = new I(a, true, null, null, null, null, null, null, null, null, null, 0, null, 8188, null);
            hVa = NVa.a(C3416DZ.a(aaVar, yaa, i), aaVar.c());
        } else {
            hVa = null;
        }
        if (hVa != null) {
            K k = (K) hVa.a();
            String str = (String) hVa.b();
            this.r.a((J) k);
            C4655rja rja = this.q;
            C4621nja a2 = C4621nja.a(str);
            C7471uYa.a((Object) a2, "NavigationTarget.forAdClickthrough(url)");
            rja.a(a2);
        }
    }

    /* access modifiers changed from: private */
    public final void a(Context context) {
        this.t.a(context);
    }

    /* access modifiers changed from: private */
    public final void a(TextureView textureView, View view, aa aaVar) {
        if (!this.o.c()) {
            this.u.a(aaVar.I(), ke.b.STREAM, textureView, view);
        }
    }

    /* access modifiers changed from: private */
    public final void a(aa aaVar) {
        this.o.h();
        C4655rja rja = this.q;
        C4621nja b = C4621nja.b(aaVar.f());
        C7471uYa.a((Object) b, "NavigationTarget.forFull…eenVideoAd(videoAd.adUrn)");
        rja.a(b);
    }
}
