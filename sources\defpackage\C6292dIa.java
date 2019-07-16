package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: dIa reason: default package and case insensitive filesystem */
/* compiled from: ViewExtensions.kt */
public final class C6292dIa extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ int b;

    C6292dIa(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public void onAnimationEnd(Animator animator) {
        C7471uYa.b(animator, "animation");
        super.onAnimationEnd(animator);
        this.a.setVisibility(this.b);
    }
}
