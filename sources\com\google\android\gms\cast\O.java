package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.C0627a.C0036a;
import com.google.android.gms.cast.C0627a.b.C0037a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.internal.cast.N;

final class O extends f {
    private final /* synthetic */ String a;
    private final /* synthetic */ LaunchOptions b;

    O(C0037a aVar, GoogleApiClient googleApiClient, String str, LaunchOptions launchOptions) {
        this.a = str;
        this.b = launchOptions;
        super(googleApiClient);
    }

    /* renamed from: a */
    public final void doExecute(N n) throws RemoteException {
        try {
            n.a(this.a, this.b, (ResultHolder<C0036a>) this);
        } catch (IllegalStateException unused) {
            a(2001);
        }
    }
}
