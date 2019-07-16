package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.onboarding.auth.AuthLayout.a;

/* compiled from: AuthLayout.kt */
final class A implements OnClickListener {
    final /* synthetic */ AuthLayout a;

    A(AuthLayout authLayout) {
        this.a = authLayout;
    }

    public final void onClick(View view) {
        a authHandler = this.a.getAuthHandler();
        if (authHandler != null) {
            authHandler.a();
        }
    }
}
