package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.C0718ma;
import com.google.android.gms.internal.cast.N;

final class P extends h {
    private final /* synthetic */ long[] d;
    private final /* synthetic */ C0650e e;

    P(C0650e eVar, GoogleApiClient googleApiClient, long[] jArr) {
        this.e = eVar;
        this.d = jArr;
        super(eVar, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final void a(N n) throws C0718ma {
        this.e.d.a(this.a, this.d);
    }
}
