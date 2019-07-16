package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import androidx.work.i;
import androidx.work.impl.m;

public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = i.a("RescheduleReceiver");

    public void onReceive(Context context, Intent intent) {
        i.a().a(a, String.format("Received intent %s", new Object[]{intent}), new Throwable[0]);
        if (VERSION.SDK_INT >= 23) {
            try {
                m.a(context).a(goAsync());
            } catch (IllegalStateException unused) {
                i.a().b(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", new Throwable[0]);
            }
        } else {
            context.startService(b.b(context));
        }
    }
}
