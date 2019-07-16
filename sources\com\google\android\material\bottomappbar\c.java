package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar */
class c extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    c(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.U = null;
    }
}
