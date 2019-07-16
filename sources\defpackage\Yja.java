package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: Yja reason: default package */
/* compiled from: Channels.kt */
public final class Yja extends Uja {
    private final NotificationChannel a;
    private NotificationChannelGroup b;

    public Yja(Context context) {
        C7471uYa.b(context, "context");
        NotificationChannel notificationChannel = new NotificationChannel("channel_playback", context.getString(h.notification_channel_playback), 2);
        notificationChannel.setShowBadge(false);
        this.a = notificationChannel;
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
