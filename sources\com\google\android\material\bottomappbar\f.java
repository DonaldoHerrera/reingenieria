package com.google.android.material.bottomappbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BottomAppBar */
class f implements AnimatorUpdateListener {
    final /* synthetic */ BottomAppBar a;

    f(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.Q.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
