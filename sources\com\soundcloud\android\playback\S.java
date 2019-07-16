package com.soundcloud.android.playback;

import android.content.Context;
import android.view.Surface;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.ads.Oc;
import com.soundcloud.android.ads.Yb;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.U;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.players.MediaService.b;
import com.soundcloud.android.playback.ui.view.g;
import com.soundcloud.android.settings.C5956m;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000 T2\u00020\u0001:\u0001TB\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\b\b\u0001\u0010\"\u001a\u00020#¢\u0006\u0002\u0010$J\b\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020,H\u0016J\b\u0010.\u001a\u00020(H\u0016J\b\u0010/\u001a\u00020(H\u0016J\b\u00100\u001a\u00020(H\u0012J\b\u00101\u001a\u00020(H\u0016J\b\u00102\u001a\u00020,H\u0016J\b\u00103\u001a\u00020,H\u0016J\b\u00104\u001a\u00020,H\u0016J\u0010\u00104\u001a\u00020,2\u0006\u00105\u001a\u000206H\u0016J6\u00107\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u00105\u001a\u000206H\u0016J\b\u0010B\u001a\u00020(H\u0016J\b\u0010C\u001a\u00020,H\u0012J\b\u0010D\u001a\u00020,H\u0016J\u0010\u0010E\u001a\u00020,2\u0006\u0010F\u001a\u000206H\u0016J\u0010\u0010G\u001a\u00020,2\u0006\u0010H\u001a\u00020IH\u0016J6\u0010J\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u00105\u001a\u000206H\u0016J\u0018\u0010K\u001a\u00020,2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020(H\u0012J\b\u0010Q\u001a\u00020(H\u0012J\b\u0010R\u001a\u00020,H\u0016J\b\u0010S\u001a\u00020,H\u0016R\u000e\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, d2 = {"Lcom/soundcloud/android/playback/DefaultPlaySessionController;", "Lcom/soundcloud/android/playback/PlaySessionController;", "playSessionStateProvider", "Lcom/soundcloud/android/playback/PlaySessionStateProvider;", "mediaController", "Lcom/soundcloud/android/playback/MediaController;", "context", "Landroid/content/Context;", "playbackItemOperations", "Lcom/soundcloud/android/playback/PlaybackItemOperations;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "currentPlayQueueItemProvider", "Lcom/soundcloud/android/playback/CurrentPlayQueueItemProvider;", "playbackProgressRepository", "Lcom/soundcloud/android/playback/PlaybackProgressRepository;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "playerAdsController", "Lcom/soundcloud/android/ads/PlayerAdsController;", "adsOperations", "Lcom/soundcloud/android/ads/AdsOperations;", "playbackFeedbackHelper", "Lcom/soundcloud/android/playback/ui/view/PlaybackFeedbackHelper;", "devImmediatelySkippableAds", "Lcom/soundcloud/android/settings/DevImmediatelySkippableAds;", "adViewabilityController", "Lcom/soundcloud/android/foundation/ads/AdViewabilityController;", "playerVideoAdsController", "Lcom/soundcloud/android/ads/PlayerVideoAdsController;", "urlWithPlaceholderBuilder", "Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/playback/PlaySessionStateProvider;Lcom/soundcloud/android/playback/MediaController;Landroid/content/Context;Lcom/soundcloud/android/playback/PlaybackItemOperations;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/playback/CurrentPlayQueueItemProvider;Lcom/soundcloud/android/playback/PlaybackProgressRepository;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/events/Analytics;Lcom/soundcloud/android/ads/PlayerAdsController;Lcom/soundcloud/android/ads/AdsOperations;Lcom/soundcloud/android/playback/ui/view/PlaybackFeedbackHelper;Lcom/soundcloud/android/settings/DevImmediatelySkippableAds;Lcom/soundcloud/android/foundation/ads/AdViewabilityController;Lcom/soundcloud/android/ads/PlayerVideoAdsController;Lcom/soundcloud/android/events/UrlWithPlaceholderBuilder;Lio/reactivex/Scheduler;)V", "disposable", "Lio/reactivex/disposables/Disposable;", "hasReloadedPlayqueue", "", "getMainThreadScheduler", "()Lio/reactivex/Scheduler;", "fadeAndPause", "", "initStoredPlayqueue", "isPlaying", "isPlayingCurrentPlayQueueItem", "isPositionAfterTrackChangeThreshold", "nextTrack", "pause", "play", "playCurrent", "fromPosition", "", "playNewQueue", "Lio/reactivex/Single;", "Lcom/soundcloud/android/playback/PlaybackResult;", "playQueue", "Lcom/soundcloud/android/foundation/playqueue/PlayQueue;", "initialTrack", "Lcom/soundcloud/android/foundation/domain/Urn;", "initialTrackIndex", "", "playSessionSource", "Lcom/soundcloud/android/foundation/playqueue/PlaySessionSource;", "previousTrack", "publishSkipEventIfAd", "resetPlaySession", "seek", "position", "setCurrentPlayQueueItem", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "setNewQueue", "setVideoSurface", "uuid", "", "surface", "Landroid/view/Surface;", "shouldDisableSkipping", "shouldSeekBackInsteadOfSkipping", "stopPlaySession", "togglePlayback", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: DefaultPlaySessionController.kt */
public class S implements C4412qb {
    private static final long a = TimeUnit.SECONDS.toMillis(3);
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public VPa c;
    private boolean d;
    private final C4416rb e;
    private final Fa f;
    private final Context g;
    private final Qb h;
    /* access modifiers changed from: private */
    public final C3814lca i;
    private final P j;
    private final C4526xc k;
    /* access modifiers changed from: private */
    public final C5327TLa l;
    private final C3700b m;
    private final Yb n;
    private final Na o;
    private final g p;
    private final C5956m q;
    private final C3678e r;
    /* access modifiers changed from: private */
    public final Oc s;
    private final Yaa t;
    private final HPa u;

    /* compiled from: DefaultPlaySessionController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public S(C4416rb rbVar, Fa fa, Context context, Qb qb, C3814lca lca, P p2, C4526xc xcVar, C5327TLa tLa, C3700b bVar, Yb yb, Na na, g gVar, C5956m mVar, C3678e eVar, Oc oc, Yaa yaa, HPa hPa) {
        C4416rb rbVar2 = rbVar;
        Fa fa2 = fa;
        Context context2 = context;
        Qb qb2 = qb;
        C3814lca lca2 = lca;
        P p3 = p2;
        C4526xc xcVar2 = xcVar;
        C5327TLa tLa2 = tLa;
        C3700b bVar2 = bVar;
        Yb yb2 = yb;
        Na na2 = na;
        g gVar2 = gVar;
        C5956m mVar2 = mVar;
        C3678e eVar2 = eVar;
        Oc oc2 = oc;
        Yaa yaa2 = yaa;
        C7471uYa.b(rbVar2, "playSessionStateProvider");
        C7471uYa.b(fa2, "mediaController");
        C7471uYa.b(context2, "context");
        C7471uYa.b(qb2, "playbackItemOperations");
        C7471uYa.b(lca2, "playQueueManager");
        C7471uYa.b(p3, "currentPlayQueueItemProvider");
        C7471uYa.b(xcVar2, "playbackProgressRepository");
        C7471uYa.b(tLa2, "eventBus");
        C7471uYa.b(bVar2, "analytics");
        C7471uYa.b(yb2, "playerAdsController");
        C7471uYa.b(na2, "adsOperations");
        C7471uYa.b(gVar2, "playbackFeedbackHelper");
        C7471uYa.b(mVar2, "devImmediatelySkippableAds");
        C7471uYa.b(eVar2, "adViewabilityController");
        C7471uYa.b(oc2, "playerVideoAdsController");
        C7471uYa.b(yaa, "urlWithPlaceholderBuilder");
        C7471uYa.b(hPa, "mainThreadScheduler");
        Yaa yaa3 = yaa;
        this.e = rbVar2;
        this.f = fa2;
        this.g = context2;
        this.h = qb2;
        this.i = lca2;
        this.j = p3;
        this.k = xcVar2;
        this.l = tLa2;
        this.m = bVar2;
        this.n = yb2;
        this.o = na2;
        this.p = gVar2;
        this.q = mVar2;
        this.r = eVar2;
        this.s = oc;
        this.t = yaa3;
        this.u = hPa;
        VPa a2 = WPa.a();
        C7471uYa.a((Object) a2, "Disposables.disposed()");
        this.c = a2;
    }

    private void e() {
        C4928GKa b2 = C4928GKa.b(this.o.a());
        if (this.o.d()) {
            C3700b bVar = this.m;
            Object b3 = b2.b();
            C7471uYa.a(b3, "adData.get()");
            if (b3 instanceof U) {
                bVar.a((J) C3416DZ.a((U) b3, this.t, this.i.l()));
                if (this.o.g()) {
                    this.r.d();
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Input ");
            sb.append(b3);
            sb.append(" not of type ");
            sb.append(U.class.getSimpleName());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private boolean f() {
        boolean z = false;
        if (this.o.d()) {
            if (this.q.a()) {
                return false;
            }
            Object b2 = this.i.h().a().b();
            C7471uYa.a(b2, "playQueueManager.current…eueItem.getAdData().get()");
            if (b2 instanceof U) {
                U u2 = (U) b2;
                boolean z2 = !u2.z();
                boolean z3 = !m();
                C4519wc b3 = this.e.b();
                C7471uYa.a((Object) b3, "playSessionStateProvider.lastProgressEvent");
                boolean z4 = b3.d() < TimeUnit.SECONDS.toMillis((long) u2.v());
                if (z2 || z3 || z4) {
                    z = true;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Input ");
                sb.append(b2);
                sb.append(" not of type ");
                sb.append(U.class.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return z;
    }

    private boolean n() {
        return d() && !this.o.d();
    }

    public void g() {
        b.a.a(this.g);
    }

    public boolean h() {
        if (f()) {
            this.p.b();
            return false;
        }
        e();
        return this.i.A();
    }

    public void i() {
        if (this.d || !this.i.x()) {
            SDb.b("Not reloading PlayQueue as it is not empty - there is already data stored in PlayQueueManager!", new Object[0]);
            return;
        }
        this.d = true;
        this.c.dispose();
        VPa c2 = this.j.a().a((C7256rQa<? super T>) T.a).c((C6776kQa<? super T>) new U<Object>(this));
        C7471uYa.a((Object) c2, "currentPlayQueueItemProv…      )\n                }");
        this.c = c2;
    }

    public boolean isPlaying() {
        return this.e.isPlaying();
    }

    public void j() {
        if (isPlaying()) {
            pause();
        } else {
            play();
        }
    }

    public boolean k() {
        boolean z;
        if (f()) {
            this.p.b();
            return false;
        }
        if (n()) {
            a(0);
            z = true;
        } else {
            e();
            z = this.i.C();
        }
        return z;
    }

    public void l() {
        c();
        this.i.d();
        C5327TLa tLa = this.l;
        C5443XLa<Iaa> xLa = C3876taa.d;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYER_UI");
        tLa.c(xLa, Iaa.a());
    }

    public boolean m() {
        q h2 = this.i.h();
        C7471uYa.a((Object) h2, "currentPlayQueueItem");
        return !h2.g() && this.e.b(h2.c());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.soundcloud.android.playback.V, _Xa] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.soundcloud.android.playback.Z] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public void pause() {
        SDb.c("pause() requested", new Object[0]);
        IPa b2 = this.f.b();
        ? r1 = V.e;
        if (r1 != 0) {
            r1 = new Z(r1);
        }
        b2.d((C6776kQa) r1);
    }

    public void play() {
        if (m()) {
            C4416rb rbVar = this.e;
            q h2 = this.i.h();
            C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
            C4519wc c2 = rbVar.c(h2.c());
            C7471uYa.a((Object) c2, "progress");
            if (c2.g()) {
                b();
            } else {
                b(c2.d());
            }
        } else {
            b();
        }
    }

    private boolean d() {
        C4519wc b2 = this.e.b();
        C7471uYa.a((Object) b2, "playSessionStateProvider.lastProgressEvent");
        return b2.d() >= a;
    }

    public HPa a() {
        return this.u;
    }

    public void b() {
        b(-1);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.soundcloud.android.playback.ga, _Xa] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v0, types: [com.soundcloud.android.playback.Z] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    public void c() {
        SDb.c("stop() requested", new Object[0]);
        IPa b2 = this.f.b();
        ? r1 = C4310ga.e;
        if (r1 != 0) {
            r1 = new Z(r1);
        }
        b2.d((C6776kQa) r1);
    }

    public IPa<C4536zc> a(o oVar, C3508cda cda, int i2, PlaySessionSource playSessionSource, long j2) {
        C7471uYa.b(oVar, "playQueue");
        C7471uYa.b(cda, "initialTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        if (oVar.isEmpty()) {
            IPa<C4536zc> a2 = IPa.a(C4536zc.a(com.soundcloud.android.playback.C4536zc.a.MISSING_PLAYABLE_TRACKS));
            C7471uYa.a((Object) a2, "Single.just(PlaybackResu…MISSING_PLAYABLE_TRACKS))");
            return a2;
        } else if (f()) {
            IPa<C4536zc> a3 = IPa.a(C4536zc.a(com.soundcloud.android.playback.C4536zc.a.UNSKIPPABLE));
            C7471uYa.a((Object) a3, "Single.just(PlaybackResu…ErrorReason.UNSKIPPABLE))");
            return a3;
        } else {
            IPa<C4536zc> b2 = IPa.c((Callable<? extends T>) new C4285ba<Object>(oVar, i2, cda, playSessionSource)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4290ca<Object,Object>(this, oVar, cda, playSessionSource)).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4300ea<Object,Object>(this, playSessionSource, i2)).b((C6776kQa<? super VPa>) new C4305fa<Object>(this));
            C7471uYa.a((Object) b2, "Single.fromCallable {\n  … { disposable.dispose() }");
            return b2;
        }
    }

    public void b(long j2) {
        this.c.dispose();
        VPa d2 = this.j.a().e().a((MPa<T>) this.f.b().b((C6776kQa<? super VPa>) new W<Object>(j2))).d((C6776kQa<? super T>) new X<Object>(j2));
        C7471uYa.a((Object) d2, "currentPlayQueueItemProv…          }\n            }");
        this.c = d2;
    }

    public IPa<C4536zc> b(o oVar, C3508cda cda, int i2, PlaySessionSource playSessionSource, long j2) {
        C7471uYa.b(oVar, "playQueue");
        C7471uYa.b(cda, "initialTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa<C4536zc> c2 = a(oVar, cda, i2, playSessionSource, j2).c((C6776kQa<? super T>) new Y<Object>(this, j2));
        C7471uYa.a((Object) c2, "setNewQueue(playQueue, i…          }\n            }");
        return c2;
    }

    public void a(long j2) {
        if (!f()) {
            C4928GKa g2 = this.i.g();
            C7471uYa.a((Object) g2, "currentItemUrn");
            if (!g2.c()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Seeking to ");
                sb.append(j2);
                sb.append(" without item in PlayQueueManager");
                SDb.b(sb.toString(), new Object[0]);
                return;
            }
            this.k.a((C3508cda) g2.b(), j2);
            if (m()) {
                this.f.b().d((C6776kQa<? super T>) new C4280aa<Object>(j2));
            } else {
                this.i.E();
            }
        }
    }

    public void a(String str, Surface surface) {
        C7471uYa.b(str, "uuid");
        C7471uYa.b(surface, "surface");
        VideoAdPlaybackItem a2 = this.h.a(str);
        if (a2 != null) {
            b.a.b(this.g, a2, surface);
            return;
        }
        SDb.b("setVideoSurface() got called but we didn't have an entry in the video ads map for it!", new Object[0]);
    }

    public void a(q qVar) {
        C7471uYa.b(qVar, "playQueueItem");
        if (!C7471uYa.a((Object) this.i.h(), (Object) qVar)) {
            this.n.f();
            e();
            this.i.f(qVar);
        }
    }
}
