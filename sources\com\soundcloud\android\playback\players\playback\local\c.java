package com.soundcloud.android.playback.players.playback.local;

import android.media.AudioManager.OnAudioFocusChangeListener;

/* compiled from: LocalPlayback.kt */
final class c implements OnAudioFocusChangeListener {
    final /* synthetic */ b a;

    c(b bVar) {
        this.a = bVar;
    }

    public final void onAudioFocusChange(int i) {
        if (i == -3) {
            this.a.k();
        } else if (i == -2) {
            this.a.i();
        } else if (i == -1) {
            this.a.h();
        } else if (i == 1) {
            this.a.e();
        }
    }
}
