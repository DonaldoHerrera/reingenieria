package defpackage;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: Cb reason: default package and case insensitive filesystem */
/* compiled from: SelfDestructiveThread */
class C0196Cb implements Callback {
    final /* synthetic */ C0208Gb a;

    C0196Cb(C0208Gb gb) {
        this.a = gb;
    }

    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.a.a();
            return true;
        } else if (i != 1) {
            return true;
        } else {
            this.a.a((Runnable) message.obj);
            return true;
        }
    }
}
