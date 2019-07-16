package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.offline.C4070ce;
import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4197yd;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EVa(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 E2,\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001EBq\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0001\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0012J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0016J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030(2\u0006\u0010.\u001a\u00020\u0002H\u0014J\u0018\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0002H\u0014J\u0010\u00102\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0012J\u0010\u00103\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007H\u0012J\"\u00104\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002050(2\u0006\u00106\u001a\u00020\u0006H\u0014J*\u00101\u001a\u001c\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002050(\u0018\u0001072\u0006\u00108\u001a\u00020\u0002H\u0012J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020:0(H\u0012J\"\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002050(2\u0006\u00106\u001a\u00020\u0006H\u0014J\u0010\u0010<\u001a\u00020)2\u0006\u00109\u001a\u00020:H\u0012J\u0010\u0010=\u001a\u00020)2\u0006\u00109\u001a\u00020:H\u0012J*\u0010>\u001a\b\u0012\u0004\u0012\u00020?0(*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020A\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00030@0(H\u0016J\f\u0010C\u001a\u00020D*\u00020BH\u0012R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020$X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/soundcloud/android/likes/TrackLikesUniflowPresenter;", "Lcom/soundcloud/android/uniflow/PagedTransformingPresenter;", "Lcom/soundcloud/android/likes/TrackLikesPage;", "", "Lcom/soundcloud/android/likes/TrackLikesUniflowItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "Lcom/soundcloud/android/likes/TrackLikesParams;", "Lcom/soundcloud/android/likes/TrackLikesUniflowView;", "trackLikeOperations", "Lcom/soundcloud/android/likes/TrackLikeOperations;", "trackItemRepository", "Lcom/soundcloud/android/tracks/TrackItemRepository;", "featureOperations", "Lcom/soundcloud/android/configuration/plans/FeatureOperations;", "offlineContentOperations", "Lcom/soundcloud/android/offline/OfflineContentOperations;", "offlineSettings", "Lcom/soundcloud/android/offline/OfflineSettingsOperations;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "playbackInitiator", "Lcom/soundcloud/android/playback/PlaybackInitiator;", "expandPlayerCommand", "Lcom/soundcloud/android/playback/ExpandPlayerCommand;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "offlineSettingsStorage", "Lcom/soundcloud/android/offline/OfflineSettingsStorage;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "offlinePropertiesProvider", "Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/likes/TrackLikeOperations;Lcom/soundcloud/android/tracks/TrackItemRepository;Lcom/soundcloud/android/configuration/plans/FeatureOperations;Lcom/soundcloud/android/offline/OfflineContentOperations;Lcom/soundcloud/android/offline/OfflineSettingsOperations;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/playback/PlaybackInitiator;Lcom/soundcloud/android/playback/ExpandPlayerCommand;Lcom/soundcloud/android/navigation/Navigator;Lcom/soundcloud/android/offline/OfflineSettingsStorage;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/foundation/domain/offline/OfflinePropertiesProvider;Lio/reactivex/Scheduler;)V", "autoPlaySubject", "Lio/reactivex/subjects/PublishSubject;", "getAutoPlaySubject", "()Lio/reactivex/subjects/PublishSubject;", "areLikesOfflineSynced", "Lio/reactivex/Observable;", "", "attachView", "", "view", "buildViewModel", "domainModel", "combinePages", "firstPage", "nextPage", "disableOfflineLikes", "enableOfflineLikes", "firstPageFunc", "Lcom/soundcloud/android/uniflow/AsyncLoader$PageResult;", "pageParams", "Lkotlin/Function0;", "currentPage", "offlineState", "Lcom/soundcloud/android/foundation/domain/offline/OfflineState;", "refreshFunc", "shouldShowNoConnectionOfflineState", "shouldShowNoWifiOfflineState", "clicksToPlaybackResult", "Lcom/soundcloud/android/playback/PlaybackResult;", "Lkotlin/Pair;", "", "Lcom/soundcloud/android/likes/TrackLikesTrackUniflowItem;", "toPlayableWithReposter", "Lcom/soundcloud/android/foundation/playqueue/PlayableWithReposter;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackLikesUniflowPresenter.kt */
public class ma extends C7037oEa<T, List<? extends la>, C6973nJa, U, U, Ha> {
    public static final a k = new a(null);
    private final C6781kVa<T> l;
    /* access modifiers changed from: private */
    public final C4001z m;
    private final Ca n;
    /* access modifiers changed from: private */
    public final C2436_U o;
    private final C4197yd p;
    private final C4070ce q;
    private final C6834lGa r;
    /* access modifiers changed from: private */
    public final Db s;
    private final C4425ta t;
    /* access modifiers changed from: private */
    public final C4655rja u;
    private final C4088fe v;
    /* access modifiers changed from: private */
    public final C3700b w;
    private final C3815lda x;
    private final HPa y;

    /* compiled from: TrackLikesUniflowPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public ma(C4001z zVar, Ca ca, C2436_U _u, C4197yd ydVar, C4070ce ceVar, C6834lGa lga, Db db, C4425ta taVar, C4655rja rja, C4088fe feVar, C3700b bVar, C3815lda lda, HPa hPa) {
        C7471uYa.b(zVar, "trackLikeOperations");
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(_u, "featureOperations");
        C7471uYa.b(ydVar, "offlineContentOperations");
        C7471uYa.b(ceVar, "offlineSettings");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(db, "playbackInitiator");
        C7471uYa.b(taVar, "expandPlayerCommand");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(feVar, "offlineSettingsStorage");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(lda, "offlinePropertiesProvider");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.m = zVar;
        this.n = ca;
        this.o = _u;
        this.p = ydVar;
        this.q = ceVar;
        this.r = lga;
        this.s = db;
        this.t = taVar;
        this.u = rja;
        this.v = feVar;
        this.w = bVar;
        this.x = lda;
        this.y = hPa;
        C6781kVa<T> s2 = C6781kVa.s();
        C7471uYa.a((Object) s2, "PublishSubject.create()");
        this.l = s2;
    }

    private APa<Boolean> g() {
        if (this.o.l()) {
            APa<Boolean> a2 = this.p.g().a(this.y);
            C7471uYa.a((Object) a2, "offlineContentOperations…veOn(mainThreadScheduler)");
            return a2;
        }
        APa<Boolean> c = APa.c(Boolean.valueOf(false));
        C7471uYa.a((Object) c, "Observable.just(false)");
        return c;
    }

    private APa<C3823mda> h() {
        if (this.o.l()) {
            APa<C3823mda> a2 = this.x.d().h(Da.a).d().a(this.y);
            C7471uYa.a((Object) a2, "offlinePropertiesProvide…veOn(mainThreadScheduler)");
            return a2;
        }
        APa<C3823mda> c = APa.c(C3823mda.NOT_OFFLINE);
        C7471uYa.a((Object) c, "Observable.just(OfflineState.NOT_OFFLINE)");
        return c;
    }

    public C6781kVa<T> f() {
        return this.l;
    }

    /* access modifiers changed from: private */
    public void c(Ha ha) {
        if (this.v.k()) {
            ha.la();
        } else {
            ha.da();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, T>> c(U u2) {
        C7471uYa.b(u2, "pageParams");
        return C7594wJa.a(this.m.c(), new Ea(this));
    }

    /* access modifiers changed from: private */
    public PXa<APa<d<C6973nJa, T>>> b(T t2) {
        APa a2 = this.m.a(t2);
        if (a2 != null) {
            return new Ca(a2, this);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public boolean b(C3823mda mda) {
        return mda == C3823mda.REQUESTED && this.q.a() && !this.r.a();
    }

    /* access modifiers changed from: private */
    public void b(Ha ha) {
        ha.U();
    }

    public void a(Ha ha) {
        C7471uYa.b(ha, "view");
        super.a(ha);
        b().a(APa.a((EPa<? extends T>) a(ha.o()), (EPa<? extends T>) ha.ea().g(new oa(this)), (EPa<? extends T>) f().g(new qa(this))).f((C6776kQa<? super T>) new Fa<Object>(new ra(this.t))), ha.Z().f((C6776kQa<? super T>) new sa<Object>(this)), ha.aa().d(1).f((C6776kQa<? super T>) new ta<Object>(this)), ha.Y().f((C6776kQa<? super T>) new ua<Object>(this, ha)), ha.d().f((C6776kQa<? super T>) new va<Object>(this)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, T>> b(U u2) {
        C7471uYa.b(u2, "pageParams");
        APa d = this.m.b().d((C6776kQa<? super T>) new za<Object>(this, u2));
        C7471uYa.a((Object) d, "trackLikeOperations.like…oPlaySubject.onNext(it) }");
        return C7594wJa.a(d, new Aa(this));
    }

    public APa<C4536zc> a(APa<HVa<Integer, List<V>>> aPa) {
        C7471uYa.b(aPa, "$this$clicksToPlaybackResult");
        APa<C4536zc> g = aPa.g(new ya(this));
        C7471uYa.a((Object) g, "flatMapSingle { (positio…)\n            )\n        }");
        return g;
    }

    /* access modifiers changed from: private */
    public u a(V v2) {
        u a2 = u.a(v2.b().a());
        C7471uYa.a((Object) a2, "PlayableWithReposter.from(trackItem.urn)");
        return a2;
    }

    /* access modifiers changed from: protected */
    public APa<List<la>> a(T t2) {
        C7471uYa.b(t2, "domainModel");
        if (t2.a().isEmpty()) {
            APa<List<la>> c = APa.c(C6918mWa.a());
            C7471uYa.a((Object) c, "Observable.just(emptyList())");
            return c;
        }
        Ca ca = this.n;
        List<C2862s> a2 = t2.a();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) a2, 10));
        for (C2862s a3 : a2) {
            arrayList.add(a3.a());
        }
        APa h = ca.a((List<C3508cda>) arrayList, true).h(new xa(t2));
        _Ua _ua = _Ua.a;
        C7471uYa.a((Object) h, "trackLikeItemSource");
        APa<List<la>> a4 = APa.a((EPa<? extends T1>) h, (EPa<? extends T2>) g(), (EPa<? extends T3>) h(), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) new wa<Object,Object,Object,Object>(this, t2));
        C7471uYa.a((Object) a4, "Observables.combineLates…ckLikeItems\n            }");
        return a4;
    }

    /* access modifiers changed from: protected */
    public T a(T t2, T t3) {
        C7471uYa.b(t2, "firstPage");
        C7471uYa.b(t3, "nextPage");
        return new T(C7676xWa.c((Collection) t2.a(), (Iterable) t3.a()), t2.b());
    }

    /* access modifiers changed from: private */
    public boolean a(C3823mda mda) {
        return mda == C3823mda.REQUESTED && !this.r.d();
    }
}
