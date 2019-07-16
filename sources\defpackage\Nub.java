package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: Nub reason: default package */
/* compiled from: CapturedTypeApproximation.kt */
public final class Nub {
    private static final Oub a(Stb stb, C4905Fdb fdb) {
        int i = Hub.a[_tb.a(fdb.pa(), stb).ordinal()];
        String str = C1325gg.TYPE;
        if (i == 1) {
            C7706xtb type = stb.getType();
            C7471uYa.a((Object) type, str);
            C7706xtb type2 = stb.getType();
            C7471uYa.a((Object) type2, str);
            return new Oub(fdb, type, type2);
        } else if (i == 2) {
            C7706xtb type3 = stb.getType();
            C7471uYa.a((Object) type3, str);
            Etb v = C7148pqb.b((C5272Rcb) fdb).v();
            C7471uYa.a((Object) v, "typeParameter.builtIns.nullableAnyType");
            return new Oub(fdb, type3, v);
        } else if (i == 3) {
            Etb u = C7148pqb.b((C5272Rcb) fdb).u();
            C7471uYa.a((Object) u, "typeParameter.builtIns.nothingType");
            C7706xtb type4 = stb.getType();
            C7471uYa.a((Object) type4, str);
            return new Oub(fdb, u, type4);
        } else {
            throw new FVa();
        }
    }

    private static final Stb b(Oub oub) {
        boolean d = oub.d();
        if (!TVa.a || d) {
            Mub mub = new Mub(oub);
            if (C7471uYa.a((Object) oub.a(), (Object) oub.b())) {
                return new Utb(oub.a());
            }
            if (C5301Sbb.o(oub.a()) && oub.c().pa() != C6473fub.IN_VARIANCE) {
                return new Utb(mub.invoke(C6473fub.OUT_VARIANCE), oub.b());
            }
            if (C5301Sbb.q(oub.b())) {
                return new Utb(mub.invoke(C6473fub.IN_VARIANCE), oub.a());
            }
            return new Utb(mub.invoke(C6473fub.OUT_VARIANCE), oub.b());
        }
        Cob a = Cob.j.a((_Xa<? super Pob, RVa>) Lub.a);
        StringBuilder sb = new StringBuilder();
        sb.append("Only consistent enhanced type projection can be converted to type projection, but ");
        sb.append('[');
        sb.append(a.a((C5272Rcb) oub.c()));
        sb.append(": <");
        sb.append(a.a(oub.a()));
        sb.append(", ");
        sb.append(a.a(oub.b()));
        sb.append(">]");
        sb.append(" was found");
        throw new AssertionError(sb.toString());
    }

    public static final Stb a(Stb stb, boolean z) {
        if (stb == null) {
            return null;
        }
        if (stb.a()) {
            return stb;
        }
        C7706xtb type = stb.getType();
        C7471uYa.a((Object) type, "typeProjection.type");
        if (!C5605aub.a(type, (_Xa<C6405eub, Boolean>) Jub.a)) {
            return stb;
        }
        C6473fub b = stb.b();
        C7471uYa.a((Object) b, "typeProjection.projectionKind");
        if (b == C6473fub.OUT_VARIANCE) {
            return new Utb(b, (C7706xtb) a(type).d());
        }
        if (z) {
            return new Utb(b, (C7706xtb) a(type).c());
        }
        return a(stb);
    }

    private static final Stb a(Stb stb) {
        _tb a = _tb.a((Wtb) new Kub());
        C7471uYa.a((Object) a, "TypeSubstitutor.create(o…ojection\n        }\n    })");
        return a.b(stb);
    }

    public static final Gub<C7706xtb> a(C7706xtb xtb) {
        Object obj;
        Gub<C7706xtb> gub;
        C7471uYa.b(xtb, C1325gg.TYPE);
        if (C7430ttb.b(xtb)) {
            Gub a = a((C7706xtb) C7430ttb.c(xtb));
            Gub a2 = a((C7706xtb) C7430ttb.d(xtb));
            return new Gub<>(C6269cub.a(C7775ytb.a(C7430ttb.c((C7706xtb) a.c()), C7430ttb.d((C7706xtb) a2.c())), xtb), C6269cub.a(C7775ytb.a(C7430ttb.c((C7706xtb) a.d()), C7430ttb.d((C7706xtb) a2.d())), xtb));
        }
        Ptb za = xtb.za();
        String str = "type.builtIns.nothingType";
        if (Gpb.a(xtb)) {
            if (za != null) {
                Stb a3 = ((Cpb) za).a();
                Iub iub = new Iub(xtb);
                C7706xtb type = a3.getType();
                C7471uYa.a((Object) type, "typeProjection.type");
                C7706xtb a4 = iub.invoke(type);
                int i = Hub.b[a3.b().ordinal()];
                if (i == 1) {
                    Etb v = Fub.b(xtb).v();
                    C7471uYa.a((Object) v, "type.builtIns.nullableAnyType");
                    gub = new Gub<>(a4, v);
                } else if (i == 2) {
                    Etb u = Fub.b(xtb).u();
                    C7471uYa.a((Object) u, str);
                    gub = new Gub<>(iub.invoke(u), a4);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Only nontrivial projections should have been captured, not: ");
                    sb.append(a3);
                    throw new AssertionError(sb.toString());
                }
                return gub;
            }
            throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.calls.inference.CapturedTypeConstructor");
        } else if (xtb.ya().isEmpty() || xtb.ya().size() != za.getParameters().size()) {
            return new Gub<>(xtb, xtb);
        } else {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List ya = xtb.ya();
            List parameters = za.getParameters();
            C7471uYa.a((Object) parameters, "typeConstructor.parameters");
            for (HVa hVa : C7676xWa.e((Iterable) ya, (Iterable) parameters)) {
                Stb stb = (Stb) hVa.a();
                C4905Fdb fdb = (C4905Fdb) hVa.b();
                C7471uYa.a((Object) fdb, "typeParameter");
                Oub a5 = a(stb, fdb);
                if (stb.a()) {
                    arrayList.add(a5);
                    arrayList2.add(a5);
                } else {
                    Gub a6 = a(a5);
                    Oub oub = (Oub) a6.a();
                    Oub oub2 = (Oub) a6.b();
                    arrayList.add(oub);
                    arrayList2.add(oub2);
                }
            }
            boolean z = false;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((Oub) it.next()).d()) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (z) {
                obj = Fub.b(xtb).u();
                C7471uYa.a(obj, str);
            } else {
                obj = a(xtb, (List<Oub>) arrayList);
            }
            return new Gub<>(obj, a(xtb, (List<Oub>) arrayList2));
        }
    }

    private static final C7706xtb a(C7706xtb xtb, List<Oub> list) {
        boolean z = xtb.ya().size() == list.size();
        if (!TVa.a || z) {
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
            for (Oub b : list) {
                arrayList.add(b(b));
            }
            return Xtb.a(xtb, (List) arrayList, (C6723jeb) null, 2, (Object) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Incorrect type arguments ");
        sb.append(list);
        throw new AssertionError(sb.toString());
    }

    private static final Gub<Oub> a(Oub oub) {
        Gub a = a(oub.a());
        C7706xtb xtb = (C7706xtb) a.a();
        C7706xtb xtb2 = (C7706xtb) a.b();
        Gub a2 = a(oub.b());
        return new Gub<>(new Oub(oub.c(), xtb2, (C7706xtb) a2.a()), new Oub(oub.c(), xtb, (C7706xtb) a2.b()));
    }
}
