package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseTransientBottomBar */
class k extends AnimatorListenerAdapter {
    final /* synthetic */ BaseTransientBottomBar a;

    k(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.l();
    }

    public void onAnimationStart(Animator animator) {
        this.a.g.a(70, 180);
    }
}
