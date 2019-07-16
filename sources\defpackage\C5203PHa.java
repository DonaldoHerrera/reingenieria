package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;

/* renamed from: PHa reason: default package and case insensitive filesystem */
/* compiled from: PlayStoreUtils.kt */
public final class C5203PHa {
    public static final boolean a(Context context) {
        C7471uYa.b(context, "context");
        return b(context, "com.android.vending");
    }

    public static final boolean b(Context context, String str) {
        C7471uYa.b(context, "context");
        C7471uYa.b(str, "packageName");
        try {
            context.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    public static final Intent a(Context context, String str) {
        C7471uYa.b(context, "context");
        C7471uYa.b(str, "packageName");
        return context.getPackageManager().getLaunchIntentForPackage(str);
    }
}
