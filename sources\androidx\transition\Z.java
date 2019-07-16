package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: Transition */
class Z extends AnimatorListenerAdapter {
    final /* synthetic */ T a;
    final /* synthetic */ Transition b;

    Z(Transition transition, T t) {
        this.b = transition;
        this.a = t;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.b.A.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.b.A.add(animator);
    }
}
