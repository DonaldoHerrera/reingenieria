package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar */
class e extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    e(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.S = null;
    }
}
