package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FloatingActionButtonImpl */
class c extends AnimatorListenerAdapter {
    final /* synthetic */ boolean a;
    final /* synthetic */ d b;
    final /* synthetic */ e c;

    c(e eVar, boolean z, d dVar) {
        this.c = eVar;
        this.a = z;
        this.b = dVar;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.c;
        eVar.h = 0;
        eVar.i = null;
        d dVar = this.b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void onAnimationStart(Animator animator) {
        this.c.B.a(0, this.a);
        e eVar = this.c;
        eVar.h = 2;
        eVar.i = animator;
    }
}
