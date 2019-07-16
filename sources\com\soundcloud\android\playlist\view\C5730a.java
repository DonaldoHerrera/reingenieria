package com.soundcloud.android.playlist.view;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

/* renamed from: com.soundcloud.android.playlist.view.a reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C5730a implements AnimatorUpdateListener {
    private final /* synthetic */ M a;

    public /* synthetic */ C5730a(M m) {
        this.a = m;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator);
    }
}
