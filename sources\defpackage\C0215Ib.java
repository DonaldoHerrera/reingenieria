package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* renamed from: Ib reason: default package and case insensitive filesystem */
/* compiled from: ICUCompat */
public final class C0215Ib {
    private static Method a;
    private static Method b;

    static {
        String str = "addLikelySubtags";
        if (VERSION.SDK_INT >= 21) {
            try {
                b = Class.forName("libcore.icu.ICU").getMethod(str, new Class[]{Locale.class});
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        } else {
            try {
                Class cls = Class.forName("libcore.icu.ICU");
                if (cls != null) {
                    a = cls.getMethod("getScript", new Class[]{String.class});
                    b = cls.getMethod(str, new Class[]{String.class});
                }
            } catch (Exception e2) {
                a = null;
                b = null;
                Log.w("ICUCompat", e2);
            }
        }
    }

    public static String a(Locale locale) {
        String str = "ICUCompat";
        if (VERSION.SDK_INT >= 21) {
            try {
                return ((Locale) b.invoke(null, new Object[]{locale})).getScript();
            } catch (InvocationTargetException e) {
                Log.w(str, e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w(str, e2);
                return locale.getScript();
            }
        } else {
            String b2 = b(locale);
            if (b2 != null) {
                return a(b2);
            }
            return null;
        }
    }

    private static String b(Locale locale) {
        String str = "ICUCompat";
        String locale2 = locale.toString();
        try {
            if (b != null) {
                return (String) b.invoke(null, new Object[]{locale2});
            }
        } catch (IllegalAccessException e) {
            Log.w(str, e);
        } catch (InvocationTargetException e2) {
            Log.w(str, e2);
        }
        return locale2;
    }

    private static String a(String str) {
        String str2 = "ICUCompat";
        try {
            if (a != null) {
                return (String) a.invoke(null, new Object[]{str});
            }
        } catch (IllegalAccessException e) {
            Log.w(str2, e);
        } catch (InvocationTargetException e2) {
            Log.w(str2, e2);
        }
        return null;
    }
}
