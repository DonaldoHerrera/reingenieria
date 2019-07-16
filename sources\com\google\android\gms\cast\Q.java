package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.C0627a.b.C0037a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.internal.cast.C0694aa;
import com.google.android.gms.internal.cast.N;

final class Q extends C0694aa {
    private final /* synthetic */ String a;

    Q(C0037a aVar, GoogleApiClient googleApiClient, String str) {
        this.a = str;
        super(googleApiClient);
    }

    /* renamed from: a */
    public final void doExecute(N n) throws RemoteException {
        if (TextUtils.isEmpty(this.a)) {
            setResult(createFailedResult(new Status(2001, "IllegalArgument: sessionId cannot be null or empty", null)));
            return;
        }
        try {
            n.a(this.a, (ResultHolder<Status>) this);
        } catch (IllegalStateException unused) {
            a(2001);
        }
    }
}
