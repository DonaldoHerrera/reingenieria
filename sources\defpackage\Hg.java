package defpackage;

import android.util.Log;
import bo.app.dz;

/* renamed from: Hg reason: default package */
public class Hg {
    private static final String a = a(Hg.class);
    private static boolean b;
    private static int c = 4;

    public static synchronized void a() {
        synchronized (Hg.class) {
            String a2 = dz.a("log.tag.APPBOY", "");
            if (!Ng.d(a2) && a2.trim().equalsIgnoreCase("verbose")) {
                b = true;
                c = 2;
                String str = a;
                StringBuilder sb = new StringBuilder();
                sb.append("AppboyLogger log level set to ");
                sb.append(a2);
                sb.append(" via device system property. Note that subsequent calls to AppboyLogger.setLogLevel() will have no effect.");
                c(str, sb.toString());
            }
        }
    }

    public static int b(String str, String str2) {
        if (c <= 6) {
            return Log.e(str, str2);
        }
        return 0;
    }

    public static int c(String str, String str2) {
        if (c <= 4) {
            return Log.i(str, str2);
        }
        return 0;
    }

    public static int d(String str, String str2) {
        if (c <= 2) {
            return Log.v(str, str2);
        }
        return 0;
    }

    public static int e(String str, String str2) {
        if (c <= 5) {
            return Log.w(str, str2);
        }
        return 0;
    }

    public static int b(String str, String str2, Throwable th) {
        if (c <= 6) {
            return Log.e(str, str2, th);
        }
        return 0;
    }

    public static int c(String str, String str2, Throwable th) {
        if (c <= 4) {
            return Log.i(str, str2, th);
        }
        return 0;
    }

    public static int d(String str, String str2, Throwable th) {
        if (c <= 5) {
            return Log.w(str, str2, th);
        }
        return 0;
    }

    public static int a(String str, String str2) {
        if (c <= 3) {
            return Log.d(str, str2);
        }
        return 0;
    }

    public static int a(String str, String str2, Throwable th) {
        if (c <= 3) {
            return Log.d(str, str2, th);
        }
        return 0;
    }

    public static String a(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("Appboy v2.1.4 .");
        sb.append(cls.getName());
        return sb.toString();
    }
}
