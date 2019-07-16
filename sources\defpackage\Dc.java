package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;

/* renamed from: Dc reason: default package */
/* compiled from: ViewPropertyAnimatorCompat */
class Dc implements AnimatorUpdateListener {
    final /* synthetic */ Hc a;
    final /* synthetic */ View b;
    final /* synthetic */ Ec c;

    Dc(Ec ec, Hc hc, View view) {
        this.c = ec;
        this.a = hc;
        this.b = view;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(this.b);
    }
}
