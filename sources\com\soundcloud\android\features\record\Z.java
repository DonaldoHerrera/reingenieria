package com.soundcloud.android.features.record;

import android.media.AudioTrack;
import android.media.AudioTrack.OnPlaybackPositionUpdateListener;
import com.soundcloud.android.features.record.ba.c;

/* compiled from: SoundRecorder */
class Z implements OnPlaybackPositionUpdateListener {
    final /* synthetic */ ba a;

    Z(ba baVar) {
        this.a = baVar;
    }

    public void onMarkerReached(AudioTrack audioTrack) {
    }

    public void onPeriodicNotification(AudioTrack audioTrack) {
        if (this.a.t == c.PLAYING) {
            this.a.w();
        }
    }
}
