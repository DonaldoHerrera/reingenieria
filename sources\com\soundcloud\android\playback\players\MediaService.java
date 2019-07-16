package com.soundcloud.android.playback.players;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat.MediaItem;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import androidx.media.MediaBrowserServiceCompat;
import androidx.media.MediaBrowserServiceCompat.i;
import androidx.mediarouter.media.h;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0666s;
import com.google.android.gms.cast.framework.C0667t;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;
import java.lang.ref.WeakReference;
import java.util.List;

@EVa(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0005stuvwB\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!¢\u0006\u0002\u0010\"B\u0005¢\u0006\u0002\u0010#J\b\u0010G\u001a\u00020HH\u0017J\b\u0010+\u001a\u00020,H\u0016J\b\u0010I\u001a\u00020HH\u0012J\b\u0010J\u001a\u00020HH\u0016J\u0010\u0010K\u001a\u00020H2\u0006\u0010L\u001a\u00020MH\u0016J\b\u0010N\u001a\u00020HH\u0016J\"\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010VH\u0016J$\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020R2\u0012\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0[0ZH\u0016J\b\u0010]\u001a\u00020HH\u0016J\b\u0010^\u001a\u00020HH\u0016J\u0010\u0010_\u001a\u00020H2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020H2\u0006\u0010c\u001a\u00020dH\u0016J\"\u0010e\u001a\u00020T2\b\u0010f\u001a\u0004\u0018\u00010g2\u0006\u0010h\u001a\u00020T2\u0006\u0010i\u001a\u00020TH\u0016J\b\u0010j\u001a\u00020HH\u0016J\u0010\u0010k\u001a\u00020H2\u0006\u0010l\u001a\u00020gH\u0016J\u0018\u0010m\u001a\u00020H2\u0006\u0010n\u001a\u00020T2\u0006\u0010o\u001a\u00020pH\u0016J\u0010\u0010q\u001a\u00020H2\u0006\u0010r\u001a\u00020,H\u0016R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u00020.8\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u001e\u00109\u001a\u00020:8\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\b\u001a\u00020\t8\u0010@\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006x"}, d2 = {"Lcom/soundcloud/android/playback/players/MediaService;", "Landroidx/media/MediaBrowserServiceCompat;", "Lcom/soundcloud/android/playback/players/playback/PlaybackManager$PlaybackLifecycle;", "Lcom/soundcloud/android/playback/players/queue/QueueChangedListener;", "mediaSessionWrapper", "Lcom/soundcloud/android/playback/players/mediasession/MediaSessionWrapper;", "streamPlayerFactory", "Lcom/soundcloud/android/playback/players/StreamPlayer$Factory;", "volumeControllerFactory", "Lcom/soundcloud/android/playback/players/volume/VolumeController$Factory;", "mediaProvider", "Lcom/soundcloud/android/playback/players/queue/MediaProvider;", "queueManager", "Lcom/soundcloud/android/playback/players/queue/QueueManager;", "mediaNotificationManager", "Lcom/soundcloud/android/playback/players/MediaNotificationManager;", "playbackManager", "Lcom/soundcloud/android/playback/players/playback/PlaybackManager;", "localPlayback", "Lcom/soundcloud/android/playback/players/playback/local/LocalPlayback;", "castPlayback", "Lcom/soundcloud/android/playback/players/playback/Playback;", "performanceListener", "Lcom/soundcloud/android/playback/players/PerformanceListener;", "logger", "Lcom/soundcloud/android/playback/core/Logger;", "googleApiWrapper", "Lcom/soundcloud/android/playback/players/utilities/GoogleApiWrapper;", "mediaRouter", "Landroidx/mediarouter/media/MediaRouter;", "delayedStopHandler", "Lcom/soundcloud/android/playback/players/MediaService$DelayedStopHandler;", "mainThreadScheduler", "Lio/reactivex/Scheduler;", "(Lcom/soundcloud/android/playback/players/mediasession/MediaSessionWrapper;Lcom/soundcloud/android/playback/players/StreamPlayer$Factory;Lcom/soundcloud/android/playback/players/volume/VolumeController$Factory;Lcom/soundcloud/android/playback/players/queue/MediaProvider;Lcom/soundcloud/android/playback/players/queue/QueueManager;Lcom/soundcloud/android/playback/players/MediaNotificationManager;Lcom/soundcloud/android/playback/players/playback/PlaybackManager;Lcom/soundcloud/android/playback/players/playback/local/LocalPlayback;Lcom/soundcloud/android/playback/players/playback/Playback;Lcom/soundcloud/android/playback/players/PerformanceListener;Lcom/soundcloud/android/playback/core/Logger;Lcom/soundcloud/android/playback/players/utilities/GoogleApiWrapper;Landroidx/mediarouter/media/MediaRouter;Lcom/soundcloud/android/playback/players/MediaService$DelayedStopHandler;Lio/reactivex/Scheduler;)V", "()V", "castSessionManager", "Lcom/google/android/gms/cast/framework/SessionManager;", "castSessionManagerListener", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/CastSession;", "disposable", "Lio/reactivex/disposables/Disposable;", "isForeground", "", "mediaBrowserDataSource", "Lcom/soundcloud/android/playback/mediabrowser/MediaBrowserDataSource;", "getMediaBrowserDataSource$players_release", "()Lcom/soundcloud/android/playback/mediabrowser/MediaBrowserDataSource;", "setMediaBrowserDataSource$players_release", "(Lcom/soundcloud/android/playback/mediabrowser/MediaBrowserDataSource;)V", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "getMediaSessionWrapper", "()Lcom/soundcloud/android/playback/players/mediasession/MediaSessionWrapper;", "setMediaSessionWrapper", "(Lcom/soundcloud/android/playback/players/mediasession/MediaSessionWrapper;)V", "playbackStateCompatFactory", "Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;", "getPlaybackStateCompatFactory$players_release", "()Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;", "setPlaybackStateCompatFactory$players_release", "(Lcom/soundcloud/android/playback/players/PlaybackStateCompatFactory;)V", "getStreamPlayerFactory$players_release", "()Lcom/soundcloud/android/playback/players/StreamPlayer$Factory;", "setStreamPlayerFactory$players_release", "(Lcom/soundcloud/android/playback/players/StreamPlayer$Factory;)V", "getVolumeControllerFactory$players_release", "()Lcom/soundcloud/android/playback/players/volume/VolumeController$Factory;", "setVolumeControllerFactory$players_release", "(Lcom/soundcloud/android/playback/players/volume/VolumeController$Factory;)V", "injectDependencies", "", "loadInitialState", "onCreate", "onCurrentQueueItemChanged", "currentItem", "Lcom/soundcloud/android/playback/players/queue/PlaybackData;", "onDestroy", "onGetRoot", "Landroidx/media/MediaBrowserServiceCompat$BrowserRoot;", "clientPackageName", "", "clientUid", "", "rootHints", "Landroid/os/Bundle;", "onLoadChildren", "parentId", "result", "Landroidx/media/MediaBrowserServiceCompat$Result;", "", "Landroid/support/v4/media/MediaBrowserCompat$MediaItem;", "onPause", "onPlay", "onPlaybackStateChanged", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "onQueueChanged", "queue", "Lcom/soundcloud/android/playback/players/queue/MediaSessionQueue;", "onStartCommand", "intent", "Landroid/content/Intent;", "flags", "startId", "onStop", "onTaskRemoved", "rootIntent", "pinForeground", "notificationId", "notification", "Landroid/app/Notification;", "unpinForeground", "removeNotification", "CastSessionManagerListener", "Command", "Companion", "CurrentQueueItemConsumer", "DelayedStopHandler", "players_release"}, mv = {1, 1, 15})
/* compiled from: MediaService.kt */
public class MediaService extends MediaBrowserServiceCompat implements defpackage.C3968cna.c, C4641pna {
    public static final c g = new c(null);
    private h A;
    private MediaSessionCompat B;
    private boolean C;
    public Xma h;
    public com.soundcloud.android.playback.players.t.b i;
    public defpackage.Bna.b j;
    public C4649qma k;
    public l l;
    private C3968cna m;
    private d n;
    private C4609lna o;
    private C4650qna p;
    private com.soundcloud.android.playback.players.playback.local.b q;
    private C3952ana r;
    private e s;
    private k t;
    private com.soundcloud.android.playback.core.d u;
    private HPa v;
    private C0666s w;
    private C0667t<C0636d> x;
    private VPa y = C4881Eua.b();
    private C4695vna z;

    /* compiled from: MediaService.kt */
    public class a implements C0667t<C0636d> {
        public a() {
        }

        public void c(C0636d dVar, int i) {
            C7471uYa.b(dVar, "session");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionStartFailed [error=");
            sb.append(i);
            sb.append(']');
            c.a("MediaService", sb.toString());
        }

        /* renamed from: d */
        public void a(C0636d dVar, int i) {
            C7471uYa.b(dVar, "session");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionSuspended [reason=");
            sb.append(i);
            sb.append(']');
            c.a("MediaService", sb.toString());
        }

        public void b(C0636d dVar, String str) {
            C7471uYa.b(dVar, "session");
            C7471uYa.b(str, "sessionId");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionStarted [sessionId=");
            sb.append(str);
            sb.append(']');
            c.a("MediaService", sb.toString());
            MediaService.d(MediaService.this).a(MediaService.e(MediaService.this));
            MediaService.f(MediaService.this).a(MediaService.a(MediaService.this), true);
        }

        public void a(C0636d dVar, String str) {
            C7471uYa.b(dVar, "session");
            C7471uYa.b(str, "sessionId");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionResuming [sessionId=");
            sb.append(str);
            sb.append(']');
            c.a("MediaService", sb.toString());
        }

        public void a(C0636d dVar, boolean z) {
            C7471uYa.b(dVar, "session");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionResumed [wasSuspended=");
            sb.append(z);
            sb.append(']');
            c.a("MediaService", sb.toString());
        }

        /* renamed from: a */
        public void b(C0636d dVar) {
            C7471uYa.b(dVar, "session");
            MediaService.c(MediaService.this).a("MediaService", "[Cast] onSessionEnding()");
        }

        /* renamed from: b */
        public void a(C0636d dVar) {
            C7471uYa.b(dVar, "session");
            MediaService.c(MediaService.this).a("MediaService", "[Cast] onSessionStarting()");
        }

        /* renamed from: a */
        public void b(C0636d dVar, int i) {
            C7471uYa.b(dVar, "session");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionEnded [error=");
            sb.append(i);
            sb.append(']');
            c.a("MediaService", sb.toString());
            MediaService.d(MediaService.this).a((MediaSessionCompat) null);
            MediaService.f(MediaService.this).a((C3952ana) MediaService.b(MediaService.this), false);
        }

        /* renamed from: b */
        public void d(C0636d dVar, int i) {
            C7471uYa.b(dVar, "session");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("[Cast] onSessionResumeFailed [error=");
            sb.append(i);
            sb.append(']');
            c.a("MediaService", sb.toString());
        }
    }

    @EVa(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001a\u001b\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\b\rJ\u001d\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\b\u0011J%\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017J\u0016\u0010\u0018\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0019\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u0016\u0010\u0003\u001a\u00020\u00048\u0006XT¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/soundcloud/android/playback/players/MediaService$Command;", "", "()V", "COMMAND_NAME", "", "COMMAND_NAME$annotations", "INTENT_ACTION_COMMAND", "fadeAndPause", "", "context", "Landroid/content/Context;", "getFadeAndPauseIntent", "Landroid/content/Intent;", "getFadeAndPauseIntent$players_release", "getPreloadIntent", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "getPreloadIntent$players_release", "getSetVideoSurfaceIntent", "surfacePlaybackItem", "Lcom/soundcloud/android/playback/core/SurfacePlaybackItem;", "surface", "Landroid/view/Surface;", "getSetVideoSurfaceIntent$players_release", "preload", "setVideoSurface", "FadeAndPause", "Preload", "SetVideoSurface", "players_release"}, mv = {1, 1, 15})
    /* compiled from: MediaService.kt */
    public static final class b {
        public static final b a = new b();

        /* compiled from: MediaService.kt */
        public static final class a {
            public static final a a = new a();

            private a() {
            }
        }

        /* renamed from: com.soundcloud.android.playback.players.MediaService$b$b reason: collision with other inner class name */
        /* compiled from: MediaService.kt */
        public static final class C0133b {
            public static final C0133b a = new C0133b();

            private C0133b() {
            }
        }

        /* compiled from: MediaService.kt */
        public static final class c {
            public static final c a = new c();

            private c() {
            }
        }

        private b() {
        }

        public final Intent a(Context context, PreloadItem preloadItem) {
            C7471uYa.b(context, "context");
            C7471uYa.b(preloadItem, "preloadItem");
            Intent intent = new Intent(context, MediaService.class);
            intent.setAction("com.soundcloud.android.playback.players.ACTION_CMD");
            intent.putExtra("CMD_NAME", "CMD_PRELOAD");
            intent.putExtra("PRELOAD_ITEM", preloadItem);
            return intent;
        }

        public final void b(Context context, PreloadItem preloadItem) {
            C7471uYa.b(context, "context");
            C7471uYa.b(preloadItem, "preloadItem");
            context.startService(a(context, preloadItem));
        }

        public final Intent b(Context context) {
            C7471uYa.b(context, "context");
            Intent intent = new Intent(context, MediaService.class);
            intent.setAction("com.soundcloud.android.playback.players.ACTION_CMD");
            intent.putExtra("CMD_NAME", "CMD_FADE_AND_PAUSE");
            return intent;
        }

        public final void a(Context context) {
            C7471uYa.b(context, "context");
            context.startService(b(context));
        }

        public final void b(Context context, SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
            C7471uYa.b(context, "context");
            C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
            C7471uYa.b(surface, "surface");
            context.startService(a(context, surfacePlaybackItem, surface));
        }

        public final Intent a(Context context, SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
            C7471uYa.b(context, "context");
            C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
            C7471uYa.b(surface, "surface");
            Intent intent = new Intent(context, MediaService.class);
            intent.setAction("com.soundcloud.android.playback.players.ACTION_CMD");
            intent.putExtra("CMD_NAME", "CMD_SET_VIDEO_SURFACE");
            intent.putExtra("SURFACE_ITEM", surfacePlaybackItem);
            intent.putExtra("SURFACE", surface);
            return intent;
        }
    }

    /* compiled from: MediaService.kt */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: MediaService.kt */
    public final class d implements C6776kQa<MediaMetadataCompat> {
        private boolean a;

        public d() {
        }

        /* renamed from: a */
        public void accept(MediaMetadataCompat mediaMetadataCompat) {
            C7471uYa.b(mediaMetadataCompat, "mediaMetadata");
            com.soundcloud.android.playback.core.d c = MediaService.c(MediaService.this);
            StringBuilder sb = new StringBuilder();
            sb.append("mediaSession:setMetadata: ");
            sb.append(mediaMetadataCompat.getDescription());
            c.a("MediaService", sb.toString());
            MediaService.e(MediaService.this).setMetadata(mediaMetadataCompat);
            if (!this.a) {
                this.a = true;
                if (MediaService.f(MediaService.this).e()) {
                    C3968cna.a(MediaService.f(MediaService.this), false, null, 3, null);
                }
            }
        }
    }

    /* compiled from: MediaService.kt */
    public static class e extends Handler {
        private final WeakReference<MediaService> a;
        private final long b;
        private final com.soundcloud.android.playback.core.d c;

        public e(MediaService mediaService, long j, com.soundcloud.android.playback.core.d dVar) {
            C7471uYa.b(mediaService, "service");
            C7471uYa.b(dVar, "logger");
            this.b = j;
            this.c = dVar;
            this.a = new WeakReference<>(mediaService);
        }

        public com.soundcloud.android.playback.core.d a() {
            return this.c;
        }

        public void b() {
            a().b("MediaService", "[DelayedStopHandler] removeAllCallbacksAndMessages");
            removeCallbacksAndMessages(null);
        }

        public void c() {
            com.soundcloud.android.playback.core.d a2 = a();
            StringBuilder sb = new StringBuilder();
            sb.append("[DelayedStopHandler] rescheduling service stop handler to run again in ");
            sb.append(this.b);
            sb.append(" ms");
            a2.b("MediaService", sb.toString());
            a(this.b);
        }

        public void handleMessage(Message message) {
            C7471uYa.b(message, "msg");
            String str = "MediaService";
            a().a(str, "[DelayedStopHandler] running check...");
            MediaService mediaService = (MediaService) this.a.get();
            if (mediaService != null && !MediaService.f(mediaService).d()) {
                a().b(str, "[DelayedStopHandler]  stopping service");
                mediaService.stopSelf();
            }
        }

        private void a(long j) {
            b();
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
            } else {
                sendEmptyMessage(0);
            }
        }
    }

    public static final /* synthetic */ C3952ana a(MediaService mediaService) {
        C3952ana ana = mediaService.r;
        if (ana != null) {
            return ana;
        }
        C7471uYa.b("castPlayback");
        throw null;
    }

    public static final /* synthetic */ com.soundcloud.android.playback.players.playback.local.b b(MediaService mediaService) {
        com.soundcloud.android.playback.players.playback.local.b bVar = mediaService.q;
        if (bVar != null) {
            return bVar;
        }
        C7471uYa.b("localPlayback");
        throw null;
    }

    public static final /* synthetic */ com.soundcloud.android.playback.core.d c(MediaService mediaService) {
        com.soundcloud.android.playback.core.d dVar = mediaService.u;
        if (dVar != null) {
            return dVar;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public static final /* synthetic */ h d(MediaService mediaService) {
        h hVar = mediaService.A;
        if (hVar != null) {
            return hVar;
        }
        C7471uYa.b("mediaRouter");
        throw null;
    }

    public static final /* synthetic */ MediaSessionCompat e(MediaService mediaService) {
        MediaSessionCompat mediaSessionCompat = mediaService.B;
        if (mediaSessionCompat != null) {
            return mediaSessionCompat;
        }
        C7471uYa.b("mediaSession");
        throw null;
    }

    public static final /* synthetic */ C3968cna f(MediaService mediaService) {
        C3968cna cna = mediaService.m;
        if (cna != null) {
            return cna;
        }
        C7471uYa.b("playbackManager");
        throw null;
    }

    private void i() {
        C3968cna cna = this.m;
        if (cna != null) {
            cna.a((_Xa<? super PlaybackStateCompat, RVa>) new g<Object,RVa>(this));
            C4650qna qna = this.p;
            if (qna != null) {
                C4650qna.a(qna, null, new h(this), 1, null);
            } else {
                C7471uYa.b("queueManager");
                throw null;
            }
        } else {
            C7471uYa.b("playbackManager");
            throw null;
        }
    }

    public void g() {
        dagger.android.a.a((Service) this);
        this.u = r.a.e();
        this.t = r.a.c();
        HPa b2 = C6645iVa.b();
        C7471uYa.a((Object) b2, "Schedulers.io()");
        HPa a2 = RPa.a();
        C7471uYa.a((Object) a2, "AndroidSchedulers.mainThread()");
        this.v = a2;
        this.o = r.a.g();
        com.soundcloud.android.playback.players.playback.local.d d2 = r.a.d();
        C4609lna lna = this.o;
        if (lna != null) {
            com.soundcloud.android.playback.core.d dVar = this.u;
            String str = "logger";
            if (dVar != null) {
                HPa hPa = this.v;
                String str2 = "mainThreadScheduler";
                if (hPa != null) {
                    this.p = new C4650qna(lna, dVar, b2, hPa);
                    com.soundcloud.android.playback.players.t.b e2 = e();
                    com.soundcloud.android.playback.core.c b3 = r.a.b();
                    o h2 = r.a.h();
                    com.soundcloud.android.playback.core.d dVar2 = this.u;
                    if (dVar2 != null) {
                        t a3 = e2.a(b3, h2, dVar2);
                        Ala ala = new Ala(this);
                        defpackage.Bna.b f = f();
                        l d3 = d();
                        com.soundcloud.android.playback.core.d dVar3 = this.u;
                        if (dVar3 != null) {
                            com.soundcloud.android.playback.players.playback.local.b bVar = new com.soundcloud.android.playback.players.playback.local.b(this, a3, ala, f, d2, d3, dVar3);
                            this.q = bVar;
                            C4650qna qna = this.p;
                            if (qna != null) {
                                com.soundcloud.android.playback.players.playback.local.b bVar2 = this.q;
                                if (bVar2 != null) {
                                    com.soundcloud.android.playback.core.d dVar4 = this.u;
                                    if (dVar4 != null) {
                                        HPa hPa2 = this.v;
                                        if (hPa2 != null) {
                                            C3968cna cna = new C3968cna(this, qna, bVar2, dVar4, b2, hPa2, d());
                                            this.m = cna;
                                            Wma f2 = r.a.f();
                                            Object systemService = getSystemService("notification");
                                            if (systemService != null) {
                                                NotificationManager notificationManager = (NotificationManager) systemService;
                                                com.soundcloud.android.playback.core.d dVar5 = this.u;
                                                if (dVar5 != null) {
                                                    this.n = new d(this, f2, notificationManager, dVar5);
                                                    this.r = r.a.a();
                                                    com.soundcloud.android.playback.core.d dVar6 = this.u;
                                                    if (dVar6 != null) {
                                                        this.z = new C4695vna(dVar6);
                                                        h a4 = h.a(getApplicationContext());
                                                        C7471uYa.a((Object) a4, "MediaRouter.getInstance(applicationContext)");
                                                        this.A = a4;
                                                        com.soundcloud.android.playback.core.d dVar7 = this.u;
                                                        if (dVar7 != null) {
                                                            this.s = new e(this, 180000, dVar7);
                                                        } else {
                                                            C7471uYa.b(str);
                                                            throw null;
                                                        }
                                                    } else {
                                                        C7471uYa.b(str);
                                                        throw null;
                                                    }
                                                } else {
                                                    C7471uYa.b(str);
                                                    throw null;
                                                }
                                            } else {
                                                throw new OVa("null cannot be cast to non-null type android.app.NotificationManager");
                                            }
                                        } else {
                                            C7471uYa.b(str2);
                                            throw null;
                                        }
                                    } else {
                                        C7471uYa.b(str);
                                        throw null;
                                    }
                                } else {
                                    C7471uYa.b("localPlayback");
                                    throw null;
                                }
                            } else {
                                C7471uYa.b("queueManager");
                                throw null;
                            }
                        } else {
                            C7471uYa.b(str);
                            throw null;
                        }
                    } else {
                        C7471uYa.b(str);
                        throw null;
                    }
                } else {
                    C7471uYa.b(str2);
                    throw null;
                }
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else {
            C7471uYa.b("mediaProvider");
            throw null;
        }
    }

    public boolean h() {
        return this.C;
    }

    public void onCreate() {
        g();
        super.onCreate();
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            dVar.a("MediaService", "onCreate");
            MediaSessionCompat a2 = c().a((Context) this, "MediaService::MediaSessionTag");
            a2.setFlags(3);
            C3968cna cna = this.m;
            if (cna != null) {
                a2.setCallback(cna.c());
                a(a2.getSessionToken());
                this.B = a2;
                com.soundcloud.android.playback.players.playback.local.b bVar = this.q;
                if (bVar != null) {
                    k kVar = this.t;
                    if (kVar != null) {
                        bVar.a(kVar);
                        C4609lna lna = this.o;
                        if (lna != null) {
                            lna.a((C4641pna) this);
                            d dVar2 = this.n;
                            if (dVar2 != null) {
                                dVar2.b();
                                C4695vna vna = this.z;
                                String str = "googleApiWrapper";
                                if (vna != null) {
                                    if (vna.b(this)) {
                                        C4695vna vna2 = this.z;
                                        if (vna2 != null) {
                                            this.w = vna2.a((Context) this);
                                            this.x = new a();
                                            C0666s sVar = this.w;
                                            if (sVar != null) {
                                                sVar.a(this.x, C0636d.class);
                                            } else {
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            C7471uYa.b(str);
                                            throw null;
                                        }
                                    }
                                    i();
                                    return;
                                }
                                C7471uYa.b(str);
                                throw null;
                            }
                            C7471uYa.b("mediaNotificationManager");
                            throw null;
                        }
                        C7471uYa.b("mediaProvider");
                        throw null;
                    }
                    C7471uYa.b("performanceListener");
                    throw null;
                }
                C7471uYa.b("localPlayback");
                throw null;
            }
            C7471uYa.b("playbackManager");
            throw null;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public void onDestroy() {
        this.y.dispose();
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            dVar.b("MediaService", "onDestroy()");
            C4609lna lna = this.o;
            if (lna != null) {
                lna.a((C4641pna) null);
                C3968cna cna = this.m;
                if (cna != null) {
                    cna.a();
                    C0666s sVar = this.w;
                    if (sVar != null) {
                        sVar.b(this.x, C0636d.class);
                    }
                    e eVar = this.s;
                    if (eVar != null) {
                        eVar.b();
                        MediaSessionCompat mediaSessionCompat = this.B;
                        if (mediaSessionCompat != null) {
                            mediaSessionCompat.release();
                        } else {
                            C7471uYa.b("mediaSession");
                            throw null;
                        }
                    } else {
                        C7471uYa.b("delayedStopHandler");
                        throw null;
                    }
                } else {
                    C7471uYa.b("playbackManager");
                    throw null;
                }
            } else {
                C7471uYa.b("mediaProvider");
                throw null;
            }
        } else {
            C7471uYa.b("logger");
            throw null;
        }
    }

    public void onPause() {
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            dVar.b("MediaService", "onPause()");
        } else {
            C7471uYa.b("logger");
            throw null;
        }
    }

    public void onPlay() {
        com.soundcloud.android.playback.core.d dVar = this.u;
        String str = "logger";
        if (dVar != null) {
            String str2 = "MediaService";
            dVar.b(str2, "onPlay()");
            MediaSessionCompat mediaSessionCompat = this.B;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setActive(true);
                e eVar = this.s;
                if (eVar != null) {
                    eVar.b();
                    com.soundcloud.android.playback.core.d dVar2 = this.u;
                    if (dVar2 != null) {
                        dVar2.b(str2, "startService()");
                        androidx.core.content.a.a(getApplicationContext(), new Intent(getApplicationContext(), MediaService.class));
                        return;
                    }
                    C7471uYa.b(str);
                    throw null;
                }
                C7471uYa.b("delayedStopHandler");
                throw null;
            }
            C7471uYa.b("mediaSession");
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "playbackState");
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPlaybackStateChanged [");
            sb.append(playbackStateCompat);
            sb.append(']');
            dVar.a("MediaService", sb.toString());
            MediaSessionCompat mediaSessionCompat = this.B;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setPlaybackState(playbackStateCompat);
            } else {
                C7471uYa.b("mediaSession");
                throw null;
            }
        } else {
            C7471uYa.b("logger");
            throw null;
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        com.soundcloud.android.playback.core.d dVar = this.u;
        String str = "logger";
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onStartCommand(action=");
            sb.append(intent != null ? intent.getAction() : null);
            sb.append(", command=");
            String str2 = "CMD_NAME";
            sb.append(intent != null ? intent.getStringExtra(str2) : null);
            sb.append(')');
            String str3 = "MediaService";
            dVar.b(str3, sb.toString());
            if (intent != null) {
                String action = intent.getAction();
                String stringExtra = intent.getStringExtra(str2);
                if (C7471uYa.a((Object) "com.soundcloud.android.playback.players.ACTION_CMD", (Object) action)) {
                    if (stringExtra != null) {
                        int hashCode = stringExtra.hashCode();
                        String str4 = "Required value was null.";
                        String str5 = "playbackManager";
                        if (hashCode != -1945779321) {
                            if (hashCode != 506878224) {
                                if (hashCode == 2021583812 && stringExtra.equals("CMD_PRELOAD")) {
                                    C3968cna cna = this.m;
                                    if (cna != null) {
                                        Parcelable parcelableExtra = intent.getParcelableExtra("PRELOAD_ITEM");
                                        if (parcelableExtra != null) {
                                            cna.a((PreloadItem) parcelableExtra);
                                        } else {
                                            throw new IllegalArgumentException(str4);
                                        }
                                    } else {
                                        C7471uYa.b(str5);
                                        throw null;
                                    }
                                }
                            } else if (stringExtra.equals("CMD_FADE_AND_PAUSE")) {
                                C3968cna cna2 = this.m;
                                if (cna2 != null) {
                                    cna2.b();
                                } else {
                                    C7471uYa.b(str5);
                                    throw null;
                                }
                            }
                        } else if (stringExtra.equals("CMD_SET_VIDEO_SURFACE")) {
                            C3968cna cna3 = this.m;
                            if (cna3 != null) {
                                Parcelable parcelableExtra2 = intent.getParcelableExtra("SURFACE_ITEM");
                                if (parcelableExtra2 != null) {
                                    SurfacePlaybackItem surfacePlaybackItem = (SurfacePlaybackItem) parcelableExtra2;
                                    Parcelable parcelableExtra3 = intent.getParcelableExtra("SURFACE");
                                    if (parcelableExtra3 != null) {
                                        cna3.a(surfacePlaybackItem, (Surface) parcelableExtra3);
                                    } else {
                                        throw new IllegalArgumentException(str4);
                                    }
                                } else {
                                    throw new IllegalArgumentException(str4);
                                }
                            } else {
                                C7471uYa.b(str5);
                                throw null;
                            }
                        }
                    }
                    com.soundcloud.android.playback.core.d dVar2 = this.u;
                    if (dVar2 != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Received unhandled intent for command ");
                        sb2.append(stringExtra);
                        dVar2.c(str3, sb2.toString());
                    } else {
                        C7471uYa.b(str);
                        throw null;
                    }
                } else {
                    Xma c2 = c();
                    MediaSessionCompat mediaSessionCompat = this.B;
                    if (mediaSessionCompat != null) {
                        c2.a(mediaSessionCompat, intent);
                    } else {
                        C7471uYa.b("mediaSession");
                        throw null;
                    }
                }
            }
            e eVar = this.s;
            if (eVar != null) {
                eVar.c();
                return 1;
            }
            C7471uYa.b("delayedStopHandler");
            throw null;
        }
        C7471uYa.b(str);
        throw null;
    }

    public void onStop() {
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            dVar.b("MediaService", "onStop()");
            MediaSessionCompat mediaSessionCompat = this.B;
            if (mediaSessionCompat != null) {
                mediaSessionCompat.setActive(false);
                e eVar = this.s;
                if (eVar != null) {
                    eVar.c();
                    a(true);
                    return;
                }
                C7471uYa.b("delayedStopHandler");
                throw null;
            }
            C7471uYa.b("mediaSession");
            throw null;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public void onTaskRemoved(Intent intent) {
        C7471uYa.b(intent, "rootIntent");
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onTaskRemoved(");
            sb.append(intent);
            sb.append(')');
            dVar.a("MediaService", sb.toString());
            super.onTaskRemoved(intent);
            stopSelf();
            return;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public androidx.media.MediaBrowserServiceCompat.a a(String str, int i2, Bundle bundle) {
        C7471uYa.b(str, "clientPackageName");
        return b().a(str, i2, bundle);
    }

    public C4649qma b() {
        C4649qma qma = this.k;
        if (qma != null) {
            return qma;
        }
        C7471uYa.b("mediaBrowserDataSource");
        throw null;
    }

    public Xma c() {
        Xma xma = this.h;
        if (xma != null) {
            return xma;
        }
        C7471uYa.b("mediaSessionWrapper");
        throw null;
    }

    public l d() {
        l lVar = this.l;
        if (lVar != null) {
            return lVar;
        }
        C7471uYa.b("playbackStateCompatFactory");
        throw null;
    }

    public com.soundcloud.android.playback.players.t.b e() {
        com.soundcloud.android.playback.players.t.b bVar = this.i;
        if (bVar != null) {
            return bVar;
        }
        C7471uYa.b("streamPlayerFactory");
        throw null;
    }

    public defpackage.Bna.b f() {
        defpackage.Bna.b bVar = this.j;
        if (bVar != null) {
            return bVar;
        }
        C7471uYa.b("volumeControllerFactory");
        throw null;
    }

    public void a(String str, i<List<MediaItem>> iVar) {
        C7471uYa.b(str, "parentId");
        C7471uYa.b(iVar, "result");
        try {
            b().a(str, iVar);
        } catch (IllegalStateException e2) {
            if (VERSION.SDK_INT > 23) {
                throw e2;
            }
        }
    }

    public void a(int i2, Notification notification) {
        C7471uYa.b(notification, "notification");
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("pinForeground(");
            sb.append(i2);
            sb.append(')');
            dVar.b("MediaService", sb.toString());
            startForeground(i2, notification);
            this.C = true;
            return;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public void a(boolean z2) {
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("unpinForeground(");
            sb.append(z2);
            sb.append(')');
            dVar.b("MediaService", sb.toString());
            stopForeground(z2);
            this.C = false;
            return;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public void a(C4617mna mna) {
        C7471uYa.b(mna, "queue");
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            dVar.a("MediaService", "onQueueChanged()");
            mna.a().d((C6776kQa<? super T>) new i<Object>(this));
            return;
        }
        C7471uYa.b("logger");
        throw null;
    }

    public void a(C4625nna nna) {
        C7471uYa.b(nna, "currentItem");
        com.soundcloud.android.playback.core.d dVar = this.u;
        if (dVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCurrentQueueItemChanged: [");
            sb.append(nna);
            sb.append(']');
            dVar.a("MediaService", sb.toString());
            this.y.dispose();
            APa b2 = nna.b();
            HPa hPa = this.v;
            if (hPa != null) {
                VPa f = b2.a(hPa).f((C6776kQa<? super T>) new d<Object>());
                C7471uYa.a((Object) f, "currentItem.mediaMetadat…rrentQueueItemConsumer())");
                this.y = f;
                return;
            }
            C7471uYa.b("mainThreadScheduler");
            throw null;
        }
        C7471uYa.b("logger");
        throw null;
    }
}
