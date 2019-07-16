package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: AppBarLayout */
class b implements AnimatorUpdateListener {
    final /* synthetic */ CoordinatorLayout a;
    final /* synthetic */ AppBarLayout b;
    final /* synthetic */ BaseBehavior c;

    b(BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.c = baseBehavior;
        this.a = coordinatorLayout;
        this.b = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.c.c(this.a, this.b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
