package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: TabLayout */
class c extends AnimatorListenerAdapter {
    final /* synthetic */ int a;
    final /* synthetic */ e b;

    c(e eVar, int i) {
        this.b = eVar;
        this.a = i;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.b;
        eVar.d = this.a;
        eVar.e = 0.0f;
    }
}
