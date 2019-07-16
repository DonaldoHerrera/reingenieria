package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.measurement.ta reason: case insensitive filesystem */
final class C1041ta extends ContentObserver {
    C1041ta(C1029ra raVar, Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        C1047ua.b();
    }
}
