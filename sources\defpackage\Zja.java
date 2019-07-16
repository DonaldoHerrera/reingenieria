package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: Zja reason: default package */
/* compiled from: Channels.kt */
public final class Zja extends Uja {
    private final NotificationChannel a;
    private NotificationChannelGroup b;

    public Zja(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannel("channel_record", context.getString(h.notification_channel_record), 2);
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
