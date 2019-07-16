package com.google.android.gms.cast.framework.media;

import com.google.android.gms.cast.C0679l;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.C0718ma;
import com.google.android.gms.internal.cast.N;

/* renamed from: com.google.android.gms.cast.framework.media.o reason: case insensitive filesystem */
final class C0660o extends h {
    private final /* synthetic */ C0679l d;
    private final /* synthetic */ C0650e e;

    C0660o(C0650e eVar, GoogleApiClient googleApiClient, C0679l lVar) {
        this.e = eVar;
        this.d = lVar;
        super(eVar, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final void a(N n) throws C0718ma {
        this.e.d.a(this.a, this.d);
    }
}
