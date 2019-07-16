package com.soundcloud.android.onboarding.auth;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import com.soundcloud.android.view.CustomFontAuthEditText;

/* compiled from: CreateAccountAgeAndGenderLayout.kt */
final class N implements OnFocusChangeListener {
    final /* synthetic */ CustomFontAuthEditText a;
    final /* synthetic */ CreateAccountAgeAndGenderLayout b;

    N(CustomFontAuthEditText customFontAuthEditText, CreateAccountAgeAndGenderLayout createAccountAgeAndGenderLayout) {
        this.a = customFontAuthEditText;
        this.b = createAccountAgeAndGenderLayout;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            this.b.d();
            this.a.setOnClickListener(new M(this));
        } else {
            this.a.setHint("");
            this.a.setOnClickListener(null);
        }
        this.a.setShowSoftInputOnFocus(false);
    }
}
