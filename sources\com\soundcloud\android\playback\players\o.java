package com.soundcloud.android.playback.players;

import com.soundcloud.android.playback.core.PlaybackItem;
import com.soundcloud.android.playback.core.m;
import java.util.List;

/* compiled from: PlayerPicker.kt */
public interface o {
    PlaybackItem a(PlaybackItem playbackItem, long j);

    boolean a(PlaybackItem playbackItem);

    List<m> b(PlaybackItem playbackItem);
}
