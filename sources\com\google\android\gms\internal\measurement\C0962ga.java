package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.ga reason: case insensitive filesystem */
final class C0962ga extends ContentObserver {
    C0962ga(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C0969ha.e.set(true);
    }
}
