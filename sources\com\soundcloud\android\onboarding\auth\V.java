package com.soundcloud.android.onboarding.auth;

import com.soundcloud.android.ia.i;
import com.soundcloud.android.onboarding.auth.LoginLayout.a;
import com.soundcloud.android.view.CustomFontAuthAutoCompleteEditText;

/* compiled from: LoginLayout.kt */
final class V extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ LoginLayout a;

    V(LoginLayout loginLayout) {
        this.a = loginLayout;
        super(0);
    }

    public final void d() {
        a authHandler = this.a.getAuthHandler();
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) this.a.a(i.emailInputText);
        C7471uYa.a((Object) customFontAuthAutoCompleteEditText, "emailInputText");
        authHandler.a(customFontAuthAutoCompleteEditText.getText().toString());
    }
}
