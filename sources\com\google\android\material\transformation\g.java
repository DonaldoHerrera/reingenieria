package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FabTransformationScrimBehavior */
class g extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;
    final /* synthetic */ FabTransformationScrimBehavior c;

    g(FabTransformationScrimBehavior fabTransformationScrimBehavior, boolean z, View view) {
        this.c = fabTransformationScrimBehavior;
        this.a = z;
        this.b = view;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.setVisibility(4);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.setVisibility(0);
        }
    }
}
