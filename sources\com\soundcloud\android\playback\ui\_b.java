package com.soundcloud.android.playback.ui;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* compiled from: SlidingPlayerController */
class _b implements OnGlobalLayoutListener {
    final /* synthetic */ ac a;

    _b(ac acVar) {
        this.a = acVar;
    }

    public void onGlobalLayout() {
        if (this.a.k.c() != 5) {
            this.a.k.b(false);
        }
        this.a.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
