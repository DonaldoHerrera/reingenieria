package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: Hs reason: default package */
public class Hs extends Handler {
    public Hs(Looper looper) {
        super(looper);
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public Hs(Looper looper, Callback callback) {
        super(looper, callback);
    }
}
