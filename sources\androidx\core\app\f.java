package androidx.core.app;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: BundleCompat */
public final class f {

    /* compiled from: BundleCompat */
    static class a {
        private static Method a;
        private static boolean b;
        private static Method c;
        private static boolean d;

        public static IBinder a(Bundle bundle, String str) {
            String str2 = "BundleCompatBaseImpl";
            if (!b) {
                try {
                    a = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve getIBinder method", e);
                }
                b = true;
            }
            Method method = a;
            if (method != null) {
                try {
                    return (IBinder) method.invoke(bundle, new Object[]{str});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke getIBinder via reflection", e2);
                    a = null;
                }
            }
            return null;
        }

        public static void a(Bundle bundle, String str, IBinder iBinder) {
            String str2 = "BundleCompatBaseImpl";
            if (!d) {
                try {
                    c = Bundle.class.getMethod("putIBinder", new Class[]{String.class, IBinder.class});
                    c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str2, "Failed to retrieve putIBinder method", e);
                }
                d = true;
            }
            Method method = c;
            if (method != null) {
                try {
                    method.invoke(bundle, new Object[]{str, iBinder});
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(str2, "Failed to invoke putIBinder via reflection", e2);
                    c = null;
                }
            }
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        if (VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.a(bundle, str, iBinder);
        }
    }
}
