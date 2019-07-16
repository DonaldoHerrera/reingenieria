package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: uYa reason: default package and case insensitive filesystem */
/* compiled from: Intrinsics */
public class C7471uYa {
    private C7471uYa() {
    }

    public static int a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static void a() {
        C7675xVa xva = new C7675xVa();
        a((T) xva);
        throw xva;
    }

    public static void b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        a(sb.toString());
        throw null;
    }

    private static void c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        a((T) illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void a(String str) {
        QVa qVa = new QVa(str);
        a((T) qVa);
        throw qVa;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            c(str);
            throw null;
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            a((T) illegalStateException);
            throw illegalStateException;
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static <T extends Throwable> T a(T t) {
        a(t, C7471uYa.class.getName());
        return t;
    }

    static <T extends Throwable> T a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }
}
