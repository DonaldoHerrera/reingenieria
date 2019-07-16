package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: Visibility */
class Ba extends AnimatorListenerAdapter {
    final /* synthetic */ ma a;
    final /* synthetic */ View b;
    final /* synthetic */ Visibility c;

    Ba(Visibility visibility, ma maVar, View view) {
        this.c = visibility;
        this.a = maVar;
        this.b = view;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b(this.b);
    }
}
