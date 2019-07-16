package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: FabTransformationBehavior */
class c extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;
    final /* synthetic */ View c;
    final /* synthetic */ FabTransformationBehavior d;

    c(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
        this.d = fabTransformationBehavior;
        this.a = z;
        this.b = view;
        this.c = view2;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.a) {
            this.b.setVisibility(0);
            this.c.setAlpha(0.0f);
            this.c.setVisibility(4);
        }
    }
}
