package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: FloatingActionButtonImpl */
class b extends AnimatorListenerAdapter {
    private boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ d c;
    final /* synthetic */ e d;

    b(e eVar, boolean z, d dVar) {
        this.d = eVar;
        this.b = z;
        this.c = dVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.d;
        eVar.h = 0;
        eVar.i = null;
        if (!this.a) {
            eVar.B.a(this.b ? 8 : 4, this.b);
            d dVar = this.c;
            if (dVar != null) {
                dVar.b();
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.d.B.a(0, this.b);
        e eVar = this.d;
        eVar.h = 1;
        eVar.i = animator;
        this.a = false;
    }
}
