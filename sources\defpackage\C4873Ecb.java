package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Ecb reason: default package and case insensitive filesystem */
/* compiled from: mappingUtil.kt */
public final class C4873Ecb {
    public static final Rtb a(C5029Jcb jcb, C5029Jcb jcb2) {
        C7471uYa.b(jcb, "from");
        C7471uYa.b(jcb2, "to");
        boolean z = jcb.B().size() == jcb2.B().size();
        if (!TVa.a || z) {
            a aVar = Rtb.c;
            List<C4905Fdb> B = jcb.B();
            C7471uYa.a((Object) B, "from.declaredTypeParameters");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) B, 10));
            for (C4905Fdb Q : B) {
                arrayList.add(Q.Q());
            }
            List<C4905Fdb> B2 = jcb2.B();
            C7471uYa.a((Object) B2, "to.declaredTypeParameters");
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) B2, 10));
            for (C4905Fdb fdb : B2) {
                C7471uYa.a((Object) fdb, "it");
                Etb z2 = fdb.z();
                C7471uYa.a((Object) z2, "it.defaultType");
                arrayList2.add(Fub.a((C7706xtb) z2));
            }
            return a.a(aVar, LWa.a((Iterable) C7676xWa.e((Iterable) arrayList, (Iterable) arrayList2)), false, 2, null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(jcb);
        sb.append(" and ");
        sb.append(jcb2);
        sb.append(" should have same number of type parameters, ");
        sb.append("but ");
        sb.append(jcb.B().size());
        sb.append(" / ");
        sb.append(jcb2.B().size());
        sb.append(" found");
        throw new AssertionError(sb.toString());
    }
}
