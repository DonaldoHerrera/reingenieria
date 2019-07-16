package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ChangeTransform */
class r extends AnimatorListenerAdapter {
    private boolean a;
    private Matrix b = new Matrix();
    final /* synthetic */ boolean c;
    final /* synthetic */ Matrix d;
    final /* synthetic */ View e;
    final /* synthetic */ c f;
    final /* synthetic */ b g;
    final /* synthetic */ ChangeTransform h;

    r(ChangeTransform changeTransform, boolean z, Matrix matrix, View view, c cVar, b bVar) {
        this.h = changeTransform;
        this.c = z;
        this.d = matrix;
        this.e = view;
        this.f = cVar;
        this.g = bVar;
    }

    private void a(Matrix matrix) {
        this.b.set(matrix);
        this.e.setTag(M.transition_transform, this.b);
        this.f.a(this.e);
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            if (!this.c || !this.h.O) {
                this.e.setTag(M.transition_transform, null);
                this.e.setTag(M.parent_matrix, null);
            } else {
                a(this.d);
            }
        }
        wa.a(this.e, (Matrix) null);
        this.f.a(this.e);
    }

    public void onAnimationPause(Animator animator) {
        a(this.g.a());
    }

    public void onAnimationResume(Animator animator) {
        ChangeTransform.f(this.e);
    }
}
