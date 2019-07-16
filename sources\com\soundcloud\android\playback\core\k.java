package com.soundcloud.android.playback.core;

import android.view.Surface;

@EVa(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002$%J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\tH&J\u0012\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H&J\u0012\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u001c\u0010\u001b\u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u000bH&J\b\u0010#\u001a\u00020\u0003H&¨\u0006&"}, d2 = {"Lcom/soundcloud/android/playback/core/Player;", "", "destroy", "", "getCurrentPlaybackItem", "Lcom/soundcloud/android/playback/core/PlaybackItem;", "getPlayerType", "Lcom/soundcloud/android/playback/core/PlayerType;", "getProgress", "", "getVolume", "", "pause", "play", "playbackItem", "preload", "preloadItem", "Lcom/soundcloud/android/playback/core/PreloadItem;", "resume", "seek", "ms", "setPerformanceListener", "playerPerformanceListener", "Lcom/soundcloud/android/playback/core/Player$PlayerPerformanceListener;", "setStateListener", "playerStateListener", "Lcom/soundcloud/android/playback/core/Player$PlayerStateListener;", "setSurface", "playbackItemId", "", "Lcom/soundcloud/android/playback/core/PlaybackItemId;", "surface", "Landroid/view/Surface;", "setVolume", "volume", "stop", "PlayerPerformanceListener", "PlayerStateListener", "playback-core_release"}, mv = {1, 1, 15})
/* compiled from: Player.kt */
public interface k {

    /* compiled from: Player.kt */
    public static final class a {
        public static void a(k kVar, String str, Surface surface) {
            C7471uYa.b(str, "playbackItemId");
            C7471uYa.b(surface, "surface");
        }
    }

    /* compiled from: Player.kt */
    public interface b {
        void a(Ela ela);

        void a(Fla fla);
    }

    /* compiled from: Player.kt */
    public interface c {
        void a(Hla hla);

        void a(Ila ila);
    }

    m a();

    void a(float f);

    void a(long j);

    void a(PlaybackItem playbackItem);

    void a(PreloadItem preloadItem);

    void a(b bVar);

    void a(c cVar);

    void a(String str, Surface surface);

    void b();

    float c();

    long d();

    void destroy();

    void pause();

    void stop();
}
