package defpackage;

import android.view.Surface;
import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.PreloadItem;
import com.soundcloud.android.playback.core.SurfacePlaybackItem;

/* renamed from: _ma reason: default package */
/* compiled from: Playback.kt */
public final class _ma implements C3952ana {
    public static final _ma a = new _ma();

    private _ma() {
    }

    public void a(long j) {
    }

    public void a(a aVar) {
        C7471uYa.b(aVar, "callback");
    }

    public void a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
    }

    public void a(PreloadItem preloadItem) {
        C7471uYa.b(preloadItem, "preloadItem");
        b.a(this, preloadItem);
    }

    public void destroy() {
    }

    public boolean f() {
        return false;
    }

    public void g() {
        b.a(this);
    }

    public boolean isPlaying() {
        return false;
    }

    public Long j() {
        return null;
    }

    public void pause() {
    }

    public void start() {
        b.b(this);
    }

    public void stop() {
    }

    public void a(SurfacePlaybackItem surfacePlaybackItem, Surface surface) {
        C7471uYa.b(surfacePlaybackItem, "surfacePlaybackItem");
        C7471uYa.b(surface, "surface");
        b.a(this, surfacePlaybackItem, surface);
    }
}
