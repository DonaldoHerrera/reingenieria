package defpackage;

import java.util.List;

/* renamed from: uib reason: default package and case insensitive filesystem */
/* compiled from: JavaTypeResolver.kt */
public final class C7482uib {
    /* access modifiers changed from: private */
    public static final C7349snb a = new C7349snb("java.lang.Class");

    public static final Stb a(C4905Fdb fdb, C6931mib mib) {
        C7471uYa.b(fdb, "typeParameter");
        C7471uYa.b(mib, "attr");
        if (mib.b() == Lgb.SUPERTYPE) {
            return new Utb(Ltb.a(fdb));
        }
        return new Jtb(fdb);
    }

    public static /* synthetic */ C6931mib a(Lgb lgb, boolean z, C4905Fdb fdb, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            fdb = null;
        }
        return a(lgb, z, fdb);
    }

    public static final C6931mib a(Lgb lgb, boolean z, C4905Fdb fdb) {
        C7471uYa.b(lgb, "$this$toAttributes");
        C6931mib mib = new C6931mib(lgb, null, z, fdb, 2, null);
        return mib;
    }

    public static /* synthetic */ C7706xtb a(C4905Fdb fdb, C4905Fdb fdb2, PXa pXa, int i, Object obj) {
        if ((i & 1) != 0) {
            fdb2 = null;
        }
        if ((i & 2) != 0) {
            pXa = new C7413tib(fdb);
        }
        return a(fdb, fdb2, pXa);
    }

    public static final C7706xtb a(C4905Fdb fdb, C4905Fdb fdb2, PXa<? extends C7706xtb> pXa) {
        C7471uYa.b(fdb, "$this$getErasedUpperBound");
        C7471uYa.b(pXa, "defaultValue");
        if (fdb == fdb2) {
            return (C7706xtb) pXa.d();
        }
        List upperBounds = fdb.getUpperBounds();
        C7471uYa.a((Object) upperBounds, "upperBounds");
        C7706xtb xtb = (C7706xtb) C7676xWa.f(upperBounds);
        if (xtb.za().c() instanceof C5029Jcb) {
            C7471uYa.a((Object) xtb, "firstUpperBound");
            return Fub.g(xtb);
        }
        if (fdb2 != null) {
            fdb = fdb2;
        }
        C5122Mcb c = xtb.za().c();
        String str = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor";
        if (c != null) {
            while (true) {
                C4905Fdb fdb3 = (C4905Fdb) c;
                if (!(!C7471uYa.a((Object) fdb3, (Object) fdb))) {
                    return (C7706xtb) pXa.d();
                }
                List upperBounds2 = fdb3.getUpperBounds();
                C7471uYa.a((Object) upperBounds2, "current.upperBounds");
                C7706xtb xtb2 = (C7706xtb) C7676xWa.f(upperBounds2);
                if (xtb2.za().c() instanceof C5029Jcb) {
                    C7471uYa.a((Object) xtb2, "nextUpperBound");
                    return Fub.g(xtb2);
                }
                c = xtb2.za().c();
                if (c == null) {
                    throw new OVa(str);
                }
            }
        } else {
            throw new OVa(str);
        }
    }
}
