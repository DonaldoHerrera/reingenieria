package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.C0676i;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.C0718ma;
import com.google.android.gms.internal.cast.N;

/* renamed from: com.google.android.gms.cast.framework.media.i reason: case insensitive filesystem */
final class C0654i extends h {
    private final /* synthetic */ C0676i d;
    private final /* synthetic */ C0650e e;

    C0654i(C0650e eVar, GoogleApiClient googleApiClient, C0676i iVar) {
        this.e = eVar;
        this.d = iVar;
        super(eVar, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final void a(N n) throws C0718ma {
        this.e.d.a(this.a, this.d);
    }
}
