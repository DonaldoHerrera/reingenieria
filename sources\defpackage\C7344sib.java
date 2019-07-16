package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: sib reason: default package and case insensitive filesystem */
/* compiled from: JavaTypeResolver.kt */
public final class C7344sib {
    private final C6590hhb a;
    private final C6998nhb b;

    public C7344sib(C6590hhb hhb, C6998nhb nhb) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(nhb, "typeParameterResolver");
        this.a = hhb;
        this.b = nhb;
    }

    private final C7706xtb b(Nib nib, C6931mib mib) {
        C7706xtb xtb;
        C7275rib rib = new C7275rib(nib);
        boolean z = !mib.d() && mib.b() != Lgb.SUPERTYPE;
        boolean y = nib.y();
        if (y || z) {
            Etb a2 = a(nib, mib.a(C6999nib.FLEXIBLE_LOWER_BOUND), (Etb) null);
            if (a2 == null) {
                return rib.d();
            }
            Etb a3 = a(nib, mib.a(C6999nib.FLEXIBLE_UPPER_BOUND), a2);
            if (a3 == null) {
                return rib.d();
            }
            if (y) {
                xtb = new Bib(a2, a3);
            } else {
                xtb = C7775ytb.a(a2, a3);
            }
            return xtb;
        }
        Etb a4 = a(nib, mib, (Etb) null);
        if (a4 == null) {
            a4 = rib.d();
        }
        return a4;
    }

    public final C7706xtb a(Zib zib, C6931mib mib) {
        Etb etb;
        C7471uYa.b(zib, "javaType");
        C7471uYa.b(mib, "attr");
        if (zib instanceof Yib) {
            C5331Tbb type = ((Yib) zib).getType();
            if (type != null) {
                etb = this.a.d().E().c(type);
            } else {
                etb = this.a.d().E().E();
            }
            C7471uYa.a((Object) etb, "if (primitiveType != nul….module.builtIns.unitType");
            return etb;
        } else if (zib instanceof Nib) {
            return b((Nib) zib, mib);
        } else {
            if (zib instanceof Jib) {
                return a(this, (Jib) zib, mib, false, 4, null);
            } else if (zib instanceof C5724cjb) {
                Zib b2 = ((C5724cjb) zib).b();
                if (b2 != null) {
                    C7706xtb a2 = a(b2, mib);
                    if (a2 != null) {
                        return a2;
                    }
                }
                Etb n = this.a.d().E().n();
                C7471uYa.a((Object) n, "c.module.builtIns.defaultBound");
                return n;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsupported type: ");
                sb.append(zib);
                throw new UnsupportedOperationException(sb.toString());
            }
        }
    }

    public static /* synthetic */ C7706xtb a(C7344sib sib, Jib jib, C6931mib mib, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return sib.a(jib, mib, z);
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [eub] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final C7706xtb a(Jib jib, C6931mib mib, boolean z) {
        C7471uYa.b(jib, "arrayType");
        C7471uYa.b(mib, "attr");
        Zib a2 = jib.a();
        Yib yib = (Yib) (!(a2 instanceof Yib) ? null : a2);
        C5331Tbb type = yib != null ? yib.getType() : null;
        if (type != null) {
            Etb a3 = this.a.d().E().a(type);
            C7471uYa.a((Object) a3, "c.module.builtIns.getPri…KotlinType(primitiveType)");
            if (!mib.d()) {
                a3 = C7775ytb.a(a3, a3.a(true));
            }
            return a3;
        }
        C7706xtb a4 = a(a2, C7482uib.a(Lgb.COMMON, mib.d(), (C4905Fdb) null, 2, (Object) null));
        if (mib.d()) {
            Etb a5 = this.a.d().E().a(z ? C6473fub.OUT_VARIANCE : C6473fub.INVARIANT, a4);
            C7471uYa.a((Object) a5, "c.module.builtIns.getArr…ctionKind, componentType)");
            return a5;
        }
        Etb a6 = this.a.d().E().a(C6473fub.INVARIANT, a4);
        C7471uYa.a((Object) a6, "c.module.builtIns.getArr…INVARIANT, componentType)");
        return C7775ytb.a(a6, this.a.d().E().a(C6473fub.OUT_VARIANCE, a4).a(true));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        if (r0 != null) goto L_0x0010;
     */
    private final Etb a(Nib nib, C6931mib mib, Etb etb) {
        C6723jeb jeb;
        if (etb != null) {
            jeb = etb.getAnnotations();
        }
        jeb = new C6318dhb(this.a, nib);
        Ptb a2 = a(nib, mib);
        Ptb ptb = null;
        if (a2 == null) {
            return null;
        }
        boolean a3 = a(mib);
        if (etb != null) {
            ptb = etb.za();
        }
        if (!C7471uYa.a((Object) ptb, (Object) a2) || nib.y() || !a3) {
            return C7775ytb.a(jeb, a2, a(nib, mib, a2), a3);
        }
        return etb.a(true);
    }

    private final Ptb a(Nib nib, C6931mib mib) {
        Mib e = nib.e();
        if (e == null) {
            a(nib);
            throw null;
        } else if (e instanceof Kib) {
            Kib kib = (Kib) e;
            C7349snb q = kib.q();
            if (q != null) {
                C5029Jcb a2 = a(nib, mib, q);
                if (a2 == null) {
                    a2 = this.a.a().k().a(kib);
                }
                if (a2 != null) {
                    Ptb Q = a2.Q();
                    if (Q != null) {
                        return Q;
                    }
                }
                a(nib);
                throw null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Class type should have a FQ name: ");
            sb.append(e);
            throw new AssertionError(sb.toString());
        } else if (e instanceof _ib) {
            C4905Fdb a3 = this.b.a((_ib) e);
            if (a3 != null) {
                return a3.Q();
            }
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unknown classifier kind: ");
            sb2.append(e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private final Ptb a(Nib nib) {
        nib.B();
        throw null;
    }

    private final C5029Jcb a(Nib nib, C6931mib mib, C7349snb snb) {
        if (mib.d() && C7471uYa.a((Object) snb, (Object) C7482uib.a)) {
            return this.a.a().m().a();
        }
        C6721jcb jcb = C6721jcb.m;
        C5029Jcb a2 = C6721jcb.a(jcb, snb, this.a.d().E(), null, 4, null);
        if (a2 != null) {
            return (!jcb.d(a2) || !(mib.a() == C6999nib.FLEXIBLE_LOWER_BOUND || mib.b() == Lgb.SUPERTYPE || a(nib, a2))) ? a2 : jcb.b(a2);
        }
        return null;
    }

    private final boolean a(Nib nib, C5029Jcb jcb) {
        boolean z = false;
        if (!C7068oib.a.a((Zib) C7676xWa.i(nib.z()))) {
            return false;
        }
        Ptb Q = C6721jcb.m.b(jcb).Q();
        C7471uYa.a((Object) Q, "JavaToKotlinClassMap.con…         .typeConstructor");
        List parameters = Q.getParameters();
        C7471uYa.a((Object) parameters, "JavaToKotlinClassMap.con…ypeConstructor.parameters");
        C4905Fdb fdb = (C4905Fdb) C7676xWa.i(parameters);
        if (fdb != null) {
            C6473fub pa = fdb.pa();
            if (pa != null) {
                C7471uYa.a((Object) pa, "JavaToKotlinClassMap.con….variance ?: return false");
                if (pa != C6473fub.OUT_VARIANCE) {
                    z = true;
                }
            }
        }
        return z;
    }

    private final List<Stb> a(Nib nib, C6931mib mib, Ptb ptb) {
        C6931mib mib2;
        boolean y = nib.y();
        boolean z = y || (nib.z().isEmpty() && !ptb.getParameters().isEmpty());
        List<C4905Fdb> parameters = ptb.getParameters();
        C7471uYa.a((Object) parameters, "constructor.parameters");
        String str = "parameter";
        if (z) {
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
            for (C4905Fdb fdb : parameters) {
                Ssb e = this.a.e();
                C7206qib qib = new C7206qib(fdb, this, mib, ptb, y);
                Atb atb = new Atb(e, qib);
                C7620wib wib = C7620wib.e;
                C7471uYa.a((Object) fdb, str);
                if (y) {
                    mib2 = mib;
                    C6931mib mib3 = mib2;
                } else {
                    mib2 = mib.a(C6999nib.INFLEXIBLE);
                }
                arrayList.add(wib.a(fdb, mib2, (C7706xtb) atb));
            }
            return C7676xWa.q(arrayList);
        } else if (parameters.size() != nib.z().size()) {
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) parameters, 10));
            for (C4905Fdb fdb2 : parameters) {
                C7471uYa.a((Object) fdb2, "p");
                arrayList2.add(new Utb(C7154ptb.c(fdb2.getName().a())));
            }
            return C7676xWa.q(arrayList2);
        } else {
            Iterable<CWa> u = C7676xWa.u(nib.z());
            ArrayList arrayList3 = new ArrayList(C6986nWa.a(u, 10));
            for (CWa cWa : u) {
                int a2 = cWa.a();
                Zib zib = (Zib) cWa.b();
                boolean z2 = a2 < parameters.size();
                if (!TVa.a || z2) {
                    C4905Fdb fdb3 = (C4905Fdb) parameters.get(a2);
                    C6931mib a3 = C7482uib.a(Lgb.COMMON, false, (C4905Fdb) null, 3, (Object) null);
                    C7471uYa.a((Object) fdb3, str);
                    arrayList3.add(a(zib, a3, fdb3));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Argument index should be less then type parameters count, but ");
                    sb.append(a2);
                    sb.append(" > ");
                    sb.append(parameters.size());
                    throw new AssertionError(sb.toString());
                }
            }
            return C7676xWa.q(arrayList3);
        }
    }

    private final Stb a(Zib zib, C6931mib mib, C4905Fdb fdb) {
        if (!(zib instanceof C5724cjb)) {
            return new Utb(C6473fub.INVARIANT, a(zib, mib));
        }
        C5724cjb cjb = (C5724cjb) zib;
        Zib b2 = cjb.b();
        C6473fub fub = cjb.d() ? C6473fub.OUT_VARIANCE : C6473fub.IN_VARIANCE;
        if (b2 == null || a(fub, fdb)) {
            return C7482uib.a(fdb, mib);
        }
        return Fub.a(a(b2, C7482uib.a(Lgb.COMMON, false, (C4905Fdb) null, 3, (Object) null)), fub, fdb);
    }

    private final boolean a(C6473fub fub, C4905Fdb fdb) {
        boolean z = false;
        if (fdb.pa() == C6473fub.INVARIANT) {
            return false;
        }
        if (fub != fdb.pa()) {
            z = true;
        }
        return z;
    }

    private final boolean a(C6931mib mib) {
        boolean z = false;
        if (mib.a() == C6999nib.FLEXIBLE_LOWER_BOUND) {
            return false;
        }
        if (!mib.d() && mib.b() != Lgb.SUPERTYPE) {
            z = true;
        }
        return z;
    }
}
