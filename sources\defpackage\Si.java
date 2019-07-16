package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Si reason: default package */
/* compiled from: DevicePowerStateListener */
class Si extends BroadcastReceiver {
    final /* synthetic */ Ti a;

    Si(Ti ti) {
        this.a = ti;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.h = false;
    }
}
