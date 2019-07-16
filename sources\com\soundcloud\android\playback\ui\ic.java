package com.soundcloud.android.playback.ui;

import android.view.animation.Animation;

/* compiled from: TrackPagePresenter */
class ic extends a {
    final /* synthetic */ a a;
    final /* synthetic */ mc b;

    ic(mc mcVar, a aVar) {
        this.b = mcVar;
        this.a = aVar;
    }

    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.b.o(this.a.d);
        this.a.d.setAlpha(1.0f);
    }
}
