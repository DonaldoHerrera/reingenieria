package com.soundcloud.android.listeners.dev.eventlogger;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.k.a.C0005a;
import androidx.core.app.k.d;
import androidx.core.app.n;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.listeners.dev.DevEventLoggerMonitorReceiver;

/* compiled from: DevEventLoggerMonitorNotificationController.kt */
public final class h {
    private final Context a;
    private final n b;
    private final C7648wza<Boolean> c;

    public h(Context context, n nVar, @d C7648wza<Boolean> wza) {
        C7471uYa.b(context, "context");
        C7471uYa.b(nVar, "notificationManager");
        C7471uYa.b(wza, "mutePref");
        this.a = context;
        this.b = nVar;
        this.c = wza;
    }

    private final Notification c() {
        String str;
        boolean booleanValue = ((Boolean) this.c.getValue()).booleanValue();
        PendingIntent a2 = a(this.a, booleanValue);
        if (booleanValue) {
            str = this.a.getString(p.dev_notification_event_logger_monitor_action_title_unmute);
        } else {
            str = this.a.getString(p.dev_notification_event_logger_monitor_action_title_mute);
        }
        d dVar = new d(this.a, "channel_dev");
        dVar.e(com.soundcloud.android.ia.h.ic_notification_cloud);
        dVar.c(true);
        dVar.c((CharSequence) this.a.getString(p.dev_notification_event_logger_monitor_title));
        dVar.a(a(this.a));
        dVar.a(new C0005a(17301679, str, a2).a());
        Notification a3 = dVar.a();
        C7471uYa.a((Object) a3, "NotificationCompat.Build…d())\n            .build()");
        return a3;
    }

    public final void a() {
        a(false);
    }

    public final void b() {
        b(true);
        this.b.a(8);
    }

    public final void a(boolean z) {
        b(z);
        Oja.b(this.a);
        this.b.a(8, c());
    }

    private final void b(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    @SuppressLint({"sc.CreateIntent"})
    public final PendingIntent a(Context context) {
        C7471uYa.b(context, "context");
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent(context, DevEventLoggerMonitorActivity.class), 268435456);
        C7471uYa.a((Object) activity, "PendingIntent.getActivit…tent.FLAG_CANCEL_CURRENT)");
        return activity;
    }

    private final PendingIntent a(Context context, boolean z) {
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, new Intent(context, DevEventLoggerMonitorReceiver.class).putExtra(DevEventLoggerMonitorReceiver.a, z), 268435456);
        C7471uYa.a((Object) broadcast, "PendingIntent.getBroadca…tent.FLAG_CANCEL_CURRENT)");
        return broadcast;
    }
}
