package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: vK reason: default package and case insensitive filesystem */
/* compiled from: AlphaUtils.kt */
public final class C3313vK {
    public static final Intent a(Context context) {
        C7471uYa.b(context, "context");
        String str = "Uri.parse(this)";
        String str2 = "android.intent.action.VIEW";
        if (C5203PHa.a(context)) {
            Uri parse = Uri.parse("market://details?id=com.soundcloud.android.alpha");
            C7471uYa.a((Object) parse, str);
            return new Intent(str2, parse);
        }
        Uri parse2 = Uri.parse("https://play.google.com/store/apps/details?id=com.soundcloud.android.alpha");
        C7471uYa.a((Object) parse2, str);
        return new Intent(str2, parse2);
    }

    public static final boolean b(Context context) {
        C7471uYa.b(context, "context");
        return C5203PHa.b(context, "com.soundcloud.android.alpha");
    }
}
