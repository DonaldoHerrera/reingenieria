package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: HideBottomViewOnScrollBehavior */
class a extends AnimatorListenerAdapter {
    final /* synthetic */ HideBottomViewOnScrollBehavior a;

    a(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        this.a = hideBottomViewOnScrollBehavior;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.c = null;
    }
}
