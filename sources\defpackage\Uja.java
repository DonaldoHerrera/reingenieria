package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;

/* renamed from: Uja reason: default package */
/* compiled from: Channels.kt */
public abstract class Uja {
    public final NotificationChannel a() {
        NotificationChannelGroup c = c();
        if (c != null) {
            b().setGroup(c.getId());
        }
        return b();
    }

    public abstract void a(NotificationChannelGroup notificationChannelGroup);

    public abstract NotificationChannel b();

    public abstract NotificationChannelGroup c();
}
