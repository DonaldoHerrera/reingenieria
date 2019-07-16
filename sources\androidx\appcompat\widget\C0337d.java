package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.appcompat.widget.d reason: case insensitive filesystem */
/* compiled from: ActionBarOverlayLayout */
class C0337d extends AnimatorListenerAdapter {
    final /* synthetic */ ActionBarOverlayLayout a;

    C0337d(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.x = null;
        actionBarOverlayLayout.l = false;
    }

    public void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.x = null;
        actionBarOverlayLayout.l = false;
    }
}
