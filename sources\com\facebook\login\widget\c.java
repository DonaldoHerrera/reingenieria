package com.facebook.login.widget;

import com.facebook.internal.E;

/* compiled from: LoginButton */
class c implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ LoginButton b;

    c(LoginButton loginButton, String str) {
        this.b = loginButton;
        this.a = str;
    }

    public void run() {
        this.b.getActivity().runOnUiThread(new b(this, E.a(this.a, false)));
    }
}
