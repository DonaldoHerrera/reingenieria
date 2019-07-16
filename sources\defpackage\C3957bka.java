package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: bka reason: default package and case insensitive filesystem */
/* compiled from: Groups.kt */
public final class C3957bka implements C4542dka {
    private final NotificationChannelGroup a;

    public C3957bka(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannelGroup("group_dev", context.getString(h.notification_channel_group_dev));
    }

    public NotificationChannelGroup a() {
        return this.a;
    }
}
