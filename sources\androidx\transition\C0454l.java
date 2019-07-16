package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;

/* renamed from: androidx.transition.l reason: case insensitive filesystem */
/* compiled from: ChangeClipBounds */
class C0454l extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ ChangeClipBounds b;

    C0454l(ChangeClipBounds changeClipBounds, View view) {
        this.b = changeClipBounds;
        this.a = view;
    }

    public void onAnimationEnd(Animator animator) {
        C1778vc.a(this.a, (Rect) null);
    }
}
