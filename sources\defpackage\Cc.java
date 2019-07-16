package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: Cc reason: default package */
/* compiled from: ViewPropertyAnimatorCompat */
class Cc extends AnimatorListenerAdapter {
    final /* synthetic */ Fc a;
    final /* synthetic */ View b;
    final /* synthetic */ Ec c;

    Cc(Ec ec, Fc fc, View view) {
        this.c = ec;
        this.a = fc;
        this.b = view;
    }

    public void onAnimationCancel(Animator animator) {
        this.a.a(this.b);
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b(this.b);
    }

    public void onAnimationStart(Animator animator) {
        this.a.c(this.b);
    }
}
