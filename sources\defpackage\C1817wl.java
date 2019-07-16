package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: wl reason: default package and case insensitive filesystem */
/* compiled from: FloatValueAnimatorBuilder */
class C1817wl implements AnimatorUpdateListener {
    final /* synthetic */ b a;
    final /* synthetic */ C1877yl b;

    C1817wl(C1877yl ylVar, b bVar) {
        this.b = ylVar;
        this.a = bVar;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }
}
