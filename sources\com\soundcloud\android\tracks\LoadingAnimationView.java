package com.soundcloud.android.tracks;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.soundcloud.android.ia.g;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.view.C6232v;

public class LoadingAnimationView extends FrameLayout {
    private final float a = (-getResources().getDimension(g.play_loading_transition_y_offset));
    private final View[] b = {findViewById(i.loading_bar_1), findViewById(i.loading_bar_2), findViewById(i.loading_bar_3), findViewById(i.loading_bar_4), findViewById(i.loading_bar_5)};
    private AnimatorSet c = new AnimatorSet();

    private static class a extends C6232v {
        private a() {
        }

        public void onAnimationEnd(Animator animator) {
            animator.setStartDelay(700);
            animator.start();
        }
    }

    public LoadingAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(l.loading_icon, this, true);
    }
}
