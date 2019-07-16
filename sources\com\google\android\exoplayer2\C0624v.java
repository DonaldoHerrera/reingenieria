package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.google.android.exoplayer2.v reason: case insensitive filesystem */
/* compiled from: ExoPlayerImpl */
class C0624v extends Handler {
    final /* synthetic */ C0625w a;

    C0624v(C0625w wVar, Looper looper) {
        this.a = wVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        this.a.a(message);
    }
}
