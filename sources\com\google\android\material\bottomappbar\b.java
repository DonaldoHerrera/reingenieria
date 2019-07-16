package com.google.android.material.bottomappbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BottomAppBar */
class b implements AnimatorUpdateListener {
    final /* synthetic */ BottomAppBar a;

    b(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.R.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.a.Q.invalidateSelf();
    }
}
