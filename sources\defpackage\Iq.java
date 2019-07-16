package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* renamed from: Iq reason: default package */
/* compiled from: Log */
public final class Iq {
    private static int a = 0;
    private static boolean b = true;

    public static void a(String str, String str2) {
        if (a == 0) {
            Log.d(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (!b) {
            d(str, a(str2, th));
        } else if (a <= 2) {
            Log.w(str, str2, th);
        }
    }

    public static void c(String str, String str2) {
        if (a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void d(String str, String str2) {
        if (a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (!b) {
            b(str, a(str2, th));
        } else if (a <= 3) {
            Log.e(str, str2, th);
        }
    }

    public static void b(String str, String str2) {
        if (a <= 3) {
            Log.e(str, str2);
        }
    }

    private static String a(String str, Throwable th) {
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (!TextUtils.isEmpty(message)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" - ");
            sb.append(message);
            str = sb.toString();
        }
        return str;
    }
}
