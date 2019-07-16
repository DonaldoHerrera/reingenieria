package defpackage;

import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: Vv reason: default package and case insensitive filesystem */
final class C0270Vv {
    static int a(byte[] bArr, int i, C0285Yv yv) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a((int) b, bArr, i2, yv);
        }
        yv.a = b;
        return i2;
    }

    static int b(byte[] bArr, int i, C0285Yv yv) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            yv.b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Ascii.DEL)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Ascii.DEL)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        yv.b = j3;
        return i3;
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int e(byte[] bArr, int i, C0285Yv yv) throws C0225Kw {
        int a = a(bArr, i, yv);
        int i2 = yv.a;
        if (i2 < 0) {
            throw C0225Kw.b();
        } else if (i2 > bArr.length - a) {
            throw C0225Kw.a();
        } else if (i2 == 0) {
            yv.c = C0289Zv.a;
            return a;
        } else {
            yv.c = C0289Zv.a(bArr, a, i2);
            return a + i2;
        }
    }

    static int c(byte[] bArr, int i, C0285Yv yv) throws C0225Kw {
        int a = a(bArr, i, yv);
        int i2 = yv.a;
        if (i2 < 0) {
            throw C0225Kw.b();
        } else if (i2 == 0) {
            yv.c = "";
            return a;
        } else {
            yv.c = new String(bArr, a, i2, C0209Gw.a);
            return a + i2;
        }
    }

    static int d(byte[] bArr, int i, C0285Yv yv) throws C0225Kw {
        int a = a(bArr, i, yv);
        int i2 = yv.a;
        if (i2 < 0) {
            throw C0225Kw.b();
        } else if (i2 == 0) {
            yv.c = "";
            return a;
        } else {
            yv.c = Xx.b(bArr, a, i2);
            return a + i2;
        }
    }

    static int a(int i, byte[] bArr, int i2, C0285Yv yv) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            yv.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Ascii.DEL) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            yv.a = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Ascii.DEL) << Ascii.SO);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            yv.a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Ascii.DEL) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            yv.a = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                yv.a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    static int a(C1859xx xxVar, byte[] bArr, int i, int i2, C0285Yv yv) throws IOException {
        int i3 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            i3 = a((int) b, bArr, i3, yv);
            b = yv.a;
        }
        int i4 = i3;
        if (b < 0 || b > i2 - i4) {
            throw C0225Kw.a();
        }
        Object newInstance = xxVar.newInstance();
        int i5 = b + i4;
        xxVar.a(newInstance, bArr, i4, i5, yv);
        xxVar.b(newInstance);
        yv.c = newInstance;
        return i5;
    }

    static int a(C1859xx xxVar, byte[] bArr, int i, int i2, int i3, C0285Yv yv) throws IOException {
        C1496lx lxVar = (C1496lx) xxVar;
        Object newInstance = lxVar.newInstance();
        int a = lxVar.a(newInstance, bArr, i, i2, i3, yv);
        lxVar.b(newInstance);
        yv.c = newInstance;
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, C0213Hw<?> hw, C0285Yv yv) {
        C0203Ew ew = (C0203Ew) hw;
        int a = a(bArr, i2, yv);
        ew.c(yv.a);
        while (a < i3) {
            int a2 = a(bArr, a, yv);
            if (i != yv.a) {
                break;
            }
            a = a(bArr, a2, yv);
            ew.c(yv.a);
        }
        return a;
    }

    static int a(byte[] bArr, int i, C0213Hw<?> hw, C0285Yv yv) throws IOException {
        C0203Ew ew = (C0203Ew) hw;
        int a = a(bArr, i, yv);
        int i2 = yv.a + a;
        while (a < i2) {
            a = a(bArr, a, yv);
            ew.c(yv.a);
        }
        if (a == i2) {
            return a;
        }
        throw C0225Kw.a();
    }

    static int a(C1859xx<?> xxVar, int i, byte[] bArr, int i2, int i3, C0213Hw<?> hw, C0285Yv yv) throws IOException {
        int a = a((C1859xx) xxVar, bArr, i2, i3, yv);
        hw.add(yv.c);
        while (a < i3) {
            int a2 = a(bArr, a, yv);
            if (i != yv.a) {
                break;
            }
            a = a((C1859xx) xxVar, bArr, a2, i3, yv);
            hw.add(yv.c);
        }
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, Rx rx, C0285Yv yv) throws C0225Kw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = b(bArr, i2, yv);
                rx.a(i, (Object) Long.valueOf(yv.b));
                return b;
            } else if (i4 == 1) {
                rx.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = a(bArr, i2, yv);
                int i5 = yv.a;
                if (i5 < 0) {
                    throw C0225Kw.b();
                } else if (i5 <= bArr.length - a) {
                    if (i5 == 0) {
                        rx.a(i, (Object) C0289Zv.a);
                    } else {
                        rx.a(i, (Object) C0289Zv.a(bArr, a, i5));
                    }
                    return a + i5;
                } else {
                    throw C0225Kw.a();
                }
            } else if (i4 == 3) {
                Rx c = Rx.c();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = a(bArr, i2, yv);
                    int i8 = yv.a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a2;
                        break;
                    }
                    i7 = i8;
                    i2 = a(i8, bArr, a2, i3, c, yv);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C0225Kw.h();
                }
                rx.a(i, (Object) c);
                return i2;
            } else if (i4 == 5) {
                rx.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C0225Kw.d();
            }
        } else {
            throw C0225Kw.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, C0285Yv yv) throws C0225Kw {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, yv);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, yv) + yv.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, yv);
                    i6 = yv.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, yv);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C0225Kw.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C0225Kw.d();
            }
        } else {
            throw C0225Kw.d();
        }
    }
}
