package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ExpandableTransformationBehavior */
class b extends AnimatorListenerAdapter {
    final /* synthetic */ ExpandableTransformationBehavior a;

    b(ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.a = expandableTransformationBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b = null;
    }
}
