package com.soundcloud.android.playback.players;

import android.os.Bundle;
import android.support.v4.media.session.PlaybackStateCompat;
import com.soundcloud.android.playback.core.Stream;
import java.io.Serializable;

/* compiled from: PlaybackStateCompatFactory.kt */
public final class m {
    public static final long a(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "$this$duration");
        Bundle extras = playbackStateCompat.getExtras();
        if (extras != null) {
            return extras.getLong("duration");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final String b(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "$this$playerType");
        Bundle extras = playbackStateCompat.getExtras();
        if (extras != null) {
            return extras.getString("playerType");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Jla c(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "$this$reason");
        Bundle extras = playbackStateCompat.getExtras();
        if (extras != null) {
            Serializable serializable = extras.getSerializable("reason");
            if (!(serializable instanceof Jla)) {
                serializable = null;
            }
            return (Jla) serializable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Stream d(PlaybackStateCompat playbackStateCompat) {
        C7471uYa.b(playbackStateCompat, "$this$stream");
        Bundle extras = playbackStateCompat.getExtras();
        if (extras != null) {
            return (Stream) extras.getParcelable("stream");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
