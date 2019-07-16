package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: Wja reason: default package */
/* compiled from: Channels.kt */
public final class Wja extends Uja {
    private final NotificationChannel a;
    private NotificationChannelGroup b;

    public Wja(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannel("channel_download", context.getString(h.notification_channel_download), 2);
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
