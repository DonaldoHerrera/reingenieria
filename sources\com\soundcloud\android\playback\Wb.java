package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.aa;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: PlaybackItemRepository.kt */
public final class Wb {
    private static final ConcurrentHashMap<String, VideoAdPlaybackItem> a = new ConcurrentHashMap<>();
    public static final Wb b = new Wb();

    private Wb() {
    }

    public final void a(aa aaVar, VideoAdPlaybackItem videoAdPlaybackItem) {
        C7471uYa.b(aaVar, "videoAd");
        C7471uYa.b(videoAdPlaybackItem, "videoAdPlaybackItem");
        a.put(aaVar.I(), videoAdPlaybackItem);
    }

    public final VideoAdPlaybackItem a(String str) {
        C7471uYa.b(str, "videoAdUuid");
        return (VideoAdPlaybackItem) a.get(str);
    }
}
