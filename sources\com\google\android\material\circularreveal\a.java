package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: CircularRevealCompat */
class a extends AnimatorListenerAdapter {
    final /* synthetic */ e a;

    a(e eVar) {
        this.a = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b();
    }

    public void onAnimationStart(Animator animator) {
        this.a.a();
    }
}
