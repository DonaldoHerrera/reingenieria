package com.soundcloud.android.onboarding;

import android.view.View;
import android.view.animation.Animation;

/* compiled from: OnboardActivity */
class n extends a {
    final /* synthetic */ OnboardActivity a;

    n(OnboardActivity onboardActivity) {
        this.a = onboardActivity;
    }

    public void onAnimationEnd(Animation animation) {
        this.a.n.setVisibility(8);
        if (this.a.p != null) {
            C5466YFa.a((View) this.a.p, false);
        }
        if (this.a.q != null) {
            C5466YFa.a((View) this.a.q, false);
        }
        if (this.a.r != null) {
            C5466YFa.a((View) this.a.r, false);
        }
    }
}
