package com.soundcloud.android.playback;

import com.soundcloud.android.playback.core.PlaybackItem;

/* renamed from: com.soundcloud.android.playback.fc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4307fc<T, R> implements C7118pQa<T, R> {
    public static final C4307fc a = new C4307fc();

    C4307fc() {
    }

    /* renamed from: a */
    public final C4633ona apply(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "it");
        return new c(playbackItem);
    }
}
