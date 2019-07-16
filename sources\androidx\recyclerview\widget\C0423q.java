package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: androidx.recyclerview.widget.q reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0423q extends AnimatorListenerAdapter {
    final /* synthetic */ a a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ r d;

    C0423q(r rVar, a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
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
        this.d.a(this.a.b, false);
        this.d.s.remove(this.a.b);
        this.d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.d.b(this.a.b, false);
    }
}
