package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;

/* renamed from: fh reason: default package and case insensitive filesystem */
/* compiled from: AppMeasurementEventLogger */
public class C1295fh implements C1511mh {
    private final Method a;
    private final Object b;

    public C1295fh(Object obj, Method method) {
        this.b = obj;
        this.a = method;
    }

    public static C1511mh a(Context context) {
        Class b2 = b(context);
        if (b2 == null) {
            return null;
        }
        Object a2 = a(context, b2);
        if (a2 == null) {
            return null;
        }
        Method b3 = b(context, b2);
        if (b3 == null) {
            return null;
        }
        return new C1295fh(a2, b3);
    }

    private static Class b(Context context) {
        try {
            return context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement");
        } catch (Exception unused) {
            return null;
        }
    }

    private static Method b(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("logEventInternal", new Class[]{String.class, String.class, Bundle.class});
        } catch (Exception unused) {
            return null;
        }
    }

    private static Object a(Context context, Class cls) {
        try {
            return cls.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(cls, new Object[]{context});
        } catch (Exception unused) {
            return null;
        }
    }

    public void a(String str, Bundle bundle) {
        a("fab", str, bundle);
    }

    public void a(String str, String str2, Bundle bundle) {
        try {
            this.a.invoke(this.b, new Object[]{str, str2, bundle});
        } catch (Exception unused) {
        }
    }
}
