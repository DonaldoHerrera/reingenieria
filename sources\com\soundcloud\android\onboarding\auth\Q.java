package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.onboarding.auth.CreateAccountLayout.a;

/* compiled from: CreateAccountLayout.kt */
final class Q extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ CreateAccountLayout a;

    Q(CreateAccountLayout createAccountLayout) {
        this.a = createAccountLayout;
        super(0);
    }

    public final void d() {
        a authHandler = this.a.getAuthHandler();
        if (authHandler != null) {
            authHandler.c();
        }
    }
}
