package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.view.View.OnFocusChangeListener;

/* compiled from: CreateAccountAgeAndGenderLayout.kt */
final class K implements OnFocusChangeListener {
    final /* synthetic */ CreateAccountAgeAndGenderLayout a;

    K(CreateAccountAgeAndGenderLayout createAccountAgeAndGenderLayout) {
        this.a = createAccountAgeAndGenderLayout;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C4801CHa a2 = this.a.d;
            C7471uYa.a((Object) view, "view");
            a2.b(view);
        }
    }
}
