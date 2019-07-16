package com.soundcloud.android.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

/* renamed from: com.soundcloud.android.view.b reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C6213b implements AnimatorUpdateListener {
    private final /* synthetic */ Drawable a;
    private final /* synthetic */ ValueAnimator b;

    public /* synthetic */ C6213b(Drawable drawable, ValueAnimator valueAnimator) {
        this.a = drawable;
        this.b = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.setColorFilter(((Integer) this.b.getAnimatedValue()).intValue(), Mode.SRC_IN);
    }
}
