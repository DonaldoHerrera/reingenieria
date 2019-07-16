package defpackage;

import android.text.TextUtils;

/* renamed from: jH reason: default package and case insensitive filesystem */
public class C3067jH {
    public static void a() {
        if (!C3389zG.b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void a(C2161MG mg) {
        if (mg.equals(C2161MG.NONE)) {
            throw new IllegalArgumentException("Impression owner is none");
        }
    }

    public static void a(C2218PG pg) {
        if (pg.h()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void b(C2218PG pg) {
        if (pg.i()) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static void c(C2218PG pg) {
        h(pg);
        b(pg);
    }

    public static void d(C2218PG pg) {
        if (pg.k().c() != null) {
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public static void e(C2218PG pg) {
        if (pg.k().d() != null) {
            throw new IllegalStateException("VideoEvents already exists for AdSession");
        }
    }

    public static void f(C2218PG pg) {
        if (!pg.j()) {
            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
        }
    }

    public static void g(C2218PG pg) {
        if (!pg.l()) {
            throw new IllegalStateException("Cannot create VideoEvents for JavaScript AdSession");
        }
    }

    private static void h(C2218PG pg) {
        if (!pg.h()) {
            throw new IllegalStateException("AdSession is not started");
        }
    }
}
