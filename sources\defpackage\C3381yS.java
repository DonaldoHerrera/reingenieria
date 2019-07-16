package defpackage;

import android.content.Context;
import android.view.Surface;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0666s;
import com.google.android.gms.cast.framework.media.C0650e;
import com.google.android.gms.cast.framework.media.C0650e.C0042e;
import com.soundcloud.android.ads.Na;
import com.soundcloud.android.cast.H;
import com.soundcloud.android.cast.r;
import com.soundcloud.android.cast.t;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.C4350oa;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.players.l;
import org.json.JSONObject;

@EVa(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 K2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002KLB_\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0002\u0010\u001aJ\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020*H\u0012J\u000f\u0010,\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0002\u0010.J\b\u0010/\u001a\u00020\"H\u0016J\b\u00100\u001a\u00020\"H\u0016J\b\u00101\u001a\u00020\"H\u0012J\u0010\u00102\u001a\u00020*2\u0006\u00103\u001a\u00020\"H\u0012J\b\u00104\u001a\u00020*H\u0016J\u0018\u00105\u001a\u00020*2\u0006\u00106\u001a\u00020-2\u0006\u00107\u001a\u00020-H\u0016J\b\u00108\u001a\u00020*H\u0016J\b\u00109\u001a\u00020*H\u0016J\u0010\u0010:\u001a\u00020*2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020*2\u0006\u0010>\u001a\u00020$H\u0012J\u0010\u0010?\u001a\u00020*2\u0006\u00106\u001a\u00020-H\u0016J\u0010\u0010@\u001a\u00020*2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010A\u001a\u00020*H\u0016J\b\u0010B\u001a\u00020*H\u0016J\u0010\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020EH\u0012J\u0018\u0010F\u001a\u00020*2\u0006\u0010G\u001a\u00020E2\u0006\u0010H\u001a\u00020IH\u0012J\u000e\u0010J\u001a\u00020\"*\u0004\u0018\u00010&H\u0012R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001e8RX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\u0004\u0018\u00010&8RX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006M"}, d2 = {"Lcom/soundcloud/android/cast/playback/CastPlayback;", "Lcom/soundcloud/android/playback/players/playback/Playback;", "Lcom/soundcloud/android/cast/SimpleRemoteMediaClientListener;", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient$ProgressListener;", "context", "Landroid/content/Context;", "googleApiWrapper", "Lcom/soundcloud/android/playback/players/utilities/GoogleApiWrapper;", "castProtocol", "Lcom/soundcloud/android/cast/api/CastProtocol;", "playQueueManager", "Lcom/soundcloud/android/features/playqueue/PlayQueueManager;", "playSessionStateProvider", "Lcom/soundcloud/android/playback/DefaultPlaySessionStateProvider;", "castQueueController", "Lcom/soundcloud/android/cast/CastQueueController;", "castQueueSlicer", "Lcom/soundcloud/android/cast/CastQueueSlicer;", "adsOperations", "Lcom/soundcloud/android/ads/AdsOperations;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "eventBus", "Lcom/soundcloud/rx/eventbus/EventBus;", "playbackStateCompatFactory", "Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;", "(Landroid/content/Context;Lcom/soundcloud/android/playback/players/utilities/GoogleApiWrapper;Lcom/soundcloud/android/cast/api/CastProtocol;Lcom/soundcloud/android/features/playqueue/PlayQueueManager;Lcom/soundcloud/android/playback/DefaultPlaySessionStateProvider;Lcom/soundcloud/android/cast/CastQueueController;Lcom/soundcloud/android/cast/CastQueueSlicer;Lcom/soundcloud/android/ads/AdsOperations;Lcom/soundcloud/android/playback/core/Logger;Lcom/soundcloud/rx/eventbus/EventBus;Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;)V", "callback", "Lcom/soundcloud/android/playback/players/playback/Playback$Callback;", "castSession", "Lcom/google/android/gms/cast/framework/CastSession;", "getCastSession", "()Lcom/google/android/gms/cast/framework/CastSession;", "isMediaLoadingToBePlayed", "", "lastReportedState", "Lcom/soundcloud/android/cast/playback/CastPlayback$ReportedState;", "remoteMediaClient", "Lcom/google/android/gms/cast/framework/media/RemoteMediaClient;", "getRemoteMediaClient", "()Lcom/google/android/gms/cast/framework/media/RemoteMediaClient;", "destroy", "", "disposeSessionListeners", "getStreamPosition", "", "()Ljava/lang/Long;", "isBuffering", "isPlaying", "isRemoteQueueEmpty", "loadLocalOnRemote", "autoplay", "onMetadataUpdated", "onProgressUpdated", "position", "duration", "onStatusUpdated", "pause", "play", "playbackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "reportState", "state", "seek", "setCallback", "start", "stop", "updateLocalPlayQueue", "remoteQueue", "Lcom/soundcloud/android/cast/api/CastPlayQueue;", "updateRemoteQueue", "currentRemoteQueue", "currentLocalTrackUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "hasMediaSession", "Companion", "ReportedState", "base_release"}, mv = {1, 1, 15})
/* renamed from: yS reason: default package and case insensitive filesystem */
/* compiled from: CastPlayback.kt */
public class C3381yS extends H implements C3952ana, C0042e {
    public static final a a = new a(null);
    private b b;
    private boolean c;
    private defpackage.C3952ana.a d;
    private final Context e;
    private final C4695vna f;
    private final C3281tS g;
    private final C3814lca h;
    private final C4350oa i;
    private final r j;
    private final t k;
    private final Na l;
    private final d m;
    private final C5327TLa n;
    private final l o;

    /* renamed from: yS$a */
    /* compiled from: CastPlayback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: yS$b */
    /* compiled from: CastPlayback.kt */
    private static final class b {
        private final C3508cda a;
        private final int b;
        private final long c;
        private final long d;

        public b(C3508cda cda, int i, long j, long j2) {
            C7471uYa.b(cda, "urn");
            this.a = cda;
            this.b = i;
            this.c = j;
            this.d = j2;
        }

        public static /* synthetic */ b a(b bVar, C3508cda cda, int i, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                cda = bVar.a;
            }
            if ((i2 & 2) != 0) {
                i = bVar.b;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = bVar.c;
            }
            long j3 = j;
            if ((i2 & 8) != 0) {
                j2 = bVar.d;
            }
            return bVar.a(cda, i3, j3, j2);
        }

        public final long a() {
            return this.d;
        }

        public final b a(C3508cda cda, int i, long j, long j2) {
            C7471uYa.b(cda, "urn");
            b bVar = new b(cda, i, j, j2);
            return bVar;
        }

        public final int b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final C3508cda d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) this.a, (Object) bVar.a)) {
                        if (this.b == bVar.b) {
                            if (this.c == bVar.c) {
                                if (this.d == bVar.d) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            C3508cda cda = this.a;
            int hashCode = (((cda != null ? cda.hashCode() : 0) * 31) + this.b) * 31;
            long j = this.c;
            int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ReportedState(urn=");
            sb.append(this.a);
            sb.append(", playbackStateCompat=");
            sb.append(this.b);
            sb.append(", position=");
            sb.append(this.c);
            sb.append(", duration=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    public C3381yS(Context context, C4695vna vna, C3281tS tSVar, C3814lca lca, C4350oa oaVar, r rVar, t tVar, Na na, d dVar, C5327TLa tLa, l lVar) {
        C7471uYa.b(context, "context");
        C7471uYa.b(vna, "googleApiWrapper");
        C7471uYa.b(tSVar, "castProtocol");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(oaVar, "playSessionStateProvider");
        C7471uYa.b(rVar, "castQueueController");
        C7471uYa.b(tVar, "castQueueSlicer");
        C7471uYa.b(na, "adsOperations");
        C7471uYa.b(dVar, "logger");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(lVar, "playbackStateCompatFactory");
        this.e = context;
        this.f = vna;
        this.g = tSVar;
        this.h = lca;
        this.i = oaVar;
        this.j = rVar;
        this.k = tVar;
        this.l = na;
        this.m = dVar;
        this.n = tLa;
        this.o = lVar;
    }

    private void k() {
        C0650e m2 = m();
        if (m2 != null) {
            m2.b((com.google.android.gms.cast.framework.media.C0650e.b) this);
        }
        C0650e m3 = m();
        if (m3 != null) {
            m3.a((C0042e) this);
        }
        this.g.k();
    }

    private C0636d l() {
        C0666s a2 = this.f.a(this.e);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    private C0650e m() {
        C0636d l2 = l();
        if (l2 != null) {
            return l2.g();
        }
        return null;
    }

    private boolean n() {
        C3261sS a2 = this.j.a();
        if (a2 != null) {
            return a2.e();
        }
        return true;
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        defpackage.C3952ana.b.a(this, preloadItem);
    }

    public void b() {
        C0650e m2 = m();
        if (m2 != null) {
            MediaInfo g2 = m2.g();
            JSONObject I = g2 != null ? g2.I() : null;
            d dVar = this.m;
            StringBuilder sb = new StringBuilder();
            sb.append("Received metadata update for queue ");
            sb.append(I == null ? "without" : "with");
            sb.append(" custom data");
            String str = "CastPlayback";
            dVar.a(str, sb.toString());
            if (I != null) {
                C3261sS a2 = this.g.a(I);
                this.j.a(a2);
                C7471uYa.a((Object) a2, "remoteCastPlayQueue");
                b(a2);
                C5327TLa tLa = this.n;
                C5443XLa<Haa> xLa = C3876taa.f;
                C7471uYa.a((Object) xLa, "EventQueue.PLAYER_COMMAND");
                tLa.c(xLa, Haa.u());
                return;
            }
            this.m.c(str, "Received a metadata update but there is no queue!");
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void destroy() {
        k();
    }

    public void e() {
        C0650e m2 = m();
        String str = "Required value was null.";
        if (m2 != null) {
            long d2 = m2.d();
            C0650e m3 = m();
            if (m3 != null) {
                long l2 = m3.l();
                C0650e m4 = m();
                if (m4 != null) {
                    int k2 = m4.k();
                    C3508cda b2 = this.j.b();
                    d dVar = this.m;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Received status update for state ");
                    sb.append(k2);
                    sb.append(" in progress ");
                    sb.append(d2);
                    sb.append(':');
                    sb.append(l2);
                    sb.append(" for urn ");
                    sb.append(b2);
                    String str2 = "CastPlayback";
                    dVar.a(str2, sb.toString());
                    int i2 = 3;
                    if (k2 != 0) {
                        if (k2 == 1) {
                            C0650e m5 = m();
                            if (m5 == null) {
                                throw new IllegalArgumentException(str);
                            } else if (m5.e() == 4) {
                                i2 = 7;
                            }
                        } else if (k2 != 2) {
                            if (k2 == 3) {
                                i2 = 2;
                            } else if (k2 == 4 || k2 == 5) {
                                i2 = 6;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unknown Media State code returned ");
                                sb2.append(k2);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                        C7471uYa.a((Object) b2, "urn");
                        b bVar = new b(b2, i2, d2, l2);
                        a(bVar);
                        return;
                    }
                    d dVar2 = this.m;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Received an unknown status update: playerState=");
                    sb3.append(k2);
                    dVar2.c(str2, sb3.toString());
                    i2 = 0;
                    C7471uYa.a((Object) b2, "urn");
                    b bVar2 = new b(b2, i2, d2, l2);
                    a(bVar2);
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    public boolean f() {
        b bVar = this.b;
        return bVar != null && bVar.b() == 6;
    }

    public void g() {
        defpackage.C3952ana.b.a(this);
    }

    public boolean isPlaying() {
        b bVar = this.b;
        return bVar != null && bVar.b() == 3;
    }

    public Long j() {
        b bVar = this.b;
        if (bVar != null) {
            return Long.valueOf(bVar.c());
        }
        return null;
    }

    public void pause() {
        String str = "CastPlayback";
        if (a(m())) {
            this.m.a(str, "pause() called with existing media session");
            C0650e m2 = m();
            if (m2 != null) {
                m2.t();
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        this.m.a(str, "pause() called with no media session");
        a(false);
    }

    public void start() {
        this.l.a(true);
        this.g.a(l());
        C0650e m2 = m();
        String str = "Required value was null.";
        if (m2 != null) {
            m2.a((com.google.android.gms.cast.framework.media.C0650e.b) this);
            C0650e m3 = m();
            if (m3 != null) {
                m3.a((C0042e) this, 500);
                return;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException(str);
    }

    public void stop() {
        b bVar = this.b;
        if (bVar != null) {
            b a2 = b.a(bVar, null, 0, 0, 0, 13, null);
            if (a2 != null) {
                a(a2);
            }
        }
        k();
    }

    public void a(SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
        C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
        C7471uYa.b(surface, "surface");
        defpackage.C3952ana.b.a(this, surfacePlaybackItem, surface);
    }

    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        String str = "CastPlayback";
        this.m.a(str, "play() called");
        if (!a(m()) || n()) {
            this.c = true;
            a(true);
            return;
        }
        this.m.a(str, "play(): there is a media session in place and a queue");
        q h2 = this.h.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        C3508cda c2 = h2.c();
        String str2 = "Required value was null.";
        if (this.j.a(c2)) {
            this.m.a(str, "play(): local and remote urns are equal. Resuming playback.");
            C0650e m2 = m();
            if (m2 != null) {
                m2.u();
                return;
            }
            throw new IllegalArgumentException(str2);
        }
        this.m.a(str, "play(): local and remote urns are different, so we will update the remote queue.");
        C3261sS a2 = this.j.a();
        if (a2 != null) {
            C7471uYa.a((Object) c2, "currentLocalTrackUrn");
            a(a2, c2);
            return;
        }
        throw new IllegalArgumentException(str2);
    }

    private void b(C3261sS sSVar) {
        int b2 = sSVar.b();
        String str = "CastPlayback";
        if (sSVar.a(this.h.k())) {
            d dVar = this.m;
            StringBuilder sb = new StringBuilder();
            sb.append("Remote and local queue are the same. Setting position to ");
            sb.append(b2);
            dVar.a(str, sb.toString());
            this.h.a(b2, true);
            return;
        }
        this.m.a(str, "Remote is not the same as local queue -> REPLACE local");
        this.h.a(o.a(sSVar.d(), PlaySessionSource.a(), LWa.a()), PlaySessionSource.a(), b2);
    }

    private void a(C3261sS sSVar, C3508cda cda) {
        C3261sS sSVar2;
        String str = "CastPlayback";
        if (sSVar.a(cda)) {
            C3261sS a2 = this.j.a(cda, 0);
            C7471uYa.a((Object) a2, "castQueueController.buil…TrackUrn, POSITION_RESET)");
            d dVar = this.m;
            StringBuilder sb = new StringBuilder();
            sb.append("updateRemoteQueue() called with: newRemoteIndex = [");
            sb.append(sSVar.b());
            sb.append(" -> ");
            sb.append(a2.b());
            sb.append(']');
            dVar.a(str, sb.toString());
            sSVar2 = a2;
        } else {
            sSVar2 = this.j.a(cda, this.h.k());
            C7471uYa.a((Object) sSVar2, "castQueueController.buil…er.currentQueueTrackUrns)");
            d dVar2 = this.m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("updateRemoteQueue() called with: new track list for current urn = [");
            sb2.append(cda);
            sb2.append(']');
            dVar2.a(str, sb2.toString());
        }
        this.g.b(sSVar2);
    }

    public void a(long j2) {
        String str = "CastPlayback";
        if (a(m())) {
            this.m.a(str, "seek() called with existing media session");
            C0650e m2 = m();
            if (m2 != null) {
                m2.a(j2);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        } else if (this.c) {
            this.m.a(str, "seek() called with no media session while media is loading to be played");
            this.c = false;
        } else {
            this.m.a(str, "seek() called with no media session");
            a(false);
        }
    }

    public void a(defpackage.C3952ana.a aVar) {
        C7471uYa.b(aVar, "callback");
        this.d = aVar;
    }

    private void a(b bVar) {
        defpackage.C3952ana.a aVar = this.d;
        if (aVar != null) {
            aVar.b(l.a(this.o, bVar.b(), bVar.c(), bVar.a(), null, "Chromecast", null, C1687sb.a(NVa.a("urnExtraKey", bVar.d().b())), 40, null));
            this.b = bVar;
            return;
        }
        com.soundcloud.android.playback.core.d.a.a(this.m, new IllegalStateException("Received state to report but there is no callback instance!"), null, 2, null);
    }

    public void a(long j2, long j3) {
        b bVar = this.b;
        if (bVar != null) {
            a(b.a(bVar, null, 0, j2, j3, 3, null));
            return;
        }
        throw new IllegalStateException("Cannot report progress update if there was never a state transition before");
    }

    private void a(boolean z) {
        q h2 = this.h.h();
        C7471uYa.a((Object) h2, "playQueueManager.currentPlayQueueItem");
        C3508cda c2 = h2.c();
        C4350oa oaVar = this.i;
        C7471uYa.a((Object) c2, "currentTrackUrn");
        this.g.a(c2.toString(), z, oaVar.c(c2).d(), this.j.a(c2, this.k.a(this.h.k(), this.h.k().indexOf(c2))));
    }

    private boolean a(C0650e eVar) {
        if (eVar != null) {
            return eVar.m();
        }
        return false;
    }
}
