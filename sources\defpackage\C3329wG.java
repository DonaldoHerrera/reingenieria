package defpackage;

/* renamed from: wG reason: default package and case insensitive filesystem */
/* compiled from: MaskUtil */
final class C3329wG {
    static int a(C3269tG tGVar) {
        return a(tGVar, true) + a(tGVar, false);
    }

    static int b(C3269tG tGVar) {
        byte[][] a = tGVar.a();
        int c = tGVar.c();
        int b = tGVar.b();
        int i = 0;
        int i2 = 0;
        while (i < b - 1) {
            int i3 = i2;
            int i4 = 0;
            while (i4 < c - 1) {
                byte b2 = a[i][i4];
                int i5 = i4 + 1;
                if (b2 == a[i][i5]) {
                    int i6 = i + 1;
                    if (b2 == a[i6][i4] && b2 == a[i6][i5]) {
                        i3++;
                    }
                }
                i4 = i5;
            }
            i++;
            i2 = i3;
        }
        return i2 * 3;
    }

    static int c(C3269tG tGVar) {
        byte[][] a = tGVar.a();
        int c = tGVar.c();
        int b = tGVar.b();
        int i = 0;
        int i2 = 0;
        while (i < b) {
            int i3 = i2;
            for (int i4 = 0; i4 < c; i4++) {
                byte[] bArr = a[i];
                int i5 = i4 + 6;
                if (i5 < c && bArr[i4] == 1 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 1 && bArr[i4 + 3] == 1 && bArr[i4 + 4] == 1 && bArr[i4 + 5] == 0 && bArr[i5] == 1 && (a(bArr, i4 - 4, i4) || a(bArr, i4 + 7, i4 + 11))) {
                    i3++;
                }
                int i6 = i + 6;
                if (i6 < b && a[i][i4] == 1 && a[i + 1][i4] == 0 && a[i + 2][i4] == 1 && a[i + 3][i4] == 1 && a[i + 4][i4] == 1 && a[i + 5][i4] == 0 && a[i6][i4] == 1 && (a(a, i4, i - 4, i) || a(a, i4, i + 7, i + 11))) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        return i2 * 40;
    }

    static int d(C3269tG tGVar) {
        byte[][] a = tGVar.a();
        int c = tGVar.c();
        int b = tGVar.b();
        int i = 0;
        int i2 = 0;
        while (i < b) {
            byte[] bArr = a[i];
            int i3 = i2;
            for (int i4 = 0; i4 < c; i4++) {
                if (bArr[i4] == 1) {
                    i3++;
                }
            }
            i++;
            i2 = i3;
        }
        int b2 = tGVar.b() * tGVar.c();
        return ((Math.abs((i2 << 1) - b2) * 10) / b2) * 10;
    }

    private static boolean a(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean a(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        r3 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        r1 = r3 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        if (r1 != 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0028, code lost:
        r1 = r1 & 1;
     */
    static boolean a(int i, int i2, int i3) {
        int i4;
        int i5;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                i4 = i2 % 3;
                break;
            case 3:
                i4 = (i3 + i2) % 3;
                break;
            case 4:
                i3 /= 2;
                i2 /= 3;
                break;
            case 5:
                int i6 = i3 * i2;
                i4 = (i6 & 1) + (i6 % 3);
                break;
            case 6:
                int i7 = i3 * i2;
                i5 = (i7 & 1) + (i7 % 3);
                break;
            case 7:
                i5 = ((i3 * i2) % 3) + ((i3 + i2) & 1);
                break;
            default:
                StringBuilder sb = new StringBuilder("Invalid mask pattern: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private static int a(C3269tG tGVar, boolean z) {
        int b = z ? tGVar.b() : tGVar.c();
        int c = z ? tGVar.c() : tGVar.b();
        byte[][] a = tGVar.a();
        int i = 0;
        int i2 = 0;
        while (i < b) {
            int i3 = i2;
            int i4 = 0;
            int i5 = 0;
            byte b2 = -1;
            while (i4 < c) {
                byte b3 = z ? a[i][i4] : a[i4][i];
                if (b3 == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b2 = b3;
                }
                i4++;
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
            i2 = i3;
            i++;
        }
        return i2;
    }
}
