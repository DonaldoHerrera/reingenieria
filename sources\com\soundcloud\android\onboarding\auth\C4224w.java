package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: com.soundcloud.android.onboarding.auth.w reason: case insensitive filesystem */
/* compiled from: AuthLayout.kt */
final class C4224w implements OnFocusChangeListener {
    final /* synthetic */ AuthLayout a;
    final /* synthetic */ boolean b;

    C4224w(AuthLayout authLayout, boolean z) {
        this.a = authLayout;
        this.b = z;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.a.i();
        }
    }
}
