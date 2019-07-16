package defpackage;

import android.net.Uri;
import android.view.Surface;
import com.google.android.exoplayer2.C0618s;
import com.google.android.exoplayer2.V;
import com.google.android.exoplayer2.source.r;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.Stream;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.k;
import com.soundcloud.android.playback.core.k.c;
import java.io.IOException;

@EVa(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0012\b\u0016\u0018\u0000 Y2\u00020\u0001:\u0002YZB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\b\u0010#\u001a\u00020$H\u0016J\n\u0010%\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\u001fH\u0012J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u0010H\u0012J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u00020 H\u0017J\u0018\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u000204H\u0017J\u0010\u00105\u001a\u00020$2\u0006\u00106\u001a\u000204H\u0012J\u0018\u00107\u001a\u00020$2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020*H\u0017J\b\u0010:\u001a\u00020$H\u0012J\b\u0010;\u001a\u00020$H\u0016J\u0010\u0010<\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0010H\u0016J\u0010\u0010=\u001a\u00020$2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020$H\u0016J\u0010\u0010A\u001a\u00020$2\u0006\u0010B\u001a\u00020*H\u0016J\u0010\u0010C\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0010H\u0012J\u0012\u0010D\u001a\u00020$2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0012\u0010E\u001a\u00020$2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010F\u001a\u00020$2\n\u0010G\u001a\u00060\u001fj\u0002`H2\u0006\u0010I\u001a\u00020JH\u0016J\u0010\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020,H\u0016J\u0018\u0010M\u001a\u00020\u00172\u0006\u00103\u001a\u0002042\u0006\u00102\u001a\u00020\u0017H\u0012J\b\u0010N\u001a\u00020$H\u0016J\u0018\u0010O\u001a\u00020P2\u0006\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u000204H\u0012J\u0018\u0010Q\u001a\u00020R2\u0006\u00102\u001a\u00020\u00172\u0006\u00103\u001a\u000204H\u0012J\u0010\u0010S\u001a\u00020P2\u0006\u0010T\u001a\u00020 H\u0012J\f\u0010U\u001a\u00020\u001f*\u000204H\u0012J\u0014\u0010V\u001a\u00020$*\u00020\u000b2\u0006\u0010.\u001a\u00020\u0010H\u0012J\f\u0010W\u001a\u00020X*\u00020 H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\u00020\u001f*\u00020 8RX\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006["}, d2 = {"Lcom/soundcloud/android/exoplayer/ExoPlayerAdapter;", "Lcom/soundcloud/android/playback/core/Player;", "exoPlayerConfiguration", "Lcom/soundcloud/android/exoplayer/ExoPlayerConfiguration;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "dataSourceFactory", "Lcom/google/android/exoplayer2/upstream/DataSource$Factory;", "(Lcom/soundcloud/android/exoplayer/ExoPlayerConfiguration;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/playback/core/Logger;Lcom/google/android/exoplayer2/SimpleExoPlayer;Lcom/google/android/exoplayer2/upstream/DataSource$Factory;)V", "currentPlaybackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "exoPlayerEventListener", "com/soundcloud/android/exoplayer/ExoPlayerAdapter$exoPlayerEventListener$1", "Lcom/soundcloud/android/exoplayer/ExoPlayerAdapter$exoPlayerEventListener$1;", "exoPlayerProgressHandler", "Lcom/soundcloud/android/exoplayer/ExoPlayerProgressHandler;", "isReleased", "", "playerPerformanceListener", "Lcom/soundcloud/android/playback/core/Player$PlayerPerformanceListener;", "playerStateListener", "Lcom/soundcloud/android/playback/core/Player$PlayerStateListener;", "timeToPlayMeasurement", "Lcom/soundcloud/android/exoplayer/ExoPlayerAdapter$TimeToPlayMeasurement;", "errorCode", "", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "getErrorCode", "(Lcom/google/android/exoplayer2/ExoPlaybackException;)Ljava/lang/String;", "destroy", "", "getCurrentPlaybackItem", "getPlayerType", "Lcom/soundcloud/android/exoplayer/ExoPlayer;", "getPlayerVersion", "getProgress", "", "getVolume", "", "isCurrentStreamUrl", "playbackItem", "onPlayerError", "error", "onPlayerStateChanged", "playWhenReady", "playbackState", "", "onPositionDiscontinuity", "reason", "onProgressChanged", "position", "duration", "onSeekProcessed", "pause", "play", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "resume", "seek", "ms", "sendTimeToPlayTrackingEvent", "setPerformanceListener", "setStateListener", "setSurface", "playbackItemId", "Lcom/soundcloud/android/playback/core/PlaybackItemId;", "surface", "Landroid/view/Surface;", "setVolume", "volume", "shouldReportProgressChanges", "stop", "translatePlaybackReason", "Lcom/soundcloud/android/playback/core/state/PlayStateReason;", "translatePlaybackState", "Lcom/soundcloud/android/playback/core/state/PlaybackState;", "translatedPlaybackReasonForError", "playbackError", "playbackStateAsString", "prepare", "toPlayerError", "Lcom/soundcloud/android/playback/core/event/PlayerError;", "Companion", "TimeToPlayMeasurement", "exo_release"}, mv = {1, 1, 15})
/* renamed from: eba reason: default package and case insensitive filesystem */
/* compiled from: ExoPlayerAdapter.kt */
public class C3757eba implements k {
    public static final a a = new a(null);
    private b b;
    private PlaybackItem c;
    private c d;
    private com.soundcloud.android.playback.core.k.b e;
    private boolean f;
    private final C3805kba g = new C3805kba(500, new C3773gba(this));
    private final C3765fba h = new C3765fba(this);
    private final C3781hba i;
    private final C6834lGa j;
    private final C5694cGa k;
    private final d l;
    /* access modifiers changed from: private */
    public final V m;
    private final defpackage.Zp.a n;

    /* renamed from: eba$a */
    /* compiled from: ExoPlayerAdapter.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final String a(int i) {
            if (i == 0) {
                return "DASH";
            }
            if (i == 1) {
                return "SmoothStreaming";
            }
            if (i == 2) {
                return "Hls";
            }
            if (i == 3) {
                return "Other";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid content type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: eba$b */
    /* compiled from: ExoPlayerAdapter.kt */
    private static final class b {
        private final long a;

        public b(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    if (this.a == ((b) obj).a) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            long j = this.a;
            return (int) (j ^ (j >>> 32));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("TimeToPlayMeasurement(initialTime=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    public C3757eba(C3781hba hba, C6834lGa lga, C5694cGa cga, d dVar, V v, defpackage.Zp.a aVar) {
        C7471uYa.b(hba, "exoPlayerConfiguration");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(dVar, "logger");
        C7471uYa.b(v, "player");
        C7471uYa.b(aVar, "dataSourceFactory");
        this.i = hba;
        this.j = lga;
        this.k = cga;
        this.l = dVar;
        this.m = v;
        this.n = aVar;
        this.m.a((com.google.android.exoplayer2.K.b) this.h);
    }

    private boolean a(int i2, boolean z) {
        return i2 == 3 && z;
    }

    private String f() {
        return this.i.a();
    }

    /* access modifiers changed from: private */
    public void g() {
        this.l.a("ExoPlayerAdapter", "onSeekProcessed");
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
    }

    public float c() {
        if (this.f) {
            return 1.0f;
        }
        return this.m.p();
    }

    public long d() {
        if (this.f) {
            return 0;
        }
        return this.m.getCurrentPosition();
    }

    public void destroy() {
        this.l.a("ExoPlayerAdapter", "destroy()");
        this.m.j();
        this.m.b((com.google.android.exoplayer2.K.b) this.h);
        this.m.q();
        this.f = true;
    }

    public PlaybackItem e() {
        return this.c;
    }

    public void pause() {
        this.l.a("ExoPlayerAdapter", "pause()");
        this.m.b(false);
    }

    public void stop() {
        this.l.a("ExoPlayerAdapter", "stop()");
        this.m.i();
    }

    private boolean b(PlaybackItem playbackItem) {
        String str;
        String b2 = playbackItem.f().b();
        PlaybackItem playbackItem2 = this.c;
        if (playbackItem2 != null) {
            Stream f2 = playbackItem2.f();
            if (f2 != null) {
                str = f2.b();
                return C7471uYa.a((Object) b2, (Object) str);
            }
        }
        str = null;
        return C7471uYa.a((Object) b2, (Object) str);
    }

    private void c(PlaybackItem playbackItem) {
        long a2 = this.k.a();
        b bVar = this.b;
        if (bVar != null) {
            long a3 = a2 - bVar.a();
            this.b = null;
            d dVar = this.l;
            StringBuilder sb = new StringBuilder();
            sb.append("Time to play: ");
            sb.append(a3);
            dVar.b("ExoPlayerAdapter", sb.toString());
            com.soundcloud.android.playback.core.k.b bVar2 = this.e;
            if (bVar2 != null) {
                bVar2.a(Fna.a.a(playbackItem, playbackItem.f(), a().a(), f(), a3));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private Jla d(C0618s sVar) {
        Jla jla;
        if (sVar.a == 0) {
            IOException b2 = sVar.b();
            if (b2 instanceof e) {
                d dVar = this.l;
                StringBuilder sb = new StringBuilder();
                sb.append("Received an InvalidResponseCodeException(statusCode = ");
                sb.append(((e) b2).c);
                sb.append(')');
                dVar.c("ExoPlayerAdapter", sb.toString());
                return Jla.ERROR_FATAL;
            }
        }
        if (this.j.d()) {
            jla = Jla.ERROR_FATAL;
        } else {
            jla = Jla.ERROR_RECOVERABLE;
        }
        return jla;
    }

    public void b() {
        this.l.a("ExoPlayerAdapter", "resume()");
        this.m.b(true);
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("onPositionDiscontinuity(");
        sb.append(i2);
        sb.append(", pos=");
        sb.append(this.m.getCurrentPosition());
        sb.append(')');
        dVar.a("ExoPlayerAdapter", sb.toString());
    }

    private String b(int i2) {
        if (i2 == 1) {
            return "STATE_IDLE";
        }
        if (i2 == 2) {
            return "STATE_BUFFERING";
        }
        if (i2 == 3) {
            return "STATE_READY";
        }
        if (i2 == 4) {
            return "STATE_ENDED";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown exo state ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("play(");
        sb.append(playbackItem);
        sb.append(')');
        String str = "ExoPlayerAdapter";
        dVar.a(str, sb.toString());
        if (b(playbackItem)) {
            d dVar2 = this.l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("play() called for the resume use-case with startPosition=");
            sb2.append(playbackItem.g());
            sb2.append('.');
            dVar2.a(str, sb2.toString());
            this.c = playbackItem;
            if (this.m.o() == 1) {
                a(this.m, playbackItem);
            }
            a(playbackItem.g());
        } else {
            this.l.a(str, "play() configured the data source to be prepared");
            this.c = playbackItem;
            this.b = new b(this.k.a());
            a(this.m, playbackItem);
            SurfacePlaybackItem surfacePlaybackItem = (SurfacePlaybackItem) (!(playbackItem instanceof SurfacePlaybackItem) ? null : playbackItem);
            if (surfacePlaybackItem != null) {
                Surface i2 = surfacePlaybackItem.i();
                if (i2 != null) {
                    a(playbackItem.d(), i2);
                }
            }
        }
        this.m.b(true);
    }

    private Jla b(boolean z, int i2) {
        if (i2 == 1) {
            C0618s n2 = this.m.n();
            if (n2 != null) {
                C7471uYa.a((Object) n2, "it");
                Jla d2 = d(n2);
                if (d2 != null) {
                    return d2;
                }
            }
            return Jla.NONE;
        } else if (i2 == 2) {
            return Jla.NONE;
        } else {
            if (i2 == 3) {
                return z ? Jla.NONE : Jla.PAUSED;
            }
            if (i2 == 4) {
                return Jla.PLAYBACK_COMPLETE;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown exo state ");
            sb.append(i2);
            throw new IllegalStateException(sb.toString());
        }
    }

    private String b(C0618s sVar) {
        int i2 = sVar.a;
        if (i2 == 0) {
            return "TYPE_SOURCE";
        }
        if (i2 == 1) {
            return "TYPE_RENDERER";
        }
        if (i2 == 2) {
            return "TYPE_UNEXPECTED";
        }
        throw sVar;
    }

    private Kla c(boolean z, int i2) {
        if (i2 == 1) {
            return Kla.IDLE;
        }
        if (i2 == 2) {
            return Kla.BUFFERING;
        }
        if (i2 == 3) {
            return z ? Kla.PLAYING : Kla.IDLE;
        }
        if (i2 == 4) {
            return Kla.IDLE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown exo state ");
        sb.append(i2);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0080, code lost:
        if (r8 != null) goto L_0x0085;
     */
    private Fla c(C0618s sVar) {
        HVa hVa;
        String str;
        int i2 = sVar.a;
        if (i2 == 0) {
            hVa = NVa.a(b(sVar), sVar.b().getMessage());
        } else if (i2 == 1) {
            hVa = NVa.a(b(sVar), sVar.a().getMessage());
        } else if (i2 == 2) {
            hVa = NVa.a(b(sVar), sVar.c().getMessage());
        } else {
            throw sVar;
        }
        String str2 = (String) hVa.a();
        String str3 = (String) hVa.b();
        StackTraceElement[] stackTrace = sVar.getStackTrace();
        C7471uYa.a((Object) stackTrace, "stackTrace");
        StackTraceElement stackTraceElement = (StackTraceElement) C6578hWa.f(stackTrace);
        Fna fna = Fna.a;
        PlaybackItem e2 = e();
        defpackage.Fla.a aVar = e2 != null ? new defpackage.Fla.a(e2, e2.f()) : null;
        String a2 = a().a();
        String f2 = f();
        if (stackTraceElement != null) {
            str = stackTraceElement.getFileName();
        }
        str = "ExoPlayerAdapter";
        int lineNumber = stackTraceElement != null ? stackTraceElement.getLineNumber() : 0;
        if (str3 == null) {
            str3 = stackTraceElement != null ? stackTraceElement.getMethodName() : null;
        }
        return fna.a(aVar, a2, f2, null, str2, str, lineNumber, str3 != null ? str3 : "");
    }

    private void a(V v, PlaybackItem playbackItem) {
        String str = "ExoPlayerAdapter";
        this.l.a(str, "prepare() created a new MediaSource");
        Uri parse = Uri.parse(playbackItem.f().b());
        C7471uYa.a((Object) parse, "Uri.parse(this)");
        int a2 = C0471ar.a(parse);
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("prepare() inferred a ");
        sb.append(a.a(a2));
        sb.append(" content-type for the media.");
        dVar.b(str, sb.toString());
        v.a((r) new com.google.android.exoplayer2.source.o.a(this.n).a(parse));
    }

    public void a(long j2) {
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        String str = "seek(";
        sb.append(str);
        sb.append(j2);
        sb.append(')');
        String str2 = "ExoPlayerAdapter";
        dVar.a(str2, sb.toString());
        if (this.m.h()) {
            d dVar2 = this.l;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(j2);
            sb2.append(") dispatched to supported timeline window.");
            dVar2.a(str2, sb2.toString());
            this.m.a(j2);
            return;
        }
        d dVar3 = this.l;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Cannot seek(");
        sb3.append(j2);
        sb3.append(") in this window! Check the properties of the provided stream for missing headers.");
        dVar3.c(str2, sb3.toString());
    }

    public C3749dba a() {
        return C3749dba.b;
    }

    public void a(float f2) {
        if (!this.f) {
            this.m.a(f2);
        }
    }

    public void a(String str, Surface surface) {
        C7471uYa.b(str, "playbackItemId");
        C7471uYa.b(surface, "surface");
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("setSurface(playbackItemId=");
        sb.append(str);
        sb.append(')');
        String str2 = "ExoPlayerAdapter";
        dVar.a(str2, sb.toString());
        PlaybackItem playbackItem = this.c;
        if (C7471uYa.a((Object) playbackItem != null ? playbackItem.d() : null, (Object) str)) {
            this.m.a(surface);
        } else {
            this.l.b(str2, "setSurface got ignored because PlaybackItem ids do not match.");
        }
    }

    public void a(long j2, long j3) {
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChanged(");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(')');
        dVar.a("ExoPlayerAdapter", sb.toString());
        c cVar = this.d;
        if (cVar != null) {
            PlaybackItem playbackItem = this.c;
            if (playbackItem != null) {
                Ila ila = new Ila(playbackItem, j2, j3);
                cVar.a(ila);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public void a(boolean z, int i2) {
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("onPlayerStateChanged(");
        sb.append(z);
        sb.append(", ");
        sb.append(b(i2));
        sb.append('(');
        sb.append(i2);
        sb.append("))");
        dVar.a("ExoPlayerAdapter", sb.toString());
        if (a(i2, z)) {
            this.g.c();
        } else {
            this.g.d();
        }
        PlaybackItem playbackItem = this.c;
        if (playbackItem != null) {
            if (this.b != null && i2 == 3) {
                c(playbackItem);
            }
            String a2 = C3749dba.b.a();
            Kla c2 = c(z, i2);
            Jla b2 = b(z, i2);
            Stream f2 = playbackItem.f();
            long currentPosition = this.m.getCurrentPosition();
            long l2 = this.m.l();
            C0618s n2 = this.m.n();
            Hla hla = new Hla(a2, playbackItem, c2, b2, f2, currentPosition, l2, n2 != null ? b(n2) : null);
            c cVar = this.d;
            if (cVar != null) {
                cVar.a(hla);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void a(C0618s sVar) {
        C7471uYa.b(sVar, "error");
        d dVar = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append("onPlayerError(");
        sb.append(sVar.getCause());
        sb.append(')');
        dVar.c("ExoPlayerAdapter", sb.toString());
        com.soundcloud.android.playback.core.k.b bVar = this.e;
        if (bVar != null) {
            bVar.a(c(sVar));
        }
    }

    public void a(c cVar) {
        this.d = cVar;
    }

    public void a(com.soundcloud.android.playback.core.k.b bVar) {
        this.e = bVar;
    }
}
