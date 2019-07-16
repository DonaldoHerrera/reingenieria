package defpackage;

/* renamed from: Bfb reason: default package */
/* compiled from: utils.kt */
public final class Bfb {
    public static final void a(Efb efb, Dfb dfb, C5029Jcb jcb, C7694xnb xnb) {
        C7471uYa.b(efb, "$this$record");
        C7471uYa.b(dfb, "from");
        C7471uYa.b(jcb, "scopeOwner");
        C7471uYa.b(xnb, "name");
        if (efb != a.a) {
            Cfb location = dfb.getLocation();
            if (location != null) {
                Gfb position = efb.a() ? location.getPosition() : Gfb.b.a();
                String a = location.a();
                String a2 = C6531gpb.e(jcb).a();
                C7471uYa.a((Object) a2, "DescriptorUtils.getFqName(scopeOwner).asString()");
                Hfb hfb = Hfb.CLASSIFIER;
                String a3 = xnb.a();
                C7471uYa.a((Object) a3, "name.asString()");
                efb.a(a, position, a2, hfb, a3);
            }
        }
    }

    public static final void a(Efb efb, Dfb dfb, C6790kdb kdb, C7694xnb xnb) {
        C7471uYa.b(efb, "$this$record");
        C7471uYa.b(dfb, "from");
        C7471uYa.b(kdb, "scopeOwner");
        C7471uYa.b(xnb, "name");
        String a = kdb.q().a();
        C7471uYa.a((Object) a, "scopeOwner.fqName.asString()");
        String a2 = xnb.a();
        C7471uYa.a((Object) a2, "name.asString()");
        a(efb, dfb, a, a2);
    }

    public static final void a(Efb efb, Dfb dfb, String str, String str2) {
        C7471uYa.b(efb, "$this$recordPackageLookup");
        C7471uYa.b(dfb, "from");
        C7471uYa.b(str, "packageFqName");
        C7471uYa.b(str2, "name");
        if (efb != a.a) {
            Cfb location = dfb.getLocation();
            if (location != null) {
                efb.a(location.a(), efb.a() ? location.getPosition() : Gfb.b.a(), str, Hfb.PACKAGE, str2);
            }
        }
    }
}
