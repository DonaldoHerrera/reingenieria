package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.transition.j reason: case insensitive filesystem */
/* compiled from: ChangeBounds */
class C0452j extends AnimatorListenerAdapter {
    private boolean a;
    final /* synthetic */ View b;
    final /* synthetic */ Rect c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ ChangeBounds h;

    C0452j(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
        this.h = changeBounds;
        this.b = view;
        this.c = rect;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            C1778vc.a(this.b, this.c);
            wa.a(this.b, this.d, this.e, this.f, this.g);
        }
    }
}
