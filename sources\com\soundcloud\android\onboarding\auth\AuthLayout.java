package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.AccountType;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.C6234x;
import com.soundcloud.android.view.CustomFontAuthAutoCompleteEditText;
import com.soundcloud.android.view.CustomFontAuthButton;
import com.soundcloud.android.view.CustomFontAuthEditText;
import java.util.HashMap;

@EVa(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u0000 )2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003()*B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001a\u001a\u00020\u0018H\u0016J\u0006\u0010\u001b\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u0016J\u0010\u0010!\u001a\u00020\u00182\b\b\u0002\u0010\"\u001a\u00020\u001eJ\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018J\u0006\u0010%\u001a\u00020\u001eJ\b\u0010&\u001a\u00020\u0018H&J\u0006\u0010'\u001a\u00020\u0018R\u0012\u0010\f\u001a\u00020\rX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u0011X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/AuthLayout;", "Landroid/widget/ScrollView;", "Lcom/soundcloud/android/view/CustomFontAuthButton$DisabledClickListener;", "Lcom/soundcloud/android/view/CustomFontAuthAutoCompleteEditText$TextChangeListener;", "Lcom/soundcloud/android/view/CustomFontAuthEditText$TextChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "authButton", "Lcom/soundcloud/android/view/CustomFontAuthButton;", "getAuthButton", "()Lcom/soundcloud/android/view/CustomFontAuthButton;", "authHandler", "Lcom/soundcloud/android/onboarding/auth/AuthLayout$AuthHandler;", "getAuthHandler", "()Lcom/soundcloud/android/onboarding/auth/AuthLayout$AuthHandler;", "socialsInitialHeight", "getStateBundle", "Landroid/os/Bundle;", "hideSocialButtonsAnimation", "", "onClickWhenDisabled", "onTextChanged", "resetButtonAnimation", "setGooglePlusVisibility", "visible", "", "setStateFromBundle", "bundle", "setupEmailField", "withCheckMark", "setupPasswordField", "setupSocialButtons", "showSocialButtonsIfNotVisible", "validateEmail", "validateForm", "AuthHandler", "Companion", "ResizeAnimation", "base_release"}, mv = {1, 1, 15})
/* compiled from: AuthLayout.kt */
public abstract class AuthLayout extends ScrollView implements com.soundcloud.android.view.CustomFontAuthButton.a, com.soundcloud.android.view.CustomFontAuthAutoCompleteEditText.a, com.soundcloud.android.view.CustomFontAuthEditText.a {
    public static final b a = new b(null);
    private int b;
    private HashMap c;

    /* compiled from: AuthLayout.kt */
    public interface a {
        void a();

        void a(int i);

        void d();
    }

    /* compiled from: AuthLayout.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        /* access modifiers changed from: private */
        public final boolean a(CharSequence charSequence) {
            return charSequence != null && charSequence.length() >= 6;
        }
    }

    /* compiled from: AuthLayout.kt */
    public final class c extends Animation {
        private final int a;
        private final int b;
        private boolean c;

        public c(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }

        private final float a(float f) {
            return this.c ? f + 0.0f : 1.0f - f;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            C7471uYa.b(transformation, "t");
            ConstraintLayout constraintLayout = (ConstraintLayout) AuthLayout.this.a(i.socialAuthContainer);
            LayoutParams layoutParams = constraintLayout.getLayoutParams();
            int i = this.b;
            layoutParams.height = (int) (((float) i) + (((float) (this.a - i)) * f));
            constraintLayout.setAlpha(a(f));
            constraintLayout.requestLayout();
        }

        public boolean willChangeBounds() {
            return true;
        }

        public /* synthetic */ c(AuthLayout authLayout, int i, int i2, boolean z, int i3, C7264rYa rya) {
            if ((i3 & 4) != 0) {
                z = false;
            }
            this(i, i2, z);
        }
    }

    public AuthLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public AuthLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AuthLayout(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    public final void i() {
        ConstraintLayout constraintLayout = (ConstraintLayout) a(i.socialAuthContainer);
        if (constraintLayout.getVisibility() == 0) {
            this.b = constraintLayout.getHeight();
            c cVar = new c(this, 1, constraintLayout.getHeight(), false, 4, null);
            cVar.setDuration(100);
            cVar.setAnimationListener(new C4223v(constraintLayout));
            constraintLayout.startAnimation(cVar);
        }
    }

    public View a(int i) {
        if (this.c == null) {
            this.c = new HashMap();
        }
        View view = (View) this.c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void b() {
        if (!((CustomFontAuthAutoCompleteEditText) a(i.emailInputText)).a()) {
            a authHandler = getAuthHandler();
            if (authHandler != null) {
                authHandler.a(p.feedback_email_invalid);
            }
        } else if (!((CustomFontAuthEditText) a(i.passwordInputText)).a()) {
            a authHandler2 = getAuthHandler();
            if (authHandler2 != null) {
                authHandler2.a(p.feedback_password_invalid);
            }
        }
    }

    public final void c() {
        ConstraintLayout constraintLayout = (ConstraintLayout) a(i.socialAuthContainer);
        constraintLayout.clearAnimation();
        constraintLayout.setVisibility(0);
        constraintLayout.getLayoutParams().height = this.b;
        constraintLayout.setAlpha(1.0f);
    }

    public final void d() {
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.passwordInputText);
        customFontAuthEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        C7178qHa.a(customFontAuthEditText, getAuthButton(), new C4225x(this));
        customFontAuthEditText.setOnFocusChangeListener(new C4226y(this));
        customFontAuthEditText.addTextChangedListener(new C6234x(this));
    }

    public final void e() {
        a(i.googleSocialAuthBtn).setOnClickListener(new C4227z(this));
        a(i.facebookSocialAuthBtn).setOnClickListener(new A(this));
    }

    public final boolean f() {
        ConstraintLayout constraintLayout = (ConstraintLayout) a(i.socialAuthContainer);
        String str = "socialAuthContainer";
        C7471uYa.a((Object) constraintLayout, str);
        if (constraintLayout.getVisibility() == 0) {
            return false;
        }
        c cVar = new c(this.b, 1, true);
        cVar.setDuration(100);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) a(i.socialAuthContainer);
        C7471uYa.a((Object) constraintLayout2, str);
        constraintLayout2.setVisibility(0);
        startAnimation(cVar);
        return true;
    }

    public abstract void g();

    /* access modifiers changed from: protected */
    public abstract CustomFontAuthButton getAuthButton();

    /* access modifiers changed from: protected */
    public abstract a getAuthHandler();

    public final Bundle getStateBundle() {
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) a(i.emailInputText);
        C7471uYa.a((Object) customFontAuthAutoCompleteEditText, "emailInputText");
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.passwordInputText);
        C7471uYa.a((Object) customFontAuthEditText, "passwordInputText");
        return C1687sb.a(NVa.a("BUNDLE_EMAIL", customFontAuthAutoCompleteEditText.getText().toString()), NVa.a("BUNDLE_PASSWORD", String.valueOf(customFontAuthEditText.getText())));
    }

    public final void h() {
        g();
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.passwordInputText);
        b bVar = a;
        CustomFontAuthEditText customFontAuthEditText2 = (CustomFontAuthEditText) a(i.passwordInputText);
        C7471uYa.a((Object) customFontAuthEditText2, "passwordInputText");
        customFontAuthEditText.a(bVar.a(customFontAuthEditText2.getText()));
        getAuthButton().setEnabled(((CustomFontAuthAutoCompleteEditText) a(i.emailInputText)).a() && ((CustomFontAuthEditText) a(i.passwordInputText)).a());
    }

    public final void setGooglePlusVisibility(boolean z) {
        String str = "googleSocialAuthBtn";
        if (z) {
            View a2 = a(i.googleSocialAuthBtn);
            C7471uYa.a((Object) a2, str);
            a2.setVisibility(0);
            return;
        }
        View a3 = a(i.googleSocialAuthBtn);
        C7471uYa.a((Object) a3, str);
        a3.setVisibility(8);
    }

    public final void setStateFromBundle(Bundle bundle) {
        if (bundle != null) {
            ((CustomFontAuthAutoCompleteEditText) a(i.emailInputText)).setText(bundle.getString("BUNDLE_EMAIL"));
            ((CustomFontAuthEditText) a(i.passwordInputText)).setText(bundle.getString("BUNDLE_PASSWORD"));
        }
    }

    public final void setupEmailField(boolean z) {
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) a(i.emailInputText);
        String[] b2 = C5232QGa.b(customFontAuthAutoCompleteEditText.getContext(), AccountType.GOOGLE);
        C7471uYa.a((Object) b2, "accounts");
        if (!(b2.length == 0)) {
            customFontAuthAutoCompleteEditText.setText(b2[0]);
        }
        customFontAuthAutoCompleteEditText.setAdapter(new ArrayAdapter(customFontAuthAutoCompleteEditText.getContext(), l.onboard_email_dropdown_item, C5232QGa.b(customFontAuthAutoCompleteEditText.getContext())));
        customFontAuthAutoCompleteEditText.setThreshold(0);
        customFontAuthAutoCompleteEditText.setOnFocusChangeListener(new C4224w(this, z));
        customFontAuthAutoCompleteEditText.addTextChangedListener(new C6234x(this));
        if (z) {
            customFontAuthAutoCompleteEditText.b();
        }
    }

    public AuthLayout(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
    }

    public void a() {
        h();
    }

    public static /* synthetic */ void a(AuthLayout authLayout, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            authLayout.setupEmailField(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setupEmailField");
    }
}
