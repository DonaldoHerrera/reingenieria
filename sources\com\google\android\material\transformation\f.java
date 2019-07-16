package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.circularreveal.e;
import com.google.android.material.circularreveal.e.d;

/* compiled from: FabTransformationBehavior */
class f extends AnimatorListenerAdapter {
    final /* synthetic */ e a;
    final /* synthetic */ FabTransformationBehavior b;

    f(FabTransformationBehavior fabTransformationBehavior, e eVar) {
        this.b = fabTransformationBehavior;
        this.a = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        d revealInfo = this.a.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        this.a.setRevealInfo(revealInfo);
    }
}
