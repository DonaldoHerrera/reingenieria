package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: od reason: default package and case insensitive filesystem */
/* compiled from: LocalBroadcastManager */
class C1569od extends Handler {
    final /* synthetic */ C1600pd a;

    C1569od(C1600pd pdVar, Looper looper) {
        this.a = pdVar;
        super(looper);
    }

    public void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            this.a.a();
        }
    }
}
