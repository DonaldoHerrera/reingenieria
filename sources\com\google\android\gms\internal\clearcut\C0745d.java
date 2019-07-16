package com.google.android.gms.internal.clearcut;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.gms.internal.clearcut.d reason: case insensitive filesystem */
final class C0745d extends ContentObserver {
    private final /* synthetic */ C0742c a;

    C0745d(C0742c cVar, Handler handler) {
        this.a = cVar;
        super(null);
    }

    public final void onChange(boolean z) {
        this.a.b();
        this.a.d();
    }
}
