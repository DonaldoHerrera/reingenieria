package com.soundcloud.android.playback.players.playback.local;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.core.k.c;
import com.soundcloud.android.playback.players.k;
import com.soundcloud.android.playback.players.l;
import com.soundcloud.android.playback.players.t;

@EVa(d1 = {"\u0000Í\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u001f\b\u0016\u0018\u0000 _2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001_B?\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0010\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020.H\u0012J\b\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u000200H\u0016J\r\u00102\u001a\u000203H\u0016¢\u0006\u0002\u00104J\b\u00105\u001a\u000206H\u0012J\b\u00107\u001a\u00020\u001bH\u0016J\b\u00108\u001a\u00020\u001bH\u0012J\b\u00109\u001a\u00020\u001bH\u0016J\b\u0010:\u001a\u000200H\u0016J\b\u0010;\u001a\u000200H\u0012J\b\u0010<\u001a\u000200H\u0012J\b\u0010=\u001a\u000200H\u0012J\b\u0010>\u001a\u000200H\u0012J\u0010\u0010?\u001a\u0002002\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020\u001dH\u0016J\u0010\u0010G\u001a\u0002002\u0006\u0010H\u001a\u00020IH\u0016J\b\u0010J\u001a\u000200H\u0016J\u0010\u0010K\u001a\u0002002\u0006\u0010L\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u0002002\u0006\u0010O\u001a\u00020PH\u0016J\u0010\u0010Q\u001a\u0002002\u0006\u0010R\u001a\u000203H\u0016J\u0010\u0010S\u001a\u0002002\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010T\u001a\u0002002\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020XH\u0016J\u0010\u0010Y\u001a\u0002002\u0006\u0010Z\u001a\u000206H\u0016J\b\u0010[\u001a\u000200H\u0016J\b\u0010\\\u001a\u000200H\u0012J\f\u0010]\u001a\u00020^*\u00020\u001dH\u0012R\u0016\u0010\u0014\u001a\n \u0015*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0004\n\u0002\u0010 R\u000e\u0010!\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R(\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\"\u001a\u0004\u0018\u00010#@VX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0004¢\u0006\u0002\n\u0000¨\u0006`"}, d2 = {"Lcom/soundcloud/android/playback/players/playback/local/LocalPlayback;", "Lcom/soundcloud/android/playback/players/playback/Playback;", "Lcom/soundcloud/android/playback/core/Player$PlayerPerformanceListener;", "Lcom/soundcloud/android/playback/core/Player$PlayerStateListener;", "Lcom/soundcloud/android/playback/players/volume/VolumeController$Listener;", "context", "Landroid/content/Context;", "streamPlayer", "Lcom/soundcloud/android/playback/players/StreamPlayer;", "audioFocusHelper", "Lcom/soundcloud/android/playback/audiofocus/AudioFocusHelper;", "volumeControllerFactory", "Lcom/soundcloud/android/playback/players/volume/VolumeController$Factory;", "playbackAnalytics", "Lcom/soundcloud/android/playback/players/playback/local/LocalPlaybackAnalytics;", "playbackStateCompatFactory", "Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "(Landroid/content/Context;Lcom/soundcloud/android/playback/players/StreamPlayer;Lcom/soundcloud/android/playback/audiofocus/AudioFocusHelper;Lcom/soundcloud/android/playback/players/volume/VolumeController$Factory;Lcom/soundcloud/android/playback/players/playback/local/LocalPlaybackAnalytics;Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;Lcom/soundcloud/android/playback/core/Logger;)V", "applicationContext", "kotlin.jvm.PlatformType", "audioFocusRequest", "Lcom/soundcloud/android/playback/audiofocus/AudioFocusRequestCompat;", "callback", "Lcom/soundcloud/android/playback/players/playback/Playback$Callback;", "isNoisyBroadcastReceiverRegistered", "", "lastPlayerStateChangedEvent", "Lcom/soundcloud/android/playback/core/event/PlayerStateChangeEvent;", "noisyBroadcastReceiver", "com/soundcloud/android/playback/players/playback/local/LocalPlayback$noisyBroadcastReceiver$1", "Lcom/soundcloud/android/playback/players/playback/local/LocalPlayback$noisyBroadcastReceiver$1;", "pauseAfterFadeRequested", "value", "Lcom/soundcloud/android/playback/players/PerformanceListener;", "performanceListener", "getPerformanceListener", "()Lcom/soundcloud/android/playback/players/PerformanceListener;", "setPerformanceListener", "(Lcom/soundcloud/android/playback/players/PerformanceListener;)V", "resumeOnFocusGain", "volumeController", "Lcom/soundcloud/android/playback/players/volume/VolumeController;", "buildAudioFocusRequest", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "destroy", "", "fadeAndPause", "getStreamPosition", "", "()Ljava/lang/Long;", "getVolume", "", "isBuffering", "isBufferingOrPlaying", "isPlaying", "onFadeFinished", "onFocusGain", "onFocusLoss", "onFocusLossTransient", "onFocusLossTransientCanDuck", "onPerformanceEvent", "audioPerformanceEvent", "Lcom/soundcloud/android/playback/core/event/AudioPerformanceEvent;", "onPlayerError", "error", "Lcom/soundcloud/android/playback/core/event/PlayerError;", "onPlayerStateChanged", "playerStateChangedEvent", "onProgressEvent", "progressChangeEvent", "Lcom/soundcloud/android/playback/core/event/ProgressChangeEvent;", "pause", "play", "playbackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "seek", "position", "setCallback", "setVideoSurface", "surfacePlaybackItem", "Lcom/soundcloud/android/playback/core/SurfacePlaybackItem;", "surface", "Landroid/view/Surface;", "setVolume", "volume", "stop", "unregisterBecomingNoisyReceiver", "toStateCompat", "Landroid/support/v4/media/session/PlaybackStateCompat;", "Companion", "players_release"}, mv = {1, 1, 15})
/* compiled from: LocalPlayback.kt */
public class b implements C3952ana, com.soundcloud.android.playback.core.k.b, c, c {
    private static final IntentFilter a = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
    public static final a b = new a(null);
    private final Context c;
    private final Bna d;
    private boolean e;
    private boolean f;
    private boolean g;
    private Hla h;
    private k i;
    private defpackage.C3952ana.a j;
    private final LocalPlayback$noisyBroadcastReceiver$1 k = new LocalPlayback$noisyBroadcastReceiver$1(this);
    private final Cla l = a((OnAudioFocusChangeListener) new c(this));
    private final t m;
    private final Ala n;
    private final d o;
    private final l p;
    /* access modifiers changed from: private */
    public final d q;

    /* compiled from: LocalPlayback.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final int a(Hla hla) {
            int i = a.b[hla.e().ordinal()];
            if (i == 1) {
                int i2 = a.a[hla.c().ordinal()];
                if (i2 == 1) {
                    return 0;
                }
                if (i2 == 2) {
                    return 2;
                }
                if (i2 == 3) {
                    return 0;
                }
                if (i2 == 4 || i2 == 5) {
                    return 7;
                }
                throw new FVa();
            } else if (i == 2) {
                return 6;
            } else {
                if (i == 3) {
                    return 3;
                }
                throw new FVa();
            }
        }
    }

    public b(Context context, t tVar, Ala ala, defpackage.Bna.b bVar, d dVar, l lVar, d dVar2) {
        C7471uYa.b(context, "context");
        C7471uYa.b(tVar, "streamPlayer");
        C7471uYa.b(ala, "audioFocusHelper");
        C7471uYa.b(bVar, "volumeControllerFactory");
        C7471uYa.b(lVar, "playbackStateCompatFactory");
        C7471uYa.b(dVar2, "logger");
        this.m = tVar;
        this.n = ala;
        this.o = dVar;
        this.p = lVar;
        this.q = dVar2;
        this.c = context.getApplicationContext();
        this.d = bVar.a(this);
        this.m.a((c) this);
        this.m.a((com.soundcloud.android.playback.core.k.b) this);
    }

    /* access modifiers changed from: private */
    public void h() {
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("[FOCUS] onFocusLoss(state=");
        sb.append(this.h);
        sb.append(')');
        dVar.a("LocalPlayback", sb.toString());
        this.d.b(c(), 600);
        if (d()) {
            pause();
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("[FOCUS] onFocusLossTransient(state=");
        sb.append(this.h);
        sb.append(')');
        dVar.a("LocalPlayback", sb.toString());
        this.d.b(c(), 600);
        if (d()) {
            this.e = true;
            pause();
        }
    }

    /* access modifiers changed from: private */
    public void k() {
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("[FOCUS] onFocusLossTransientCanDuck(state=");
        sb.append(this.h);
        sb.append(')');
        dVar.a("LocalPlayback", sb.toString());
        if (d()) {
            this.d.a(c(), 600);
        }
    }

    private void l() {
        if (this.g) {
            this.c.unregisterReceiver(this.k);
            this.g = false;
        }
    }

    public void destroy() {
        this.q.a("LocalPlayback", "destroy()");
        this.e = false;
        this.m.a();
    }

    public void g() {
        this.q.a("LocalPlayback", "fadeAndPause()");
        this.f = true;
        this.d.b(c(), 2000, 0);
    }

    public boolean isPlaying() {
        Kla kla = Kla.PLAYING;
        Hla hla = this.h;
        return kla == (hla != null ? hla.e() : null);
    }

    public Long j() {
        return Long.valueOf(this.m.b());
    }

    public void pause() {
        this.q.a("LocalPlayback", "pause()");
        this.m.e();
        l();
    }

    public void start() {
        defpackage.C3952ana.b.b(this);
    }

    public void stop() {
        this.q.a("LocalPlayback", "stop()");
        l();
        this.n.a(this.l);
        this.m.g();
    }

    private float c() {
        return this.m.c();
    }

    /* access modifiers changed from: private */
    public boolean d() {
        return this.m.d();
    }

    /* access modifiers changed from: private */
    public void e() {
        String str = "LocalPlayback";
        this.q.a(str, "[FOCUS] onFocusGain(): will unduck volume");
        this.d.b(c(), 600);
        if (this.e) {
            this.q.a(str, "[FOCUS] onFocusRegain(): will resume playback");
            this.m.f();
            this.c.registerReceiver(this.k, a);
            this.g = true;
            this.e = false;
        }
    }

    public void a(k kVar) {
        if (kVar != null) {
            this.i = kVar;
            this.m.a(kVar);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public k b() {
        return this.i;
    }

    public boolean f() {
        Kla kla = Kla.BUFFERING;
        Hla hla = this.h;
        return kla == (hla != null ? hla.e() : null);
    }

    private PlaybackStateCompat b(Hla hla) {
        return this.p.a(b.a(hla), hla.g(), hla.a(), hla.c(), hla.f(), hla.h(), hla.d().b());
    }

    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("play(");
        sb.append(playbackItem);
        sb.append(')');
        dVar.a("LocalPlayback", sb.toString());
        this.e = false;
        this.d.b();
        this.m.a(playbackItem);
        this.n.b(this.l);
        this.c.registerReceiver(this.k, a);
        this.g = true;
    }

    public void a(long j2) {
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("seek(");
        sb.append(j2);
        sb.append(')');
        dVar.a("LocalPlayback", sb.toString());
        this.m.a(j2);
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("preload(");
        sb.append(preloadItem);
        sb.append(')');
        dVar.a("LocalPlayback", sb.toString());
        this.m.a(preloadItem);
    }

    public void a(SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
        C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
        C7471uYa.b(surface, "surface");
        d dVar = this.q;
        StringBuilder sb = new StringBuilder();
        sb.append("setVideoSurface ");
        sb.append(surfacePlaybackItem);
        dVar.a("LocalPlayback", sb.toString());
        this.m.a(surfacePlaybackItem.d(), surface);
    }

    public void a() {
        this.q.a("LocalPlayback", "onFadeFinished()");
        if (this.f) {
            this.f = false;
            pause();
        }
    }

    public void a(Hla hla) {
        C7471uYa.b(hla, "playerStateChangedEvent");
        d dVar = this.o;
        if (dVar != null) {
            dVar.a(hla);
        }
        this.h = hla;
        PlaybackStateCompat b2 = b(hla);
        if (hla.i()) {
            defpackage.C3952ana.a aVar = this.j;
            if (aVar != null) {
                aVar.a(b2);
                return;
            }
            return;
        }
        defpackage.C3952ana.a aVar2 = this.j;
        if (aVar2 != null) {
            aVar2.b(b2);
        }
    }

    public void a(Ila ila) {
        C7471uYa.b(ila, "progressChangeEvent");
        d dVar = this.o;
        if (dVar != null) {
            dVar.a(ila);
        }
        Hla hla = this.h;
        if (hla != null) {
            defpackage.C3952ana.a aVar = this.j;
            if (aVar != null) {
                aVar.b(b(Hla.a(hla, null, null, null, null, null, ila.c(), ila.a(), null, 159, null)));
            }
        }
    }

    public void a(Ela ela) {
        C7471uYa.b(ela, "audioPerformanceEvent");
        k b2 = b();
        if (b2 != null) {
            b2.a(ela);
        }
    }

    public void a(Fla fla) {
        C7471uYa.b(fla, "error");
        k b2 = b();
        if (b2 != null) {
            b2.a(fla);
        }
    }

    public void a(defpackage.C3952ana.a aVar) {
        C7471uYa.b(aVar, "callback");
        this.j = aVar;
    }

    private Cla a(OnAudioFocusChangeListener onAudioFocusChangeListener) {
        androidx.media.AudioAttributesCompat.a aVar = new androidx.media.AudioAttributesCompat.a();
        aVar.a(2);
        aVar.b(1);
        Cla a2 = new defpackage.Cla.a(1).a(onAudioFocusChangeListener).a(aVar.a()).a();
        C7471uYa.a((Object) a2, "AudioFocusRequestCompat.…tes)\n            .build()");
        return a2;
    }

    public void a(float f2) {
        this.m.a(f2);
    }
}
