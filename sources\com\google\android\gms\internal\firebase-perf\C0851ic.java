package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.c;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-perf.ic reason: case insensitive filesystem */
final class C0851ic<T> implements C0886rc<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = Qc.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final C0835ec g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final C0855jc o;
    private final Ob p;
    private final Kc<?, ?> q;
    private final C0850ib<?> r;
    private final Xb s;

    private C0851ic(int[] iArr, Object[] objArr, int i2, int i3, C0835ec ecVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, C0855jc jcVar, Ob ob, Kc<?, ?> kc, C0850ib<?> ibVar, Xb xb) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = ecVar instanceof C0889sb;
        this.j = z;
        this.h = ibVar != null && ibVar.a(ecVar);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = jcVar;
        this.p = ob;
        this.q = kc;
        this.r = ibVar;
        this.g = ecVar;
        this.s = xb;
    }

    static <T> C0851ic<T> a(Class<T> cls, C0821bc bcVar, C0855jc jcVar, Ob ob, Kc<?, ?> kc, C0850ib<?> ibVar, Xb xb) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        char c2;
        int i9;
        int i10;
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Class cls2;
        int i18;
        int i19;
        Field field;
        int i20;
        char charAt;
        int i21;
        char c3;
        Field field2;
        Field field3;
        int i22;
        char charAt2;
        int i23;
        char charAt3;
        int i24;
        char charAt4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        char charAt5;
        int i31;
        char charAt6;
        int i32;
        char charAt7;
        int i33;
        char charAt8;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        char charAt14;
        C0821bc bcVar2 = bcVar;
        if (bcVar2 instanceof C0890sc) {
            C0890sc scVar = (C0890sc) bcVar2;
            char c4 = 0;
            boolean z = scVar.c() == c.j;
            String d2 = scVar.d();
            int length = d2.length();
            char charAt15 = d2.charAt(0);
            if (charAt15 >= 55296) {
                char c5 = charAt15 & 8191;
                int i34 = 1;
                int i35 = 13;
                while (true) {
                    i2 = i34 + 1;
                    charAt14 = d2.charAt(i34);
                    if (charAt14 < 55296) {
                        break;
                    }
                    c5 |= (charAt14 & 8191) << i35;
                    i35 += 13;
                    i34 = i2;
                }
                charAt15 = (charAt14 << i35) | c5;
            } else {
                i2 = 1;
            }
            int i36 = i2 + 1;
            char charAt16 = d2.charAt(i2);
            if (charAt16 >= 55296) {
                char c6 = charAt16 & 8191;
                int i37 = 13;
                while (true) {
                    i3 = i36 + 1;
                    charAt13 = d2.charAt(i36);
                    if (charAt13 < 55296) {
                        break;
                    }
                    c6 |= (charAt13 & 8191) << i37;
                    i37 += 13;
                    i36 = i3;
                }
                charAt16 = c6 | (charAt13 << i37);
            } else {
                i3 = i36;
            }
            if (charAt16 == 0) {
                iArr = a;
                c2 = 0;
                i8 = 0;
                i7 = 0;
                i6 = 0;
                i5 = 0;
                i4 = 0;
            } else {
                int i38 = i3 + 1;
                int charAt17 = d2.charAt(i3);
                if (charAt17 >= 55296) {
                    int i39 = charAt17 & 8191;
                    int i40 = 13;
                    while (true) {
                        i25 = i38 + 1;
                        charAt12 = d2.charAt(i38);
                        if (charAt12 < 55296) {
                            break;
                        }
                        i39 |= (charAt12 & 8191) << i40;
                        i40 += 13;
                        i38 = i25;
                    }
                    charAt17 = (charAt12 << i40) | i39;
                } else {
                    i25 = i38;
                }
                int i41 = i25 + 1;
                char charAt18 = d2.charAt(i25);
                if (charAt18 >= 55296) {
                    char c7 = charAt18 & 8191;
                    int i42 = 13;
                    while (true) {
                        i26 = i41 + 1;
                        charAt11 = d2.charAt(i41);
                        if (charAt11 < 55296) {
                            break;
                        }
                        c7 |= (charAt11 & 8191) << i42;
                        i42 += 13;
                        i41 = i26;
                    }
                    charAt18 = c7 | (charAt11 << i42);
                } else {
                    i26 = i41;
                }
                int i43 = i26 + 1;
                int charAt19 = d2.charAt(i26);
                if (charAt19 >= 55296) {
                    int i44 = charAt19 & 8191;
                    int i45 = 13;
                    while (true) {
                        i27 = i43 + 1;
                        charAt10 = d2.charAt(i43);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i44 |= (charAt10 & 8191) << i45;
                        i45 += 13;
                        i43 = i27;
                    }
                    charAt19 = (charAt10 << i45) | i44;
                } else {
                    i27 = i43;
                }
                int i46 = i27 + 1;
                i6 = d2.charAt(i27);
                if (i6 >= 55296) {
                    int i47 = i6 & 8191;
                    int i48 = 13;
                    while (true) {
                        i28 = i46 + 1;
                        charAt9 = d2.charAt(i46);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i47 |= (charAt9 & 8191) << i48;
                        i48 += 13;
                        i46 = i28;
                    }
                    i6 = (charAt9 << i48) | i47;
                } else {
                    i28 = i46;
                }
                int i49 = i28 + 1;
                i5 = d2.charAt(i28);
                if (i5 >= 55296) {
                    int i50 = i5 & 8191;
                    int i51 = 13;
                    while (true) {
                        i33 = i49 + 1;
                        charAt8 = d2.charAt(i49);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i50 |= (charAt8 & 8191) << i51;
                        i51 += 13;
                        i49 = i33;
                    }
                    i5 = (charAt8 << i51) | i50;
                    i49 = i33;
                }
                int i52 = i49 + 1;
                c2 = d2.charAt(i49);
                if (c2 >= 55296) {
                    char c8 = c2 & 8191;
                    int i53 = 13;
                    while (true) {
                        i32 = i52 + 1;
                        charAt7 = d2.charAt(i52);
                        if (charAt7 < 55296) {
                            break;
                        }
                        c8 |= (charAt7 & 8191) << i53;
                        i53 += 13;
                        i52 = i32;
                    }
                    c2 = c8 | (charAt7 << i53);
                    i52 = i32;
                }
                int i54 = i52 + 1;
                char charAt20 = d2.charAt(i52);
                if (charAt20 >= 55296) {
                    int i55 = 13;
                    int i56 = i54;
                    int i57 = charAt20 & 8191;
                    int i58 = i56;
                    while (true) {
                        i31 = i58 + 1;
                        charAt6 = d2.charAt(i58);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i57 |= (charAt6 & 8191) << i55;
                        i55 += 13;
                        i58 = i31;
                    }
                    charAt20 = i57 | (charAt6 << i55);
                    i29 = i31;
                } else {
                    i29 = i54;
                }
                int i59 = i29 + 1;
                c4 = d2.charAt(i29);
                if (c4 >= 55296) {
                    int i60 = 13;
                    int i61 = i59;
                    int i62 = c4 & 8191;
                    int i63 = i61;
                    while (true) {
                        i30 = i63 + 1;
                        charAt5 = d2.charAt(i63);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i62 |= (charAt5 & 8191) << i60;
                        i60 += 13;
                        i63 = i30;
                    }
                    c4 = i62 | (charAt5 << i60);
                    i59 = i30;
                }
                iArr = new int[(c4 + c2 + charAt20)];
                i7 = (charAt17 << 1) + charAt18;
                int i64 = i59;
                i4 = charAt17;
                i8 = charAt19;
                i3 = i64;
            }
            Unsafe unsafe = b;
            Object[] e2 = scVar.e();
            Class cls3 = scVar.b().getClass();
            int i65 = i7;
            int[] iArr2 = new int[(i5 * 3)];
            Object[] objArr = new Object[(i5 << 1)];
            int i66 = c4 + c2;
            int i67 = c4;
            int i68 = i66;
            int i69 = 0;
            int i70 = 0;
            while (i3 < length) {
                int i71 = i3 + 1;
                int charAt21 = d2.charAt(i3);
                char c9 = 55296;
                if (charAt21 >= 55296) {
                    int i72 = 13;
                    int i73 = i71;
                    int i74 = charAt21 & 8191;
                    int i75 = i73;
                    while (true) {
                        i24 = i75 + 1;
                        charAt4 = d2.charAt(i75);
                        if (charAt4 < c9) {
                            break;
                        }
                        i74 |= (charAt4 & 8191) << i72;
                        i72 += 13;
                        i75 = i24;
                        c9 = 55296;
                    }
                    charAt21 = i74 | (charAt4 << i72);
                    i9 = i24;
                } else {
                    i9 = i71;
                }
                int i76 = i9 + 1;
                char charAt22 = d2.charAt(i9);
                int i77 = length;
                char c10 = 55296;
                if (charAt22 >= 55296) {
                    int i78 = 13;
                    int i79 = i76;
                    int i80 = charAt22 & 8191;
                    int i81 = i79;
                    while (true) {
                        i23 = i81 + 1;
                        charAt3 = d2.charAt(i81);
                        if (charAt3 < c10) {
                            break;
                        }
                        i80 |= (charAt3 & 8191) << i78;
                        i78 += 13;
                        i81 = i23;
                        c10 = 55296;
                    }
                    charAt22 = i80 | (charAt3 << i78);
                    i10 = i23;
                } else {
                    i10 = i76;
                }
                int i82 = c4;
                char c11 = charAt22 & 255;
                boolean z2 = z;
                if ((charAt22 & 1024) != 0) {
                    int i83 = i69 + 1;
                    iArr[i69] = i70;
                    i69 = i83;
                }
                int i84 = i69;
                if (c11 >= '3') {
                    int i85 = i10 + 1;
                    char charAt23 = d2.charAt(i10);
                    char c12 = 55296;
                    if (charAt23 >= 55296) {
                        char c13 = charAt23 & 8191;
                        int i86 = 13;
                        while (true) {
                            i22 = i85 + 1;
                            charAt2 = d2.charAt(i85);
                            if (charAt2 < c12) {
                                break;
                            }
                            c13 |= (charAt2 & 8191) << i86;
                            i86 += 13;
                            i85 = i22;
                            c12 = 55296;
                        }
                        charAt23 = c13 | (charAt2 << i86);
                        i85 = i22;
                    }
                    int i87 = c11 - '3';
                    int i88 = i85;
                    if (i87 == 9 || i87 == 17) {
                        c3 = 1;
                        int i89 = i65 + 1;
                        objArr[((i70 / 3) << 1) + 1] = e2[i65];
                        i65 = i89;
                    } else {
                        if (i87 == 12 && (charAt15 & 1) == 1) {
                            int i90 = i65 + 1;
                            objArr[((i70 / 3) << 1) + 1] = e2[i65];
                            i65 = i90;
                        }
                        c3 = 1;
                    }
                    int i91 = charAt23 << c3;
                    Object obj = e2[i91];
                    if (obj instanceof Field) {
                        field2 = (Field) obj;
                    } else {
                        field2 = a(cls3, (String) obj);
                        e2[i91] = field2;
                    }
                    int i92 = i8;
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(field2);
                    int i93 = i91 + 1;
                    Object obj2 = e2[i93];
                    int i94 = objectFieldOffset;
                    if (obj2 instanceof Field) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = a(cls3, (String) obj2);
                        e2[i93] = field3;
                    }
                    str = d2;
                    i16 = (int) unsafe.objectFieldOffset(field3);
                    cls2 = cls3;
                    i12 = i65;
                    i15 = i94;
                    i17 = 0;
                    i11 = i92;
                    i13 = i6;
                    i14 = charAt21;
                    i19 = i88;
                } else {
                    int i95 = i8;
                    int i96 = i65 + 1;
                    Field a2 = a(cls3, (String) e2[i65]);
                    i13 = i6;
                    if (c11 == 9 || c11 == 17) {
                        i11 = i95;
                        objArr[((i70 / 3) << 1) + 1] = a2.getType();
                    } else {
                        if (c11 == 27 || c11 == '1') {
                            i11 = i95;
                            i21 = i96 + 1;
                            objArr[((i70 / 3) << 1) + 1] = e2[i96];
                        } else if (c11 == 12 || c11 == 30 || c11 == ',') {
                            i11 = i95;
                            if ((charAt15 & 1) == 1) {
                                i21 = i96 + 1;
                                objArr[((i70 / 3) << 1) + 1] = e2[i96];
                            }
                        } else if (c11 == '2') {
                            int i97 = i67 + 1;
                            iArr[i67] = i70;
                            int i98 = (i70 / 3) << 1;
                            int i99 = i96 + 1;
                            objArr[i98] = e2[i96];
                            if ((charAt22 & 2048) != 0) {
                                i96 = i99 + 1;
                                objArr[i98 + 1] = e2[i99];
                                i11 = i95;
                                i67 = i97;
                            } else {
                                i67 = i97;
                                i96 = i99;
                                i11 = i95;
                            }
                        } else {
                            i11 = i95;
                        }
                        i14 = charAt21;
                        i96 = i21;
                        i15 = (int) unsafe.objectFieldOffset(a2);
                        if ((charAt15 & 1) == 1 || c11 > 17) {
                            str = d2;
                            cls2 = cls3;
                            i12 = i96;
                            i18 = i10;
                            i17 = 0;
                            i16 = 0;
                        } else {
                            i18 = i10 + 1;
                            char charAt24 = d2.charAt(i10);
                            if (charAt24 >= 55296) {
                                char c14 = charAt24 & 8191;
                                int i100 = 13;
                                while (true) {
                                    i20 = i18 + 1;
                                    charAt = d2.charAt(i18);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    c14 |= (charAt & 8191) << i100;
                                    i100 += 13;
                                    i18 = i20;
                                }
                                charAt24 = c14 | (charAt << i100);
                                i18 = i20;
                            }
                            int i101 = (i4 << 1) + (charAt24 / ' ');
                            Object obj3 = e2[i101];
                            str = d2;
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = a(cls3, (String) obj3);
                                e2[i101] = field;
                            }
                            cls2 = cls3;
                            i12 = i96;
                            i16 = (int) unsafe.objectFieldOffset(field);
                            i17 = charAt24 % ' ';
                        }
                        if (c11 >= 18 && c11 <= '1') {
                            int i102 = i68 + 1;
                            iArr[i68] = i15;
                            i68 = i102;
                        }
                        i19 = i18;
                    }
                    i14 = charAt21;
                    i15 = (int) unsafe.objectFieldOffset(a2);
                    if ((charAt15 & 1) == 1) {
                    }
                    str = d2;
                    cls2 = cls3;
                    i12 = i96;
                    i18 = i10;
                    i17 = 0;
                    i16 = 0;
                    int i1022 = i68 + 1;
                    iArr[i68] = i15;
                    i68 = i1022;
                    i19 = i18;
                }
                int i103 = i70 + 1;
                iArr2[i70] = i14;
                int i104 = i103 + 1;
                iArr2[i103] = (c11 << 20) | ((charAt22 & 256) != 0 ? 268435456 : 0) | ((charAt22 & 512) != 0 ? 536870912 : 0) | i15;
                i70 = i104 + 1;
                iArr2[i104] = (i17 << 20) | i16;
                cls3 = cls2;
                i6 = i13;
                c4 = i82;
                i65 = i12;
                length = i77;
                z = z2;
                i8 = i11;
                i69 = i84;
                d2 = str;
            }
            boolean z3 = z;
            C0851ic icVar = new C0851ic(iArr2, objArr, i8, i6, scVar.b(), z, false, iArr, c4, i66, jcVar, ob, kc, ibVar, xb);
            return icVar;
        }
        ((Hc) bcVar2).c();
        throw null;
    }

    private static <T> long e(T t, long j2) {
        return ((Long) Qc.f(t, j2)).longValue();
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) Qc.f(t, j2)).booleanValue();
    }

    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.c.length; i2 += 3) {
                int c2 = c(i2);
                long j2 = (long) (1048575 & c2);
                int i3 = this.c[i2];
                switch ((c2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.e(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 1:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.d(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 2:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 3:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 4:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 5:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 6:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 7:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.c(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 8:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 9:
                        a(t, t2, i2);
                        break;
                    case 10:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 11:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 12:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 13:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 14:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 15:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 16:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Qc.a((Object) t, j2, Qc.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 17:
                        a(t, t2, i2);
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
                        C0894tc.a(this.s, t, t2, j2);
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
                        } else {
                            Qc.a((Object) t, j2, Qc.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case 60:
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
                        } else {
                            Qc.a((Object) t, j2, Qc.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case 68:
                        b(t, t2, i2);
                        break;
                }
            }
            if (!this.j) {
                C0894tc.a(this.q, t, t2);
                if (this.h) {
                    C0894tc.a(this.r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    public final boolean c(T t) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.h || this.r.a((Object) t).c();
            }
            int i6 = this.l[i3];
            int i7 = this.c[i6];
            int c2 = c(i6);
            if (!this.j) {
                int i8 = this.c[i6 + 2];
                int i9 = i8 & 1048575;
                i2 = 1 << (i8 >>> 20);
                if (i9 != i4) {
                    i5 = b.getInt(t, (long) i9);
                    i4 = i9;
                }
            } else {
                i2 = 0;
            }
            if (((268435456 & c2) != 0) && !a(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & c2) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (a(t, i7, i6) && !a((Object) t, c2, a(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 != 50) {
                            continue;
                        } else {
                            Map e2 = this.s.e(Qc.f(t, (long) (c2 & 1048575)));
                            if (!e2.isEmpty()) {
                                if (this.s.b(b(i6)).c.a() == fd.MESSAGE) {
                                    C0886rc rcVar = null;
                                    Iterator it = e2.values().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            break;
                                        }
                                        Object next = it.next();
                                        if (rcVar == null) {
                                            rcVar = C0883qc.a().a(next.getClass());
                                        }
                                        if (!rcVar.c(next)) {
                                            z = false;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (!z) {
                                return false;
                            }
                        }
                    }
                }
                List list = (List) Qc.f(t, (long) (c2 & 1048575));
                if (!list.isEmpty()) {
                    C0886rc a2 = a(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!a2.c(list.get(i11))) {
                            z = false;
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            } else if (a(t, i6, i5, i2) && !a((Object) t, c2, a(i6))) {
                return false;
            }
            i3++;
        }
    }

    public final void d(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long c2 = (long) (c(this.l[i3]) & 1048575);
            Object f2 = Qc.f(t, c2);
            if (f2 != null) {
                this.s.d(f2);
                Qc.a((Object) t, c2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.a(t, (long) this.l[i2]);
            i2++;
        }
        this.q.a(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    private final int d(int i2) {
        return this.c[i2 + 2];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) Qc.f(t, j2)).intValue();
    }

    private final int c(int i2) {
        return this.c[i2 + 1];
    }

    private static <T> float c(T t, long j2) {
        return ((Float) Qc.f(t, j2)).floatValue();
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final void b(T t, T t2, int i2) {
        int c2 = c(i2);
        int i3 = this.c[i2];
        long j2 = (long) (c2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = Qc.f(t, j2);
            Object f3 = Qc.f(t2, j2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    Qc.a((Object) t, j2, f3);
                    b(t, i3, i2);
                }
                return;
            }
            Qc.a((Object) t, j2, C0897ub.a(f2, f3));
            b(t, i3, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0834, code lost:
        r8 = (r8 + r9) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x0900, code lost:
        r5 = r5 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0915, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x095a, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0a11, code lost:
        r5 = r5 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a34, code lost:
        r3 = r3 + 3;
        r9 = r13;
        r7 = 1048575;
        r8 = 1;
     */
    public final int b(T t) {
        int i2;
        int i3;
        long j2;
        int i4;
        int b2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int b3;
        int i10;
        int i11;
        int i12;
        T t2 = t;
        int i13 = 267386880;
        int i14 = 1048575;
        int i15 = 1;
        if (this.j) {
            Unsafe unsafe = b;
            int i16 = 0;
            int i17 = 0;
            while (i16 < this.c.length) {
                int c2 = c(i16);
                int i18 = (c2 & i13) >>> 20;
                int i19 = this.c[i16];
                long j3 = (long) (c2 & 1048575);
                int i20 = (i18 < C0874ob.J.a() || i18 > C0874ob.W.a()) ? 0 : this.c[i16 + 2] & 1048575;
                switch (i18) {
                    case 0:
                        if (a(t2, i16)) {
                            b3 = C0838fb.b(i19, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        } else {
                            continue;
                        }
                    case 1:
                        if (a(t2, i16)) {
                            b3 = C0838fb.b(i19, 0.0f);
                        } else {
                            continue;
                        }
                    case 2:
                        if (a(t2, i16)) {
                            b3 = C0838fb.d(i19, Qc.b(t2, j3));
                        } else {
                            continue;
                        }
                    case 3:
                        if (a(t2, i16)) {
                            b3 = C0838fb.e(i19, Qc.b(t2, j3));
                        } else {
                            continue;
                        }
                    case 4:
                        if (a(t2, i16)) {
                            b3 = C0838fb.f(i19, Qc.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 5:
                        if (a(t2, i16)) {
                            b3 = C0838fb.g(i19, 0);
                        } else {
                            continue;
                        }
                    case 6:
                        if (a(t2, i16)) {
                            b3 = C0838fb.i(i19, 0);
                        } else {
                            continue;
                        }
                    case 7:
                        if (a(t2, i16)) {
                            b3 = C0838fb.b(i19, true);
                        } else {
                            continue;
                        }
                    case 8:
                        if (a(t2, i16)) {
                            Object f2 = Qc.f(t2, j3);
                            if (f2 instanceof Oa) {
                                b3 = C0838fb.c(i19, (Oa) f2);
                            } else {
                                b3 = C0838fb.b(i19, (String) f2);
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a(t2, i16)) {
                            b3 = C0894tc.a(i19, Qc.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                    case 10:
                        if (a(t2, i16)) {
                            b3 = C0838fb.c(i19, (Oa) Qc.f(t2, j3));
                        } else {
                            continue;
                        }
                    case 11:
                        if (a(t2, i16)) {
                            b3 = C0838fb.g(i19, Qc.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 12:
                        if (a(t2, i16)) {
                            b3 = C0838fb.k(i19, Qc.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 13:
                        if (a(t2, i16)) {
                            b3 = C0838fb.j(i19, 0);
                        } else {
                            continue;
                        }
                    case 14:
                        if (a(t2, i16)) {
                            b3 = C0838fb.h(i19, 0);
                        } else {
                            continue;
                        }
                    case 15:
                        if (a(t2, i16)) {
                            b3 = C0838fb.h(i19, Qc.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 16:
                        if (a(t2, i16)) {
                            b3 = C0838fb.f(i19, Qc.b(t2, j3));
                        } else {
                            continue;
                        }
                    case 17:
                        if (a(t2, i16)) {
                            b3 = C0838fb.c(i19, (C0835ec) Qc.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                    case 18:
                        b3 = C0894tc.i(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 19:
                        b3 = C0894tc.h(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 20:
                        b3 = C0894tc.a(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 21:
                        b3 = C0894tc.b(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 22:
                        b3 = C0894tc.e(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 23:
                        b3 = C0894tc.i(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 24:
                        b3 = C0894tc.h(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 25:
                        b3 = C0894tc.j(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 26:
                        b3 = C0894tc.a(i19, a((Object) t2, j3));
                        i17 += b3;
                        break;
                    case 27:
                        b3 = C0894tc.a(i19, a((Object) t2, j3), a(i16));
                        i17 += b3;
                        break;
                    case 28:
                        b3 = C0894tc.b(i19, a((Object) t2, j3));
                        i17 += b3;
                        break;
                    case 29:
                        b3 = C0894tc.f(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 30:
                        b3 = C0894tc.d(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 31:
                        b3 = C0894tc.h(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 32:
                        b3 = C0894tc.i(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 33:
                        b3 = C0894tc.g(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 34:
                        b3 = C0894tc.c(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 35:
                        i11 = C0894tc.i((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i11 = C0894tc.h((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i11 = C0894tc.a((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i11 = C0894tc.b((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i11 = C0894tc.e((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i11 = C0894tc.i((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i11 = C0894tc.h((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i11 = C0894tc.j((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i11 = C0894tc.f((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        i11 = C0894tc.d((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i11 = C0894tc.h((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i11 = C0894tc.i((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i11 = C0894tc.g((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i11 = C0894tc.c((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C0838fb.l(i19);
                            i10 = C0838fb.a(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        b3 = C0894tc.b(i19, a((Object) t2, j3), a(i16));
                        i17 += b3;
                        break;
                    case 50:
                        b3 = this.s.a(i19, Qc.f(t2, j3), b(i16));
                        i17 += b3;
                        break;
                    case 51:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.b(i19, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        } else {
                            continue;
                        }
                    case 52:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.b(i19, 0.0f);
                        } else {
                            continue;
                        }
                    case 53:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.d(i19, e(t2, j3));
                        } else {
                            continue;
                        }
                    case 54:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.e(i19, e(t2, j3));
                        } else {
                            continue;
                        }
                    case 55:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.f(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 56:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.g(i19, 0);
                        } else {
                            continue;
                        }
                    case 57:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.i(i19, 0);
                        } else {
                            continue;
                        }
                    case 58:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.b(i19, true);
                        } else {
                            continue;
                        }
                    case 59:
                        if (a(t2, i19, i16)) {
                            Object f3 = Qc.f(t2, j3);
                            if (f3 instanceof Oa) {
                                b3 = C0838fb.c(i19, (Oa) f3);
                            } else {
                                b3 = C0838fb.b(i19, (String) f3);
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a(t2, i19, i16)) {
                            b3 = C0894tc.a(i19, Qc.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                    case 61:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.c(i19, (Oa) Qc.f(t2, j3));
                        } else {
                            continue;
                        }
                    case 62:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.g(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 63:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.k(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 64:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.j(i19, 0);
                        } else {
                            continue;
                        }
                    case 65:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.h(i19, 0);
                        } else {
                            continue;
                        }
                    case 66:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.h(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 67:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.f(i19, e(t2, j3));
                        } else {
                            continue;
                        }
                    case 68:
                        if (a(t2, i19, i16)) {
                            b3 = C0838fb.c(i19, (C0835ec) Qc.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                }
                b3 = i12 + i10 + i11;
                i17 += b3;
                i16 += 3;
                i13 = 267386880;
            }
            return i17 + a(this.q, t2);
        }
        Unsafe unsafe2 = b;
        int i21 = 0;
        int i22 = 0;
        int i23 = -1;
        int i24 = 0;
        while (i21 < this.c.length) {
            int c3 = c(i21);
            int[] iArr = this.c;
            int i25 = iArr[i21];
            int i26 = (c3 & 267386880) >>> 20;
            if (i26 <= 17) {
                i3 = iArr[i21 + 2];
                int i27 = i3 & i14;
                i2 = i15 << (i3 >>> 20);
                if (i27 != i23) {
                    i24 = unsafe2.getInt(t2, (long) i27);
                } else {
                    i27 = i23;
                }
                i23 = i27;
            } else {
                i3 = (!this.k || i26 < C0874ob.J.a() || i26 > C0874ob.W.a()) ? 0 : this.c[i21 + 2] & i14;
                i2 = 0;
            }
            long j4 = (long) (c3 & i14);
            switch (i26) {
                case 0:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i22 += C0838fb.b(i25, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        break;
                    }
                case 1:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i22 += C0838fb.b(i25, 0.0f);
                    }
                    break;
                case 2:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = C0838fb.d(i25, unsafe2.getLong(t2, j4));
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = C0838fb.e(i25, unsafe2.getLong(t2, j4));
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = C0838fb.f(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 5:
                    if ((i24 & i2) == 0) {
                        j2 = 0;
                        break;
                    } else {
                        j2 = 0;
                        i4 = C0838fb.g(i25, 0);
                    }
                case 6:
                    if ((i24 & i2) == 0) {
                        break;
                    } else {
                        i22 += C0838fb.i(i25, 0);
                        break;
                    }
                case 7:
                    if ((i24 & i2) != 0) {
                        i22 += C0838fb.b(i25, true);
                        break;
                    }
                case 8:
                    if ((i24 & i2) != 0) {
                        Object object = unsafe2.getObject(t2, j4);
                        if (object instanceof Oa) {
                            b2 = C0838fb.c(i25, (Oa) object);
                        } else {
                            b2 = C0838fb.b(i25, (String) object);
                        }
                    }
                    break;
                case 9:
                    if ((i24 & i2) != 0) {
                        b2 = C0894tc.a(i25, unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
                case 10:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.c(i25, (Oa) unsafe2.getObject(t2, j4));
                    }
                    break;
                case 11:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.g(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 12:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.k(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 13:
                    if ((i24 & i2) != 0) {
                        i5 = C0838fb.j(i25, 0);
                    }
                    break;
                case 14:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.h(i25, 0);
                    }
                    break;
                case 15:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.h(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 16:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.f(i25, unsafe2.getLong(t2, j4));
                    }
                    break;
                case 17:
                    if ((i24 & i2) != 0) {
                        b2 = C0838fb.c(i25, (C0835ec) unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
                case 18:
                    b2 = C0894tc.i(i25, (List) unsafe2.getObject(t2, j4), false);
                    i22 += b2;
                    break;
                case 19:
                    i6 = C0894tc.h(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 20:
                    i6 = C0894tc.a(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 21:
                    i6 = C0894tc.b(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 22:
                    i6 = C0894tc.e(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 23:
                    i6 = C0894tc.i(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 24:
                    i6 = C0894tc.h(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 25:
                    i6 = C0894tc.j(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 26:
                    b2 = C0894tc.a(i25, (List) unsafe2.getObject(t2, j4));
                    i22 += b2;
                    break;
                case 27:
                    b2 = C0894tc.a(i25, (List) unsafe2.getObject(t2, j4), a(i21));
                    i22 += b2;
                    break;
                case 28:
                    b2 = C0894tc.b(i25, (List) unsafe2.getObject(t2, j4));
                    i22 += b2;
                    break;
                case 29:
                    b2 = C0894tc.f(i25, (List) unsafe2.getObject(t2, j4), false);
                    i22 += b2;
                    break;
                case 30:
                    i6 = C0894tc.d(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 31:
                    i6 = C0894tc.h(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 32:
                    i6 = C0894tc.i(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 33:
                    i6 = C0894tc.g(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 34:
                    i6 = C0894tc.c(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 35:
                    i9 = C0894tc.i((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 36:
                    i9 = C0894tc.h((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 37:
                    i9 = C0894tc.a((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 38:
                    i9 = C0894tc.b((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 39:
                    i9 = C0894tc.e((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 40:
                    i9 = C0894tc.i((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 41:
                    i9 = C0894tc.h((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 42:
                    i9 = C0894tc.j((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 43:
                    i9 = C0894tc.f((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 44:
                    i9 = C0894tc.d((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 45:
                    i9 = C0894tc.h((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 46:
                    i9 = C0894tc.i((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 47:
                    i9 = C0894tc.g((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 48:
                    i9 = C0894tc.c((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C0838fb.l(i25);
                        i7 = C0838fb.a(i9);
                        break;
                    }
                    break;
                case 49:
                    b2 = C0894tc.b(i25, (List) unsafe2.getObject(t2, j4), a(i21));
                    i22 += b2;
                    break;
                case 50:
                    b2 = this.s.a(i25, unsafe2.getObject(t2, j4), b(i21));
                    i22 += b2;
                    break;
                case 51:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.b(i25, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    }
                    break;
                case 52:
                    if (a(t2, i25, i21)) {
                        i5 = C0838fb.b(i25, 0.0f);
                    }
                    break;
                case 53:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.d(i25, e(t2, j4));
                    }
                    break;
                case 54:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.e(i25, e(t2, j4));
                    }
                    break;
                case 55:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.f(i25, d(t2, j4));
                    }
                    break;
                case 56:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.g(i25, 0);
                    }
                    break;
                case 57:
                    if (a(t2, i25, i21)) {
                        i5 = C0838fb.i(i25, 0);
                    }
                    break;
                case 58:
                    if (a(t2, i25, i21)) {
                        i5 = C0838fb.b(i25, true);
                    }
                    break;
                case 59:
                    if (a(t2, i25, i21)) {
                        Object object2 = unsafe2.getObject(t2, j4);
                        if (object2 instanceof Oa) {
                            b2 = C0838fb.c(i25, (Oa) object2);
                        } else {
                            b2 = C0838fb.b(i25, (String) object2);
                        }
                    }
                    break;
                case 60:
                    if (a(t2, i25, i21)) {
                        b2 = C0894tc.a(i25, unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
                case 61:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.c(i25, (Oa) unsafe2.getObject(t2, j4));
                    }
                    break;
                case 62:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.g(i25, d(t2, j4));
                    }
                    break;
                case 63:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.k(i25, d(t2, j4));
                    }
                    break;
                case 64:
                    if (a(t2, i25, i21)) {
                        i5 = C0838fb.j(i25, 0);
                    }
                    break;
                case 65:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.h(i25, 0);
                    }
                    break;
                case 66:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.h(i25, d(t2, j4));
                    }
                    break;
                case 67:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.f(i25, e(t2, j4));
                    }
                    break;
                case 68:
                    if (a(t2, i25, i21)) {
                        b2 = C0838fb.c(i25, (C0835ec) unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
            }
        }
        int a2 = i22 + a(this.q, t2);
        if (this.h) {
            C0870nb a3 = this.r.a((Object) t2);
            int i28 = 0;
            for (int i29 = 0; i29 < a3.b.c(); i29++) {
                Entry b4 = a3.b.b(i29);
                i28 += C0870nb.a((C0878pb) b4.getKey(), b4.getValue());
            }
            for (Entry entry : a3.b.d()) {
                i28 += C0870nb.a((C0878pb) entry.getKey(), entry.getValue());
            }
            a2 += i28;
        }
        return a2;
    }

    private static Field a(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX INFO: used method not loaded: com.google.android.gms.internal.firebase-perf.tc.a(java.lang.Object, java.lang.Object):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.firebase-perf.C0894tc.a(com.google.android.gms.internal.firebase-perf.Qc.f(r10, r6), com.google.android.gms.internal.firebase-perf.Qc.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.b(r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.b(r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.firebase-perf.C0894tc.a(com.google.android.gms.internal.firebase-perf.Qc.f(r10, r6), com.google.android.gms.internal.firebase-perf.Qc.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.firebase-perf.C0894tc.a(com.google.android.gms.internal.firebase-perf.Qc.f(r10, r6), com.google.android.gms.internal.firebase-perf.Qc.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.firebase-perf.C0894tc.a(com.google.android.gms.internal.firebase-perf.Qc.f(r10, r6), com.google.android.gms.internal.firebase-perf.Qc.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.c(r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.b(r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.b(r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.firebase-perf.Qc.b(r10, r6) == com.google.android.gms.internal.firebase-perf.Qc.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.firebase-perf.Qc.d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.firebase-perf.Qc.d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.firebase-perf.Qc.e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.firebase-perf.Qc.e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.firebase-perf.C0894tc.a(com.google.android.gms.internal.firebase-perf.Qc.f(r10, r6), com.google.android.gms.internal.firebase-perf.Qc.f(r11, r6)) != false) goto L_0x01c2;
     */
    public final boolean a(T t, T t2) {
        int length = this.c.length;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i2 < length) {
                int c2 = c(i2);
                long j2 = (long) (c2 & 1048575);
                switch ((c2 & 267386880) >>> 20) {
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
                        z = C0894tc.a(Qc.f(t, j2), Qc.f(t2, j2));
                        break;
                    case 50:
                        z = C0894tc.a(Qc.f(t, j2), Qc.f(t2, j2));
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
                        long d2 = (long) (d(i2) & 1048575);
                        if (Qc.a((Object) t, d2) == Qc.a((Object) t2, d2)) {
                            break;
                        }
                }
                if (!z) {
                    return false;
                }
                i2 += 3;
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

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    public final int a(T t) {
        int i2;
        int i3;
        int length = this.c.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int c2 = c(i4);
            int i6 = this.c[i4];
            long j2 = (long) (1048575 & c2);
            int i7 = 37;
            switch ((c2 & 267386880) >>> 20) {
                case 0:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Double.doubleToLongBits(Qc.e(t, j2)));
                case 1:
                    i3 = i5 * 53;
                    i2 = Float.floatToIntBits(Qc.d(t, j2));
                case 2:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Qc.b(t, j2));
                case 3:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Qc.b(t, j2));
                case 4:
                    i3 = i5 * 53;
                    i2 = Qc.a((Object) t, j2);
                case 5:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Qc.b(t, j2));
                case 6:
                    i3 = i5 * 53;
                    i2 = Qc.a((Object) t, j2);
                case 7:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Qc.c(t, j2));
                case 8:
                    i3 = i5 * 53;
                    i2 = ((String) Qc.f(t, j2)).hashCode();
                case 9:
                    Object f2 = Qc.f(t, j2);
                    if (f2 != null) {
                        i7 = f2.hashCode();
                        break;
                    }
                    break;
                case 10:
                    i3 = i5 * 53;
                    i2 = Qc.f(t, j2).hashCode();
                case 11:
                    i3 = i5 * 53;
                    i2 = Qc.a((Object) t, j2);
                case 12:
                    i3 = i5 * 53;
                    i2 = Qc.a((Object) t, j2);
                case 13:
                    i3 = i5 * 53;
                    i2 = Qc.a((Object) t, j2);
                case 14:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Qc.b(t, j2));
                case 15:
                    i3 = i5 * 53;
                    i2 = Qc.a((Object) t, j2);
                case 16:
                    i3 = i5 * 53;
                    i2 = C0897ub.a(Qc.b(t, j2));
                case 17:
                    Object f3 = Qc.f(t, j2);
                    if (f3 != null) {
                        i7 = f3.hashCode();
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
                    i3 = i5 * 53;
                    i2 = Qc.f(t, j2).hashCode();
                case 50:
                    i3 = i5 * 53;
                    i2 = Qc.f(t, j2).hashCode();
                case 51:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(Double.doubleToLongBits(b(t, j2)));
                    }
                case 52:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Float.floatToIntBits(c(t, j2));
                    }
                case 53:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(e(t, j2));
                    }
                case 54:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(e(t, j2));
                    }
                case 55:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = d(t, j2);
                    }
                case 56:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(e(t, j2));
                    }
                case 57:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = d(t, j2);
                    }
                case 58:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(f(t, j2));
                    }
                case 59:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = ((String) Qc.f(t, j2)).hashCode();
                    }
                case 60:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Qc.f(t, j2).hashCode();
                    }
                case 61:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Qc.f(t, j2).hashCode();
                    }
                case 62:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = d(t, j2);
                    }
                case 63:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = d(t, j2);
                    }
                case 64:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = d(t, j2);
                    }
                case 65:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(e(t, j2));
                    }
                case 66:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = d(t, j2);
                    }
                case 67:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0897ub.a(e(t, j2));
                    }
                case 68:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Qc.f(t, j2).hashCode();
                    }
            }
        }
        int hashCode = (i5 * 53) + this.q.c(t).hashCode();
        return this.h ? (hashCode * 53) + this.r.a((Object) t).hashCode() : hashCode;
    }

    private final void a(T t, T t2, int i2) {
        long c2 = (long) (c(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = Qc.f(t, c2);
            Object f3 = Qc.f(t2, c2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    Qc.a((Object) t, c2, f3);
                    b(t, i2);
                }
                return;
            }
            Qc.a((Object) t, c2, C0897ub.a(f2, f3));
            b(t, i2);
        }
    }

    private static <UT, UB> int a(Kc<UT, UB> kc, T t) {
        return kc.b(kc.c(t));
    }

    private static List<?> a(Object obj, long j2) {
        return (List) Qc.f(obj, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0973  */
    public final void a(T t, dd ddVar) throws IOException {
        Entry entry;
        int length;
        int i2;
        Entry entry2;
        int length2;
        if (ddVar.a() == c.m) {
            a(this.q, t, ddVar);
            if (this.h) {
                C0870nb a2 = this.r.a((Object) t);
                if (!a2.b.isEmpty()) {
                    entry2 = (Entry) a2.a().next();
                    length2 = this.c.length - 3;
                    while (length2 >= 0) {
                        int c2 = c(length2);
                        int[] iArr = this.c;
                        int i3 = iArr[length2];
                        if (entry2 == null) {
                            switch ((c2 & 267386880) >>> 20) {
                                case 0:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.e(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 1:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 2:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.e(i3, Qc.b(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 3:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.c(i3, Qc.b(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 4:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.c(i3, Qc.a((Object) t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 5:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.b(i3, Qc.b(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 6:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.d(i3, Qc.a((Object) t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 7:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.c(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 8:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        a(i3, Qc.f(t, (long) (c2 & 1048575)), ddVar);
                                        break;
                                    }
                                case 9:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.f(t, (long) (c2 & 1048575)), a(length2));
                                        break;
                                    }
                                case 10:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, (Oa) Qc.f(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 11:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.e(i3, Qc.a((Object) t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 12:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.b(i3, Qc.a((Object) t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 13:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.a((Object) t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 14:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.d(i3, Qc.b(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 15:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.f(i3, Qc.a((Object) t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 16:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.b(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 17:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        ddVar.b(i3, Qc.f(t, (long) (c2 & 1048575)), a(length2));
                                        break;
                                    }
                                case 18:
                                    C0894tc.a(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 19:
                                    C0894tc.b(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 20:
                                    C0894tc.c(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 21:
                                    C0894tc.d(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 22:
                                    C0894tc.h(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 23:
                                    C0894tc.f(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 24:
                                    C0894tc.k(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 25:
                                    C0894tc.n(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 26:
                                    C0894tc.a(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar);
                                    break;
                                case 27:
                                    C0894tc.a(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, a(length2));
                                    break;
                                case 28:
                                    C0894tc.b(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar);
                                    break;
                                case 29:
                                    C0894tc.i(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 30:
                                    C0894tc.m(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 31:
                                    C0894tc.l(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 32:
                                    C0894tc.g(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 33:
                                    C0894tc.j(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 34:
                                    C0894tc.e(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, false);
                                    break;
                                case 35:
                                    C0894tc.a(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 36:
                                    C0894tc.b(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 37:
                                    C0894tc.c(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 38:
                                    C0894tc.d(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 39:
                                    C0894tc.h(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 40:
                                    C0894tc.f(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 41:
                                    C0894tc.k(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 42:
                                    C0894tc.n(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 43:
                                    C0894tc.i(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 44:
                                    C0894tc.m(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 45:
                                    C0894tc.l(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 46:
                                    C0894tc.g(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 47:
                                    C0894tc.j(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 48:
                                    C0894tc.e(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, true);
                                    break;
                                case 49:
                                    C0894tc.b(iArr[length2], (List) Qc.f(t, (long) (c2 & 1048575)), ddVar, a(length2));
                                    break;
                                case 50:
                                    a(ddVar, i3, Qc.f(t, (long) (c2 & 1048575)), length2);
                                    break;
                                case 51:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, b(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 52:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, c(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 53:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.e(i3, e(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 54:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.c(i3, e(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 55:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.c(i3, d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 56:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.b(i3, e(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 57:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.d(i3, d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 58:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, f(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 59:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        a(i3, Qc.f(t, (long) (c2 & 1048575)), ddVar);
                                        break;
                                    }
                                case 60:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, Qc.f(t, (long) (c2 & 1048575)), a(length2));
                                        break;
                                    }
                                case 61:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, (Oa) Qc.f(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 62:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.e(i3, d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 63:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.b(i3, d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 64:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 65:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.d(i3, e(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 66:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.f(i3, d(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 67:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.a(i3, e(t, (long) (c2 & 1048575)));
                                        break;
                                    }
                                case 68:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        ddVar.b(i3, Qc.f(t, (long) (c2 & 1048575)), a(length2));
                                        break;
                                    }
                            }
                            length2 -= 3;
                        } else {
                            this.r.a(entry2);
                            throw null;
                        }
                    }
                    if (entry2 == null) {
                        this.r.a(ddVar, entry2);
                        throw null;
                    }
                    return;
                }
            }
            entry2 = null;
            length2 = this.c.length - 3;
            while (length2 >= 0) {
            }
            if (entry2 == null) {
            }
        } else if (this.j) {
            if (this.h) {
                C0870nb a3 = this.r.a((Object) t);
                if (!a3.b.isEmpty()) {
                    entry = (Entry) a3.d().next();
                    length = this.c.length;
                    i2 = 0;
                    while (i2 < length) {
                        int c3 = c(i2);
                        int[] iArr2 = this.c;
                        int i4 = iArr2[i2];
                        if (entry == null) {
                            switch ((c3 & 267386880) >>> 20) {
                                case 0:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.e(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 1:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 2:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.e(i4, Qc.b(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 3:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.c(i4, Qc.b(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 4:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.c(i4, Qc.a((Object) t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 5:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.b(i4, Qc.b(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 6:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.d(i4, Qc.a((Object) t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 7:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.c(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 8:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        a(i4, Qc.f(t, (long) (c3 & 1048575)), ddVar);
                                        break;
                                    }
                                case 9:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.f(t, (long) (c3 & 1048575)), a(i2));
                                        break;
                                    }
                                case 10:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, (Oa) Qc.f(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 11:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.e(i4, Qc.a((Object) t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 12:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.b(i4, Qc.a((Object) t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 13:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.a((Object) t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 14:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.d(i4, Qc.b(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 15:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.f(i4, Qc.a((Object) t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 16:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.b(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 17:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        ddVar.b(i4, Qc.f(t, (long) (c3 & 1048575)), a(i2));
                                        break;
                                    }
                                case 18:
                                    C0894tc.a(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 19:
                                    C0894tc.b(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 20:
                                    C0894tc.c(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 21:
                                    C0894tc.d(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 22:
                                    C0894tc.h(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 23:
                                    C0894tc.f(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 24:
                                    C0894tc.k(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 25:
                                    C0894tc.n(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 26:
                                    C0894tc.a(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar);
                                    break;
                                case 27:
                                    C0894tc.a(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, a(i2));
                                    break;
                                case 28:
                                    C0894tc.b(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar);
                                    break;
                                case 29:
                                    C0894tc.i(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 30:
                                    C0894tc.m(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 31:
                                    C0894tc.l(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 32:
                                    C0894tc.g(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 33:
                                    C0894tc.j(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 34:
                                    C0894tc.e(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, false);
                                    break;
                                case 35:
                                    C0894tc.a(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 36:
                                    C0894tc.b(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 37:
                                    C0894tc.c(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 38:
                                    C0894tc.d(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 39:
                                    C0894tc.h(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 40:
                                    C0894tc.f(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 41:
                                    C0894tc.k(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 42:
                                    C0894tc.n(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 43:
                                    C0894tc.i(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 44:
                                    C0894tc.m(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 45:
                                    C0894tc.l(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 46:
                                    C0894tc.g(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 47:
                                    C0894tc.j(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 48:
                                    C0894tc.e(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, true);
                                    break;
                                case 49:
                                    C0894tc.b(iArr2[i2], (List) Qc.f(t, (long) (c3 & 1048575)), ddVar, a(i2));
                                    break;
                                case 50:
                                    a(ddVar, i4, Qc.f(t, (long) (c3 & 1048575)), i2);
                                    break;
                                case 51:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, b(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 52:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, c(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 53:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.e(i4, e(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 54:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.c(i4, e(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 55:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.c(i4, d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 56:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.b(i4, e(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 57:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.d(i4, d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 58:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, f(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 59:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        a(i4, Qc.f(t, (long) (c3 & 1048575)), ddVar);
                                        break;
                                    }
                                case 60:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, Qc.f(t, (long) (c3 & 1048575)), a(i2));
                                        break;
                                    }
                                case 61:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, (Oa) Qc.f(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 62:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.e(i4, d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 63:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.b(i4, d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 64:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 65:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.d(i4, e(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 66:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.f(i4, d(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 67:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.a(i4, e(t, (long) (c3 & 1048575)));
                                        break;
                                    }
                                case 68:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        ddVar.b(i4, Qc.f(t, (long) (c3 & 1048575)), a(i2));
                                        break;
                                    }
                            }
                            i2 += 3;
                        } else {
                            this.r.a(entry);
                            throw null;
                        }
                    }
                    if (entry != null) {
                        a(this.q, t, ddVar);
                        return;
                    } else {
                        this.r.a(ddVar, entry);
                        throw null;
                    }
                }
            }
            entry = null;
            length = this.c.length;
            i2 = 0;
            while (i2 < length) {
            }
            if (entry != null) {
            }
        } else {
            b(t, ddVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    private final void b(T t, dd ddVar) throws IOException {
        Entry entry;
        int length;
        int i2;
        int i3;
        int i4;
        T t2 = t;
        dd ddVar2 = ddVar;
        if (this.h) {
            C0870nb a2 = this.r.a((Object) t2);
            if (!a2.b.isEmpty()) {
                entry = (Entry) a2.d().next();
                length = this.c.length;
                Unsafe unsafe = b;
                i2 = 0;
                int i5 = -1;
                int i6 = 0;
                while (i2 < length) {
                    int c2 = c(i2);
                    int[] iArr = this.c;
                    int i7 = iArr[i2];
                    int i8 = (267386880 & c2) >>> 20;
                    if (this.j || i8 > 17) {
                        i3 = i5;
                        i4 = 0;
                    } else {
                        int i9 = iArr[i2 + 2];
                        i3 = i9 & 1048575;
                        if (i3 != i5) {
                            i6 = unsafe.getInt(t2, (long) i3);
                        } else {
                            i3 = i5;
                        }
                        i4 = 1 << (i9 >>> 20);
                    }
                    if (entry == null) {
                        long j2 = (long) (c2 & 1048575);
                        switch (i8) {
                            case 0:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, Qc.e(t2, j2));
                                    break;
                                }
                            case 1:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, Qc.d(t2, j2));
                                    break;
                                }
                            case 2:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.e(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 3:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.c(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 4:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.c(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 5:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.b(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 6:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.d(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 7:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, Qc.c(t2, j2));
                                    break;
                                }
                            case 8:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    a(i7, unsafe.getObject(t2, j2), ddVar2);
                                    break;
                                }
                            case 9:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                            case 10:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, (Oa) unsafe.getObject(t2, j2));
                                    break;
                                }
                            case 11:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.e(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 12:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.b(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 13:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 14:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.d(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 15:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.f(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 16:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.a(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 17:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    ddVar2.b(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                            case 18:
                                C0894tc.a(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 19:
                                C0894tc.b(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 20:
                                C0894tc.c(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 21:
                                C0894tc.d(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 22:
                                C0894tc.h(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 23:
                                C0894tc.f(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 24:
                                C0894tc.k(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 25:
                                C0894tc.n(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 26:
                                C0894tc.a(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2);
                                break;
                            case 27:
                                C0894tc.a(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, a(i2));
                                break;
                            case 28:
                                C0894tc.b(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2);
                                break;
                            case 29:
                                C0894tc.i(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 30:
                                C0894tc.m(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 31:
                                C0894tc.l(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 32:
                                C0894tc.g(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 33:
                                C0894tc.j(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 34:
                                C0894tc.e(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, false);
                                break;
                            case 35:
                                C0894tc.a(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 36:
                                C0894tc.b(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 37:
                                C0894tc.c(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 38:
                                C0894tc.d(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 39:
                                C0894tc.h(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 40:
                                C0894tc.f(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 41:
                                C0894tc.k(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 42:
                                C0894tc.n(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 43:
                                C0894tc.i(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 44:
                                C0894tc.m(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 45:
                                C0894tc.l(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 46:
                                C0894tc.g(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 47:
                                C0894tc.j(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 48:
                                C0894tc.e(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, true);
                                break;
                            case 49:
                                C0894tc.b(this.c[i2], (List) unsafe.getObject(t2, j2), ddVar2, a(i2));
                                break;
                            case 50:
                                a(ddVar2, i7, unsafe.getObject(t2, j2), i2);
                                break;
                            case 51:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, b(t2, j2));
                                    break;
                                }
                            case 52:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, c(t2, j2));
                                    break;
                                }
                            case 53:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.e(i7, e(t2, j2));
                                    break;
                                }
                            case 54:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.c(i7, e(t2, j2));
                                    break;
                                }
                            case 55:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.c(i7, d(t2, j2));
                                    break;
                                }
                            case 56:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.b(i7, e(t2, j2));
                                    break;
                                }
                            case 57:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.d(i7, d(t2, j2));
                                    break;
                                }
                            case 58:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, f(t2, j2));
                                    break;
                                }
                            case 59:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    a(i7, unsafe.getObject(t2, j2), ddVar2);
                                    break;
                                }
                            case 60:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                            case 61:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, (Oa) unsafe.getObject(t2, j2));
                                    break;
                                }
                            case 62:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.e(i7, d(t2, j2));
                                    break;
                                }
                            case 63:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.b(i7, d(t2, j2));
                                    break;
                                }
                            case 64:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, d(t2, j2));
                                    break;
                                }
                            case 65:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.d(i7, e(t2, j2));
                                    break;
                                }
                            case 66:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.f(i7, d(t2, j2));
                                    break;
                                }
                            case 67:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.a(i7, e(t2, j2));
                                    break;
                                }
                            case 68:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    ddVar2.b(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                        }
                        i2 += 3;
                        i5 = i3;
                    } else {
                        this.r.a(entry);
                        throw null;
                    }
                }
                if (entry != null) {
                    a(this.q, t2, ddVar2);
                    return;
                } else {
                    this.r.a(ddVar2, entry);
                    throw null;
                }
            }
        }
        entry = null;
        length = this.c.length;
        Unsafe unsafe2 = b;
        i2 = 0;
        int i52 = -1;
        int i62 = 0;
        while (i2 < length) {
        }
        if (entry != null) {
        }
    }

    private final <K, V> void a(dd ddVar, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            ddVar.a(i2, this.s.b(b(i3)), this.s.e(obj));
        }
    }

    private static <UT, UB> void a(Kc<UT, UB> kc, T t, dd ddVar) throws IOException {
        kc.a(kc.c(t), ddVar);
    }

    private final C0886rc a(int i2) {
        int i3 = (i2 / 3) << 1;
        C0886rc rcVar = (C0886rc) this.d[i3];
        if (rcVar != null) {
            return rcVar;
        }
        C0886rc a2 = C0883qc.a().a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    private static boolean a(Object obj, int i2, C0886rc rcVar) {
        return rcVar.c(Qc.f(obj, (long) (i2 & 1048575)));
    }

    private static void a(int i2, Object obj, dd ddVar) throws IOException {
        if (obj instanceof String) {
            ddVar.a(i2, (String) obj);
        } else {
            ddVar.a(i2, (Oa) obj);
        }
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        if (this.j) {
            return a(t, i2);
        }
        return (i3 & i4) != 0;
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int c2 = c(i2);
            long j2 = (long) (c2 & 1048575);
            switch ((c2 & 267386880) >>> 20) {
                case 0:
                    return Qc.e(t, j2) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                case 1:
                    return Qc.d(t, j2) != 0.0f;
                case 2:
                    return Qc.b(t, j2) != 0;
                case 3:
                    return Qc.b(t, j2) != 0;
                case 4:
                    return Qc.a((Object) t, j2) != 0;
                case 5:
                    return Qc.b(t, j2) != 0;
                case 6:
                    return Qc.a((Object) t, j2) != 0;
                case 7:
                    return Qc.c(t, j2);
                case 8:
                    Object f2 = Qc.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof Oa) {
                        return !Oa.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return Qc.f(t, j2) != null;
                case 10:
                    return !Oa.a.equals(Qc.f(t, j2));
                case 11:
                    return Qc.a((Object) t, j2) != 0;
                case 12:
                    return Qc.a((Object) t, j2) != 0;
                case 13:
                    return Qc.a((Object) t, j2) != 0;
                case 14:
                    return Qc.b(t, j2) != 0;
                case 15:
                    return Qc.a((Object) t, j2) != 0;
                case 16:
                    return Qc.b(t, j2) != 0;
                case 17:
                    return Qc.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int d2 = d(i2);
            return (Qc.a((Object) t, (long) (d2 & 1048575)) & (1 << (d2 >>> 20))) != 0;
        }
    }

    private final Object b(int i2) {
        return this.d[(i2 / 3) << 1];
    }

    private static <T> double b(T t, long j2) {
        return ((Double) Qc.f(t, j2)).doubleValue();
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            Qc.a((Object) t, j2, Qc.a((Object) t, j2) | (1 << (d2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        Qc.a((Object) t, (long) (d(i3) & 1048575), i2);
    }

    private final boolean a(T t, int i2, int i3) {
        return Qc.a((Object) t, (long) (d(i3) & 1048575)) == i2;
    }
}
