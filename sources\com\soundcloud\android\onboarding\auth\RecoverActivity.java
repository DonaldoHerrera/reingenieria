package com.soundcloud.android.onboarding.auth;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.google.android.material.snackbar.Snackbar;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.RootActivity;
import com.soundcloud.android.view.CustomFontAuthAutoCompleteEditText;
import com.soundcloud.android.view.CustomFontAuthButton;
import com.soundcloud.android.view.customfontviews.CustomFontTextView;
import java.util.HashMap;

@EVa(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002IJB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0016J\u001c\u00103\u001a\u0002002\u0006\u00104\u001a\u0002052\n\b\u0002\u00106\u001a\u0004\u0018\u000107H\u0002J\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020:H\u0002J\b\u0010;\u001a\u000200H\u0016J\u0012\u0010<\u001a\u0002002\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u000200H\u0014J\b\u0010@\u001a\u000205H\u0014J\b\u0010A\u001a\u000200H\u0002J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u000207H\u0002J\b\u0010D\u001a\u000200H\u0014J\b\u0010E\u001a\u000200H\u0002J\b\u0010F\u001a\u000200H\u0002J\u0010\u0010G\u001a\u0002002\u0006\u0010H\u001a\u000207H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020\u00138\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0015\"\u0004\b.\u0010\u0017¨\u0006K"}, d2 = {"Lcom/soundcloud/android/onboarding/auth/RecoverActivity;", "Lcom/soundcloud/android/main/RootActivity;", "Lcom/soundcloud/android/view/CustomFontAuthButton$DisabledClickListener;", "()V", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "deviceHelper", "Lcom/soundcloud/android/utils/DeviceHelper;", "getDeviceHelper", "()Lcom/soundcloud/android/utils/DeviceHelper;", "setDeviceHelper", "(Lcom/soundcloud/android/utils/DeviceHelper;)V", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "getErrorReporter", "()Lcom/soundcloud/android/error/reporting/ErrorReporter;", "setErrorReporter", "(Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "mainThread", "Lio/reactivex/Scheduler;", "getMainThread", "()Lio/reactivex/Scheduler;", "setMainThread", "(Lio/reactivex/Scheduler;)V", "navigator", "Lcom/soundcloud/android/navigation/Navigator;", "getNavigator", "()Lcom/soundcloud/android/navigation/Navigator;", "setNavigator", "(Lcom/soundcloud/android/navigation/Navigator;)V", "observerFactory", "Lcom/soundcloud/android/rx/observers/ObserverFactory;", "getObserverFactory", "()Lcom/soundcloud/android/rx/observers/ObserverFactory;", "setObserverFactory", "(Lcom/soundcloud/android/rx/observers/ObserverFactory;)V", "progressDialog", "Landroid/app/ProgressDialog;", "recoverPasswordOperations", "Lcom/soundcloud/android/onboarding/auth/RecoverPasswordOperations;", "getRecoverPasswordOperations", "()Lcom/soundcloud/android/onboarding/auth/RecoverPasswordOperations;", "setRecoverPasswordOperations", "(Lcom/soundcloud/android/onboarding/auth/RecoverPasswordOperations;)V", "scheduler", "getScheduler", "setScheduler", "build", "", "getScreen", "Lcom/soundcloud/android/foundation/domain/Screen;", "goBackToOnboarding", "wasSuccess", "", "errorReason", "", "handleApiError", "error", "", "onClickWhenDisabled", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "receiveConfigurationUpdates", "recoverButtonClick", "recoverPassword", "email", "setActivityContentView", "setupEmailField", "showProgressDialog", "validateEmail", "text", "Companion", "EmailValidator", "base_release"}, mv = {1, 1, 15})
/* compiled from: RecoverActivity.kt */
public final class RecoverActivity extends RootActivity implements com.soundcloud.android.view.CustomFontAuthButton.a {
    public static final a n = new a(null);
    public fa o;
    public C6699jHa p;
    public C5606ava q;
    public C4655rja r;
    public C3469VY s;
    public HPa t;
    public HPa u;
    private ProgressDialog v;
    private final UPa w = new UPa();
    private HashMap x;

    /* compiled from: RecoverActivity.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* compiled from: RecoverActivity.kt */
    private final class b extends defpackage.C7315sGa.b {
        public b() {
            CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) RecoverActivity.this.b(i.emailInputText);
            C7471uYa.a((Object) customFontAuthAutoCompleteEditText, "emailInputText");
            super(customFontAuthAutoCompleteEditText);
        }

        public void a(TextView textView, String str) {
            C7471uYa.b(textView, "textView");
            C7471uYa.b(str, "text");
            RecoverActivity.this.d(str);
        }
    }

    private final void A() {
        ((CustomFontAuthButton) b(i.recoverBtn)).setOnClickListener(new Z(this));
        ((CustomFontAuthButton) b(i.recoverBtn)).setDisabledClickListener(this);
        CustomFontTextView customFontTextView = (CustomFontTextView) b(i.recoverMessage);
        C7471uYa.a((Object) customFontTextView, "recoverMessage");
        C7315sGa.a(customFontTextView, getResources().getString(p.login_recover_password_link), new aa(this), false, false, 24, null);
        C();
    }

    /* access modifiers changed from: private */
    public final void B() {
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) b(i.emailInputText);
        C7471uYa.a((Object) customFontAuthAutoCompleteEditText, "emailInputText");
        c(customFontAuthAutoCompleteEditText.getText().toString());
    }

    private final void C() {
        CustomFontAuthAutoCompleteEditText customFontAuthAutoCompleteEditText = (CustomFontAuthAutoCompleteEditText) b(i.emailInputText);
        customFontAuthAutoCompleteEditText.setImeOptions(6);
        CustomFontAuthButton customFontAuthButton = (CustomFontAuthButton) b(i.recoverBtn);
        C7471uYa.a((Object) customFontAuthButton, "recoverBtn");
        C7178qHa.a(customFontAuthAutoCompleteEditText, customFontAuthButton, new da(this));
        customFontAuthAutoCompleteEditText.addTextChangedListener(new b());
        d(customFontAuthAutoCompleteEditText.getText().toString());
        Intent intent = getIntent();
        String str = Scopes.EMAIL;
        if (intent.hasExtra(str)) {
            customFontAuthAutoCompleteEditText.setText(getIntent().getStringExtra(str));
        }
        customFontAuthAutoCompleteEditText.b();
    }

    private final void D() {
        ProgressDialog a2 = C5232QGa.a((Context) this, p.authentication_recover_progress_message);
        C7471uYa.a((Object) a2, "AndroidUtils.showProgres…recover_progress_message)");
        this.v = a2;
    }

    private final void c(String str) {
        D();
        UPa uPa = this.w;
        fa faVar = this.o;
        if (faVar != null) {
            C6979nPa a2 = faVar.a(str);
            HPa hPa = this.t;
            if (hPa != null) {
                C6979nPa b2 = a2.b(hPa);
                HPa hPa2 = this.u;
                if (hPa2 != null) {
                    VPa a3 = b2.a(hPa2).a(new ba(this), new ca(this));
                    C7471uYa.a((Object) a3, "recoverPasswordOperation…Error(it) }\n            )");
                    XUa.a(uPa, a3);
                    return;
                }
                C7471uYa.b("mainThread");
                throw null;
            }
            C7471uYa.b("scheduler");
            throw null;
        }
        C7471uYa.b("recoverPasswordOperations");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void d(String str) {
        CustomFontAuthButton customFontAuthButton = (CustomFontAuthButton) b(i.recoverBtn);
        C7471uYa.a((Object) customFontAuthButton, "recoverBtn");
        customFontAuthButton.setEnabled(C7315sGa.a((CharSequence) str));
    }

    public View b(int i) {
        if (this.x == null) {
            this.x = new HashMap();
        }
        View view = (View) this.x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.x.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void b() {
        Snackbar.a(findViewById(i.recover), p.feedback_email_invalid, 0).n();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A();
        C6699jHa jha = this.p;
        String str = "deviceHelper";
        if (jha == null) {
            C7471uYa.b(str);
            throw null;
        } else if (jha.n()) {
            C6699jHa jha2 = this.p;
            if (jha2 == null) {
                C7471uYa.b(str);
                throw null;
            } else if (jha2.m()) {
                getWindow().setSoftInputMode(48);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.w.b();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        setContentView(l.recover);
    }

    public Yca x() {
        return Yca.AUTH_FORGOT_PASSWORD;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }

    public final C4655rja z() {
        C4655rja rja = this.r;
        if (rja != null) {
            return rja;
        }
        C7471uYa.b("navigator");
        throw null;
    }

    static /* synthetic */ void a(RecoverActivity recoverActivity, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        recoverActivity.a(z, str);
    }

    private final void a(boolean z, String str) {
        ProgressDialog progressDialog = this.v;
        if (progressDialog != null) {
            progressDialog.dismiss();
            setResult(-1, new Intent().putExtra("success", z).putExtra("errorReason", str));
            finish();
            return;
        }
        C7471uYa.b("progressDialog");
        throw null;
    }

    /* access modifiers changed from: private */
    public final void a(Throwable th) {
        String string = C6972nIa.a(th) ? getResources().getString(p.authentication_recover_password_unknown_email_address) : null;
        if (th instanceof ifa) {
            a(false, string);
        } else {
            C7316sHa.b(th, RecoverActivity.class);
        }
    }
}
