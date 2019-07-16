package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* renamed from: androidx.mediarouter.app.b reason: case insensitive filesystem */
/* compiled from: MediaRouteCastDialog */
class C0389b extends Handler {
    final /* synthetic */ C0392e a;

    C0389b(C0392e eVar) {
        this.a = eVar;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b((List) message.obj);
        }
    }
}
