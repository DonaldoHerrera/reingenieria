package com.soundcloud.android.playback.players;

import android.support.v4.media.MediaMetadataCompat;

/* compiled from: MediaService.kt */
final class h extends C7540vYa implements _Xa<MediaMetadataCompat, RVa> {
    final /* synthetic */ MediaService a;

    h(MediaService mediaService) {
        this.a = mediaService;
        super(1);
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        C7471uYa.b(mediaMetadataCompat, "it");
        MediaService.e(this.a).setMetadata(mediaMetadataCompat);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((MediaMetadataCompat) obj);
        return RVa.a;
    }
}
