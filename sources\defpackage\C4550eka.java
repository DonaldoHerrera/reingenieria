package defpackage;

import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: eka reason: default package and case insensitive filesystem */
/* compiled from: Groups.kt */
public final class C4550eka implements C4542dka {
    private final NotificationChannelGroup a;

    public C4550eka(Context context) {
        C7471uYa.b(context, "context");
        this.a = new NotificationChannelGroup("group_playback", context.getString(h.notification_channel_group_playback));
    }

    public NotificationChannelGroup a() {
        return this.a;
    }
}
