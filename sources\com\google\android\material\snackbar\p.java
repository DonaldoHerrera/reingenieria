package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: SnackbarManager */
class p implements Callback {
    final /* synthetic */ q a;

    p(q qVar) {
        this.a = qVar;
    }

    public boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        this.a.a((b) message.obj);
        return true;
    }
}
