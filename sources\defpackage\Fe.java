package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: Fe reason: default package */
/* compiled from: BroadcastReceiverConstraintTracker */
class Fe extends BroadcastReceiver {
    final /* synthetic */ Ge a;

    Fe(Ge ge) {
        this.a = ge;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            this.a.a(context, intent);
        }
    }
}
