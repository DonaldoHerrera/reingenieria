package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.transition.aa reason: case insensitive filesystem */
/* compiled from: Transition */
class C0438aa extends AnimatorListenerAdapter {
    final /* synthetic */ Transition a;

    C0438aa(Transition transition) {
        this.a = transition;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.i();
        animator.removeListener(this);
    }
}
