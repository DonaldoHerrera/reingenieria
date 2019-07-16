package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: com.soundcloud.android.onboarding.auth.y reason: case insensitive filesystem */
/* compiled from: AuthLayout.kt */
final class C4226y implements OnFocusChangeListener {
    final /* synthetic */ AuthLayout a;

    C4226y(AuthLayout authLayout) {
        this.a = authLayout;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.i();
        }
    }
}
