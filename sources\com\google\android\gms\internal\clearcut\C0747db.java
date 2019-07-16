package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.db reason: case insensitive filesystem */
final class C0747db {
    private static final Class<?> a = d();
    private static final C0794tb<?, ?> b = a(false);
    private static final C0794tb<?, ?> c = a(true);
    private static final C0794tb<?, ?> d = new C0800vb();

    static int a(int i, Object obj, C0741bb bbVar) {
        return obj instanceof C0793ta ? M.a(i, (C0793ta) obj) : M.b(i, (La) obj, bbVar);
    }

    static int a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = M.e(i) * size;
        if (list instanceof C0799va) {
            C0799va vaVar = (C0799va) list;
            while (i2 < size) {
                Object j = vaVar.j(i2);
                e += j instanceof A ? M.a((A) j) : M.a((String) j);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof A ? M.a((A) obj) : M.a((String) obj);
                i2++;
            }
        }
        return e;
    }

    static int a(int i, List<?> list, C0741bb bbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = M.e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof C0793ta ? M.a((C0793ta) obj) : M.a((La) obj, bbVar);
        }
        return e;
    }

    static int a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * M.e(i));
    }

    static int a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Aa) {
            Aa aa = (Aa) list;
            i = 0;
            while (i2 < size) {
                i += M.d(aa.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static C0794tb<?, ?> a() {
        return b;
    }

    private static C0794tb<?, ?> a(boolean z) {
        try {
            Class e = e();
            if (e == null) {
                return null;
            }
            return (C0794tb) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    private static <UT, UB> UB a(int i, int i2, UB ub, C0794tb<UT, UB> tbVar) {
        if (ub == null) {
            ub = tbVar.a();
        }
        tbVar.a(ub, i, (long) i2);
        return ub;
    }

    static <UT, UB> UB a(int i, List<Integer> list, C0767ka<?> kaVar, UB ub, C0794tb<UT, UB> tbVar) {
        UB ub2;
        if (kaVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (kaVar.a(intValue) == null) {
                        ub = a(i, intValue, ub2, tbVar);
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
                if (kaVar.a(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = a(i, intValue2, ub2, tbVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    public static void a(int i, List<String> list, Ob ob) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.b(i, list);
        }
    }

    public static void a(int i, List<?> list, Ob ob, C0741bb bbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.b(i, list, bbVar);
        }
    }

    public static void a(int i, List<Double> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.m(i, list, z);
        }
    }

    static <T> void a(Ga ga, T t, T t2, long j) {
        Ab.a((Object) t, j, ga.a(Ab.f(t, j), Ab.f(t2, j)));
    }

    static <T, FT extends C0737aa<FT>> void a(T<FT> t, T t2, T t3) {
        X a2 = t.a((Object) t3);
        if (!a2.b()) {
            t.b(t2).a(a2);
        }
    }

    static <T, UT, UB> void a(C0794tb<UT, UB> tbVar, T t, T t2) {
        tbVar.a((Object) t, tbVar.c(tbVar.c(t), tbVar.c(t2)));
    }

    public static void a(Class<?> cls) {
        if (!C0755ga.class.isAssignableFrom(cls)) {
            Class<?> cls2 = a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    public static boolean a(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int b(int i, List<A> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * M.e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += M.a((A) list.get(i2));
        }
        return e;
    }

    static int b(int i, List<La> list, C0741bb bbVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += M.c(i, (La) list.get(i3), bbVar);
        }
        return i2;
    }

    static int b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return b(list) + (size * M.e(i));
    }

    static int b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Aa) {
            Aa aa = (Aa) list;
            i = 0;
            while (i2 < size) {
                i += M.e(aa.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static C0794tb<?, ?> b() {
        return c;
    }

    public static void b(int i, List<A> list, Ob ob) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.a(i, list);
        }
    }

    public static void b(int i, List<?> list, Ob ob, C0741bb bbVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.a(i, list, bbVar);
        }
    }

    public static void b(int i, List<Float> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.n(i, list, z);
        }
    }

    static int c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return c(list) + (size * M.e(i));
    }

    static int c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Aa) {
            Aa aa = (Aa) list;
            i = 0;
            while (i2 < size) {
                i += M.f(aa.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static C0794tb<?, ?> c() {
        return d;
    }

    public static void c(int i, List<Long> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.b(i, list, z);
        }
    }

    static int d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return d(list) + (size * M.e(i));
    }

    static int d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0758ha) {
            C0758ha haVar = (C0758ha) list;
            i = 0;
            while (i2 < size) {
                i += M.k(haVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void d(int i, List<Long> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.l(i, list, z);
        }
    }

    static int e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return e(list) + (size * M.e(i));
    }

    static int e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0758ha) {
            C0758ha haVar = (C0758ha) list;
            i = 0;
            while (i2 < size) {
                i += M.f(haVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    private static Class<?> e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void e(int i, List<Long> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.d(i, list, z);
        }
    }

    static int f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return f(list) + (size * M.e(i));
    }

    static int f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0758ha) {
            C0758ha haVar = (C0758ha) list;
            i = 0;
            while (i2 < size) {
                i += M.g(haVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void f(int i, List<Long> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.k(i, list, z);
        }
    }

    static int g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return g(list) + (size * M.e(i));
    }

    static int g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C0758ha) {
            C0758ha haVar = (C0758ha) list;
            i = 0;
            while (i2 < size) {
                i += M.h(haVar.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + M.h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static void g(int i, List<Long> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.h(i, list, z);
        }
    }

    static int h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * M.i(i, 0);
    }

    static int h(List<?> list) {
        return list.size() << 2;
    }

    public static void h(int i, List<Integer> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.a(i, list, z);
        }
    }

    static int i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * M.g(i, 0);
    }

    static int i(List<?> list) {
        return list.size() << 3;
    }

    public static void i(int i, List<Integer> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.i(i, list, z);
        }
    }

    static int j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * M.b(i, true);
    }

    static int j(List<?> list) {
        return list.size();
    }

    public static void j(int i, List<Integer> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.e(i, list, z);
        }
    }

    public static void k(int i, List<Integer> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.c(i, list, z);
        }
    }

    public static void l(int i, List<Integer> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.j(i, list, z);
        }
    }

    public static void m(int i, List<Integer> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.g(i, list, z);
        }
    }

    public static void n(int i, List<Boolean> list, Ob ob, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ob.f(i, list, z);
        }
    }
}
