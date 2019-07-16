package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BottomAppBar */
class g extends AnimatorListenerAdapter {
    final /* synthetic */ BottomAppBar a;

    g(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationStart(Animator animator) {
        BottomAppBar bottomAppBar = this.a;
        bottomAppBar.b(bottomAppBar.aa);
        BottomAppBar bottomAppBar2 = this.a;
        bottomAppBar2.a(bottomAppBar2.V, this.a.aa);
    }
}
