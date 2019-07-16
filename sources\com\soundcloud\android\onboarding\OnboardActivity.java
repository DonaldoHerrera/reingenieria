package com.soundcloud.android.onboarding;

import android.accounts.AccountAuthenticatorResponse;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import androidx.fragment.app.FragmentActivity;
import com.facebook.B;
import com.facebook.C0566k;
import com.facebook.C0587q;
import com.facebook.login.D;
import com.facebook.login.E;
import com.google.android.gms.auth.d;
import com.google.android.gms.common.Scopes;
import com.google.android.material.snackbar.Snackbar;
import com.google.common.base.Function;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ads.C2571fb;
import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.s;
import com.soundcloud.android.foundation.events.t;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.MainActivity;
import com.soundcloud.android.onboarding.auth.AlmostDoneLayout;
import com.soundcloud.android.onboarding.auth.C4210h;
import com.soundcloud.android.onboarding.auth.C4216n;
import com.soundcloud.android.onboarding.auth.CreateAccountAgeAndGenderLayout;
import com.soundcloud.android.onboarding.auth.CreateAccountLayout;
import com.soundcloud.android.onboarding.auth.LoginLayout;
import com.soundcloud.android.onboarding.auth.RecoverActivity;
import com.soundcloud.android.onboarding.auth.T;
import com.soundcloud.android.onboarding.auth.ia;
import com.soundcloud.android.onboarding.auth.ka;
import com.soundcloud.android.onboarding.auth.ma;
import com.soundcloud.android.onboarding.auth.na;
import com.soundcloud.android.onboarding.auth.pa;
import com.soundcloud.android.profile.C5815m;
import com.soundcloud.android.properties.j;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycleAppCompatActivity;
import com.soundcloud.lightcycle.LightCycles;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Random;

public class OnboardActivity extends LightCycleAppCompatActivity<AppCompatActivity> implements com.soundcloud.android.onboarding.auth.E.a, com.soundcloud.android.onboarding.auth.LoginLayout.a, com.soundcloud.android.onboarding.auth.CreateAccountLayout.a, com.soundcloud.android.onboarding.auth.CreateAccountAgeAndGenderLayout.b, com.soundcloud.android.onboarding.auth.AlmostDoneLayout.a, com.soundcloud.android.onboarding.auth.C4210h.a, com.soundcloud.android.onboarding.auth.S.b, com.soundcloud.android.onboarding.h.a {
    private static final int[] a = {h.onboard_background_artist, h.onboarding_background_lifestyle};
    private Bundle A;
    private C4928GKa<Uri> B = C4928GKa.a();
    private pa C;
    private b D = b.PHOTOS;
    private final UPa E = new UPa();
    private final OnClickListener F = new o(this);
    private final OnClickListener G = new p(this);
    B H;
    C0566k I;
    D J;
    C2288ST K;
    j L;
    C7181qKa M;
    C5322TGa N;
    C5327TLa O;
    C4581ija P;
    C2322UP Q;
    C2014EO R;
    C7730yHa S;
    C2571fb T;
    C6699jHa U;
    com.soundcloud.android.properties.a V;
    s W;
    C4655rja X;
    C4709xja Y;
    C3700b Z;
    @LightCycle
    @f
    ActivityLightCycle<AppCompatActivity> aa;
    private int b;
    private b c = b.PHOTOS;
    private String d;
    private String e;
    private f f = f.a();
    private com.soundcloud.android.onboarding.auth.X.a g = com.soundcloud.android.onboarding.auth.X.a.a;
    private com.soundcloud.android.onboarding.auth.T.a h = com.soundcloud.android.onboarding.auth.T.a.a;
    private C3508cda i = C3508cda.a;
    private View j;
    private Button k;
    private Button l;
    private View m;
    /* access modifiers changed from: private */
    public View n;
    private LoginLayout o;
    /* access modifiers changed from: private */
    public CreateAccountLayout p;
    /* access modifiers changed from: private */
    public CreateAccountAgeAndGenderLayout q;
    /* access modifiers changed from: private */
    public AlmostDoneLayout r;
    private AccountAuthenticatorResponse s;
    protected Bundle t;
    private final AnimationListener u = new n(this);
    private Bundle v;
    private Bundle w;
    private Bundle x;
    private Bundle y;
    private Bundle z;

    public final class LightCycleBinder {
        public static void bind(OnboardActivity onboardActivity) {
            onboardActivity.bind(LightCycles.lift(onboardActivity.aa));
        }
    }

    private static class a extends IllegalStateException {
        a(String str) {
            super(str);
        }
    }

    public enum b {
        PHOTOS,
        LOGIN,
        SIGN_UP_METHOD,
        SIGN_UP_BASICS,
        SIGN_UP_DETAILS,
        ENTER_USER_DETAILS
    }

    private static class c extends IllegalStateException {
        c(String str) {
            super(str);
        }
    }

    public OnboardActivity() {
        SoundCloudApplication.f().a(this);
    }

    private AlmostDoneLayout A() {
        if (this.r == null) {
            this.r = (AlmostDoneLayout) ((ViewStub) findViewById(i.almost_done)).inflate();
            this.r.setAlmostDoneHandler(this);
            this.r.setStateFromBundle(this.z);
            this.r.setVisibility(8);
        }
        return this.r;
    }

    private CreateAccountAgeAndGenderLayout B() {
        if (this.q == null) {
            this.q = (CreateAccountAgeAndGenderLayout) ((ViewStub) findViewById(i.create_account_age_stub)).inflate();
            this.q.setSignUpHandler(this);
            this.q.setStateFromBundle(this.x);
            this.q.setVisibility(8);
        }
        return this.q;
    }

    private CreateAccountLayout C() {
        if (this.p == null) {
            this.p = (CreateAccountLayout) ((ViewStub) findViewById(i.create_account_stub)).inflate();
            this.p.setAuthHandler(this);
            this.p.setVisibility(8);
            this.p.setStateFromBundle(this.w);
            this.p.setGooglePlusVisibility(this.M.i());
        }
        this.p.c();
        return this.p;
    }

    private LoginLayout D() {
        if (this.o == null) {
            this.o = (LoginLayout) ((ViewStub) findViewById(i.login_stub)).inflate();
            this.o.setAuthHandler(this);
            this.o.setVisibility(8);
            this.o.setStateFromBundle(this.v);
            this.o.setGooglePlusVisibility(this.M.i());
        }
        this.o.c();
        return this.o;
    }

    private boolean E() {
        return this.D == b.LOGIN;
    }

    private boolean F() {
        return this.D == b.SIGN_UP_METHOD;
    }

    private void G() {
        int a2 = this.S.a((Context) this);
        if (a2 == 0) {
            L();
        } else if ((!this.S.a(a2)) || !d(a2)) {
            M();
        }
    }

    private void H() {
        this.e = null;
        this.J.b();
    }

    private void I() {
        this.l.setOnClickListener(this.F);
        this.k.setOnClickListener(this.G);
    }

    private void J() {
        this.J.a(this.I, (C0587q<E>) new h<E>(this));
    }

    private void K() {
        View a2 = new com.soundcloud.android.view.customfontviews.b(this).a(h.dialog_device_management).c(p.device_management_limit_title).b(p.device_management_conflict_message).a();
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(this);
        aVar.b(a2);
        aVar.c(17039370, (DialogInterface.OnClickListener) null);
        a(aVar, Baa.c());
    }

    private void L() {
        startActivityForResult(this.S.a(), 8005);
        this.W.a(Baa.h());
    }

    private void M() {
        C7316sHa.d(new IllegalStateException("Unable to install Google Play Services during login"));
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(this);
        aVar.c(p.authentication_error_title);
        aVar.b(p.authentication_error_unable_to_use_google_play_services);
        aVar.a(16843605);
        aVar.c(17039370, (DialogInterface.OnClickListener) null);
        C5232QGa.a((Dialog) aVar.a());
    }

    private void N() {
        this.Z.a(Yca.TOUR);
    }

    private void e(Bundle bundle) {
        int i2;
        if (bundle == null) {
            i2 = new Random().nextInt(a.length);
        } else {
            i2 = bundle.getInt("BACKGROUND_IMAGE_IDX");
        }
        this.b = i2;
        ImageView imageView = (ImageView) findViewById(i.landing_background_image);
        imageView.setImageDrawable(C0277Xa.a(getResources(), a[this.b], null));
        C5466YFa.b(imageView, true);
    }

    private void f(Bundle bundle) {
        C5232QGa.a((C0361c) na.a(bundle), getSupportFragmentManager(), "signup_dialog");
    }

    private void x() {
        if (this.K.e()) {
            K();
            this.K.b();
        }
    }

    private void y() {
        if (this.U.m() && this.U.n()) {
            e().getWindow().setSoftInputMode(48);
        }
    }

    private void z() {
        this.J.b((Activity) this, (Collection<String>) h.a);
    }

    public FragmentActivity e() {
        return this;
    }

    public void finish() {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.s;
        if (accountAuthenticatorResponse != null) {
            Bundle bundle = this.t;
            if (bundle != null) {
                accountAuthenticatorResponse.onResult(bundle);
            } else {
                accountAuthenticatorResponse.onError(4, "canceled");
            }
            this.s = null;
        }
        super.finish();
    }

    public void h() {
        a(getString(p.authentication_error_no_connection_message), false);
    }

    public void j() {
    }

    public void k() {
        this.X.a(C4621nja.e(getString(p.url_cookies)));
    }

    public void l() {
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        b2.b(p.authentication_signup_facebook_email_required);
        b2.c(17039370, (DialogInterface.OnClickListener) new e(this));
        a(b2, Baa.o());
    }

    public void m() {
        String string = getString(p.authentication_age_restriction);
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        b2.a((CharSequence) string);
        b2.c(17039370, (DialogInterface.OnClickListener) null);
        a(b2, Baa.l());
    }

    public com.soundcloud.android.onboarding.auth.S.a n() {
        b bVar = this.c;
        if (bVar == b.SIGN_UP_BASICS || bVar == b.ENTER_USER_DETAILS) {
            return B();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected state for gender picker callback: ");
        sb.append(this.c.name());
        sb.append(" signupvia: ");
        sb.append(this.C.a());
        throw new c(sb.toString());
    }

    public void o() {
        this.X.a(C4621nja.e(getString(p.url_terms)));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.f = new f(i2, i3, intent);
    }

    public void onBackPressed() {
        StringBuilder sb = new StringBuilder();
        sb.append("back pressed in state: ");
        sb.append(this.c);
        C7316sHa.a(4, "ScOnboarding", sb.toString());
        switch (q.b[this.c.ordinal()]) {
            case 1:
                a(b.PHOTOS);
                N();
                return;
            case 2:
                if (!this.o.f()) {
                    a(b.PHOTOS);
                    return;
                }
                return;
            case 3:
                if (!this.p.f()) {
                    a(b.PHOTOS);
                    return;
                }
                return;
            case 4:
                a(b.SIGN_UP_METHOD);
                return;
            case 5:
                A().a();
                return;
            case 6:
                super.onBackPressed();
                return;
            default:
                return;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        StringBuilder sb = new StringBuilder();
        sb.append("onCreate with savedInstanceState ");
        sb.append(bundle);
        C7316sHa.a(4, "ScOnboarding", sb.toString());
        this.O.c(C3876taa.m, C3699a.a(this));
        a(getIntent());
        d(bundle);
        I();
        x();
        J();
        this.B = C4928GKa.b(getIntent().getParcelableExtra("EXTRA_DEEP_LINK_URI"));
        y();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.E.b();
        super.onPause();
        this.O.c(C3876taa.m, C3699a.b(this));
    }

    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        if (C4739AHa.a(i2, iArr)) {
            AlmostDoneLayout almostDoneLayout = this.r;
            if (almostDoneLayout != null) {
                almostDoneLayout.a((FragmentActivity) this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.i = C5526_Ha.b(bundle, "BUNDLE_USER");
        this.d = bundle.getString("BUNDLE_LAST_GOOGLE_ACCOUNT_USED");
        this.e = bundle.getString("BUNDLE_FACEBOOK_TOKEN");
        this.D = (b) bundle.getSerializable("BUNDLE_LOGIN_OR_SIGNUP_STATE");
        this.C = (pa) bundle.getSerializable("BUNDLE_SIGN_UP_VIA");
        this.v = bundle.getBundle("BUNDLE_LOGIN");
        this.w = bundle.getBundle("BUNDLE_CREATE_ACCOUNT");
        this.x = bundle.getBundle("BUNDLE_CREATE_ACCOUNT_AGE");
        this.B = C4928GKa.b(bundle.getParcelable("EXTRA_DEEP_LINK_URI"));
        this.y = bundle.getBundle("BUNDLE_AUTH");
        this.z = bundle.getBundle("BUNDLE_ALMOST_DONE");
        this.A = bundle.getBundle("BUNDLE_GOOGLE_PLUS_SIGNUP_PARAMS");
        b((b) bundle.getSerializable("BUNDLE_STATE"), false);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.E.b((VPa) this.X.a().c(this.Y.a(this, new ArrayList())));
        this.T.a();
        this.O.c(C3876taa.m, C3699a.c(this));
    }

    /* access modifiers changed from: protected */
    public void onResumeFragments() {
        super.onResumeFragments();
        a(this.f);
        this.f = f.a();
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("BUNDLE_LAST_GOOGLE_ACCOUNT_USED", this.d);
        bundle.putSerializable("BUNDLE_SIGN_UP_VIA", this.C);
        bundle.putSerializable("BUNDLE_LOGIN_OR_SIGNUP_STATE", this.D);
        bundle.putString("BUNDLE_FACEBOOK_TOKEN", this.e);
        bundle.putSerializable("BUNDLE_STATE", this.c);
        C5526_Ha.b(bundle, "BUNDLE_USER", this.i);
        bundle.putInt("BACKGROUND_IMAGE_IDX", this.b);
        if (this.B.c()) {
            bundle.putParcelable("EXTRA_DEEP_LINK_URI", (Parcelable) this.B.b());
        }
        LoginLayout loginLayout = this.o;
        if (loginLayout != null) {
            bundle.putBundle("BUNDLE_LOGIN", loginLayout.getStateBundle());
        }
        CreateAccountLayout createAccountLayout = this.p;
        String str = "BUNDLE_AUTH";
        if (createAccountLayout != null) {
            bundle.putBundle("BUNDLE_CREATE_ACCOUNT", createAccountLayout.getStateBundle());
            bundle.putBundle(str, this.y);
        }
        CreateAccountAgeAndGenderLayout createAccountAgeAndGenderLayout = this.q;
        if (createAccountAgeAndGenderLayout != null) {
            bundle.putBundle("BUNDLE_CREATE_ACCOUNT_AGE", createAccountAgeAndGenderLayout.getStateBundle());
            bundle.putBundle(str, this.y);
        }
        AlmostDoneLayout almostDoneLayout = this.r;
        if (almostDoneLayout != null) {
            bundle.putBundle("BUNDLE_ALMOST_DONE", almostDoneLayout.getStateBundle());
        }
        Bundle bundle2 = this.A;
        if (bundle2 != null) {
            bundle.putBundle("BUNDLE_GOOGLE_PLUS_SIGNUP_PARAMS", bundle2);
        }
    }

    public void p() {
        a(b.PHOTOS);
        N();
        this.W.a(Baa.t());
    }

    public void q() {
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        b2.b(p.authentication_email_invalid_message);
        b2.c(17039370, (DialogInterface.OnClickListener) null);
        a(b2, Baa.q());
    }

    public void r() {
        a(getString(p.facebook_authentication_failed_message), true);
    }

    public void s() {
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_blocked_title);
        b2.b(p.authentication_blocked_message);
        b2.c(p.contact_support, (DialogInterface.OnClickListener) new c(this));
        b2.a(17039360, (DialogInterface.OnClickListener) null);
        c(b2, Baa.m());
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        setContentView(l.landing);
    }

    public void t() {
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        b2.b(p.authentication_email_taken_message);
        b2.c(17039370, (DialogInterface.OnClickListener) null);
        a(b2, Baa.n());
    }

    public void u() {
        u uVar = new u(this, this.Q);
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        b2.b(p.authentication_captcha_message);
        b2.c((CharSequence) getString(p.try_again), (DialogInterface.OnClickListener) uVar);
        b2.b((CharSequence) getString(p.btn_cancel), (DialogInterface.OnClickListener) uVar);
        a(b2, Baa.r());
    }

    public void v() {
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(this);
        aVar.b(new com.soundcloud.android.view.customfontviews.b(this).a(h.dialog_device_management).c(p.device_management_limit_title).b(p.device_management_limit_registered).a());
        aVar.c(17039370, (DialogInterface.OnClickListener) null);
        a(aVar, Baa.b());
    }

    public void w() {
        C7316sHa.a(4, "ScOnboarding", "re-requesting facebook email permission");
        this.J.b((Activity) this, (Collection<String>) h.b);
    }

    private void d(Bundle bundle) {
        boolean z2 = bundle != null;
        overridePendingTransition(0, 0);
        e(bundle);
        this.j = findViewById(i.onboarding_logo);
        this.m = findViewById(i.overlay_bg);
        this.n = findViewById(i.overlay_holder);
        this.k = (Button) findViewById(i.btn_create_account);
        this.l = (Button) findViewById(i.btn_login);
        this.k.setText(p.authentication_sign_up);
        this.l.setText(p.authentication_log_in);
        a(b.PHOTOS);
        if (!z2) {
            N();
        }
        if (z2) {
            this.m.setVisibility(8);
            this.n.setVisibility(8);
        }
    }

    public void b(String str, String str2) {
        c(str, str2);
    }

    public void c() {
        this.X.a(C4621nja.e(getString(p.url_privacy)));
    }

    private void a(Intent intent) {
        this.s = (AccountAuthenticatorResponse) intent.getParcelableExtra("accountAuthenticatorResponse");
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.s;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onRequestContinued();
        }
    }

    private void b(b bVar, boolean z2) {
        this.c = bVar;
        StringBuilder sb = new StringBuilder();
        sb.append("will set OnboardActivity state to: ");
        sb.append(bVar);
        C7316sHa.a(4, "ScOnboarding", sb.toString());
        switch (q.b[this.c.ordinal()]) {
            case 1:
                a(bVar, z2);
                a((View) B(), z2);
                return;
            case 2:
                this.D = b.LOGIN;
                a(bVar, z2);
                a((View) D(), z2);
                return;
            case 3:
                this.D = b.SIGN_UP_METHOD;
                a(bVar, z2);
                a((View) C(), z2);
                return;
            case 4:
                a(bVar, z2);
                a((View) B(), z2);
                return;
            case 5:
                a(bVar, z2);
                a((View) A(), z2);
                return;
            case 6:
                H();
                b(z2);
                return;
            default:
                return;
        }
    }

    private void c(Bundle bundle) {
        a(m.GOOGLE);
        C5232QGa.a((C0361c) this.h.a(bundle), getSupportFragmentManager(), "signup_dialog");
    }

    private void c(String str) {
        this.d = str;
        if (E()) {
            c(T.a(str, 8003));
        } else if (F()) {
            this.C = pa.GOOGLE_PLUS;
            this.d = str;
            a(b.ENTER_USER_DETAILS);
        } else {
            throw new IllegalStateException("Trying to authenticate with Google. Login/Signup were not selected.");
        }
    }

    private void a(m mVar) {
        this.R.a(C1994DO.a().a(u.LOGIN).a(t.a(s.LOGIN_PROVIDER, mVar.toString())).b());
    }

    public void a(String str, File file) {
        if (this.i != C3508cda.a) {
            C5232QGa.a((C0361c) C4216n.a(str, file), getSupportFragmentManager(), "add_user_task");
            this.W.a(Baa.a(str, file));
        }
    }

    private void c(int i2) {
        Bundle bundle;
        if (i2 == -1) {
            if (F()) {
                bundle = this.A;
                if (bundle == null) {
                    throw new IllegalStateException("Missing Google+ signup params");
                }
            } else {
                bundle = T.a(this.d, 8003);
            }
            c(bundle);
        }
    }

    public void a(String str, String str2) {
        if (this.y == null) {
            this.y = new Bundle();
        }
        this.C = pa.API;
        na.a(this.y, str, str2);
        a(b.SIGN_UP_BASICS);
    }

    public void d() {
        C7316sHa.a(4, "ScOnboarding", "on Google+ auth");
        if (F()) {
            b(pa.GOOGLE_PLUS, (Bundle) null);
        } else {
            a(pa.GOOGLE_PLUS, (Bundle) null);
        }
    }

    public /* synthetic */ void c(DialogInterface dialogInterface, int i2) {
        startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(getString(p.url_contact_support))));
        dialogInterface.dismiss();
    }

    private boolean d(int i2) {
        return this.S.a(this, i2, 8006);
    }

    private void b(boolean z2) {
        C5466YFa.b(this.j, z2);
        C5466YFa.a(this.m, z2);
        C5466YFa.b(findViewById(i.onboarding_text), false);
        if (!z2 || this.n.getVisibility() != 0) {
            this.u.onAnimationEnd(null);
        } else {
            C5466YFa.a(this.n, this.u);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    public l d(String str) {
        char c2;
        String upperCase = str.toUpperCase(Locale.US);
        int hashCode = upperCase.hashCode();
        if (hashCode != 2358797) {
            if (hashCode == 2070122316 && upperCase.equals("FEMALE")) {
                c2 = 0;
                if (c2 == 0) {
                    return l.FEMALE;
                }
                if (c2 != 1) {
                    return null;
                }
                return l.MALE;
            }
        } else if (upperCase.equals("MALE")) {
            c2 = 1;
            if (c2 == 0) {
            }
        }
        c2 = 65535;
        if (c2 == 0) {
        }
    }

    public void a(C5815m mVar, String str) {
        int i2 = q.a[this.C.ordinal()];
        if (i2 == 1) {
            na.a(this.y, mVar, str);
            b(pa.API, this.y);
        } else if (i2 == 2 || i2 == 3) {
            f(ka.a(this.e, mVar, str));
        } else if (i2 == 4) {
            this.A = T.a(this.d, mVar, str, 8003);
            c(this.A);
        } else {
            throw new a("No Signup method selected");
        }
    }

    private void c(androidx.appcompat.app.C0325l.a aVar, Baa baa) {
        if (C5232QGa.a((Dialog) aVar.a())) {
            this.W.a(baa);
        }
    }

    public void c(String str, String str2) {
        a(m.PASSWORD);
        C5232QGa.a((C0361c) this.g.a(str, str2), getSupportFragmentManager(), "login_dialog");
        this.W.a(Baa.j());
    }

    private void b(pa paVar, Bundle bundle) {
        C0370l supportFragmentManager = getSupportFragmentManager();
        String str = "accept_terms_dialog";
        if (((C4210h) supportFragmentManager.a(str)) == null) {
            C5232QGa.a((C0361c) new com.soundcloud.android.onboarding.auth.C4210h.c().a(paVar, bundle), supportFragmentManager, str);
            this.Z.a(Yca.AUTH_TERMS);
        }
    }

    public void a(int i2) {
        Snackbar.a(findViewById(i.overlay_holder), i2, 0).n();
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        b(bVar, true);
    }

    private void a(b bVar, boolean z2) {
        if (bVar != b.LOGIN) {
            LoginLayout loginLayout = this.o;
            if (loginLayout != null) {
                C5466YFa.a((View) loginLayout, z2);
            }
        }
        if (bVar != b.SIGN_UP_METHOD) {
            CreateAccountLayout createAccountLayout = this.p;
            if (createAccountLayout != null) {
                C5466YFa.a((View) createAccountLayout, z2);
            }
        }
        if (bVar != b.SIGN_UP_BASICS) {
            CreateAccountAgeAndGenderLayout createAccountAgeAndGenderLayout = this.q;
            if (createAccountAgeAndGenderLayout != null) {
                C5466YFa.a((View) createAccountAgeAndGenderLayout, z2);
            }
        }
        if (bVar != b.SIGN_UP_DETAILS) {
            AlmostDoneLayout almostDoneLayout = this.r;
            if (almostDoneLayout != null) {
                C5466YFa.a((View) almostDoneLayout, z2);
            }
        }
    }

    public /* synthetic */ void b(DialogInterface dialogInterface, int i2) {
        w();
    }

    public void b(String str) {
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        b2.a((CharSequence) str);
        b2.c(17039370, (DialogInterface.OnClickListener) null);
        C5232QGa.a((Dialog) b2.a());
    }

    private void b(androidx.appcompat.app.C0325l.a aVar, Baa baa) {
        a(aVar);
        a(aVar, baa);
    }

    public void a() {
        C7316sHa.a(4, "ScOnboarding", "on Facebook auth");
        this.W.a(Baa.e());
        if (F()) {
            b(pa.FACEBOOK_SSO, (Bundle) null);
        } else {
            a(pa.FACEBOOK_SSO, (Bundle) null);
        }
    }

    private androidx.appcompat.app.C0325l.a b(int i2) {
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(this);
        aVar.b((CharSequence) getString(i2));
        aVar.a(16843605);
        return aVar;
    }

    private void b(Bundle bundle) {
        C5232QGa.a((C0361c) this.g.a(bundle), getSupportFragmentManager(), "login_dialog");
    }

    public void a(String str) {
        Intent intent = new Intent(this, RecoverActivity.class);
        if (str != null && str.length() > 0) {
            intent.putExtra(Scopes.EMAIL, str);
        }
        startActivityForResult(intent, 8002);
    }

    public void a(pa paVar, Bundle bundle) {
        int i2 = q.a[paVar.ordinal()];
        if (i2 == 1) {
            f(bundle);
        } else if (i2 == 2) {
            z();
        } else if (i2 == 4) {
            G();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown signupVia: ");
            sb.append(paVar.a());
            throw new IllegalArgumentException(sb.toString());
        }
        this.W.a(Baa.s());
    }

    public void a(C3776gea gea, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append("auth task complete. user = [");
        sb.append(gea);
        sb.append("], wasApiSignupTask = [");
        sb.append(z2);
        sb.append("]");
        C7316sHa.a(4, "ScOnboarding", sb.toString());
        if (z2) {
            ma.c(this);
            this.i = gea.l();
            a(b.SIGN_UP_DETAILS);
            this.Z.a(Yca.AUTH_USER_DETAILS);
            this.W.a(Baa.a());
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", gea.m());
        bundle.putString("accountType", getString(p.account_type));
        this.t = bundle;
        if (this.B.c()) {
            this.P.a((Context) this, (Uri) this.B.b());
        } else {
            startActivity(new Intent(this, MainActivity.class).addFlags(67108864));
        }
        finish();
    }

    private void a(f fVar) {
        String str;
        String str2 = "ScOnboarding";
        C7316sHa.a(4, str2, "Activity Result Action");
        int i2 = fVar.a;
        int i3 = fVar.b;
        Intent intent = fVar.c;
        if (B.a(i2)) {
            C7316sHa.a(4, str2, "Handing off to Facebook SDK");
            this.I.onActivityResult(i2, i3, intent);
        }
        if (i2 != 6709) {
            if (i2 != 9000) {
                if (i2 != 9001) {
                    switch (i2) {
                        case 8002:
                            if (i3 == -1 && intent != null) {
                                if (intent.getBooleanExtra("success", false)) {
                                    C5232QGa.a((Context) this, p.authentication_recover_password_success, new Object[0]);
                                    return;
                                }
                                String stringExtra = intent.getStringExtra("errorReason");
                                if (stringExtra == null) {
                                    str = getString(p.authentication_recover_password_failure);
                                } else {
                                    str = getString(p.authentication_recover_password_failure_reason, new Object[]{stringExtra});
                                }
                                C5232QGa.a((Context) this, (CharSequence) str);
                                return;
                            }
                            return;
                        case 8003:
                            c(i3);
                            return;
                        case 8004:
                            c(i3);
                            return;
                        case 8005:
                            if (i3 == -1) {
                                c(intent.getStringExtra("authAccount"));
                                return;
                            }
                            return;
                        case 8006:
                            if (i3 != -1) {
                                M();
                                return;
                            } else {
                                L();
                                return;
                            }
                        default:
                            return;
                    }
                } else if (A() != null) {
                    A().b(i3);
                }
            } else if (A() != null) {
                A().b(i3, intent);
            }
        } else if (A() != null) {
            A().a(i3, intent);
        }
    }

    private void a(View view, boolean z2) {
        C5466YFa.a(this.j, z2);
        C5466YFa.a(findViewById(i.onboarding_text), z2);
        C5466YFa.b(this.n, z2);
        C5466YFa.b(this.m, z2);
        C5466YFa.b(view, z2);
    }

    @SuppressLint({"sc.EnumUsage"})
    public void a(String str, C4928GKa<C5815m> gKa, C4928GKa<String> gKa2) {
        if (this.x == null) {
            this.x = new Bundle();
        }
        if (E()) {
            b(ia.b(str));
        } else if (F()) {
            this.C = pa.FACEBOOK_SSO;
            this.e = str;
            this.x.putSerializable("BUNDLE_AGE", (Serializable) gKa.d());
            this.x.putSerializable("BUNDLE_GENDER", (Serializable) gKa2.b((Function<? super T, V>) new b<Object,V>(this)).d());
            a(b.ENTER_USER_DETAILS);
        } else {
            throw new IllegalStateException("Trying to authenticate with Facebook account, but login/signup was not clicked.");
        }
    }

    public void a(String str, boolean z2) {
        androidx.appcompat.app.C0325l.a b2 = b(p.authentication_error_title);
        if (TextUtils.isEmpty(str)) {
            str = getString(p.authentication_signup_error_message);
        }
        b2.a((CharSequence) str);
        b2.c(17039370, (DialogInterface.OnClickListener) null);
        if (z2) {
            b(b2, Baa.p());
        } else {
            a(b2, Baa.n());
        }
    }

    @SuppressLint({"sc.StartIntent"})
    public void a(d dVar) {
        startActivityForResult(dVar.a(), 8003);
    }

    public void a(Bundle bundle) {
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(this);
        aVar.b(new com.soundcloud.android.view.customfontviews.b(this).a(h.dialog_device_management).c(p.device_management_limit_title).b(p.device_management_limit_active).a());
        aVar.c(p.device_management_register, (DialogInterface.OnClickListener) new a(this, bundle));
        aVar.a(p.btn_cancel, (DialogInterface.OnClickListener) null);
        a(aVar, Baa.d());
    }

    public /* synthetic */ void a(Bundle bundle, DialogInterface dialogInterface, int i2) {
        b(bundle);
    }

    private void a(androidx.appcompat.app.C0325l.a aVar, Baa baa) {
        if (C5232QGa.a((Dialog) aVar.a())) {
            this.W.a(baa);
        }
    }

    private void a(androidx.appcompat.app.C0325l.a aVar) {
        if (this.L.m()) {
            aVar.b(p.title_feedback, (DialogInterface.OnClickListener) new d(this));
        }
    }

    public /* synthetic */ void a(DialogInterface dialogInterface, int i2) {
        SDb.a("ScOnboarding").d("on send bug report", new Object[0]);
        this.N.b((Context) e());
    }
}
