package androidx.mediarouter.app;

import android.os.Handler;
import android.os.Message;
import java.util.List;

/* compiled from: MediaRouteDevicePickerDialog */
class x extends Handler {
    final /* synthetic */ z a;

    x(z zVar) {
        this.a = zVar;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b((List) message.obj);
        }
    }
}
