package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.ka reason: case insensitive filesystem */
final class C0988ka extends ContentObserver {
    private final /* synthetic */ C0976ia a;

    C0988ka(C0976ia iaVar, Handler handler) {
        this.a = iaVar;
        super(null);
    }

    public final void onChange(boolean z) {
        this.a.b();
    }
}
