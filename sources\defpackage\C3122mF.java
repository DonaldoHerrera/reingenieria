package defpackage;

/* renamed from: mF reason: default package and case insensitive filesystem */
/* compiled from: Encoder */
public final class C3122mF {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }

    public static C3084kF a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        C3248sF sFVar;
        int i6;
        C3248sF a2 = new C3170oF(bArr).a();
        int i7 = 11;
        int i8 = ((a2.i() * i) / 100) + 11;
        int i9 = a2.i() + i8;
        int i10 = 32;
        int i11 = 0;
        int i12 = 1;
        if (i2 != 0) {
            z = i2 < 0;
            i4 = Math.abs(i2);
            if (z) {
                i10 = 4;
            }
            if (i4 <= i10) {
                i5 = a(i4, z);
                i3 = a[i4];
                int i13 = i5 - (i5 % i3);
                sFVar = a(a2, i3);
                int i14 = sFVar.i() + i8;
                String str = "Data to large for user specified layer";
                if (i14 > i13) {
                    throw new IllegalArgumentException(str);
                } else if (z && sFVar.i() > (i3 << 6)) {
                    throw new IllegalArgumentException(str);
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            C3248sF sFVar2 = null;
            int i15 = 0;
            i3 = 0;
            while (i15 <= 32) {
                boolean z2 = i15 <= 3;
                int i16 = z2 ? i15 + 1 : i15;
                int a3 = a(i16, z2);
                if (i9 <= a3) {
                    int[] iArr = a;
                    if (i3 != iArr[i16]) {
                        i3 = iArr[i16];
                        sFVar2 = a(a2, i3);
                    }
                    int i17 = a3 - (a3 % i3);
                    if ((!z2 || sFVar2.i() <= (i3 << 6)) && sFVar2.i() + i8 <= i17) {
                        sFVar = sFVar2;
                        z = z2;
                        i4 = i16;
                        i5 = a3;
                    }
                }
                i15++;
                i11 = 0;
                i12 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        C3248sF b = b(sFVar, i5, i3);
        int i18 = sFVar.i() / i3;
        C3248sF a4 = a(z, i4, i18);
        if (!z) {
            i7 = 14;
        }
        int i19 = i7 + (i4 << 2);
        int[] iArr2 = new int[i19];
        int i20 = 2;
        if (z) {
            for (int i21 = 0; i21 < iArr2.length; i21++) {
                iArr2[i21] = i21;
            }
            i6 = i19;
        } else {
            int i22 = i19 / 2;
            i6 = i19 + 1 + (((i22 - 1) / 15) * 2);
            int i23 = i6 / 2;
            for (int i24 = 0; i24 < i22; i24++) {
                int i25 = (i24 / 15) + i24;
                iArr2[(i22 - i24) - i12] = (i23 - i25) - 1;
                iArr2[i22 + i24] = i25 + i23 + i12;
            }
        }
        C3268tF tFVar = new C3268tF(i6);
        int i26 = 0;
        int i27 = 0;
        while (i26 < i4) {
            int i28 = ((i4 - i26) << i20) + (z ? 9 : 12);
            int i29 = 0;
            while (i29 < i28) {
                int i30 = i29 << 1;
                while (i11 < i20) {
                    if (b.a(i27 + i30 + i11)) {
                        int i31 = i26 << 1;
                        tFVar.b(iArr2[i31 + i11], iArr2[i31 + i29]);
                    }
                    if (b.a((i28 << 1) + i27 + i30 + i11)) {
                        int i32 = i26 << 1;
                        tFVar.b(iArr2[i32 + i29], iArr2[((i19 - 1) - i32) - i11]);
                    }
                    if (b.a((i28 << 2) + i27 + i30 + i11)) {
                        int i33 = (i19 - 1) - (i26 << 1);
                        tFVar.b(iArr2[i33 - i11], iArr2[i33 - i29]);
                    }
                    if (b.a((i28 * 6) + i27 + i30 + i11)) {
                        int i34 = i26 << 1;
                        tFVar.b(iArr2[((i19 - 1) - i34) - i29], iArr2[i34 + i11]);
                    }
                    i11++;
                    i20 = 2;
                }
                i29++;
                i11 = 0;
                i20 = 2;
            }
            i27 += i28 << 3;
            i26++;
            i11 = 0;
            i20 = 2;
        }
        a(tFVar, z, i6, a4);
        if (z) {
            a(tFVar, i6 / 2, 5);
        } else {
            int i35 = i6 / 2;
            a(tFVar, i35, 7);
            int i36 = 0;
            int i37 = 0;
            while (i36 < (i19 / 2) - 1) {
                for (int i38 = i35 & 1; i38 < i6; i38 += 2) {
                    int i39 = i35 - i37;
                    tFVar.b(i39, i38);
                    int i40 = i35 + i37;
                    tFVar.b(i40, i38);
                    tFVar.b(i38, i39);
                    tFVar.b(i38, i40);
                }
                i36 += 15;
                i37 += 16;
            }
        }
        C3084kF kFVar = new C3084kF();
        kFVar.a(z);
        kFVar.c(i6);
        kFVar.b(i4);
        kFVar.a(i18);
        kFVar.a(tFVar);
        return kFVar;
    }

    private static C3248sF b(C3248sF sFVar, int i, int i2) {
        int i3 = sFVar.i() / i2;
        C3348xF xFVar = new C3348xF(a(i2));
        int i4 = i / i2;
        int[] a2 = a(sFVar, i2, i4);
        xFVar.a(a2, i4 - i3);
        int i5 = i % i2;
        C3248sF sFVar2 = new C3248sF();
        sFVar2.a(0, i5);
        for (int a3 : a2) {
            sFVar2.a(a3, i2);
        }
        return sFVar2;
    }

    private static void a(C3268tF tFVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                tFVar.b(i5, i4);
                tFVar.b(i5, i6);
                tFVar.b(i4, i5);
                tFVar.b(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        tFVar.b(i7, i7);
        int i8 = i7 + 1;
        tFVar.b(i8, i7);
        tFVar.b(i7, i8);
        int i9 = i + i2;
        tFVar.b(i9, i7);
        tFVar.b(i9, i8);
        tFVar.b(i9, i9 - 1);
    }

    static C3248sF a(boolean z, int i, int i2) {
        C3248sF sFVar = new C3248sF();
        if (z) {
            sFVar.a(i - 1, 2);
            sFVar.a(i2 - 1, 6);
            return b(sFVar, 28, 4);
        }
        sFVar.a(i - 1, 5);
        sFVar.a(i2 - 1, 11);
        return b(sFVar, 40, 4);
    }

    private static void a(C3268tF tFVar, boolean z, int i, C3248sF sFVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (sFVar.a(i3)) {
                    tFVar.b(i4, i2 - 5);
                }
                if (sFVar.a(i3 + 7)) {
                    tFVar.b(i2 + 5, i4);
                }
                if (sFVar.a(20 - i3)) {
                    tFVar.b(i4, i2 + 5);
                }
                if (sFVar.a(27 - i3)) {
                    tFVar.b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (sFVar.a(i3)) {
                tFVar.b(i5, i2 - 7);
            }
            if (sFVar.a(i3 + 10)) {
                tFVar.b(i2 + 7, i5);
            }
            if (sFVar.a(29 - i3)) {
                tFVar.b(i5, i2 + 7);
            }
            if (sFVar.a(39 - i3)) {
                tFVar.b(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static int[] a(C3248sF sFVar, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = sFVar.i() / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 |= sFVar.a((i4 * i) + i6) ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static C3308vF a(int i) {
        if (i == 4) {
            return C3308vF.d;
        }
        if (i == 6) {
            return C3308vF.c;
        }
        if (i == 8) {
            return C3308vF.g;
        }
        if (i == 10) {
            return C3308vF.b;
        }
        if (i == 12) {
            return C3308vF.a;
        }
        StringBuilder sb = new StringBuilder("Unsupported word size ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    static C3248sF a(C3248sF sFVar, int i) {
        C3248sF sFVar2 = new C3248sF();
        int i2 = sFVar.i();
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || sFVar.a(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                sFVar2.a(i8, i);
            } else if (i8 == 0) {
                sFVar2.a(i5 | 1, i);
            } else {
                sFVar2.a(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return sFVar2;
    }
}
