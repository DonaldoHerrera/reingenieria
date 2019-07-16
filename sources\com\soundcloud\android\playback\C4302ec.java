package com.soundcloud.android.playback;

import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import com.soundcloud.android.ads.Yb;
import com.soundcloud.android.discovery.systemplaylist.E;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.foundation.playqueue.l;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.foundation.playqueue.r;
import java.lang.ref.WeakReference;
import java.util.List;

@EVa(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 F2\u00020\u0001:\u0004DEFGBi\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0002\u0010$J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0002\u0010(J\b\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0002J\u0016\u0010/\u001a\b\u0012\u0004\u0012\u0002000&2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020,H\u0002J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000202H\u0016J\u0012\u00109\u001a\u00020,2\b\u0010:\u001a\u0004\u0018\u00010\u001dH\u0016J\u0010\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0016J\u001c\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0A0&2\u0006\u00108\u001a\u00020CH\u0002R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/soundcloud/android/playback/PlaybackMediaProvider;", "Lcom/soundcloud/android/playback/players/queue/MediaProvider;", "playQueueUpdates", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;", "playSessionController", "Lcom/soundcloud/android/playback/PlaySessionController;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "playQueueFactory", "Lcom/soundcloud/android/playback/PlayQueueFactory;", "playbackItemOperations", "Lcom/soundcloud/android/playback/PlaybackItemOperations;", "metadataOperations", "Lcom/soundcloud/android/playback/mediasession/MetadataOperations;", "playerAdsController", "Lcom/soundcloud/android/ads/PlayerAdsController;", "currentPlayQueueItemProvider", "Lcom/soundcloud/android/playback/CurrentPlayQueueItemProvider;", "playSessionStateProvider", "Lcom/soundcloud/android/playback/PlaySessionStateProvider;", "playlistOperations", "Lcom/soundcloud/android/playlists/PlaylistOperations;", "systemPlaylistOperations", "Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistOperations;", "mainScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/foundation/playqueue/PlayQueueUpdates;Lcom/soundcloud/android/playback/PlaySessionController;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/playback/PlayQueueFactory;Lcom/soundcloud/android/playback/PlaybackItemOperations;Lcom/soundcloud/android/playback/mediasession/MetadataOperations;Lcom/soundcloud/android/ads/PlayerAdsController;Lcom/soundcloud/android/playback/CurrentPlayQueueItemProvider;Lcom/soundcloud/android/playback/PlaySessionStateProvider;Lcom/soundcloud/android/playlists/PlaylistOperations;Lcom/soundcloud/android/discovery/systemplaylist/SystemPlaylistOperations;Lio/reactivex/Scheduler;)V", "queueChangeListener", "Ljava/lang/ref/WeakReference;", "Lcom/soundcloud/android/playback/players/queue/QueueChangedListener;", "appToPlaybackQueueItem", "Lcom/soundcloud/android/playback/PlaybackMediaProvider$AppPlaybackData;", "playQueueItem", "Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;", "position", "", "(Lcom/soundcloud/android/foundation/playqueue/PlayQueueItem;Ljava/lang/Long;)Lcom/soundcloud/android/playback/PlaybackMediaProvider$AppPlaybackData;", "getCurrentQueueItem", "Lio/reactivex/Single;", "Lcom/soundcloud/android/playback/players/queue/PlaybackData;", "(Ljava/lang/Long;)Lio/reactivex/Single;", "isQueueEmpty", "", "onPlayQueueItemChanged", "", "currentPlayQueueItemEvent", "Lcom/soundcloud/android/foundation/playqueue/CurrentPlayQueueItemEvent;", "parseMediaId", "Lcom/soundcloud/android/playback/PlaybackMediaProvider$NewQueueMetadata;", "serializedMediaId", "", "playQueue", "Lcom/soundcloud/android/playback/players/queue/MediaSessionQueue;", "reconfigureUpcomingAdForNextTrackIfNeeded", "replaceQueueBasedOnMediaId", "Lio/reactivex/Completable;", "mediaId", "setQueueChangedListener", "listener", "skipToNextQueueItem", "Lcom/soundcloud/android/playback/players/queue/SkipResult;", "skipTrigger", "Lcom/soundcloud/android/playback/players/queue/SkipTrigger;", "skipToPreviousQueueItem", "trackEmitterForMediaId", "", "Lcom/soundcloud/android/foundation/domain/Urn;", "Lcom/soundcloud/android/foundation/media/MediaId;", "AppPlayQueue", "AppPlaybackData", "Companion", "NewQueueMetadata", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.playback.ec reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
public final class C4302ec implements C4609lna {
    public static final c a = new c(null);
    /* access modifiers changed from: private */
    public WeakReference<C4641pna> b;
    /* access modifiers changed from: private */
    public final C4412qb c;
    private final C3814lca d;
    /* access modifiers changed from: private */
    public final C4336lb e;
    private final Qb f;
    private final Fma g;
    private final Yb h;
    private final P i;
    private final C4416rb j;
    private final C4909Fra k;
    private final E l;
    private final HPa m;

    /* renamed from: com.soundcloud.android.playback.ec$a */
    /* compiled from: PlaybackMediaProvider.kt */
    public static final class a implements C4617mna {
        private final IPa<List<QueueItem>> a;

        public a(IPa<List<QueueItem>> iPa) {
            C7471uYa.b(iPa, "queueItems");
            this.a = iPa;
        }

        public IPa<List<QueueItem>> a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) a(), (java.lang.Object) ((com.soundcloud.android.playback.C4302ec.a) r2).a()) != false) goto L_0x0019;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            IPa a2 = a();
            if (a2 != null) {
                return a2.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AppPlayQueue(queueItems=");
            sb.append(a());
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.playback.ec$b */
    /* compiled from: PlaybackMediaProvider.kt */
    public static final class b implements C4625nna {
        private final APa<MediaMetadataCompat> a;
        private final IPa<C4633ona> b;

        public b(APa<MediaMetadataCompat> aPa, IPa<C4633ona> iPa) {
            C7471uYa.b(aPa, "mediaMetadataCompat");
            C7471uYa.b(iPa, "playbackItem");
            this.a = aPa;
            this.b = iPa;
        }

        public IPa<C4633ona> a() {
            return this.b;
        }

        public APa<MediaMetadataCompat> b() {
            return this.a;
        }
    }

    /* renamed from: com.soundcloud.android.playback.ec$c */
    /* compiled from: PlaybackMediaProvider.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: com.soundcloud.android.playback.ec$d */
    /* compiled from: PlaybackMediaProvider.kt */
    private static final class d {
        private final o a;
        private final C3508cda b;
        private final int c;
        private final PlaySessionSource d;

        public d(o oVar, C3508cda cda, int i, PlaySessionSource playSessionSource) {
            C7471uYa.b(oVar, "playQueue");
            C7471uYa.b(cda, "initialTrack");
            C7471uYa.b(playSessionSource, "playSessionSource");
            this.a = oVar;
            this.b = cda;
            this.c = i;
            this.d = playSessionSource;
        }

        public final C3508cda a() {
            return this.b;
        }

        public final o b() {
            return this.a;
        }

        public final PlaySessionSource c() {
            return this.d;
        }

        public final int d() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    if (C7471uYa.a((Object) this.a, (Object) dVar.a) && C7471uYa.a((Object) this.b, (Object) dVar.b)) {
                        if (!(this.c == dVar.c) || !C7471uYa.a((Object) this.d, (Object) dVar.d)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            o oVar = this.a;
            int i = 0;
            int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
            C3508cda cda = this.b;
            int hashCode2 = (((hashCode + (cda != null ? cda.hashCode() : 0)) * 31) + this.c) * 31;
            PlaySessionSource playSessionSource = this.d;
            if (playSessionSource != null) {
                i = playSessionSource.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("NewQueueMetadata(playQueue=");
            sb.append(this.a);
            sb.append(", initialTrack=");
            sb.append(this.b);
            sb.append(", trackIndex=");
            sb.append(this.c);
            sb.append(", playSessionSource=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    public C4302ec(r rVar, C4412qb qbVar, C3814lca lca, C4336lb lbVar, Qb qb, Fma fma, Yb yb, P p, C4416rb rbVar, C4909Fra fra, E e2, HPa hPa) {
        C7471uYa.b(rVar, "playQueueUpdates");
        C7471uYa.b(qbVar, "playSessionController");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(lbVar, "playQueueFactory");
        C7471uYa.b(qb, "playbackItemOperations");
        C7471uYa.b(fma, "metadataOperations");
        C7471uYa.b(yb, "playerAdsController");
        C7471uYa.b(p, "currentPlayQueueItemProvider");
        C7471uYa.b(rbVar, "playSessionStateProvider");
        C7471uYa.b(fra, "playlistOperations");
        C7471uYa.b(e2, "systemPlaylistOperations");
        C7471uYa.b(hPa, "mainScheduler");
        this.c = qbVar;
        this.d = lca;
        this.e = lbVar;
        this.f = qb;
        this.g = fma;
        this.h = yb;
        this.i = p;
        this.j = rbVar;
        this.k = fra;
        this.l = e2;
        this.m = hPa;
        rVar.a().f((C6776kQa<? super T>) new C4292cc<Object>(this));
        rVar.b().f((C6776kQa<? super T>) new C4297dc<Object>(this));
    }

    /* access modifiers changed from: private */
    public final C4617mna b() {
        IPa f2 = IPa.f();
        C7471uYa.a((Object) f2, "Single.never()");
        return new a(f2);
    }

    private final void c() {
        this.h.g();
        this.h.f();
    }

    private final IPa<d> b(String str) {
        PlaySessionSource playSessionSource = PlaySessionSource.a;
        C3880tea a2 = C3880tea.a.a(str);
        IPa<d> e2 = a(a2).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4327jc<Object,Object>(this, playSessionSource, 0, a2)).e(new C4332kc(a2, 0, playSessionSource));
        C7471uYa.a((Object) e2, "trackEmitterForMediaId(m…          )\n            }");
        return e2;
    }

    /* access modifiers changed from: private */
    public final void a(k kVar) {
        q b2 = kVar.b();
        if ((b2.j() || b2.e()) && !l.a(kVar)) {
            this.j.a(b2.c());
        }
        WeakReference<C4641pna> weakReference = this.b;
        if (weakReference != null) {
            C4641pna pna = (C4641pna) weakReference.get();
            if (pna != null) {
                Long l2 = null;
                if (b2.j()) {
                    if (!l.a(kVar)) {
                        l2 = Long.valueOf(0);
                    }
                } else if (b2.e()) {
                    l2 = Long.valueOf(0);
                }
                pna.a((C4625nna) a(b2, l2));
            }
        }
    }

    public C4677tna b(C4686una una) {
        C7471uYa.b(una, "skipTrigger");
        if (!this.d.t()) {
            return defpackage.C4677tna.a.a;
        }
        c();
        return una == C4686una.Completion ? this.d.c() ? defpackage.C4677tna.b.a : defpackage.C4677tna.a.a : this.c.h() ? defpackage.C4677tna.b.a : defpackage.C4677tna.a.a;
    }

    public IPa<C4625nna> a(Long l2) {
        IPa<C4625nna> e2 = this.i.a().e(new C4322ic(this, l2));
        C7471uYa.a((Object) e2, "currentPlayQueueItemProv…QueueItem(it, position) }");
        return e2;
    }

    public boolean a() {
        if (!this.d.x() && this.d.h() != null) {
            q h2 = this.d.h();
            C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
            if (!h2.g()) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public final b a(q qVar, Long l2) {
        long j2;
        if (qVar.g()) {
            APa e2 = APa.e();
            C7471uYa.a((Object) e2, "Observable.empty()");
            IPa a2 = IPa.a(new defpackage.C4633ona.a(defpackage.C4633ona.b.a.a));
            C7471uYa.a((Object) a2, "Single.just(Failure(FailureReaction.None))");
            return new b(e2, a2);
        }
        Fma fma = this.g;
        C3508cda c2 = qVar.c();
        C7471uYa.a((Object) c2, "playQueueItem.urn");
        APa a3 = Fma.a(fma, c2, null, 2, null);
        Qb qb = this.f;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            C4519wc c3 = this.j.c(qVar.c());
            C7471uYa.a((Object) c3, "playSessionStateProvider…orItem(playQueueItem.urn)");
            j2 = c3.d();
        }
        IPa f2 = qb.a(qVar, j2).f(C4307fc.a).h().a((C6776kQa<? super Throwable>) C4312gc.a).f(C4317hc.a);
        C7471uYa.a((Object) f2, "playbackItemOperations.p…  }\n                    }");
        return new b(a3, f2);
    }

    public C6979nPa a(String str) {
        C7471uYa.b(str, "mediaId");
        C6979nPa e2 = b(str).a(this.m).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4337lc<Object,Object>(this)).e();
        C7471uYa.a((Object) e2, "parseMediaId(mediaId)\n  …        }.ignoreElement()");
        return e2;
    }

    private final IPa<List<C3508cda>> a(C3880tea tea) {
        if (tea.b().x()) {
            IPa<List<C3508cda>> a2 = IPa.a(C6850lWa.a(tea.b()));
            C7471uYa.a((Object) a2, "Single.just(listOf(urn))");
            return a2;
        } else if (tea.b().u()) {
            return this.k.c(tea.b());
        } else {
            if (tea.b().w()) {
                IPa<List<C3508cda>> d2 = this.l.b(tea.b()).f(C4342mc.a).d(C6918mWa.a());
                C7471uYa.a((Object) d2, "systemPlaylistOperations…   .toSingle(emptyList())");
                return d2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported URN for playback ");
            sb.append(tea.b());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C4677tna a(C4686una una) {
        C7471uYa.b(una, "skipTrigger");
        return this.c.k() ? defpackage.C4677tna.b.a : defpackage.C4677tna.a.a;
    }

    public void a(C4641pna pna) {
        this.b = new WeakReference<>(pna);
    }
}
