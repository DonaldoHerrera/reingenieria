package com.soundcloud.android.playback.players;

import com.soundcloud.android.playback.core.PlaybackItem;
import java.util.List;

/* compiled from: PlayerPicker.kt */
public final class b implements o {
    public static final b a = new b();

    private b() {
    }

    public PlaybackItem a(PlaybackItem playbackItem, long j) {
        C7471uYa.b(playbackItem, "playbackItem");
        return playbackItem;
    }

    public boolean a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        return true;
    }

    public List<C3749dba> b(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "playbackItem");
        return C6850lWa.a(C3749dba.b);
    }
}
