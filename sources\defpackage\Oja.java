package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.core.content.a;

/* renamed from: Oja reason: default package */
/* compiled from: NotificationChannelController.kt */
public final class Oja {
    public static final Oja a = new Oja();

    private Oja() {
    }

    @NXa
    public static final void a(Context context) {
        C7471uYa.b(context, "context");
        if (a.a()) {
            a.c(context);
        }
    }

    @NXa
    public static final void b(Context context) {
        C7471uYa.b(context, "context");
        if (a.a()) {
            Object a2 = a.a(context, NotificationManager.class);
            if (a2 != null) {
                NotificationManager notificationManager = (NotificationManager) a2;
                Qja a3 = Pja.a(new Ija(context));
                notificationManager.createNotificationChannelGroups(a3.b());
                notificationManager.createNotificationChannels(a3.a());
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    private final void c(Context context) {
        Object a2 = a.a(context, NotificationManager.class);
        if (a2 != null) {
            NotificationManager notificationManager = (NotificationManager) a2;
            Qja d = d(context);
            notificationManager.createNotificationChannelGroups(d.b());
            notificationManager.createNotificationChannels(d.a());
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Qja d(Context context) {
        return Pja.a(new Nja(context));
    }

    private final boolean a() {
        return VERSION.SDK_INT >= 26;
    }
}
