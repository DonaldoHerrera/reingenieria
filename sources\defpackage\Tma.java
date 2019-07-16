package defpackage;

import com.soundcloud.android.foundation.events.C3709k;
import com.soundcloud.android.playback.AudioAdPlaybackItem;
import com.soundcloud.android.playback.AudioPlaybackItem;
import com.soundcloud.android.playback.OfflinePlaybackItem;
import com.soundcloud.android.playback.VideoAdPlaybackItem;
import com.soundcloud.android.playback.core.PlaybackItem;

/* renamed from: Tma reason: default package */
/* compiled from: PlaybackItemExtensions.kt */
public final class Tma {
    public static final C3508cda a(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "$this$urn");
        C3508cda b = C5526_Ha.b(playbackItem.b(), "urnExtraKey");
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final boolean b(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "$this$isAd");
        if (!(playbackItem instanceof AudioAdPlaybackItem) && !(playbackItem instanceof VideoAdPlaybackItem)) {
            return false;
        }
        return true;
    }

    public static final C3709k c(PlaybackItem playbackItem) {
        C7471uYa.b(playbackItem, "$this$toEntityType");
        if (playbackItem instanceof AudioAdPlaybackItem) {
            return C3709k.AUDIO_AD;
        }
        if (playbackItem instanceof VideoAdPlaybackItem) {
            return C3709k.VIDEO_AD;
        }
        if (playbackItem instanceof AudioPlaybackItem) {
            return C3709k.SOUNDCLOUD;
        }
        if (playbackItem instanceof OfflinePlaybackItem) {
            return C3709k.SOUNDCLOUD;
        }
        return null;
    }

    public static final void a(PlaybackItem playbackItem, C3508cda cda) {
        C7471uYa.b(playbackItem, "$this$urn");
        C7471uYa.b(cda, "value");
        C5526_Ha.b(playbackItem.b(), "urnExtraKey", cda);
    }
}
