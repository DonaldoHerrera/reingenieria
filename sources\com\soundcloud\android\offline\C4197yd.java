package com.soundcloud.android.offline;

import android.os.Bundle;
import com.soundcloud.android.collection.Aa;
import com.soundcloud.android.sync.T;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.soundcloud.android.offline.yd reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
public class C4197yd {
    private final C4118ke a;
    private final C4186wc b;
    /* access modifiers changed from: private */
    public final Kc c;
    /* access modifiers changed from: private */
    public final C5327TLa d;
    private final Gd e;
    /* access modifiers changed from: private */
    public final C6334dta f;
    private final C4163sc g;
    /* access modifiers changed from: private */
    public final C4175uc h;
    /* access modifiers changed from: private */
    public final Yd i;
    private final C2248QR j;
    /* access modifiers changed from: private */
    public final Aa k;
    /* access modifiers changed from: private */
    public final T l;
    /* access modifiers changed from: private */
    public final De m;
    private final C1938AS n;
    private final HPa o;
    /* access modifiers changed from: private */
    public final Fea p;
    /* access modifiers changed from: private */
    public final C4088fe q;
    /* access modifiers changed from: private */
    public final Se r;
    /* access modifiers changed from: private */
    public final Vb s;
    /* access modifiers changed from: private */
    public final Qb t;

    public C4197yd(C4118ke keVar, C4186wc wcVar, Kc kc, C5327TLa tLa, Gd gd, C6334dta dta, C4163sc scVar, C4175uc ucVar, Yd yd, C2248QR qr, Aa aa, T t2, De de, C1938AS as, HPa hPa, Fea fea, C4088fe feVar, Se se, Vb vb, Qb qb) {
        C4118ke keVar2 = keVar;
        C4186wc wcVar2 = wcVar;
        Kc kc2 = kc;
        C5327TLa tLa2 = tLa;
        Gd gd2 = gd;
        C6334dta dta2 = dta;
        C4163sc scVar2 = scVar;
        C4175uc ucVar2 = ucVar;
        Yd yd2 = yd;
        C2248QR qr2 = qr;
        Aa aa2 = aa;
        T t3 = t2;
        De de2 = de;
        C1938AS as2 = as;
        HPa hPa2 = hPa;
        Fea fea2 = fea;
        C7471uYa.b(keVar2, "publisher");
        C7471uYa.b(wcVar2, "loadTracksWithStalePolicies");
        C7471uYa.b(kc2, "offlineContentClearer");
        C7471uYa.b(tLa2, "eventBus");
        C7471uYa.b(gd2, "offlineContentStorage");
        C7471uYa.b(dta2, "policyOperations");
        C7471uYa.b(scVar2, "loadExpectedContentCommand");
        C7471uYa.b(ucVar2, "loadOfflineContentUpdatesCommand");
        C7471uYa.b(yd2, "serviceInitiator");
        C7471uYa.b(qr2, "backgroundJobManager");
        C7471uYa.b(aa2, "collectionSyncer");
        C7471uYa.b(t3, "syncInitiator");
        C7471uYa.b(de2, "tracksStorage");
        C7471uYa.b(as2, "myPlaylistsOperations");
        C7471uYa.b(hPa2, "scheduler");
        C7471uYa.b(fea, "introductoryOverlayOperations");
        C7471uYa.b(feVar, "offlineSettingsStorage");
        C7471uYa.b(se, "trackOfflineStateProvider");
        C7471uYa.b(vb, "downloadOperations");
        C7471uYa.b(qb, "offlineLogger");
        Fea fea3 = fea;
        this.a = keVar2;
        this.b = wcVar2;
        this.c = kc2;
        this.d = tLa2;
        this.e = gd2;
        this.f = dta2;
        this.g = scVar2;
        this.h = ucVar2;
        this.i = yd2;
        this.j = qr2;
        this.k = aa2;
        this.l = t3;
        this.m = de2;
        this.n = as2;
        this.o = hPa;
        this.p = fea3;
        Se se2 = se;
        this.q = feVar;
        this.r = se2;
        Qb qb2 = qb;
        this.s = vb;
        this.t = qb2;
    }

    /* access modifiers changed from: private */
    public void p() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("BUNDLE_FOR_CLEANUP", true);
        this.j.a(C2286SR.RETRY_OFFLINE_SYNC, bundle);
    }

    /* access modifiers changed from: private */
    public C6979nPa q() {
        C1938AS as = this.n;
        C3871sda sda = new C3871sda(C3911xda.ADDED_AT, true, true, false, 8, null);
        C6979nPa b2 = as.a(sda).g().e(C4170td.a).b((C7118pQa<? super T, ? extends C7255rPa>) new C4202zd<Object,Object>(new C4176ud(this.e)));
        C7471uYa.a((Object) b2, "myPlaylistsOperations.my…e::resetOfflinePlaylists)");
        return b2;
    }

    private C6979nPa r() {
        C6979nPa f2 = m().f();
        C7471uYa.a((Object) f2, "updateOfflineContentStal…icies().onErrorComplete()");
        return f2;
    }

    private IPa<?> n() {
        return a(C3823mda.NOT_OFFLINE);
    }

    private IPa<?> o() {
        return a(C3823mda.REQUESTED);
    }

    public C6979nPa c(List<C3508cda> list) {
        C7471uYa.b(list, "playlistUrns");
        C6979nPa f2 = this.e.f(list);
        C5327TLa tLa = this.d;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        C6979nPa b2 = f2.a(tLa.b(xLa, Laa.a(list))).a((C6368eQa) new C4135nd(this, list)).b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage\n  …  .subscribeOn(scheduler)");
        return b2;
    }

    public C6979nPa d() {
        C6979nPa j2 = this.e.j();
        C5327TLa tLa = this.d;
        C5443XLa<Hc> xLa = C3876taa.u;
        C7471uYa.a((Object) xLa, "EventQueue.OFFLINE_CONTENT_CHANGED");
        C6979nPa b2 = j2.a(tLa.b(xLa, Hc.a(true))).a((C6368eQa) new Tc(this)).b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage.re…  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<RVa> e() {
        IPa<RVa> b2 = this.e.a().b((Callable<? extends T>) Uc.a).b((C7118pQa<? super T, ? extends C7255rPa>) new Vc<Object,Object>(this)).a((C6368eQa) new Wc(this)).b((Callable<? extends T>) Xc.a).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Yc<Object,Object>(this)).e(Zc.a).b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage\n  …  .subscribeOn(scheduler)");
        return b2;
    }

    public C6979nPa f() {
        C6979nPa b2 = this.e.a().a((C6368eQa) new _c(this)).b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage.ad…  .subscribeOn(scheduler)");
        return b2;
    }

    public APa<Boolean> g() {
        APa j2 = k().j();
        C5327TLa tLa = this.d;
        C5443XLa<Hc> xLa = C3876taa.u;
        C7471uYa.a((Object) xLa, "EventQueue.OFFLINE_CONTENT_CHANGED");
        APa<Boolean> a2 = j2.a((EPa<? extends T>) tLa.a(xLa).a((C7256rQa<? super T>) C4111jd.a).h(C4117kd.a));
        C7471uYa.a((Object) a2, "isOfflineLikedTracksEnab…flineState.NOT_OFFLINE })");
        return a2;
    }

    public boolean h() {
        return this.q.g();
    }

    public IPa<Boolean> i() {
        IPa<Boolean> e2 = r().a((MPa<T>) this.g.c()).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4057ad<Object,Object>(this)).b(this.o).c((C6776kQa<? super T>) new C4063bd<Object>(this)).e(C4069cd.a);
        C7471uYa.a((Object) e2, "tryToUpdatePolicies()\n  … .map { it.hasChanges() }");
        return e2;
    }

    public boolean j() {
        Boolean j2 = this.q.j();
        C7471uYa.a((Object) j2, "offlineSettingsStorage.isOfflineCollectionEnabled");
        return j2.booleanValue();
    }

    public IPa<Boolean> k() {
        IPa<Boolean> b2 = this.e.c().b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage.is…ed.subscribeOn(scheduler)");
        return b2;
    }

    public IPa<Id> l() {
        IPa<Id> b2 = r().a((MPa<T>) this.g.c()).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4075dd<Object,Object>(this)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4081ed<Object,Object>(this)).b(this.o);
        C7471uYa.a((Object) b2, "tryToUpdatePolicies()\n  …  .subscribeOn(scheduler)");
        return b2;
    }

    public C6979nPa m() {
        C6979nPa b2 = this.b.a().b((C7118pQa<? super T, ? extends C7255rPa>) new C4192xd<Object,Object>(this)).b(this.o);
        C7471uYa.a((Object) b2, "loadTracksWithStalePolic…  .subscribeOn(scheduler)");
        return b2;
    }

    public void b() {
        this.q.m();
    }

    public IPa<Boolean> a(C3508cda cda) {
        C7471uYa.b(cda, "playlist");
        IPa<Boolean> b2 = this.e.a(cda).b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage.is…t).subscribeOn(scheduler)");
        return b2;
    }

    public C6979nPa b(C3508cda cda) {
        C7471uYa.b(cda, "playlist");
        return a(C6850lWa.a(cda));
    }

    /* access modifiers changed from: private */
    public C6979nPa b(C3508cda cda, C3508cda cda2) {
        C6979nPa a2 = this.e.d(C6850lWa.a(cda)).a((C7255rPa) c(C6850lWa.a(cda2)).a((C6368eQa) new C4123ld(this)));
        C7471uYa.a((Object) a2, "offlineContentStorage.re…dUpdate() }\n            )");
        return a2;
    }

    public C6979nPa a(List<C3508cda> list) {
        C7471uYa.b(list, "playlistUrns");
        C6979nPa a2 = c(list).a((C6368eQa) new C4087fd(this));
        C7471uYa.a((Object) a2, "preparePlaylistsForOffli…startFromUserConsumer() }");
        return a2;
    }

    private C6979nPa d(List<C3508cda> list) {
        C6979nPa a2 = b(list).a((C6368eQa) new C4093gd(this));
        C7471uYa.a((Object) a2, "preparePlaylistsForOffli…startFromUserConsumer() }");
        return a2;
    }

    public C6979nPa a(C3508cda cda, C3508cda cda2) {
        C7471uYa.b(cda, "toReplace");
        C7471uYa.b(cda2, "updatedPlaylist");
        C6979nPa b2 = a(cda).a((C7256rQa<? super T>) C4141od.a).b((C7118pQa<? super T, ? extends C7255rPa>) new C4147pd<Object,Object>(this, cda, cda2));
        C7471uYa.a((Object) b2, "isOfflinePlaylist(toRepl…place, updatedPlaylist) }");
        return b2;
    }

    public C6979nPa c(C3508cda cda) {
        C7471uYa.b(cda, "playlistUrn");
        return d(C6850lWa.a(cda));
    }

    public IPa<RVa> c() {
        IPa<RVa> c2 = a().c((C6776kQa<? super T>) new Sc<Object>(this));
        C7471uYa.a((Object) c2, "clearOfflineContent()\n  …ableOfflineCollection() }");
        return c2;
    }

    public C6979nPa b(List<C3508cda> list) {
        C7471uYa.b(list, "playlistUrns");
        C6979nPa d2 = this.e.d(list);
        C5327TLa tLa = this.d;
        C5443XLa<Jaa> xLa = C3876taa.q;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYLIST_CHANGED");
        C6979nPa a2 = d2.a(tLa.b(xLa, Laa.b(list)));
        C5327TLa tLa2 = this.d;
        C5443XLa<Hc> xLa2 = C3876taa.u;
        C7471uYa.a((Object) xLa2, "EventQueue.OFFLINE_CONTENT_CHANGED");
        C6979nPa b2 = a2.a(tLa2.b(xLa2, Hc.a((Collection<C3508cda>) list))).a((C6368eQa) new C4129md(this)).b(this.o);
        C7471uYa.a((Object) b2, "offlineContentStorage\n  …  .subscribeOn(scheduler)");
        return b2;
    }

    public IPa<RVa> a() {
        IPa<RVa> b2 = n().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Pc<Object,Object>(this)).c((C6776kQa<? super T>) new Qc<Object>(this)).e(Rc.a).b(this.o);
        C7471uYa.a((Object) b2, "notifyOfflineContentRemo…  .subscribeOn(scheduler)");
        return b2;
    }

    public static /* synthetic */ C6979nPa a(C4197yd ydVar, Oc oc, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                oc = null;
            }
            return ydVar.a(oc);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resetOfflineContent");
    }

    public C6979nPa a(Oc oc) {
        C6979nPa b2 = o().b((C7118pQa<? super T, ? extends C7255rPa>) new C4158rd<Object,Object>(this, oc)).a((C6368eQa) new C4164sd(this)).b(this.o);
        C7471uYa.a((Object) b2, "notifyOfflineContentRequ…  .subscribeOn(scheduler)");
        return b2;
    }

    private IPa<?> a(C3823mda mda) {
        IPa<?> c2 = IPa.a((MPa<? extends T1>) this.e.b(), (MPa<? extends T2>) k(), (C6504gQa<? super T1, ? super T2, ? extends R>) new C4099hd<Object,Object,Object>(mda)).c((C6776kQa<? super T>) new C4105id<Object>(this));
        C7471uYa.a((Object) c2, "Single.zip<List<Urn>, Bo…CONTENT_CHANGED, event) }");
        return c2;
    }

    /* access modifiers changed from: private */
    public IPa<Id> b(Id id) {
        IPa<Id> b2 = this.m.a(id).a((C6368eQa) new C4182vd(this, id)).b((Callable<? extends T>) new C4187wd<Object>(id));
        C7471uYa.a((Object) b2, "tracksStorage.writeUpdat…{ offlineContentUpdates }");
        return b2;
    }

    /* access modifiers changed from: private */
    public void a(Id id) {
        this.a.a(id.i());
        this.a.b((Collection<C3508cda>) id.f());
        this.a.a((Collection<C3508cda>) id.g());
        this.a.d((Collection<C3508cda>) id.h());
    }

    public void a(boolean z) {
        this.q.a(z);
    }
}
