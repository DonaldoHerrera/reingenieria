package com.soundcloud.android.onboarding;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.onboarding.OnboardActivity.b;
import com.soundcloud.android.onboarding.auth.ma;

/* compiled from: OnboardActivity */
class p implements OnClickListener {
    final /* synthetic */ OnboardActivity a;

    p(OnboardActivity onboardActivity) {
        this.a = onboardActivity;
    }

    public void onClick(View view) {
        this.a.Z.a(Yca.AUTH_SIGN_UP);
        this.a.W.a(Baa.k());
        if (this.a.L.j() || !ma.b(view.getContext())) {
            this.a.a(b.SIGN_UP_METHOD);
            return;
        }
        OnboardActivity onboardActivity = this.a;
        onboardActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(onboardActivity.getString(com.soundcloud.android.ia.p.url_site))));
        this.a.finish();
    }
}
