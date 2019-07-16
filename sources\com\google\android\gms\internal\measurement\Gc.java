package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

final class Gc {
    private static final Class<?> a = d();
    private static final Xc<?, ?> b = a(false);
    private static final Xc<?, ?> c = a(true);
    private static final Xc<?, ?> d = new Zc();

    public static void a(Class<?> cls) {
        if (!Gb.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void b(int i, List<Float> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.n(i, list, z);
        }
    }

    public static void c(int i, List<Long> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.b(i, list, z);
        }
    }

    public static void d(int i, List<Long> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.l(i, list, z);
        }
    }

    public static void e(int i, List<Long> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.d(i, list, z);
        }
    }

    public static void f(int i, List<Long> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.k(i, list, z);
        }
    }

    public static void g(int i, List<Long> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.h(i, list, z);
        }
    }

    public static void h(int i, List<Integer> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.a(i, list, z);
        }
    }

    public static void i(int i, List<Integer> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.i(i, list, z);
        }
    }

    public static void j(int i, List<Integer> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.e(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.c(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.j(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.g(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.f(i, list, z);
        }
    }

    public static void b(int i, List<Ya> list, C1050ud udVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.a(i, list);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * C1007nb.e(i));
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return h(list) + (size * C1007nb.e(i));
    }

    static int e(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.d(ecVar.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int f(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.e(ecVar.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int g(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0950ec) {
            C0950ec ecVar = (C0950ec) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.f(ecVar.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int h(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.k(jb.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int i(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.f(jb.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int j(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.g(jb.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void a(int i, List<Double> list, C1050ud udVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.m(i, list, z);
        }
    }

    public static void b(int i, List<?> list, C1050ud udVar, Ec ec) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.b(i, list, ec);
        }
    }

    public static void a(int i, List<String> list, C1050ud udVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.b(i, list);
        }
    }

    static int c(List<?> list) {
        return list.size() << 3;
    }

    static int d(List<?> list) {
        return list.size();
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * C1007nb.e(i));
    }

    public static Xc<?, ?> c() {
        return d;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void a(int i, List<?> list, C1050ud udVar, Ec ec) throws IOException {
        if (list != null && !list.isEmpty()) {
            udVar.a(i, list, ec);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return i(list) + (size * C1007nb.e(i));
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * C1007nb.e(i));
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a(list) + (size * C1007nb.e(i));
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1007nb.i(i, 0);
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1007nb.g(i, 0);
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C1007nb.b(i, true);
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * C1007nb.e(i));
    }

    static int b(List<?> list) {
        return list.size() << 2;
    }

    static int b(int i, List<Ya> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C1007nb.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C1007nb.a((Ya) list.get(i2));
        }
        return e;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static int a(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Jb) {
            Jb jb = (Jb) list;
            i = 0;
            while (i2 < size) {
                i += C1007nb.h(jb.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C1007nb.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int b(int i, List<C1026qc> list, Ec ec) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C1007nb.c(i, (C1026qc) list.get(i3), ec);
        }
        return i2;
    }

    public static Xc<?, ?> b() {
        return c;
    }

    static int a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C1007nb.e(i) * size;
        if (list instanceof Yb) {
            Yb yb = (Yb) list;
            while (i4 < size) {
                Object l = yb.l(i4);
                if (l instanceof Ya) {
                    i3 = C1007nb.a((Ya) l);
                } else {
                    i3 = C1007nb.a((String) l);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof Ya) {
                    i2 = C1007nb.a((Ya) obj);
                } else {
                    i2 = C1007nb.a((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    static int a(int i, Object obj, Ec ec) {
        if (obj instanceof Wb) {
            return C1007nb.a(i, (Wb) obj);
        }
        return C1007nb.b(i, (C1026qc) obj, ec);
    }

    static int a(int i, List<?> list, Ec ec) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C1007nb.e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof Wb) {
                i2 = C1007nb.a((Wb) obj);
            } else {
                i2 = C1007nb.a((C1026qc) obj, ec);
            }
            e += i2;
        }
        return e;
    }

    public static Xc<?, ?> a() {
        return b;
    }

    private static Xc<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (Xc) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void a(C0984jc jcVar, T t, T t2, long j) {
        C0937cd.a((Object) t, j, jcVar.a(C0937cd.f(t, j), C0937cd.f(t2, j)));
    }

    static <T, FT extends C1072yb<FT>> void a(C1054vb<FT> vbVar, T t, T t2) {
        C1060wb a2 = vbVar.a((Object) t2);
        if (!a2.b.isEmpty()) {
            vbVar.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(Xc<UT, UB> xc, T t, T t2) {
        xc.a((Object) t, xc.c(xc.d(t), xc.d(t2)));
    }

    static <UT, UB> UB a(int i, List<Integer> list, Nb nb, UB ub, Xc<UT, UB> xc) {
        UB ub2;
        if (nb == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (!nb.a(intValue)) {
                        ub = a(i, intValue, ub2, xc);
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
                if (nb.a(intValue2)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, xc);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    static <UT, UB> UB a(int i, int i2, UB ub, Xc<UT, UB> xc) {
        if (ub == null) {
            ub = xc.a();
        }
        xc.a(ub, i, (long) i2);
        return ub;
    }
}
