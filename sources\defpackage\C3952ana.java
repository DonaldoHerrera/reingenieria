package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.view.Surface;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;

@EVa(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u001eJ\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0006H&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016J\b\u0010\u001d\u001a\u00020\u0003H&¨\u0006\u001f"}, d2 = {"Lcom/soundcloud/android/playback/players/playback/Playback;", "", "destroy", "", "fadeAndPause", "getStreamPosition", "", "()Ljava/lang/Long;", "isBuffering", "", "isPlaying", "pause", "play", "playbackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "seek", "position", "setCallback", "callback", "Lcom/soundcloud/android/playback/players/playback/Playback$Callback;", "setVideoSurface", "surfacePlaybackItem", "Lcom/soundcloud/android/playback/core/SurfacePlaybackItem;", "surface", "Landroid/view/Surface;", "start", "stop", "Callback", "players_release"}, mv = {1, 1, 15})
/* renamed from: ana reason: default package and case insensitive filesystem */
/* compiled from: Playback.kt */
public interface C3952ana {

    /* renamed from: ana$a */
    /* compiled from: Playback.kt */
    public interface a {
        void a(PlaybackStateCompat playbackStateCompat);

        void b(PlaybackStateCompat playbackStateCompat);
    }

    /* renamed from: ana$b */
    /* compiled from: Playback.kt */
    public static final class b {
        public static void a(C3952ana ana) {
            ana.pause();
        }

        public static void a(C3952ana ana, PreloadItem preloadItem) {
            C7471uYa.b(preloadItem, "preloadItem");
        }

        public static void a(C3952ana ana, SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
            C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
            C7471uYa.b(surface, "surface");
        }

        public static void b(C3952ana ana) {
        }
    }

    void a(long j);

    void a(a aVar);

    void a(PlaybackItem playbackItem);

    void a(PreloadItem preloadItem);

    void a(SurfacePlaybackItem surfacePlaybackItem, Surface surface);

    void destroy();

    boolean f();

    void g();

    boolean isPlaying();

    Long j();

    void pause();

    void start();

    void stop();
}
