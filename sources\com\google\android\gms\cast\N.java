package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.cast.C0627a.b.C0037a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.internal.cast.C0694aa;

final class N extends C0694aa {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;

    N(C0037a aVar, GoogleApiClient googleApiClient, String str, String str2) {
        this.a = str;
        this.b = str2;
        super(googleApiClient);
    }

    /* renamed from: a */
    public final void doExecute(com.google.android.gms.internal.cast.N n) throws RemoteException {
        try {
            n.a(this.a, this.b, (ResultHolder<Status>) this);
        } catch (IllegalArgumentException | IllegalStateException unused) {
            a(2001);
        }
    }
}
