package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.app.k.d;
import com.appboy.o;

/* renamed from: Bg reason: default package */
/* compiled from: AppboyNotificationFactory */
public class Bg implements o {
    private static volatile Bg a;

    public static Bg a() {
        if (a == null) {
            synchronized (Bg.class) {
                if (a == null) {
                    a = new Bg();
                }
            }
        }
        return a;
    }

    public d b(Bf bf, Context context, Bundle bundle, Bundle bundle2) {
        d dVar = new d(context);
        dVar.a(true);
        Eg.h(dVar, bundle);
        Eg.b(dVar, bundle);
        Eg.g(dVar, bundle);
        Eg.a(context, dVar, bundle);
        int a2 = Eg.a(bf, dVar);
        boolean a3 = Eg.a(context, bf, dVar, bundle);
        Eg.e(dVar, bundle);
        if (VERSION.SDK_INT < 16) {
            RemoteViews a4 = Cg.a(context, bundle, a2, true ^ a3);
            if (a4 != null) {
                dVar.a(a4);
                return dVar;
            }
        }
        Eg.f(dVar, bundle);
        Eg.d(dVar, bundle);
        Eg.a(context, dVar, bundle, bundle2);
        Ag.a(context, dVar, bundle);
        Eg.a(bf, dVar, bundle);
        Eg.a(dVar, bundle);
        Eg.i(dVar, bundle);
        Eg.c(context, bf, dVar, bundle);
        Eg.b(context, bf, dVar, bundle);
        Eg.c(dVar, bundle);
        return dVar;
    }

    public Notification a(Bf bf, Context context, Bundle bundle, Bundle bundle2) {
        return b(bf, context, bundle, bundle2).a();
    }
}
