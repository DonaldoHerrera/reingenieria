package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* renamed from: Zgb reason: default package */
/* compiled from: context.kt */
public final class Zgb {
    public static final C6590hhb a(C6590hhb hhb, C6998nhb nhb) {
        C7471uYa.b(hhb, "$this$child");
        C7471uYa.b(nhb, "typeParameterResolver");
        return new C6590hhb(hhb.a(), nhb, hhb.c());
    }

    public static final C6590hhb b(C6590hhb hhb, C6723jeb jeb) {
        C7471uYa.b(hhb, "$this$copyWithNewDefaultTypeQualifiers");
        C7471uYa.b(jeb, "additionalAnnotations");
        return jeb.isEmpty() ? hhb : new C6590hhb(hhb.a(), hhb.f(), BVa.a(DVa.NONE, new Ygb(hhb, jeb)));
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=jeb, code=jeb<deb>, for r6v0, types: [jeb, jeb<deb>, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    public static final C5654bhb a(C6590hhb hhb, C6723jeb<C6315deb> jeb) {
        EnumMap enumMap;
        C7471uYa.b(hhb, "$this$computeNewDefaultTypeQualifiers");
        C7471uYa.b(jeb, "additionalAnnotations");
        if (hhb.a().a().a()) {
            return hhb.b();
        }
        ArrayList<C6862lhb> arrayList = new ArrayList<>();
        for (C6315deb a : jeb) {
            C6862lhb a2 = a(hhb, a);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        if (arrayList.isEmpty()) {
            return hhb.b();
        }
        C5654bhb b = hhb.b();
        if (b != null) {
            EnumMap a3 = b.a();
            if (a3 != null) {
                enumMap = new EnumMap(a3);
                boolean z = false;
                for (C6862lhb lhb : arrayList) {
                    C6864ljb a4 = lhb.a();
                    for (a put : lhb.b()) {
                        enumMap.put(put, a4);
                        z = true;
                    }
                }
                return z ? hhb.b() : new C5654bhb(enumMap);
            }
        }
        enumMap = new EnumMap(a.class);
        boolean z2 = false;
        for (C6862lhb lhb2 : arrayList) {
        }
        return z2 ? hhb.b() : new C5654bhb(enumMap);
    }

    private static final C6862lhb a(C6590hhb hhb, C6315deb deb) {
        Ifb a = hhb.a().a();
        C6862lhb c = a.c(deb);
        if (c != null) {
            return c;
        }
        b e = a.e(deb);
        if (e != null) {
            C6315deb a2 = e.a();
            List b = e.b();
            Dvb b2 = a.b(deb);
            if (b2 == null) {
                b2 = a.a(a2);
            }
            if (b2.b()) {
                return null;
            }
            C6864ljb a3 = hhb.a().o().a(a2);
            if (a3 != null) {
                C6864ljb a4 = C6864ljb.a(a3, null, b2.c(), 1, null);
                if (a4 != null) {
                    return new C6862lhb(a4, b);
                }
            }
        }
        return null;
    }

    public static final C6590hhb a(C6590hhb hhb, _gb _gb) {
        C7471uYa.b(hhb, "$this$replaceComponents");
        C7471uYa.b(_gb, "components");
        return new C6590hhb(_gb, hhb.f(), hhb.c());
    }

    private static final C6590hhb a(C6590hhb hhb, C5272Rcb rcb, C5588ajb ajb, int i, C7744yVa<C5654bhb> yva) {
        C6998nhb nhb;
        _gb a = hhb.a();
        if (ajb != null) {
            nhb = new C6726jhb(hhb, rcb, ajb, i);
        } else {
            nhb = hhb.f();
        }
        return new C6590hhb(a, nhb, yva);
    }

    public static /* synthetic */ C6590hhb a(C6590hhb hhb, C5272Rcb rcb, C5588ajb ajb, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(hhb, rcb, ajb, i);
    }

    public static final C6590hhb a(C6590hhb hhb, C5272Rcb rcb, C5588ajb ajb, int i) {
        C7471uYa.b(hhb, "$this$childForMethod");
        C7471uYa.b(rcb, "containingDeclaration");
        C7471uYa.b(ajb, "typeParameterOwner");
        return a(hhb, rcb, ajb, i, hhb.c());
    }

    public static /* synthetic */ C6590hhb a(C6590hhb hhb, C5091Lcb lcb, C5588ajb ajb, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ajb = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return a(hhb, lcb, ajb, i);
    }

    public static final C6590hhb a(C6590hhb hhb, C5091Lcb lcb, C5588ajb ajb, int i) {
        C7471uYa.b(hhb, "$this$childForClassOrPackage");
        C7471uYa.b(lcb, "containingDeclaration");
        return a(hhb, lcb, ajb, i, BVa.a(DVa.NONE, new Xgb(hhb, lcb)));
    }
}
