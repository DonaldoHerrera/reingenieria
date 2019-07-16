package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.C0718ma;
import com.google.android.gms.internal.cast.N;

/* renamed from: com.google.android.gms.cast.framework.media.l reason: case insensitive filesystem */
final class C0657l extends h {
    private final /* synthetic */ int[] d;
    private final /* synthetic */ C0650e e;

    C0657l(C0650e eVar, GoogleApiClient googleApiClient, boolean z, int[] iArr) {
        this.e = eVar;
        this.d = iArr;
        super(googleApiClient, true);
    }

    /* access modifiers changed from: protected */
    public final void a(N n) throws C0718ma {
        this.e.d.a(this.a, this.d);
    }
}
