package com.google.android.material.transformation;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* compiled from: FabTransformationBehavior */
class d implements AnimatorUpdateListener {
    final /* synthetic */ View a;
    final /* synthetic */ FabTransformationBehavior b;

    d(FabTransformationBehavior fabTransformationBehavior, View view) {
        this.b = fabTransformationBehavior;
        this.a = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
