package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: BaseTransientBottomBar */
class a extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ BaseTransientBottomBar b;

    a(BaseTransientBottomBar baseTransientBottomBar, int i) {
        this.b = baseTransientBottomBar;
        this.a = i;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.c(this.a);
    }

    public void onAnimationStart(Animator animator) {
        this.b.g.b(0, 180);
    }
}
