package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.i;

/* renamed from: Ke reason: default package */
/* compiled from: StorageNotLowTracker */
public class Ke extends Ge<Boolean> {
    private static final String i = i.a("StorageNotLowTracker");

    public Ke(Context context, C1811wf wfVar) {
        super(context, wfVar);
    }

    public IntentFilter d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    public Boolean a() {
        Intent registerReceiver = this.c.registerReceiver(null, d());
        Boolean valueOf = Boolean.valueOf(true);
        if (!(registerReceiver == null || registerReceiver.getAction() == null)) {
            String action = registerReceiver.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c != 0) {
                if (c != 1) {
                    return null;
                }
                return Boolean.valueOf(false);
            }
        }
        return valueOf;
    }

    public void a(Context context, Intent intent) {
        if (intent.getAction() != null) {
            i.a().a(i, String.format("Received %s", new Object[]{intent.getAction()}), new Throwable[0]);
            String action = intent.getAction();
            char c = 65535;
            int hashCode = action.hashCode();
            if (hashCode != -1181163412) {
                if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    c = 0;
                }
            } else if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                c = 1;
            }
            if (c == 0) {
                a(Boolean.valueOf(true));
            } else if (c == 1) {
                a(Boolean.valueOf(false));
            }
        }
    }
}
