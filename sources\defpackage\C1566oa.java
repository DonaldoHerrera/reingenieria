package defpackage;

import java.util.ArrayList;

/* renamed from: oa reason: default package and case insensitive filesystem */
/* compiled from: Chain */
class C1566oa {
    static void a(C1746ua uaVar, C1350ha haVar, int i) {
        int i2;
        C1597pa[] paVarArr;
        int i3;
        if (i == 0) {
            int i4 = uaVar.Da;
            paVarArr = uaVar.Ga;
            i2 = i4;
            i3 = 0;
        } else {
            i3 = 2;
            int i5 = uaVar.Ea;
            i2 = i5;
            paVarArr = uaVar.Fa;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            C1597pa paVar = paVarArr[i6];
            paVar.a();
            if (!uaVar.t(4)) {
                a(uaVar, haVar, i, i3, paVar);
            } else if (!C1896za.a(uaVar, haVar, i, i3, paVar)) {
                a(uaVar, haVar, i, i3, paVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r2.ma == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        if (r2.na == 2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        r5 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x04ae  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x04ba  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x04ce  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0367 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016b  */
    static void a(C1746ua uaVar, C1350ha haVar, int i, int i2, C1597pa paVar) {
        boolean z;
        boolean z2;
        ArrayList<C1716ta> arrayList;
        C1473la laVar;
        C1716ta taVar;
        C1656ra raVar;
        C1656ra raVar2;
        C1656ra raVar3;
        int i3;
        C1716ta taVar2;
        int i4;
        C1473la laVar2;
        C1473la laVar3;
        C1656ra raVar4;
        C1716ta taVar3;
        C1716ta taVar4;
        C1473la laVar4;
        C1473la laVar5;
        C1656ra raVar5;
        float f;
        ArrayList<C1716ta> arrayList2;
        int i5;
        float f2;
        boolean z3;
        int i6;
        C1716ta taVar5;
        boolean z4;
        int i7;
        C1746ua uaVar2 = uaVar;
        C1350ha haVar2 = haVar;
        C1597pa paVar2 = paVar;
        C1716ta taVar6 = paVar2.a;
        C1716ta taVar7 = paVar2.c;
        C1716ta taVar8 = paVar2.b;
        C1716ta taVar9 = paVar2.d;
        C1716ta taVar10 = paVar2.e;
        float f3 = paVar2.k;
        C1716ta taVar11 = paVar2.f;
        C1716ta taVar12 = paVar2.g;
        boolean z5 = uaVar2.F[i] == a.WRAP_CONTENT;
        if (i == 0) {
            z2 = taVar10.ma == 0;
            z = taVar10.ma == 1;
        } else {
            z2 = taVar10.na == 0;
            z = taVar10.na == 1;
        }
        boolean z6 = true;
        boolean z7 = z2;
        C1716ta taVar13 = taVar6;
        boolean z8 = z;
        boolean z9 = z6;
        boolean z10 = false;
        while (true) {
            C1716ta taVar14 = null;
            if (z10) {
                break;
            }
            C1656ra raVar6 = taVar13.D[i2];
            int i8 = (z5 || z9) ? 1 : 4;
            int b = raVar6.b();
            C1656ra raVar7 = raVar6.d;
            if (!(raVar7 == null || taVar13 == taVar6)) {
                b += raVar7.b();
            }
            int i9 = b;
            if (z9 && taVar13 != taVar6 && taVar13 != taVar8) {
                f2 = f3;
                z3 = z10;
                i6 = 6;
            } else if (!z7 || !z5) {
                f2 = f3;
                i6 = i8;
                z3 = z10;
            } else {
                f2 = f3;
                z3 = z10;
                i6 = 4;
            }
            C1656ra raVar8 = raVar6.d;
            if (raVar8 != null) {
                if (taVar13 == taVar8) {
                    z4 = z7;
                    taVar5 = taVar10;
                    haVar2.b(raVar6.j, raVar8.j, i9, 5);
                } else {
                    taVar5 = taVar10;
                    z4 = z7;
                    haVar2.b(raVar6.j, raVar8.j, i9, 6);
                }
                haVar2.a(raVar6.j, raVar6.d.j, i9, i6);
            } else {
                taVar5 = taVar10;
                z4 = z7;
            }
            if (z5) {
                if (taVar13.r() == 8 || taVar13.F[i] != a.MATCH_CONSTRAINT) {
                    i7 = 0;
                } else {
                    C1656ra[] raVarArr = taVar13.D;
                    i7 = 0;
                    haVar2.b(raVarArr[i2 + 1].j, raVarArr[i2].j, 0, 5);
                }
                haVar2.b(taVar13.D[i2].j, uaVar2.D[i2].j, i7, 6);
            }
            C1656ra raVar9 = taVar13.D[i2 + 1].d;
            if (raVar9 != null) {
                C1716ta taVar15 = raVar9.b;
                C1656ra[] raVarArr2 = taVar15.D;
                if (raVarArr2[i2].d != null && raVarArr2[i2].d.b == taVar13) {
                    taVar14 = taVar15;
                }
            }
            if (taVar14 != null) {
                taVar13 = taVar14;
                z10 = z3;
            } else {
                z10 = true;
            }
            f3 = f2;
            z7 = z4;
            taVar10 = taVar5;
        }
        C1716ta taVar16 = taVar10;
        float f4 = f3;
        boolean z11 = z7;
        if (taVar9 != null) {
            C1656ra[] raVarArr3 = taVar7.D;
            int i10 = i2 + 1;
            if (raVarArr3[i10].d != null) {
                C1656ra raVar10 = taVar9.D[i10];
                haVar2.c(raVar10.j, raVarArr3[i10].d.j, -raVar10.b(), 5);
                if (z5) {
                    int i11 = i2 + 1;
                    C1473la laVar6 = uaVar2.D[i11].j;
                    C1656ra[] raVarArr4 = taVar7.D;
                    haVar2.b(laVar6, raVarArr4[i11].j, raVarArr4[i11].b(), 6);
                }
                arrayList = paVar2.h;
                if (arrayList != null) {
                    int size = arrayList.size();
                    if (size > 1) {
                        float f5 = (!paVar2.n || paVar2.p) ? f4 : (float) paVar2.j;
                        float f6 = 0.0f;
                        C1716ta taVar17 = null;
                        int i12 = 0;
                        float f7 = 0.0f;
                        while (i12 < size) {
                            C1716ta taVar18 = (C1716ta) arrayList.get(i12);
                            float f8 = taVar18.qa[i];
                            if (f8 < f6) {
                                if (paVar2.p) {
                                    C1656ra[] raVarArr5 = taVar18.D;
                                    haVar2.a(raVarArr5[i2 + 1].j, raVarArr5[i2].j, 0, 4);
                                    arrayList2 = arrayList;
                                    i5 = size;
                                    i12++;
                                    size = i5;
                                    arrayList = arrayList2;
                                    f6 = 0.0f;
                                } else {
                                    f8 = 1.0f;
                                    f6 = 0.0f;
                                }
                            }
                            if (f8 == f6) {
                                C1656ra[] raVarArr6 = taVar18.D;
                                haVar2.a(raVarArr6[i2 + 1].j, raVarArr6[i2].j, 0, 6);
                                arrayList2 = arrayList;
                                i5 = size;
                                i12++;
                                size = i5;
                                arrayList = arrayList2;
                                f6 = 0.0f;
                            } else {
                                if (taVar17 != null) {
                                    C1656ra[] raVarArr7 = taVar17.D;
                                    C1473la laVar7 = raVarArr7[i2].j;
                                    int i13 = i2 + 1;
                                    C1473la laVar8 = raVarArr7[i13].j;
                                    C1656ra[] raVarArr8 = taVar18.D;
                                    arrayList2 = arrayList;
                                    C1473la laVar9 = raVarArr8[i2].j;
                                    C1473la laVar10 = raVarArr8[i13].j;
                                    i5 = size;
                                    C1257ea b2 = haVar.b();
                                    b2.a(f7, f5, f8, laVar7, laVar8, laVar9, laVar10);
                                    haVar2.a(b2);
                                } else {
                                    arrayList2 = arrayList;
                                    i5 = size;
                                }
                                f7 = f8;
                                taVar17 = taVar18;
                                i12++;
                                size = i5;
                                arrayList = arrayList2;
                                f6 = 0.0f;
                            }
                        }
                    }
                }
                if (taVar8 == null && (taVar8 == taVar9 || z9)) {
                    C1656ra[] raVarArr9 = taVar6.D;
                    C1656ra raVar11 = raVarArr9[i2];
                    int i14 = i2 + 1;
                    C1656ra raVar12 = taVar7.D[i14];
                    C1473la laVar11 = raVarArr9[i2].d != null ? raVarArr9[i2].d.j : null;
                    C1656ra[] raVarArr10 = taVar7.D;
                    C1473la laVar12 = raVarArr10[i14].d != null ? raVarArr10[i14].d.j : null;
                    if (taVar8 == taVar9) {
                        C1656ra[] raVarArr11 = taVar8.D;
                        raVar11 = raVarArr11[i2];
                        raVar12 = raVarArr11[i14];
                    }
                    if (!(laVar11 == null || laVar12 == null)) {
                        if (i == 0) {
                            f = taVar16.aa;
                        } else {
                            f = taVar16.ba;
                        }
                        haVar.a(raVar11.j, laVar11, raVar11.b(), f, laVar12, raVar12.j, raVar12.b(), 5);
                    }
                } else if (z11 || taVar8 == null) {
                    int i15 = 8;
                    if (z8 && taVar8 != null) {
                        int i16 = paVar2.j;
                        boolean z12 = i16 <= 0 && paVar2.i == i16;
                        taVar = taVar8;
                        C1716ta taVar19 = taVar;
                        while (taVar != null) {
                            C1716ta taVar20 = taVar.sa[i];
                            while (taVar20 != null && taVar20.r() == i15) {
                                taVar20 = taVar20.sa[i];
                            }
                            if (taVar == taVar8 || taVar == taVar9 || taVar20 == null) {
                                taVar2 = taVar19;
                                i4 = 8;
                            } else {
                                C1716ta taVar21 = taVar20 == taVar9 ? null : taVar20;
                                C1656ra raVar13 = taVar.D[i2];
                                C1473la laVar13 = raVar13.j;
                                C1656ra raVar14 = raVar13.d;
                                if (raVar14 != null) {
                                    C1473la laVar14 = raVar14.j;
                                }
                                int i17 = i2 + 1;
                                C1473la laVar15 = taVar19.D[i17].j;
                                int b3 = raVar13.b();
                                int b4 = taVar.D[i17].b();
                                if (taVar21 != null) {
                                    raVar4 = taVar21.D[i2];
                                    laVar3 = raVar4.j;
                                    C1656ra raVar15 = raVar4.d;
                                    laVar2 = raVar15 != null ? raVar15.j : null;
                                } else {
                                    raVar4 = taVar.D[i17].d;
                                    laVar3 = raVar4 != null ? raVar4.j : null;
                                    laVar2 = taVar.D[i17].j;
                                }
                                if (raVar4 != null) {
                                    b4 += raVar4.b();
                                }
                                int i18 = b4;
                                if (taVar19 != null) {
                                    b3 += taVar19.D[i17].b();
                                }
                                int i19 = b3;
                                int i20 = z12 ? 6 : 4;
                                if (laVar13 == null || laVar15 == null || laVar3 == null || laVar2 == null) {
                                    taVar3 = taVar21;
                                    taVar2 = taVar19;
                                    i4 = 8;
                                } else {
                                    taVar3 = taVar21;
                                    int i21 = i18;
                                    taVar2 = taVar19;
                                    i4 = 8;
                                    haVar.a(laVar13, laVar15, i19, 0.5f, laVar3, laVar2, i21, i20);
                                }
                                taVar20 = taVar3;
                            }
                            if (taVar.r() == i4) {
                                taVar = taVar2;
                            }
                            taVar19 = taVar;
                            i15 = 8;
                            taVar = taVar20;
                        }
                        C1656ra raVar16 = taVar8.D[i2];
                        raVar = taVar6.D[i2].d;
                        int i22 = i2 + 1;
                        raVar2 = taVar9.D[i22];
                        raVar3 = taVar7.D[i22].d;
                        if (raVar != null) {
                            i3 = 5;
                        } else if (taVar8 != taVar9) {
                            i3 = 5;
                            haVar2.a(raVar16.j, raVar.j, raVar16.b(), 5);
                        } else {
                            i3 = 5;
                            if (raVar3 != null) {
                                haVar.a(raVar16.j, raVar.j, raVar16.b(), 0.5f, raVar2.j, raVar3.j, raVar2.b(), 5);
                            }
                        }
                        if (!(raVar3 == null || taVar8 == taVar9)) {
                            haVar2.a(raVar2.j, raVar3.j, -raVar2.b(), i3);
                        }
                    }
                } else {
                    int i23 = paVar2.j;
                    boolean z13 = i23 > 0 && paVar2.i == i23;
                    C1716ta taVar22 = taVar8;
                    C1716ta taVar23 = taVar22;
                    while (taVar22 != null) {
                        C1716ta taVar24 = taVar22.sa[i];
                        while (true) {
                            if (taVar24 != null) {
                                if (taVar24.r() != 8) {
                                    break;
                                }
                                taVar24 = taVar24.sa[i];
                            } else {
                                break;
                            }
                        }
                        if (taVar24 != null || taVar22 == taVar9) {
                            C1656ra raVar17 = taVar22.D[i2];
                            C1473la laVar16 = raVar17.j;
                            C1656ra raVar18 = raVar17.d;
                            C1473la laVar17 = raVar18 != null ? raVar18.j : null;
                            if (taVar23 != taVar22) {
                                laVar17 = taVar23.D[i2 + 1].j;
                            } else if (taVar22 == taVar8 && taVar23 == taVar22) {
                                C1656ra[] raVarArr12 = taVar6.D;
                                laVar17 = raVarArr12[i2].d != null ? raVarArr12[i2].d.j : null;
                            }
                            int b5 = raVar17.b();
                            int i24 = i2 + 1;
                            int b6 = taVar22.D[i24].b();
                            if (taVar24 != null) {
                                raVar5 = taVar24.D[i2];
                                laVar5 = raVar5.j;
                                laVar4 = taVar22.D[i24].j;
                            } else {
                                raVar5 = taVar7.D[i24].d;
                                laVar5 = raVar5 != null ? raVar5.j : null;
                                laVar4 = taVar22.D[i24].j;
                            }
                            if (raVar5 != null) {
                                b6 += raVar5.b();
                            }
                            if (taVar23 != null) {
                                b5 += taVar23.D[i24].b();
                            }
                            if (!(laVar16 == null || laVar17 == null || laVar5 == null || laVar4 == null)) {
                                if (taVar22 == taVar8) {
                                    b5 = taVar8.D[i2].b();
                                }
                                int i25 = b5;
                                int b7 = taVar22 == taVar9 ? taVar9.D[i24].b() : b6;
                                int i26 = i25;
                                C1473la laVar18 = laVar5;
                                C1473la laVar19 = laVar4;
                                int i27 = b7;
                                taVar4 = taVar24;
                                haVar.a(laVar16, laVar17, i26, 0.5f, laVar18, laVar19, i27, z13 ? 6 : 4);
                                if (taVar22.r() == 8) {
                                    taVar23 = taVar22;
                                }
                                taVar22 = taVar4;
                            }
                        }
                        taVar4 = taVar24;
                        if (taVar22.r() == 8) {
                        }
                        taVar22 = taVar4;
                    }
                }
                if ((!z11 || z8) && taVar8 != null) {
                    C1656ra raVar19 = taVar8.D[i2];
                    int i28 = i2 + 1;
                    C1656ra raVar20 = taVar9.D[i28];
                    C1656ra raVar21 = raVar19.d;
                    laVar = raVar21 == null ? raVar21.j : null;
                    C1656ra raVar22 = raVar20.d;
                    C1473la laVar20 = raVar22 == null ? raVar22.j : null;
                    if (taVar7 != taVar9) {
                        C1656ra raVar23 = taVar7.D[i28].d;
                        laVar20 = raVar23 != null ? raVar23.j : null;
                    }
                    C1473la laVar21 = laVar20;
                    if (taVar8 == taVar9) {
                        C1656ra[] raVarArr13 = taVar8.D;
                        C1656ra raVar24 = raVarArr13[i2];
                        raVar20 = raVarArr13[i28];
                        raVar19 = raVar24;
                    }
                    if (laVar != null && laVar21 != null) {
                        int b8 = raVar19.b();
                        if (taVar9 != null) {
                            taVar7 = taVar9;
                        }
                        haVar.a(raVar19.j, laVar, b8, 0.5f, laVar21, raVar20.j, taVar7.D[i28].b(), 5);
                        return;
                    }
                }
                return;
            }
        }
        if (z5) {
        }
        arrayList = paVar2.h;
        if (arrayList != null) {
        }
        if (taVar8 == null) {
        }
        if (z11) {
        }
        int i152 = 8;
        int i162 = paVar2.j;
        if (i162 <= 0) {
        }
        taVar = taVar8;
        C1716ta taVar192 = taVar;
        while (taVar != null) {
        }
        C1656ra raVar162 = taVar8.D[i2];
        raVar = taVar6.D[i2].d;
        int i222 = i2 + 1;
        raVar2 = taVar9.D[i222];
        raVar3 = taVar7.D[i222].d;
        if (raVar != null) {
        }
        haVar2.a(raVar2.j, raVar3.j, -raVar2.b(), i3);
        if (!z11) {
        }
        C1656ra raVar192 = taVar8.D[i2];
        int i282 = i2 + 1;
        C1656ra raVar202 = taVar9.D[i282];
        C1656ra raVar212 = raVar192.d;
        if (raVar212 == null) {
        }
        C1656ra raVar222 = raVar202.d;
        if (raVar222 == null) {
        }
        if (taVar7 != taVar9) {
        }
        C1473la laVar212 = laVar20;
        if (taVar8 == taVar9) {
        }
        if (laVar != null) {
        }
    }
}
