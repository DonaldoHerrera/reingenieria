package defpackage;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat.Callback;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;
import com.soundcloud.android.playback.core.d;
import com.soundcloud.android.playback.players.l;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 52\u00020\u0001:\u0003567B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\u001c\u0010\u001c\u001a\u00020\u00172\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00170\u001eH\u0016J\u0010\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001fH\u0016J#\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u001a2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0002\u0010'J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0012J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u001a\u00103\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u00104\u001a\u00020\u001aH\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\u00060\u0011R\u00020\u0000X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/soundcloud/android/playback/players/playback/PlaybackManager;", "Lcom/soundcloud/android/playback/players/playback/Playback$Callback;", "playbackLifecycle", "Lcom/soundcloud/android/playback/players/playback/PlaybackManager$PlaybackLifecycle;", "queueManager", "Lcom/soundcloud/android/playback/players/queue/QueueManager;", "playback", "Lcom/soundcloud/android/playback/players/playback/Playback;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "backgroundScheduler", "Lio/reactivex/Scheduler;", "mainThreadScheduler", "playbackStateCompatFactory", "Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;", "(Lcom/soundcloud/android/playback/players/playback/PlaybackManager$PlaybackLifecycle;Lcom/soundcloud/android/playback/players/queue/QueueManager;Lcom/soundcloud/android/playback/players/playback/Playback;Lcom/soundcloud/android/playback/core/Logger;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;)V", "mediaSessionCallback", "Lcom/soundcloud/android/playback/players/playback/PlaybackManager$MediaSessionCallback;", "getMediaSessionCallback", "()Lcom/soundcloud/android/playback/players/playback/PlaybackManager$MediaSessionCallback;", "playCurrentDisposable", "Lio/reactivex/disposables/Disposable;", "destroy", "", "fadeAndPause", "isPlaying", "", "isPlayingOrBuffering", "loadInitialPlaybackState", "callback", "Lkotlin/Function1;", "Landroid/support/v4/media/session/PlaybackStateCompat;", "onCompletion", "playbackStateCompat", "onStateChanged", "playCurrentItem", "notifyLifecycle", "position", "", "(ZLjava/lang/Long;)V", "playFromMediaId", "mediaId", "", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "setVideoSurface", "surfacePlaybackItem", "Lcom/soundcloud/android/playback/core/SurfacePlaybackItem;", "surface", "Landroid/view/Surface;", "switchToPlayback", "resumePlaying", "Companion", "MediaSessionCallback", "PlaybackLifecycle", "players_release"}, mv = {1, 1, 15})
/* renamed from: cna reason: default package and case insensitive filesystem */
/* compiled from: PlaybackManager.kt */
public class C3968cna implements defpackage.C3952ana.a {
    public static final a a = new a(null);
    private final b b = new b();
    private VPa c;
    /* access modifiers changed from: private */
    public final c d;
    /* access modifiers changed from: private */
    public final C4650qna e;
    /* access modifiers changed from: private */
    public C3952ana f;
    /* access modifiers changed from: private */
    public final d g;
    private final HPa h;
    private final HPa i;
    /* access modifiers changed from: private */
    public final l j;

    /* renamed from: cna$a */
    /* compiled from: PlaybackManager.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    @SuppressLint({"MissingOnPlayFromSearch"})
    /* renamed from: cna$b */
    /* compiled from: PlaybackManager.kt */
    public class b extends Callback {
        public b() {
        }

        private void a(long j) {
            d a2 = C3968cna.this.g;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayFromPosition(");
            sb.append(j);
            sb.append(')');
            a2.a("PlaybackManager", sb.toString());
            C3968cna.a(C3968cna.this, false, Long.valueOf(j), 1, null);
        }

        public void onCustomAction(String str, Bundle bundle) {
            C7471uYa.b(str, "action");
            d a2 = C3968cna.this.g;
            StringBuilder sb = new StringBuilder();
            sb.append("onCustomAction(");
            sb.append(str);
            sb.append(", ");
            sb.append(bundle);
            sb.append(')');
            a2.a("PlaybackManager", sb.toString());
            if (!C7471uYa.a((Object) str, (Object) "com.soundcloud.android.playback.action.PLAY_FROM_POSITION")) {
                return;
            }
            if (bundle != null) {
                a(bundle.getLong("com.soundcloud.android.playback.action.args.ARG_POSITION"));
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        public void onPause() {
            C3968cna.this.g.a("PlaybackManager", "onPause()");
            C3968cna.this.f.pause();
            C3968cna.this.d.onPause();
        }

        public void onPlay() {
            C3968cna.this.g.a("PlaybackManager", "onPlay()");
            C3968cna.a(C3968cna.this, false, null, 3, null);
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            d a2 = C3968cna.this.g;
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayFromMediaId(");
            sb.append(str);
            sb.append(", ");
            sb.append(bundle);
            sb.append(')');
            a2.a("PlaybackManager", sb.toString());
            if (str != null) {
                C3968cna.this.a(str);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("An operation is not implemented: ");
            sb2.append("Handle null mediaId - in cases in which the user triggers a voice command like 'play some music'");
            throw new GVa(sb2.toString());
        }

        public void onSeekTo(long j) {
            d a2 = C3968cna.this.g;
            StringBuilder sb = new StringBuilder();
            sb.append("onSeekTo(");
            sb.append(j);
            sb.append(')');
            a2.a("PlaybackManager", sb.toString());
            C3968cna.this.f.a(j);
        }

        public void onSkipToNext() {
            C3968cna.this.g.a("PlaybackManager", "onSkipToNext()");
            C3968cna.this.e.a(C4686una.MediaSessionAction);
        }

        public void onSkipToPrevious() {
            C3968cna.this.g.a("PlaybackManager", "onSkipToPrevious()");
            C3968cna.this.e.b(C4686una.MediaSessionAction);
        }

        public void onStop() {
            C3968cna.this.g.a("PlaybackManager", "onStop()");
            C3968cna.this.f.stop();
            C3968cna.this.d.onStop();
        }
    }

    /* renamed from: cna$c */
    /* compiled from: PlaybackManager.kt */
    public interface c {
        void onPause();

        void onPlay();

        void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat);

        void onStop();
    }

    public C3968cna(c cVar, C4650qna qna, C3952ana ana, d dVar, HPa hPa, HPa hPa2, l lVar) {
        C7471uYa.b(cVar, "playbackLifecycle");
        C7471uYa.b(qna, "queueManager");
        C7471uYa.b(ana, "playback");
        C7471uYa.b(dVar, "logger");
        C7471uYa.b(hPa, "backgroundScheduler");
        C7471uYa.b(hPa2, "mainThreadScheduler");
        C7471uYa.b(lVar, "playbackStateCompatFactory");
        this.d = cVar;
        this.e = qna;
        this.f = ana;
        this.g = dVar;
        this.h = hPa;
        this.i = hPa2;
        this.j = lVar;
        VPa a2 = WPa.a();
        C7471uYa.a((Object) a2, "Disposables.disposed()");
        this.c = a2;
        this.f.a((defpackage.C3952ana.a) this);
    }

    public void b() {
        this.f.g();
    }

    public b c() {
        return this.b;
    }

    public boolean d() {
        return this.f.isPlaying();
    }

    public boolean e() {
        return this.f.isPlaying() || this.f.f();
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        this.f.a(preloadItem);
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "playbackStateCompat");
        this.d.onPlaybackStateChanged(playbackStateCompat);
    }

    public void a(SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
        C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
        C7471uYa.b(surface, "surface");
        this.f.a(surfacePlaybackItem, surface);
    }

    public void a() {
        this.g.a("PlaybackManager", "destroy()");
        this.f.destroy();
        this.d.onStop();
    }

    public static /* synthetic */ void a(C3968cna cna, boolean z, Long l, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                z = true;
            }
            if ((i2 & 2) != 0) {
                l = null;
            }
            cna.a(z, l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playCurrentItem");
    }

    public void a(boolean z, Long l) {
        VPa d2 = this.e.a(l).a((C7118pQa<? super T, ? extends MPa<? extends R>>) C4569gna.a).b(this.h).a(this.i).a((C6776kQa<? super Throwable>) new C4577hna<Object>(this)).d((C6776kQa<? super T>) new C4585ina<Object>(this, z));
        C7471uYa.a((Object) d2, "queueManager.getCurrentI…          }\n            }");
        this.c = d2;
    }

    public void a(_Xa<? super PlaybackStateCompat, RVa> _xa) {
        C7471uYa.b(_xa, "callback");
        this.g.b("PlaybackManager", "Call to loadInitialPlaybackState");
        this.e.a((Long) null).a((C7118pQa<? super T, ? extends MPa<? extends R>>) C4545dna.a).c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C4553ena<Object,Object>(this)).b(this.h).a(this.i).c((C6776kQa<? super T>) new C4561fna<Object>(this, _xa));
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        this.e.a(str).c((C6368eQa) new C4593jna(this));
    }

    public void a(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "playbackStateCompat");
        String str = "PlaybackManager";
        this.g.a(str, "onCompletion()");
        C4677tna a2 = this.e.a(C4686una.Completion);
        if (C7471uYa.a((Object) a2, (Object) defpackage.C4677tna.b.a)) {
            a(this, false, null, 3, null);
        } else if (C7471uYa.a((Object) a2, (Object) defpackage.C4677tna.a.a)) {
            this.g.b(str, "Did not skip after completion. Stopping playback instance.");
            this.d.onPlaybackStateChanged(playbackStateCompat);
            this.d.onStop();
        }
    }

    public void a(C3952ana ana, boolean z) {
        C7471uYa.b(ana, "playback");
        boolean isPlaying = this.f.isPlaying();
        Long j2 = this.f.j();
        d dVar = this.g;
        StringBuilder sb = new StringBuilder();
        sb.append("switchToPlayback(");
        sb.append(ana);
        sb.append(", ");
        sb.append(z);
        sb.append("). wasPlaying=");
        sb.append(isPlaying);
        sb.append(" with position ");
        sb.append(j2);
        String str = "PlaybackManager";
        dVar.b(str, sb.toString());
        this.f.stop();
        this.f = ana;
        ana.a((defpackage.C3952ana.a) this);
        ana.start();
        if (isPlaying) {
            if (z) {
                a(this, false, null, 2, null);
            } else {
                this.f.pause();
            }
        } else if (this.e.a()) {
            this.g.a(str, "switchToPlayback no-op'ed because queue is empty");
        } else {
            this.f.pause();
        }
        if (!this.e.a() && j2 != null) {
            ana.a(C7265rZa.a(j2.longValue(), 0));
        }
    }
}
