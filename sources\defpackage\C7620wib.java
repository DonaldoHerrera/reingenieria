package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: wib reason: default package and case insensitive filesystem */
/* compiled from: RawType.kt */
public final class C7620wib extends Wtb {
    private static final C6931mib c = C7482uib.a(Lgb.COMMON, false, (C4905Fdb) null, 3, (Object) null).a(C6999nib.FLEXIBLE_LOWER_BOUND);
    private static final C6931mib d = C7482uib.a(Lgb.COMMON, false, (C4905Fdb) null, 3, (Object) null).a(C6999nib.FLEXIBLE_UPPER_BOUND);
    public static final C7620wib e = new C7620wib();

    private C7620wib() {
    }

    private final C7706xtb b(C7706xtb xtb) {
        C5122Mcb c2 = xtb.za().c();
        if (c2 instanceof C4905Fdb) {
            return b(C7482uib.a((C4905Fdb) c2, (C4905Fdb) null, (PXa) null, 3, (Object) null));
        }
        if (c2 instanceof C5029Jcb) {
            C5029Jcb jcb = (C5029Jcb) c2;
            HVa a = a(C7430ttb.c(xtb), jcb, c);
            Etb etb = (Etb) a.a();
            boolean booleanValue = ((Boolean) a.b()).booleanValue();
            HVa a2 = a(C7430ttb.d(xtb), jcb, d);
            Etb etb2 = (Etb) a2.a();
            boolean booleanValue2 = ((Boolean) a2.b()).booleanValue();
            if (booleanValue || booleanValue2) {
                return new Bib(etb, etb2);
            }
            return C7775ytb.a(etb, etb2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected declaration kind: ");
        sb.append(c2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public boolean d() {
        return false;
    }

    public Utb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "key");
        return new Utb(b(xtb));
    }

    private final HVa<Etb, Boolean> a(Etb etb, C5029Jcb jcb, C6931mib mib) {
        boolean isEmpty = etb.za().getParameters().isEmpty();
        Boolean valueOf = Boolean.valueOf(false);
        if (isEmpty) {
            return NVa.a(etb, valueOf);
        }
        if (C5301Sbb.d((C7706xtb) etb)) {
            Stb stb = (Stb) etb.ya().get(0);
            C6473fub b = stb.b();
            C7706xtb type = stb.getType();
            C7471uYa.a((Object) type, "componentTypeProjection.type");
            return NVa.a(C7775ytb.a(etb.getAnnotations(), etb.za(), C6850lWa.a(new Utb(b, b(type))), etb.Aa()), valueOf);
        } else if (C7844ztb.a(etb)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Raw error type: ");
            sb.append(etb.za());
            return NVa.a(C7154ptb.c(sb.toString()), valueOf);
        } else {
            C6723jeb annotations = etb.getAnnotations();
            Ptb za = etb.za();
            List<C4905Fdb> parameters = etb.za().getParameters();
            C7471uYa.a((Object) parameters, "type.constructor.parameters");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
            for (C4905Fdb fdb : parameters) {
                C7620wib wib = e;
                C7471uYa.a((Object) fdb, "parameter");
                arrayList.add(a(wib, fdb, mib, null, 4, null));
            }
            boolean Aa = etb.Aa();
            Eqb a = jcb.a(e);
            C7471uYa.a((Object) a, "declaration.getMemberScope(RawSubstitution)");
            return NVa.a(C7775ytb.a(annotations, za, arrayList, Aa, a), Boolean.valueOf(true));
        }
    }

    public static /* synthetic */ Stb a(C7620wib wib, C4905Fdb fdb, C6931mib mib, C7706xtb xtb, int i, Object obj) {
        if ((i & 4) != 0) {
            xtb = C7482uib.a(fdb, (C4905Fdb) null, (PXa) null, 3, (Object) null);
        }
        return wib.a(fdb, mib, xtb);
    }

    public final Stb a(C4905Fdb fdb, C6931mib mib, C7706xtb xtb) {
        Stb stb;
        C7471uYa.b(fdb, "parameter");
        C7471uYa.b(mib, "attr");
        C7471uYa.b(xtb, "erasedUpperBound");
        int i = C7551vib.a[mib.a().ordinal()];
        if (i == 1) {
            return new Utb(C6473fub.INVARIANT, xtb);
        }
        if (i != 2 && i != 3) {
            throw new FVa();
        } else if (!fdb.pa().a()) {
            return new Utb(C6473fub.INVARIANT, C7148pqb.b((C5272Rcb) fdb).u());
        } else {
            List parameters = xtb.za().getParameters();
            C7471uYa.a((Object) parameters, "erasedUpperBound.constructor.parameters");
            if (!parameters.isEmpty()) {
                stb = new Utb(C6473fub.OUT_VARIANCE, xtb);
            } else {
                stb = C7482uib.a(fdb, mib);
            }
            return stb;
        }
    }
}
