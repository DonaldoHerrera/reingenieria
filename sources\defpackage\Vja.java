package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: Vja reason: default package */
/* compiled from: Channels.kt */
public final class Vja extends Uja {
    private final NotificationChannel a;
    private NotificationChannelGroup b;

    public Vja(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannel("channel_dev", context.getString(h.notification_channel_dev), 4);
    }

    public void a(NotificationChannelGroup notificationChannelGroup) {
        this.b = notificationChannelGroup;
    }

    public NotificationChannel b() {
        return this.a;
    }

    public NotificationChannelGroup c() {
        return this.b;
    }
}
