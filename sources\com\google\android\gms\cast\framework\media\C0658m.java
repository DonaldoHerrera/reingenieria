package com.google.android.gms.cast.framework.media;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.cast.C0718ma;
import com.google.android.gms.internal.cast.N;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.cast.framework.media.m reason: case insensitive filesystem */
final class C0658m extends h {
    private final /* synthetic */ JSONObject d;
    private final /* synthetic */ C0650e e;

    C0658m(C0650e eVar, GoogleApiClient googleApiClient, JSONObject jSONObject) {
        this.e = eVar;
        this.d = jSONObject;
        super(eVar, googleApiClient);
    }

    /* access modifiers changed from: protected */
    public final void a(N n) throws C0718ma {
        this.e.d.a(this.a, this.d);
    }
}
