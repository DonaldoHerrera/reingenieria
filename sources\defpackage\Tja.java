package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: Tja reason: default package */
/* compiled from: Channels.kt */
public final class Tja extends Uja {
    private final NotificationChannel a;
    private NotificationChannelGroup b;

    public Tja(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannel("channel_account", context.getString(h.notification_channel_account), 3);
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
