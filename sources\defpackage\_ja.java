package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* renamed from: _ja reason: default package */
/* compiled from: Channels.kt */
public final class _ja extends Uja {
    private final NotificationChannel a = new NotificationChannel("channel_upload", this.c.getString(h.notification_channel_upload), 2);
    private NotificationChannelGroup b;
    private final Context c;

    public _ja(Context context) {
        C7471uYa.b(context, "context");
        this.c = context;
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

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.c, (java.lang.Object) ((defpackage._ja) r2).c) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof _ja) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Context context = this.c;
        if (context != null) {
            return context.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UploadChannel(context=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
