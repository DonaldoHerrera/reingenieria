package com.google.android.gms.internal.firebase-perf;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-perf.tc reason: case insensitive filesystem */
final class C0894tc {
    private static final Class<?> a = d();
    private static final Kc<?, ?> b = a(false);
    private static final Kc<?, ?> c = a(true);
    private static final Kc<?, ?> d = new Mc();

    public static void a(Class<?> cls) {
        if (!C0889sb.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static void b(int i, List<Float> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.n(i, list, z);
        }
    }

    public static void c(int i, List<Long> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.b(i, list, z);
        }
    }

    public static void d(int i, List<Long> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.l(i, list, z);
        }
    }

    public static void e(int i, List<Long> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.d(i, list, z);
        }
    }

    public static void f(int i, List<Long> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.k(i, list, z);
        }
    }

    public static void g(int i, List<Long> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.h(i, list, z);
        }
    }

    public static void h(int i, List<Integer> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.a(i, list, z);
        }
    }

    public static void i(int i, List<Integer> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.i(i, list, z);
        }
    }

    public static void j(int i, List<Integer> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.e(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.c(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.j(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.g(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.f(i, list, z);
        }
    }

    public static void b(int i, List<Oa> list, dd ddVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.a(i, list);
        }
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Sb) {
            Sb sb = (Sb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.f(sb.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0901vb) {
            C0901vb vbVar = (C0901vb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.e(vbVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0901vb) {
            C0901vb vbVar = (C0901vb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.m(vbVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0901vb) {
            C0901vb vbVar = (C0901vb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.a(vbVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0901vb) {
            C0901vb vbVar = (C0901vb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.b(vbVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.b(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void a(int i, List<Double> list, dd ddVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.m(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0838fb.i(i, 0);
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0838fb.g(i, 0);
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * C0838fb.b(i, true);
    }

    public static void b(int i, List<?> list, dd ddVar, C0886rc rcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.a(i, list, rcVar);
        }
    }

    public static void a(int i, List<String> list, dd ddVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.b(i, list);
        }
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Sb) {
            Sb sb = (Sb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.e(sb.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static void a(int i, List<?> list, dd ddVar, C0886rc rcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ddVar.b(i, list, rcVar);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * C0838fb.l(i));
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * C0838fb.l(i));
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * C0838fb.l(i));
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * C0838fb.l(i));
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * C0838fb.l(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Sb) {
            Sb sb = (Sb) list;
            i = 0;
            while (i2 < size) {
                i += C0838fb.d(sb.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C0838fb.d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static Kc<?, ?> c() {
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

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * C0838fb.l(i));
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * C0838fb.l(i));
    }

    static int b(int i, List<Oa> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = size * C0838fb.l(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            l += C0838fb.b((Oa) list.get(i2));
        }
        return l;
    }

    static int a(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int l = C0838fb.l(i) * size;
        if (list instanceof Lb) {
            Lb lb = (Lb) list;
            while (i4 < size) {
                Object j = lb.j(i4);
                if (j instanceof Oa) {
                    i3 = C0838fb.b((Oa) j);
                } else {
                    i3 = C0838fb.b((String) j);
                }
                l += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof Oa) {
                    i2 = C0838fb.b((Oa) obj);
                } else {
                    i2 = C0838fb.b((String) obj);
                }
                l += i2;
                i4++;
            }
        }
        return l;
    }

    static int b(int i, List<C0835ec> list, C0886rc rcVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C0838fb.c(i, (C0835ec) list.get(i3), rcVar);
        }
        return i2;
    }

    public static Kc<?, ?> b() {
        return c;
    }

    static int a(int i, Object obj, C0886rc rcVar) {
        if (obj instanceof Jb) {
            return C0838fb.a(i, (Jb) obj);
        }
        return C0838fb.b(i, (C0835ec) obj, rcVar);
    }

    static int a(int i, List<?> list, C0886rc rcVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = C0838fb.l(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof Jb) {
                i2 = C0838fb.a((Jb) obj);
            } else {
                i2 = C0838fb.a((C0835ec) obj, rcVar);
            }
            l += i2;
        }
        return l;
    }

    public static Kc<?, ?> a() {
        return b;
    }

    private static Kc<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (Kc) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <T> void a(Xb xb, T t, T t2, long j) {
        Qc.a((Object) t, j, xb.a(Qc.f(t, j), Qc.f(t2, j)));
    }

    static <T, FT extends C0878pb<FT>> void a(C0850ib<FT> ibVar, T t, T t2) {
        C0870nb a2 = ibVar.a((Object) t2);
        if (!a2.b.isEmpty()) {
            ibVar.b(t).a(a2);
        }
    }

    static <T, UT, UB> void a(Kc<UT, UB> kc, T t, T t2) {
        kc.a((Object) t, kc.b(kc.c(t), kc.c(t2)));
    }
}
