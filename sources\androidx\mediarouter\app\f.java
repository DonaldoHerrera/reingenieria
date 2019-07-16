package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* compiled from: MediaRouteChooserDialog */
class f extends Handler {
    final /* synthetic */ g a;

    f(g gVar) {
        this.a = gVar;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b((List) message.obj);
        }
    }
}
