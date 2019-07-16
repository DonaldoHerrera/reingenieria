package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: As reason: default package */
public class As extends Handler {
    private static volatile Bs zziu;

    public As() {
    }

    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    public As(Looper looper) {
        super(looper);
    }

    public As(Looper looper, Callback callback) {
        super(looper, callback);
    }
}
