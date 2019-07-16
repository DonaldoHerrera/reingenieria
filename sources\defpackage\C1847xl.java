package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: xl reason: default package and case insensitive filesystem */
/* compiled from: FloatValueAnimatorBuilder */
class C1847xl extends AnimatorListenerAdapter {
    final /* synthetic */ C1877yl a;

    C1847xl(C1877yl ylVar) {
        this.a = ylVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b.a();
    }
}
