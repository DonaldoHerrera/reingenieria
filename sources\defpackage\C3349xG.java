package defpackage;

import com.comscore.streaming.ContentType;

/* renamed from: xG reason: default package and case insensitive filesystem */
/* compiled from: MatrixUtil */
final class C3349xG {
    private static final int[][] a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    private static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    private static final int[][] c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    private static final int[][] d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    static void a(C3269tG tGVar) {
        tGVar.a(-1);
    }

    static void b(C3229rG rGVar, C3269tG tGVar) throws C3046iF {
        if (rGVar.c() >= 7) {
            C3248sF sFVar = new C3248sF();
            a(rGVar, sFVar);
            int i = 0;
            int i2 = 17;
            while (i < 6) {
                int i3 = i2;
                for (int i4 = 0; i4 < 3; i4++) {
                    boolean a2 = sFVar.a(i3);
                    i3--;
                    tGVar.a(i, (tGVar.b() - 11) + i4, a2);
                    tGVar.a((tGVar.b() - 11) + i4, i, a2);
                }
                i++;
                i2 = i3;
            }
        }
    }

    private static boolean b(int i) {
        return i == -1;
    }

    private static void c(int i, int i2, C3269tG tGVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                tGVar.a(i + i4, i2 + i3, a[i3][i4]);
            }
        }
    }

    private static void d(C3269tG tGVar) {
        int i = 8;
        while (i < tGVar.c() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (b((int) tGVar.a(i, 6))) {
                tGVar.a(i, 6, i3);
            }
            if (b((int) tGVar.a(6, i))) {
                tGVar.a(6, i, i3);
            }
            i = i2;
        }
    }

    static void a(C3248sF sFVar, C3190pG pGVar, C3229rG rGVar, int i, C3269tG tGVar) throws C3046iF {
        a(tGVar);
        a(rGVar, tGVar);
        a(pGVar, i, tGVar);
        b(rGVar, tGVar);
        a(sFVar, i, tGVar);
    }

    private static void c(C3269tG tGVar) throws C3046iF {
        int length = a[0].length;
        c(0, 0, tGVar);
        c(tGVar.c() - length, 0, tGVar);
        c(0, tGVar.c() - length, tGVar);
        a(0, 7, tGVar);
        a(tGVar.c() - 8, 7, tGVar);
        a(0, tGVar.c() - 8, tGVar);
        d(7, 0, tGVar);
        d((tGVar.b() - 7) - 1, 0, tGVar);
        d(7, tGVar.b() - 7, tGVar);
    }

    static void a(C3229rG rGVar, C3269tG tGVar) throws C3046iF {
        c(tGVar);
        b(tGVar);
        c(rGVar, tGVar);
        d(tGVar);
    }

    private static void b(C3269tG tGVar) throws C3046iF {
        if (tGVar.a(8, tGVar.b() - 8) != 0) {
            tGVar.a(8, tGVar.b() - 8, 1);
            return;
        }
        throw new C3046iF();
    }

    private static void d(int i, int i2, C3269tG tGVar) throws C3046iF {
        int i3 = 0;
        while (i3 < 7) {
            int i4 = i2 + i3;
            if (b((int) tGVar.a(i, i4))) {
                tGVar.a(i, i4, 0);
                i3++;
            } else {
                throw new C3046iF();
            }
        }
    }

    private static void b(int i, int i2, C3269tG tGVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 5; i4++) {
                tGVar.a(i + i4, i2 + i3, b[i3][i4]);
            }
        }
    }

    static void a(C3190pG pGVar, int i, C3269tG tGVar) throws C3046iF {
        C3248sF sFVar = new C3248sF();
        a(pGVar, i, sFVar);
        for (int i2 = 0; i2 < sFVar.i(); i2++) {
            boolean a2 = sFVar.a((sFVar.i() - 1) - i2);
            int[][] iArr = d;
            tGVar.a(iArr[i2][0], iArr[i2][1], a2);
            if (i2 < 8) {
                tGVar.a((tGVar.c() - i2) - 1, 8, a2);
            } else {
                tGVar.a(8, (tGVar.b() - 7) + (i2 - 8), a2);
            }
        }
    }

    private static void c(C3229rG rGVar, C3269tG tGVar) {
        if (rGVar.c() >= 2) {
            int c2 = rGVar.c() - 1;
            int[][] iArr = c;
            int[] iArr2 = iArr[c2];
            int length = iArr[c2].length;
            for (int i = 0; i < length; i++) {
                for (int i2 = 0; i2 < length; i2++) {
                    int i3 = iArr2[i];
                    int i4 = iArr2[i2];
                    if (!(i4 == -1 || i3 == -1 || !b((int) tGVar.a(i4, i3)))) {
                        b(i4 - 2, i3 - 2, tGVar);
                    }
                }
            }
        }
    }

    static void a(C3248sF sFVar, int i, C3269tG tGVar) throws C3046iF {
        boolean z;
        int c2 = tGVar.c() - 1;
        int b2 = tGVar.b() - 1;
        int i2 = 0;
        int i3 = -1;
        while (c2 > 0) {
            if (c2 == 6) {
                c2--;
            }
            while (b2 >= 0 && b2 < tGVar.b()) {
                int i4 = i2;
                for (int i5 = 0; i5 < 2; i5++) {
                    int i6 = c2 - i5;
                    if (b((int) tGVar.a(i6, b2))) {
                        if (i4 < sFVar.i()) {
                            z = sFVar.a(i4);
                            i4++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C3329wG.a(i, i6, b2)) {
                            z = !z;
                        }
                        tGVar.a(i6, b2, z);
                    }
                }
                b2 += i3;
                i2 = i4;
            }
            i3 = -i3;
            b2 += i3;
            c2 -= 2;
        }
        if (i2 != sFVar.i()) {
            StringBuilder sb = new StringBuilder("Not all bits consumed: ");
            sb.append(i2);
            sb.append('/');
            sb.append(sFVar.i());
            throw new C3046iF(sb.toString());
        }
    }

    static int a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    static int a(int i, int i2) {
        if (i2 != 0) {
            int a2 = a(i2);
            int i3 = i << (a2 - 1);
            while (a(i3) >= a2) {
                i3 ^= i2 << (a(i3) - a2);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    static void a(C3190pG pGVar, int i, C3248sF sFVar) throws C3046iF {
        if (C3369yG.a(i)) {
            int a2 = (pGVar.a() << 3) | i;
            sFVar.a(a2, 5);
            sFVar.a(a(a2, 1335), 10);
            C3248sF sFVar2 = new C3248sF();
            sFVar2.a(21522, 15);
            sFVar.b(sFVar2);
            if (sFVar.i() != 15) {
                StringBuilder sb = new StringBuilder("should not happen but we got: ");
                sb.append(sFVar.i());
                throw new C3046iF(sb.toString());
            }
            return;
        }
        throw new C3046iF("Invalid mask pattern");
    }

    static void a(C3229rG rGVar, C3248sF sFVar) throws C3046iF {
        sFVar.a(rGVar.c(), 6);
        sFVar.a(a(rGVar.c(), 7973), 12);
        if (sFVar.i() != 18) {
            StringBuilder sb = new StringBuilder("should not happen but we got: ");
            sb.append(sFVar.i());
            throw new C3046iF(sb.toString());
        }
    }

    private static void a(int i, int i2, C3269tG tGVar) throws C3046iF {
        int i3 = 0;
        while (i3 < 8) {
            int i4 = i + i3;
            if (b((int) tGVar.a(i4, i2))) {
                tGVar.a(i4, i2, 0);
                i3++;
            } else {
                throw new C3046iF();
            }
        }
    }
}
