package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnSeekCompleteListener;
import android.os.Build.VERSION;
import android.view.Surface;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.Stream;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.k;
import com.soundcloud.android.playback.core.k.b;
import com.soundcloud.android.playback.core.k.c;
import java.io.IOException;

@EVa(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 z2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001zB;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0019H\u0012J\b\u00105\u001a\u000206H\u0012J\b\u00107\u001a\u000206H\u0012J\b\u00108\u001a\u000206H\u0016J\b\u00109\u001a\u00020!H\u0012J\n\u0010:\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010;\u001a\u00020!H\u0016J\b\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020?H\u0012J\b\u0010@\u001a\u00020!H\u0016J\b\u0010A\u001a\u00020BH\u0012J\b\u0010C\u001a\u00020DH\u0012J\b\u0010E\u001a\u00020.H\u0016J\u0018\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010H\u001a\u00020!H\u0012J\r\u0010I\u001a\u000200H\u0010¢\u0006\u0002\bJJ\r\u0010K\u001a\u000200H\u0010¢\u0006\u0002\bLJ\r\u0010M\u001a\u000200H\u0010¢\u0006\u0002\bNJ\r\u0010O\u001a\u000200H\u0010¢\u0006\u0002\bPJ\r\u0010Q\u001a\u000200H\u0010¢\u0006\u0002\bRJ\u0018\u0010S\u001a\u0002062\u0006\u0010G\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020\u0019H\u0016J \u0010U\u001a\u0002002\u0006\u0010G\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0019H\u0016J \u0010V\u001a\u0002002\u0006\u0010G\u001a\u00020\u001b2\u0006\u00103\u001a\u00020\u00192\u0006\u00104\u001a\u00020\u0019H\u0016J\b\u0010W\u001a\u000206H\u0016J\u0010\u0010X\u001a\u0002062\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010Y\u001a\u0002062\u0006\u0010G\u001a\u00020\u001bH\u0016J\b\u0010Z\u001a\u000206H\u0016J\b\u0010[\u001a\u000206H\u0012J\u0010\u0010[\u001a\u0002062\u0006\u0010\\\u001a\u00020\u0015H\u0016J\u0018\u0010[\u001a\u0002062\u0006\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020!H\u0012J\u0010\u0010^\u001a\u0002062\u0006\u0010_\u001a\u00020`H\u0016J\u0018\u0010a\u001a\u0002062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u0019H\u0012J\u0010\u0010b\u001a\u0002062\u0006\u0010c\u001a\u00020!H\u0012J\b\u0010d\u001a\u000200H\u0012J \u0010e\u001a\u0002062\u0006\u0010f\u001a\u00020\u00172\u0006\u0010g\u001a\u00020!2\u0006\u0010h\u001a\u00020!H\u0012J\b\u0010i\u001a\u000206H\u0012J\b\u0010j\u001a\u000206H\u0016J\u0010\u0010k\u001a\u0002062\u0006\u0010l\u001a\u00020!H\u0016J\r\u0010m\u001a\u000206H\u0010¢\u0006\u0002\bnJ\u0010\u0010o\u001a\u0002062\u0006\u0010f\u001a\u00020\u0017H\u0012J \u0010o\u001a\u0002062\u0006\u0010f\u001a\u00020\u00172\u0006\u0010g\u001a\u00020!2\u0006\u0010h\u001a\u00020!H\u0012J\u0012\u0010p\u001a\u0002062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0018\u0010q\u001a\u0002062\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010r\u001a\u00020!H\u0016J\u0012\u0010s\u001a\u0002062\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010t\u001a\u0002062\u0006\u0010u\u001a\u00020?2\u0006\u0010v\u001a\u00020wH\u0016J\u0010\u0010x\u001a\u0002062\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010y\u001a\u000206H\u0016J\u0010\u0010y\u001a\u0002062\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R$\u0010(\u001a\u00020!8\u0016@\u0016X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010$\"\u0004\b,\u0010&R\u000e\u0010-\u001a\u00020.X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u000e¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerAdapter;", "Lcom/soundcloud/android/playback/core/Player;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnSeekCompleteListener;", "Landroid/media/MediaPlayer$OnInfoListener;", "Landroid/media/MediaPlayer$OnBufferingUpdateListener;", "context", "Landroid/content/Context;", "connectionHelper", "Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "mediaPlayerManager", "Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerManager;", "playerHandler", "Lcom/soundcloud/android/playback/mediaplayer/PlayerHandler;", "(Landroid/content/Context;Lcom/soundcloud/android/utilities/android/network/ConnectionHelper;Lcom/soundcloud/android/utilities/android/date/DateProvider;Lcom/soundcloud/android/playback/core/Logger;Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerManager;Lcom/soundcloud/android/playback/mediaplayer/PlayerHandler;)V", "currentPlaybackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "internalState", "Lcom/soundcloud/android/playback/mediaplayer/MediaPlayerState;", "loadPercent", "", "mediaPlayer", "Landroid/media/MediaPlayer;", "playerPerformanceListener", "Lcom/soundcloud/android/playback/core/Player$PlayerPerformanceListener;", "playerStateListener", "Lcom/soundcloud/android/playback/core/Player$PlayerStateListener;", "prepareStartTimeMs", "", "resumeTime", "getResumeTime$mediaplayer_release", "()J", "setResumeTime$mediaplayer_release", "(J)V", "retryCount", "seekPosition", "seekPosition$annotations", "()V", "getSeekPosition", "setSeekPosition", "volume", "", "waitingForSeek", "", "buildPlayerError", "Lcom/soundcloud/android/playback/core/event/PlayerError;", "what", "extra", "clearSurface", "", "createMediaPlayer", "destroy", "getAdjustedProgress", "getCurrentPlaybackItem", "getDuration", "getPlayerType", "Lcom/soundcloud/android/playback/mediaplayer/MediaPlayer;", "getPlayerVersion", "", "getProgress", "getTranslatedReason", "Lcom/soundcloud/android/playback/core/state/PlayStateReason;", "getTranslatedState", "Lcom/soundcloud/android/playback/core/state/PlaybackState;", "getVolume", "handleMediaPlayerError", "mp", "resumePosition", "hasValidSeekPosition", "hasValidSeekPosition$mediaplayer_release", "isInErrorState", "isInErrorState$mediaplayer_release", "isPlayerPlaying", "isPlayerPlaying$mediaplayer_release", "isSeekable", "isSeekable$mediaplayer_release", "isTryingToResumePlayback", "isTryingToResumePlayback$mediaplayer_release", "onBufferingUpdate", "percent", "onError", "onInfo", "onPlaybackEnded", "onPrepared", "onSeekComplete", "pause", "play", "playbackItem", "fromPos", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "publishPlayerRetryEvent", "publishTimeToPlayEvent", "latency", "releaseUnresettableMediaPlayer", "reportStateChange", "mediaPlayerState", "progress", "duration", "resetConnectionRetries", "resume", "seek", "ms", "sendProgress", "sendProgress$mediaplayer_release", "setInternalState", "setPerformanceListener", "setResumeTimeAndInvokeErrorListener", "lastPosition", "setStateListener", "setSurface", "playbackItemId", "surface", "Landroid/view/Surface;", "setVolume", "stop", "Companion", "mediaplayer_release"}, mv = {1, 1, 15})
/* renamed from: uma reason: default package and case insensitive filesystem */
/* compiled from: MediaPlayerAdapter.kt */
public class C4685uma implements k, OnPreparedListener, OnErrorListener, OnSeekCompleteListener, OnInfoListener, OnBufferingUpdateListener {
    /* access modifiers changed from: private */
    public static final long a = -1;
    public static final a b = new a(null);
    private final Context c;
    private C4730zma d;
    private PlaybackItem e;
    private int f;
    private float g;
    private boolean h;
    private long i;
    private long j;
    private int k;
    private long l;
    private volatile MediaPlayer m;
    private c n;
    private b o;
    private final C6834lGa p;
    private final C5694cGa q;
    private final d r;
    private final C4721yma s;
    private final Bma t;

    /* renamed from: uma$a */
    /* compiled from: MediaPlayerAdapter.kt */
    public static final class a {
        private a() {
        }

        public final long a() {
            return C4685uma.a;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C4685uma(Context context, C6834lGa lga, C5694cGa cga, d dVar, C4721yma yma, Bma bma) {
        C7471uYa.b(context, "context");
        C7471uYa.b(lga, "connectionHelper");
        C7471uYa.b(cga, "dateProvider");
        C7471uYa.b(dVar, "logger");
        C7471uYa.b(yma, "mediaPlayerManager");
        C7471uYa.b(bma, "playerHandler");
        this.p = lga;
        this.q = cga;
        this.r = dVar;
        this.s = yma;
        this.t = bma;
        Context applicationContext = context.getApplicationContext();
        C7471uYa.a((Object) applicationContext, "context.applicationContext");
        this.c = applicationContext;
        this.d = C4730zma.STOPPED;
        this.g = 1.0f;
        long j2 = a;
        this.i = j2;
        this.j = j2;
        this.t.a(this);
    }

    private void d(long j2) {
        RVa rVa;
        PlaybackItem playbackItem = this.e;
        if (playbackItem != null) {
            b bVar = this.o;
            if (bVar != null) {
                bVar.a(Fna.a.a(playbackItem, playbackItem.f(), a().a(), t(), j2));
                rVa = RVa.a;
            } else {
                rVa = null;
            }
            if (rVa != null) {
                return;
            }
        }
        throw new IllegalStateException("MediaPlayer reported time to play without currentPlaybackItem");
    }

    private void q() {
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            mediaPlayer.setSurface(null);
        }
    }

    private void r() {
        MediaPlayer a2 = this.s.a();
        a2.setWakeMode(this.c, 1);
        a2.setAudioStreamType(3);
        a2.setOnErrorListener(this);
        a2.setOnPreparedListener(this);
        a2.setOnSeekCompleteListener(this);
        a2.setOnInfoListener(this);
        a2.setOnCompletionListener(new Ama(this, this.r));
        this.m = a2;
    }

    private long s() {
        long g2 = g();
        long d2 = d();
        if (g2 <= 0 || d2 <= g2) {
            return d2;
        }
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("Progress > expectedDuration: ");
        sb.append(d2);
        sb.append(" > ");
        sb.append(g2);
        dVar.a("MediaPlayerAdapter", sb.toString());
        return g2;
    }

    private String t() {
        return String.valueOf(VERSION.SDK_INT);
    }

    private Jla u() {
        int i2 = C4694vma.b[this.d.ordinal()];
        if (i2 == 1) {
            return this.p.d() ? Jla.ERROR_FATAL : Jla.ERROR_RECOVERABLE;
        }
        if (i2 == 2) {
            return Jla.PAUSED;
        }
        if (i2 != 3) {
            return Jla.NONE;
        }
        return Jla.PLAYBACK_COMPLETE;
    }

    private Kla v() {
        switch (C4694vma.a[this.d.ordinal()]) {
            case 1:
            case 2:
                return Kla.BUFFERING;
            case 3:
                return Kla.PLAYING;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return Kla.IDLE;
            default:
                throw new FVa();
        }
    }

    private void w() {
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            mediaPlayer.start();
            a(C4730zma.PLAYING);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private boolean x() {
        if (!this.h && !this.d.d()) {
            return false;
        }
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            this.s.a(mediaPlayer);
        }
        this.m = null;
        return true;
    }

    private void y() {
        this.f = 0;
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
    }

    public void b(long j2) {
        this.j = j2;
    }

    public void c(long j2) {
        this.i = j2;
    }

    public void destroy() {
        stop();
        this.t.removeCallbacksAndMessages(null);
    }

    public PlaybackItem f() {
        return this.e;
    }

    public long g() {
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer == null) {
            return a;
        }
        if (this.d.a()) {
            return (long) mediaPlayer.getDuration();
        }
        return a;
    }

    public long h() {
        return this.j;
    }

    public long i() {
        return this.i;
    }

    public boolean j() {
        return i() != a;
    }

    public boolean k() {
        return this.d.c();
    }

    public boolean l() {
        return this.d == C4730zma.PLAYING;
    }

    public boolean m() {
        return this.m != null && this.d.g();
    }

    public boolean n() {
        return h() != a;
    }

    public void o() {
        a(C4730zma.COMPLETED);
        q();
        y();
    }

    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        C7471uYa.b(mediaPlayer, "mp");
        if (this.m == mediaPlayer) {
            if (this.k != i2) {
                d dVar = this.r;
                StringBuilder sb = new StringBuilder();
                sb.append("onBufferingUpdate(");
                sb.append(i2);
                sb.append(')');
                dVar.a("MediaPlayerAdapter", sb.toString());
            }
            this.k = i2;
        }
    }

    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        C7471uYa.b(mediaPlayer, "mp");
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("onError ");
        sb.append(i2);
        sb.append(' ');
        sb.append(i3);
        dVar.c("MediaPlayerAdapter", sb.toString());
        b bVar = this.o;
        if (bVar != null) {
            bVar.a(a(i2, i3));
        }
        b(mediaPlayer, s());
        return true;
    }

    public boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        C7471uYa.b(mediaPlayer, "mp");
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("onInfo(");
        sb.append(i2);
        sb.append(',');
        sb.append(i3);
        sb.append(", state=");
        sb.append(this.d);
        sb.append(')');
        String sb2 = sb.toString();
        String str = "MediaPlayerAdapter";
        dVar.a(str, sb2);
        if (this.d.f()) {
            return true;
        }
        if (701 == i2) {
            a(C4730zma.PAUSED_FOR_BUFFERING);
            this.t.removeMessages(0);
            return true;
        } else if (702 != i2) {
            return false;
        } else {
            if (i() == a || this.h) {
                this.r.a(str, "Not clearing seek, waiting for seek to finish");
            } else {
                this.t.removeMessages(0);
                this.t.sendEmptyMessageDelayed(0, 3000);
            }
            if (!this.d.v()) {
                pause();
            } else {
                a(C4730zma.PLAYING);
            }
            return true;
        }
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        C7471uYa.b(mediaPlayer, "mediaPlayer");
        if (!this.d.f() || !C7471uYa.a((Object) mediaPlayer, (Object) this.m)) {
            d dVar = this.r;
            StringBuilder sb = new StringBuilder();
            sb.append("OnPrepared called unexpectedly in state ");
            sb.append(this.d);
            dVar.c("MediaPlayerAdapter", sb.toString());
            return;
        }
        PlaybackItem playbackItem = this.e;
        if (playbackItem != null && playbackItem.e().a()) {
            float b2 = playbackItem.e().b();
            mediaPlayer.setVolume(b2, b2);
        }
        w();
        d(this.q.b().getTime() - this.l);
        if (h() > 0) {
            a(h());
        }
        b(a);
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        C7471uYa.b(mediaPlayer, "mp");
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("onSeekComplete(state=");
        sb.append(this.d);
        sb.append(')');
        String str = "MediaPlayerAdapter";
        dVar.a(str, sb.toString());
        if (this.m == mediaPlayer) {
            if (this.d != C4730zma.PAUSED_FOR_BUFFERING) {
                this.t.removeMessages(0);
                this.t.sendEmptyMessageDelayed(0, 3000);
            } else {
                this.r.a(str, "Not clearing seek, waiting for buffer");
            }
            this.h = false;
            C4730zma zma = this.d;
            if (zma == C4730zma.PAUSED) {
                pause();
            } else if (zma.v()) {
                mediaPlayer.pause();
                mediaPlayer.start();
                a(C4730zma.PLAYING);
            }
        }
    }

    public void p() {
        PlaybackItem playbackItem = this.e;
        if (this.n != null && playbackItem != null) {
            long s2 = s();
            long g2 = g();
            c cVar = this.n;
            if (cVar != null) {
                Ila ila = new Ila(playbackItem, s2, g2);
                cVar.a(ila);
            }
        }
    }

    public void pause() {
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("pause() called. Internal state is ");
        sb.append(this.d);
        dVar.b("MediaPlayerAdapter", sb.toString());
        if (this.m == null || !this.d.e()) {
            stop();
            return;
        }
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            a(C4730zma.PAUSED);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public void stop() {
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("stop() called. Internal state is ");
        sb.append(this.d);
        String str = "MediaPlayerAdapter";
        dVar.b(str, sb.toString());
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            long s2 = s();
            long g2 = g();
            if (this.d.u()) {
                mediaPlayer.stop();
            }
            q();
            this.s.a(mediaPlayer);
            this.m = null;
            b(C4730zma.STOPPED, s2, g2);
            return;
        }
        this.r.c(str, "stop() call was ignored because MediaPlayer instance was already null");
    }

    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("play(): ");
        sb.append(playbackItem);
        sb.append(". Internal state is ");
        sb.append(this.d);
        dVar.b("MediaPlayerAdapter", sb.toString());
        if (this.d == C4730zma.PAUSED) {
            Stream f2 = playbackItem.f();
            PlaybackItem f3 = f();
            if (C7471uYa.a((Object) f2, (Object) f3 != null ? f3.f() : null)) {
                this.e = playbackItem;
                w();
                return;
            }
        }
        a(playbackItem, playbackItem.g());
    }

    public void b() {
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("resume() called. Internal state is ");
        sb.append(this.d);
        dVar.b("MediaPlayerAdapter", sb.toString());
        w();
    }

    public float c() {
        return this.g;
    }

    private void b(MediaPlayer mediaPlayer, long j2) {
        String str = "MediaPlayerAdapter";
        this.r.b(str, "handleMediaPlayerError()");
        if (C7471uYa.a((Object) mediaPlayer, (Object) this.m) && this.d != C4730zma.STOPPED) {
            PlaybackItem playbackItem = this.e;
            if (playbackItem != null && playbackItem.h()) {
                int i2 = this.f;
                this.f = i2 + 1;
                if (i2 < 2) {
                    d dVar = this.r;
                    StringBuilder sb = new StringBuilder();
                    sb.append("stream disconnected, retrying (try=");
                    sb.append(this.f);
                    sb.append(')');
                    dVar.b(str, sb.toString());
                    a(playbackItem, this.f);
                    a(C4730zma.ERROR_RETRYING);
                    a(playbackItem, j2);
                    return;
                }
            }
            this.r.b(str, "stream disconnected, giving up");
            a(C4730zma.ERROR);
            mediaPlayer.release();
            y();
            this.m = null;
        }
    }

    private void a(PlaybackItem playbackItem, long j2) {
        if (this.m == null || x()) {
            r();
        } else {
            MediaPlayer mediaPlayer = this.m;
            if (mediaPlayer != null) {
                mediaPlayer.reset();
            }
        }
        this.e = playbackItem;
        String b2 = playbackItem.f().b();
        this.h = false;
        b(j2);
        c(a);
        a(C4730zma.PREPARING);
        this.l = this.q.b().getTime();
        SurfacePlaybackItem surfacePlaybackItem = (SurfacePlaybackItem) (!(playbackItem instanceof SurfacePlaybackItem) ? null : playbackItem);
        if (surfacePlaybackItem != null) {
            Surface i2 = surfacePlaybackItem.i();
            if (i2 != null) {
                a(playbackItem.d(), i2);
            }
        }
        MediaPlayer mediaPlayer2 = this.m;
        if (mediaPlayer2 != null) {
            try {
                mediaPlayer2.setDataSource(b2);
                try {
                    mediaPlayer2.prepareAsync();
                } catch (IllegalStateException e2) {
                    this.r.a((Exception) e2, "prepareAsync() can only be called on MediaPlayer's Initialized or Stopped states!");
                    b(mediaPlayer2, h());
                }
            } catch (IOException e3) {
                d dVar = this.r;
                StringBuilder sb = new StringBuilder();
                sb.append("setDataSource() failed with IOException: Could not transition to Initialized state. Stream URL is ");
                sb.append(b2);
                dVar.a((Exception) e3, sb.toString());
                b(mediaPlayer2, h());
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public /* synthetic */ C4685uma(Context context, C6834lGa lga, C5694cGa cga, d dVar, C4721yma yma, Bma bma, int i2, C7264rYa rya) {
        if ((i2 & 16) != 0) {
            yma = new C4721yma(dVar);
        }
        C4721yma yma2 = yma;
        if ((i2 & 32) != 0) {
            bma = new Bma();
        }
        this(context, lga, cga, dVar, yma2, bma);
    }

    public long d() {
        if (h() != a) {
            return h();
        }
        if (this.h) {
            return i();
        }
        if (this.m == null || !this.d.a()) {
            return 0;
        }
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            return (long) mediaPlayer.getCurrentPosition();
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private void b(C4730zma zma, long j2, long j3) {
        this.d = zma;
        a(zma, j2, j3);
    }

    private Fla a(int i2, int i3) {
        HVa hVa;
        String str = "UNKNOWN";
        String str2 = i2 != 1 ? i2 != 100 ? i2 != 200 ? str : "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK" : "MEDIA_ERROR_SERVER_DIED" : "MEDIA_ERROR_UNKNOWN";
        if (i3 == -1010) {
            str = "MEDIA_ERROR_UNSUPPORTED";
        } else if (i3 == -1007) {
            str = "MEDIA_ERROR_MALFORMED";
        } else if (i3 == -1004) {
            str = "MEDIA_ERROR_IO";
        } else if (i3 == -110) {
            str = "MEDIA_ERROR_TIMED_OUT";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(':');
        sb.append(str);
        String sb2 = sb.toString();
        if (this.p.d()) {
            hVa = NVa.a(sb2, sb2);
        } else {
            hVa = NVa.a("NETWORK_DISCONNECTED", sb2);
        }
        String str3 = (String) hVa.a();
        String str4 = (String) hVa.b();
        Fna fna = Fna.a;
        PlaybackItem f2 = f();
        return Fna.a(fna, f2 != null ? new defpackage.Fla.a(f2, f2.f()) : null, a().a(), t(), null, str3, "MediaPlayerAdapter", 0, str4, 64, null);
    }

    private void a(PlaybackItem playbackItem, int i2) {
        b bVar = this.o;
        if (bVar != null) {
            bVar.a(Fna.a.a(playbackItem, playbackItem.f(), a().a(), i2));
        }
    }

    public void a(MediaPlayer mediaPlayer, long j2) {
        C7471uYa.b(mediaPlayer, "mediaPlayer");
        if (mediaPlayer == this.m) {
            b(mediaPlayer, j2);
        }
    }

    public void a(MediaPlayer mediaPlayer) {
        C7471uYa.b(mediaPlayer, "mediaPlayer");
        if (mediaPlayer == this.m) {
            stop();
        }
    }

    private void a(C4730zma zma) {
        this.d = zma;
        a(zma, s(), g());
    }

    private void a(C4730zma zma, long j2, long j3) {
        C4730zma zma2 = zma;
        d dVar = this.r;
        StringBuilder sb = new StringBuilder();
        sb.append("reportStateChange() called for ");
        sb.append(zma2);
        sb.append(", [progress,duration] = [");
        sb.append(j2);
        sb.append(',');
        sb.append(j3);
        sb.append(']');
        dVar.b("MediaPlayerAdapter", sb.toString());
        this.t.removeMessages(1);
        if (zma2 == C4730zma.PLAYING) {
            this.t.sendEmptyMessage(1);
        }
        PlaybackItem playbackItem = this.e;
        if (playbackItem != null) {
            Hla hla = new Hla(a().a(), playbackItem, v(), u(), playbackItem.f(), j2, j3, null, 128, null);
            c cVar = this.n;
            if (cVar != null) {
                cVar.a(hla);
            }
        }
    }

    public void a(c cVar) {
        this.n = cVar;
    }

    public void a(b bVar) {
        this.o = bVar;
    }

    public void a(long j2) {
        int i2;
        if (!m()) {
            return;
        }
        if (j2 >= 0) {
            String str = "Required value was null.";
            if (this.m == null || this.d.c()) {
                i2 = 0;
            } else {
                MediaPlayer mediaPlayer = this.m;
                if (mediaPlayer != null) {
                    i2 = mediaPlayer.getCurrentPosition();
                } else {
                    throw new IllegalArgumentException(str);
                }
            }
            long j3 = (long) i2;
            if (this.m != null && j2 != j3) {
                d dVar = this.r;
                StringBuilder sb = new StringBuilder();
                sb.append("seeking to ");
                sb.append(j2);
                dVar.a("MediaPlayerAdapter", sb.toString());
                y();
                this.t.removeMessages(0);
                c(j2);
                this.h = true;
                MediaPlayer mediaPlayer2 = this.m;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.seekTo((int) j2);
                    return;
                }
                throw new IllegalArgumentException(str);
            }
            return;
        }
        throw new IllegalArgumentException("Trying to seek before 0");
    }

    public C4676tma a() {
        return C4676tma.b;
    }

    public void a(float f2) {
        if (this.m != null && this.d.b()) {
            this.g = f2;
            MediaPlayer mediaPlayer = this.m;
            if (mediaPlayer != null) {
                mediaPlayer.setVolume(f2, f2);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public void a(String str, Surface surface) {
        C7471uYa.b(str, "playbackItemId");
        C7471uYa.b(surface, "surface");
        PlaybackItem playbackItem = this.e;
        if (this.m != null && playbackItem != null && C7471uYa.a((Object) str, (Object) playbackItem.d())) {
            MediaPlayer mediaPlayer = this.m;
            if (mediaPlayer != null) {
                mediaPlayer.setSurface(surface);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
