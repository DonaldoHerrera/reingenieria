package com.soundcloud.android.playback.ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: TimestampView */
class l extends AnimatorListenerAdapter {
    final /* synthetic */ TimestampView a;

    l(TimestampView timestampView) {
        this.a = timestampView;
    }

    public void onAnimationCancel(Animator animator) {
        this.a.a.setLayerType(0, null);
    }

    public void onAnimationEnd(Animator animator) {
        this.a.a.setLayerType(0, null);
    }
}
