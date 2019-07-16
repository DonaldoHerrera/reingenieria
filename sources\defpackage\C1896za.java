package defpackage;

/* renamed from: za reason: default package and case insensitive filesystem */
/* compiled from: Optimizer */
public class C1896za {
    static boolean[] a = new boolean[3];

    static void a(C1746ua uaVar, C1350ha haVar, C1716ta taVar) {
        if (uaVar.F[0] != a.WRAP_CONTENT && taVar.F[0] == a.MATCH_PARENT) {
            int i = taVar.v.e;
            int s = uaVar.s() - taVar.x.e;
            C1656ra raVar = taVar.v;
            raVar.j = haVar.a((Object) raVar);
            C1656ra raVar2 = taVar.x;
            raVar2.j = haVar.a((Object) raVar2);
            haVar.a(taVar.v.j, i);
            haVar.a(taVar.x.j, s);
            taVar.b = 2;
            taVar.a(i, s);
        }
        if (uaVar.F[1] != a.WRAP_CONTENT && taVar.F[1] == a.MATCH_PARENT) {
            int i2 = taVar.w.e;
            int i3 = uaVar.i() - taVar.y.e;
            C1656ra raVar3 = taVar.w;
            raVar3.j = haVar.a((Object) raVar3);
            C1656ra raVar4 = taVar.y;
            raVar4.j = haVar.a((Object) raVar4);
            haVar.a(taVar.w.j, i2);
            haVar.a(taVar.y.j, i3);
            if (taVar.V > 0 || taVar.r() == 8) {
                C1656ra raVar5 = taVar.z;
                raVar5.j = haVar.a((Object) raVar5);
                haVar.a(taVar.z.j, taVar.V + i2);
            }
            taVar.c = 2;
            taVar.e(i2, i3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    private static boolean a(C1716ta taVar, int i) {
        a[] aVarArr = taVar.F;
        if (aVarArr[i] != a.MATCH_CONSTRAINT) {
            return false;
        }
        char c = 1;
        if (taVar.J != 0.0f) {
            if (i != 0) {
                c = 0;
            }
            if (aVarArr[c] == a.MATCH_CONSTRAINT) {
            }
            return false;
        }
        if (i == 0) {
            if (taVar.f == 0 && taVar.i == 0 && taVar.j == 0) {
                return true;
            }
            return false;
        } else if (taVar.g != 0 || taVar.l != 0 || taVar.m != 0) {
            return false;
        }
        return true;
    }

    static void a(int i, C1716ta taVar) {
        C1716ta taVar2 = taVar;
        taVar.I();
        C0192Ba d = taVar2.v.d();
        C0192Ba d2 = taVar2.w.d();
        C0192Ba d3 = taVar2.x.d();
        C0192Ba d4 = taVar2.y.d();
        boolean z = (i & 8) == 8;
        boolean z2 = taVar2.F[0] == a.MATCH_CONSTRAINT && a(taVar2, 0);
        if (!(d.i == 4 || d3.i == 4)) {
            if (taVar2.F[0] == a.FIXED || (z2 && taVar.r() == 8)) {
                if (taVar2.v.d == null && taVar2.x.d == null) {
                    d.b(1);
                    d3.b(1);
                    if (z) {
                        d3.a(d, 1, taVar.m());
                    } else {
                        d3.a(d, taVar.s());
                    }
                } else if (taVar2.v.d != null && taVar2.x.d == null) {
                    d.b(1);
                    d3.b(1);
                    if (z) {
                        d3.a(d, 1, taVar.m());
                    } else {
                        d3.a(d, taVar.s());
                    }
                } else if (taVar2.v.d == null && taVar2.x.d != null) {
                    d.b(1);
                    d3.b(1);
                    d.a(d3, -taVar.s());
                    if (z) {
                        d.a(d3, -1, taVar.m());
                    } else {
                        d.a(d3, -taVar.s());
                    }
                } else if (!(taVar2.v.d == null || taVar2.x.d == null)) {
                    d.b(2);
                    d3.b(2);
                    if (z) {
                        taVar.m().a(d);
                        taVar.m().a(d3);
                        d.b(d3, -1, taVar.m());
                        d3.b(d, 1, taVar.m());
                    } else {
                        d.b(d3, (float) (-taVar.s()));
                        d3.b(d, (float) taVar.s());
                    }
                }
            } else if (z2) {
                int s = taVar.s();
                d.b(1);
                d3.b(1);
                if (taVar2.v.d == null && taVar2.x.d == null) {
                    if (z) {
                        d3.a(d, 1, taVar.m());
                    } else {
                        d3.a(d, s);
                    }
                } else if (taVar2.v.d == null || taVar2.x.d != null) {
                    if (taVar2.v.d != null || taVar2.x.d == null) {
                        if (!(taVar2.v.d == null || taVar2.x.d == null)) {
                            if (z) {
                                taVar.m().a(d);
                                taVar.m().a(d3);
                            }
                            if (taVar2.J == 0.0f) {
                                d.b(3);
                                d3.b(3);
                                d.b(d3, 0.0f);
                                d3.b(d, 0.0f);
                            } else {
                                d.b(2);
                                d3.b(2);
                                d.b(d3, (float) (-s));
                                d3.b(d, (float) s);
                                taVar2.o(s);
                            }
                        }
                    } else if (z) {
                        d.a(d3, -1, taVar.m());
                    } else {
                        d.a(d3, -s);
                    }
                } else if (z) {
                    d3.a(d, 1, taVar.m());
                } else {
                    d3.a(d, s);
                }
            }
        }
        boolean z3 = taVar2.F[1] == a.MATCH_CONSTRAINT && a(taVar2, 1);
        if (d2.i != 4 && d4.i != 4) {
            if (taVar2.F[1] == a.FIXED || (z3 && taVar.r() == 8)) {
                if (taVar2.w.d == null && taVar2.y.d == null) {
                    d2.b(1);
                    d4.b(1);
                    if (z) {
                        d4.a(d2, 1, taVar.l());
                    } else {
                        d4.a(d2, taVar.i());
                    }
                    C1656ra raVar = taVar2.z;
                    if (raVar.d != null) {
                        raVar.d().b(1);
                        d2.a(1, taVar2.z.d(), -taVar2.V);
                    }
                } else if (taVar2.w.d != null && taVar2.y.d == null) {
                    d2.b(1);
                    d4.b(1);
                    if (z) {
                        d4.a(d2, 1, taVar.l());
                    } else {
                        d4.a(d2, taVar.i());
                    }
                    if (taVar2.V > 0) {
                        taVar2.z.d().a(1, d2, taVar2.V);
                    }
                } else if (taVar2.w.d == null && taVar2.y.d != null) {
                    d2.b(1);
                    d4.b(1);
                    if (z) {
                        d2.a(d4, -1, taVar.l());
                    } else {
                        d2.a(d4, -taVar.i());
                    }
                    if (taVar2.V > 0) {
                        taVar2.z.d().a(1, d2, taVar2.V);
                    }
                } else if (taVar2.w.d != null && taVar2.y.d != null) {
                    d2.b(2);
                    d4.b(2);
                    if (z) {
                        d2.b(d4, -1, taVar.l());
                        d4.b(d2, 1, taVar.l());
                        taVar.l().a(d2);
                        taVar.m().a(d4);
                    } else {
                        d2.b(d4, (float) (-taVar.i()));
                        d4.b(d2, (float) taVar.i());
                    }
                    if (taVar2.V > 0) {
                        taVar2.z.d().a(1, d2, taVar2.V);
                    }
                }
            } else if (z3) {
                int i2 = taVar.i();
                d2.b(1);
                d4.b(1);
                if (taVar2.w.d == null && taVar2.y.d == null) {
                    if (z) {
                        d4.a(d2, 1, taVar.l());
                    } else {
                        d4.a(d2, i2);
                    }
                } else if (taVar2.w.d == null || taVar2.y.d != null) {
                    if (taVar2.w.d != null || taVar2.y.d == null) {
                        if (taVar2.w.d != null && taVar2.y.d != null) {
                            if (z) {
                                taVar.l().a(d2);
                                taVar.m().a(d4);
                            }
                            if (taVar2.J == 0.0f) {
                                d2.b(3);
                                d4.b(3);
                                d2.b(d4, 0.0f);
                                d4.b(d2, 0.0f);
                                return;
                            }
                            d2.b(2);
                            d4.b(2);
                            d2.b(d4, (float) (-i2));
                            d4.b(d2, (float) i2);
                            taVar2.g(i2);
                            if (taVar2.V > 0) {
                                taVar2.z.d().a(1, d2, taVar2.V);
                            }
                        }
                    } else if (z) {
                        d2.a(d4, -1, taVar.l());
                    } else {
                        d2.a(d4, -i2);
                    }
                } else if (z) {
                    d4.a(d2, 1, taVar.l());
                } else {
                    d4.a(d2, i2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        if (r7.ma == 2) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7.na == 2) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0109  */
    static boolean a(C1746ua uaVar, C1350ha haVar, int i, int i2, C1597pa paVar) {
        boolean z;
        boolean z2;
        float f;
        int i3;
        int i4;
        float f2;
        C1716ta taVar;
        boolean z3;
        int i5;
        C1350ha haVar2 = haVar;
        int i6 = i;
        C1597pa paVar2 = paVar;
        C1716ta taVar2 = paVar2.a;
        C1716ta taVar3 = paVar2.c;
        C1716ta taVar4 = paVar2.b;
        C1716ta taVar5 = paVar2.d;
        C1716ta taVar6 = paVar2.e;
        float f3 = paVar2.k;
        C1716ta taVar7 = paVar2.f;
        C1716ta taVar8 = paVar2.g;
        a aVar = uaVar.F[i6];
        a aVar2 = a.WRAP_CONTENT;
        if (i6 == 0) {
            z2 = taVar6.ma == 0;
            z = taVar6.ma == 1;
        } else {
            z2 = taVar6.na == 0;
            z = taVar6.na == 1;
        }
        boolean z4 = true;
        C1716ta taVar9 = taVar2;
        int i7 = 0;
        boolean z5 = false;
        int i8 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        while (!z5) {
            if (taVar9.r() != 8) {
                i8++;
                if (i6 == 0) {
                    i5 = taVar9.s();
                } else {
                    i5 = taVar9.i();
                }
                f4 += (float) i5;
                if (taVar9 != taVar4) {
                    f4 += (float) taVar9.D[i2].b();
                }
                if (taVar9 != taVar5) {
                    f4 += (float) taVar9.D[i2 + 1].b();
                }
                f5 = f5 + ((float) taVar9.D[i2].b()) + ((float) taVar9.D[i2 + 1].b());
            }
            C1656ra raVar = taVar9.D[i2];
            if (taVar9.r() != 8 && taVar9.F[i6] == a.MATCH_CONSTRAINT) {
                i7++;
                if (i6 != 0) {
                    z3 = false;
                    if (taVar9.g != 0) {
                        return false;
                    }
                    if (taVar9.l == 0) {
                        if (taVar9.m != 0) {
                        }
                    }
                    return z3;
                } else if (taVar9.f != 0) {
                    return false;
                } else {
                    z3 = false;
                    if (!(taVar9.i == 0 && taVar9.j == 0)) {
                        return false;
                    }
                }
                if (taVar9.J != 0.0f) {
                    return z3;
                }
            }
            C1656ra raVar2 = taVar9.D[i2 + 1].d;
            if (raVar2 != null) {
                C1716ta taVar10 = raVar2.b;
                C1656ra[] raVarArr = taVar10.D;
                C1716ta taVar11 = taVar10;
                if (raVarArr[i2].d != null && raVarArr[i2].d.b == taVar9) {
                    taVar = taVar11;
                    if (taVar == null) {
                        taVar9 = taVar;
                    } else {
                        z5 = true;
                    }
                }
            }
            taVar = null;
            if (taVar == null) {
            }
        }
        C0192Ba d = taVar2.D[i2].d();
        int i9 = i2 + 1;
        C0192Ba d2 = taVar3.D[i9].d();
        C0192Ba ba = d.e;
        if (ba != null) {
            C1716ta taVar12 = taVar2;
            C0192Ba ba2 = d2.e;
            if (ba2 != null) {
                if (ba.b != 1 || ba2.b != 1) {
                    return false;
                }
                if (i7 > 0 && i7 != i8) {
                    return false;
                }
                if (z4 || z2 || z) {
                    f = taVar4 != null ? (float) taVar4.D[i2].b() : 0.0f;
                    if (taVar5 != null) {
                        f += (float) taVar5.D[i9].b();
                    }
                } else {
                    f = 0.0f;
                }
                float f6 = d.e.h;
                float f7 = d2.e.h;
                float f8 = (f6 < f7 ? f7 - f6 : f6 - f7) - f4;
                if (i7 <= 0 || i7 != i8) {
                    C1350ha haVar3 = haVar;
                    if (f8 < 0.0f) {
                        z4 = true;
                        z2 = false;
                        z = false;
                    }
                    if (z4) {
                        C1716ta taVar13 = taVar12;
                        float b = f6 + ((f8 - f) * taVar13.b(i6));
                        while (taVar13 != null) {
                            C1381ia iaVar = C1350ha.b;
                            if (iaVar != null) {
                                iaVar.z--;
                                iaVar.r++;
                                iaVar.x++;
                            }
                            C1716ta taVar14 = taVar13.sa[i6];
                            if (taVar14 != null || taVar13 == taVar3) {
                                if (i6 == 0) {
                                    i4 = taVar13.s();
                                } else {
                                    i4 = taVar13.i();
                                }
                                float f9 = (float) i4;
                                float b2 = b + ((float) taVar13.D[i2].b());
                                taVar13.D[i2].d().a(d.g, b2);
                                float f10 = b2 + f9;
                                taVar13.D[i9].d().a(d.g, f10);
                                taVar13.D[i2].d().a(haVar3);
                                taVar13.D[i9].d().a(haVar3);
                                b = f10 + ((float) taVar13.D[i9].b());
                            }
                            taVar13 = taVar14;
                        }
                    } else {
                        C1716ta taVar15 = taVar12;
                        if (z2 || z) {
                            if (z2 || z) {
                                f8 -= f;
                            }
                            float f11 = f8 / ((float) (i8 + 1));
                            if (z) {
                                f11 = f8 / (i8 > 1 ? (float) (i8 - 1) : 2.0f);
                            }
                            float f12 = taVar15.r() != 8 ? f6 + f11 : f6;
                            if (z && i8 > 1) {
                                f12 = ((float) taVar4.D[i2].b()) + f6;
                            }
                            if (z2 && taVar4 != null) {
                                f12 += (float) taVar4.D[i2].b();
                            }
                            while (taVar15 != null) {
                                C1381ia iaVar2 = C1350ha.b;
                                if (iaVar2 != null) {
                                    iaVar2.z--;
                                    iaVar2.r++;
                                    iaVar2.x++;
                                }
                                C1716ta taVar16 = taVar15.sa[i6];
                                if (taVar16 != null || taVar15 == taVar3) {
                                    if (i6 == 0) {
                                        i3 = taVar15.s();
                                    } else {
                                        i3 = taVar15.i();
                                    }
                                    float f13 = (float) i3;
                                    if (taVar15 != taVar4) {
                                        f12 += (float) taVar15.D[i2].b();
                                    }
                                    taVar15.D[i2].d().a(d.g, f12);
                                    taVar15.D[i9].d().a(d.g, f12 + f13);
                                    taVar15.D[i2].d().a(haVar3);
                                    taVar15.D[i9].d().a(haVar3);
                                    f12 += f13 + ((float) taVar15.D[i9].b());
                                    if (taVar16 != null) {
                                        if (taVar16.r() != 8) {
                                            f12 += f11;
                                        }
                                        taVar15 = taVar16;
                                    }
                                }
                                taVar15 = taVar16;
                            }
                        }
                    }
                    return true;
                } else if (taVar9.k() != null && taVar9.k().F[i6] == a.WRAP_CONTENT) {
                    return false;
                } else {
                    float f14 = (f8 + f4) - f5;
                    float f15 = f6;
                    C1716ta taVar17 = taVar12;
                    while (taVar17 != null) {
                        C1381ia iaVar3 = C1350ha.b;
                        if (iaVar3 != null) {
                            iaVar3.z--;
                            iaVar3.r++;
                            iaVar3.x++;
                        }
                        C1716ta taVar18 = taVar17.sa[i6];
                        if (taVar18 != null || taVar17 == taVar3) {
                            float f16 = f14 / ((float) i7);
                            if (f3 > 0.0f) {
                                float[] fArr = taVar17.qa;
                                if (fArr[i6] == -1.0f) {
                                    f2 = 0.0f;
                                    if (taVar17.r() == 8) {
                                        f2 = 0.0f;
                                    }
                                    float b3 = f15 + ((float) taVar17.D[i2].b());
                                    taVar17.D[i2].d().a(d.g, b3);
                                    float f17 = b3 + f2;
                                    taVar17.D[i9].d().a(d.g, f17);
                                    C1350ha haVar4 = haVar;
                                    taVar17.D[i2].d().a(haVar4);
                                    taVar17.D[i9].d().a(haVar4);
                                    f15 = f17 + ((float) taVar17.D[i9].b());
                                } else {
                                    f16 = (fArr[i6] * f14) / f3;
                                }
                            }
                            f2 = f16;
                            if (taVar17.r() == 8) {
                            }
                            float b32 = f15 + ((float) taVar17.D[i2].b());
                            taVar17.D[i2].d().a(d.g, b32);
                            float f172 = b32 + f2;
                            taVar17.D[i9].d().a(d.g, f172);
                            C1350ha haVar42 = haVar;
                            taVar17.D[i2].d().a(haVar42);
                            taVar17.D[i9].d().a(haVar42);
                            f15 = f172 + ((float) taVar17.D[i9].b());
                        } else {
                            C1350ha haVar5 = haVar;
                        }
                        taVar17 = taVar18;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    static void a(C1716ta taVar, int i, int i2) {
        int i3 = i * 2;
        int i4 = i3 + 1;
        taVar.D[i3].d().g = taVar.k().v.d();
        taVar.D[i3].d().h = (float) i2;
        taVar.D[i3].d().b = 1;
        taVar.D[i4].d().g = taVar.D[i3].d();
        taVar.D[i4].d().h = (float) taVar.d(i);
        taVar.D[i4].d().b = 1;
    }
}
