package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.playback.C4425ta;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

@EVa(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $22\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0001:\u0001$BA\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\"\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J-\u0010\u001f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020 0\u001a2\u0006\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0002\u0010\"J-\u0010#\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020 0\u001a2\u0006\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0002\u0010\"R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/soundcloud/android/collection/playhistory/PlayHistoryPresenter;", "Lcom/soundcloud/android/uniflow/PagedTransformingPresenter;", "", "Lcom/soundcloud/android/tracks/TrackItem;", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryItem;", "Lcom/soundcloud/android/view/collection/LegacyError;", "", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryView;", "playHistoryOperations", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryOperations;", "performanceMetricsEngine", "Lcom/soundcloud/android/analytics/performance/PerformanceMetricsEngine;", "expandPlayerCommand", "Lcom/soundcloud/android/playback/ExpandPlayerCommand;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "feedbackController", "Lcom/soundcloud/android/view/snackbar/FeedbackController;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/collection/playhistory/PlayHistoryOperations;Lcom/soundcloud/android/analytics/performance/PerformanceMetricsEngine;Lcom/soundcloud/android/playback/ExpandPlayerCommand;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/view/snackbar/FeedbackController;Lio/reactivex/Scheduler;)V", "attachView", "view", "buildViewModel", "Lio/reactivex/Observable;", "domainModel", "endMeasuringListeningHistoryLoad", "historySize", "", "firstPageFunc", "Lcom/soundcloud/android/uniflow/AsyncLoader$PageResult;", "pageParams", "(Lkotlin/Unit;)Lio/reactivex/Observable;", "refreshFunc", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlayHistoryPresenter.kt */
public final class ka extends C7037oEa<List<? extends C6185ma>, List<? extends Q>, C6973nJa, RVa, RVa, Ea> {
    public static final a k = new a(null);
    /* access modifiers changed from: private */
    public final Z l;
    private final C2014EO m;
    private final C4425ta n;
    /* access modifiers changed from: private */
    public final C5327TLa o;
    /* access modifiers changed from: private */
    public final C3700b p;
    /* access modifiers changed from: private */
    public final C5052KJa q;
    private final HPa r;

    /* compiled from: PlayHistoryPresenter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public ka(Z z, C2014EO eo, C4425ta taVar, C5327TLa tLa, C3700b bVar, C5052KJa kJa, HPa hPa) {
        C7471uYa.b(z, "playHistoryOperations");
        C7471uYa.b(eo, "performanceMetricsEngine");
        C7471uYa.b(taVar, "expandPlayerCommand");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(bVar, "analytics");
        C7471uYa.b(kJa, "feedbackController");
        C7471uYa.b(hPa, "mainThreadScheduler");
        super(hPa);
        this.l = z;
        this.m = eo;
        this.n = taVar;
        this.o = tLa;
        this.p = bVar;
        this.q = kJa;
        this.r = hPa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public APa<d<C6973nJa, List<C6185ma>>> c(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        return C7594wJa.a(this.l.c(1000), null, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public APa<d<C6973nJa, List<C6185ma>>> b(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa a2 = this.l.b(1000).a((DPa<? extends R, ? super T>) C5229QDa.a.a(new ra(this)));
        C7471uYa.a((Object) a2, "playHistoryOperations.pl…ngHistoryLoad(it.size) })");
        return C7594wJa.a(a2, null, 1, null);
    }

    public void a(Ea ea) {
        C7471uYa.b(ea, "view");
        super.a(ea);
        b().a(ea.l().g(new la(this)).f((C6776kQa<? super T>) new sa<Object>(new ma(this.n))), ea.S().f((C6776kQa<? super T>) new na<Object>(this)), ea.ia().f((C6776kQa<? super T>) new oa<Object>(ea)), ea.d().f((C6776kQa<? super T>) new pa<Object>(this)));
    }

    /* access modifiers changed from: protected */
    public APa<List<Q>> a(List<? extends C6185ma> list) {
        C7471uYa.b(list, "domainModel");
        APa<List<Q>> h = APa.c(list).h(new qa(list));
        C7471uYa.a((Object) h, "Observable.just(domainMo…k(it) }\n                }");
        return h;
    }

    /* access modifiers changed from: private */
    public final void a(int i) {
        C2014EO eo = this.m;
        C1994DO b = C1994DO.a().a(u.LISTENING_HISTORY_LOAD).a(new t().b(s.LISTENING_HISTORY_SIZE, (long) i)).b();
        C7471uYa.a((Object) b, "PerformanceMetric.builde…                 .build()");
        eo.b(b);
    }
}
