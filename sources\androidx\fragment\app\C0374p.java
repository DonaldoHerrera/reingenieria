package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.p reason: case insensitive filesystem */
/* compiled from: FragmentManagerImpl */
class C0374p extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ Fragment c;
    final /* synthetic */ C0377t d;

    C0374p(C0377t tVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.d = tVar;
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        Animator animator2 = this.c.getAnimator();
        this.c.setAnimator(null);
        if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
            C0377t tVar = this.d;
            Fragment fragment = this.c;
            tVar.a(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
        }
    }
}
