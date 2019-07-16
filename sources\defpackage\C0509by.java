package defpackage;

import com.google.common.base.Ascii;

/* renamed from: by reason: default package and case insensitive filesystem */
final class C0509by extends Yx {
    C0509by() {
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00b9, code lost:
        return -1;
     */
    public final int a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        long j;
        long j2;
        byte[] bArr2 = bArr;
        int i5 = i2;
        int i6 = i3;
        if ((i5 | i6 | (bArr2.length - i6)) >= 0) {
            long j3 = (long) i5;
            int i7 = (int) (((long) i6) - j3);
            if (i7 >= 16) {
                long j4 = j3;
                i4 = 0;
                while (true) {
                    if (i4 >= i7) {
                        i4 = i7;
                        break;
                    }
                    long j5 = j4 + 1;
                    if (Ux.a(bArr2, j4) < 0) {
                        break;
                    }
                    i4++;
                    j4 = j5;
                }
            } else {
                i4 = 0;
            }
            int i8 = i7 - i4;
            long j6 = j3 + ((long) i4);
            while (true) {
                byte b = 0;
                while (true) {
                    if (i8 <= 0) {
                        j = j6;
                        break;
                    }
                    j = j6 + 1;
                    b = Ux.a(bArr2, j6);
                    if (b < 0) {
                        break;
                    }
                    i8--;
                    j6 = j;
                }
                if (i8 == 0) {
                    return 0;
                }
                int i9 = i8 - 1;
                if (b >= -32) {
                    if (b >= -16) {
                        if (i9 >= 3) {
                            i8 = i9 - 3;
                            long j7 = j + 1;
                            byte a = Ux.a(bArr2, j);
                            if (a > -65 || (((b << Ascii.FS) + (a + 112)) >> 30) != 0) {
                                break;
                            }
                            long j8 = j7 + 1;
                            if (Ux.a(bArr2, j7) > -65) {
                                break;
                            }
                            j2 = j8 + 1;
                            if (Ux.a(bArr2, j8) > -65) {
                                break;
                            }
                        } else {
                            return a(bArr2, (int) b, j, i9);
                        }
                    } else if (i9 >= 2) {
                        i8 = i9 - 2;
                        long j9 = j + 1;
                        byte a2 = Ux.a(bArr2, j);
                        if (a2 > -65 || ((b == -32 && a2 < -96) || (b == -19 && a2 >= -96))) {
                            break;
                        }
                        long j10 = j9 + 1;
                        if (Ux.a(bArr2, j9) > -65) {
                            break;
                        }
                        j6 = j10;
                    } else {
                        return a(bArr2, (int) b, j, i9);
                    }
                } else if (i9 != 0) {
                    i8 = i9 - 1;
                    if (b < -62) {
                        break;
                    }
                    j2 = j + 1;
                    if (Ux.a(bArr2, j) > -65) {
                        break;
                    }
                } else {
                    return b;
                }
                j6 = j2;
            }
            return -1;
        }
        throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr2.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    /* access modifiers changed from: 0000 */
    public final String b(byte[] bArr, int i, int i2) throws C0225Kw {
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r13 < i3) {
                byte a = Ux.a(bArr, (long) r13);
                if (!Zx.d(a)) {
                    break;
                }
                i = r13 + 1;
                int i5 = i4 + 1;
                Zx.b(a, cArr, i4);
                i4 = i5;
            }
            int i6 = i4;
            while (r13 < i3) {
                int i7 = r13 + 1;
                byte a2 = Ux.a(bArr, (long) r13);
                if (Zx.d(a2)) {
                    int i8 = i6 + 1;
                    Zx.b(a2, cArr, i6);
                    while (i7 < i3) {
                        byte a3 = Ux.a(bArr, (long) i7);
                        if (!Zx.d(a3)) {
                            break;
                        }
                        i7++;
                        int i9 = i8 + 1;
                        Zx.b(a3, cArr, i8);
                        i8 = i9;
                    }
                    r13 = i7;
                    i6 = i8;
                } else if (Zx.e(a2)) {
                    if (i7 < i3) {
                        int i10 = i7 + 1;
                        int i11 = i6 + 1;
                        Zx.b(a2, Ux.a(bArr, (long) i7), cArr, i6);
                        r13 = i10;
                        i6 = i11;
                    } else {
                        throw C0225Kw.i();
                    }
                } else if (Zx.f(a2)) {
                    if (i7 < i3 - 1) {
                        int i12 = i7 + 1;
                        int i13 = i12 + 1;
                        int i14 = i6 + 1;
                        Zx.b(a2, Ux.a(bArr, (long) i7), Ux.a(bArr, (long) i12), cArr, i6);
                        r13 = i13;
                        i6 = i14;
                    } else {
                        throw C0225Kw.i();
                    }
                } else if (i7 < i3 - 2) {
                    int i15 = i7 + 1;
                    byte a4 = Ux.a(bArr, (long) i7);
                    int i16 = i15 + 1;
                    int i17 = i16 + 1;
                    int i18 = i6 + 1;
                    Zx.b(a2, a4, Ux.a(bArr, (long) i15), Ux.a(bArr, (long) i16), cArr, i6);
                    r13 = i17;
                    i6 = i18 + 1;
                } else {
                    throw C0225Kw.i();
                }
            }
            return new String(cArr, 0, i6);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    private static int a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            return Xx.b(i);
        }
        if (i2 == 1) {
            return Xx.b(i, Ux.a(bArr, j));
        }
        if (i2 == 2) {
            return Xx.b(i, (int) Ux.a(bArr, j), (int) Ux.a(bArr, j + 1));
        }
        throw new AssertionError();
    }
}
