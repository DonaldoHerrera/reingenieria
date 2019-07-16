package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.u;
import java.util.List;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u00019B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J<\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00192\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0012J:\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"0\u00142\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J,\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J<\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010&\u001a\u00020\u000e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u001dH\u0016J(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010,\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0017JD\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0\u00142\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0017J,\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J*\u00100\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\"0\u00142\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u00101\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0012J(\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0017J(\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u001fH\u0017J&\u00105\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u00106\u001a\u00020\u000e2\u0006\u00103\u001a\u0002042\u0006\u00107\u001a\u000208H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/soundcloud/android/playback/PlaybackInitiator;", "", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "playSessionController", "Lcom/soundcloud/android/playback/PlaySessionController;", "playQueueFactory", "Lcom/soundcloud/android/playback/PlayQueueFactory;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/playback/PlaySessionController;Lcom/soundcloud/android/playback/PlayQueueFactory;Lio/reactivex/Scheduler;)V", "isCurrentPlayQueueOrRecommendationState", "", "trackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "playSessionSource", "Lcom/soundcloud/android/foundation/playqueue/PlaySessionSource;", "isCurrentScreenSource", "isCurrentTrack", "playByParams", "Lio/reactivex/Single;", "Lcom/soundcloud/android/playback/PlaybackResult;", "playParams", "Lcom/soundcloud/android/playback/PlaybackInitiator$PlayParams;", "playNewQueue", "Lkotlin/Function1;", "Lcom/soundcloud/android/foundation/playqueue/PlayQueue;", "initialTrack", "trackIndex", "", "fromPosition", "", "playPosts", "playables", "", "Lcom/soundcloud/android/foundation/playqueue/PlayableWithReposter;", "position", "playStation", "stationUrn", "stationTracks", "Lcom/soundcloud/android/foundation/domain/stations/StationTrack;", "clickedTrack", "playQueuePosition", "playTrackWithRecommendations", "track", "playTracks", "allTracks", "trackUrns", "playTracksShuffled", "shouldChangePlayQueue", "startPlayback", "screen", "Lcom/soundcloud/android/foundation/domain/Screen;", "startPlaybackWithRecommendations", "urn", "searchQuerySourceInfo", "Lcom/soundcloud/android/foundation/events/SearchQuerySourceInfo;", "PlayParams", "base_release"}, mv = {1, 1, 15})
/* compiled from: PlaybackInitiator.kt */
public class Db {
    private final C3814lca a;
    /* access modifiers changed from: private */
    public final C4412qb b;
    private final C4336lb c;
    private final HPa d;

    @EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u001aB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/playback/PlaybackInitiator$PlayParams;", "", "playables", "", "Lcom/soundcloud/android/foundation/playqueue/PlayableWithReposter;", "clickedPosition", "", "playSessionSource", "Lcom/soundcloud/android/foundation/playqueue/PlaySessionSource;", "(Ljava/util/List;ILcom/soundcloud/android/foundation/playqueue/PlaySessionSource;)V", "getClickedPosition", "()I", "getPlaySessionSource", "()Lcom/soundcloud/android/foundation/playqueue/PlaySessionSource;", "getPlayables", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Builder", "base_release"}, mv = {1, 1, 15})
    /* compiled from: PlaybackInitiator.kt */
    public static final class a {
        private final List<u> a;
        private final int b;
        private final PlaySessionSource c;

        /* renamed from: com.soundcloud.android.playback.Db$a$a reason: collision with other inner class name */
        /* compiled from: PlaybackInitiator.kt */
        public static final class C0132a {
            private final List<u> a;
            private final PlaySessionSource b;

            public C0132a(List<? extends u> list, PlaySessionSource playSessionSource) {
                C7471uYa.b(list, "playables");
                C7471uYa.b(playSessionSource, "playSessionSource");
                this.a = list;
                this.b = playSessionSource;
            }

            public final a a(int i) {
                return new a(this.a, i, this.b);
            }
        }

        public a(List<? extends u> list, int i, PlaySessionSource playSessionSource) {
            C7471uYa.b(list, "playables");
            C7471uYa.b(playSessionSource, "playSessionSource");
            this.a = list;
            this.b = i;
            this.c = playSessionSource;
        }

        public final int a() {
            return this.b;
        }

        public final PlaySessionSource b() {
            return this.c;
        }

        public final List<u> c() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.a, (Object) aVar.a)) {
                        if (!(this.b == aVar.b) || !C7471uYa.a((Object) this.c, (Object) aVar.c)) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<u> list = this.a;
            int i = 0;
            int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.b) * 31;
            PlaySessionSource playSessionSource = this.c;
            if (playSessionSource != null) {
                i = playSessionSource.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PlayParams(playables=");
            sb.append(this.a);
            sb.append(", clickedPosition=");
            sb.append(this.b);
            sb.append(", playSessionSource=");
            sb.append(this.c);
            sb.append(")");
            return sb.toString();
        }
    }

    public Db(C3814lca lca, C4412qb qbVar, C4336lb lbVar, HPa hPa) {
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(qbVar, "playSessionController");
        C7471uYa.b(lbVar, "playQueueFactory");
        C7471uYa.b(hPa, "mainThreadScheduler");
        this.a = lca;
        this.b = qbVar;
        this.c = lbVar;
        this.d = hPa;
    }

    public IPa<C4536zc> a(C3508cda cda, Yca yca) {
        return a(this, cda, yca, 0, 4, (Object) null);
    }

    public IPa<C4536zc> b(C3508cda cda, PlaySessionSource playSessionSource, long j) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(playSessionSource, "playSessionSource");
        this.a.d();
        return a(cda, playSessionSource, j);
    }

    public static /* synthetic */ IPa a(Db db, C3508cda cda, Yca yca, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = 0;
            }
            return db.a(cda, yca, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlayback");
    }

    public IPa<C4536zc> b(List<C3508cda> list, int i, PlaySessionSource playSessionSource) {
        C7471uYa.b(list, "trackUrns");
        C7471uYa.b(playSessionSource, "playSessionSource");
        if (list.isEmpty()) {
            IPa<C4536zc> a2 = IPa.a(C4536zc.a(com.soundcloud.android.playback.C4536zc.a.MISSING_PLAYABLE_TRACKS));
            C7471uYa.a((Object) a2, "Single.just(PlaybackResu…MISSING_PLAYABLE_TRACKS))");
            return a2;
        }
        IPa a3 = IPa.a(list);
        C7471uYa.a((Object) a3, "Single.just(trackUrns)");
        return a(this, a3, (C3508cda) list.get(i), i, playSessionSource, 0, 16, null);
    }

    public IPa<C4536zc> a(C3508cda cda, Yca yca, long j) {
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(yca, "screen");
        return b(cda, new PlaySessionSource(yca), j);
    }

    public static /* synthetic */ IPa a(Db db, C3508cda cda, PlaySessionSource playSessionSource, long j, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                j = 0;
            }
            return db.b(cda, playSessionSource, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPlayback");
    }

    private boolean b(C3508cda cda, PlaySessionSource playSessionSource) {
        return this.a.x() || !a(cda) || !a(playSessionSource) || !this.a.c(playSessionSource.d());
    }

    public IPa<C4536zc> a(C3508cda cda, PlaySessionSource playSessionSource, long j) {
        C7471uYa.b(cda, "track");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa a2 = IPa.a(C6850lWa.a(cda));
        C7471uYa.a((Object) a2, "Single.just(listOf(track))");
        return a(a2, cda, 0, playSessionSource, j);
    }

    public IPa<C4536zc> a(List<? extends u> list, int i, PlaySessionSource playSessionSource) {
        C7471uYa.b(list, "playables");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa a2 = IPa.a(list);
        C7471uYa.a((Object) a2, "Single.just(playables)");
        C3508cda b2 = ((u) list.get(i)).b();
        C7471uYa.a((Object) b2, "playables[position].urn");
        return a(a2, b2, i, playSessionSource);
    }

    public IPa<C4536zc> a(IPa<List<u>> iPa, C3508cda cda, int i, PlaySessionSource playSessionSource) {
        C7471uYa.b(iPa, "playables");
        C7471uYa.b(cda, "initialTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa e = iPa.e(Fb.a);
        C7471uYa.a((Object) e, "playables.map { it.map { track -> track.urn } }");
        return a(this, e, cda, i, playSessionSource, 0, 16, null);
    }

    public IPa<C4536zc> a(a aVar) {
        C7471uYa.b(aVar, "playParams");
        return a(aVar.c(), aVar.a(), aVar.b());
    }

    public static /* synthetic */ IPa a(Db db, IPa iPa, C3508cda cda, int i, PlaySessionSource playSessionSource, long j, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 16) != 0) {
                j = 0;
            }
            return db.a(iPa, cda, i, playSessionSource, j);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playTracks");
    }

    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r9v1, types: [com.soundcloud.android.playback.Hb] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public IPa<C4536zc> a(IPa<List<C3508cda>> iPa, C3508cda cda, int i, PlaySessionSource playSessionSource, long j) {
        C7471uYa.b(iPa, "allTracks");
        C7471uYa.b(cda, "initialTrack");
        C7471uYa.b(playSessionSource, "playSessionSource");
        if (!b(cda, playSessionSource)) {
            this.b.b(j);
            IPa<C4536zc> a2 = IPa.a(C4536zc.c());
            C7471uYa.a((Object) a2, "Single.just(PlaybackResult.success())");
            return a2;
        }
        IPa a3 = this.c.a(iPa, playSessionSource, i, cda);
        _Xa a4 = a(cda, i, playSessionSource, j);
        if (a4 != 0) {
            a4 = new Hb(a4);
        }
        IPa<C4536zc> a5 = a3.a((C7118pQa) a4).a(this.d);
        C7471uYa.a((Object) a5, "playQueueFactory.create(…veOn(mainThreadScheduler)");
        return a5;
    }

    private _Xa<o, IPa<C4536zc>> a(C3508cda cda, int i, PlaySessionSource playSessionSource, long j) {
        Eb eb = new Eb(this, i, cda, playSessionSource, j);
        return eb;
    }

    public IPa<C4536zc> a(C3508cda cda, List<Tda> list, PlaySessionSource playSessionSource, C3508cda cda2, int i) {
        C7471uYa.b(cda, "stationUrn");
        C7471uYa.b(list, "stationTracks");
        C7471uYa.b(playSessionSource, "playSessionSource");
        C7471uYa.b(cda2, "clickedTrack");
        if (a(cda2, playSessionSource)) {
            IPa<C4536zc> a2 = IPa.a(C4536zc.c());
            C7471uYa.a((Object) a2, "Single.just(PlaybackResult.success())");
            return a2;
        }
        o a3 = o.a(cda, list, playSessionSource);
        C4412qb qbVar = this.b;
        C7471uYa.a((Object) a3, "playQueue");
        C3508cda m = a3.m(i);
        C7471uYa.a((Object) m, "playQueue.getUrn(playQueuePosition)");
        return qbVar.b(a3, m, i, playSessionSource, 0);
    }

    public IPa<C4536zc> a(IPa<List<C3508cda>> iPa, PlaySessionSource playSessionSource) {
        C7471uYa.b(iPa, "allTracks");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa<C4536zc> a2 = this.c.a(iPa, playSessionSource).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new Gb<Object,Object>(this, playSessionSource)).a(this.d);
        C7471uYa.a((Object) a2, "playQueueFactory.createS…veOn(mainThreadScheduler)");
        return a2;
    }

    private boolean a(PlaySessionSource playSessionSource) {
        return C7471uYa.a((Object) playSessionSource.g(), (Object) this.a.r());
    }

    private boolean a(C3508cda cda) {
        return this.a.e(cda);
    }

    private boolean a(C3508cda cda, PlaySessionSource playSessionSource) {
        return a(cda) && a(playSessionSource) && this.a.c(playSessionSource.d());
    }
}
