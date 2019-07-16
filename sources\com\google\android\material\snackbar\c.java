package com.google.android.material.snackbar;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: BaseTransientBottomBar */
class c implements Callback {
    c() {
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((BaseTransientBottomBar) message.obj).o();
            return true;
        } else if (i != 1) {
            return false;
        } else {
            ((BaseTransientBottomBar) message.obj).b(message.arg1);
            return true;
        }
    }
}
