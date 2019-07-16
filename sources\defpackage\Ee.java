package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.i;

/* renamed from: Ee reason: default package */
/* compiled from: BatteryNotLowTracker */
public class Ee extends Ge<Boolean> {
    private static final String i = i.a("BatteryNotLowTracker");

    public Ee(Context context, C1811wf wfVar) {
        super(context, wfVar);
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    public Boolean a() {
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            i.a().b(i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("plugged", 0);
        int intExtra2 = registerReceiver.getIntExtra("status", -1);
        float intExtra3 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        boolean z = true;
        if (intExtra == 0 && intExtra2 != 1 && intExtra3 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public void a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            i.a().a(i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1980154005) {
                if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                    c = 1;
                }
            } else if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 0;
            }
            if (c == 0) {
                a(Boolean.valueOf(true));
            } else if (c == 1) {
                a(Boolean.valueOf(false));
            }
        }
    }
}
