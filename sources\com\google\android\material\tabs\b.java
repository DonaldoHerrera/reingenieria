package com.google.android.material.tabs;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* compiled from: TabLayout */
class b implements AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ e e;

    b(e eVar, int i, int i2, int i3, int i4) {
        this.e = eVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        this.e.b(Ez.a(this.a, this.b, animatedFraction), Ez.a(this.c, this.d, animatedFraction));
    }
}
