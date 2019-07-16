package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Fub reason: default package */
/* compiled from: TypeUtils.kt */
public final class Fub {
    public static final boolean a(C7706xtb xtb, C7706xtb xtb2) {
        C7471uYa.b(xtb, "$this$isSubtypeOf");
        C7471uYa.b(xtb2, "superType");
        return C6745jub.a.b(xtb, xtb2);
    }

    public static final C5301Sbb b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$builtIns");
        C5301Sbb E = xtb.za().E();
        C7471uYa.a((Object) E, "constructor.builtIns");
        return E;
    }

    public static final boolean c(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isAnyOrNullableAny");
        return C5301Sbb.c(xtb);
    }

    public static final boolean d(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isTypeParameter");
        return C5605aub.h(xtb);
    }

    public static final C7706xtb e(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$makeNotNullable");
        C7706xtb i = C5605aub.i(xtb);
        C7471uYa.a((Object) i, "TypeUtils.makeNotNullable(this)");
        return i;
    }

    public static final C7706xtb f(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$makeNullable");
        C7706xtb j = C5605aub.j(xtb);
        C7471uYa.a((Object) j, "TypeUtils.makeNullable(this)");
        return j;
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [eub] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public static final C7706xtb g(C7706xtb xtb) {
        Etb etb;
        C7471uYa.b(xtb, "$this$replaceArgumentsWithStarProjections");
        C6405eub Ba = xtb.Ba();
        String str = "constructor.parameters";
        if (Ba instanceof C7223qtb) {
            C7223qtb qtb = (C7223qtb) Ba;
            Etb Da = qtb.Da();
            if (!Da.za().getParameters().isEmpty() && Da.za().c() != null) {
                List<C4905Fdb> parameters = Da.za().getParameters();
                C7471uYa.a((Object) parameters, str);
                ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) parameters, 10));
                for (C4905Fdb jtb : parameters) {
                    arrayList.add(new Jtb(jtb));
                }
                Da = Xtb.a(Da, (List) arrayList, (C6723jeb) null, 2, (Object) null);
            }
            Etb Ea = qtb.Ea();
            if (!Ea.za().getParameters().isEmpty() && Ea.za().c() != null) {
                List<C4905Fdb> parameters2 = Ea.za().getParameters();
                C7471uYa.a((Object) parameters2, str);
                ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) parameters2, 10));
                for (C4905Fdb jtb2 : parameters2) {
                    arrayList2.add(new Jtb(jtb2));
                }
                Ea = Xtb.a(Ea, (List) arrayList2, (C6723jeb) null, 2, (Object) null);
            }
            etb = C7775ytb.a(Da, Ea);
        } else if (Ba instanceof Etb) {
            etb = (Etb) Ba;
            if (!etb.za().getParameters().isEmpty() && etb.za().c() != null) {
                List<C4905Fdb> parameters3 = etb.za().getParameters();
                C7471uYa.a((Object) parameters3, str);
                ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) parameters3, 10));
                for (C4905Fdb jtb3 : parameters3) {
                    arrayList3.add(new Jtb(jtb3));
                }
                etb = Xtb.a(etb, (List) arrayList3, (C6723jeb) null, 2, (Object) null);
            }
        } else {
            throw new FVa();
        }
        return C6269cub.a(etb, Ba);
    }

    public static final C7706xtb a(C7706xtb xtb, C6723jeb jeb) {
        C7471uYa.b(xtb, "$this$replaceAnnotations");
        C7471uYa.b(jeb, "newAnnotations");
        if (!xtb.getAnnotations().isEmpty() || !jeb.isEmpty()) {
            return xtb.Ba().a(jeb);
        }
        return xtb;
    }

    public static final Stb a(C7706xtb xtb, C6473fub fub, C4905Fdb fdb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        C7471uYa.b(fub, "projectionKind");
        if ((fdb != null ? fdb.pa() : null) == fub) {
            fub = C6473fub.INVARIANT;
        }
        return new Utb(fub, xtb);
    }

    public static final Stb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$asTypeProjection");
        return new Utb(xtb);
    }

    public static final boolean a(C7706xtb xtb, _Xa<? super C6405eub, Boolean> _xa) {
        C7471uYa.b(xtb, "$this$contains");
        C7471uYa.b(_xa, "predicate");
        return C5605aub.a(xtb, _xa);
    }

    public static final boolean a(C6405eub eub) {
        C7471uYa.b(eub, "$this$canHaveUndefinedNullability");
        eub.za();
        return (eub.za().c() instanceof C4905Fdb) || (eub instanceof C6949mub);
    }

    public static final C7706xtb a(C4905Fdb fdb) {
        Object obj;
        C7471uYa.b(fdb, "$this$representativeUpperBound");
        List upperBounds = fdb.getUpperBounds();
        String str = "upperBounds";
        C7471uYa.a((Object) upperBounds, str);
        boolean z = !upperBounds.isEmpty();
        if (!TVa.a || z) {
            List upperBounds2 = fdb.getUpperBounds();
            C7471uYa.a((Object) upperBounds2, str);
            Iterator it = upperBounds2.iterator();
            while (true) {
                C5029Jcb jcb = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C5122Mcb c = ((C7706xtb) obj).za().c();
                if (c instanceof C5029Jcb) {
                    jcb = c;
                }
                C5029Jcb jcb2 = jcb;
                boolean z2 = false;
                if (!(jcb2 == null || jcb2.g() == C5060Kcb.INTERFACE || jcb2.g() == C5060Kcb.ANNOTATION_CLASS)) {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    break;
                }
            }
            C7706xtb xtb = (C7706xtb) obj;
            if (xtb != null) {
                return xtb;
            }
            List upperBounds3 = fdb.getUpperBounds();
            C7471uYa.a((Object) upperBounds3, str);
            Object f = C7676xWa.f(upperBounds3);
            C7471uYa.a(f, "upperBounds.first()");
            return (C7706xtb) f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Upper bounds should not be empty: ");
        sb.append(fdb);
        throw new AssertionError(sb.toString());
    }
}
