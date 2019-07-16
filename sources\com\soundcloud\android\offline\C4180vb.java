package com.soundcloud.android.offline;

import android.annotation.SuppressLint;
import com.soundcloud.android.foundation.events.C3707i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ<\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00170\u001bH\u0002J8\u0010\u001c\u001a\u00020\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u0010 \u001a\u00020\u0018H\u0002J4\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00170\u001b0\"2\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170#0\u001eH\u0002J\b\u0010$\u001a\u00020\u0013H\u0016J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130)H\u0002J\u001a\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001e0)H\u0002J(\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001e0)2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170-H\u0002J\u0016\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130\"2\u0006\u0010/\u001a\u00020\u0013H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0002J\u0018\u00101\u001a\u00020\u00132\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020'H\u0002J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\"H\u0016J\b\u00106\u001a\u000207H\u0016J$\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u001e2\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020'H\u0002J\u0018\u00109\u001a\u00020\u00182\u0006\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020'H\u0002J\u000e\u0010:\u001a\b\u0012\u0004\u0012\u00020;0\"H\u0002R\u0010\u0010\u000f\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0011\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00130\u00130\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/soundcloud/android/offline/DefaultOfflinePropertiesProvider;", "Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;", "trackDownloadsStorage", "Lcom/soundcloud/android/offline/TrackDownloadsStorage;", "offlineStateOperations", "Lcom/soundcloud/android/offline/OfflineStateOperations;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "scheduler", "Lio/reactivex/Scheduler;", "sessionProvider", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "offlineContentStorage", "Lcom/soundcloud/android/offline/OfflineContentStorage;", "(Lcom/soundcloud/android/offline/TrackDownloadsStorage;Lcom/soundcloud/android/offline/OfflineStateOperations;Lcom/soundcloud/rx/eventbus/EventBus;Lio/reactivex/Scheduler;Lcom/soundcloud/android/foundation/accounts/SessionProvider;Lcom/soundcloud/android/offline/OfflineContentStorage;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "subject", "Lio/reactivex/subjects/BehaviorSubject;", "Lcom/soundcloud/android/foundation/domain/offline/OfflineProperties;", "kotlin.jvm.PlatformType", "addPairToMap", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "map", "pair", "Lkotlin/Pair;", "aggregateOfflineProperties", "tracksOfflineStates", "", "playlistOfflineStates", "likedTracksState", "flattenMultimap", "Lio/reactivex/Observable;", "", "latest", "listenToUpdates", "Lio/reactivex/subjects/Subject;", "Lcom/soundcloud/android/offline/OfflineContentChangedEvent;", "loadOfflineStates", "Lio/reactivex/Single;", "loadPlaylistCollectionOfflineStates", "loadPlaylistsOfflineStatesSync", "playlists", "", "loadStateUpdates", "initialProperties", "notifyStateChanges", "reduce", "properties", "event", "smoothStates", "states", "subscribe", "", "updateEntitiesStates", "updateLikedStates", "userSessionStart", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.offline.vb reason: case insensitive filesystem */
/* compiled from: DefaultOfflinePropertiesProvider.kt */
public final class C4180vb implements C3815lda {
    public static final a a = new a(null);
    /* access modifiers changed from: private */
    public final C6713jVa<C3807kda> b;
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c = new UPa();
    private final De d;
    private final C4106ie e;
    private final C5327TLa f;
    private final HPa g;
    private final Ica h;
    private final Gd i;

    /* renamed from: com.soundcloud.android.offline.vb$a */
    /* compiled from: DefaultOfflinePropertiesProvider.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4180vb(De de, C4106ie ieVar, C5327TLa tLa, HPa hPa, Ica ica, Gd gd) {
        C7471uYa.b(de, "trackDownloadsStorage");
        C7471uYa.b(ieVar, "offlineStateOperations");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(ica, "sessionProvider");
        C7471uYa.b(gd, "offlineContentStorage");
        this.d = de;
        this.e = ieVar;
        this.f = tLa;
        this.g = hPa;
        this.h = ica;
        this.i = gd;
        C6713jVa<C3807kda> s = C6713jVa.s();
        C7471uYa.a((Object) s, "BehaviorSubject.create<OfflineProperties>()");
        this.b = s;
    }

    private final C6985nVa<Hc> e() {
        C5327TLa tLa = this.f;
        C5443XLa<Hc> xLa = C3876taa.u;
        C7471uYa.a((Object) xLa, "EventQueue.OFFLINE_CONTENT_CHANGED");
        return tLa.a(xLa);
    }

    private final IPa<C3807kda> f() {
        C5573aVa ava = C5573aVa.a;
        IPa h2 = this.d.h();
        IPa g2 = g();
        IPa a2 = this.e.a();
        C7471uYa.a((Object) a2, "offlineStateOperations.loadLikedTrackState()");
        IPa<C3807kda> a3 = IPa.a((MPa<? extends T1>) h2, (MPa<? extends T2>) g2, (MPa<? extends T3>) a2, (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new C4195yb<Object,Object,Object,Object>(this));
        C7471uYa.a((Object) a3, "Single.zip(s1, s2, s3, F…per.invoke(t1, t2, t3) })");
        return a3;
    }

    private final IPa<Map<C3508cda, C3823mda>> g() {
        IPa<Map<C3508cda, C3823mda>> a2 = this.i.b().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4200zb<Object,Object>(this));
        C7471uYa.a((Object) a2, "offlineContentStorage.of…tsOfflineStatesSync(it) }");
        return a2;
    }

    /* access modifiers changed from: private */
    public final APa<C3807kda> h() {
        APa<C3807kda> b2 = f().j().e(new C3807kda(null, null, 3, null)).k(new Eb(this)).b(this.g);
        C7471uYa.a((Object) b2, "loadOfflineStates()\n    …  .subscribeOn(scheduler)");
        return b2;
    }

    private final APa<Boolean> i() {
        C5327TLa tLa = this.f;
        C5443XLa<C3707i> xLa = C3876taa.i;
        C7471uYa.a((Object) xLa, "EventQueue.CURRENT_USER_CHANGED");
        APa<Boolean> a2 = tLa.a(xLa).h(Ib.a).d((EPa<? extends T>) this.h.a().j()).a((C7256rQa<? super T>) Jb.a);
        C7471uYa.a((Object) a2, "eventBus\n            .qu…ted -> isSessionStarted }");
        return a2;
    }

    public void c() {
        this.c.b(i().k(new Gb(this)).f((C6776kQa<? super T>) new Hb<Object>(this)));
    }

    public APa<C3807kda> d() {
        APa<C3807kda> e2 = this.b.b((C6504gQa<T, T, T>) Fb.a).a(C6911mPa.LATEST).e();
        C7471uYa.a((Object) e2, "subject.scan { obj, newS…gy.LATEST).toObservable()");
        return e2;
    }

    private final C3823mda c(C3807kda kda, Hc hc) {
        if (!hc.c) {
            return kda.a();
        }
        C3823mda mda = hc.a;
        C7471uYa.a((Object) mda, "event.state");
        return mda;
    }

    public APa<C3807kda> b() {
        APa<C3807kda> a2 = d().a(200, TimeUnit.MILLISECONDS);
        C7471uYa.a((Object) a2, "states().debounce(DEBOUN…T, TimeUnit.MILLISECONDS)");
        return a2;
    }

    private final Map<C3508cda, C3823mda> b(C3807kda kda, Hc hc) {
        Map b2 = kda.b();
        Collection<C3508cda> collection = hc.b;
        C7471uYa.a((Object) collection, "event.entities");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (C3508cda a2 : collection) {
            arrayList.add(NVa.a(a2, hc.a));
        }
        return LWa.a(b2, (Iterable) arrayList);
    }

    public C3807kda a() {
        C3807kda kda = (C3807kda) this.b.t();
        return kda != null ? kda : new C3807kda(null, null, 3, null);
    }

    /* access modifiers changed from: private */
    public final APa<C3807kda> a(C3807kda kda) {
        APa<C3807kda> b2 = e().b(kda, (C6504gQa<R, ? super T, R>) new Db<R,Object,R>(this));
        C7471uYa.a((Object) b2, "listenToUpdates().scan(i…uce(properties, event) })");
        return b2;
    }

    /* access modifiers changed from: private */
    public final C3807kda a(C3807kda kda, Hc hc) {
        return new C3807kda(b(kda, hc), c(kda, hc));
    }

    /* access modifiers changed from: private */
    public final C3807kda a(Map<C3508cda, ? extends C3823mda> map, Map<C3508cda, ? extends C3823mda> map2, C3823mda mda) {
        return new C3807kda(LWa.a((Map) map, (Map) map2), mda);
    }

    /* access modifiers changed from: private */
    public final IPa<Map<C3508cda, C3823mda>> a(List<C3508cda> list) {
        if (list.isEmpty()) {
            IPa<Map<C3508cda, C3823mda>> a2 = IPa.a(LWa.a());
            C7471uYa.a((Object) a2, "Single.just(emptyMap())");
            return a2;
        }
        IPa<Map<C3508cda, C3823mda>> e2 = this.e.c(list).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new Ab<Object,Object>(this)).b(new HashMap(), (C6504gQa<R, ? super T, R>) new Bb<R,Object,R>(this)).j().e(Cb.a);
        C7471uYa.a((Object) e2, "offlineStateOperations.l…rror().map { it.toMap() }");
        return e2;
    }

    /* access modifiers changed from: private */
    public final APa<HVa<C3823mda, C3508cda>> a(Map<C3823mda, ? extends Collection<C3508cda>> map) {
        APa<HVa<C3823mda, C3508cda>> k = APa.a((Iterable<? extends T>) map.entrySet()).k(C4190xb.a);
        C7471uYa.a((Object) k, "Observable.fromIterable(…ey to urn }\n            }");
        return k;
    }

    /* access modifiers changed from: private */
    public final Map<C3508cda, C3823mda> a(Map<C3508cda, C3823mda> map, HVa<? extends C3823mda, C3508cda> hVa) {
        map.put(hVa.d(), hVa.c());
        return map;
    }
}
