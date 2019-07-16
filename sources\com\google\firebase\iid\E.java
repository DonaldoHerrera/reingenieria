package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
final class E extends BroadcastReceiver {
    private A a;

    public E(A a2) {
        this.a = a2;
    }

    public final void a() {
        if (FirebaseInstanceId.g()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        A a2 = this.a;
        if (a2 != null && a2.b()) {
            if (FirebaseInstanceId.g()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a((Runnable) this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
