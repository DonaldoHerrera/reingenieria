package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: androidx.recyclerview.widget.n reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0420n extends AnimatorListenerAdapter {
    final /* synthetic */ ViewHolder a;
    final /* synthetic */ View b;
    final /* synthetic */ ViewPropertyAnimator c;
    final /* synthetic */ r d;

    C0420n(r rVar, ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = rVar;
        this.a = viewHolder;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.h(this.a);
        this.d.p.remove(this.a);
        this.d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.d.i(this.a);
    }
}
