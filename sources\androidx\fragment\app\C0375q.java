package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.fragment.app.q reason: case insensitive filesystem */
/* compiled from: FragmentManagerImpl */
class C0375q extends AnimatorListenerAdapter {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ View b;
    final /* synthetic */ Fragment c;
    final /* synthetic */ C0377t d;

    C0375q(C0377t tVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.d = tVar;
        this.a = viewGroup;
        this.b = view;
        this.c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.b);
        animator.removeListener(this);
        View view = this.c.mView;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
