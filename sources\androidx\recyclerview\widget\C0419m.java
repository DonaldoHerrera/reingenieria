package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: androidx.recyclerview.widget.m reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0419m extends AnimatorListenerAdapter {
    final /* synthetic */ ViewHolder a;
    final /* synthetic */ ViewPropertyAnimator b;
    final /* synthetic */ View c;
    final /* synthetic */ r d;

    C0419m(r rVar, ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = rVar;
        this.a = viewHolder;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.l(this.a);
        this.d.r.remove(this.a);
        this.d.j();
    }

    public void onAnimationStart(Animator animator) {
        this.d.m(this.a);
    }
}
