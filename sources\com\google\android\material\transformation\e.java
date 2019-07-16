package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;

/* compiled from: FabTransformationBehavior */
class e extends AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.material.circularreveal.e a;
    final /* synthetic */ Drawable b;
    final /* synthetic */ FabTransformationBehavior c;

    e(FabTransformationBehavior fabTransformationBehavior, com.google.android.material.circularreveal.e eVar, Drawable drawable) {
        this.c = fabTransformationBehavior;
        this.a = eVar;
        this.b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(null);
    }

    public void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.b);
    }
}
