package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: StateListAnimator */
class n extends AnimatorListenerAdapter {
    final /* synthetic */ o a;

    n(o oVar) {
        this.a = oVar;
    }

    public void onAnimationEnd(Animator animator) {
        o oVar = this.a;
        if (oVar.c == animator) {
            oVar.c = null;
        }
    }
}
