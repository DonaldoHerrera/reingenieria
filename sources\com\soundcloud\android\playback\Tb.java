package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.aa;

/* compiled from: PlaybackItemRepository.kt */
final class Tb<T> implements C6776kQa<VideoAdPlaybackItem> {
    final /* synthetic */ aa a;

    Tb(aa aaVar) {
        this.a = aaVar;
    }

    /* renamed from: a */
    public final void accept(VideoAdPlaybackItem videoAdPlaybackItem) {
        Wb wb = Wb.b;
        aa aaVar = this.a;
        C7471uYa.a((Object) videoAdPlaybackItem, "it");
        wb.a(aaVar, videoAdPlaybackItem);
    }
}
