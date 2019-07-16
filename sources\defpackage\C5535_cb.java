package defpackage;

import java.util.List;

/* renamed from: _cb reason: default package and case insensitive filesystem */
/* compiled from: findClassInModule.kt */
public final class C5535_cb {
    public static final C5029Jcb a(C6450fdb fdb, C7280rnb rnb) {
        C7471uYa.b(fdb, "$this$findClassAcrossModuleDependencies");
        C7471uYa.b(rnb, "classId");
        C7349snb d = rnb.d();
        C7471uYa.a((Object) d, "classId.packageFqName");
        C7132pdb a = fdb.a(d);
        List d2 = rnb.e().d();
        C7471uYa.a((Object) d2, "classId.relativeClassName.pathSegments()");
        Eqb ha = a.ha();
        Object f = C7676xWa.f(d2);
        C7471uYa.a(f, "segments.first()");
        C5122Mcb b = ha.b((C7694xnb) f, Ffb.FROM_DESERIALIZATION);
        if (!(b instanceof C5029Jcb)) {
            b = null;
        }
        C5029Jcb jcb = (C5029Jcb) b;
        if (jcb == null) {
            return null;
        }
        for (C7694xnb xnb : d2.subList(1, d2.size())) {
            Eqb H = jcb.H();
            C7471uYa.a((Object) xnb, "name");
            C5122Mcb b2 = H.b(xnb, Ffb.FROM_DESERIALIZATION);
            if (!(b2 instanceof C5029Jcb)) {
                b2 = null;
            }
            jcb = (C5029Jcb) b2;
            if (jcb == null) {
                return null;
            }
        }
        return jcb;
    }

    public static final C4874Edb b(C6450fdb fdb, C7280rnb rnb) {
        C7471uYa.b(fdb, "$this$findTypeAliasAcrossModuleDependencies");
        C7471uYa.b(rnb, "classId");
        C7349snb d = rnb.d();
        C7471uYa.a((Object) d, "classId.packageFqName");
        C7132pdb a = fdb.a(d);
        List d2 = rnb.e().d();
        C7471uYa.a((Object) d2, "classId.relativeClassName.pathSegments()");
        int size = d2.size() - 1;
        Eqb ha = a.ha();
        Object f = C7676xWa.f(d2);
        C7471uYa.a(f, "segments.first()");
        C5122Mcb b = ha.b((C7694xnb) f, Ffb.FROM_DESERIALIZATION);
        if (size == 0) {
            if (!(b instanceof C4874Edb)) {
                b = null;
            }
            return (C4874Edb) b;
        }
        if (!(b instanceof C5029Jcb)) {
            b = null;
        }
        C5029Jcb jcb = (C5029Jcb) b;
        if (jcb == null) {
            return null;
        }
        for (C7694xnb xnb : d2.subList(1, size)) {
            Eqb H = jcb.H();
            C7471uYa.a((Object) xnb, "name");
            C5122Mcb b2 = H.b(xnb, Ffb.FROM_DESERIALIZATION);
            if (!(b2 instanceof C5029Jcb)) {
                b2 = null;
            }
            jcb = (C5029Jcb) b2;
            if (jcb == null) {
                return null;
            }
        }
        C7694xnb xnb2 = (C7694xnb) d2.get(size);
        Eqb J = jcb.J();
        C7471uYa.a((Object) xnb2, "lastName");
        C5122Mcb b3 = J.b(xnb2, Ffb.FROM_DESERIALIZATION);
        if (!(b3 instanceof C4874Edb)) {
            b3 = null;
        }
        return (C4874Edb) b3;
    }

    public static final C5029Jcb a(C6450fdb fdb, C7280rnb rnb, C6586hdb hdb) {
        C7471uYa.b(fdb, "$this$findNonGenericClassAcrossDependencies");
        C7471uYa.b(rnb, "classId");
        C7471uYa.b(hdb, "notFoundClasses");
        C5029Jcb a = a(fdb, rnb);
        if (a != null) {
            return a;
        }
        return hdb.a(rnb, Ywb.g(Ywb.d(Twb.a(rnb, (_Xa<? super T, ? extends T>) C5477Ycb.e), C5506Zcb.a)));
    }
}
