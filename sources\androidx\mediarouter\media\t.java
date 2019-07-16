package androidx.mediarouter.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: RegisteredMediaRouteProviderWatcher */
class t extends BroadcastReceiver {
    final /* synthetic */ v a;

    t(v vVar) {
        this.a = vVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.a();
    }
}
