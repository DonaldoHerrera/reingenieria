package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.p reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0422p extends AnimatorListenerAdapter {
    final /* synthetic */ a a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ r d;

    C0422p(r rVar, a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = rVar;
        this.a = aVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.a(this.a.a, true);
        this.d.s.remove(this.a.a);
        this.d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.d.b(this.a.a, true);
    }
}
