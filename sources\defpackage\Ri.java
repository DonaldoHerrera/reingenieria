package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Ri reason: default package */
/* compiled from: DevicePowerStateListener */
class Ri extends BroadcastReceiver {
    final /* synthetic */ Ti a;

    Ri(Ti ti) {
        this.a = ti;
    }

    public void onReceive(Context context, Intent intent) {
        this.a.h = true;
    }
}
