package defpackage;

import java.util.List;

/* renamed from: cgb reason: default package and case insensitive filesystem */
/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
public final class C5721cgb implements C6599hpb {
    public static final a a = new a(null);

    /* renamed from: cgb$a */
    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        private a() {
        }

        public final boolean a(C4904Fcb fcb, C4904Fcb fcb2) {
            C7471uYa.b(fcb, "superDescriptor");
            C7471uYa.b(fcb2, "subDescriptor");
            if ((fcb2 instanceof Rgb) && (fcb instanceof C5582adb)) {
                Rgb rgb = (Rgb) fcb2;
                C5582adb adb = (C5582adb) fcb;
                boolean z = rgb.f().size() == adb.f().size();
                if (!TVa.a || z) {
                    C7684xdb original = rgb.getOriginal();
                    C7471uYa.a((Object) original, "subDescriptor.original");
                    List f = original.f();
                    C7471uYa.a((Object) f, "subDescriptor.original.valueParameters");
                    C5582adb original2 = adb.getOriginal();
                    C7471uYa.a((Object) original2, "superDescriptor.original");
                    List f2 = original2.f();
                    C7471uYa.a((Object) f2, "superDescriptor.original.valueParameters");
                    for (HVa hVa : C7676xWa.e((Iterable) f, (Iterable) f2)) {
                        C5061Kdb kdb = (C5061Kdb) hVa.a();
                        C5061Kdb kdb2 = (C5061Kdb) hVa.b();
                        C5582adb adb2 = (C5582adb) fcb2;
                        C7471uYa.a((Object) kdb, "subParameter");
                        boolean z2 = a(adb2, kdb) instanceof c;
                        C7471uYa.a((Object) kdb2, "superParameter");
                        if (z2 != (a(adb, kdb2) instanceof c)) {
                            return true;
                        }
                    }
                } else {
                    throw new AssertionError("External overridability condition with CONFLICTS_ONLY should not be run with different value parameters size");
                }
            }
            return false;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        private final C7760ykb a(C5582adb adb, C5061Kdb kdb) {
            String str = "valueParameterDescriptor.type";
            if (Hkb.b(adb) || a(adb)) {
                C7706xtb type = kdb.getType();
                C7471uYa.a((Object) type, str);
                return Hkb.a(Fub.f(type));
            }
            C7706xtb type2 = kdb.getType();
            C7471uYa.a((Object) type2, str);
            return Hkb.a(type2);
        }

        private final boolean a(C5582adb adb) {
            boolean z = true;
            if (adb.f().size() != 1) {
                return false;
            }
            C5272Rcb e = adb.e();
            if (!(e instanceof C5029Jcb)) {
                e = null;
            }
            C5029Jcb jcb = (C5029Jcb) e;
            if (jcb != null) {
                List f = adb.f();
                C7471uYa.a((Object) f, "f.valueParameters");
                Object j = C7676xWa.j(f);
                C7471uYa.a(j, "f.valueParameters.single()");
                C5122Mcb c = ((C5061Kdb) j).getType().za().c();
                if (!(c instanceof C5029Jcb)) {
                    c = null;
                }
                C5029Jcb jcb2 = (C5029Jcb) c;
                if (jcb2 != null) {
                    if (!C5301Sbb.d(jcb) || !C7471uYa.a((Object) C7148pqb.c(jcb), (Object) C7148pqb.c(jcb2))) {
                        z = false;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    private final boolean b(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb) {
        if ((fcb instanceof C4935Gcb) && (fcb2 instanceof C5582adb) && !C5301Sbb.c((C5272Rcb) fcb2)) {
            Nfb nfb = Nfb.h;
            C5582adb adb = (C5582adb) fcb2;
            C7694xnb name = adb.getName();
            String str = "subDescriptor.name";
            C7471uYa.a((Object) name, str);
            if (!nfb.a(name)) {
                Mfb mfb = Mfb.f;
                C7694xnb name2 = adb.getName();
                C7471uYa.a((Object) name2, str);
                if (!mfb.b(name2)) {
                    return false;
                }
            }
            C4935Gcb d = C7135pgb.d((C4935Gcb) fcb);
            boolean z = fcb instanceof C5582adb;
            C5582adb adb2 = (C5582adb) (!z ? null : fcb);
            if ((adb2 == null || adb.v() != adb2.v()) && (d == null || !adb.v())) {
                return true;
            }
            if ((jcb instanceof Pgb) && adb.u() == null && d != null && !C7135pgb.a(jcb, (C4904Fcb) d)) {
                if ((d instanceof C5582adb) && z && Nfb.a((C5582adb) d) != null) {
                    String a2 = Hkb.a(adb, false, false, 2, null);
                    C5582adb original = ((C5582adb) fcb).getOriginal();
                    C7471uYa.a((Object) original, "superDescriptor.original");
                    if (C7471uYa.a((Object) a2, (Object) Hkb.a(original, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public b a(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb) {
        C7471uYa.b(fcb, "superDescriptor");
        C7471uYa.b(fcb2, "subDescriptor");
        if (b(fcb, fcb2, jcb)) {
            return b.INCOMPATIBLE;
        }
        if (a.a(fcb, fcb2)) {
            return b.INCOMPATIBLE;
        }
        return b.UNKNOWN;
    }

    public defpackage.C6599hpb.a a() {
        return defpackage.C6599hpb.a.CONFLICTS_ONLY;
    }
}
