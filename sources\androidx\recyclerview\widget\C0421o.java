package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: androidx.recyclerview.widget.o reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0421o extends AnimatorListenerAdapter {
    final /* synthetic */ ViewHolder a;
    final /* synthetic */ int b;
    final /* synthetic */ View c;
    final /* synthetic */ int d;
    final /* synthetic */ ViewPropertyAnimator e;
    final /* synthetic */ r f;

    C0421o(r rVar, ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = rVar;
        this.a = viewHolder;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    public void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.j(this.a);
        this.f.q.remove(this.a);
        this.f.j();
    }

    public void onAnimationStart(Animator animator) {
        this.f.k(this.a);
    }
}
