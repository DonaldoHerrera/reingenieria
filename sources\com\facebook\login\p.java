package com.facebook.login;

import android.os.Bundle;
import com.facebook.C0594t;
import com.facebook.internal.ia.a;
import com.facebook.login.LoginClient.Request;
import com.facebook.login.LoginClient.Result;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GetTokenLoginMethodHandler */
class p implements a {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Request b;
    final /* synthetic */ GetTokenLoginMethodHandler c;

    p(GetTokenLoginMethodHandler getTokenLoginMethodHandler, Bundle bundle, Request request) {
        this.c = getTokenLoginMethodHandler;
        this.a = bundle;
        this.b = request;
    }

    public void a(JSONObject jSONObject) {
        try {
            this.a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
            this.c.c(this.b, this.a);
        } catch (JSONException e) {
            LoginClient loginClient = this.c.b;
            loginClient.a(Result.a(loginClient.i(), "Caught exception", e.getMessage()));
        }
    }

    public void a(C0594t tVar) {
        LoginClient loginClient = this.c.b;
        loginClient.a(Result.a(loginClient.i(), "Caught exception", tVar.getMessage()));
    }
}
