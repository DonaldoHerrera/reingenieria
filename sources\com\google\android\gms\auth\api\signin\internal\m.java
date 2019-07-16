package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.VisibleForTesting;

public final class m {
    private static m a;
    @VisibleForTesting
    private b b;
    @VisibleForTesting
    private GoogleSignInAccount c = this.b.b();
    @VisibleForTesting
    private GoogleSignInOptions d = this.b.c();

    private m(Context context) {
        this.b = b.a(context);
    }

    public static synchronized m a(Context context) {
        m b2;
        synchronized (m.class) {
            b2 = b(context.getApplicationContext());
        }
        return b2;
    }

    private static synchronized m b(Context context) {
        m mVar;
        synchronized (m.class) {
            if (a == null) {
                a = new m(context);
            }
            mVar = a;
        }
        return mVar;
    }

    public final synchronized void a() {
        this.b.a();
        this.c = null;
        this.d = null;
    }

    public final synchronized void a(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.b.a(googleSignInAccount, googleSignInOptions);
        this.c = googleSignInAccount;
        this.d = googleSignInOptions;
    }
}
