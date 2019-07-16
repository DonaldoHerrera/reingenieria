package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: Cs reason: default package */
public final class Cs {
    private static volatile boolean a = (!a());

    public static boolean a() {
        return VERSION.SDK_INT >= 24;
    }

    @TargetApi(24)
    public static Context a(Context context) {
        if (context.isDeviceProtectedStorage()) {
            return context;
        }
        return context.createDeviceProtectedStorageContext();
    }
}
