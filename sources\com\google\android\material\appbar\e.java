package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: CollapsingToolbarLayout */
class e implements AnimatorUpdateListener {
    final /* synthetic */ CollapsingToolbarLayout a;

    e(CollapsingToolbarLayout collapsingToolbarLayout) {
        this.a = collapsingToolbarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
