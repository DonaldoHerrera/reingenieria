package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.v reason: case insensitive filesystem */
final class C0798v {
    static int a(int i, byte[] bArr, int i2, int i3, C0770la<?> laVar, C0801w wVar) {
        C0758ha haVar = (C0758ha) laVar;
        int a = a(bArr, i2, wVar);
        while (true) {
            haVar.c(wVar.a);
            if (a >= i3) {
                break;
            }
            int a2 = a(bArr, a, wVar);
            if (i != wVar.a) {
                break;
            }
            a = a(bArr, a2, wVar);
        }
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, C0797ub ubVar, C0801w wVar) throws IOException {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = b(bArr, i2, wVar);
                ubVar.a(i, (Object) Long.valueOf(wVar.b));
                return b;
            } else if (i4 == 1) {
                ubVar.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = a(bArr, i2, wVar);
                int i5 = wVar.a;
                ubVar.a(i, (Object) i5 == 0 ? A.a : A.a(bArr, a, i5));
                return a + i5;
            } else if (i4 == 3) {
                C0797ub c = C0797ub.c();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = a(bArr, i2, wVar);
                    int i8 = wVar.a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a2;
                        break;
                    }
                    i7 = i8;
                    i2 = a(i8, bArr, a2, i3, c, wVar);
                }
                if (i2 > i3 || i7 != i6) {
                    throw C0773ma.d();
                }
                ubVar.a(i, (Object) c);
                return i2;
            } else if (i4 == 5) {
                ubVar.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw C0773ma.b();
            }
        } else {
            throw C0773ma.b();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, C0801w wVar) throws C0773ma {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, wVar);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, wVar) + wVar.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, wVar);
                    i6 = wVar.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, wVar);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw C0773ma.d();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw C0773ma.b();
            }
        } else {
            throw C0773ma.b();
        }
    }

    static int a(int i, byte[] bArr, int i2, C0801w wVar) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Ascii.DEL) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << Ascii.SO;
            } else {
                i5 = i7 | ((b2 & Ascii.DEL) << Ascii.SO);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << Ascii.NAK;
                } else {
                    i7 = i5 | ((b3 & Ascii.DEL) << Ascii.NAK);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << Ascii.FS;
                    } else {
                        int i9 = i7 | ((b4 & Ascii.DEL) << Ascii.FS);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                wVar.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            wVar.a = i7 | i3;
            return i8;
        }
        wVar.a = i5 | i4;
        return i6;
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    static int a(byte[] bArr, int i, C0770la<?> laVar, C0801w wVar) throws IOException {
        C0758ha haVar = (C0758ha) laVar;
        int a = a(bArr, i, wVar);
        int i2 = wVar.a + a;
        while (a < i2) {
            a = a(bArr, a, wVar);
            haVar.c(wVar.a);
        }
        if (a == i2) {
            return a;
        }
        throw C0773ma.a();
    }

    static int a(byte[] bArr, int i, C0801w wVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a((int) b, bArr, i2, wVar);
        }
        wVar.a = b;
        return i2;
    }

    static int b(byte[] bArr, int i, C0801w wVar) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            wVar.b = j;
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
        wVar.b = j3;
        return i3;
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int c(byte[] bArr, int i, C0801w wVar) {
        int a = a(bArr, i, wVar);
        int i2 = wVar.a;
        if (i2 == 0) {
            wVar.c = "";
            return a;
        }
        wVar.c = new String(bArr, a, i2, C0761ia.a);
        return a + i2;
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int d(byte[] bArr, int i, C0801w wVar) throws IOException {
        int a = a(bArr, i, wVar);
        int i2 = wVar.a;
        if (i2 == 0) {
            wVar.c = "";
            return a;
        }
        int i3 = a + i2;
        if (Cb.a(bArr, a, i3)) {
            wVar.c = new String(bArr, a, i2, C0761ia.a);
            return i3;
        }
        throw C0773ma.e();
    }

    static int e(byte[] bArr, int i, C0801w wVar) {
        int a = a(bArr, i, wVar);
        int i2 = wVar.a;
        if (i2 == 0) {
            wVar.c = A.a;
            return a;
        }
        wVar.c = A.a(bArr, a, i2);
        return a + i2;
    }
}
