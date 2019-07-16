package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: cka reason: default package and case insensitive filesystem */
/* compiled from: Groups.kt */
public final class C3965cka implements C4542dka {
    private final NotificationChannelGroup a;

    public C3965cka(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannelGroup("group_go", context.getString(h.notification_channel_group_go));
    }

    public NotificationChannelGroup a() {
        return this.a;
    }
}
