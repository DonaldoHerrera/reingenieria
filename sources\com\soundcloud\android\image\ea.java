package com.soundcloud.android.image;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: OneShotTransitionDrawable */
public class ea extends TransitionDrawable {
    private boolean a;

    public ea(Drawable[] drawableArr) {
        super(drawableArr);
    }

    public void startTransition(int i) {
        if (!this.a) {
            this.a = true;
            super.startTransition(i);
        }
    }
}
