package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class f extends C1353hd<Void> implements SignInConnectionListener {
    private Semaphore p = new Semaphore(0);
    private Set<GoogleApiClient> q;

    public f(Context context, Set<GoogleApiClient> set) {
        super(context);
        this.q = set;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final Void t() {
        int i = 0;
        for (GoogleApiClient maybeSignIn : this.q) {
            if (maybeSignIn.maybeSignIn(this)) {
                i++;
            }
        }
        try {
            this.p.tryAcquire(i, 5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final void l() {
        this.p.drainPermits();
        e();
    }

    public final void onComplete() {
        this.p.release();
    }
}
