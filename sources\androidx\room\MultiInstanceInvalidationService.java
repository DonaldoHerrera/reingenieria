package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import androidx.room.C0436e.a;

public class MultiInstanceInvalidationService extends Service {
    int a = 0;
    final C0516ca<String> b = new C0516ca<>();
    final RemoteCallbackList<C0435d> c = new q(this);
    private final a d = new r(this);

    public IBinder onBind(Intent intent) {
        return this.d;
    }
}
