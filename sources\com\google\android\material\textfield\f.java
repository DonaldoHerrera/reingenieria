package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: TextInputLayout */
class f implements AnimatorUpdateListener {
    final /* synthetic */ TextInputLayout a;

    f(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.aa.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
