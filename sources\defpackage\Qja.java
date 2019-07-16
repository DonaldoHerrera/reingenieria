package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Qja reason: default package */
/* compiled from: NotificationChannelDsl.kt */
public final class Qja {
    private final List<NotificationChannelGroup> a = new ArrayList();
    private final List<NotificationChannel> b = new ArrayList();

    public final List<NotificationChannel> a() {
        return C7676xWa.q(this.b);
    }

    public final List<NotificationChannelGroup> b() {
        return C7676xWa.q(this.a);
    }

    public final void a(NotificationChannelGroup notificationChannelGroup) {
        C7471uYa.b(notificationChannelGroup, "group");
        this.a.add(notificationChannelGroup);
    }

    public final void a(NotificationChannel notificationChannel) {
        C7471uYa.b(notificationChannel, "channel");
        this.b.add(notificationChannel);
    }
}
