package com.facebook;

import android.content.Context;

/* compiled from: FacebookSdk */
class A implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;

    A(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public void run() {
        B.a(this.a, this.b);
    }
}
