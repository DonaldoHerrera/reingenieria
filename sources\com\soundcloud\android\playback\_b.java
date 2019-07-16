package com.soundcloud.android.playback;

import android.view.Surface;
import com.soundcloud.android.playback.ke.a;

/* compiled from: PlaybackListeners.kt */
final class _b implements a {
    final /* synthetic */ C4282ac a;

    _b(C4282ac acVar) {
        this.a = acVar;
    }

    public final void a(String str, Surface surface) {
        C7471uYa.b(str, "uuid");
        C7471uYa.b(surface, "surface");
        this.a.f.a(str, surface);
    }
}
