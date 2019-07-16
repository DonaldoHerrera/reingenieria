package com.facebook.login;

import android.os.Bundle;
import com.facebook.C0594t;
import com.facebook.internal.oa.c;
import com.facebook.login.LoginClient.Request;

/* compiled from: WebViewLoginMethodHandler */
class N implements c {
    final /* synthetic */ Request a;
    final /* synthetic */ WebViewLoginMethodHandler b;

    N(WebViewLoginMethodHandler webViewLoginMethodHandler, Request request) {
        this.b = webViewLoginMethodHandler;
        this.a = request;
    }

    public void a(Bundle bundle, C0594t tVar) {
        this.b.b(this.a, bundle, tVar);
    }
}
