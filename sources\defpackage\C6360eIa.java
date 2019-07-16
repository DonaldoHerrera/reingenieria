package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: eIa reason: default package and case insensitive filesystem */
/* compiled from: ViewExtensions.kt */
public final class C6360eIa extends AnimatorListenerAdapter {
    final /* synthetic */ View a;

    C6360eIa(View view) {
        this.a = view;
    }

    public void onAnimationStart(Animator animator) {
        C7471uYa.b(animator, "animation");
        super.onAnimationStart(animator);
        this.a.setVisibility(0);
    }
}
