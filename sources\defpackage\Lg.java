package defpackage;

import android.content.Context;

/* renamed from: Lg reason: default package */
public class Lg {
    private static final String a = Hg.a(Lg.class);
    private static String b;

    public static String a(Context context) {
        String str = b;
        if (str != null) {
            return str;
        }
        b = context.getPackageName();
        return b;
    }
}
