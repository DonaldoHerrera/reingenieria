package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy.StorageNotLowProxy;
import androidx.work.impl.utils.f;

/* compiled from: ConstraintProxyUpdateReceiver */
class c implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ Context b;
    final /* synthetic */ PendingResult c;
    final /* synthetic */ ConstraintProxyUpdateReceiver d;

    c(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, PendingResult pendingResult) {
        this.d = constraintProxyUpdateReceiver;
        this.a = intent;
        this.b = context;
        this.c = pendingResult;
    }

    public void run() {
        try {
            boolean booleanExtra = this.a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra2 = this.a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
            boolean booleanExtra3 = this.a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
            boolean booleanExtra4 = this.a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
            i.a().a(ConstraintProxyUpdateReceiver.a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)}), new Throwable[0]);
            f.a(this.b, BatteryNotLowProxy.class, booleanExtra);
            f.a(this.b, BatteryChargingProxy.class, booleanExtra2);
            f.a(this.b, StorageNotLowProxy.class, booleanExtra3);
            f.a(this.b, NetworkStateProxy.class, booleanExtra4);
        } finally {
            this.c.finish();
        }
    }
}
