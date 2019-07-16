package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.FragmentActivity;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.onboarding.l;
import com.soundcloud.android.profile.C5815m;
import com.soundcloud.android.view.C6234x;
import com.soundcloud.android.view.CustomFontAuthButton;
import com.soundcloud.android.view.CustomFontAuthEditText;
import java.io.Serializable;
import java.util.HashMap;

@EVa(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002,-B%\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u001bH\u0002J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u000fH\u0016J\b\u0010!\u001a\u00020\u001bH\u0002J\b\u0010\"\u001a\u00020\u001bH\u0016J\u0017\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0002\u0010&J\u0014\u0010'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010\u000fH\u0002J\u0010\u0010*\u001a\u00020\u001b2\b\u0010+\u001a\u0004\u0018\u00010\u0019R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006."}, d2 = {"Lcom/soundcloud/android/onboarding/auth/CreateAccountAgeAndGenderLayout;", "Landroid/widget/ScrollView;", "Lcom/soundcloud/android/onboarding/auth/GenderPickerDialogFragment$Callback;", "Lcom/soundcloud/android/view/CustomFontAuthButton$DisabledClickListener;", "Lcom/soundcloud/android/view/CustomFontAuthEditText$TextChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "keyboardHelper", "Lcom/soundcloud/android/utils/KeyboardHelper;", "selectedGenderOption", "Lcom/soundcloud/android/onboarding/GenderOption;", "signUpHandler", "Lcom/soundcloud/android/onboarding/auth/CreateAccountAgeAndGenderLayout$CreateAccountAgeAndGenderHandler;", "getSignUpHandler", "()Lcom/soundcloud/android/onboarding/auth/CreateAccountAgeAndGenderLayout$CreateAccountAgeAndGenderHandler;", "setSignUpHandler", "(Lcom/soundcloud/android/onboarding/auth/CreateAccountAgeAndGenderLayout$CreateAccountAgeAndGenderHandler;)V", "getAge", "()Ljava/lang/Integer;", "getStateBundle", "Landroid/os/Bundle;", "maybeButtonEnabled", "", "onClickWhenDisabled", "onFinishInflate", "onGenderClick", "onGenderSelected", "genderOption", "onSignUpClick", "onTextChanged", "parseBirthday", "Lcom/soundcloud/android/profile/BirthdayInfo;", "age", "(Ljava/lang/Integer;)Lcom/soundcloud/android/profile/BirthdayInfo;", "parseGender", "", "gender", "setStateFromBundle", "bundle", "Companion", "CreateAccountAgeAndGenderHandler", "base_release"}, mv = {1, 1, 15})
/* compiled from: CreateAccountAgeAndGenderLayout.kt */
public final class CreateAccountAgeAndGenderLayout extends ScrollView implements com.soundcloud.android.onboarding.auth.S.a, com.soundcloud.android.view.CustomFontAuthButton.a, com.soundcloud.android.view.CustomFontAuthEditText.a {
    public static final a a = new a(null);
    public b b;
    private l c;
    /* access modifiers changed from: private */
    public C4801CHa d;
    private HashMap e;

    /* compiled from: CreateAccountAgeAndGenderLayout.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: CreateAccountAgeAndGenderLayout.kt */
    public interface b {
        void a(int i);

        void a(C5815m mVar, String str);

        FragmentActivity e();
    }

    public CreateAccountAgeAndGenderLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CreateAccountAgeAndGenderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CreateAccountAgeAndGenderLayout(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    public final void d() {
        b bVar = this.b;
        if (bVar != null) {
            FragmentActivity e2 = bVar.e();
            S a2 = S.b.a(this.c);
            C4801CHa cHa = this.d;
            CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.genderInputText);
            C7471uYa.a((Object) customFontAuthEditText, "genderInputText");
            cHa.a(customFontAuthEditText);
            C5232QGa.a((C0361c) a2, e2.getSupportFragmentManager(), "indicate_gender");
            return;
        }
        C7471uYa.b("signUpHandler");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void e() {
        C4801CHa cHa = this.d;
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.genderInputText);
        C7471uYa.a((Object) customFontAuthEditText, "genderInputText");
        cHa.a(customFontAuthEditText);
        b bVar = this.b;
        if (bVar != null) {
            bVar.a(a(getAge()), b(this.c));
        } else {
            C7471uYa.b("signUpHandler");
            throw null;
        }
    }

    private final Integer getAge() {
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.ageInputText);
        C7471uYa.a((Object) customFontAuthEditText, "ageInputText");
        return Bxb.c(String.valueOf(customFontAuthEditText.getText()));
    }

    public View a(int i) {
        if (this.e == null) {
            this.e = new HashMap();
        }
        View view = (View) this.e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final b getSignUpHandler() {
        b bVar = this.b;
        if (bVar != null) {
            return bVar;
        }
        C7471uYa.b("signUpHandler");
        throw null;
    }

    public final Bundle getStateBundle() {
        Bundle bundle = new Bundle();
        l lVar = this.c;
        if (lVar != null) {
            bundle.putSerializable("BUNDLE_GENDER", lVar);
            if (lVar == l.CUSTOM) {
                CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.genderInputText);
                C7471uYa.a((Object) customFontAuthEditText, "genderInputText");
                bundle.putString("BUNDLE_CUSTOM_GENDER", String.valueOf(customFontAuthEditText.getText()));
            }
        }
        Integer age = getAge();
        if (age != null) {
            bundle.putSerializable("BUNDLE_AGE", C5815m.a(age.intValue()));
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        c();
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.ageInputText);
        customFontAuthEditText.addTextChangedListener(new C6234x(this));
        customFontAuthEditText.b();
        customFontAuthEditText.setOnFocusChangeListener(new K(this));
        customFontAuthEditText.requestFocus();
        CustomFontAuthButton customFontAuthButton = (CustomFontAuthButton) a(i.authContinueBtn);
        customFontAuthButton.setDisabledClickListener(this);
        customFontAuthButton.setOnClickListener(new L(this));
        CustomFontAuthEditText customFontAuthEditText2 = (CustomFontAuthEditText) a(i.genderInputText);
        customFontAuthEditText2.addTextChangedListener(new C6234x(this));
        customFontAuthEditText2.setOnFocusChangeListener(new N(customFontAuthEditText2, this));
        customFontAuthEditText2.b();
        CustomFontAuthEditText customFontAuthEditText3 = (CustomFontAuthEditText) a(i.genderInputText);
        C7471uYa.a((Object) customFontAuthEditText3, "genderInputText");
        CustomFontAuthButton customFontAuthButton2 = (CustomFontAuthButton) a(i.authContinueBtn);
        C7471uYa.a((Object) customFontAuthButton2, "authContinueBtn");
        C7178qHa.a(customFontAuthEditText3, customFontAuthButton2, new O(this));
    }

    public final void setSignUpHandler(b bVar) {
        C7471uYa.b(bVar, "<set-?>");
        this.b = bVar;
    }

    public final void setStateFromBundle(Bundle bundle) {
        if (bundle != null) {
            Serializable serializable = bundle.getSerializable("BUNDLE_GENDER");
            if (!(serializable instanceof l)) {
                serializable = null;
            }
            l lVar = (l) serializable;
            if (lVar == null) {
                lVar = null;
            } else if (J.a[lVar.ordinal()] != 1) {
                ((CustomFontAuthEditText) a(i.genderInputText)).setText(lVar.a());
            } else {
                ((CustomFontAuthEditText) a(i.genderInputText)).setText(bundle.getString("BUNDLE_CUSTOM_GENDER"));
            }
            this.c = lVar;
            Serializable serializable2 = bundle.getSerializable("BUNDLE_AGE");
            if (!(serializable2 instanceof C5815m)) {
                serializable2 = null;
            }
            C5815m mVar = (C5815m) serializable2;
            if (mVar != null) {
                ((CustomFontAuthEditText) a(i.ageInputText)).setText(String.valueOf(mVar.b));
            }
            c();
        }
    }

    public CreateAccountAgeAndGenderLayout(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        this.d = new C4801CHa(context);
    }

    private final C5815m a(Integer num) {
        if (num != null) {
            C5815m a2 = C5815m.a(num.intValue());
            C7471uYa.a((Object) a2, "BirthdayInfo.buildFrom(r…e - null age reported\" })");
            return a2;
        }
        throw new IllegalArgumentException("invalid state - null age reported");
    }

    private final void c() {
        boolean z = true;
        ((CustomFontAuthEditText) a(i.ageInputText)).a(getAge() != null);
        CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.genderInputText);
        CustomFontAuthEditText customFontAuthEditText2 = (CustomFontAuthEditText) a(i.genderInputText);
        C7471uYa.a((Object) customFontAuthEditText2, "genderInputText");
        Editable text = customFontAuthEditText2.getText();
        customFontAuthEditText.a(text != null && text.length() > 0);
        CustomFontAuthButton customFontAuthButton = (CustomFontAuthButton) a(i.authContinueBtn);
        C7471uYa.a((Object) customFontAuthButton, "authContinueBtn");
        if (!((CustomFontAuthEditText) a(i.ageInputText)).a() || !((CustomFontAuthEditText) a(i.genderInputText)).a()) {
            z = false;
        }
        customFontAuthButton.setEnabled(z);
    }

    public void b() {
        String str = "signUpHandler";
        if (getAge() == null) {
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(p.feedback_age_empty);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else if (!((CustomFontAuthEditText) a(i.ageInputText)).a()) {
            b bVar2 = this.b;
            if (bVar2 != null) {
                bVar2.a(p.feedback_age_invalid);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        } else if (!((CustomFontAuthEditText) a(i.genderInputText)).a()) {
            b bVar3 = this.b;
            if (bVar3 != null) {
                bVar3.a(p.feedback_gender_empty);
            } else {
                C7471uYa.b(str);
                throw null;
            }
        }
    }

    public void a(l lVar) {
        C7471uYa.b(lVar, "genderOption");
        String str = "";
        if (J.b[lVar.ordinal()] != 1) {
            CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.genderInputText);
            customFontAuthEditText.setHint(str);
            customFontAuthEditText.setKeyListener(null);
            customFontAuthEditText.setText(lVar.a());
        } else {
            CustomFontAuthEditText customFontAuthEditText2 = (CustomFontAuthEditText) a(i.genderInputText);
            customFontAuthEditText2.setHint(customFontAuthEditText2.getContext().getString(p.create_indicate_gender_hint));
            customFontAuthEditText2.setKeyListener(TextKeyListener.getInstance());
            customFontAuthEditText2.setText(str);
            C4801CHa cHa = this.d;
            C7471uYa.a((Object) customFontAuthEditText2, "this");
            cHa.b(customFontAuthEditText2);
        }
        this.c = lVar;
    }

    private final String b(l lVar) {
        if (lVar != null) {
            CustomFontAuthEditText customFontAuthEditText = (CustomFontAuthEditText) a(i.genderInputText);
            C7471uYa.a((Object) customFontAuthEditText, "genderInputText");
            return lVar.a(String.valueOf(customFontAuthEditText.getText()));
        }
        throw new IllegalArgumentException("invalid state - null gender reported");
    }

    public void a() {
        c();
    }
}
