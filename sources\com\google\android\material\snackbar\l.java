package com.google.android.material.snackbar;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: BaseTransientBottomBar */
class l implements AnimatorUpdateListener {
    private int a = this.b;
    final /* synthetic */ int b;
    final /* synthetic */ BaseTransientBottomBar c;

    l(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.c = baseTransientBottomBar;
        this.b = i;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (BaseTransientBottomBar.b) {
            C1778vc.d(this.c.f, intValue - this.a);
        } else {
            this.c.f.setTranslationY((float) intValue);
        }
        this.a = intValue;
    }
}
