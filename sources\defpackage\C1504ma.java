package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: ma reason: default package and case insensitive filesystem */
/* compiled from: Analyzer */
public class C1504ma {
    public static void a(C1746ua uaVar) {
        if ((uaVar.M() & 32) != 32) {
            b(uaVar);
            return;
        }
        uaVar.Oa = true;
        uaVar.Ia = false;
        uaVar.Ja = false;
        uaVar.Ka = false;
        ArrayList<C1716ta> arrayList = uaVar.va;
        List<C1776va> list = uaVar.Ha;
        boolean z = uaVar.j() == a.WRAP_CONTENT;
        boolean z2 = uaVar.q() == a.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (C1716ta taVar : arrayList) {
            taVar.s = null;
            taVar.la = false;
            taVar.F();
        }
        for (C1716ta taVar2 : arrayList) {
            if (taVar2.s == null && !a(taVar2, list, z3)) {
                b(uaVar);
                uaVar.Oa = false;
                return;
            }
        }
        int i = 0;
        int i2 = 0;
        for (C1776va vaVar : list) {
            i = Math.max(i, a(vaVar, 0));
            i2 = Math.max(i2, a(vaVar, 1));
        }
        if (z) {
            uaVar.a(a.FIXED);
            uaVar.o(i);
            uaVar.Ia = true;
            uaVar.Ja = true;
            uaVar.La = i;
        }
        if (z2) {
            uaVar.b(a.FIXED);
            uaVar.g(i2);
            uaVar.Ia = true;
            uaVar.Ka = true;
            uaVar.Ma = i2;
        }
        a(list, 0, uaVar.s());
        a(list, 1, uaVar.i());
    }

    private static void b(C1746ua uaVar) {
        uaVar.Ha.clear();
        uaVar.Ha.add(0, new C1776va(uaVar.va));
    }

    private static boolean a(C1716ta taVar, List<C1776va> list, boolean z) {
        C1776va vaVar = new C1776va(new ArrayList(), true);
        list.add(vaVar);
        return a(taVar, vaVar, list, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0181, code lost:
        if (r3.b == r4) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0128, code lost:
        if (r3.b == r4) goto L_0x012a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01c2  */
    private static boolean a(C1716ta taVar, C1776va vaVar, List<C1776va> list, boolean z) {
        C1656ra raVar;
        if (taVar == null) {
            return true;
        }
        taVar.ka = false;
        C1746ua uaVar = (C1746ua) taVar.k();
        C1776va vaVar2 = taVar.s;
        if (vaVar2 == null) {
            taVar.ja = true;
            vaVar.a.add(taVar);
            taVar.s = vaVar;
            if (taVar.v.d == null && taVar.x.d == null && taVar.w.d == null && taVar.y.d == null && taVar.z.d == null && taVar.C.d == null) {
                a(uaVar, taVar, vaVar);
                if (z) {
                    return false;
                }
            }
            if (!(taVar.w.d == null || taVar.y.d == null)) {
                a q = uaVar.q();
                a aVar = a.WRAP_CONTENT;
                if (z) {
                    a(uaVar, taVar, vaVar);
                    return false;
                } else if (!(taVar.w.d.b == taVar.k() && taVar.y.d.b == taVar.k())) {
                    a(uaVar, taVar, vaVar);
                }
            }
            if (!(taVar.v.d == null || taVar.x.d == null)) {
                a j = uaVar.j();
                a aVar2 = a.WRAP_CONTENT;
                if (z) {
                    a(uaVar, taVar, vaVar);
                    return false;
                } else if (!(taVar.v.d.b == taVar.k() && taVar.x.d.b == taVar.k())) {
                    a(uaVar, taVar, vaVar);
                }
            }
            if (((taVar.j() == a.MATCH_CONSTRAINT) ^ (taVar.q() == a.MATCH_CONSTRAINT)) && taVar.J != 0.0f) {
                a(taVar);
            } else if (taVar.j() == a.MATCH_CONSTRAINT || taVar.q() == a.MATCH_CONSTRAINT) {
                a(uaVar, taVar, vaVar);
                if (z) {
                    return false;
                }
            }
            if (!(taVar.v.d == null && taVar.x.d == null)) {
                C1656ra raVar2 = taVar.v.d;
                if (!(raVar2 != null && raVar2.b == taVar.G && taVar.x.d == null)) {
                    C1656ra raVar3 = taVar.x.d;
                    if (!(raVar3 != null && raVar3.b == taVar.G && taVar.v.d == null)) {
                        C1656ra raVar4 = taVar.v.d;
                        if (raVar4 != null) {
                            C1716ta taVar2 = raVar4.b;
                            C1716ta taVar3 = taVar.G;
                            if (taVar2 == taVar3) {
                                C1656ra raVar5 = taVar.x.d;
                                if (raVar5 != null) {
                                }
                            }
                        }
                        if (!(taVar.w.d == null && taVar.y.d == null)) {
                            C1656ra raVar6 = taVar.w.d;
                            if (!(raVar6 != null && raVar6.b == taVar.G && taVar.y.d == null)) {
                                C1656ra raVar7 = taVar.y.d;
                                if (!(raVar7 != null && raVar7.b == taVar.G && taVar.w.d == null)) {
                                    raVar = taVar.w.d;
                                    if (raVar != null) {
                                        C1716ta taVar4 = raVar.b;
                                        C1716ta taVar5 = taVar.G;
                                        if (taVar4 == taVar5) {
                                            C1656ra raVar8 = taVar.y.d;
                                            if (raVar8 != null) {
                                            }
                                        }
                                    }
                                    if (taVar instanceof C1866ya) {
                                        a(uaVar, taVar, vaVar);
                                        if (z) {
                                            return false;
                                        }
                                        C1866ya yaVar = (C1866ya) taVar;
                                        for (int i = 0; i < yaVar.wa; i++) {
                                            if (!a(yaVar.va[i], vaVar, list, z)) {
                                                return false;
                                            }
                                        }
                                    }
                                    for (C1656ra raVar9 : taVar.D) {
                                        C1656ra raVar10 = raVar9.d;
                                        if (!(raVar10 == null || raVar10.b == taVar.k())) {
                                            if (raVar9.c == c.CENTER) {
                                                a(uaVar, taVar, vaVar);
                                                if (z) {
                                                    return false;
                                                }
                                            } else {
                                                a(raVar9);
                                            }
                                            if (!a(raVar9.d.b, vaVar, list, z)) {
                                                return false;
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                        }
                        if (taVar.C.d == null && taVar.z.d == null && !(taVar instanceof C1836xa) && !(taVar instanceof C1866ya)) {
                            vaVar.g.add(taVar);
                        }
                        if (taVar instanceof C1866ya) {
                        }
                        while (r4 < r3) {
                        }
                        return true;
                    }
                }
            }
            if (taVar.C.d == null && !(taVar instanceof C1836xa) && !(taVar instanceof C1866ya)) {
                vaVar.f.add(taVar);
            }
            C1656ra raVar62 = taVar.w.d;
            C1656ra raVar72 = taVar.y.d;
            raVar = taVar.w.d;
            if (raVar != null) {
            }
            if (taVar instanceof C1866ya) {
            }
            while (r4 < r3) {
            }
            return true;
        }
        if (vaVar2 != vaVar) {
            vaVar.a.addAll(vaVar2.a);
            vaVar.f.addAll(taVar.s.f);
            vaVar.g.addAll(taVar.s.g);
            if (!taVar.s.d) {
                vaVar.d = false;
            }
            list.remove(taVar.s);
            for (C1716ta taVar6 : taVar.s.a) {
                taVar6.s = vaVar;
            }
        }
        return true;
    }

    private static void a(C1746ua uaVar, C1716ta taVar, C1776va vaVar) {
        vaVar.d = false;
        uaVar.Oa = false;
        taVar.ja = false;
    }

    private static int a(C1776va vaVar, int i) {
        int i2 = i * 2;
        List a = vaVar.a(i);
        int size = a.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C1716ta taVar = (C1716ta) a.get(i4);
            C1656ra[] raVarArr = taVar.D;
            int i5 = i2 + 1;
            i3 = Math.max(i3, a(taVar, i, raVarArr[i5].d == null || !(raVarArr[i2].d == null || raVarArr[i5].d == null), 0));
        }
        vaVar.e[i] = i3;
        return i3;
    }

    private static int a(C1716ta taVar, int i, boolean z, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int s;
        int i9;
        int i10;
        int i11;
        C1716ta taVar2 = taVar;
        int i12 = i;
        boolean z2 = z;
        int i13 = 0;
        if (!taVar2.ja) {
            return 0;
        }
        boolean z3 = taVar2.z.d != null && i12 == 1;
        if (z2) {
            i6 = taVar.c();
            i5 = taVar.i() - taVar.c();
            i4 = i12 * 2;
            i3 = i4 + 1;
        } else {
            i6 = taVar.i() - taVar.c();
            i5 = taVar.c();
            i3 = i12 * 2;
            i4 = i3 + 1;
        }
        C1656ra[] raVarArr = taVar2.D;
        if (raVarArr[i3].d == null || raVarArr[i4].d != null) {
            i7 = i3;
            i8 = 1;
        } else {
            i7 = i4;
            i4 = i3;
            i8 = -1;
        }
        int b = (taVar2.D[i4].b() * i8) + a(taVar, i);
        int i14 = (z3 ? i2 - i6 : i2) + b;
        int s2 = (i12 == 0 ? taVar.s() : taVar.i()) * i8;
        Iterator it = taVar2.D[i4].d().a.iterator();
        while (it.hasNext()) {
            i13 = Math.max(i13, a(((C0192Ba) it.next()).c.b, i12, z2, i14));
        }
        Iterator it2 = taVar2.D[i7].d().a.iterator();
        int i15 = 0;
        while (it2.hasNext()) {
            Iterator it3 = it2;
            i15 = Math.max(i15, a(((C0192Ba) it2.next()).c.b, i12, z2, s2 + i14));
            it2 = it3;
        }
        if (z3) {
            i13 -= i6;
            s = i15 + i5;
        } else {
            s = i15 + ((i12 == 0 ? taVar.s() : taVar.i()) * i8);
        }
        int i16 = 1;
        if (i12 == 1) {
            Iterator it4 = taVar2.z.d().a.iterator();
            int i17 = 0;
            while (it4.hasNext()) {
                Iterator it5 = it4;
                C0192Ba ba = (C0192Ba) it4.next();
                if (i8 == i16) {
                    i17 = Math.max(i17, a(ba.c.b, i12, z2, i6 + i14));
                    i11 = i7;
                } else {
                    i11 = i7;
                    i17 = Math.max(i17, a(ba.c.b, i12, z2, (i5 * i8) + i14));
                }
                it4 = it5;
                i7 = i11;
                i16 = 1;
            }
            i9 = i7;
            int i18 = i17;
            i10 = (taVar2.z.d().a.size() <= 0 || z3) ? i18 : i8 == 1 ? i18 + i6 : i18 - i5;
        } else {
            i9 = i7;
            i10 = 0;
        }
        int max = b + Math.max(i13, Math.max(s, i10));
        int i19 = i14 + s2;
        if (i8 != -1) {
            int i20 = i14;
            i14 = i19;
            i19 = i20;
        }
        if (z2) {
            C1896za.a(taVar2, i12, i19);
            taVar2.a(i19, i14, i12);
        } else {
            taVar2.s.a(taVar2, i12);
            taVar2.d(i19, i12);
        }
        if (taVar.c(i) == a.MATCH_CONSTRAINT && taVar2.J != 0.0f) {
            taVar2.s.a(taVar2, i12);
        }
        C1656ra[] raVarArr2 = taVar2.D;
        if (!(raVarArr2[i4].d == null || raVarArr2[i9].d == null)) {
            C1716ta k = taVar.k();
            C1656ra[] raVarArr3 = taVar2.D;
            if (raVarArr3[i4].d.b == k && raVarArr3[i9].d.b == k) {
                taVar2.s.a(taVar2, i12);
            }
        }
        return max;
    }

    private static void a(C1656ra raVar) {
        C0192Ba d = raVar.d();
        C1656ra raVar2 = raVar.d;
        if (raVar2 != null && raVar2.d != raVar) {
            raVar2.d().a(d);
        }
    }

    public static void a(List<C1776va> list, int i, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            for (C1716ta taVar : ((C1776va) list.get(i3)).b(i)) {
                if (taVar.ja) {
                    a(taVar, i, i2);
                }
            }
        }
    }

    private static void a(C1716ta taVar, int i, int i2) {
        int i3 = i * 2;
        C1656ra[] raVarArr = taVar.D;
        C1656ra raVar = raVarArr[i3];
        C1656ra raVar2 = raVarArr[i3 + 1];
        if ((raVar.d == null || raVar2.d == null) ? false : true) {
            C1896za.a(taVar, i, a(taVar, i) + raVar.b());
        } else if (taVar.J == 0.0f || taVar.c(i) != a.MATCH_CONSTRAINT) {
            int e = i2 - taVar.e(i);
            int d = e - taVar.d(i);
            taVar.a(d, e, i);
            C1896za.a(taVar, i, d);
        } else {
            int a = a(taVar);
            int i4 = (int) taVar.D[i3].d().h;
            int i5 = i4 + a;
            raVar2.d().g = raVar.d();
            raVar2.d().h = (float) a;
            raVar2.d().b = 1;
            taVar.a(i4, i5, i);
        }
    }

    private static int a(C1716ta taVar, int i) {
        int i2 = i * 2;
        C1656ra[] raVarArr = taVar.D;
        C1656ra raVar = raVarArr[i2];
        C1656ra raVar2 = raVarArr[i2 + 1];
        C1656ra raVar3 = raVar.d;
        if (raVar3 != null) {
            C1716ta taVar2 = raVar3.b;
            C1716ta taVar3 = taVar.G;
            if (taVar2 == taVar3) {
                C1656ra raVar4 = raVar2.d;
                if (raVar4 != null && raVar4.b == taVar3) {
                    return (int) (((float) (((taVar3.d(i) - raVar.b()) - raVar2.b()) - taVar.d(i))) * (i == 0 ? taVar.aa : taVar.ba));
                }
            }
        }
        return 0;
    }

    private static int a(C1716ta taVar) {
        float f;
        float f2;
        if (taVar.j() == a.MATCH_CONSTRAINT) {
            if (taVar.K == 0) {
                f2 = ((float) taVar.i()) * taVar.J;
            } else {
                f2 = ((float) taVar.i()) / taVar.J;
            }
            int i = (int) f2;
            taVar.o(i);
            return i;
        } else if (taVar.q() != a.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (taVar.K == 1) {
                f = ((float) taVar.s()) * taVar.J;
            } else {
                f = ((float) taVar.s()) / taVar.J;
            }
            int i2 = (int) f;
            taVar.g(i2);
            return i2;
        }
    }
}
