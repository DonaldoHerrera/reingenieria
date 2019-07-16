package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.e.C0098d;
import com.soundcloud.android.foundation.events.C3703e;
import com.soundcloud.android.foundation.events.I;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.events.q;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.tracks.C6185ma;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 N2\u00020\u0001:\u0001NBW\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u0018\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0012J2\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010/H\u0012J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020(2\u0006\u00104\u001a\u000205H\u0012J \u00106\u001a\u0002022\u0006\u00103\u001a\u00020(2\u0006\u00107\u001a\u0002082\u0006\u00104\u001a\u000205H\u0012J*\u00109\u001a\u00020\"2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020&2\u0006\u0010)\u001a\u00020*2\b\u0010;\u001a\u0004\u0018\u00010\"H\u0012J\b\u0010<\u001a\u00020=H\u0012J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u00020\u001dH\u0012J\b\u0010@\u001a\u000205H\u0012J\u0018\u0010A\u001a\u00020=2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010B\u001a\u000205H\u0012J\u0018\u0010C\u001a\u00020=2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010B\u001a\u000205H\u0016J\u0018\u0010D\u001a\u00020=2\u0006\u0010E\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001dH\u0016J\u0010\u0010F\u001a\u00020=2\u0006\u0010?\u001a\u00020\u001dH\u0016J\u0010\u0010G\u001a\u00020=2\u0006\u0010+\u001a\u00020\u001cH\u0016J\u0018\u0010H\u001a\u00020=2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010B\u001a\u000205H\u0016J\u0018\u0010I\u001a\u00020\"2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001cH\u0012J\u0010\u0010J\u001a\u00020=2\u0006\u0010+\u001a\u00020\u001cH\u0012J\u0018\u0010K\u001a\u00020=2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010:\u001a\u00020&H\u0012J \u0010L\u001a\u00020M2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010?\u001a\u00020\u001dH\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R4\u0010\u0019\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d \u001e*\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001b0\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010#\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001c0\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n \u001e*\u0004\u0018\u00010\u001c0\u001c0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R4\u0010%\u001a(\u0012$\u0012\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020& \u001e*\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020&\u0018\u00010\u001b0\u001b0\u001aX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lcom/soundcloud/android/playback/TrackSessionAnalyticsDispatcher;", "Lcom/soundcloud/android/playback/PlaybackAnalyticsDispatcher;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "trackRepository", "Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "marketablePlayDetector", "Lcom/soundcloud/android/foundation/events/MarketablePlayDetector;", "stopReasonProvider", "Lcom/soundcloud/android/playback/StopReasonProvider;", "uuidProvider", "Lcom/soundcloud/android/utils/UuidProvider;", "entityItemCreator", "Lcom/soundcloud/android/presentation/EntityItemCreator;", "mobilePlaySession", "Lcom/soundcloud/android/analytics/mobileplay/MobilePlaySessionAnalyticsProvider;", "audioPortTracker", "Lcom/soundcloud/android/playback/AudioPortTracker;", "analytics", "Lcom/soundcloud/android/foundation/events/Analytics;", "(Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/foundation/domain/tracks/TrackRepository;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/foundation/events/MarketablePlayDetector;Lcom/soundcloud/android/playback/StopReasonProvider;Lcom/soundcloud/android/utils/UuidProvider;Lcom/soundcloud/android/presentation/EntityItemCreator;Lcom/soundcloud/android/analytics/mobileplay/MobilePlaySessionAnalyticsProvider;Lcom/soundcloud/android/playback/AudioPortTracker;Lcom/soundcloud/android/foundation/events/Analytics;)V", "appState", "Lcom/soundcloud/android/foundation/events/AppState;", "checkpointEvent", "Lio/reactivex/subjects/PublishSubject;", "Lkotlin/Pair;", "Lcom/soundcloud/android/playback/LocalPlayState;", "Lcom/soundcloud/android/playback/PlaybackProgress;", "kotlin.jvm.PlatformType", "currentTrackSourceInfo", "Lcom/soundcloud/android/foundation/events/TrackSourceInfo;", "lastPlaySessionEvent", "Lcom/soundcloud/android/events/PlaybackSessionEvent;", "newItemEvent", "playEvent", "stopEvent", "Lcom/soundcloud/android/playback/StopReasonProvider$StopReason;", "buildEventArgs", "Lcom/soundcloud/android/events/PlaybackSessionEventArgs;", "track", "Lcom/soundcloud/android/foundation/domain/tracks/Track;", "localPlayState", "position", "", "clientId", "", "playId", "buildPlayEvent", "Lcom/soundcloud/android/events/PlaybackSessionEvent$Play;", "eventArgs", "isFirstPlay", "", "buildPromotedPlayEvent", "promotedSourceInfo", "Lcom/soundcloud/android/foundation/events/PromotedSourceInfo;", "buildStopEvent", "stopReason", "playEventForStop", "initListeners", "", "isForPlayingTrack", "playbackProgress", "lastEventIsNotPlay", "loadTrackIfChanged", "isNewItem", "onPlayTransition", "onProgressCheckpoint", "previousLocalPlayState", "onProgressEvent", "onSkipTransition", "onStopTransition", "playStateToSessionPlayEvent", "publishPlayEvent", "publishStopEvent", "stateTransitionToCheckpointEvent", "Lcom/soundcloud/android/foundation/events/TrackingEvent;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: TrackSessionAnalyticsDispatcher.kt */
public class Jd implements C4535zb {
    public static final long a = TimeUnit.SECONDS.toMillis(30);
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public Faa c;
    private I d;
    /* access modifiers changed from: private */
    public C3703e e;
    private final C6781kVa<Ba> f;
    private final C6781kVa<Ba> g;
    private final C6781kVa<HVa<Ba, com.soundcloud.android.playback.C4298dd.a>> h;
    private final C6781kVa<HVa<Ba, C4519wc>> i;
    private final C5327TLa j;
    /* access modifiers changed from: private */
    public final C3760eea k;
    private final C3814lca l;
    private final q m;
    private final C4298dd n;
    private final C5628bIa o;
    private final C5425Wta p;
    /* access modifiers changed from: private */
    public final C3017gO q;
    private final E r;
    /* access modifiers changed from: private */
    public final C3700b s;

    /* compiled from: TrackSessionAnalyticsDispatcher.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public Jd(C5327TLa tLa, C3760eea eea, C3814lca lca, q qVar, C4298dd ddVar, C5628bIa bia, C5425Wta wta, C3017gO gOVar, E e2, C3700b bVar) {
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(qVar, "marketablePlayDetector");
        C7471uYa.b(ddVar, "stopReasonProvider");
        C7471uYa.b(bia, "uuidProvider");
        C7471uYa.b(wta, "entityItemCreator");
        C7471uYa.b(gOVar, "mobilePlaySession");
        C7471uYa.b(e2, "audioPortTracker");
        C7471uYa.b(bVar, "analytics");
        this.j = tLa;
        this.k = eea;
        this.l = lca;
        this.m = qVar;
        this.n = ddVar;
        this.o = bia;
        this.p = wta;
        this.q = gOVar;
        this.r = e2;
        this.s = bVar;
        C6781kVa<Ba> s2 = C6781kVa.s();
        String str = "PublishSubject.create<LocalPlayState>()";
        C7471uYa.a((Object) s2, str);
        this.f = s2;
        C6781kVa<Ba> s3 = C6781kVa.s();
        C7471uYa.a((Object) s3, str);
        this.g = s3;
        C6781kVa<HVa<Ba, com.soundcloud.android.playback.C4298dd.a>> s4 = C6781kVa.s();
        C7471uYa.a((Object) s4, "PublishSubject.create<Pa…onProvider.StopReason>>()");
        this.h = s4;
        C6781kVa<HVa<Ba, C4519wc>> s5 = C6781kVa.s();
        C7471uYa.a((Object) s5, "PublishSubject.create<Pa…ate, PlaybackProgress>>()");
        this.i = s5;
        a();
    }

    public void a(C4519wc wcVar) {
        C7471uYa.b(wcVar, "playbackProgress");
    }

    private void c(Ba ba, boolean z) {
        if (z) {
            this.f.a(ba);
        }
    }

    public void b(Ba ba, boolean z) {
        C7471uYa.b(ba, "localPlayState");
        c(ba, z);
        b(ba);
    }

    private void b(Ba ba) {
        this.d = this.l.l();
        if (this.d != null && b()) {
            this.g.a(ba);
        }
    }

    private boolean b() {
        Faa faa = this.c;
        return faa == null || !(faa instanceof c);
    }

    private void a() {
        APa k2 = this.f.k(new Wd(this));
        APa d2 = this.g.d((C6776kQa<? super T>) new Pd<Object>(this));
        C7471uYa.a((Object) d2, "playEvent\n            .d….handlePlayEvent(event) }");
        C7471uYa.a((Object) k2, "lastTrack");
        APa a2 = d2.a((EPa<? extends U>) k2, (C6504gQa<? super T, ? super U, ? extends R>) new Kd<Object,Object,Object>(this));
        String str = "withLatestFrom(other, Bi… combiner.invoke(t, u) })";
        C7471uYa.a((Object) a2, str);
        a2.f((C6776kQa<? super T>) new Qd<Object>(this));
        APa d3 = this.h.d((C6776kQa<? super T>) new Rd<Object>(this));
        C7471uYa.a((Object) d3, "stopEvent\n            .d…leStopEvent(pair.first) }");
        APa a3 = d3.a((EPa<? extends U>) k2, (C6504gQa<? super T, ? super U, ? extends R>) new Ld<Object,Object,Object>(this));
        C7471uYa.a((Object) a3, str);
        a3.d((C6776kQa<? super T>) new Sd<Object>(this)).f((C6776kQa<? super T>) new Td<Object>(this));
        APa d4 = this.i.a((C7256rQa<? super T>) new Ud<Object>(this)).d((C6776kQa<? super T>) new Vd<Object>(this));
        C7471uYa.a((Object) d4, "checkpointEvent.filter {…kpointEvent(pair.first) }");
        APa a4 = d4.a((EPa<? extends U>) k2, (C6504gQa<? super T, ? super U, ? extends R>) new Md<Object,Object,Object>(this));
        C7471uYa.a((Object) a4, str);
        a4.f((C6776kQa<? super T>) new Nd<Object>(this));
        C5327TLa tLa = this.j;
        C5443XLa<C3699a> xLa = C3876taa.m;
        C7471uYa.a((Object) xLa, "EventQueue.ACTIVITY_LIFE_CYCLE");
        C5220Pua a5 = C5220Pua.a((C6776kQa<T>) new Od<T>(this));
        C7471uYa.a((Object) a5, "LambdaObserver.onNext {\n…tate.BACKGROUND\n        }");
        tLa.a(xLa, (SUa<E>) a5);
    }

    /* access modifiers changed from: private */
    public Faa b(C3509cea cea, Ba ba) {
        c cVar;
        Gaa a2 = a(cea, ba);
        com.soundcloud.android.foundation.playqueue.q h2 = this.l.h();
        C7471uYa.a((Object) h2, "it");
        boolean z = h2.j() && this.l.f(h2.c());
        PlaySessionSource i2 = this.l.i();
        C7471uYa.a((Object) i2, "playQueueManager.currentPlaySessionSource");
        PromotedSourceInfo h3 = i2.h();
        if (!z || h3 == null || h3.e()) {
            cVar = a(a2, ba.u());
        } else {
            h3.g();
            cVar = a(a2, h3, ba.u());
        }
        this.c = cVar;
        return cVar;
    }

    /* access modifiers changed from: private */
    public boolean b(C4519wc wcVar) {
        Faa faa = this.c;
        return faa != null && C7471uYa.a((Object) faa.k().j().a(), (Object) wcVar.e());
    }

    public void a(Ba ba, boolean z) {
        C7471uYa.b(ba, "localPlayState");
        c(ba, z);
        com.soundcloud.android.playback.C4298dd.a a2 = this.n.a(ba);
        C7471uYa.a((Object) a2, "stopReasonProvider.fromTransition(localPlayState)");
        a(ba, a2);
    }

    public void a(Ba ba) {
        C7471uYa.b(ba, "localPlayState");
        a(ba, com.soundcloud.android.playback.C4298dd.a.STOP_REASON_SKIP);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (r0 != null) goto L_0x0028;
     */
    public void a(Ba ba, C4519wc wcVar) {
        String str;
        C7471uYa.b(ba, "previousLocalPlayState");
        C7471uYa.b(wcVar, "playbackProgress");
        this.i.a(NVa.a(ba, wcVar));
        C3700b bVar = this.s;
        I l2 = this.l.l();
        if (l2 != null) {
            str = l2.b();
        }
        str = "unknown";
        bVar.a((C3702d) new C0098d(str));
    }

    private Gaa a(C3509cea cea, Ba ba) {
        if (ba.u()) {
            return a(cea, ba.getPosition(), ba, ba.c(), (String) null);
        }
        long position = ba.getPosition();
        String a2 = this.o.a();
        C7471uYa.a((Object) a2, "uuidProvider.randomUuid");
        return a(cea, position, ba, a2, ba.c());
    }

    private c a(Gaa gaa, boolean z) {
        if (z) {
            return new C0070c(gaa);
        }
        return new b(gaa);
    }

    private c a(Gaa gaa, PromotedSourceInfo promotedSourceInfo, boolean z) {
        if (z) {
            return new b(gaa, promotedSourceInfo);
        }
        return new C0067a(gaa, promotedSourceInfo);
    }

    private void a(Ba ba, com.soundcloud.android.playback.C4298dd.a aVar) {
        if (this.c != null && this.d != null) {
            this.h.a(NVa.a(ba, aVar));
        }
    }

    /* access modifiers changed from: private */
    public J a(C3509cea cea, Ba ba, C4519wc wcVar) {
        long d2 = wcVar.d();
        String a2 = this.o.a();
        C7471uYa.a((Object) a2, "uuidProvider.randomUuid");
        return new defpackage.Faa.a(a(cea, d2, ba, a2, ba.c()));
    }

    /* access modifiers changed from: private */
    public Faa a(Ba ba, com.soundcloud.android.playback.C4298dd.a aVar, C3509cea cea, Faa faa) {
        long position = ba.getPosition();
        String a2 = this.o.a();
        C7471uYa.a((Object) a2, "uuidProvider.randomUuid");
        Gaa a3 = a(cea, position, ba, a2, ba.c());
        String a4 = aVar.a();
        C7471uYa.a((Object) a4, "stopReason.key()");
        return new d(a3, faa, a4);
    }

    private Gaa a(C3509cea cea, long j2, Ba ba, String str, String str2) {
        defpackage.Gaa.a aVar = Gaa.a;
        C3509cea cea2 = cea;
        C6185ma a2 = this.p.a(cea);
        C7471uYa.a((Object) a2, "entityItemCreator.trackItem(track)");
        I i2 = this.d;
        b bVar = new b(ba.n(), ba.a(), ba.t(), ba.d(), ba.e());
        return aVar.a(a2, i2, j2, bVar, this.r.a(), this.e, this.m.a(), str, str2);
    }
}
