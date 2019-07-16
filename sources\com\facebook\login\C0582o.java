package com.facebook.login;

import android.os.Bundle;
import com.facebook.internal.ba.a;
import com.facebook.login.LoginClient.Request;

/* renamed from: com.facebook.login.o reason: case insensitive filesystem */
/* compiled from: GetTokenLoginMethodHandler */
class C0582o implements a {
    final /* synthetic */ Request a;
    final /* synthetic */ GetTokenLoginMethodHandler b;

    C0582o(GetTokenLoginMethodHandler getTokenLoginMethodHandler, Request request) {
        this.b = getTokenLoginMethodHandler;
        this.a = request;
    }

    public void a(Bundle bundle) {
        this.b.b(this.a, bundle);
    }
}
