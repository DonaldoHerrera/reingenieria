package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: Crb reason: default package */
/* compiled from: MemberDeserializer.kt */
public final class Crb {
    private final C6263crb a = new C6263crb(this.b.a().m(), this.b.a().n());
    /* access modifiers changed from: private */
    public final C6875lrb b;

    public Crb(C6875lrb lrb) {
        C7471uYa.b(lrb, "c");
        this.b = lrb;
    }

    private final int a(int i) {
        return (i & 63) + ((i >> 8) << 6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x030c  */
    public final C7408tdb a(Olb olb) {
        Olb olb2;
        C6723jeb jeb;
        C7842zsb zsb;
        C7615wdb wdb;
        C7134pfb pfb;
        Boolean a2;
        C7842zsb zsb2;
        boolean z;
        C7203qfb qfb;
        int i;
        Olb olb3;
        Boolean a3;
        C7134pfb pfb2;
        Olb olb4 = olb;
        C7471uYa.b(olb4, "proto");
        int m = olb.z() ? olb.m() : a(olb.p());
        C5272Rcb c = this.b.c();
        C6723jeb a4 = a((Wnb) olb4, m, Yqb.PROPERTY);
        C6314ddb a5 = Hrb.a.a((Glb) Dmb.d.a(m));
        C5583aeb a6 = Hrb.a.a((C7762ymb) Dmb.c.a(m));
        Boolean a7 = Dmb.t.a(m);
        C7471uYa.a((Object) a7, "Flags.IS_VAR.get(flags)");
        boolean booleanValue = a7.booleanValue();
        C7694xnb b2 = Drb.b(this.b.e(), olb.o());
        a a8 = Hrb.a.a((Elb) Dmb.l.a(m));
        Boolean a9 = Dmb.x.a(m);
        C7471uYa.a((Object) a9, "Flags.IS_LATEINIT.get(flags)");
        boolean booleanValue2 = a9.booleanValue();
        Boolean a10 = Dmb.w.a(m);
        C7471uYa.a((Object) a10, "Flags.IS_CONST.get(flags)");
        boolean booleanValue3 = a10.booleanValue();
        Boolean a11 = Dmb.z.a(m);
        C7471uYa.a((Object) a11, "Flags.IS_EXTERNAL_PROPERTY.get(flags)");
        boolean booleanValue4 = a11.booleanValue();
        Boolean a12 = Dmb.A.a(m);
        C7842zsb zsb3 = r1;
        C7471uYa.a((Object) a12, "Flags.IS_DELEGATED.get(flags)");
        boolean booleanValue5 = a12.booleanValue();
        C7842zsb zsb4 = zsb3;
        Boolean a13 = Dmb.B.a(m);
        int i2 = m;
        C7471uYa.a((Object) a13, "Flags.IS_EXPECT_PROPERTY.get(flags)");
        Olb olb5 = olb4;
        int i3 = i2;
        C7842zsb zsb5 = new C7842zsb(c, null, a4, a5, a6, booleanValue, b2, a8, booleanValue2, booleanValue3, booleanValue4, booleanValue5, a13.booleanValue(), olb, this.b.e(), this.b.h(), this.b.i(), this.b.b());
        C6875lrb lrb = this.b;
        List x = olb.x();
        C7471uYa.a((Object) x, "proto.typeParameterList");
        C6875lrb a14 = C6875lrb.a(lrb, zsb4, x, null, null, null, null, 60, null);
        int i4 = i3;
        Boolean a15 = Dmb.u.a(i4);
        C7471uYa.a((Object) a15, "Flags.HAS_GETTER.get(flags)");
        boolean booleanValue6 = a15.booleanValue();
        if (!booleanValue6 || !Imb.a(olb)) {
            olb2 = olb;
            jeb = C6723jeb.c.a();
        } else {
            olb2 = olb;
            jeb = a((Wnb) olb2, Yqb.PROPERTY_GETTER);
        }
        C7706xtb b3 = a14.g().b(Imb.b(olb2, this.b.h()));
        List b4 = a14.g().b();
        C7615wdb a16 = a();
        _lb a17 = Imb.a(olb2, this.b.h());
        if (a17 != null) {
            C7706xtb b5 = a14.g().b(a17);
            if (b5 != null) {
                zsb = zsb4;
                wdb = C6463fpb.a((C4904Fcb) zsb, b5, jeb);
                zsb.a(b3, b4, a16, wdb);
                Boolean a18 = Dmb.b.a(i4);
                C7471uYa.a((Object) a18, "Flags.HAS_ANNOTATIONS.get(flags)");
                int a19 = Dmb.a(a18.booleanValue(), (C7762ymb) Dmb.c.a(i4), (Glb) Dmb.d.a(i4), false, false, false);
                if (!booleanValue6) {
                    int n = olb.A() ? olb.n() : a19;
                    Boolean a20 = Dmb.F.a(n);
                    C7471uYa.a((Object) a20, "Flags.IS_NOT_DEFAULT.get(getterFlags)");
                    boolean booleanValue7 = a20.booleanValue();
                    Boolean a21 = Dmb.G.a(n);
                    C7471uYa.a((Object) a21, "Flags.IS_EXTERNAL_ACCESSOR.get(getterFlags)");
                    boolean booleanValue8 = a21.booleanValue();
                    Boolean a22 = Dmb.H.a(n);
                    C7471uYa.a((Object) a22, "Flags.IS_INLINE_ACCESSOR.get(getterFlags)");
                    boolean booleanValue9 = a22.booleanValue();
                    C6723jeb a23 = a((Wnb) olb2, n, Yqb.PROPERTY_GETTER);
                    if (booleanValue7) {
                        pfb2 = new C7134pfb(zsb, a23, Hrb.a.a((Glb) Dmb.d.a(n)), Hrb.a.a((C7762ymb) Dmb.c.a(n)), !booleanValue7, booleanValue8, booleanValue9, zsb.g(), null, C7822zdb.a);
                    } else {
                        pfb2 = C6463fpb.a((C7408tdb) zsb, a23);
                        C7471uYa.a((Object) pfb2, "DescriptorFactory.create…er(property, annotations)");
                    }
                    pfb2.a(zsb.a());
                    pfb = pfb2;
                } else {
                    pfb = null;
                }
                a2 = Dmb.v.a(i4);
                C7471uYa.a((Object) a2, "Flags.HAS_SETTER.get(flags)");
                if (!a2.booleanValue()) {
                    if (olb.H()) {
                        a19 = olb.u();
                    }
                    int i5 = a19;
                    Boolean a24 = Dmb.F.a(i5);
                    C7471uYa.a((Object) a24, "Flags.IS_NOT_DEFAULT.get(setterFlags)");
                    boolean booleanValue10 = a24.booleanValue();
                    Boolean a25 = Dmb.G.a(i5);
                    C7471uYa.a((Object) a25, "Flags.IS_EXTERNAL_ACCESSOR.get(setterFlags)");
                    boolean booleanValue11 = a25.booleanValue();
                    Boolean a26 = Dmb.H.a(i5);
                    C7471uYa.a((Object) a26, "Flags.IS_INLINE_ACCESSOR.get(setterFlags)");
                    boolean booleanValue12 = a26.booleanValue();
                    C6723jeb a27 = a((Wnb) olb2, i5, Yqb.PROPERTY_SETTER);
                    if (booleanValue10) {
                        C7203qfb qfb2 = r1;
                        C7203qfb qfb3 = new C7203qfb(zsb, a27, Hrb.a.a((Glb) Dmb.d.a(i5)), Hrb.a.a((C7762ymb) Dmb.c.a(i5)), !booleanValue10, booleanValue11, booleanValue12, zsb.g(), null, C7822zdb.a);
                        z = true;
                        zsb2 = zsb;
                        olb3 = olb2;
                        i = i4;
                        C7203qfb qfb4 = qfb2;
                        qfb4.a((C5061Kdb) C7676xWa.j(C6875lrb.a(a14, qfb2, C6918mWa.a(), null, null, null, null, 60, null).d().a(C6850lWa.a(olb.v()), (Wnb) olb3, Yqb.PROPERTY_SETTER)));
                        qfb = qfb4;
                    } else {
                        zsb2 = zsb;
                        olb3 = olb2;
                        i = i4;
                        z = true;
                        qfb = C6463fpb.a((C7408tdb) zsb2, a27, C6723jeb.c.a());
                        C7471uYa.a((Object) qfb, "DescriptorFactory.create…ptor */\n                )");
                    }
                } else {
                    zsb2 = zsb;
                    olb3 = olb2;
                    i = i4;
                    z = true;
                    qfb = null;
                }
                a3 = Dmb.y.a(i);
                C7471uYa.a((Object) a3, "Flags.HAS_CONSTANT.get(flags)");
                if (a3.booleanValue()) {
                    zsb2.a(this.b.f().b((PXa<? extends T>) new Arb<Object>(this, olb3, zsb2)));
                }
                zsb2.a(pfb, qfb, new Yeb(a(olb3, false), zsb2), new Yeb(a(olb3, z), zsb2), a((C7083osb) zsb2, a14.g()));
                return zsb2;
            }
        }
        zsb = zsb4;
        wdb = null;
        zsb.a(b3, b4, a16, wdb);
        Boolean a182 = Dmb.b.a(i4);
        C7471uYa.a((Object) a182, "Flags.HAS_ANNOTATIONS.get(flags)");
        int a192 = Dmb.a(a182.booleanValue(), (C7762ymb) Dmb.c.a(i4), (Glb) Dmb.d.a(i4), false, false, false);
        if (!booleanValue6) {
        }
        a2 = Dmb.v.a(i4);
        C7471uYa.a((Object) a2, "Flags.HAS_SETTER.get(flags)");
        if (!a2.booleanValue()) {
        }
        a3 = Dmb.y.a(i);
        C7471uYa.a((Object) a3, "Flags.HAS_CONSTANT.get(flags)");
        if (a3.booleanValue()) {
        }
        zsb2.a(pfb, qfb, new Yeb(a(olb3, false), zsb2), new Yeb(a(olb3, z), zsb2), a((C7083osb) zsb2, a14.g()));
        return zsb2;
    }

    private final a a(C7083osb osb, Rrb rrb) {
        a aVar;
        if (!a(osb)) {
            return a.COMPATIBLE;
        }
        a(rrb);
        if (rrb.a()) {
            aVar = a.INCOMPATIBLE;
        } else {
            aVar = a.COMPATIBLE;
        }
        return aVar;
    }

    private final void a(Rrb rrb) {
        for (C4905Fdb upperBounds : rrb.b()) {
            upperBounds.getUpperBounds();
        }
    }

    private final void a(Asb asb, C7615wdb wdb, C7615wdb wdb2, List<? extends C4905Fdb> list, List<? extends C5061Kdb> list2, C7706xtb xtb, C6314ddb ddb, C5583aeb aeb, Map<? extends a<?>, ?> map, boolean z) {
        Asb asb2 = asb;
        C7615wdb wdb3 = wdb;
        List<? extends C4905Fdb> list3 = list;
        asb2.a(wdb3, wdb2, list3, list2, xtb, ddb, aeb, map, a(asb2, wdb3, list2, list3, xtb, z));
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00a7 A[SYNTHETIC] */
    private final a a(Yrb yrb, C7615wdb wdb, Collection<? extends C5061Kdb> collection, Collection<? extends C4905Fdb> collection2, C7706xtb xtb, boolean z) {
        boolean z2;
        a aVar;
        a aVar2;
        boolean z3;
        boolean z4;
        if (!a((C7083osb) yrb)) {
            return a.COMPATIBLE;
        }
        if (C7471uYa.a((Object) C7148pqb.a((C5272Rcb) yrb), (Object) Irb.a)) {
            return a.COMPATIBLE;
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) collection, 10));
        for (C5061Kdb type : collection) {
            arrayList.add(type.getType());
        }
        List<C7706xtb> c = C7676xWa.c((Collection) arrayList, (Iterable) C6918mWa.b((Object) wdb != null ? wdb.getType() : null));
        if (xtb != null && a(xtb)) {
            return a.INCOMPATIBLE;
        }
        if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
            Iterator it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                List upperBounds = ((C4905Fdb) it.next()).getUpperBounds();
                C7471uYa.a((Object) upperBounds, "typeParameter.upperBounds");
                if (!(upperBounds instanceof Collection) || !upperBounds.isEmpty()) {
                    Iterator it2 = upperBounds.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C7706xtb xtb2 = (C7706xtb) it2.next();
                        C7471uYa.a((Object) xtb2, "it");
                        if (a(xtb2)) {
                            z4 = true;
                            continue;
                            break;
                        }
                    }
                    if (z4) {
                        z2 = true;
                        break;
                    }
                }
                z4 = false;
                continue;
                if (z4) {
                }
            }
        }
        z2 = false;
        if (z2) {
            return a.INCOMPATIBLE;
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) c, 10));
        for (C7706xtb xtb3 : c) {
            C7471uYa.a((Object) xtb3, C1325gg.TYPE);
            if (C5181Obb.h(xtb3) && xtb3.ya().size() <= 3) {
                List ya = xtb3.ya();
                if (!(ya instanceof Collection) || !ya.isEmpty()) {
                    Iterator it3 = ya.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C7706xtb type2 = ((Stb) it3.next()).getType();
                        C7471uYa.a((Object) type2, "it.type");
                        if (a(type2)) {
                            z3 = true;
                            break;
                        }
                    }
                    if (!z3) {
                        aVar2 = a.INCOMPATIBLE;
                    } else {
                        aVar2 = a.NEEDS_WRAPPER;
                    }
                }
                z3 = false;
                if (!z3) {
                }
            } else if (a(xtb3)) {
                aVar2 = a.INCOMPATIBLE;
            } else {
                aVar2 = a.COMPATIBLE;
            }
            arrayList2.add(aVar2);
        }
        a aVar3 = (a) C7676xWa.k((Iterable) arrayList2);
        if (aVar3 == null) {
            aVar3 = a.COMPATIBLE;
        }
        if (z) {
            aVar = a.NEEDS_WRAPPER;
        } else {
            aVar = a.COMPATIBLE;
        }
        return (a) ZWa.b(aVar, aVar3);
    }

    private final boolean a(C7706xtb xtb) {
        return Fub.a(xtb, (_Xa<? super C6405eub, Boolean>) C7633wrb.d);
    }

    private final boolean a(C7083osb osb) {
        boolean z;
        boolean z2;
        if (!this.b.a().e().e()) {
            return false;
        }
        List na = osb.na();
        if (!(na instanceof Collection) || !na.isEmpty()) {
            Iterator it = na.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Lmb lmb = (Lmb) it.next();
                b b2 = lmb.b();
                b bVar = new b(1, 3, 0, 4, null);
                if (!C7471uYa.a((Object) b2, (Object) bVar) || lmb.a() != c.LANGUAGE_VERSION) {
                    z2 = false;
                    continue;
                } else {
                    z2 = true;
                    continue;
                }
                if (z2) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        if (z) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x01ef  */
    public final C7684xdb a(Blb blb) {
        C6723jeb jeb;
        Mmb mmb;
        C7615wdb wdb;
        HVa a2;
        Blb blb2 = blb;
        C7471uYa.b(blb2, "proto");
        int n = blb.B() ? blb.n() : a(blb.p());
        C6723jeb a3 = a((Wnb) blb2, n, Yqb.FUNCTION);
        if (Imb.a(blb)) {
            jeb = a((Wnb) blb2, Yqb.FUNCTION);
        } else {
            jeb = C6723jeb.c.a();
        }
        if (C7471uYa.a((Object) C7148pqb.c(this.b.c()).a(Drb.b(this.b.e(), blb.o())), (Object) Irb.a)) {
            mmb = Mmb.b.a();
        } else {
            mmb = this.b.i();
        }
        Asb asb = new Asb(this.b.c(), null, a3, Drb.b(this.b.e(), blb.o()), Hrb.a.a((Elb) Dmb.l.a(n)), blb, this.b.e(), this.b.h(), mmb, this.b.b(), null, 1024, null);
        C6875lrb lrb = this.b;
        List v = blb.v();
        C7471uYa.a((Object) v, "proto.typeParameterList");
        C6875lrb a4 = C6875lrb.a(lrb, asb, v, null, null, null, null, 60, null);
        _lb a5 = Imb.a(blb2, this.b.h());
        if (a5 != null) {
            C7706xtb b2 = a4.g().b(a5);
            if (b2 != null) {
                wdb = C6463fpb.a((C4904Fcb) asb, b2, jeb);
                C7615wdb wdb2 = wdb;
                C7615wdb a6 = a();
                List b3 = a4.g().b();
                Crb d = a4.d();
                List y = blb.y();
                C7471uYa.a((Object) y, "proto.valueParameterList");
                List a7 = d.a(y, (Wnb) blb2, Yqb.FUNCTION);
                C7706xtb b4 = a4.g().b(Imb.b(blb2, this.b.h()));
                C6314ddb a8 = Hrb.a.a((Glb) Dmb.d.a(n));
                C5583aeb a9 = Hrb.a.a((C7762ymb) Dmb.c.a(n));
                Map a10 = LWa.a();
                Boolean a11 = Dmb.r.a(n);
                String str = "Flags.IS_SUSPEND.get(flags)";
                C7471uYa.a((Object) a11, str);
                Asb asb2 = asb;
                Asb asb3 = asb;
                C5583aeb aeb = a9;
                int i = n;
                Map map = a10;
                Blb blb3 = blb2;
                a(asb2, wdb2, a6, b3, a7, b4, a8, aeb, map, a11.booleanValue());
                Boolean a12 = Dmb.m.a(i);
                C7471uYa.a((Object) a12, "Flags.IS_OPERATOR.get(flags)");
                asb3.h(a12.booleanValue());
                Boolean a13 = Dmb.n.a(i);
                C7471uYa.a((Object) a13, "Flags.IS_INFIX.get(flags)");
                asb3.f(a13.booleanValue());
                Boolean a14 = Dmb.q.a(i);
                C7471uYa.a((Object) a14, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
                asb3.c(a14.booleanValue());
                Boolean a15 = Dmb.o.a(i);
                C7471uYa.a((Object) a15, "Flags.IS_INLINE.get(flags)");
                asb3.g(a15.booleanValue());
                Boolean a16 = Dmb.p.a(i);
                C7471uYa.a((Object) a16, "Flags.IS_TAILREC.get(flags)");
                asb3.j(a16.booleanValue());
                Boolean a17 = Dmb.r.a(i);
                C7471uYa.a((Object) a17, str);
                asb3.i(a17.booleanValue());
                Boolean a18 = Dmb.s.a(i);
                C7471uYa.a((Object) a18, "Flags.IS_EXPECT_FUNCTION.get(flags)");
                asb3.b(a18.booleanValue());
                Asb asb4 = asb3;
                a2 = this.b.a().f().a(blb3, asb4, this.b.h(), this.b.g());
                if (a2 != null) {
                    asb4.a((a) a2.c(), a2.d());
                }
                return asb4;
            }
        }
        wdb = null;
        C7615wdb wdb22 = wdb;
        C7615wdb a62 = a();
        List b32 = a4.g().b();
        Crb d2 = a4.d();
        List y2 = blb.y();
        C7471uYa.a((Object) y2, "proto.valueParameterList");
        List a72 = d2.a(y2, (Wnb) blb2, Yqb.FUNCTION);
        C7706xtb b42 = a4.g().b(Imb.b(blb2, this.b.h()));
        C6314ddb a82 = Hrb.a.a((Glb) Dmb.d.a(n));
        C5583aeb a92 = Hrb.a.a((C7762ymb) Dmb.c.a(n));
        Map a102 = LWa.a();
        Boolean a112 = Dmb.r.a(n);
        String str2 = "Flags.IS_SUSPEND.get(flags)";
        C7471uYa.a((Object) a112, str2);
        Asb asb22 = asb;
        Asb asb32 = asb;
        C5583aeb aeb2 = a92;
        int i2 = n;
        Map map2 = a102;
        Blb blb32 = blb2;
        a(asb22, wdb22, a62, b32, a72, b42, a82, aeb2, map2, a112.booleanValue());
        Boolean a122 = Dmb.m.a(i2);
        C7471uYa.a((Object) a122, "Flags.IS_OPERATOR.get(flags)");
        asb32.h(a122.booleanValue());
        Boolean a132 = Dmb.n.a(i2);
        C7471uYa.a((Object) a132, "Flags.IS_INFIX.get(flags)");
        asb32.f(a132.booleanValue());
        Boolean a142 = Dmb.q.a(i2);
        C7471uYa.a((Object) a142, "Flags.IS_EXTERNAL_FUNCTION.get(flags)");
        asb32.c(a142.booleanValue());
        Boolean a152 = Dmb.o.a(i2);
        C7471uYa.a((Object) a152, "Flags.IS_INLINE.get(flags)");
        asb32.g(a152.booleanValue());
        Boolean a162 = Dmb.p.a(i2);
        C7471uYa.a((Object) a162, "Flags.IS_TAILREC.get(flags)");
        asb32.j(a162.booleanValue());
        Boolean a172 = Dmb.r.a(i2);
        C7471uYa.a((Object) a172, str2);
        asb32.i(a172.booleanValue());
        Boolean a182 = Dmb.s.a(i2);
        C7471uYa.a((Object) a182, "Flags.IS_EXPECT_FUNCTION.get(flags)");
        asb32.b(a182.booleanValue());
        Asb asb42 = asb32;
        a2 = this.b.a().f().a(blb32, asb42, this.b.h(), this.b.g());
        if (a2 != null) {
        }
        return asb42;
    }

    public final C4874Edb a(C5727cmb cmb) {
        C5727cmb cmb2 = cmb;
        C7471uYa.b(cmb2, "proto");
        a aVar = C6723jeb.c;
        List<C5590alb> m = cmb.m();
        C7471uYa.a((Object) m, "proto.annotationList");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) m, 10));
        for (C5590alb alb : m) {
            C6263crb crb = this.a;
            C7471uYa.a((Object) alb, "it");
            arrayList.add(crb.a(alb, this.b.e()));
        }
        Bsb bsb = new Bsb(this.b.f(), this.b.c(), aVar.a(arrayList), Drb.b(this.b.e(), cmb.r()), Hrb.a.a((C7762ymb) Dmb.c.a(cmb.q())), cmb, this.b.e(), this.b.h(), this.b.i(), this.b.b());
        C6875lrb lrb = this.b;
        List t = cmb.t();
        C7471uYa.a((Object) t, "proto.typeParameterList");
        Bsb bsb2 = bsb;
        C6875lrb a2 = C6875lrb.a(lrb, bsb, t, null, null, null, null, 60, null);
        bsb2.a(a2.g().b(), a2.g().a(Imb.b(cmb2, this.b.h())), a2.g().a(Imb.a(cmb2, this.b.h())), a((C7083osb) bsb2, a2.g()));
        return bsb2;
    }

    private final C7615wdb a() {
        C5272Rcb c = this.b.c();
        if (!(c instanceof C5029Jcb)) {
            c = null;
        }
        C5029Jcb jcb = (C5029Jcb) c;
        if (jcb != null) {
            return jcb.O();
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b1, code lost:
        if (a((defpackage.C7083osb) r8) != false) goto L_0x00b5;
     */
    public final C4997Icb a(C6730jlb jlb, boolean z) {
        Zrb zrb;
        a aVar;
        C6730jlb jlb2 = jlb;
        C7471uYa.b(jlb2, "proto");
        C5272Rcb c = this.b.c();
        if (c != null) {
            C5029Jcb jcb = (C5029Jcb) c;
            Zrb zrb2 = new Zrb(jcb, null, a((Wnb) jlb2, jlb.m(), Yqb.FUNCTION), z, a.DECLARATION, jlb, this.b.e(), this.b.h(), this.b.i(), this.b.b(), null, 1024, null);
            Crb d = C6875lrb.a(this.b, zrb2, C6918mWa.a(), null, null, null, null, 60, null).d();
            List o = jlb.o();
            C7471uYa.a((Object) o, "proto.valueParameterList");
            zrb2.a(d.a(o, (Wnb) jlb2, Yqb.FUNCTION), Hrb.a.a((C7762ymb) Dmb.c.a(jlb.m())));
            zrb2.a((C7706xtb) jcb.z());
            C5272Rcb c2 = this.b.c();
            if (!(c2 instanceof C6333dsb)) {
                c2 = null;
            }
            C6333dsb dsb = (C6333dsb) c2;
            boolean z2 = true;
            if (dsb != null) {
                C6875lrb a2 = dsb.a();
                if (a2 != null) {
                    Rrb g = a2.g();
                    if (g != null) {
                        if (g.a()) {
                        }
                    }
                }
            }
            z2 = false;
            if (z2) {
                aVar = a.INCOMPATIBLE;
                zrb = zrb2;
            } else {
                List f = zrb2.f();
                C7471uYa.a((Object) f, "descriptor.valueParameters");
                List typeParameters = zrb2.getTypeParameters();
                C7471uYa.a((Object) typeParameters, "descriptor.typeParameters");
                zrb = zrb2;
                aVar = a(zrb2, null, f, typeParameters, zrb2.a(), false);
            }
            zrb.a(aVar);
            return zrb;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
    }

    private final C6723jeb a(Wnb wnb, int i, Yqb yqb) {
        if (!Dmb.b.a(i).booleanValue()) {
            return C6723jeb.c.a();
        }
        return new Esb(this.b.f(), new C7702xrb(this, wnb, yqb));
    }

    private final C6723jeb a(Olb olb, boolean z) {
        if (!Dmb.b.a(olb.m()).booleanValue()) {
            return C6723jeb.c.a();
        }
        return new Esb(this.b.f(), new C7771yrb(this, z, olb));
    }

    private final C6723jeb a(Wnb wnb, Yqb yqb) {
        return new Xrb(this.b.f(), new C7840zrb(this, wnb, yqb));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ef  */
    private final List<C5061Kdb> a(List<C7003nmb> list, Wnb wnb, Yqb yqb) {
        C6723jeb jeb;
        C5272Rcb c = this.b.c();
        if (c != null) {
            C4904Fcb fcb = (C4904Fcb) c;
            C5272Rcb e = fcb.e();
            C7471uYa.a((Object) e, "callableDescriptor.containingDeclaration");
            Frb a2 = a(e);
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    C7003nmb nmb = (C7003nmb) next;
                    int m = nmb.s() ? nmb.m() : 0;
                    if (a2 != null) {
                        Boolean a3 = Dmb.b.a(m);
                        C7471uYa.a((Object) a3, "Flags.HAS_ANNOTATIONS.get(flags)");
                        if (a3.booleanValue()) {
                            Ssb f = this.b.f();
                            Brb brb = r0;
                            Brb brb2 = new Brb(i, nmb, this, a2, wnb, yqb, fcb);
                            jeb = new Esb(f, brb);
                            C7694xnb b2 = Drb.b(this.b.e(), nmb.n());
                            C7706xtb b3 = this.b.g().b(Imb.a(nmb, this.b.h()));
                            Boolean a4 = Dmb.C.a(m);
                            C7471uYa.a((Object) a4, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
                            boolean booleanValue = a4.booleanValue();
                            Boolean a5 = Dmb.D.a(m);
                            C7471uYa.a((Object) a5, "Flags.IS_CROSSINLINE.get(flags)");
                            boolean booleanValue2 = a5.booleanValue();
                            Boolean a6 = Dmb.E.a(m);
                            C7471uYa.a((Object) a6, "Flags.IS_NOINLINE.get(flags)");
                            boolean booleanValue3 = a6.booleanValue();
                            _lb b4 = Imb.b(nmb, this.b.h());
                            C7706xtb b5 = b4 == null ? this.b.g().b(b4) : null;
                            C7822zdb zdb = C7822zdb.a;
                            C7471uYa.a((Object) zdb, "SourceElement.NO_SOURCE");
                            ArrayList arrayList2 = arrayList;
                            C7755yfb yfb = new C7755yfb(fcb, null, i, jeb, b2, b3, booleanValue, booleanValue2, booleanValue3, b5, zdb);
                            arrayList2.add(yfb);
                            arrayList = arrayList2;
                            i = i2;
                        }
                    }
                    jeb = C6723jeb.c.a();
                    C7694xnb b22 = Drb.b(this.b.e(), nmb.n());
                    C7706xtb b32 = this.b.g().b(Imb.a(nmb, this.b.h()));
                    Boolean a42 = Dmb.C.a(m);
                    C7471uYa.a((Object) a42, "Flags.DECLARES_DEFAULT_VALUE.get(flags)");
                    boolean booleanValue4 = a42.booleanValue();
                    Boolean a52 = Dmb.D.a(m);
                    C7471uYa.a((Object) a52, "Flags.IS_CROSSINLINE.get(flags)");
                    boolean booleanValue22 = a52.booleanValue();
                    Boolean a62 = Dmb.E.a(m);
                    C7471uYa.a((Object) a62, "Flags.IS_NOINLINE.get(flags)");
                    boolean booleanValue32 = a62.booleanValue();
                    _lb b42 = Imb.b(nmb, this.b.h());
                    if (b42 == null) {
                    }
                    C7822zdb zdb2 = C7822zdb.a;
                    C7471uYa.a((Object) zdb2, "SourceElement.NO_SOURCE");
                    ArrayList arrayList22 = arrayList;
                    C7755yfb yfb2 = new C7755yfb(fcb, null, i, jeb, b22, b32, booleanValue4, booleanValue22, booleanValue32, b5, zdb2);
                    arrayList22.add(yfb2);
                    arrayList = arrayList22;
                    i = i2;
                } else {
                    C6782kWa.c();
                    throw null;
                }
            }
            return C7676xWa.q(arrayList);
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
    }

    /* access modifiers changed from: private */
    public final Frb a(C5272Rcb rcb) {
        if (rcb instanceof C6790kdb) {
            return new b(((C6790kdb) rcb).q(), this.b.e(), this.b.h(), this.b.b());
        }
        if (rcb instanceof C6333dsb) {
            return ((C6333dsb) rcb).f();
        }
        return null;
    }
}
