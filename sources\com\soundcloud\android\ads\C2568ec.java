package com.soundcloud.android.ads;

import android.annotation.SuppressLint;
import com.soundcloud.android.comments.Ea;
import com.soundcloud.android.foundation.ads.C3676c;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3711m;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.r;
import com.soundcloud.android.playback.C4431ub;
import com.soundcloud.android.playback.C4519wc;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 32\u00020\u0001:\u00013BU\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010H\u0002J6\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020-H\u0002J\u000e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0010H\u0002J\b\u00100\u001a\u00020-H\u0002J\b\u00101\u001a\u00020-H\u0002J\u0006\u00102\u001a\u00020\u001eR\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lcom/soundcloud/android/ads/PlayerAdsControllerProxy;", "", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "controller", "Ldagger/Lazy;", "Lcom/soundcloud/android/ads/PlayerAdsController;", "playerAdsPositionTracker", "Lcom/soundcloud/android/ads/PlayerAdsPositionTracker;", "commentsVisibilityProvider", "Lcom/soundcloud/android/comments/CommentsVisibilityProvider;", "adsTimerController", "Lcom/soundcloud/android/ads/AdsTimerController;", "playQueueUpdates", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;", "eventSpy", "Lio/reactivex/Observable;", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "companionAdLoadedStateProvider", "Lcom/soundcloud/android/ads/CompanionAdLoadedStateProvider;", "(Lcom/soundcloud/rx/eventbus/EventBus;Ldagger/Lazy;Lcom/soundcloud/android/ads/PlayerAdsPositionTracker;Lcom/soundcloud/android/comments/CommentsVisibilityProvider;Lcom/soundcloud/android/ads/AdsTimerController;Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;Lio/reactivex/Observable;Lcom/soundcloud/android/ads/CompanionAdLoadedStateProvider;)V", "getController$base_release", "()Ldagger/Lazy;", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getEventBus$base_release", "()Lcom/soundcloud/rx/eventbus/EventBus;", "getEventSpy", "()Lio/reactivex/Observable;", "adPlaybackImpression", "", "createVisualAdImpressionState", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/ads/VisualAdImpressionState;", "loadedCompanionUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "currentItemEvent", "Lcom/soundcloud/android/foundation/playqueue/CurrentPlayQueueItemEvent;", "event", "Lcom/soundcloud/android/foundation/events/ActivityLifeCycleEvent;", "playerUIEvent", "Lcom/soundcloud/android/events/PlayerUIEvent;", "isCommentsVisible", "", "delayedAdRequestWindow", "Lio/reactivex/disposables/Disposable;", "listenToAdImpressions", "listenToAdOverlayImpression", "listenToAdOverlayImpressionStates", "listenToVisualAdImpressionStates", "subscribe", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.ads.ec reason: case insensitive filesystem */
/* compiled from: PlayerAdsControllerProxy.kt */
public final class C2568ec {
    /* access modifiers changed from: private */
    public static final long a = C7179qIa.c(5);
    public static final a b = new a(null);
    @SuppressLint({"sc.MissingCompositeDisposableRecycle"})
    private final UPa c = new UPa();
    private final C5327TLa d;
    private final C4806CMa<Yb> e;
    /* access modifiers changed from: private */
    public final Hc f;
    private final Ea g;
    /* access modifiers changed from: private */
    public final C2587jb h;
    private final r i;
    private final APa<J> j;
    private final C2630ub k;

    /* renamed from: com.soundcloud.android.ads.ec$a */
    /* compiled from: PlayerAdsControllerProxy.kt */
    public static final class a {
        private a() {
        }

        public final long a() {
            return C2568ec.a;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C2568ec(C5327TLa tLa, C4806CMa<Yb> cMa, Hc hc, Ea ea, C2587jb jbVar, r rVar, @C3711m APa<J> aPa, C2630ub ubVar) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(cMa, "controller");
        C7471uYa.b(hc, "playerAdsPositionTracker");
        C7471uYa.b(ea, "commentsVisibilityProvider");
        C7471uYa.b(jbVar, "adsTimerController");
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(aPa, "eventSpy");
        C7471uYa.b(ubVar, "companionAdLoadedStateProvider");
        this.d = tLa;
        this.e = cMa;
        this.f = hc;
        this.g = ea;
        this.h = jbVar;
        this.i = rVar;
        this.j = aPa;
        this.k = ubVar;
    }

    private final APa<RVa> d() {
        APa<RVa> h2 = APa.b((EPa<? extends T>) this.j.b(C0073d.class), (EPa<? extends T>) this.j.a((C7256rQa<? super T>) C2572fc.a).h(C2576gc.a)).h(C2580hc.a);
        C7471uYa.a((Object) h2, "Observable.merge(\n      …            .map { Unit }");
        return h2;
    }

    private final VPa e() {
        APa h2 = this.i.a().h(C2584ic.a);
        C5327TLa tLa = this.d;
        C5443XLa<C4519wc> xLa = C3876taa.c;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYBACK_PROGRESS");
        VPa f2 = APa.b((EPa<? extends T>) h2, (EPa<? extends T>) tLa.a(xLa).h(C2588jc.a)).d().f((C6776kQa<? super T>) new C2592kc<Object>(this));
        C7471uYa.a((Object) f2, "Observable.merge(\n      …Changed(it)\n            }");
        return f2;
    }

    private final VPa f() {
        VPa f2 = d().b((EPa<? extends T>) g()).f((C6776kQa<? super T>) new C2596lc<Object>(this));
        C7471uYa.a((Object) f2, "adPlaybackImpression().m…mpression()\n            }");
        return f2;
    }

    private final APa<RVa> g() {
        APa<RVa> h2 = this.j.a((C7256rQa<? super T>) C2600mc.a).a(C3425GZ.class).a((C7256rQa<? super T>) C2604nc.a).h(C2608oc.a);
        C7471uYa.a((Object) h2, "eventSpy\n            .fi…            .map { Unit }");
        return h2;
    }

    private final VPa h() {
        _Ua _ua = _Ua.a;
        C5327TLa tLa = this.d;
        C5443XLa<C3699a> xLa = C3876taa.m;
        C7471uYa.a((Object) xLa, "EventQueue.ACTIVITY_LIFE_CYCLE");
        C6985nVa a2 = tLa.a(xLa);
        C5327TLa tLa2 = this.d;
        C5443XLa<Iaa> xLa2 = C3876taa.d;
        C7471uYa.a((Object) xLa2, "EventQueue.PLAYER_UI");
        C6985nVa a3 = tLa2.a(xLa2);
        C5327TLa tLa3 = this.d;
        C5443XLa<C3422FZ> xLa3 = C3876taa.g;
        C7471uYa.a((Object) xLa3, "EventQueue.AD_OVERLAY");
        VPa f2 = APa.a(a2, a3, tLa3.a(xLa3), this.g.a(), new C2612pc()).f((C6776kQa<? super T>) new C2616qc<Object>(this));
        C7471uYa.a((Object) f2, "Observables.combineLates…rlayImpressionState(it) }");
        return f2;
    }

    private final VPa i() {
        _Ua _ua = _Ua.a;
        C5327TLa tLa = this.d;
        C5443XLa<C3699a> xLa = C3876taa.m;
        C7471uYa.a((Object) xLa, "EventQueue.ACTIVITY_LIFE_CYCLE");
        C6985nVa a2 = tLa.a(xLa);
        APa d2 = this.i.a().d((C6776kQa<? super T>) new C2623sc<Object>(this));
        C7471uYa.a((Object) d2, "playQueueUpdates.current…      }\n                }");
        C5327TLa tLa2 = this.d;
        C5443XLa<Iaa> xLa2 = C3876taa.d;
        C7471uYa.a((Object) xLa2, "EventQueue.PLAYER_UI");
        VPa f2 = APa.a(a2, d2, tLa2.a(xLa2), this.g.a(), this.k.a(), new C2619rc(this)).f((C6776kQa<? super T>) new C2627tc<Object>(this));
        C7471uYa.a((Object) f2, "Observables.combineLates…)\n            }\n        }");
        return f2;
    }

    public final void c() {
        XUa.a(this.c, e());
        UPa uPa = this.c;
        C5327TLa tLa = this.d;
        C5443XLa<C3699a> xLa = C3876taa.m;
        C7471uYa.a((Object) xLa, "EventQueue.ACTIVITY_LIFE_CYCLE");
        XUa.a(uPa, tLa.a(xLa, (C6776kQa<E>) new C2639wc<E>(this)));
        UPa uPa2 = this.c;
        C5327TLa tLa2 = this.d;
        C5443XLa<Iaa> xLa2 = C3876taa.d;
        C7471uYa.a((Object) xLa2, "EventQueue.PLAYER_UI");
        XUa.a(uPa2, tLa2.a(xLa2, (C6776kQa<E>) new C2643xc<E>(this)));
        UPa uPa3 = this.c;
        VPa f2 = this.g.a().f((C6776kQa<? super T>) new C2647yc<Object>(this));
        C7471uYa.a((Object) f2, "commentsVisibilityProvid…entsVisibilityEvent(it) }");
        XUa.a(uPa3, f2);
        UPa uPa4 = this.c;
        VPa f3 = this.i.a().d((C6776kQa<? super T>) new C2651zc<Object>(this)).f((C6776kQa<? super T>) new Ac<Object>(this));
        C7471uYa.a((Object) f3, "playQueueUpdates.current…nCurrentPlayQueueItem() }");
        XUa.a(uPa4, f3);
        UPa uPa5 = this.c;
        C5327TLa tLa3 = this.d;
        C5443XLa<C4431ub> xLa3 = C3876taa.b;
        C7471uYa.a((Object) xLa3, "EventQueue.PLAYBACK_STATE_CHANGED");
        XUa.a(uPa5, tLa3.a(xLa3, (C6776kQa<E>) new Bc<E>(this)));
        UPa uPa6 = this.c;
        C5327TLa tLa4 = this.d;
        C5443XLa<C3422FZ> xLa4 = C3876taa.g;
        C7471uYa.a((Object) xLa4, "EventQueue.AD_OVERLAY");
        XUa.a(uPa6, tLa4.a(xLa4, (C6776kQa<E>) new Cc<E>(this)));
        UPa uPa7 = this.c;
        VPa f4 = this.i.b().a((C7256rQa<? super T>) Dc.a).f((C6776kQa<? super T>) new Ec<Object>(this));
        C7471uYa.a((Object) f4, "playQueueUpdates.playQue…r.get().onQueueUpdate() }");
        XUa.a(uPa7, f4);
        UPa uPa8 = this.c;
        C5327TLa tLa5 = this.d;
        C5443XLa<C4519wc> xLa5 = C3876taa.c;
        C7471uYa.a((Object) xLa5, "EventQueue.PLAYBACK_PROGRESS");
        VPa f5 = tLa5.a(xLa5).a((C7256rQa<? super T>) C2631uc.a).f((C6776kQa<? super T>) new C2635vc<Object>(this));
        C7471uYa.a((Object) f5, "eventBus.queue(EventQueu…nAdPlaybackProgress(it) }");
        XUa.a(uPa8, f5);
        XUa.a(this.c, i());
        XUa.a(this.c, h());
        XUa.a(this.c, f());
    }

    public final C4806CMa<Yb> b() {
        return this.e;
    }

    /* access modifiers changed from: private */
    public final C4928GKa<kd> a(C3508cda cda, k kVar, C3699a aVar, Iaa iaa, boolean z) {
        boolean z2 = kVar.b().f() && C7471uYa.a((Object) cda, (Object) kVar.b().c());
        C3676c cVar = kVar.b().f() ? (C3676c) kVar.b().a().b() : null;
        if (z2) {
            kd kdVar = new kd(kVar.b().f(), cVar, aVar.a() == 0, iaa.c() == 0, z);
            C4928GKa<kd> c2 = C4928GKa.c(kdVar);
            C7471uYa.a((Object) c2, "Optional.of(\n           …          )\n            )");
            return c2;
        }
        C4928GKa<kd> a2 = C4928GKa.a();
        C7471uYa.a((Object) a2, "Optional.absent()");
        return a2;
    }
}
