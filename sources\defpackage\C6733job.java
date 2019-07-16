package defpackage;

import com.google.common.base.Ascii;

/* renamed from: job reason: default package and case insensitive filesystem */
/* compiled from: Utf8 */
final class C6733job {
    private static int a(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    private static int a(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    private static int a(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static int b(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return d(bArr, i, i2);
    }

    private static int c(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return a((int) b);
        }
        if (i3 == 1) {
            return a(b, bArr[i]);
        }
        if (i3 == 2) {
            return a((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    private static int d(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return c(bArr, i3, i2);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                } else if (i3 >= i2 - 2) {
                    return c(bArr, i3, i2);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65 && (((b << Ascii.FS) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i3 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
            }
            i = i3;
        }
        return 0;
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return b(bArr, i, i2) == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
        if (r7[r8] > -65) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x007a, code lost:
        if (r7[r6] > -65) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r7[r8] > -65) goto L_0x0017;
     */
    public static int a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b = (byte) i;
            if (b < -32) {
                if (b >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            } else if (b < -16) {
                byte b2 = (byte) (~(i >> 8));
                if (b2 == 0) {
                    int i6 = i2 + 1;
                    byte b3 = bArr[i2];
                    if (i6 >= i3) {
                        return a(b, b3);
                    }
                    byte b4 = b3;
                    i2 = i6;
                    b2 = b4;
                }
                if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            } else {
                byte b5 = (byte) (~(i >> 8));
                byte b6 = 0;
                if (b5 == 0) {
                    i5 = i2 + 1;
                    b5 = bArr[i2];
                    if (i5 >= i3) {
                        return a(b, b5);
                    }
                } else {
                    b6 = (byte) (i >> 16);
                    i5 = i2;
                }
                if (b6 == 0) {
                    int i7 = i5 + 1;
                    b6 = bArr[i5];
                    if (i7 >= i3) {
                        return a((int) b, (int) b5, (int) b6);
                    }
                    i5 = i7;
                }
                if (b5 <= -65 && (((b << Ascii.FS) + (b5 + 112)) >> 30) == 0 && b6 <= -65) {
                    i2 = i5 + 1;
                }
                return -1;
            }
            return b(bArr, i4, i3);
        }
        i4 = i2;
        return b(bArr, i4, i3);
    }
}
