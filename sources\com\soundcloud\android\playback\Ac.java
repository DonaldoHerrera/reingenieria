package com.soundcloud.android.playback;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: PlaybackStateCompatExtensions.kt */
public final class Ac {
    public static final C3508cda a(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "$this$urn");
        C3508cda b = C5526_Ha.b(playbackStateCompat.getExtras(), "urnExtraKey");
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
