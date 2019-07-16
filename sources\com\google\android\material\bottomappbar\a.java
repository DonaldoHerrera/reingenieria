package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar */
class a extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    a(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.T = null;
    }
}
