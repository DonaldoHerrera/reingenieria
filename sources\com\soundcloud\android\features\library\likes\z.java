package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.features.library.likes.search.C3609e;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.likes.C4001z;
import com.soundcloud.android.likes.V;
import com.soundcloud.android.likes.la;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4106ie;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

@EVa(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 E2 \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001EB\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0001\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\u000e\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+H\u0012J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005H\u0016J\u0010\u00100\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005H\u0012J\u0010\u00101\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0005H\u0012J&\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020+2\u0006\u00103\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105J&\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020+2\u0006\u00103\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b7\u00105J$\u00108\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020+2\f\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u0002H\u0012J\u000e\u0010;\u001a\b\u0012\u0004\u0012\u00020<0+H\u0012J\u0010\u0010=\u001a\u00020,2\u0006\u0010;\u001a\u00020<H\u0012J\u0010\u0010>\u001a\u00020,2\u0006\u0010;\u001a\u00020<H\u0012J*\u0010?\u001a\b\u0012\u0004\u0012\u00020@0+*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020B\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00020A0+H\u0016J\f\u0010C\u001a\u00020D*\u00020'H\u0012R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00020&X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000ø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006F"}, d2 = {"Lcom/soundcloud/android/features/library/likes/TrackLikesPresenter;", "Lcom/soundcloud/android/view/collection/LegacySimplePresenter;", "", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "Lcom/soundcloud/android/features/library/likes/TrackLikesParams;", "Lcom/soundcloud/android/features/library/likes/TrackLikesView;", "trackLikeOperations", "Lcom/soundcloud/android/likes/TrackLikeOperations;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "offlineContentOperations", "Lcom/soundcloud/android/offline/OfflineContentOperations;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "offlineStateOperations", "Lcom/soundcloud/android/offline/OfflineStateOperations;", "offlineSettings", "Lcom/soundcloud/android/offline/OfflineSettingsOperations;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "playbackInitiator", "Lcom/soundcloud/android/playback/PlaybackInitiator;", "expandPlayerCommand", "Lcom/soundcloud/android/playback/ExpandPlayerCommand;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "offlineSettingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "offlinePropertiesProvider", "Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "trackLikesDataSource", "Lcom/soundcloud/android/features/library/likes/search/LikesDataSource;", "(Lcom/soundcloud/android/likes/TrackLikeOperations;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/offline/OfflineContentOperations;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/offline/OfflineStateOperations;Lcom/soundcloud/android/offline/OfflineSettingsOperations;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/playback/PlaybackInitiator;Lcom/soundcloud/android/playback/ExpandPlayerCommand;Lcom/soundcloud/android/navigation/Navigator;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;Lio/reactivex/Scheduler;Lcom/soundcloud/android/features/library/likes/search/LikesDataSource;)V", "autoPlaySubject", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "getAutoPlaySubject", "()Lcom/jakewharton/rxrelay2/PublishRelay;", "areLikesOfflineSynced", "Lio/reactivex/Observable;", "", "attachView", "", "view", "disableOfflineLikes", "enableOfflineLikes", "legacyLoad", "pageParams", "legacyLoad-qbA5obo", "(Z)Lio/reactivex/Observable;", "legacyRefresh", "legacyRefresh-qbA5obo", "likesToHeaders", "trackItems", "Lcom/soundcloud/android/tracks/TrackItem;", "offlineState", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "shouldShowNoConnectionOfflineState", "shouldShowNoWifiOfflineState", "clicksToPlaybackResult", "Lcom/soundcloud/android/playback/PlaybackResult;", "Lkotlin/Pair;", "", "toPlayableWithReposter", "Lcom/soundcloud/android/foundation/playqueue/PlayableWithReposter;", "Companion", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesPresenter.kt */
public class z extends C7318sJa<List<? extends la>, y, y, T> {
    public static final a l = new a(null);
    private final HPa A;
    private final C3609e B;
    private final C2332VH<List<V>> m;
    /* access modifiers changed from: private */
    public final C4001z n;
    /* access modifiers changed from: private */
    public final C2436_U o;
    private final C4197yd p;
    private final C5327TLa q;
    private final C4106ie r;
    private final C4070ce s;
    private final C6834lGa t;
    /* access modifiers changed from: private */
    public final Db u;
    private final C4425ta v;
    /* access modifiers changed from: private */
    public final C4655rja w;
    private final C4088fe x;
    /* access modifiers changed from: private */
    public final C3700b y;
    private final C3815lda z;

    /* compiled from: TrackLikesPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public z(C4001z zVar, C2436_U _u, C4197yd ydVar, C5327TLa tLa, C4106ie ieVar, C4070ce ceVar, C6834lGa lga, Db db, C4425ta taVar, C4655rja rja, C4088fe feVar, C3700b bVar, C3815lda lda, HPa hPa, C3609e eVar) {
        C4001z zVar2 = zVar;
        C2436_U _u2 = _u;
        C4197yd ydVar2 = ydVar;
        C5327TLa tLa2 = tLa;
        C4106ie ieVar2 = ieVar;
        C4070ce ceVar2 = ceVar;
        C6834lGa lga2 = lga;
        Db db2 = db;
        C4425ta taVar2 = taVar;
        C4655rja rja2 = rja;
        C4088fe feVar2 = feVar;
        C3700b bVar2 = bVar;
        C3815lda lda2 = lda;
        HPa hPa2 = hPa;
        C3609e eVar2 = eVar;
        C7471uYa.b(zVar2, "trackLikeOperations");
        C7471uYa.b(_u2, "featureOperations");
        C7471uYa.b(ydVar2, "offlineContentOperations");
        C7471uYa.b(tLa2, "eventBus");
        C7471uYa.b(ieVar2, "offlineStateOperations");
        C7471uYa.b(ceVar2, "offlineSettings");
        C7471uYa.b(lga2, "connectionHelper");
        C7471uYa.b(db2, "playbackInitiator");
        C7471uYa.b(taVar2, "expandPlayerCommand");
        C7471uYa.b(rja2, "navigator");
        C7471uYa.b(feVar2, "offlineSettingsStorage");
        C7471uYa.b(bVar2, "analytics");
        C7471uYa.b(lda2, "offlinePropertiesProvider");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        C7471uYa.b(eVar2, "trackLikesDataSource");
        super(hPa2);
        this.n = zVar2;
        this.o = _u2;
        this.p = ydVar2;
        this.q = tLa2;
        this.r = ieVar2;
        this.s = ceVar2;
        this.t = lga2;
        this.u = db2;
        this.v = taVar2;
        this.w = rja2;
        this.x = feVar2;
        this.y = bVar2;
        this.z = lda2;
        this.A = hPa2;
        this.B = eVar2;
        C2332VH<List<V>> s2 = C2332VH.s();
        C7471uYa.a((Object) s2, "PublishRelay.create()");
        this.m = s2;
    }

    private APa<C3823mda> h() {
        if (this.o.l()) {
            APa<C3823mda> a2 = this.z.d().h(P.a).d().d((EPa<? extends T>) this.r.b().j()).a(this.A);
            C7471uYa.a((Object) a2, "offlinePropertiesProvide…veOn(mainThreadScheduler)");
            return a2;
        }
        APa<C3823mda> c = APa.c(C3823mda.NOT_OFFLINE);
        C7471uYa.a((Object) c, "Observable.just(OfflineState.NOT_OFFLINE)");
        return c;
    }

    public /* bridge */ /* synthetic */ APa f(Object obj) {
        return a(((y) obj).a());
    }

    public /* bridge */ /* synthetic */ APa g(Object obj) {
        return b(((y) obj).a());
    }

    /* access modifiers changed from: private */
    public void c(T t2) {
        if (this.x.k()) {
            t2.la();
        } else {
            t2.da();
        }
    }

    private APa<Boolean> g() {
        if (this.o.l()) {
            APa<Boolean> a2 = this.p.g().a(this.A);
            C7471uYa.a((Object) a2, "offlineContentOperations…veOn(mainThreadScheduler)");
            return a2;
        }
        APa<Boolean> c = APa.c(Boolean.valueOf(false));
        C7471uYa.a((Object) c, "Observable.just(false)");
        return c;
    }

    public C2332VH<List<V>> f() {
        return this.m;
    }

    public APa<List<la>> b(boolean z2) {
        APa<List<la>> k = this.B.b().k(new N(this));
        C7471uYa.a((Object) k, "trackLikesDataSource.loa…ap { likesToHeaders(it) }");
        return k;
    }

    /* access modifiers changed from: private */
    public boolean b(C3823mda mda) {
        return mda == C3823mda.REQUESTED && this.s.a() && !this.t.a();
    }

    /* access modifiers changed from: private */
    public void b(T t2) {
        t2.U();
    }

    public void a(T t2) {
        C7471uYa.b(t2, "view");
        super.a(t2);
        b().a(APa.a((EPa<? extends T>) a(t2.o()), (EPa<? extends T>) t2.ea().g(new B(this)), (EPa<? extends T>) f().g(new C(this))).f((C6776kQa<? super T>) new Q<Object>(new D(this.v))), t2.Z().f((C6776kQa<? super T>) new E<Object>(this)), t2.aa().d(1).f((C6776kQa<? super T>) new F<Object>(this)), t2.Y().f((C6776kQa<? super T>) new G<Object>(this, t2)), t2.Fa().f((C6776kQa<? super T>) new H<Object>(this)), t2.d().f((C6776kQa<? super T>) new I<Object>(this)), t2.x().f((C6776kQa<? super T>) new J<Object>(this)));
    }

    public APa<List<la>> a(boolean z2) {
        APa<List<la>> h = this.B.b().k(new L(this)).h(new M(this, z2));
        C7471uYa.a((Object) h, "trackLikesDataSource.loa…      model\n            }");
        return h;
    }

    /* access modifiers changed from: private */
    public APa<? extends List<la>> a(List<? extends C6185ma> list) {
        if (list.isEmpty()) {
            APa<? extends List<la>> c = APa.c(C6918mWa.a());
            C7471uYa.a((Object) c, "Observable.just(emptyList())");
            return c;
        }
        _Ua _ua = _Ua.a;
        APa<? extends List<la>> a2 = APa.a((EPa<? extends T1>) g(), (EPa<? extends T2>) h(), (C6504gQa<? super T1, ? super T2, ? extends R>) new O<Object,Object,Object>(this, list));
        C7471uYa.a((Object) a2, "Observables.combineLates…wItem(it) }\n            }");
        return a2;
    }

    public APa<C4536zc> a(APa<HVa<Integer, List<V>>> aPa) {
        C7471uYa.b(aPa, "$this$clicksToPlaybackResult");
        APa<C4536zc> g = aPa.g(new K(this));
        C7471uYa.a((Object) g, "flatMapSingle { (positio…)\n            )\n        }");
        return g;
    }

    /* access modifiers changed from: private */
    public u a(V v2) {
        u a2 = u.a(v2.b().a());
        C7471uYa.a((Object) a2, "PlayableWithReposter.from(trackItem.urn)");
        return a2;
    }

    /* access modifiers changed from: private */
    public boolean a(C3823mda mda) {
        return mda == C3823mda.REQUESTED && !this.t.d();
    }
}
