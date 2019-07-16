package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.firebase.iid.w reason: case insensitive filesystem */
final class C2515w extends Hs {
    private final /* synthetic */ C2516x a;

    C2515w(C2516x xVar, Looper looper) {
        this.a = xVar;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.a.a(message);
    }
}
