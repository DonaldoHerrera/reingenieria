package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: aka reason: default package and case insensitive filesystem */
/* compiled from: Groups.kt */
public final class C3949aka implements C4542dka {
    private final NotificationChannelGroup a;

    public C3949aka(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannelGroup("group_account", context.getString(h.notification_channel_group_account));
    }

    public NotificationChannelGroup a() {
        return this.a;
    }
}
