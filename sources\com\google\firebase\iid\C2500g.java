package com.google.firebase.iid;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: com.google.firebase.iid.g reason: case insensitive filesystem */
final /* synthetic */ class C2500g implements Callback {
    private final C2501h a;

    C2500g(C2501h hVar) {
        this.a = hVar;
    }

    public final boolean handleMessage(Message message) {
        return this.a.a(message);
    }
}
