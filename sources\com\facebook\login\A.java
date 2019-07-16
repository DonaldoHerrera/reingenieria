package com.facebook.login;

import android.content.Intent;
import com.facebook.C0587q;
import com.facebook.internal.C0551l.a;

/* compiled from: LoginManager */
class A implements a {
    final /* synthetic */ C0587q a;
    final /* synthetic */ D b;

    A(D d, C0587q qVar) {
        this.b = d;
        this.a = qVar;
    }

    public boolean a(int i, Intent intent) {
        return this.b.a(i, intent, this.a);
    }
}
