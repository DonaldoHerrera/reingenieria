package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.CustomFontAuthAutoCompleteEditText;
import com.soundcloud.android.view.CustomFontAuthButton;
import com.soundcloud.android.view.CustomFontAuthEditText;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0014J\b\u0010\u0019\u001a\u00020\u0017H\u0016R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@VX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@VX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/LoginLayout;", "Lcom/soundcloud/android/onboarding/auth/AuthLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lcom/soundcloud/android/view/CustomFontAuthButton;", "authButton", "getAuthButton", "()Lcom/soundcloud/android/view/CustomFontAuthButton;", "setAuthButton", "(Lcom/soundcloud/android/view/CustomFontAuthButton;)V", "Lcom/soundcloud/android/onboarding/auth/LoginLayout$LoginHandler;", "authHandler", "getAuthHandler", "()Lcom/soundcloud/android/onboarding/auth/LoginLayout$LoginHandler;", "setAuthHandler", "(Lcom/soundcloud/android/onboarding/auth/LoginLayout$LoginHandler;)V", "onContinueClick", "", "onFinishInflate", "validateEmail", "LoginHandler", "base_release"}, mv = {1, 1, 15})
/* compiled from: LoginLayout.kt */
public final class LoginLayout extends AuthLayout {
    public a d;
    public CustomFontAuthButton e;
    private HashMap f;

    /* compiled from: LoginLayout.kt */
    public interface a extends com.soundcloud.android.onboarding.auth.AuthLayout.a {
        void a(String str);

        void b(String str, String str2);
    }

    public LoginLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoginLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ LoginLayout(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    public final void j() {
        a authHandler = getAuthHandler();
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) a(i.emailInputText);
        C7471uYa.a((Object) customFontAuthAutoCompleteEditText, "emailInputText");
        String obj = customFontAuthAutoCompleteEditText.getText().toString();
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.passwordInputText);
        C7471uYa.a((Object) customFontAuthEditText, "passwordInputText");
        authHandler.b(obj, String.valueOf(customFontAuthEditText.getText()));
    }

    public View a(int i) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        View view = (View) this.f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void g() {
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) a(i.emailInputText);
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText2 = (CustomFontAuthAutoCompleteEditText) a(i.emailInputText);
        C7471uYa.a((Object) customFontAuthAutoCompleteEditText2, "emailInputText");
        Editable text = customFontAuthAutoCompleteEditText2.getText();
        C7471uYa.a((Object) text, "emailInputText.text");
        customFontAuthAutoCompleteEditText.a(!Cxb.a(text));
    }

    /* access modifiers changed from: protected */
    public CustomFontAuthButton getAuthButton() {
        CustomFontAuthButton customFontAuthButton = this.e;
        if (customFontAuthButton != null) {
            return customFontAuthButton;
        }
        C7471uYa.b("authButton");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        CustomFontAuthButton customFontAuthButton = (CustomFontAuthButton) a(i.authContinueBtn);
        customFontAuthButton.setOnClickListener(new U(this));
        customFontAuthButton.setText(p.btn_continue);
        customFontAuthButton.setDisabledClickListener(this);
        C7471uYa.a((Object) customFontAuthButton, "authContinueBtn.apply {\n…his@LoginLayout\n        }");
        setAuthButton(customFontAuthButton);
        ((CustomFontTextView) a(i.authHeadline)).setText(p.login_headline);
        ((TextView) a(i.googleAuthText)).setText(p.login_google);
        ((CustomFontTextView) a(i.facebookAuthText)).setText(p.login_facebook);
        TextInputLayout textInputLayout = (TextInputLayout) a(i.passwordInputLayout);
        C7471uYa.a((Object) textInputLayout, "passwordInputLayout");
        textInputLayout.setHint(getContext().getString(p.password_hint));
        AuthLayout.a(this, false, 1, null);
        d();
        e();
        CustomFontTextView customFontTextView = (CustomFontTextView) a(i.forgotPasswordText);
        C7471uYa.a((Object) customFontTextView, "forgotPasswordText");
        C7315sGa.a(customFontTextView, getResources().getString(p.authentication_I_forgot_my_password), new V(this), false, false, 24, null);
    }

    public void setAuthButton(CustomFontAuthButton customFontAuthButton) {
        C7471uYa.b(customFontAuthButton, "<set-?>");
        this.e = customFontAuthButton;
    }

    public void setAuthHandler(a aVar) {
        C7471uYa.b(aVar, "<set-?>");
        this.d = aVar;
    }

    public LoginLayout(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    public a getAuthHandler() {
        a aVar = this.d;
        if (aVar != null) {
            return aVar;
        }
        C7471uYa.b("authHandler");
        throw null;
    }
}
