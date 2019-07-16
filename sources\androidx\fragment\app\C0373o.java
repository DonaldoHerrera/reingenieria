package androidx.fragment.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

/* renamed from: androidx.fragment.app.o reason: case insensitive filesystem */
/* compiled from: FragmentManagerImpl */
class C0373o extends b {
    final /* synthetic */ ViewGroup b;
    final /* synthetic */ Fragment c;
    final /* synthetic */ C0377t d;

    C0373o(C0377t tVar, AnimationListener animationListener, ViewGroup viewGroup, Fragment fragment) {
        this.d = tVar;
        this.b = viewGroup;
        this.c = fragment;
        super(animationListener);
    }

    public void onAnimationEnd(Animation animation) {
        super.onAnimationEnd(animation);
        this.b.post(new C0372n(this));
    }
}
