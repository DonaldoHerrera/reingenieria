package com.facebook;

import android.content.Context;
import com.facebook.B.a;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.z reason: case insensitive filesystem */
/* compiled from: FacebookSdk */
class C0600z implements Callable<Void> {
    final /* synthetic */ a a;
    final /* synthetic */ Context b;

    C0600z(a aVar, Context context) {
        this.a = aVar;
        this.b = context;
    }

    public Void call() throws Exception {
        C0537g.d().e();
        T.b().c();
        if (AccessToken.m() && Profile.c() == null) {
            Profile.b();
        }
        a aVar = this.a;
        if (aVar != null) {
            aVar.a();
        }
        C1237dk.a(B.m, B.d);
        C1237dk.b(this.b.getApplicationContext()).a();
        return null;
    }
}
