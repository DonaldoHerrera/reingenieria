package com.facebook.login;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0538h;
import com.facebook.C0594t;
import com.facebook.C0596v;
import com.facebook.D;
import com.facebook.FacebookRequestError;
import com.facebook.internal.ia;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import com.soundcloud.flippernative.BuildConfig;
import java.util.Collection;
import java.util.Locale;

abstract class WebLoginMethodHandler extends LoginMethodHandler {
    private String c;

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    private void d(String str) {
        this.b.c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", str).apply();
    }

    private static final String f() {
        StringBuilder sb = new StringBuilder();
        sb.append("fb");
        sb.append(B.f());
        sb.append("://authorize");
        return sb.toString();
    }

    private String g() {
        return this.b.c().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", "");
    }

    /* access modifiers changed from: protected */
    public Bundle a(Bundle bundle, Request request) {
        bundle.putString("redirect_uri", f());
        bundle.putString("client_id", request.a());
        LoginClient loginClient = this.b;
        bundle.putString("e2e", LoginClient.e());
        bundle.putString("response_type", "token,signed_request");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.c());
        if (d() != null) {
            bundle.putString("sso", d());
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public Bundle b(Request request) {
        Bundle bundle = new Bundle();
        if (!ia.a((Collection<T>) request.h())) {
            String join = TextUtils.join(",", request.h());
            String str = "scope";
            bundle.putString(str, join);
            a(str, join);
        }
        bundle.putString("default_audience", request.d().a());
        bundle.putString("state", a(request.b()));
        AccessToken c2 = AccessToken.c();
        String k = c2 != null ? c2.k() : null;
        String str2 = "access_token";
        if (k == null || !k.equals(g())) {
            ia.a((Context) this.b.c());
            a(str2, BuildConfig.VERSION_NAME);
        } else {
            bundle.putString(str2, k);
            a(str2, "1");
        }
        return bundle;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return null;
    }

    /* access modifiers changed from: 0000 */
    public abstract C0538h e();

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* access modifiers changed from: protected */
    public void a(Request request, Bundle bundle, C0594t tVar) {
        Result result;
        String str;
        this.c = null;
        if (bundle != null) {
            String str2 = "e2e";
            if (bundle.containsKey(str2)) {
                this.c = bundle.getString(str2);
            }
            try {
                AccessToken a = LoginMethodHandler.a(request.h(), bundle, e(), request.a());
                result = Result.a(this.b.i(), a);
                CookieSyncManager.createInstance(this.b.c()).sync();
                d(a.k());
            } catch (C0594t e) {
                result = Result.a(this.b.i(), null, e.getMessage());
            }
        } else if (tVar instanceof C0596v) {
            result = Result.a(this.b.i(), "User canceled log in.");
        } else {
            this.c = null;
            String message = tVar.getMessage();
            if (tVar instanceof D) {
                FacebookRequestError a2 = ((D) tVar).a();
                str = String.format(Locale.ROOT, "%d", new Object[]{Integer.valueOf(a2.b())});
                message = a2.toString();
            } else {
                str = null;
            }
            result = Result.a(this.b.i(), null, message, str);
        }
        if (!ia.b(this.c)) {
            c(this.c);
        }
        this.b.b(result);
    }
}
