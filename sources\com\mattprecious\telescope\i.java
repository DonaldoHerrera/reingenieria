package com.mattprecious.telescope;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: TelescopeLayout */
class i implements AnimatorUpdateListener {
    final /* synthetic */ TelescopeLayout a;

    i(TelescopeLayout telescopeLayout) {
        this.a = telescopeLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.invalidate();
    }
}
