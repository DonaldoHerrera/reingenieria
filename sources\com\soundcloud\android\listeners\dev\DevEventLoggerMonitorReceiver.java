package com.soundcloud.android.listeners.dev;

import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.listeners.dev.eventlogger.h;
import dagger.android.DaggerBroadcastReceiver;

public class DevEventLoggerMonitorReceiver extends DaggerBroadcastReceiver {
    public static final String a;
    h b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(DevEventLoggerMonitorReceiver.class.getSimpleName());
        sb.append("extra_monitor_mute");
        a = sb.toString();
    }

    private void a(Intent intent) {
        this.b.a(!intent.getBooleanExtra(a, true));
    }

    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        a(intent);
    }
}
