package bo.app;

import android.util.Log;

public final class hr {
    private static volatile boolean a = false;
    private static volatile boolean b = true;

    public static void a(boolean z) {
        a = z;
    }

    public static void b(String str, Object... objArr) {
        a(4, null, str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(5, null, str, objArr);
    }

    public static void d(String str, Object... objArr) {
        a(6, null, str, objArr);
    }

    public static void a(String str, Object... objArr) {
        if (a) {
            a(3, null, str, objArr);
        }
    }

    public static void a(Throwable th) {
        a(6, th, null, new Object[0]);
    }

    private static void a(int i, Throwable th, String str, Object... objArr) {
        if (b) {
            if (objArr.length > 0) {
                str = String.format(str, objArr);
            }
            if (th != null) {
                if (str == null) {
                    str = th.getMessage();
                }
                str = String.format("%1$s\n%2$s", new Object[]{str, Log.getStackTraceString(th)});
            }
            Log.println(i, gj.a, str);
        }
    }
}
