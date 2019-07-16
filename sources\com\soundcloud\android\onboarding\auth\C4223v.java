package com.soundcloud.android.onboarding.auth;

import android.view.animation.Animation;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: com.soundcloud.android.onboarding.auth.v reason: case insensitive filesystem */
/* compiled from: AuthLayout.kt */
public final class C4223v extends a {
    final /* synthetic */ ConstraintLayout a;

    C4223v(ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
    }
}
