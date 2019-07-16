package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.widget.TextView;

/* compiled from: TextScale */
class p implements AnimatorUpdateListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ q b;

    p(q qVar, TextView textView) {
        this.b = qVar;
        this.a = textView;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.setScaleX(floatValue);
        this.a.setScaleY(floatValue);
    }
}
