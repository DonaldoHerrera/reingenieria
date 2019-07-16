package defpackage;

/* renamed from: Wcb reason: default package and case insensitive filesystem */
/* compiled from: descriptorUtil.kt */
public final class C5419Wcb {
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    public static final C5029Jcb a(C6450fdb fdb, C7349snb snb, Dfb dfb) {
        C5122Mcb mcb;
        C7471uYa.b(fdb, "$this$resolveClassByFqName");
        C7471uYa.b(snb, "fqName");
        C7471uYa.b(dfb, "lookupLocation");
        if (snb.b()) {
            return null;
        }
        C7349snb c = snb.c();
        String str = "fqName.parent()";
        C7471uYa.a((Object) c, str);
        Eqb ha = fdb.a(c).ha();
        C7694xnb e = snb.e();
        String str2 = "fqName.shortName()";
        C7471uYa.a((Object) e, str2);
        C5122Mcb b = ha.b(e, dfb);
        if (!(b instanceof C5029Jcb)) {
            b = null;
        }
        C5029Jcb jcb = (C5029Jcb) b;
        if (jcb != null) {
            return jcb;
        }
        C7349snb c2 = snb.c();
        C7471uYa.a((Object) c2, str);
        C5029Jcb a = a(fdb, c2, dfb);
        if (a != null) {
            Eqb H = a.H();
            if (H != null) {
                C7694xnb e2 = snb.e();
                C7471uYa.a((Object) e2, str2);
                mcb = H.b(e2, dfb);
                if (!(mcb instanceof C5029Jcb)) {
                    mcb = null;
                }
                return (C5029Jcb) mcb;
            }
        }
        mcb = null;
        if (!(mcb instanceof C5029Jcb)) {
        }
        return (C5029Jcb) mcb;
    }
}
