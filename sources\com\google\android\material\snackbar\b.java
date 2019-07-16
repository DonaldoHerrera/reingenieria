package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BaseTransientBottomBar */
class b implements AnimatorUpdateListener {
    private int a = 0;
    final /* synthetic */ BaseTransientBottomBar b;

    b(BaseTransientBottomBar baseTransientBottomBar) {
        this.b = baseTransientBottomBar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.b) {
            C1778vc.d(this.b.f, intValue - this.a);
        } else {
            this.b.f.setTranslationY((float) intValue);
        }
        this.a = intValue;
    }
}
