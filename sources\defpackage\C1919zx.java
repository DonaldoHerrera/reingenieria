package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: zx reason: default package and case insensitive filesystem */
final class C1919zx {
    private static final Class<?> a = d();
    private static final Nx<?, ?> b = a(false);
    private static final Nx<?, ?> c = a(true);
    private static final Nx<?, ?> d = new Px();

    public static void a(Class<?> cls) {
        if (!C0197Cw.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static Nx<?, ?> b() {
        return c;
    }

    public static Nx<?, ?> c() {
        return d;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Nx<?, ?> a() {
        return b;
    }

    private static Nx<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (Nx) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void a(C0508bx bxVar, T t, T t2, long j) {
        Ux.a((Object) t, j, bxVar.a(Ux.f(t, j), Ux.f(t2, j)));
    }

    static <T, FT extends C1918zw<FT>> void a(C1798vw<FT> vwVar, T t, T t2) {
        C1858xw a2 = vwVar.a((Object) t2);
        if (!a2.b.isEmpty()) {
            vwVar.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(Nx<UT, UB> nx, T t, T t2) {
        nx.a((Object) t, nx.c(nx.a((Object) t), nx.a((Object) t2)));
    }

    static <UT, UB> UB a(int i, List<Integer> list, C0217Iw iw, UB ub, Nx<UT, UB> nx) {
        UB ub2;
        if (iw == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!iw.a(intValue)) {
                        ub = a(i, intValue, ub2, nx);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (iw.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, nx);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    static <UT, UB> UB a(int i, int i2, UB ub, Nx<UT, UB> nx) {
        if (ub == null) {
            ub = nx.a();
        }
        nx.a(ub, i, (long) i2);
        return ub;
    }
}
