package com.soundcloud.android.playback.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import com.soundcloud.android.foundation.playqueue.p;

/* compiled from: ScaleAnimationObserver */
class Wb extends C5037Jua<p> {
    private final View d;

    public Wb(View view) {
        this.d = view;
    }

    public void a(p pVar) {
        Rect rect = new Rect();
        this.d.getGlobalVisibleRect(rect);
        this.d.setPivotY((float) (rect.bottom - this.d.getTop()));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.d, View.SCALE_X, new float[]{1.0f, 1.1f, 1.0f});
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.d, View.SCALE_Y, new float[]{1.0f, 1.1f, 1.0f});
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(600);
        animatorSet.setInterpolator(new C0488bd());
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        animatorSet.start();
    }
}
