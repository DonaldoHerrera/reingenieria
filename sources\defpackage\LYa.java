package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: LYa reason: default package */
/* compiled from: TypeIntrinsics */
public class LYa {
    private static <T extends Throwable> T a(T t) {
        C7471uYa.a(t, LYa.class.getName());
        return t;
    }

    public static Set b(Object obj) {
        if (!(obj instanceof MYa)) {
            return d(obj);
        }
        a(obj, "kotlin.collections.MutableSet");
        throw null;
    }

    public static Collection c(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            a(e);
            throw null;
        }
    }

    public static Set d(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            a(e);
            throw null;
        }
    }

    public static int e(Object obj) {
        if (obj instanceof C7333sYa) {
            return ((C7333sYa) obj).getArity();
        }
        if (obj instanceof PXa) {
            return 0;
        }
        if (obj instanceof _Xa) {
            return 1;
        }
        if (obj instanceof C6308dYa) {
            return 2;
        }
        if (obj instanceof C6376eYa) {
            return 3;
        }
        if (obj instanceof C6444fYa) {
            return 4;
        }
        if (obj instanceof C6512gYa) {
            return 5;
        }
        if (obj instanceof C6580hYa) {
            return 6;
        }
        if (obj instanceof C6648iYa) {
            return 7;
        }
        if (obj instanceof C6716jYa) {
            return 8;
        }
        if (obj instanceof C6784kYa) {
            return 9;
        }
        if (obj instanceof QXa) {
            return 10;
        }
        if (obj instanceof RXa) {
            return 11;
        }
        if (obj instanceof SXa) {
            return 12;
        }
        if (obj instanceof TXa) {
            return 13;
        }
        if (obj instanceof UXa) {
            return 14;
        }
        if (obj instanceof VXa) {
            return 15;
        }
        if (obj instanceof WXa) {
            return 16;
        }
        if (obj instanceof XXa) {
            return 17;
        }
        if (obj instanceof YXa) {
            return 18;
        }
        if (obj instanceof ZXa) {
            return 19;
        }
        if (obj instanceof C5576aYa) {
            return 20;
        }
        if (obj instanceof C5644bYa) {
            return 21;
        }
        return obj instanceof C5712cYa ? 22 : -1;
    }

    public static void a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        a(sb.toString());
        throw null;
    }

    public static void a(String str) {
        a(new ClassCastException(str));
        throw null;
    }

    public static boolean b(Object obj, int i) {
        return (obj instanceof C7537vVa) && e(obj) == i;
    }

    public static ClassCastException a(ClassCastException classCastException) {
        a((T) classCastException);
        throw classCastException;
    }

    public static Collection a(Object obj) {
        if (!(obj instanceof MYa) || (obj instanceof NYa)) {
            return c(obj);
        }
        a(obj, "kotlin.collections.MutableCollection");
        throw null;
    }

    public static Object a(Object obj, int i) {
        if (obj == null || b(obj, i)) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("kotlin.jvm.functions.Function");
        sb.append(i);
        a(obj, sb.toString());
        throw null;
    }
}
