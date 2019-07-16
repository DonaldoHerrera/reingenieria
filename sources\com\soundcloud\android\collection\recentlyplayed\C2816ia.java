package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.stations.Ga;
import java.util.List;

@EVa(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 -22\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001-BQ\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0007H\u0016J\"\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0002J-\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020$0\u001e2\u0006\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0002\u0010&J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010+\u001a\u00020\u00062\u0006\u0010(\u001a\u00020)H\u0002J-\u0010,\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020$0\u001e2\u0006\u0010%\u001a\u00020\u0006H\u0014¢\u0006\u0002\u0010&R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPresenter;", "Lcom/soundcloud/android/uniflow/PagedTransformingPresenter;", "", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPlayableItem;", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedView;", "recentlyPlayedOperations", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedOperations;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "screenProvider", "Lcom/soundcloud/android/foundation/events/ScreenProvider;", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "stationHandler", "Lcom/soundcloud/android/stations/StartStationHandler;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "performanceMetricsEngine", "Lcom/soundcloud/android/analytics/performance/PerformanceMetricsEngine;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedOperations;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/foundation/events/ScreenProvider;Lcom/soundcloud/android/navigation/Navigator;Lcom/soundcloud/android/stations/StartStationHandler;Lcom/soundcloud/android/view/snackbar/FeedbackController;Lcom/soundcloud/android/analytics/performance/PerformanceMetricsEngine;Lio/reactivex/Scheduler;)V", "attachView", "view", "buildViewModel", "Lio/reactivex/Observable;", "domainModel", "endMeasuringLoadTime", "itemsCount", "", "firstPageFunc", "Lcom/soundcloud/android/uniflow/AsyncLoader$PageResult;", "pageParams", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "onPlaylistClick", "urn", "Lcom/soundcloud/android/foundation/domain/Urn;", "onProfileClick", "onStationClick", "refreshFunc", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.collection.recentlyplayed.ia reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedPresenter.kt */
public final class C2816ia extends C7037oEa<List<? extends C2804ca>, List<? extends E>, C6973nJa, RVa, RVa, Ma> {
    public static final a k = new a(null);
    /* access modifiers changed from: private */
    public final J l;
    /* access modifiers changed from: private */
    public final C5327TLa m;
    /* access modifiers changed from: private */
    public final C3700b n;
    private final F o;
    private final C4655rja p;
    private final Ga q;
    /* access modifiers changed from: private */
    public final C5052KJa r;
    private final C2014EO s;
    private final HPa t;

    /* renamed from: com.soundcloud.android.collection.recentlyplayed.ia$a */
    /* compiled from: RecentlyPlayedPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C2816ia(J j, C5327TLa tLa, C3700b bVar, F f, C4655rja rja, Ga ga, C5052KJa kJa, C2014EO eo, HPa hPa) {
        C7471uYa.b(j, "recentlyPlayedOperations");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(f, "screenProvider");
        C7471uYa.b(rja, "navigator");
        C7471uYa.b(ga, "stationHandler");
        C7471uYa.b(kJa, "feedbackController");
        C7471uYa.b(eo, "performanceMetricsEngine");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = j;
        this.m = tLa;
        this.n = bVar;
        this.o = f;
        this.p = rja;
        this.q = ga;
        this.r = kJa;
        this.s = eo;
        this.t = hPa;
    }

    /* access modifiers changed from: private */
    public final void c(C3508cda cda) {
        Yca b = this.o.b();
        C3700b bVar = this.n;
        C3860raa a2 = C3860raa.a(cda, b);
        C7471uYa.a((Object) a2, "CollectionEvent.forRecentlyPlayed(urn, lastScreen)");
        bVar.a((J) a2);
        this.q.a(cda);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, List<C2804ca>>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return C7594wJa.a(this.l.b(1000), null, 1, null);
    }

    public void a(Ma ma) {
        C7471uYa.b(ma, "view");
        super.a(ma);
        b().a((VPa) ma.S().c(C5220Pua.a((C6776kQa<T>) new C2818ja<T>(this))), (VPa) ma.ia().c(C5220Pua.a((C6776kQa<T>) new C2820ka<T>(ma))), (VPa) ma.Da().c(C5220Pua.a((C6776kQa<T>) new C2822la<T>(this))), (VPa) ma.k().c(C5220Pua.a((C6776kQa<T>) new C2824ma<T>(this))), (VPa) ma.J().c(C5220Pua.a((C6776kQa<T>) new na<T>(this))), (VPa) ma.d().c(C5220Pua.a((C6776kQa<T>) new oa<T>(this))));
    }

    /* access modifiers changed from: private */
    public final void b(C3508cda cda) {
        Yca b = this.o.b();
        C3700b bVar = this.n;
        C3860raa a2 = C3860raa.a(cda, b);
        C7471uYa.a((Object) a2, "CollectionEvent.forRecentlyPlayed(urn, lastScreen)");
        bVar.a((J) a2);
        C4655rja rja = this.p;
        C4621nja a3 = C4621nja.a(cda, C4928GKa.a(), C4928GKa.c(b), C4928GKa.a());
        C7471uYa.a((Object) a3, "NavigationTarget.forProf…reen), Optional.absent())");
        rja.a(a3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<C2804ca>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa a2 = this.l.a(1000).a((DPa<? extends R, ? super T>) C5229QDa.a.a(new qa(this)));
        C7471uYa.a((Object) a2, "recentlyPlayedOperations…uringLoadTime(it.size) })");
        return C7594wJa.a(a2, null, 1, null);
    }

    /* access modifiers changed from: protected */
    public APa<List<E>> a(List<? extends C2804ca> list) {
        C7471uYa.b(list, "domainModel");
        APa<List<E>> h = APa.c(list).h(new pa(list));
        C7471uYa.a((Object) h, "Observable.just(domainMo…edHeader(it.size)) + it }");
        return h;
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        t b = new t().b(s.RECENTLY_PLAYED_SIZE, (long) i);
        C2014EO eo = this.s;
        C1994DO b2 = C1994DO.a().a(u.RECENTLY_PLAYED_LOAD).a(b).b();
        C7471uYa.a((Object) b2, "PerformanceMetric.builde…                 .build()");
        eo.b(b2);
    }

    /* access modifiers changed from: private */
    public final void a(C3508cda cda) {
        Yca b = this.o.b();
        C3700b bVar = this.n;
        C3860raa a2 = C3860raa.a(cda, b);
        C7471uYa.a((Object) a2, "CollectionEvent.forRecentlyPlayed(urn, lastScreen)");
        bVar.a((J) a2);
        C4655rja rja = this.p;
        C4621nja a3 = C4621nja.a(cda, b);
        C7471uYa.a((Object) a3, "NavigationTarget.forLega…Playlist(urn, lastScreen)");
        rja.a(a3);
    }
}
