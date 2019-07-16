package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;

/* compiled from: CircularProgressDrawable */
class c implements AnimatorListener {
    final /* synthetic */ a a;
    final /* synthetic */ d b;

    c(d dVar, a aVar) {
        this.b = dVar;
        this.a = aVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
        this.b.a(1.0f, this.a, true);
        this.a.l();
        this.a.j();
        d dVar = this.b;
        if (dVar.i) {
            dVar.i = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.a.a(false);
            return;
        }
        dVar.h += 1.0f;
    }

    public void onAnimationStart(Animator animator) {
        this.b.h = 0.0f;
    }
}
