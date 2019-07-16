package com.google.android.gms.internal.firebase-perf;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.firebase-perf.cb reason: case insensitive filesystem */
final class C0825cb extends ContentObserver {
    C0825cb(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        B.e.set(true);
    }
}
