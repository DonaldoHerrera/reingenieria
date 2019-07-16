package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: XH reason: default package and case insensitive filesystem */
/* compiled from: AndroidThreeTen */
public final class C2368XH {
    private static final AtomicBoolean a = new AtomicBoolean();

    public static void a(Application application) {
        a((Context) application);
    }

    public static void a(Context context) {
        a(context, "org/threeten/bp/TZDB.dat");
    }

    public static void a(Context context, String str) {
        if (!a.getAndSet(true)) {
            PDb.a(new C2386YH(context, str));
        }
    }
}
