package com.appboy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bo.app.dq;

public class AppboyBootReceiver extends BroadcastReceiver {
    private static final String a = Hg.a(AppboyBootReceiver.class);

    /* access modifiers changed from: 0000 */
    public boolean a(Context context, Intent intent) {
        if (intent == null) {
            Hg.e(a, "Null intent received. Doing nothing.");
            return false;
        } else if (context == null) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Null context received for intent ");
            sb.append(intent.toString());
            sb.append(". Doing nothing.");
            Hg.e(str, sb.toString());
            return false;
        } else {
            String str2 = a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Received broadcast message. Message: ");
            sb2.append(intent.toString());
            Hg.c(str2, sb2.toString());
            if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                Hg.c(a, "Boot complete intent received. Initializing.");
                dq.a(context);
                h.a(context);
                return true;
            }
            String str3 = a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Unknown intent ");
            sb3.append(intent.toString());
            sb3.append(" received. Doing nothing.");
            Hg.e(str3, sb3.toString());
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }
}
