package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Idb reason: default package and case insensitive filesystem */
/* compiled from: typeParameterUtils.kt */
public final class C4998Idb {
    public static final List<C4905Fdb> a(C5152Ncb ncb) {
        List list;
        Object obj;
        C7471uYa.b(ncb, "$this$computeConstructorTypeParameters");
        List<C4905Fdb> B = ncb.B();
        String str = "declaredTypeParameters";
        C7471uYa.a((Object) B, str);
        if (!ncb.D() && !(ncb.e() instanceof C4904Fcb)) {
            return B;
        }
        List g = Ywb.g(Ywb.c(Ywb.f(C7148pqb.f(ncb), C4936Gdb.a), (_Xa) C4967Hdb.a));
        Iterator it = C7148pqb.f(ncb).iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj instanceof C5029Jcb) {
                break;
            }
        }
        C5029Jcb jcb = (C5029Jcb) obj;
        if (jcb != null) {
            Ptb Q = jcb.Q();
            if (Q != null) {
                list = Q.getParameters();
            }
        }
        if (list == null) {
            list = C6918mWa.a();
        }
        if (!g.isEmpty() || !list.isEmpty()) {
            List<C4905Fdb> c = C7676xWa.c((Collection) g, (Iterable) list);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) c, 10));
            for (C4905Fdb fdb : c) {
                C7471uYa.a((Object) fdb, "it");
                arrayList.add(a(fdb, (C5272Rcb) ncb, B.size()));
            }
            return C7676xWa.c((Collection) B, (Iterable) arrayList);
        }
        List<C4905Fdb> B2 = ncb.B();
        C7471uYa.a((Object) B2, str);
        return B2;
    }

    private static final C4966Hcb a(C4905Fdb fdb, C5272Rcb rcb, int i) {
        return new C4966Hcb(fdb, rcb, i);
    }

    public static final C7270rdb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$buildPossiblyInnerType");
        C5122Mcb c = xtb.za().c();
        if (!(c instanceof C5152Ncb)) {
            c = null;
        }
        return a(xtb, (C5152Ncb) c, 0);
    }

    private static final C7270rdb a(C7706xtb xtb, C5152Ncb ncb, int i) {
        C5152Ncb ncb2 = null;
        if (ncb == null || C7154ptb.a((C5272Rcb) ncb)) {
            return null;
        }
        int size = ncb.B().size() + i;
        if (!ncb.D()) {
            boolean z = size == xtb.ya().size() || C6531gpb.p(ncb);
            if (!TVa.a || z) {
                return new C7270rdb(ncb, xtb.ya().subList(i, xtb.ya().size()), null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xtb.ya().size() - size);
            sb.append(" trailing arguments were found in ");
            sb.append(xtb);
            sb.append(" type");
            throw new AssertionError(sb.toString());
        }
        List subList = xtb.ya().subList(i, size);
        C5272Rcb e = ncb.e();
        if (e instanceof C5152Ncb) {
            ncb2 = e;
        }
        return new C7270rdb(ncb, subList, a(xtb, ncb2, size));
    }
}
