package androidx.appcompat.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: AppCompatDelegateImpl */
class y extends BroadcastReceiver {
    final /* synthetic */ e a;

    y(e eVar) {
        this.a = eVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.b();
    }
}
