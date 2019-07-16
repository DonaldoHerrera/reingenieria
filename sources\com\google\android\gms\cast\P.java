package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.C0627a.b.C0037a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.N;

final class P extends f {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ zzah c = null;

    P(C0037a aVar, GoogleApiClient googleApiClient, String str, String str2, zzah zzah) {
        this.a = str;
        this.b = str2;
        super(googleApiClient);
    }

    /* renamed from: a */
    public final void doExecute(N n) throws RemoteException {
        try {
            n.a(this.a, this.b, this.c, this);
        } catch (IllegalStateException unused) {
            a(2001);
        }
    }
}
