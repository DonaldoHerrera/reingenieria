package defpackage;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;

@SuppressLint({"InlinedApi"})
/* renamed from: Nq reason: default package */
/* compiled from: NotificationUtil */
public final class Nq {
    public static void a(Context context, String str, int i, int i2) {
        if (C0471ar.a >= 26) {
            ((NotificationManager) context.getSystemService("notification")).createNotificationChannel(new NotificationChannel(str, context.getString(i), i2));
        }
    }
}
