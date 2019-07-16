package com.soundcloud.android.onboarding;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.onboarding.OnboardActivity.b;

/* compiled from: OnboardActivity */
class o implements OnClickListener {
    final /* synthetic */ OnboardActivity a;

    o(OnboardActivity onboardActivity) {
        this.a = onboardActivity;
    }

    public void onClick(View view) {
        this.a.a(b.LOGIN);
        this.a.Z.a(Yca.AUTH_LOG_IN);
        this.a.W.a(Baa.i());
    }
}
