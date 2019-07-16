package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: fka reason: default package and case insensitive filesystem */
/* compiled from: Groups.kt */
public final class C4558fka implements C4542dka {
    private final NotificationChannelGroup a;

    public C4558fka(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannelGroup("group_record", context.getString(h.notification_channel_group_record));
    }

    public NotificationChannelGroup a() {
        return this.a;
    }
}
