package com.facebook.internal;

import android.os.Handler;
import android.os.Message;

/* compiled from: PlatformServiceClient */
class aa extends Handler {
    final /* synthetic */ ba a;

    aa(ba baVar) {
        this.a = baVar;
    }

    public void handleMessage(Message message) {
        this.a.a(message);
    }
}
