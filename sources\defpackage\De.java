package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import androidx.work.i;

/* renamed from: De reason: default package */
/* compiled from: BatteryChargingTracker */
public class De extends Ge<Boolean> {
    private static final String i = i.a("BatteryChrgTracker");

    public De(Context context, C1811wf wfVar) {
        super(context, wfVar);
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        if (VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    public Boolean a() {
        Intent registerReceiver = this.c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            return Boolean.valueOf(a(registerReceiver));
        }
        i.a().b(i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    public void a(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            i.a().a(i, String.format("Received %s", new Object[]{action}), new Throwable[0]);
            char c = 65535;
            switch (action.hashCode()) {
                case -1886648615:
                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                        c = 3;
                        break;
                    }
                    break;
                case -54942926:
                    if (action.equals("android.os.action.DISCHARGING")) {
                        c = 1;
                        break;
                    }
                    break;
                case 948344062:
                    if (action.equals("android.os.action.CHARGING")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1019184907:
                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                a(Boolean.valueOf(true));
            } else if (c == 1) {
                a(Boolean.valueOf(false));
            } else if (c == 2) {
                a(Boolean.valueOf(true));
            } else if (c == 3) {
                a(Boolean.valueOf(false));
            }
        }
    }

    private boolean a(Intent intent) {
        if (VERSION.SDK_INT >= 23) {
            int intExtra = intent.getIntExtra("status", -1);
            if (intExtra == 2 || intExtra == 5) {
                return true;
            }
        } else if (intent.getIntExtra("plugged", 0) != 0) {
            return true;
        }
        return false;
    }
}
