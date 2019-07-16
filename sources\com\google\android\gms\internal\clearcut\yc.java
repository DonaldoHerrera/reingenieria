package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

final class yc extends ContentObserver {
    yc(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        xc.e.set(true);
    }
}
