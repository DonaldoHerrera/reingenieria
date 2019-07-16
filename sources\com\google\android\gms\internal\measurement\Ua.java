package com.google.android.gms.internal.measurement;

import com.google.common.base.Ascii;
import java.io.IOException;

final class Ua {
    static int a(byte[] bArr, int i, Ta ta) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a((int) b, bArr, i2, ta);
        }
        ta.a = b;
        return i2;
    }

    static int b(byte[] bArr, int i, Ta ta) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            ta.b = j;
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
        ta.b = j3;
        return i3;
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int e(byte[] bArr, int i, Ta ta) throws Rb {
        int a = a(bArr, i, ta);
        int i2 = ta.a;
        if (i2 < 0) {
            throw Rb.b();
        } else if (i2 > bArr.length - a) {
            throw Rb.a();
        } else if (i2 == 0) {
            ta.c = Ya.a;
            return a;
        } else {
            ta.c = Ya.a(bArr, a, i2);
            return a + i2;
        }
    }

    static int c(byte[] bArr, int i, Ta ta) throws Rb {
        int a = a(bArr, i, ta);
        int i2 = ta.a;
        if (i2 < 0) {
            throw Rb.b();
        } else if (i2 == 0) {
            ta.c = "";
            return a;
        } else {
            ta.c = new String(bArr, a, i2, Hb.a);
            return a + i2;
        }
    }

    static int d(byte[] bArr, int i, Ta ta) throws Rb {
        int a = a(bArr, i, ta);
        int i2 = ta.a;
        if (i2 < 0) {
            throw Rb.b();
        } else if (i2 == 0) {
            ta.c = "";
            return a;
        } else {
            ta.c = C0958fd.b(bArr, a, i2);
            return a + i2;
        }
    }

    static int a(int i, byte[] bArr, int i2, Ta ta) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            ta.a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Ascii.DEL) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            ta.a = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Ascii.DEL) << Ascii.SO);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            ta.a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Ascii.DEL) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            ta.a = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                ta.a = i11;
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
    static int a(Ec ec, byte[] bArr, int i, int i2, Ta ta) throws IOException {
        int i3 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            i3 = a((int) b, bArr, i3, ta);
            b = ta.a;
        }
        int i4 = i3;
        if (b < 0 || b > i2 - i4) {
            throw Rb.a();
        }
        Object newInstance = ec.newInstance();
        int i5 = b + i4;
        ec.a(newInstance, bArr, i4, i5, ta);
        ec.b(newInstance);
        ta.c = newInstance;
        return i5;
    }

    static int a(Ec ec, byte[] bArr, int i, int i2, int i3, Ta ta) throws IOException {
        C1043tc tcVar = (C1043tc) ec;
        Object newInstance = tcVar.newInstance();
        int a = tcVar.a(newInstance, bArr, i, i2, i3, ta);
        tcVar.b(newInstance);
        ta.c = newInstance;
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, Ob<?> ob, Ta ta) {
        Jb jb = (Jb) ob;
        int a = a(bArr, i2, ta);
        jb.c(ta.a);
        while (a < i3) {
            int a2 = a(bArr, a, ta);
            if (i != ta.a) {
                break;
            }
            a = a(bArr, a2, ta);
            jb.c(ta.a);
        }
        return a;
    }

    static int a(byte[] bArr, int i, Ob<?> ob, Ta ta) throws IOException {
        Jb jb = (Jb) ob;
        int a = a(bArr, i, ta);
        int i2 = ta.a + a;
        while (a < i2) {
            a = a(bArr, a, ta);
            jb.c(ta.a);
        }
        if (a == i2) {
            return a;
        }
        throw Rb.a();
    }

    static int a(Ec<?> ec, int i, byte[] bArr, int i2, int i3, Ob<?> ob, Ta ta) throws IOException {
        int a = a((Ec) ec, bArr, i2, i3, ta);
        ob.add(ta.c);
        while (a < i3) {
            int a2 = a(bArr, a, ta);
            if (i != ta.a) {
                break;
            }
            a = a((Ec) ec, bArr, a2, i3, ta);
            ob.add(ta.c);
        }
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, _c _cVar, Ta ta) throws Rb {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = b(bArr, i2, ta);
                _cVar.a(i, (Object) Long.valueOf(ta.b));
                return b;
            } else if (i4 == 1) {
                _cVar.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = a(bArr, i2, ta);
                int i5 = ta.a;
                if (i5 < 0) {
                    throw Rb.b();
                } else if (i5 <= bArr.length - a) {
                    if (i5 == 0) {
                        _cVar.a(i, (Object) Ya.a);
                    } else {
                        _cVar.a(i, (Object) Ya.a(bArr, a, i5));
                    }
                    return a + i5;
                } else {
                    throw Rb.a();
                }
            } else if (i4 == 3) {
                _c d = _c.d();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = a(bArr, i2, ta);
                    int i8 = ta.a;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = a2;
                        break;
                    }
                    i7 = i8;
                    i2 = a(i8, bArr, a2, i3, d, ta);
                }
                if (i2 > i3 || i7 != i6) {
                    throw Rb.h();
                }
                _cVar.a(i, (Object) d);
                return i2;
            } else if (i4 == 5) {
                _cVar.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw Rb.d();
            }
        } else {
            throw Rb.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, Ta ta) throws Rb {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, ta);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, ta) + ta.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, ta);
                    i6 = ta.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, ta);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw Rb.h();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw Rb.d();
            }
        } else {
            throw Rb.d();
        }
    }
}
