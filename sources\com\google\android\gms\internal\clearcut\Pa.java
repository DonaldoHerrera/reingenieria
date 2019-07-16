package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

final class Pa<T> implements C0741bb<T> {
    private static final Unsafe a = Ab.d();
    private final int[] b;
    private final Object[] c;
    private final int d;
    private final int e;
    private final int f;
    private final La g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int[] m;
    private final int[] n;
    private final Sa o;
    private final C0802wa p;
    private final C0794tb<?, ?> q;
    private final T<?> r;
    private final Ga s;

    private Pa(int[] iArr, Object[] objArr, int i2, int i3, int i4, La la, boolean z, boolean z2, int[] iArr2, int[] iArr3, int[] iArr4, Sa sa, C0802wa waVar, C0794tb<?, ?> tbVar, T<?> t, Ga ga) {
        La la2 = la;
        T<?> t2 = t;
        this.b = iArr;
        this.c = objArr;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.i = la2 instanceof C0755ga;
        this.j = z;
        this.h = t2 != null && t2.a(la);
        this.k = false;
        this.l = iArr2;
        this.m = iArr3;
        this.n = iArr4;
        this.o = sa;
        this.p = waVar;
        this.q = tbVar;
        this.r = t2;
        this.g = la2;
        this.s = ga;
    }

    private static int a(int i2, byte[] bArr, int i3, int i4, Object obj, C0801w wVar) throws IOException {
        return C0798v.a(i2, bArr, i3, i4, e(obj), wVar);
    }

    private static int a(C0741bb<?> bbVar, int i2, byte[] bArr, int i3, int i4, C0770la<?> laVar, C0801w wVar) throws IOException {
        int a2 = a((C0741bb) bbVar, bArr, i3, i4, wVar);
        while (true) {
            laVar.add(wVar.c);
            if (a2 >= i4) {
                break;
            }
            int a3 = C0798v.a(bArr, a2, wVar);
            if (i2 != wVar.a) {
                break;
            }
            a2 = a((C0741bb) bbVar, bArr, a3, i4, wVar);
        }
        return a2;
    }

    private static int a(C0741bb bbVar, byte[] bArr, int i2, int i3, int i4, C0801w wVar) throws IOException {
        Pa pa = (Pa) bbVar;
        Object newInstance = pa.newInstance();
        int a2 = pa.a((T) newInstance, bArr, i2, i3, i4, wVar);
        pa.d((T) newInstance);
        wVar.c = newInstance;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [int] */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    private static int a(C0741bb bbVar, byte[] bArr, int i2, int i3, C0801w wVar) throws IOException {
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            i4 = C0798v.a((int) b2, bArr, i4, wVar);
            b2 = wVar.a;
        }
        int i5 = i4;
        if (b2 < 0 || b2 > i3 - i5) {
            throw C0773ma.a();
        }
        Object newInstance = bbVar.newInstance();
        int i6 = b2 + i5;
        bbVar.a(newInstance, bArr, i5, i6, wVar);
        bbVar.d(newInstance);
        wVar.c = newInstance;
        return i6;
    }

    private static <UT, UB> int a(C0794tb<UT, UB> tbVar, T t) {
        return tbVar.b(tbVar.c(t));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        r2 = r2 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0143, code lost:
        r3 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0150, code lost:
        r3 = java.lang.Long.valueOf(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0154, code lost:
        r12.putObject(r1, r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0162, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0173, code lost:
        r12.putObject(r1, r9, r2);
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0178, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return r2;
     */
    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C0801w wVar) throws IOException {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        long j3;
        int b2;
        int i11;
        int i12;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i13 = i2;
        int i14 = i4;
        int i15 = i5;
        int i16 = i6;
        long j4 = j2;
        int i17 = i9;
        C0801w wVar2 = wVar;
        Unsafe unsafe = a;
        long j5 = (long) (this.b[i17 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i16 == 1) {
                    obj = Double.valueOf(C0798v.c(bArr, i2));
                    break;
                }
                break;
            case 52:
                if (i16 == 5) {
                    obj2 = Float.valueOf(C0798v.d(bArr, i2));
                    break;
                }
                break;
            case 53:
            case 54:
                if (i16 == 0) {
                    b2 = C0798v.b(bArr2, i13, wVar2);
                    j3 = wVar2.b;
                    break;
                }
                break;
            case 55:
            case 62:
                if (i16 == 0) {
                    i10 = C0798v.a(bArr2, i13, wVar2);
                    i11 = wVar2.a;
                    break;
                }
                break;
            case 56:
            case 65:
                if (i16 == 1) {
                    obj = Long.valueOf(C0798v.b(bArr, i2));
                    break;
                }
                break;
            case 57:
            case 64:
                if (i16 == 5) {
                    obj2 = Integer.valueOf(C0798v.a(bArr, i2));
                    break;
                }
                break;
            case 58:
                if (i16 == 0) {
                    i10 = C0798v.b(bArr2, i13, wVar2);
                    obj3 = Boolean.valueOf(wVar2.b != 0);
                    break;
                }
                break;
            case 59:
                if (i16 == 2) {
                    i10 = C0798v.a(bArr2, i13, wVar2);
                    i12 = wVar2.a;
                    if (i12 == 0) {
                        obj3 = "";
                        break;
                    } else if ((i7 & 536870912) == 0 || Cb.a(bArr2, i10, i10 + i12)) {
                        unsafe.putObject(t2, j4, new String(bArr2, i10, i12, C0761ia.a));
                        break;
                    } else {
                        throw C0773ma.e();
                    }
                }
                break;
            case 60:
                if (i16 == 2) {
                    i10 = a(a(i17), bArr2, i13, i3, wVar2);
                    Object object = unsafe.getInt(t2, j5) == i15 ? unsafe.getObject(t2, j4) : null;
                    if (object != null) {
                        obj3 = C0761ia.a(object, wVar2.c);
                        break;
                    } else {
                        obj3 = wVar2.c;
                        break;
                    }
                }
                break;
            case 61:
                if (i16 == 2) {
                    i10 = C0798v.a(bArr2, i13, wVar2);
                    i12 = wVar2.a;
                    if (i12 != 0) {
                        unsafe.putObject(t2, j4, A.a(bArr2, i10, i12));
                        break;
                    } else {
                        obj3 = A.a;
                        break;
                    }
                }
                break;
            case 63:
                if (i16 == 0) {
                    int a2 = C0798v.a(bArr2, i13, wVar2);
                    int i18 = wVar2.a;
                    C0767ka c2 = c(i17);
                    if (c2 == null || c2.a(i18) != null) {
                        unsafe.putObject(t2, j4, Integer.valueOf(i18));
                        i10 = a2;
                        break;
                    } else {
                        e((Object) t).a(i14, (Object) Long.valueOf((long) i18));
                        return a2;
                    }
                }
                break;
            case 66:
                if (i16 == 0) {
                    i10 = C0798v.a(bArr2, i13, wVar2);
                    i11 = J.a(wVar2.a);
                    break;
                }
                break;
            case 67:
                if (i16 == 0) {
                    b2 = C0798v.b(bArr2, i13, wVar2);
                    j3 = J.a(wVar2.b);
                    break;
                }
                break;
            case 68:
                if (i16 == 3) {
                    i10 = a(a(i17), bArr, i2, i3, (i14 & -8) | 4, wVar);
                    Object object2 = unsafe.getInt(t2, j5) == i15 ? unsafe.getObject(t2, j4) : null;
                    if (object2 != null) {
                        obj3 = C0761ia.a(object2, wVar2.c);
                        break;
                    } else {
                        obj3 = wVar2.c;
                        break;
                    }
                }
                break;
        }
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.clearcut.x.a(boolean):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0236, code lost:
        if (r7.b != 0) goto L_0x0238;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0238, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x023a, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x023b, code lost:
        r11.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x023e, code lost:
        if (r4 >= r5) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0240, code lost:
        r6 = com.google.android.gms.internal.clearcut.C0798v.a(r3, r4, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0246, code lost:
        if (r2 != r7.a) goto L_0x039f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0248, code lost:
        r4 = com.google.android.gms.internal.clearcut.C0798v.b(r3, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0250, code lost:
        if (r7.b == 0) goto L_0x023a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        if (r4 == 0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013c, code lost:
        r11.add(com.google.android.gms.internal.clearcut.A.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0142, code lost:
        r11.add(com.google.android.gms.internal.clearcut.A.a(r3, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014a, code lost:
        if (r1 >= r5) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014c, code lost:
        r4 = com.google.android.gms.internal.clearcut.C0798v.a(r3, r1, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0152, code lost:
        if (r2 != r7.a) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        r1 = com.google.android.gms.internal.clearcut.C0798v.a(r3, r4, r7);
        r4 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        if (r4 != 0) goto L_0x0142;
     */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01d7  */
    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, C0801w wVar) throws IOException {
        int b2;
        int i9;
        int a2;
        int b3;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i10 = i2;
        int i11 = i3;
        int i12 = i4;
        int i13 = i6;
        int i14 = i7;
        long j4 = j3;
        C0801w wVar2 = wVar;
        C0770la laVar = (C0770la) a.getObject(t2, j4);
        if (!laVar.zzu()) {
            int size = laVar.size();
            laVar = laVar.a(size == 0 ? 10 : size << 1);
            a.putObject(t2, j4, laVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i13 == 2) {
                    P p2 = (P) laVar;
                    int a3 = C0798v.a(bArr2, i10, wVar2);
                    int i15 = wVar2.a + a3;
                    while (a3 < i15) {
                        p2.a(C0798v.c(bArr2, a3));
                        a3 += 8;
                    }
                    if (a3 == i15) {
                        return a3;
                    }
                    throw C0773ma.a();
                } else if (i13 == 1) {
                    P p3 = (P) laVar;
                    p3.a(C0798v.c(bArr, i2));
                    while (true) {
                        int i16 = i10 + 8;
                        if (i16 >= i11) {
                            return i16;
                        }
                        i10 = C0798v.a(bArr2, i16, wVar2);
                        if (i12 != wVar2.a) {
                            return i16;
                        }
                        p3.a(C0798v.c(bArr2, i10));
                    }
                }
                break;
            case 19:
            case 36:
                if (i13 == 2) {
                    C0749ea eaVar = (C0749ea) laVar;
                    int a4 = C0798v.a(bArr2, i10, wVar2);
                    int i17 = wVar2.a + a4;
                    while (a4 < i17) {
                        eaVar.a(C0798v.d(bArr2, a4));
                        a4 += 4;
                    }
                    if (a4 == i17) {
                        return a4;
                    }
                    throw C0773ma.a();
                } else if (i13 == 5) {
                    C0749ea eaVar2 = (C0749ea) laVar;
                    eaVar2.a(C0798v.d(bArr, i2));
                    while (true) {
                        int i18 = i10 + 4;
                        if (i18 >= i11) {
                            return i18;
                        }
                        i10 = C0798v.a(bArr2, i18, wVar2);
                        if (i12 != wVar2.a) {
                            return i18;
                        }
                        eaVar2.a(C0798v.d(bArr2, i10));
                    }
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i13 == 2) {
                    Aa aa = (Aa) laVar;
                    int a5 = C0798v.a(bArr2, i10, wVar2);
                    int i19 = wVar2.a + a5;
                    while (a5 < i19) {
                        a5 = C0798v.b(bArr2, a5, wVar2);
                        aa.a(wVar2.b);
                    }
                    if (a5 == i19) {
                        return a5;
                    }
                    throw C0773ma.a();
                } else if (i13 == 0) {
                    Aa aa2 = (Aa) laVar;
                    do {
                        b2 = C0798v.b(bArr2, i10, wVar2);
                        aa2.a(wVar2.b);
                        if (b2 >= i11) {
                            return b2;
                        }
                        i10 = C0798v.a(bArr2, b2, wVar2);
                    } while (i12 == wVar2.a);
                    return b2;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i13 == 2) {
                    return C0798v.a(bArr2, i10, laVar, wVar2);
                }
                if (i13 == 0) {
                    return C0798v.a(i4, bArr, i2, i3, laVar, wVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i13 == 2) {
                    Aa aa3 = (Aa) laVar;
                    int a6 = C0798v.a(bArr2, i10, wVar2);
                    int i20 = wVar2.a + a6;
                    while (a6 < i20) {
                        aa3.a(C0798v.b(bArr2, a6));
                        a6 += 8;
                    }
                    if (a6 == i20) {
                        return a6;
                    }
                    throw C0773ma.a();
                } else if (i13 == 1) {
                    Aa aa4 = (Aa) laVar;
                    aa4.a(C0798v.b(bArr, i2));
                    while (true) {
                        int i21 = i10 + 8;
                        if (i21 >= i11) {
                            return i21;
                        }
                        i10 = C0798v.a(bArr2, i21, wVar2);
                        if (i12 != wVar2.a) {
                            return i21;
                        }
                        aa4.a(C0798v.b(bArr2, i10));
                    }
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i13 == 2) {
                    C0758ha haVar = (C0758ha) laVar;
                    int a7 = C0798v.a(bArr2, i10, wVar2);
                    int i22 = wVar2.a + a7;
                    while (a7 < i22) {
                        haVar.c(C0798v.a(bArr2, a7));
                        a7 += 4;
                    }
                    if (a7 == i22) {
                        return a7;
                    }
                    throw C0773ma.a();
                } else if (i13 == 5) {
                    C0758ha haVar2 = (C0758ha) laVar;
                    haVar2.c(C0798v.a(bArr, i2));
                    while (true) {
                        int i23 = i10 + 4;
                        if (i23 >= i11) {
                            return i23;
                        }
                        i10 = C0798v.a(bArr2, i23, wVar2);
                        if (i12 != wVar2.a) {
                            return i23;
                        }
                        haVar2.c(C0798v.a(bArr2, i10));
                    }
                }
                break;
            case 25:
            case 42:
                if (i13 != 2) {
                    if (i13 == 0) {
                        C0804x xVar = (C0804x) laVar;
                        int b4 = C0798v.b(bArr2, i10, wVar2);
                        break;
                    }
                } else {
                    C0804x xVar2 = (C0804x) laVar;
                    int a8 = C0798v.a(bArr2, i10, wVar2);
                    int i24 = wVar2.a + a8;
                    while (i9 < i24) {
                        a8 = C0798v.b(bArr2, i9, wVar2);
                        xVar2.a(wVar2.b != 0);
                    }
                    if (i9 != i24) {
                        throw C0773ma.a();
                    }
                }
                break;
            case 26:
                if (i13 == 2) {
                    String str = "";
                    if ((j2 & 536870912) == 0) {
                        int a9 = C0798v.a(bArr2, i10, wVar2);
                        int i25 = wVar2.a;
                        if (i25 != 0) {
                            String str2 = new String(bArr2, a9, i25, C0761ia.a);
                            laVar.add(str2);
                            a9 += i25;
                            if (i10 < i11) {
                                int a10 = C0798v.a(bArr2, i10, wVar2);
                                if (i12 == wVar2.a) {
                                    a9 = C0798v.a(bArr2, a10, wVar2);
                                    i25 = wVar2.a;
                                    if (i25 != 0) {
                                        str2 = new String(bArr2, a9, i25, C0761ia.a);
                                        laVar.add(str2);
                                        a9 += i25;
                                        if (i10 < i11) {
                                        }
                                    }
                                }
                            }
                        }
                        laVar.add(str);
                        if (i10 < i11) {
                        }
                    } else {
                        int a11 = C0798v.a(bArr2, i10, wVar2);
                        int i26 = wVar2.a;
                        if (i26 != 0) {
                            int i27 = a11 + i26;
                            if (Cb.a(bArr2, a11, i27)) {
                                String str3 = new String(bArr2, a11, i26, C0761ia.a);
                                laVar.add(str3);
                                a11 = i27;
                                if (i10 < i11) {
                                    int a12 = C0798v.a(bArr2, i10, wVar2);
                                    if (i12 == wVar2.a) {
                                        a11 = C0798v.a(bArr2, a12, wVar2);
                                        int i28 = wVar2.a;
                                        if (i28 != 0) {
                                            i27 = a11 + i28;
                                            if (Cb.a(bArr2, a11, i27)) {
                                                str3 = new String(bArr2, a11, i28, C0761ia.a);
                                                laVar.add(str3);
                                                a11 = i27;
                                                if (i10 < i11) {
                                                }
                                            }
                                            throw C0773ma.e();
                                        }
                                    }
                                }
                            } else {
                                throw C0773ma.e();
                            }
                        }
                        laVar.add(str);
                        if (i10 < i11) {
                        }
                    }
                }
                break;
            case 27:
                if (i13 == 2) {
                    return a(a(i14), i4, bArr, i2, i3, laVar, wVar);
                }
                break;
            case 28:
                if (i13 == 2) {
                    int a13 = C0798v.a(bArr2, i10, wVar2);
                    int i29 = wVar2.a;
                    break;
                }
                break;
            case 30:
            case 44:
                if (i13 == 2) {
                    i9 = C0798v.a(bArr2, i10, laVar, wVar2);
                } else if (i13 == 0) {
                    i9 = C0798v.a(i4, bArr, i2, i3, laVar, wVar);
                }
                C0755ga gaVar = (C0755ga) t2;
                C0797ub ubVar = gaVar.zzjp;
                if (ubVar == C0797ub.b()) {
                    ubVar = null;
                }
                C0797ub ubVar2 = (C0797ub) C0747db.a(i5, laVar, c(i14), ubVar, this.q);
                if (ubVar2 != null) {
                    gaVar.zzjp = ubVar2;
                    break;
                }
                break;
            case 33:
            case 47:
                if (i13 == 2) {
                    C0758ha haVar3 = (C0758ha) laVar;
                    int a14 = C0798v.a(bArr2, i10, wVar2);
                    int i30 = wVar2.a + a14;
                    while (a14 < i30) {
                        a14 = C0798v.a(bArr2, a14, wVar2);
                        haVar3.c(J.a(wVar2.a));
                    }
                    if (a14 == i30) {
                        return a14;
                    }
                    throw C0773ma.a();
                } else if (i13 == 0) {
                    C0758ha haVar4 = (C0758ha) laVar;
                    do {
                        a2 = C0798v.a(bArr2, i10, wVar2);
                        haVar4.c(J.a(wVar2.a));
                        if (a2 >= i11) {
                            return a2;
                        }
                        i10 = C0798v.a(bArr2, a2, wVar2);
                    } while (i12 == wVar2.a);
                    return a2;
                }
                break;
            case 34:
            case 48:
                if (i13 == 2) {
                    Aa aa5 = (Aa) laVar;
                    int a15 = C0798v.a(bArr2, i10, wVar2);
                    int i31 = wVar2.a + a15;
                    while (a15 < i31) {
                        a15 = C0798v.b(bArr2, a15, wVar2);
                        aa5.a(J.a(wVar2.b));
                    }
                    if (a15 == i31) {
                        return a15;
                    }
                    throw C0773ma.a();
                } else if (i13 == 0) {
                    Aa aa6 = (Aa) laVar;
                    do {
                        b3 = C0798v.b(bArr2, i10, wVar2);
                        aa6.a(J.a(wVar2.b));
                        if (b3 >= i11) {
                            return b3;
                        }
                        i10 = C0798v.a(bArr2, b3, wVar2);
                    } while (i12 == wVar2.a);
                    return b3;
                }
                break;
            case 49:
                if (i13 == 3) {
                    C0741bb a16 = a(i14);
                    int i32 = (i12 & -8) | 4;
                    i10 = a(a16, bArr, i2, i3, i32, wVar);
                    while (true) {
                        laVar.add(wVar2.c);
                        if (i10 >= i11) {
                            break;
                        } else {
                            int a17 = C0798v.a(bArr2, i10, wVar2);
                            if (i12 != wVar2.a) {
                                break;
                            } else {
                                i10 = a(a16, bArr, a17, i3, i32, wVar);
                            }
                        }
                    }
                }
                break;
        }
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, long j2, C0801w wVar) throws IOException {
        Unsafe unsafe = a;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.d(object)) {
            Object f2 = this.s.f(b2);
            this.s.a(f2, object);
            unsafe.putObject(t, j2, f2);
        }
        this.s.c(b2);
        throw null;
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v12, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r5v4, types: [int] */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r0v15, types: [int] */
    /* JADX WARNING: type inference failed for: r1v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r30v1 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r30v2 */
    /* JADX WARNING: type inference failed for: r30v3 */
    /* JADX WARNING: type inference failed for: r30v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r30v5 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r30v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v9, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r30v7 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [int] */
    /* JADX WARNING: type inference failed for: r30v8 */
    /* JADX WARNING: type inference failed for: r30v9 */
    /* JADX WARNING: type inference failed for: r1v16, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v12 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r9v15 */
    /* JADX WARNING: type inference failed for: r1v19 */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r12v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r9v24 */
    /* JADX WARNING: type inference failed for: r12v22, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r9v25 */
    /* JADX WARNING: type inference failed for: r9v26 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v27 */
    /* JADX WARNING: type inference failed for: r12v25, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r9v28 */
    /* JADX WARNING: type inference failed for: r9v29 */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v30 */
    /* JADX WARNING: type inference failed for: r12v28, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r9v31 */
    /* JADX WARNING: type inference failed for: r1v34 */
    /* JADX WARNING: type inference failed for: r12v30 */
    /* JADX WARNING: type inference failed for: r9v33 */
    /* JADX WARNING: type inference failed for: r9v34 */
    /* JADX WARNING: type inference failed for: r12v31, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r9v35 */
    /* JADX WARNING: type inference failed for: r9v36, types: [int] */
    /* JADX WARNING: type inference failed for: r12v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v37 */
    /* JADX WARNING: type inference failed for: r12v34, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v38 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r9v39 */
    /* JADX WARNING: type inference failed for: r12v36, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r1v39 */
    /* JADX WARNING: type inference failed for: r9v41 */
    /* JADX WARNING: type inference failed for: r1v40, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r9v42 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r9v43 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r9v44 */
    /* JADX WARNING: type inference failed for: r5v33 */
    /* JADX WARNING: type inference failed for: r1v46, types: [int] */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r1v47 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r1v48 */
    /* JADX WARNING: type inference failed for: r7v36 */
    /* JADX WARNING: type inference failed for: r30v25 */
    /* JADX WARNING: type inference failed for: r1v49 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r1v50 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r1v51 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r9v45 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r9v46 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r9v47 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r9v48 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r9v49 */
    /* JADX WARNING: type inference failed for: r9v50 */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: type inference failed for: r12v59 */
    /* JADX WARNING: type inference failed for: r12v60 */
    /* JADX WARNING: type inference failed for: r9v53 */
    /* JADX WARNING: type inference failed for: r12v61 */
    /* JADX WARNING: type inference failed for: r12v62 */
    /* JADX WARNING: type inference failed for: r12v63 */
    /* JADX WARNING: type inference failed for: r9v54 */
    /* JADX WARNING: type inference failed for: r12v64 */
    /* JADX WARNING: type inference failed for: r9v55 */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02fc, code lost:
        if (r0 == r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0359, code lost:
        if (r0 == r15) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x035b, code lost:
        r7 = r30;
        r6 = r32;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0016, code lost:
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r5 = r4;
        r30 = r7;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00da, code lost:
        r12 = r29;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        r13 = r31;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013e, code lost:
        r6 = r6 | r21;
        r13 = r31;
        r0 = r2;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0143, code lost:
        r1 = r9;
        r9 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0192, code lost:
        r10.putObject(r14, r7, r1);
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cc, code lost:
        r6 = r6 | r21;
        r7 = r30;
        r13 = r5;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01f3, code lost:
        r5 = r4;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x025c, code lost:
        r6 = r6 | r21;
        r7 = r30;
        r13 = r31;
        r12 = r12;
        r9 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0262, code lost:
        r1 = r9;
        r9 = r11;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0264, code lost:
        r8 = -1;
        r12 = r12;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0265, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0269, code lost:
        r20 = r30;
        r2 = r5;
        r21 = r6;
        r7 = r9;
        r26 = r10;
        r6 = r32;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v12, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r29v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v6
  assigns: []
  uses: []
  mth insns count: 513
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 56 */
    private final int a(T t, byte[] r29, int i2, int i3, int i4, C0801w wVar) throws IOException {
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        ? r7;
        T t2;
        ? r5;
        int i9;
        ? r12;
        ? r1;
        ? r122;
        int i10;
        int i11;
        int a2;
        ? r123;
        int i12;
        C0801w wVar2;
        ? r13;
        ? r30;
        int i13;
        ? r302;
        int i14;
        ? r9;
        int i15;
        C0801w wVar3;
        int i16;
        ? r124;
        C0801w wVar4;
        int i17;
        ? r125;
        int i18;
        ? r126;
        ? r127;
        long j2;
        Object obj;
        C0801w wVar5;
        ? r128;
        ? r92;
        int i19;
        C0801w wVar6;
        int i20;
        ? r129;
        ? r93;
        Object obj2;
        Pa pa = this;
        T t3 = t;
        ? r1210 = r29;
        int i21 = i3;
        int i22 = i4;
        C0801w wVar7 = wVar;
        Unsafe unsafe2 = a;
        int i23 = -1;
        int i24 = i2;
        ? r14 = 0;
        int i25 = 0;
        int i26 = -1;
        while (true) {
            if (i24 < i21) {
                int i27 = i24 + 1;
                ? r0 = r1210[i24];
                if (r0 < 0) {
                    i9 = C0798v.a((int) r0, (byte[]) r1210, i27, wVar7);
                    r5 = wVar7.a;
                } else {
                    r5 = r0;
                    i9 = i27;
                }
                int i28 = r5 >>> 3;
                int i29 = r5 & 7;
                int f2 = pa.f(i28);
                if (f2 != i23) {
                    int[] iArr = pa.b;
                    int i30 = iArr[f2 + 1];
                    int i31 = (i30 & 267386880) >>> 20;
                    ? r303 = r5;
                    long j3 = (long) (i30 & 1048575);
                    int i32 = i30;
                    if (i31 <= 17) {
                        int i33 = iArr[f2 + 2];
                        int i34 = 1 << (i33 >>> 20);
                        int i35 = i33 & 1048575;
                        if (i35 != i26) {
                            if (i26 != -1) {
                                unsafe2.putInt(t3, (long) i26, i25);
                            }
                            i25 = unsafe2.getInt(t3, (long) i35);
                            i26 = i35;
                        }
                        switch (i31) {
                            case 0:
                                r9 = r303;
                                wVar4 = wVar;
                                i15 = i9;
                                i14 = i26;
                                long j4 = j3;
                                ? r1211 = r29;
                                if (i29 == 1) {
                                    Ab.a((Object) t3, j4, C0798v.c(r1211, i15));
                                    i17 = i15 + 8;
                                    r124 = r1211;
                                    break;
                                }
                                break;
                            case 1:
                                r9 = r303;
                                wVar4 = wVar;
                                i15 = i9;
                                i14 = i26;
                                long j5 = j3;
                                ? r1212 = r29;
                                if (i29 == 5) {
                                    Ab.a((Object) t3, j5, C0798v.d(r1212, i15));
                                    i17 = i15 + 4;
                                    r124 = r1212;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                r9 = r303;
                                C0801w wVar8 = wVar;
                                i15 = i9;
                                i14 = i26;
                                long j6 = j3;
                                ? r1213 = r29;
                                if (i29 == 0) {
                                    int b2 = C0798v.b(r1213, i15, wVar8);
                                    unsafe2.putLong(t, j6, wVar8.b);
                                    i25 |= i34;
                                    i26 = i14;
                                    int i36 = i3;
                                    i10 = r9;
                                    wVar7 = wVar8;
                                    i16 = b2;
                                    ? r1214 = r1213;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                r9 = r303;
                                wVar4 = wVar;
                                i15 = i9;
                                i14 = i26;
                                long j7 = j3;
                                ? r1215 = r29;
                                if (i29 == 0) {
                                    i17 = C0798v.a(r1215, i15, wVar4);
                                    unsafe2.putInt(t3, j7, wVar4.a);
                                    r124 = r1215;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                r9 = r303;
                                int i37 = i3;
                                wVar4 = wVar;
                                i14 = i26;
                                long j8 = j3;
                                ? r1216 = r29;
                                if (i29 == 1) {
                                    long j9 = j8;
                                    int i38 = i9;
                                    unsafe2.putLong(t, j9, C0798v.b(r1216, i9));
                                    i17 = i38 + 8;
                                    r124 = r1216;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                r9 = r303;
                                i18 = i3;
                                wVar3 = wVar;
                                i14 = i26;
                                long j10 = j3;
                                r126 = r29;
                                if (i29 == 5) {
                                    unsafe2.putInt(t3, j10, C0798v.a(r126, i9));
                                    i16 = i9 + 4;
                                    r125 = r126;
                                    break;
                                }
                                break;
                            case 7:
                                r9 = r303;
                                i18 = i3;
                                wVar3 = wVar;
                                i14 = i26;
                                long j11 = j3;
                                ? r1217 = r29;
                                if (i29 == 0) {
                                    i16 = C0798v.b(r1217, i9, wVar3);
                                    Ab.a((Object) t3, j11, wVar3.b != 0);
                                    r125 = r1217;
                                    break;
                                }
                                break;
                            case 8:
                                r9 = r303;
                                i18 = i3;
                                wVar3 = wVar;
                                i14 = i26;
                                j2 = j3;
                                r126 = r29;
                                if (i29 == 2) {
                                    i16 = (i32 & 536870912) == 0 ? C0798v.c(r126, i9, wVar3) : C0798v.d(r126, i9, wVar3);
                                    obj = wVar3.c;
                                    r127 = r126;
                                    break;
                                }
                                break;
                            case 9:
                                ? r94 = r303;
                                wVar3 = wVar;
                                i14 = i26;
                                j2 = j3;
                                ? r1218 = r29;
                                if (i29 != 2) {
                                    int i39 = i3;
                                    r9 = r94;
                                    break;
                                } else {
                                    i18 = i3;
                                    i16 = a(pa.a(f2), (byte[]) r1218, i9, i18, wVar3);
                                    if ((i25 & i34) != 0) {
                                        obj = C0761ia.a(unsafe2.getObject(t3, j2), wVar3.c);
                                        r9 = r94;
                                        r127 = r1218;
                                        break;
                                    } else {
                                        obj = wVar3.c;
                                        r9 = r94;
                                        r127 = r1218;
                                        break;
                                    }
                                }
                            case 10:
                                r92 = r303;
                                wVar6 = wVar;
                                long j12 = j3;
                                i20 = -1;
                                ? r1219 = r29;
                                if (i29 == 2) {
                                    i19 = C0798v.e(r1219, i9, wVar6);
                                    unsafe2.putObject(t3, j12, wVar6.c);
                                    r128 = r1219;
                                    break;
                                }
                                break;
                            case 12:
                                r92 = r303;
                                wVar5 = wVar;
                                long j13 = j3;
                                i23 = -1;
                                ? r1220 = r29;
                                if (i29 == 0) {
                                    i24 = C0798v.a(r1220, i9, wVar5);
                                    int i40 = wVar5.a;
                                    C0767ka c2 = pa.c(f2);
                                    if (c2 != null && c2.a(i40) == null) {
                                        e((Object) t).a((int) r92, (Object) Long.valueOf((long) i40));
                                        r129 = r1220;
                                        break;
                                    } else {
                                        unsafe2.putInt(t3, j13, i40);
                                        i25 |= i34;
                                        r129 = r1220;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                r92 = r303;
                                wVar6 = wVar;
                                long j14 = j3;
                                i20 = -1;
                                ? r1221 = r29;
                                if (i29 == 0) {
                                    i19 = C0798v.a(r1221, i9, wVar6);
                                    unsafe2.putInt(t3, j14, J.a(wVar6.a));
                                    r128 = r1221;
                                    break;
                                }
                                break;
                            case 16:
                                r93 = r303;
                                C0801w wVar9 = wVar;
                                i23 = -1;
                                if (i29 == 0) {
                                    long j15 = j3;
                                    ? r1222 = r29;
                                    int b3 = C0798v.b(r1222, i9, wVar9);
                                    unsafe2.putLong(t, j15, J.a(wVar9.b));
                                    i25 |= i34;
                                    ? r15 = r93;
                                    wVar7 = wVar9;
                                    i24 = b3;
                                    i21 = i3;
                                    ? r1223 = r1222;
                                    break;
                                }
                                break;
                            case 17:
                                if (i29 != 3) {
                                    r93 = r303;
                                    C0801w wVar10 = wVar;
                                    break;
                                } else {
                                    r92 = r303;
                                    i23 = -1;
                                    i24 = a(pa.a(f2), (byte[]) r29, i9, i3, (i28 << 3) | 4, wVar);
                                    if ((i25 & i34) == 0) {
                                        wVar5 = wVar;
                                        obj2 = wVar5.c;
                                    } else {
                                        wVar5 = wVar;
                                        obj2 = C0761ia.a(unsafe2.getObject(t3, j3), wVar5.c);
                                    }
                                    unsafe2.putObject(t3, j3, obj2);
                                    i25 |= i34;
                                    r129 = r29;
                                    break;
                                }
                            default:
                                ? r1224 = r29;
                                r92 = r303;
                                C0801w wVar11 = wVar;
                                break;
                        }
                    } else {
                        ? r95 = r303;
                        int i41 = i9;
                        i6 = i26;
                        long j16 = j3;
                        r12 = r29;
                        if (i31 != 27) {
                            i5 = i25;
                            if (i31 <= 49) {
                                int i42 = i41;
                                r30 = r95;
                                unsafe = unsafe2;
                                int i43 = i4;
                                a2 = a(t, (byte[]) r29, i41, i3, (int) r95, i28, i29, f2, (long) i32, i31, j16, wVar);
                            } else {
                                int i44 = i29;
                                int i45 = i28;
                                i13 = i41;
                                long j17 = j16;
                                r30 = r95;
                                unsafe = unsafe2;
                                int i46 = i32;
                                int i47 = f2;
                                if (i31 == 50) {
                                    if (i44 == 2) {
                                        a(t, r29, i13, i3, i47, i45, j17, wVar);
                                        throw null;
                                    }
                                    i11 = r30;
                                    i7 = i4;
                                    i8 = i13;
                                    if (i11 == i7 || i7 == 0) {
                                        a2 = a((int) i11, (byte[]) r29, i8, i3, (Object) t, wVar);
                                        pa = this;
                                        t3 = t;
                                        r123 = r29;
                                        i12 = i3;
                                        wVar2 = wVar;
                                        i22 = i7;
                                        r13 = i11;
                                        i26 = i6;
                                        i25 = i5;
                                        unsafe2 = unsafe;
                                        i23 = -1;
                                        r12 = r122;
                                        r1 = i10;
                                        r1210 = r12;
                                        r14 = r1;
                                    } else {
                                        r7 = i11;
                                    }
                                } else {
                                    a2 = a(t, (byte[]) r29, i13, i3, (int) r30, i45, i44, i46, i31, j17, i47, wVar);
                                }
                            }
                            pa = this;
                            t3 = t;
                            r123 = r29;
                            r13 = r30;
                            i12 = i3;
                            i22 = i4;
                            wVar2 = wVar;
                            i26 = i6;
                            i25 = i5;
                            unsafe2 = unsafe;
                            i23 = -1;
                            r12 = r122;
                            r1 = i10;
                            r1210 = r12;
                            r14 = r1;
                        } else if (i29 == 2) {
                            C0770la laVar = (C0770la) unsafe2.getObject(t3, j16);
                            if (!laVar.zzu()) {
                                int size = laVar.size();
                                laVar = laVar.a(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t3, j16, laVar);
                            }
                            C0770la laVar2 = laVar;
                            C0741bb a3 = pa.a(f2);
                            ? r16 = r95;
                            int i48 = i25;
                            i24 = a(a3, (int) r16, (byte[]) r29, i41, i3, laVar2, wVar);
                            i21 = i3;
                            i22 = i4;
                            i26 = i6;
                            i25 = i48;
                            i23 = -1;
                            wVar7 = wVar;
                            r1 = r16;
                            r1210 = r12;
                            r14 = r1;
                        } else {
                            i5 = i25;
                            i13 = i41;
                            r302 = r95;
                        }
                    }
                } else {
                    i13 = i9;
                    r302 = r5;
                    i5 = i25;
                    i6 = i26;
                }
                unsafe = unsafe2;
                r30 = r302;
                i11 = r30;
                i7 = i4;
                i8 = i13;
                if (i11 == i7) {
                }
                a2 = a((int) i11, (byte[]) r29, i8, i3, (Object) t, wVar);
                pa = this;
                t3 = t;
                r123 = r29;
                i12 = i3;
                wVar2 = wVar;
                i22 = i7;
                r13 = i11;
                i26 = i6;
                i25 = i5;
                unsafe2 = unsafe;
                i23 = -1;
                r12 = r122;
                r1 = i10;
                r1210 = r12;
                r14 = r1;
            } else {
                i5 = i25;
                i6 = i26;
                unsafe = unsafe2;
                i7 = i22;
                i8 = i24;
                r7 = r14;
            }
        }
        int i49 = i6;
        int i50 = i5;
        if (i49 != -1) {
            long j18 = (long) i49;
            t2 = t;
            unsafe.putInt(t2, j18, i50);
        } else {
            t2 = t;
        }
        int[] iArr2 = this.m;
        if (iArr2 != null) {
            C0797ub ubVar = null;
            for (int i51 : iArr2) {
                C0794tb<?, ?> tbVar = this.q;
                int i52 = this.b[i51];
                Object f3 = Ab.f(t2, (long) (d(i51) & 1048575));
                if (f3 != null) {
                    C0767ka c3 = c(i51);
                    if (c3 != null) {
                        a(i51, i52, this.s.g(f3), c3, (UB) ubVar, tbVar);
                        throw null;
                    }
                }
                ubVar = ubVar;
            }
            if (ubVar != null) {
                this.q.b((Object) t2, ubVar);
            }
        }
        if (i7 == 0) {
            if (i8 != i3) {
                throw C0773ma.d();
            }
        } else if (i8 > i3 || r7 != i7) {
            throw C0773ma.d();
        }
        return i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x016b A[EDGE_INSN: B:74:0x016b->B:70:0x016b ?: BREAK  , SYNTHETIC] */
    static <T> Pa<T> a(Class<T> cls, Ja ja, Sa sa, C0802wa waVar, C0794tb<?, ?> tbVar, T<?> t, Ga ga) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int c2;
        Ja ja2 = ja;
        int[] iArr = null;
        if (ja2 instanceof Za) {
            Za za = (Za) ja2;
            boolean z = za.a() == e.j;
            if (za.d() == 0) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
            } else {
                int f2 = za.f();
                int g2 = za.g();
                i4 = za.k();
                i3 = f2;
                i2 = g2;
            }
            int[] iArr2 = new int[(i4 << 2)];
            Object[] objArr = new Object[(i4 << 1)];
            int[] iArr3 = za.h() > 0 ? new int[za.h()] : null;
            if (za.i() > 0) {
                iArr = new int[za.i()];
            }
            int[] iArr4 = iArr;
            _a e2 = za.e();
            if (e2.a()) {
                int b2 = e2.b();
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (b2 >= za.l() || i8 >= ((b2 - i3) << 2)) {
                        if (e2.d()) {
                            i7 = (int) Ab.a(e2.e());
                            i6 = (int) Ab.a(e2.f());
                        } else {
                            i7 = (int) Ab.a(e2.g());
                            if (e2.h()) {
                                i6 = (int) Ab.a(e2.i());
                                i5 = e2.j();
                                iArr2[i8] = e2.b();
                                int i11 = i8 + 1;
                                iArr2[i11] = (!e2.l() ? 536870912 : 0) | (!e2.k() ? 268435456 : 0) | (e2.c() << 20) | i7;
                                iArr2[i8 + 2] = i6 | (i5 << 20);
                                if (e2.o() == null) {
                                    int i12 = (i8 / 4) << 1;
                                    objArr[i12] = e2.o();
                                    if (e2.m() != null) {
                                        objArr[i12 + 1] = e2.m();
                                    } else if (e2.n() != null) {
                                        objArr[i12 + 1] = e2.n();
                                    }
                                } else if (e2.m() != null) {
                                    objArr[((i8 / 4) << 1) + 1] = e2.m();
                                } else if (e2.n() != null) {
                                    objArr[((i8 / 4) << 1) + 1] = e2.n();
                                }
                                c2 = e2.c();
                                if (c2 != C0740ba.MAP.ordinal()) {
                                    int i13 = i9 + 1;
                                    iArr3[i9] = i8;
                                    i9 = i13;
                                } else if (c2 >= 18 && c2 <= 49) {
                                    int i14 = i10 + 1;
                                    iArr4[i10] = iArr2[i11] & 1048575;
                                    i10 = i14;
                                }
                                if (e2.a()) {
                                    break;
                                }
                                b2 = e2.b();
                            } else {
                                i6 = 0;
                            }
                        }
                        i5 = 0;
                        iArr2[i8] = e2.b();
                        int i112 = i8 + 1;
                        iArr2[i112] = (!e2.l() ? 536870912 : 0) | (!e2.k() ? 268435456 : 0) | (e2.c() << 20) | i7;
                        iArr2[i8 + 2] = i6 | (i5 << 20);
                        if (e2.o() == null) {
                        }
                        c2 = e2.c();
                        if (c2 != C0740ba.MAP.ordinal()) {
                        }
                        if (e2.a()) {
                        }
                    } else {
                        for (int i15 = 0; i15 < 4; i15++) {
                            iArr2[i8 + i15] = -1;
                        }
                    }
                    i8 += 4;
                }
            }
            Pa pa = new Pa(iArr2, objArr, i3, i2, za.l(), za.c(), z, false, za.j(), iArr3, iArr4, sa, waVar, tbVar, t, ga);
            return pa;
        }
        ((C0780ob) ja2).a();
        throw null;
    }

    private final C0741bb a(int i2) {
        int i3 = (i2 / 4) << 1;
        C0741bb bbVar = (C0741bb) this.c[i3];
        if (bbVar != null) {
            return bbVar;
        }
        C0741bb a2 = Xa.a().a((Class) this.c[i3 + 1]);
        this.c[i3] = a2;
        return a2;
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, C0767ka<?> kaVar, UB ub, C0794tb<UT, UB> tbVar) {
        this.s.c(b(i2));
        throw null;
    }

    private static <E> List<E> a(Object obj, long j2) {
        return (List) Ab.f(obj, j2);
    }

    private static void a(int i2, Object obj, Ob ob) throws IOException {
        if (obj instanceof String) {
            ob.a(i2, (String) obj);
        } else {
            ob.a(i2, (A) obj);
        }
    }

    private final <K, V> void a(Ob ob, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            this.s.c(b(i3));
            throw null;
        }
    }

    private static <UT, UB> void a(C0794tb<UT, UB> tbVar, T t, Ob ob) throws IOException {
        tbVar.a(tbVar.c(t), ob);
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = Ab.f(t, d2);
            Object f3 = Ab.f(t2, d2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    Ab.a((Object) t, d2, f3);
                    b(t, i2);
                }
                return;
            }
            Ab.a((Object) t, d2, C0761ia.a(f2, f3));
            b(t, i2);
        }
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return Ab.e(t, j2) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                case 1:
                    return Ab.d(t, j2) != 0.0f;
                case 2:
                    return Ab.b(t, j2) != 0;
                case 3:
                    return Ab.b(t, j2) != 0;
                case 4:
                    return Ab.a((Object) t, j2) != 0;
                case 5:
                    return Ab.b(t, j2) != 0;
                case 6:
                    return Ab.a((Object) t, j2) != 0;
                case 7:
                    return Ab.c(t, j2);
                case 8:
                    Object f2 = Ab.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof A) {
                        return !A.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return Ab.f(t, j2) != null;
                case 10:
                    return !A.a.equals(Ab.f(t, j2));
                case 11:
                    return Ab.a((Object) t, j2) != 0;
                case 12:
                    return Ab.a((Object) t, j2) != 0;
                case 13:
                    return Ab.a((Object) t, j2) != 0;
                case 14:
                    return Ab.b(t, j2) != 0;
                case 15:
                    return Ab.a((Object) t, j2) != 0;
                case 16:
                    return Ab.b(t, j2) != 0;
                case 17:
                    return Ab.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (Ab.a((Object) t, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return Ab.a((Object) t, (long) (e(i3) & 1048575)) == i2;
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        return this.j ? a(t, i2) : (i3 & i4) != 0;
    }

    private static boolean a(Object obj, int i2, C0741bb bbVar) {
        return bbVar.c(Ab.f(obj, (long) (i2 & 1048575)));
    }

    private static <T> double b(T t, long j2) {
        return ((Double) Ab.f(t, j2)).doubleValue();
    }

    private final Object b(int i2) {
        return this.c[(i2 / 4) << 1];
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            Ab.a((Object) t, j2, Ab.a((Object) t, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        Ab.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0280, code lost:
        com.google.android.gms.internal.clearcut.C0747db.j(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0290, code lost:
        com.google.android.gms.internal.clearcut.C0747db.g(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02a0, code lost:
        com.google.android.gms.internal.clearcut.C0747db.l(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02b0, code lost:
        com.google.android.gms.internal.clearcut.C0747db.m(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02c0, code lost:
        com.google.android.gms.internal.clearcut.C0747db.i(r4, (java.util.List) r8.getObject(r1, r12), r2, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0479, code lost:
        r5 = r5 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0276, code lost:
        com.google.android.gms.internal.clearcut.C0747db.e(r4, r9, r2, r14);
     */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    private final void b(T t, Ob ob) throws IOException {
        Entry entry;
        Iterator it;
        int length;
        int i2;
        Entry entry2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        List list;
        int i9;
        Entry entry3;
        T t2 = t;
        Ob ob2 = ob;
        if (this.h) {
            X a2 = this.r.a((Object) t2);
            if (!a2.b()) {
                it = a2.e();
                entry = (Entry) it.next();
                int i10 = -1;
                length = this.b.length;
                Unsafe unsafe = a;
                Entry entry4 = entry;
                i2 = 0;
                int i11 = 0;
                while (i2 < length) {
                    int d2 = d(i2);
                    int[] iArr = this.b;
                    int i12 = iArr[i2];
                    int i13 = (267386880 & d2) >>> 20;
                    if (this.j || i13 > 17) {
                        entry4 = entry4;
                        i3 = 0;
                    } else {
                        int i14 = iArr[i2 + 2];
                        int i15 = i14 & 1048575;
                        if (i15 != i10) {
                            entry3 = entry4;
                            i11 = unsafe.getInt(t2, (long) i15);
                        } else {
                            entry3 = entry4;
                            i15 = i10;
                        }
                        i3 = 1 << (i14 >>> 20);
                        i10 = i15;
                        entry4 = entry3;
                    }
                    while (entry4 != null && this.r.a(entry4) <= i12) {
                        this.r.a(ob2, entry4);
                        entry4 = it.hasNext() ? (Entry) it.next() : null;
                    }
                    long j2 = (long) (d2 & 1048575);
                    switch (i13) {
                        case 0:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, Ab.e(t2, j2));
                                break;
                            }
                        case 1:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, Ab.d(t2, j2));
                                break;
                            }
                        case 2:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.e(i12, unsafe.getLong(t2, j2));
                                break;
                            }
                        case 3:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.c(i12, unsafe.getLong(t2, j2));
                                break;
                            }
                        case 4:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, unsafe.getInt(t2, j2));
                                break;
                            }
                        case 5:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.b(i12, unsafe.getLong(t2, j2));
                                break;
                            }
                        case 6:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.b(i12, unsafe.getInt(t2, j2));
                                break;
                            }
                        case 7:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, Ab.c(t2, j2));
                                break;
                            }
                        case 8:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                a(i12, unsafe.getObject(t2, j2), ob2);
                                break;
                            }
                        case 9:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, unsafe.getObject(t2, j2), a(i2));
                                break;
                            }
                        case 10:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, (A) unsafe.getObject(t2, j2));
                                break;
                            }
                        case 11:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.c(i12, unsafe.getInt(t2, j2));
                                break;
                            }
                        case 12:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.e(i12, unsafe.getInt(t2, j2));
                                break;
                            }
                        case 13:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.f(i12, unsafe.getInt(t2, j2));
                                break;
                            }
                        case 14:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.d(i12, unsafe.getLong(t2, j2));
                                break;
                            }
                        case 15:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.d(i12, unsafe.getInt(t2, j2));
                                break;
                            }
                        case 16:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.a(i12, unsafe.getLong(t2, j2));
                                break;
                            }
                        case 17:
                            if ((i11 & i3) == 0) {
                                break;
                            } else {
                                ob2.b(i12, unsafe.getObject(t2, j2), a(i2));
                                break;
                            }
                        case 18:
                            C0747db.a(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 19:
                            C0747db.b(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 20:
                            C0747db.c(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 21:
                            C0747db.d(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 22:
                            C0747db.h(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 23:
                            C0747db.f(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 24:
                            C0747db.k(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 25:
                            C0747db.n(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, false);
                            break;
                        case 26:
                            C0747db.a(this.b[i2], (List) unsafe.getObject(t2, j2), ob2);
                            break;
                        case 27:
                            C0747db.a(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, a(i2));
                            break;
                        case 28:
                            C0747db.b(this.b[i2], (List) unsafe.getObject(t2, j2), ob2);
                            break;
                        case 29:
                            z = false;
                            i4 = this.b[i2];
                            break;
                        case 30:
                            z2 = false;
                            i5 = this.b[i2];
                            break;
                        case 31:
                            z3 = false;
                            i6 = this.b[i2];
                            break;
                        case 32:
                            z4 = false;
                            i7 = this.b[i2];
                            break;
                        case 33:
                            z5 = false;
                            i8 = this.b[i2];
                            break;
                        case 34:
                            i9 = this.b[i2];
                            list = (List) unsafe.getObject(t2, j2);
                            z6 = false;
                            break;
                        case 35:
                            C0747db.a(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 36:
                            C0747db.b(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 37:
                            C0747db.c(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 38:
                            C0747db.d(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 39:
                            C0747db.h(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 40:
                            C0747db.f(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 41:
                            C0747db.k(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 42:
                            C0747db.n(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, true);
                            break;
                        case 43:
                            z = true;
                            i4 = this.b[i2];
                            break;
                        case 44:
                            z2 = true;
                            i5 = this.b[i2];
                            break;
                        case 45:
                            z3 = true;
                            i6 = this.b[i2];
                            break;
                        case 46:
                            z4 = true;
                            i7 = this.b[i2];
                            break;
                        case 47:
                            z5 = true;
                            i8 = this.b[i2];
                            break;
                        case 48:
                            i9 = this.b[i2];
                            list = (List) unsafe.getObject(t2, j2);
                            z6 = true;
                            break;
                        case 49:
                            C0747db.b(this.b[i2], (List) unsafe.getObject(t2, j2), ob2, a(i2));
                            break;
                        case 50:
                            a(ob2, i12, unsafe.getObject(t2, j2), i2);
                            break;
                        case 51:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, b(t2, j2));
                                break;
                            }
                            break;
                        case 52:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, c(t2, j2));
                                break;
                            }
                            break;
                        case 53:
                            if (a(t2, i12, i2)) {
                                ob2.e(i12, e(t2, j2));
                                break;
                            }
                            break;
                        case 54:
                            if (a(t2, i12, i2)) {
                                ob2.c(i12, e(t2, j2));
                                break;
                            }
                            break;
                        case 55:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, d(t2, j2));
                                break;
                            }
                            break;
                        case 56:
                            if (a(t2, i12, i2)) {
                                ob2.b(i12, e(t2, j2));
                                break;
                            }
                            break;
                        case 57:
                            if (a(t2, i12, i2)) {
                                ob2.b(i12, d(t2, j2));
                                break;
                            }
                            break;
                        case 58:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, f(t2, j2));
                                break;
                            }
                            break;
                        case 59:
                            if (a(t2, i12, i2)) {
                                a(i12, unsafe.getObject(t2, j2), ob2);
                                break;
                            }
                            break;
                        case 60:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, unsafe.getObject(t2, j2), a(i2));
                                break;
                            }
                            break;
                        case 61:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, (A) unsafe.getObject(t2, j2));
                                break;
                            }
                            break;
                        case 62:
                            if (a(t2, i12, i2)) {
                                ob2.c(i12, d(t2, j2));
                                break;
                            }
                            break;
                        case 63:
                            if (a(t2, i12, i2)) {
                                ob2.e(i12, d(t2, j2));
                                break;
                            }
                            break;
                        case 64:
                            if (a(t2, i12, i2)) {
                                ob2.f(i12, d(t2, j2));
                                break;
                            }
                            break;
                        case 65:
                            if (a(t2, i12, i2)) {
                                ob2.d(i12, e(t2, j2));
                                break;
                            }
                            break;
                        case 66:
                            if (a(t2, i12, i2)) {
                                ob2.d(i12, d(t2, j2));
                                break;
                            }
                            break;
                        case 67:
                            if (a(t2, i12, i2)) {
                                ob2.a(i12, e(t2, j2));
                                break;
                            }
                            break;
                        case 68:
                            if (a(t2, i12, i2)) {
                                ob2.b(i12, unsafe.getObject(t2, j2), a(i2));
                                break;
                            }
                            break;
                    }
                }
                for (entry2 = entry4; entry2 != null; entry2 = it.hasNext() ? (Entry) it.next() : null) {
                    this.r.a(ob2, entry2);
                }
                a(this.q, t2, ob2);
            }
        }
        it = null;
        entry = null;
        int i102 = -1;
        length = this.b.length;
        Unsafe unsafe2 = a;
        Entry entry42 = entry;
        i2 = 0;
        int i112 = 0;
        while (i2 < length) {
        }
        while (entry2 != null) {
        }
        a(this.q, t2, ob2);
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.b[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = Ab.f(t, j2);
            Object f3 = Ab.f(t2, j2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    Ab.a((Object) t, j2, f3);
                    b(t, i3, i2);
                }
                return;
            }
            Ab.a((Object) t, j2, C0761ia.a(f2, f3));
            b(t, i3, i2);
        }
    }

    private static <T> float c(T t, long j2) {
        return ((Float) Ab.f(t, j2)).floatValue();
    }

    private final C0767ka<?> c(int i2) {
        return (C0767ka) this.c[((i2 / 4) << 1) + 1];
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final int d(int i2) {
        return this.b[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) Ab.f(t, j2)).intValue();
    }

    private final int e(int i2) {
        return this.b[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) Ab.f(t, j2)).longValue();
    }

    private static C0797ub e(Object obj) {
        C0755ga gaVar = (C0755ga) obj;
        C0797ub ubVar = gaVar.zzjp;
        if (ubVar != C0797ub.b()) {
            return ubVar;
        }
        C0797ub c2 = C0797ub.c();
        gaVar.zzjp = c2;
        return c2;
    }

    private final int f(int i2) {
        int i3 = this.d;
        if (i2 >= i3) {
            int i4 = this.f;
            if (i2 < i4) {
                int i5 = (i2 - i3) << 2;
                if (this.b[i5] == i2) {
                    return i5;
                }
                return -1;
            } else if (i2 <= this.e) {
                int i6 = i4 - i3;
                int length = (this.b.length / 4) - 1;
                while (i6 <= length) {
                    int i7 = (length + i6) >>> 1;
                    int i8 = i7 << 2;
                    int i9 = this.b[i8];
                    if (i2 == i9) {
                        return i8;
                    }
                    if (i2 < i9) {
                        length = i7 - 1;
                    } else {
                        i6 = i7 + 1;
                    }
                }
            }
        }
        return -1;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) Ab.f(t, j2)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        r3 = com.google.android.gms.internal.clearcut.Ab.f(r9, r5);
        r2 = r2 * 53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0093, code lost:
        r2 = r2 * 53;
        r3 = d(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a8, code lost:
        r2 = r2 * 53;
        r3 = e(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ce, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d1, code lost:
        r2 = r2 * 53;
        r3 = com.google.android.gms.internal.clearcut.Ab.f(r9, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d7, code lost:
        r3 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e0, code lost:
        if (r3 != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e2, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e6, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r2 = r2 * 53;
        r3 = ((java.lang.String) com.google.android.gms.internal.clearcut.Ab.f(r9, r5)).hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r3 = com.google.android.gms.internal.clearcut.C0761ia.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0116, code lost:
        r3 = java.lang.Float.floatToIntBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0121, code lost:
        r3 = java.lang.Double.doubleToLongBits(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0125, code lost:
        r3 = com.google.android.gms.internal.clearcut.C0761ia.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0129, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x012a, code lost:
        r1 = r1 + 4;
     */
    public final int a(T t) {
        double d2;
        int i2;
        float f2;
        int i3;
        boolean z;
        int i4;
        Object obj;
        int length = this.b.length;
        int i5 = 0;
        int i6 = 0;
        while (i5 < length) {
            int d3 = d(i5);
            int i7 = this.b[i5];
            long j2 = (long) (1048575 & d3);
            int i8 = 37;
            switch ((d3 & 267386880) >>> 20) {
                case 0:
                    i2 = i6 * 53;
                    d2 = Ab.e(t, j2);
                    break;
                case 1:
                    i3 = i6 * 53;
                    f2 = Ab.d(t, j2);
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i2 = i6 * 53;
                    long j3 = Ab.b(t, j2);
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    int i9 = i6 * 53;
                    int i10 = Ab.a((Object) t, j2);
                    break;
                case 7:
                    i4 = i6 * 53;
                    z = Ab.c(t, j2);
                    break;
                case 8:
                    break;
                case 9:
                    obj = Ab.f(t, j2);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    break;
                case 17:
                    obj = Ab.f(t, j2);
                    break;
                case 51:
                    if (!a(t, i7, i5)) {
                        break;
                    } else {
                        i2 = i6 * 53;
                        d2 = b(t, j2);
                        break;
                    }
                case 52:
                    if (!a(t, i7, i5)) {
                        break;
                    } else {
                        i3 = i6 * 53;
                        f2 = c(t, j2);
                        break;
                    }
                case 53:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 54:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 55:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 56:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 57:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 58:
                    if (!a(t, i7, i5)) {
                        break;
                    } else {
                        i4 = i6 * 53;
                        z = f(t, j2);
                        break;
                    }
                case 59:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 60:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 61:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 62:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 63:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 64:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 65:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 66:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 67:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
                case 68:
                    if (!a(t, i7, i5)) {
                        break;
                    }
                    break;
            }
        }
        int hashCode = (i6 * 53) + this.q.c(t).hashCode();
        return this.h ? (hashCode * 53) + this.r.a((Object) t).hashCode() : hashCode;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0385, code lost:
        r15.b(r9, com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03a0, code lost:
        r15.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03b1, code lost:
        r15.d(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        r15.d(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03d3, code lost:
        r15.f(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03e4, code lost:
        r15.e(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03f5, code lost:
        r15.c(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0400, code lost:
        r15.a(r9, (com.google.android.gms.internal.clearcut.A) com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r8 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0413, code lost:
        r15.a(r9, com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r8 & 1048575)), a(r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0428, code lost:
        a(r9, com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r8 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x043f, code lost:
        r15.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0450, code lost:
        r15.b(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0460, code lost:
        r15.b(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0470, code lost:
        r15.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0480, code lost:
        r15.c(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0490, code lost:
        r15.e(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x04a0, code lost:
        r15.a(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04b0, code lost:
        r15.a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0843, code lost:
        r15.b(r10, com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r9 & 1048575)), a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x085e, code lost:
        r15.a(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x086f, code lost:
        r15.d(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0880, code lost:
        r15.d(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0891, code lost:
        r15.f(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08a2, code lost:
        r15.e(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x08b3, code lost:
        r15.c(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x08be, code lost:
        r15.a(r10, (com.google.android.gms.internal.clearcut.A) com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r9 & 1048575)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x08d1, code lost:
        r15.a(r10, com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r9 & 1048575)), a(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08e6, code lost:
        a(r10, com.google.android.gms.internal.clearcut.Ab.f(r14, (long) (r9 & 1048575)), r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x08fd, code lost:
        r15.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090e, code lost:
        r15.b(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x091e, code lost:
        r15.b(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x092e, code lost:
        r15.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x093e, code lost:
        r15.c(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x094e, code lost:
        r15.e(r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x095e, code lost:
        r15.a(r10, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x096e, code lost:
        r15.a(r10, r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x04b9  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x04f7  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0977  */
    public final void a(T t, Ob ob) throws IOException {
        Entry entry;
        Iterator it;
        int length;
        Entry entry2;
        int i2;
        double d2;
        float f2;
        long j2;
        long j3;
        int i3;
        long j4;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        long j5;
        int i8;
        long j6;
        Entry entry3;
        Iterator it2;
        int length2;
        double d3;
        float f3;
        long j7;
        long j8;
        int i9;
        long j9;
        int i10;
        boolean z2;
        int i11;
        int i12;
        int i13;
        long j10;
        int i14;
        long j11;
        if (ob.a() == e.m) {
            a(this.q, t, ob);
            if (this.h) {
                X a2 = this.r.a((Object) t);
                if (!a2.b()) {
                    it2 = a2.a();
                    entry3 = (Entry) it2.next();
                    length2 = this.b.length - 4;
                    while (length2 >= 0) {
                        int d4 = d(length2);
                        int i15 = this.b[length2];
                        while (entry3 != null && this.r.a(entry3) > i15) {
                            this.r.a(ob, entry3);
                            entry3 = it2.hasNext() ? (Entry) it2.next() : null;
                        }
                        switch ((d4 & 267386880) >>> 20) {
                            case 0:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    d3 = Ab.e(t, (long) (d4 & 1048575));
                                }
                            case 1:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    f3 = Ab.d(t, (long) (d4 & 1048575));
                                }
                            case 2:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    j7 = Ab.b(t, (long) (d4 & 1048575));
                                }
                            case 3:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    j8 = Ab.b(t, (long) (d4 & 1048575));
                                }
                            case 4:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    i9 = Ab.a((Object) t, (long) (d4 & 1048575));
                                }
                            case 5:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    j9 = Ab.b(t, (long) (d4 & 1048575));
                                }
                            case 6:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    i10 = Ab.a((Object) t, (long) (d4 & 1048575));
                                }
                            case 7:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    z2 = Ab.c(t, (long) (d4 & 1048575));
                                }
                            case 8:
                                if (!a(t, length2)) {
                                    break;
                                }
                            case 9:
                                if (!a(t, length2)) {
                                    break;
                                }
                            case 10:
                                if (!a(t, length2)) {
                                    break;
                                }
                            case 11:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    i11 = Ab.a((Object) t, (long) (d4 & 1048575));
                                }
                            case 12:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    i12 = Ab.a((Object) t, (long) (d4 & 1048575));
                                }
                            case 13:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    i13 = Ab.a((Object) t, (long) (d4 & 1048575));
                                }
                            case 14:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    j10 = Ab.b(t, (long) (d4 & 1048575));
                                }
                            case 15:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    i14 = Ab.a((Object) t, (long) (d4 & 1048575));
                                }
                            case 16:
                                if (!a(t, length2)) {
                                    break;
                                } else {
                                    j11 = Ab.b(t, (long) (d4 & 1048575));
                                }
                            case 17:
                                if (!a(t, length2)) {
                                    break;
                                }
                            case 18:
                                C0747db.a(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 19:
                                C0747db.b(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 20:
                                C0747db.c(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 21:
                                C0747db.d(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 22:
                                C0747db.h(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 23:
                                C0747db.f(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 24:
                                C0747db.k(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 25:
                                C0747db.n(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 26:
                                C0747db.a(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob);
                                break;
                            case 27:
                                C0747db.a(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, a(length2));
                                break;
                            case 28:
                                C0747db.b(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob);
                                break;
                            case 29:
                                C0747db.i(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 30:
                                C0747db.m(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 31:
                                C0747db.l(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 32:
                                C0747db.g(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 33:
                                C0747db.j(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 34:
                                C0747db.e(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, false);
                                break;
                            case 35:
                                C0747db.a(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 36:
                                C0747db.b(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 37:
                                C0747db.c(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 38:
                                C0747db.d(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 39:
                                C0747db.h(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 40:
                                C0747db.f(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 41:
                                C0747db.k(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 42:
                                C0747db.n(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 43:
                                C0747db.i(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 44:
                                C0747db.m(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 45:
                                C0747db.l(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 46:
                                C0747db.g(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 47:
                                C0747db.j(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 48:
                                C0747db.e(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, true);
                                break;
                            case 49:
                                C0747db.b(this.b[length2], (List) Ab.f(t, (long) (d4 & 1048575)), ob, a(length2));
                                break;
                            case 50:
                                a(ob, i15, Ab.f(t, (long) (d4 & 1048575)), length2);
                                break;
                            case 51:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    d3 = b(t, (long) (d4 & 1048575));
                                }
                            case 52:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    f3 = c(t, (long) (d4 & 1048575));
                                }
                            case 53:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    j7 = e(t, (long) (d4 & 1048575));
                                }
                            case 54:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    j8 = e(t, (long) (d4 & 1048575));
                                }
                            case 55:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    i9 = d(t, (long) (d4 & 1048575));
                                }
                            case 56:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    j9 = e(t, (long) (d4 & 1048575));
                                }
                            case 57:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    i10 = d(t, (long) (d4 & 1048575));
                                }
                            case 58:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    z2 = f(t, (long) (d4 & 1048575));
                                }
                            case 59:
                                if (!a(t, i15, length2)) {
                                    break;
                                }
                            case 60:
                                if (!a(t, i15, length2)) {
                                    break;
                                }
                            case 61:
                                if (!a(t, i15, length2)) {
                                    break;
                                }
                            case 62:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    i11 = d(t, (long) (d4 & 1048575));
                                }
                            case 63:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    i12 = d(t, (long) (d4 & 1048575));
                                }
                            case 64:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    i13 = d(t, (long) (d4 & 1048575));
                                }
                            case 65:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    j10 = e(t, (long) (d4 & 1048575));
                                }
                            case 66:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    i14 = d(t, (long) (d4 & 1048575));
                                }
                            case 67:
                                if (!a(t, i15, length2)) {
                                    break;
                                } else {
                                    j11 = e(t, (long) (d4 & 1048575));
                                }
                            case 68:
                                if (!a(t, i15, length2)) {
                                    break;
                                }
                        }
                        length2 -= 4;
                    }
                    while (entry3 != null) {
                        this.r.a(ob, entry3);
                        entry3 = it2.hasNext() ? (Entry) it2.next() : null;
                    }
                }
            }
            it2 = null;
            entry3 = null;
            length2 = this.b.length - 4;
            while (length2 >= 0) {
            }
            while (entry3 != null) {
            }
        } else if (this.j) {
            if (this.h) {
                X a3 = this.r.a((Object) t);
                if (!a3.b()) {
                    it = a3.e();
                    entry = (Entry) it.next();
                    length = this.b.length;
                    entry2 = entry;
                    i2 = 0;
                    while (i2 < length) {
                        int d5 = d(i2);
                        int i16 = this.b[i2];
                        while (entry2 != null && this.r.a(entry2) <= i16) {
                            this.r.a(ob, entry2);
                            entry2 = it.hasNext() ? (Entry) it.next() : null;
                        }
                        switch ((d5 & 267386880) >>> 20) {
                            case 0:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    d2 = Ab.e(t, (long) (d5 & 1048575));
                                }
                            case 1:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    f2 = Ab.d(t, (long) (d5 & 1048575));
                                }
                            case 2:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    j2 = Ab.b(t, (long) (d5 & 1048575));
                                }
                            case 3:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    j3 = Ab.b(t, (long) (d5 & 1048575));
                                }
                            case 4:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    i3 = Ab.a((Object) t, (long) (d5 & 1048575));
                                }
                            case 5:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    j4 = Ab.b(t, (long) (d5 & 1048575));
                                }
                            case 6:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    i4 = Ab.a((Object) t, (long) (d5 & 1048575));
                                }
                            case 7:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    z = Ab.c(t, (long) (d5 & 1048575));
                                }
                            case 8:
                                if (!a(t, i2)) {
                                    break;
                                }
                            case 9:
                                if (!a(t, i2)) {
                                    break;
                                }
                            case 10:
                                if (!a(t, i2)) {
                                    break;
                                }
                            case 11:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    i5 = Ab.a((Object) t, (long) (d5 & 1048575));
                                }
                            case 12:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    i6 = Ab.a((Object) t, (long) (d5 & 1048575));
                                }
                            case 13:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    i7 = Ab.a((Object) t, (long) (d5 & 1048575));
                                }
                            case 14:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    j5 = Ab.b(t, (long) (d5 & 1048575));
                                }
                            case 15:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    i8 = Ab.a((Object) t, (long) (d5 & 1048575));
                                }
                            case 16:
                                if (!a(t, i2)) {
                                    break;
                                } else {
                                    j6 = Ab.b(t, (long) (d5 & 1048575));
                                }
                            case 17:
                                if (!a(t, i2)) {
                                    break;
                                }
                            case 18:
                                C0747db.a(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 19:
                                C0747db.b(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 20:
                                C0747db.c(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 21:
                                C0747db.d(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 22:
                                C0747db.h(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 23:
                                C0747db.f(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 24:
                                C0747db.k(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 25:
                                C0747db.n(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 26:
                                C0747db.a(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob);
                                break;
                            case 27:
                                C0747db.a(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, a(i2));
                                break;
                            case 28:
                                C0747db.b(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob);
                                break;
                            case 29:
                                C0747db.i(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 30:
                                C0747db.m(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 31:
                                C0747db.l(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 32:
                                C0747db.g(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 33:
                                C0747db.j(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 34:
                                C0747db.e(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, false);
                                break;
                            case 35:
                                C0747db.a(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 36:
                                C0747db.b(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 37:
                                C0747db.c(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 38:
                                C0747db.d(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 39:
                                C0747db.h(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 40:
                                C0747db.f(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 41:
                                C0747db.k(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 42:
                                C0747db.n(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 43:
                                C0747db.i(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 44:
                                C0747db.m(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 45:
                                C0747db.l(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 46:
                                C0747db.g(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 47:
                                C0747db.j(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 48:
                                C0747db.e(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, true);
                                break;
                            case 49:
                                C0747db.b(this.b[i2], (List) Ab.f(t, (long) (d5 & 1048575)), ob, a(i2));
                                break;
                            case 50:
                                a(ob, i16, Ab.f(t, (long) (d5 & 1048575)), i2);
                                break;
                            case 51:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    d2 = b(t, (long) (d5 & 1048575));
                                }
                            case 52:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    f2 = c(t, (long) (d5 & 1048575));
                                }
                            case 53:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    j2 = e(t, (long) (d5 & 1048575));
                                }
                            case 54:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    j3 = e(t, (long) (d5 & 1048575));
                                }
                            case 55:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    i3 = d(t, (long) (d5 & 1048575));
                                }
                            case 56:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    j4 = e(t, (long) (d5 & 1048575));
                                }
                            case 57:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    i4 = d(t, (long) (d5 & 1048575));
                                }
                            case 58:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    z = f(t, (long) (d5 & 1048575));
                                }
                            case 59:
                                if (!a(t, i16, i2)) {
                                    break;
                                }
                            case 60:
                                if (!a(t, i16, i2)) {
                                    break;
                                }
                            case 61:
                                if (!a(t, i16, i2)) {
                                    break;
                                }
                            case 62:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    i5 = d(t, (long) (d5 & 1048575));
                                }
                            case 63:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    i6 = d(t, (long) (d5 & 1048575));
                                }
                            case 64:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    i7 = d(t, (long) (d5 & 1048575));
                                }
                            case 65:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    j5 = e(t, (long) (d5 & 1048575));
                                }
                            case 66:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    i8 = d(t, (long) (d5 & 1048575));
                                }
                            case 67:
                                if (!a(t, i16, i2)) {
                                    break;
                                } else {
                                    j6 = e(t, (long) (d5 & 1048575));
                                }
                            case 68:
                                if (!a(t, i16, i2)) {
                                    break;
                                }
                        }
                        i2 += 4;
                    }
                    while (entry2 != null) {
                        this.r.a(ob, entry2);
                        entry2 = it.hasNext() ? (Entry) it.next() : null;
                    }
                    a(this.q, t, ob);
                }
            }
            it = null;
            entry = null;
            length = this.b.length;
            entry2 = entry;
            i2 = 0;
            while (i2 < length) {
            }
            while (entry2 != null) {
            }
            a(this.q, t, ob);
        } else {
            b(t, ob);
        }
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r16v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v8, types: [int] */
    /* JADX WARNING: type inference failed for: r1v2, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v6, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v7, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v6, types: [int] */
    /* JADX WARNING: type inference failed for: r1v9, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r16v1 */
    /* JADX WARNING: type inference failed for: r1v25, types: [int] */
    /* JADX WARNING: type inference failed for: r16v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r1 = r11.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r9.putObject(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        if (r7 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        r0 = com.google.android.gms.internal.clearcut.C0798v.a(r12, r10, r11);
        r1 = r11.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d6, code lost:
        r9.putInt(r14, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        r9.putLong(r23, r2, r4);
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0102, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0164, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a0, code lost:
        if (r0 == r15) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0012, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r24v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
  assigns: []
  uses: []
  mth insns count: 200
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 16 */
    public final void a(T t, byte[] r24, int i2, int i3, C0801w wVar) throws IOException {
        ? r16;
        int i4;
        ? r12;
        Unsafe unsafe;
        int i5;
        int a2;
        int i6;
        int i7;
        long j2;
        Pa pa = this;
        T t2 = t;
        ? r122 = r24;
        int i8 = i3;
        C0801w wVar2 = wVar;
        if (pa.j) {
            Unsafe unsafe2 = a;
            int i9 = i2;
            while (i9 < i8) {
                int i10 = i9 + 1;
                ? r0 = r122[i9];
                if (r0 < 0) {
                    i4 = C0798v.a((int) r0, (byte[]) r122, i10, wVar2);
                    r16 = wVar2.a;
                } else {
                    r16 = r0;
                    i4 = i10;
                }
                int i11 = r16 >>> 3;
                int i12 = r16 & 7;
                int f2 = pa.f(i11);
                if (f2 >= 0) {
                    int i13 = pa.b[f2 + 1];
                    int i14 = (267386880 & i13) >>> 20;
                    long j3 = (long) (1048575 & i13);
                    if (i14 <= 17) {
                        boolean z = true;
                        switch (i14) {
                            case 0:
                                if (i12 == 1) {
                                    Ab.a((Object) t2, j3, C0798v.c(r122, i4));
                                    break;
                                }
                                break;
                            case 1:
                                if (i12 == 5) {
                                    Ab.a((Object) t2, j3, C0798v.d(r122, i4));
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                if (i12 == 0) {
                                    i7 = C0798v.b(r122, i4, wVar2);
                                    j2 = wVar2.b;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                break;
                            case 5:
                            case 14:
                                if (i12 == 1) {
                                    unsafe2.putLong(t, j3, C0798v.b(r122, i4));
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                if (i12 == 5) {
                                    unsafe2.putInt(t2, j3, C0798v.a(r122, i4));
                                    break;
                                }
                                break;
                            case 7:
                                if (i12 == 0) {
                                    i9 = C0798v.b(r122, i4, wVar2);
                                    if (wVar2.b == 0) {
                                        z = false;
                                    }
                                    Ab.a((Object) t2, j3, z);
                                    r12 = r122;
                                    break;
                                }
                                break;
                            case 8:
                                if (i12 == 2) {
                                    if ((536870912 & i13) != 0) {
                                        i9 = C0798v.d(r122, i4, wVar2);
                                        break;
                                    } else {
                                        i9 = C0798v.c(r122, i4, wVar2);
                                        break;
                                    }
                                }
                                break;
                            case 9:
                                if (i12 == 2) {
                                    i9 = a(pa.a(f2), (byte[]) r122, i4, i8, wVar2);
                                    Object object = unsafe2.getObject(t2, j3);
                                    if (object != null) {
                                        Object a3 = C0761ia.a(object, wVar2.c);
                                        break;
                                    }
                                }
                                break;
                            case 10:
                                if (i12 == 2) {
                                    i9 = C0798v.e(r122, i4, wVar2);
                                    break;
                                }
                                break;
                            case 12:
                                break;
                            case 15:
                                if (i12 == 0) {
                                    int a4 = C0798v.a(r122, i4, wVar2);
                                    int i15 = J.a(wVar2.a);
                                    break;
                                }
                                break;
                            case 16:
                                if (i12 == 0) {
                                    i7 = C0798v.b(r122, i4, wVar2);
                                    j2 = J.a(wVar2.b);
                                    break;
                                }
                                break;
                        }
                    } else if (i14 != 27) {
                        if (i14 <= 49) {
                            unsafe = unsafe2;
                            int i16 = i4;
                            a2 = a(t, (byte[]) r24, i4, i3, (int) r16, i11, i12, f2, (long) i13, i14, j3, wVar);
                        } else {
                            long j4 = j3;
                            unsafe = unsafe2;
                            i6 = i4;
                            int i17 = i14;
                            if (i17 == 50) {
                                if (i12 == 2) {
                                    a(t, r24, i6, i3, f2, i11, j4, wVar);
                                    throw null;
                                }
                                i5 = i6;
                                a2 = a((int) r16, (byte[]) r24, i5, i3, (Object) t, wVar);
                                pa = this;
                                t2 = t;
                                r12 = r24;
                                i8 = i3;
                                wVar2 = wVar;
                                unsafe2 = unsafe;
                                r122 = r12;
                            } else {
                                a2 = a(t, (byte[]) r24, i6, i3, (int) r16, i11, i12, i13, i17, j4, f2, wVar);
                            }
                        }
                        i5 = a2;
                        a2 = a((int) r16, (byte[]) r24, i5, i3, (Object) t, wVar);
                        pa = this;
                        t2 = t;
                        r12 = r24;
                        i8 = i3;
                        wVar2 = wVar;
                        unsafe2 = unsafe;
                        r122 = r12;
                    } else if (i12 == 2) {
                        C0770la laVar = (C0770la) unsafe2.getObject(t2, j3);
                        if (!laVar.zzu()) {
                            int size = laVar.size();
                            laVar = laVar.a(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t2, j3, laVar);
                        }
                        i9 = a(pa.a(f2), (int) r16, (byte[]) r24, i4, i3, laVar, wVar);
                        r12 = r122;
                        r122 = r12;
                    }
                }
                unsafe = unsafe2;
                i6 = i4;
                i5 = i6;
                a2 = a((int) r16, (byte[]) r24, i5, i3, (Object) t, wVar);
                pa = this;
                t2 = t;
                r12 = r24;
                i8 = i3;
                wVar2 = wVar;
                unsafe2 = unsafe;
                r122 = r12;
            }
            if (i9 != i8) {
                throw C0773ma.d();
            }
            return;
        }
        int i18 = i8;
        a(t, (byte[]) r24, i2, i3, 0, wVar);
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.clearcut.db.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005c, code lost:
        if (com.google.android.gms.internal.clearcut.C0747db.a(com.google.android.gms.internal.clearcut.Ab.f(r10, r6), com.google.android.gms.internal.clearcut.Ab.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0070, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.b(r10, r6) == com.google.android.gms.internal.clearcut.Ab.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0082, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0096, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.b(r10, r6) == com.google.android.gms.internal.clearcut.Ab.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cc, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        if (com.google.android.gms.internal.clearcut.C0747db.a(com.google.android.gms.internal.clearcut.Ab.f(r10, r6), com.google.android.gms.internal.clearcut.Ab.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (com.google.android.gms.internal.clearcut.C0747db.a(com.google.android.gms.internal.clearcut.Ab.f(r10, r6), com.google.android.gms.internal.clearcut.Ab.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010e, code lost:
        if (com.google.android.gms.internal.clearcut.C0747db.a(com.google.android.gms.internal.clearcut.Ab.f(r10, r6), com.google.android.gms.internal.clearcut.Ab.f(r11, r6)) != false) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0120, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.c(r10, r6) == com.google.android.gms.internal.clearcut.Ab.c(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0132, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0145, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.b(r10, r6) == com.google.android.gms.internal.clearcut.Ab.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0156, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0169, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.b(r10, r6) == com.google.android.gms.internal.clearcut.Ab.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x017c, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.b(r10, r6) == com.google.android.gms.internal.clearcut.Ab.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x018d, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01a0, code lost:
        if (com.google.android.gms.internal.clearcut.Ab.b(r10, r6) == com.google.android.gms.internal.clearcut.Ab.b(r11, r6)) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01a2, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.clearcut.C0747db.a(com.google.android.gms.internal.clearcut.Ab.f(r10, r6), com.google.android.gms.internal.clearcut.Ab.f(r11, r6)) != false) goto L_0x01a3;
     */
    public final boolean a(T t, T t2) {
        int length = this.b.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int d2 = d(i2);
                long j2 = (long) (d2 & 1048575);
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 1:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 2:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 3:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 4:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 5:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 6:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 7:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 8:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 9:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 10:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 11:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 12:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 13:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 14:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 15:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 16:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 17:
                        if (c(t, t2, i2)) {
                            break;
                        }
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                        z = C0747db.a(Ab.f(t, j2), Ab.f(t2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long e2 = (long) (e(i2) & 1048575);
                        if (Ab.a((Object) t, e2) == Ab.a((Object) t2, e2)) {
                            break;
                        }
                }
                if (!z) {
                    return false;
                }
                i2 += 4;
            } else if (!this.q.c(t).equals(this.q.c(t2))) {
                return false;
            } else {
                if (this.h) {
                    return this.r.a((Object) t).equals(this.r.a((Object) t2));
                }
                return true;
            }
        }
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.clearcut.db.a(int, java.lang.Object, com.google.android.gms.internal.clearcut.bb):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d8, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01e9, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01fa, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x020b, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x020d, code lost:
        r2.putInt(r1, (long) r14, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0211, code lost:
        r3 = (com.google.android.gms.internal.clearcut.M.e(r3) + com.google.android.gms.internal.clearcut.M.g(r5)) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0296, code lost:
        r13 = r13 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x029f, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.c(r3, (com.google.android.gms.internal.clearcut.La) com.google.android.gms.internal.clearcut.Ab.f(r1, r5), a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b8, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.h(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02d2, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.h(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02dd, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.j(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02ec, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.k(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x02fb, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.g(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0306, code lost:
        r5 = com.google.android.gms.internal.clearcut.Ab.f(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x030a, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.c(r3, (com.google.android.gms.internal.clearcut.A) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0317, code lost:
        r3 = com.google.android.gms.internal.clearcut.C0747db.a(r3, com.google.android.gms.internal.clearcut.Ab.f(r1, r5), a(r12));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0331, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0334, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.b(r3, (java.lang.String) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0342, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.b(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x034e, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.i(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x035a, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.g(r3, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x036a, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.f(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x037a, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.e(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x038a, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.d(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0396, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.b(r3, 0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03a2, code lost:
        r3 = com.google.android.gms.internal.clearcut.M.b(r3, (double) com.google.firebase.remoteconfig.FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03aa, code lost:
        r12 = r12 + 4;
        r3 = 267386880;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0417, code lost:
        if (a(r1, r15, r3) != false) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0437, code lost:
        if (a(r1, r15, r3) != false) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x043f, code lost:
        if (a(r1, r15, r3) != false) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x045f, code lost:
        if (a(r1, r15, r3) != false) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0467, code lost:
        if (a(r1, r15, r3) != false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0477, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x047f, code lost:
        if (a(r1, r15, r3) != false) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0517, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0529, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x053b, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x054d, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x055f, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0571, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0583, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0595, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x05a6, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x05b7, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x05c8, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05d9, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x05ea, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x05fb, code lost:
        if (r0.k != false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x05fd, code lost:
        r2.putInt(r1, (long) r11, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0601, code lost:
        r9 = (com.google.android.gms.internal.clearcut.M.e(r15) + com.google.android.gms.internal.clearcut.M.g(r4)) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06ac, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06ae, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x06b7, code lost:
        if ((r12 & r18) != 0) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x06b9, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.c(r15, (com.google.android.gms.internal.clearcut.La) r2.getObject(r1, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06d0, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.f(r15, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x06dd, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.h(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x06e4, code lost:
        if ((r12 & r18) != 0) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x06e6, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.h(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x06ef, code lost:
        if ((r12 & r18) != 0) goto L_0x06f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x06f1, code lost:
        r9 = com.google.android.gms.internal.clearcut.M.j(r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x06f6, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0700, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.k(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x070d, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.g(r15, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0714, code lost:
        if ((r12 & r18) != 0) goto L_0x0716;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0716, code lost:
        r4 = r2.getObject(r1, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x071a, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.c(r15, (com.google.android.gms.internal.clearcut.A) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0723, code lost:
        if ((r12 & r18) != 0) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0725, code lost:
        r4 = com.google.android.gms.internal.clearcut.C0747db.a(r15, r2.getObject(r1, r9), a(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if ((r5 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x073d, code lost:
        if ((r4 instanceof com.google.android.gms.internal.clearcut.A) != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0740, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.b(r15, (java.lang.String) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x074a, code lost:
        if ((r12 & r18) != 0) goto L_0x074c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x074c, code lost:
        r4 = com.google.android.gms.internal.clearcut.M.b(r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x079c, code lost:
        r5 = r5 + r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x07be, code lost:
        r3 = r3 + 4;
        r9 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0127, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0139, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x014b, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x015d, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0181, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0193, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01a5, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01b6, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01c7, code lost:
        if (r0.k != false) goto L_0x020d;
     */
    public final int b(T t) {
        int i2;
        int i3;
        long j2;
        int i4;
        int b2;
        Object obj;
        int i5;
        int i6;
        int i7;
        int i8;
        long j3;
        int i9;
        int b3;
        long j4;
        long j5;
        int i10;
        Object obj2;
        int i11;
        int i12;
        int i13;
        long j6;
        int i14;
        T t2 = t;
        int i15 = 267386880;
        if (this.j) {
            Unsafe unsafe = a;
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.b.length) {
                int d2 = d(i16);
                int i18 = (d2 & i15) >>> 20;
                int i19 = this.b[i16];
                long j7 = (long) (d2 & 1048575);
                int i20 = (i18 < C0740ba.DOUBLE_LIST_PACKED.a() || i18 > C0740ba.SINT64_LIST_PACKED.a()) ? 0 : this.b[i16 + 2] & 1048575;
                switch (i18) {
                    case 0:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 1:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 2:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            j4 = Ab.b(t2, j7);
                            break;
                        }
                    case 3:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            j5 = Ab.b(t2, j7);
                            break;
                        }
                    case 4:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            i10 = Ab.a((Object) t2, j7);
                            break;
                        }
                    case 5:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 6:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 7:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 8:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            obj2 = Ab.f(t2, j7);
                            break;
                        }
                    case 9:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 10:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 11:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            i11 = Ab.a((Object) t2, j7);
                            break;
                        }
                    case 12:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            i12 = Ab.a((Object) t2, j7);
                            break;
                        }
                    case 13:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 14:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 15:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            i13 = Ab.a((Object) t2, j7);
                            break;
                        }
                    case 16:
                        if (!a(t2, i16)) {
                            break;
                        } else {
                            j6 = Ab.b(t2, j7);
                            break;
                        }
                    case 17:
                        if (!a(t2, i16)) {
                            break;
                        }
                        break;
                    case 18:
                    case 23:
                    case 32:
                        b3 = C0747db.i(i19, a((Object) t2, j7), false);
                        break;
                    case 19:
                    case 24:
                    case 31:
                        b3 = C0747db.h(i19, a((Object) t2, j7), false);
                        break;
                    case 20:
                        b3 = C0747db.a(i19, a((Object) t2, j7), false);
                        break;
                    case 21:
                        b3 = C0747db.b(i19, a((Object) t2, j7), false);
                        break;
                    case 22:
                        b3 = C0747db.e(i19, a((Object) t2, j7), false);
                        break;
                    case 25:
                        b3 = C0747db.j(i19, a((Object) t2, j7), false);
                        break;
                    case 26:
                        b3 = C0747db.a(i19, a((Object) t2, j7));
                        break;
                    case 27:
                        b3 = C0747db.a(i19, a((Object) t2, j7), a(i16));
                        break;
                    case 28:
                        b3 = C0747db.b(i19, a((Object) t2, j7));
                        break;
                    case 29:
                        b3 = C0747db.f(i19, a((Object) t2, j7), false);
                        break;
                    case 30:
                        b3 = C0747db.d(i19, a((Object) t2, j7), false);
                        break;
                    case 33:
                        b3 = C0747db.g(i19, a((Object) t2, j7), false);
                        break;
                    case 34:
                        b3 = C0747db.c(i19, a((Object) t2, j7), false);
                        break;
                    case 35:
                        i14 = C0747db.i((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 36:
                        i14 = C0747db.h((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 37:
                        i14 = C0747db.a((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 38:
                        i14 = C0747db.b((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 39:
                        i14 = C0747db.e((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 40:
                        i14 = C0747db.i((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 41:
                        i14 = C0747db.h((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 42:
                        i14 = C0747db.j((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 43:
                        i14 = C0747db.f((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 44:
                        i14 = C0747db.d((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 45:
                        i14 = C0747db.h((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 46:
                        i14 = C0747db.i((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 47:
                        i14 = C0747db.g((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 48:
                        i14 = C0747db.c((List) unsafe.getObject(t2, j7));
                        if (i14 > 0) {
                            break;
                        } else {
                            break;
                        }
                    case 49:
                        b3 = C0747db.b(i19, a((Object) t2, j7), a(i16));
                        break;
                    case 50:
                        b3 = this.s.a(i19, Ab.f(t2, j7), b(i16));
                        break;
                    case 51:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 52:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 53:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            j4 = e(t2, j7);
                            break;
                        }
                    case 54:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            j5 = e(t2, j7);
                            break;
                        }
                    case 55:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            i10 = d(t2, j7);
                            break;
                        }
                    case 56:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 57:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 58:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 59:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            obj2 = Ab.f(t2, j7);
                            break;
                        }
                    case 60:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 61:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 62:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            i11 = d(t2, j7);
                            break;
                        }
                    case 63:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            i12 = d(t2, j7);
                            break;
                        }
                    case 64:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 65:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                    case 66:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            i13 = d(t2, j7);
                            break;
                        }
                    case 67:
                        if (!a(t2, i19, i16)) {
                            break;
                        } else {
                            j6 = e(t2, j7);
                            break;
                        }
                    case 68:
                        if (!a(t2, i19, i16)) {
                            break;
                        }
                        break;
                }
            }
            return i17 + a(this.q, t2);
        }
        Unsafe unsafe2 = a;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 0;
        while (i21 < this.b.length) {
            int d3 = d(i21);
            int[] iArr = this.b;
            int i25 = iArr[i21];
            int i26 = (d3 & 267386880) >>> 20;
            if (i26 <= 17) {
                i3 = iArr[i21 + 2];
                int i27 = i3 & 1048575;
                i2 = 1 << (i3 >>> 20);
                if (i27 != i23) {
                    i24 = unsafe2.getInt(t2, (long) i27);
                } else {
                    i27 = i23;
                }
                i23 = i27;
            } else {
                i3 = (!this.k || i26 < C0740ba.DOUBLE_LIST_PACKED.a() || i26 > C0740ba.SINT64_LIST_PACKED.a()) ? 0 : this.b[i21 + 2] & 1048575;
                i2 = 0;
            }
            long j8 = (long) (d3 & 1048575);
            switch (i26) {
                case 0:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i22 += M.b(i25, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        break;
                    }
                case 1:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i22 += M.b(i25, 0.0f);
                        break;
                    }
                case 2:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = M.d(i25, unsafe2.getLong(t2, j8));
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = M.e(i25, unsafe2.getLong(t2, j8));
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = M.f(i25, unsafe2.getInt(t2, j8));
                    }
                    break;
                case 5:
                    if ((i24 & i2) == 0) {
                        j2 = 0;
                        break;
                    } else {
                        j2 = 0;
                        i4 = M.g(i25, 0);
                    }
                case 6:
                    if ((i24 & i2) != 0) {
                        i22 += M.i(i25, 0);
                        break;
                    }
                case 7:
                    break;
                case 8:
                    if ((i24 & i2) != 0) {
                        obj = unsafe2.getObject(t2, j8);
                        break;
                    }
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    if ((i24 & i2) != 0) {
                        i5 = unsafe2.getInt(t2, j8);
                        break;
                    }
                    break;
                case 12:
                    if ((i24 & i2) != 0) {
                        i6 = unsafe2.getInt(t2, j8);
                        break;
                    }
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    if ((i24 & i2) != 0) {
                        i8 = unsafe2.getInt(t2, j8);
                        break;
                    }
                    break;
                case 16:
                    if ((i24 & i2) != 0) {
                        j3 = unsafe2.getLong(t2, j8);
                        break;
                    }
                    break;
                case 17:
                    break;
                case 18:
                case 23:
                case 32:
                    b2 = C0747db.i(i25, (List) unsafe2.getObject(t2, j8), false);
                case 19:
                case 24:
                case 31:
                    b2 = C0747db.h(i25, (List) unsafe2.getObject(t2, j8), false);
                case 20:
                    b2 = C0747db.a(i25, (List) unsafe2.getObject(t2, j8), false);
                case 21:
                    b2 = C0747db.b(i25, (List) unsafe2.getObject(t2, j8), false);
                case 22:
                    b2 = C0747db.e(i25, (List) unsafe2.getObject(t2, j8), false);
                case 25:
                    b2 = C0747db.j(i25, (List) unsafe2.getObject(t2, j8), false);
                case 26:
                    b2 = C0747db.a(i25, (List) unsafe2.getObject(t2, j8));
                case 27:
                    b2 = C0747db.a(i25, (List) unsafe2.getObject(t2, j8), a(i21));
                case 28:
                    b2 = C0747db.b(i25, (List) unsafe2.getObject(t2, j8));
                case 29:
                    b2 = C0747db.f(i25, (List) unsafe2.getObject(t2, j8), false);
                case 30:
                    b2 = C0747db.d(i25, (List) unsafe2.getObject(t2, j8), false);
                case 33:
                    b2 = C0747db.g(i25, (List) unsafe2.getObject(t2, j8), false);
                case 34:
                    b2 = C0747db.c(i25, (List) unsafe2.getObject(t2, j8), false);
                case 35:
                    i9 = C0747db.i((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 36:
                    i9 = C0747db.h((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 37:
                    i9 = C0747db.a((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 38:
                    i9 = C0747db.b((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 39:
                    i9 = C0747db.e((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 40:
                    i9 = C0747db.i((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 41:
                    i9 = C0747db.h((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 42:
                    i9 = C0747db.j((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 43:
                    i9 = C0747db.f((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 44:
                    i9 = C0747db.d((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 45:
                    i9 = C0747db.h((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 46:
                    i9 = C0747db.i((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 47:
                    i9 = C0747db.g((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 48:
                    i9 = C0747db.c((List) unsafe2.getObject(t2, j8));
                    if (i9 > 0) {
                        break;
                    }
                    break;
                case 49:
                    b2 = C0747db.b(i25, (List) unsafe2.getObject(t2, j8), a(i21));
                case 50:
                    b2 = this.s.a(i25, unsafe2.getObject(t2, j8), b(i21));
                case 51:
                    if (a(t2, i25, i21)) {
                        b2 = M.b(i25, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    }
                    break;
                case 52:
                    if (a(t2, i25, i21)) {
                        i7 = M.b(i25, 0.0f);
                    }
                    break;
                case 53:
                    if (a(t2, i25, i21)) {
                        b2 = M.d(i25, e(t2, j8));
                    }
                    break;
                case 54:
                    if (a(t2, i25, i21)) {
                        b2 = M.e(i25, e(t2, j8));
                    }
                    break;
                case 55:
                    if (a(t2, i25, i21)) {
                        b2 = M.f(i25, d(t2, j8));
                    }
                    break;
                case 56:
                    if (a(t2, i25, i21)) {
                        b2 = M.g(i25, 0);
                    }
                    break;
                case 57:
                    if (a(t2, i25, i21)) {
                        i7 = M.i(i25, 0);
                    }
                    break;
                case 58:
                    break;
                case 59:
                    if (a(t2, i25, i21)) {
                        obj = unsafe2.getObject(t2, j8);
                        break;
                    }
                    break;
                case 60:
                    break;
                case 61:
                    break;
                case 62:
                    if (a(t2, i25, i21)) {
                        i5 = d(t2, j8);
                        break;
                    }
                    break;
                case 63:
                    if (a(t2, i25, i21)) {
                        i6 = d(t2, j8);
                        break;
                    }
                    break;
                case 64:
                    break;
                case 65:
                    break;
                case 66:
                    if (a(t2, i25, i21)) {
                        i8 = d(t2, j8);
                        break;
                    }
                    break;
                case 67:
                    if (a(t2, i25, i21)) {
                        j3 = e(t2, j8);
                        break;
                    }
                    break;
                case 68:
                    break;
            }
        }
        int a2 = i22 + a(this.q, t2);
        if (this.h) {
            a2 += this.r.a((Object) t2).g();
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.Ab.f(r8, r2));
        b(r7, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.Ab.f(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b3, code lost:
        com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c8, code lost:
        com.google.android.gms.internal.clearcut.Ab.a((java.lang.Object) r7, r2, com.google.android.gms.internal.clearcut.Ab.b(r8, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00eb, code lost:
        b(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ee, code lost:
        r0 = r0 + 4;
     */
    public final void b(T t, T t2) {
        if (t2 != null) {
            int i2 = 0;
            while (i2 < this.b.length) {
                int d2 = d(i2);
                long j2 = (long) (1048575 & d2);
                int i3 = this.b[i2];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ab.a((Object) t, j2, Ab.e(t2, j2));
                        }
                    case 1:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ab.a((Object) t, j2, Ab.d(t2, j2));
                        }
                    case 2:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 3:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 4:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 5:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 6:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 7:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ab.a((Object) t, j2, Ab.c(t2, j2));
                        }
                    case 8:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 9:
                    case 17:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 11:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 12:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 13:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 14:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 15:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 16:
                        if (!a(t2, i2)) {
                            break;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.p.a(t, t2, j2);
                        break;
                    case 50:
                        C0747db.a(this.s, t, t2, j2);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                    case 60:
                    case 68:
                        b(t, t2, i2);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!a(t2, i3, i2)) {
                            break;
                        }
                }
            }
            if (!this.j) {
                C0747db.a(this.q, t, t2);
                if (this.h) {
                    C0747db.a(this.r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e6 A[SYNTHETIC] */
    public final boolean c(T t) {
        int i2;
        int i3;
        boolean z;
        T t2 = t;
        int[] iArr = this.l;
        int i4 = 1;
        if (iArr == null || iArr.length == 0) {
            return true;
        }
        int length = iArr.length;
        int i5 = 0;
        int i6 = -1;
        int i7 = 0;
        while (i5 < length) {
            int i8 = iArr[i5];
            int f2 = f(i8);
            int d2 = d(f2);
            if (!this.j) {
                int i9 = this.b[f2 + 2];
                int i10 = i9 & 1048575;
                i3 = i4 << (i9 >>> 20);
                if (i10 != i6) {
                    i2 = i5;
                    i7 = a.getInt(t2, (long) i10);
                    i6 = i10;
                } else {
                    i2 = i5;
                }
            } else {
                i2 = i5;
                i3 = 0;
            }
            if (((268435456 & d2) != 0) && !a(t2, f2, i7, i3)) {
                return false;
            }
            int i11 = (267386880 & d2) >>> 20;
            if (i11 != 9 && i11 != 17) {
                if (i11 != 27) {
                    if (i11 == 60 || i11 == 68) {
                        if (a(t2, i8, f2) && !a((Object) t2, d2, a(f2))) {
                            return false;
                        }
                    } else if (i11 != 49) {
                        if (i11 == 50 && !this.s.e(Ab.f(t2, (long) (d2 & 1048575))).isEmpty()) {
                            this.s.c(b(f2));
                            throw null;
                        }
                    }
                }
                List list = (List) Ab.f(t2, (long) (d2 & 1048575));
                if (!list.isEmpty()) {
                    C0741bb a2 = a(f2);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            break;
                        } else if (!a2.c(list.get(i12))) {
                            z = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (z) {
                        return false;
                    }
                }
                z = true;
                if (z) {
                }
            } else if (a(t2, f2, i7, i3) && !a((Object) t2, d2, a(f2))) {
                return false;
            }
            i5 = i2 + 1;
            i4 = 1;
        }
        return !this.h || this.r.a((Object) t2).d();
    }

    public final void d(T t) {
        int[] iArr = this.m;
        if (iArr != null) {
            for (int d2 : iArr) {
                long d3 = (long) (d(d2) & 1048575);
                Object f2 = Ab.f(t, d3);
                if (f2 != null) {
                    this.s.b(f2);
                    Ab.a((Object) t, d3, f2);
                }
            }
        }
        int[] iArr2 = this.n;
        if (iArr2 != null) {
            for (int i2 : iArr2) {
                this.p.a(t, (long) i2);
            }
        }
        this.q.a(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    public final T newInstance() {
        return this.o.a(this.g);
    }
}
