package com.soundcloud.android.playback.players;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: MediaService.kt */
final class g extends C7540vYa implements _Xa<PlaybackStateCompat, RVa> {
    final /* synthetic */ MediaService a;

    g(MediaService mediaService) {
        this.a = mediaService;
        super(1);
    }

    public final void a(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "it");
        MediaService.e(this.a).setPlaybackState(playbackStateCompat);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((PlaybackStateCompat) obj);
        return RVa.a;
    }
}
