package com.mattprecious.telescope;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: TelescopeLayout */
class h implements AnimatorUpdateListener {
    final /* synthetic */ TelescopeLayout a;

    h(TelescopeLayout telescopeLayout) {
        this.a = telescopeLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.u = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.invalidate();
    }
}
