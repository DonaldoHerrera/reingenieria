package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: Utils */
class V extends Handler {
    V(Looper looper) {
        super(looper);
    }

    public void handleMessage(Message message) {
        sendMessageDelayed(obtainMessage(), 1000);
    }
}
