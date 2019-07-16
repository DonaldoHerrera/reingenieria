package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.view.View.OnClickListener;
import com.soundcloud.android.onboarding.auth.AuthLayout.a;

/* renamed from: com.soundcloud.android.onboarding.auth.z reason: case insensitive filesystem */
/* compiled from: AuthLayout.kt */
final class C4227z implements OnClickListener {
    final /* synthetic */ AuthLayout a;

    C4227z(AuthLayout authLayout) {
        this.a = authLayout;
    }

    public final void onClick(View view) {
        a authHandler = this.a.getAuthHandler();
        if (authHandler != null) {
            authHandler.d();
        }
    }
}
