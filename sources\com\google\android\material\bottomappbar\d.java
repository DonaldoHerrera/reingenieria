package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;

/* compiled from: BottomAppBar */
class d extends AnimatorListenerAdapter {
    public boolean a;
    final /* synthetic */ ActionMenuView b;
    final /* synthetic */ int c;
    final /* synthetic */ boolean d;
    final /* synthetic */ BottomAppBar e;

    d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i, boolean z) {
        this.e = bottomAppBar;
        this.b = actionMenuView;
        this.c = i;
        this.d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.e.a(this.b, this.c, this.d);
        }
    }
}
