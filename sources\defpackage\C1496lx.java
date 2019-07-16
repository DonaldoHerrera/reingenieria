package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: lx reason: default package and case insensitive filesystem */
final class C1496lx<T> implements C1859xx<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = Ux.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final C1403ix g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final C1620px o;
    private final C0266Uw p;
    private final Nx<?, ?> q;
    private final C1798vw<?> r;
    private final C0508bx s;

    private C1496lx(int[] iArr, Object[] objArr, int i2, int i3, C1403ix ixVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, C1620px pxVar, C0266Uw uw, Nx<?, ?> nx, C1798vw<?> vwVar, C0508bx bxVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = ixVar instanceof C0197Cw;
        this.j = z;
        this.h = vwVar != null && vwVar.a(ixVar);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = pxVar;
        this.p = uw;
        this.q = nx;
        this.r = vwVar;
        this.g = ixVar;
        this.s = bxVar;
    }

    static <T> C1496lx<T> a(Class<T> cls, C1342gx gxVar, C1620px pxVar, C0266Uw uw, Nx<?, ?> nx, C1798vw<?> vwVar, C0508bx bxVar) {
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
        C1342gx gxVar2 = gxVar;
        if (gxVar2 instanceof C1799vx) {
            C1799vx vxVar = (C1799vx) gxVar2;
            char c4 = 0;
            boolean z = vxVar.a() == e.j;
            String d2 = vxVar.d();
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
            Object[] e2 = vxVar.e();
            Class cls3 = vxVar.c().getClass();
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
            C1496lx lxVar = new C1496lx(iArr2, objArr, i8, i6, vxVar.c(), z, false, iArr, c4, i66, pxVar, uw, nx, vwVar, bxVar);
            return lxVar;
        }
        ((Kx) gxVar2).a();
        throw null;
    }

    private final C0217Iw c(int i2) {
        return (C0217Iw) this.d[((i2 / 3) << 1) + 1];
    }

    private static Rx d(Object obj) {
        C0197Cw cw = (C0197Cw) obj;
        Rx rx = cw.zztc;
        if (rx != Rx.b()) {
            return rx;
        }
        Rx c2 = Rx.c();
        cw.zztc = c2;
        return c2;
    }

    private final int e(int i2) {
        return this.c[i2 + 2];
    }

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    private final int g(int i2) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, 0);
    }

    public final void b(T t, T t2) {
        if (t2 != null) {
            for (int i2 = 0; i2 < this.c.length; i2 += 3) {
                int d2 = d(i2);
                long j2 = (long) (1048575 & d2);
                int i3 = this.c[i2];
                switch ((d2 & 267386880) >>> 20) {
                    case 0:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.e(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 1:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.d(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 2:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 3:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 4:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 5:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 6:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 7:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.c(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 8:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.f(t2, j2));
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
                            Ux.a((Object) t, j2, Ux.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 11:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 12:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 13:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 14:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 15:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 16:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            Ux.a((Object) t, j2, Ux.b(t2, j2));
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
                        C1919zx.a(this.s, t, t2, j2);
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
                            Ux.a((Object) t, j2, Ux.f(t2, j2));
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
                            Ux.a((Object) t, j2, Ux.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case 68:
                        b(t, t2, i2);
                        break;
                }
            }
            if (!this.j) {
                C1919zx.a(this.q, t, t2);
                if (this.h) {
                    C1919zx.a(this.r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    public final T newInstance() {
        return this.o.a(this.g);
    }

    private static <T> boolean e(T t, long j2) {
        return ((Boolean) Ux.f(t, j2)).booleanValue();
    }

    public final boolean c(T t) {
        int i2;
        int i3 = 0;
        int i4 = -1;
        int i5 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= this.m) {
                return !this.h || this.r.a((Object) t).b();
            }
            int i6 = this.l[i3];
            int i7 = this.c[i6];
            int d2 = d(i6);
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
            if (((268435456 & d2) != 0) && !a(t, i6, i5, i2)) {
                return false;
            }
            int i10 = (267386880 & d2) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (a(t, i7, i6) && !a((Object) t, d2, a(i6))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50 && !this.s.e(Ux.f(t, (long) (d2 & 1048575))).isEmpty()) {
                            this.s.g(b(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) Ux.f(t, (long) (d2 & 1048575));
                if (!list.isEmpty()) {
                    C1859xx a2 = a(i6);
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
            } else if (a(t, i6, i5, i2) && !a((Object) t, d2, a(i6))) {
                return false;
            }
            i3++;
        }
    }

    private final int d(int i2) {
        return this.c[i2 + 1];
    }

    private static <T> long d(T t, long j2) {
        return ((Long) Ux.f(t, j2)).longValue();
    }

    private static <T> int c(T t, long j2) {
        return ((Integer) Ux.f(t, j2)).intValue();
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = Ux.f(t, j2);
            Object f3 = Ux.f(t2, j2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    Ux.a((Object) t, j2, f3);
                    b(t, i3, i2);
                }
                return;
            }
            Ux.a((Object) t, j2, C0209Gw.a(f2, f3));
            b(t, i3, i2);
        }
    }

    private final Object b(int i2) {
        return this.d[(i2 / 3) << 1];
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

    public final void b(T t) {
        int i2;
        int i3 = this.m;
        while (true) {
            i2 = this.n;
            if (i3 >= i2) {
                break;
            }
            long d2 = (long) (d(this.l[i3]) & 1048575);
            Object f2 = Ux.f(t, d2);
            if (f2 != null) {
                this.s.h(f2);
                Ux.a((Object) t, d2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.b(t, (long) this.l[i2]);
            i2++;
        }
        this.q.c(t);
        if (this.h) {
            this.r.c(t);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (defpackage.C1919zx.a(defpackage.Ux.f(r10, r6), defpackage.Ux.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (defpackage.Ux.b(r10, r6) == defpackage.Ux.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (defpackage.Ux.a((java.lang.Object) r10, r6) == defpackage.Ux.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (defpackage.Ux.b(r10, r6) == defpackage.Ux.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (defpackage.Ux.a((java.lang.Object) r10, r6) == defpackage.Ux.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (defpackage.Ux.a((java.lang.Object) r10, r6) == defpackage.Ux.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (defpackage.Ux.a((java.lang.Object) r10, r6) == defpackage.Ux.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (defpackage.C1919zx.a(defpackage.Ux.f(r10, r6), defpackage.Ux.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (defpackage.C1919zx.a(defpackage.Ux.f(r10, r6), defpackage.Ux.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (defpackage.C1919zx.a(defpackage.Ux.f(r10, r6), defpackage.Ux.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (defpackage.Ux.c(r10, r6) == defpackage.Ux.c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (defpackage.Ux.a((java.lang.Object) r10, r6) == defpackage.Ux.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (defpackage.Ux.b(r10, r6) == defpackage.Ux.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (defpackage.Ux.a((java.lang.Object) r10, r6) == defpackage.Ux.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (defpackage.Ux.b(r10, r6) == defpackage.Ux.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (defpackage.Ux.b(r10, r6) == defpackage.Ux.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(defpackage.Ux.d(r10, r6)) == java.lang.Float.floatToIntBits(defpackage.Ux.d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(defpackage.Ux.e(r10, r6)) == java.lang.Double.doubleToLongBits(defpackage.Ux.e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (defpackage.C1919zx.a(defpackage.Ux.f(r10, r6), defpackage.Ux.f(r11, r6)) != false) goto L_0x01c2;
     */
    public final boolean a(T t, T t2) {
        int length = this.c.length;
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
                        z = C1919zx.a(Ux.f(t, j2), Ux.f(t2, j2));
                        break;
                    case 50:
                        z = C1919zx.a(Ux.f(t, j2), Ux.f(t2, j2));
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
                        if (Ux.a((Object) t, e2) == Ux.a((Object) t2, e2)) {
                            break;
                        }
                }
                if (!z) {
                    return false;
                }
                i2 += 3;
            } else if (!this.q.a((Object) t).equals(this.q.a((Object) t2))) {
                return false;
            } else {
                if (this.h) {
                    return this.r.a((Object) t).equals(this.r.a((Object) t2));
                }
                return true;
            }
        }
    }

    private static <T> float b(T t, long j2) {
        return ((Float) Ux.f(t, j2)).floatValue();
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            Ux.a((Object) t, j2, Ux.a((Object) t, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        Ux.a((Object) t, (long) (e(i3) & 1048575), i2);
    }

    private final int b(int i2, int i3) {
        int length = (this.c.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int i6 = this.c[i5];
            if (i2 == i6) {
                return i5;
            }
            if (i2 < i6) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
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
            int d2 = d(i4);
            int i6 = this.c[i4];
            long j2 = (long) (1048575 & d2);
            int i7 = 37;
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Double.doubleToLongBits(Ux.e(t, j2)));
                case 1:
                    i3 = i5 * 53;
                    i2 = Float.floatToIntBits(Ux.d(t, j2));
                case 2:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Ux.b(t, j2));
                case 3:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Ux.b(t, j2));
                case 4:
                    i3 = i5 * 53;
                    i2 = Ux.a((Object) t, j2);
                case 5:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Ux.b(t, j2));
                case 6:
                    i3 = i5 * 53;
                    i2 = Ux.a((Object) t, j2);
                case 7:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Ux.c(t, j2));
                case 8:
                    i3 = i5 * 53;
                    i2 = ((String) Ux.f(t, j2)).hashCode();
                case 9:
                    Object f2 = Ux.f(t, j2);
                    if (f2 != null) {
                        i7 = f2.hashCode();
                        break;
                    }
                    break;
                case 10:
                    i3 = i5 * 53;
                    i2 = Ux.f(t, j2).hashCode();
                case 11:
                    i3 = i5 * 53;
                    i2 = Ux.a((Object) t, j2);
                case 12:
                    i3 = i5 * 53;
                    i2 = Ux.a((Object) t, j2);
                case 13:
                    i3 = i5 * 53;
                    i2 = Ux.a((Object) t, j2);
                case 14:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Ux.b(t, j2));
                case 15:
                    i3 = i5 * 53;
                    i2 = Ux.a((Object) t, j2);
                case 16:
                    i3 = i5 * 53;
                    i2 = C0209Gw.a(Ux.b(t, j2));
                case 17:
                    Object f3 = Ux.f(t, j2);
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
                    i2 = Ux.f(t, j2).hashCode();
                case 50:
                    i3 = i5 * 53;
                    i2 = Ux.f(t, j2).hashCode();
                case 51:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(Double.doubleToLongBits(a(t, j2)));
                    }
                case 52:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Float.floatToIntBits(b(t, j2));
                    }
                case 53:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(d(t, j2));
                    }
                case 54:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(d(t, j2));
                    }
                case 55:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = c(t, j2);
                    }
                case 56:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(d(t, j2));
                    }
                case 57:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = c(t, j2);
                    }
                case 58:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(e(t, j2));
                    }
                case 59:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = ((String) Ux.f(t, j2)).hashCode();
                    }
                case 60:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Ux.f(t, j2).hashCode();
                    }
                case 61:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Ux.f(t, j2).hashCode();
                    }
                case 62:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = c(t, j2);
                    }
                case 63:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = c(t, j2);
                    }
                case 64:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = c(t, j2);
                    }
                case 65:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(d(t, j2));
                    }
                case 66:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = c(t, j2);
                    }
                case 67:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0209Gw.a(d(t, j2));
                    }
                case 68:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Ux.f(t, j2).hashCode();
                    }
            }
        }
        int hashCode = (i5 * 53) + this.q.a((Object) t).hashCode();
        return this.h ? (hashCode * 53) + this.r.a((Object) t).hashCode() : hashCode;
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = Ux.f(t, d2);
            Object f3 = Ux.f(t2, d2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    Ux.a((Object) t, d2, f3);
                    b(t, i2);
                }
                return;
            }
            Ux.a((Object) t, d2, C0209Gw.a(f2, f3));
            b(t, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r7.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x058f, code lost:
        if (r9 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0591, code lost:
        r9 = r7.b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x059a, code lost:
        if (r7.a(r9, r12) == false) goto L_0x059c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x059c, code lost:
        r12 = r10.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05a0, code lost:
        if (r12 < r10.n) goto L_0x05a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05a2, code lost:
        a((java.lang.Object) r11, r10.l[r12], (UB) r9, r7);
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x05ac, code lost:
        if (r9 != null) goto L_0x05ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x05ae, code lost:
        r7.b(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x05b1, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x058c */
    public final void a(T t, C1889yx yxVar, C1738tw twVar) throws IOException {
        Object obj;
        if (twVar != null) {
            Nx<?, ?> nx = this.q;
            C1798vw<?> vwVar = this.r;
            Object obj2 = null;
            while (true) {
                try {
                    int c2 = yxVar.c();
                    int g2 = g(c2);
                    if (g2 >= 0) {
                        int d2 = d(g2);
                        switch ((267386880 & d2) >>> 20) {
                            case 0:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.readDouble());
                                b(t, g2);
                                break;
                            case 1:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.readFloat());
                                b(t, g2);
                                break;
                            case 2:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.d());
                                b(t, g2);
                                break;
                            case 3:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.o());
                                b(t, g2);
                                break;
                            case 4:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.e());
                                b(t, g2);
                                break;
                            case 5:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.a());
                                b(t, g2);
                                break;
                            case 6:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.b());
                                b(t, g2);
                                break;
                            case 7:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.h());
                                b(t, g2);
                                break;
                            case 8:
                                a((Object) t, d2, yxVar);
                                b(t, g2);
                                break;
                            case 9:
                                if (!a(t, g2)) {
                                    Ux.a((Object) t, (long) (d2 & 1048575), yxVar.a(a(g2), twVar));
                                    b(t, g2);
                                    break;
                                } else {
                                    long j2 = (long) (d2 & 1048575);
                                    Ux.a((Object) t, j2, C0209Gw.a(Ux.f(t, j2), yxVar.a(a(g2), twVar)));
                                    break;
                                }
                            case 10:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) yxVar.f());
                                b(t, g2);
                                break;
                            case 11:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.g());
                                b(t, g2);
                                break;
                            case 12:
                                int m2 = yxVar.m();
                                C0217Iw c3 = c(g2);
                                if (c3 != null) {
                                    if (!c3.a(m2)) {
                                        obj2 = C1919zx.a(c2, m2, obj2, nx);
                                        break;
                                    }
                                }
                                Ux.a((Object) t, (long) (d2 & 1048575), m2);
                                b(t, g2);
                                break;
                            case 13:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.n());
                                b(t, g2);
                                break;
                            case 14:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.j());
                                b(t, g2);
                                break;
                            case 15:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.k());
                                b(t, g2);
                                break;
                            case 16:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.p());
                                b(t, g2);
                                break;
                            case 17:
                                if (!a(t, g2)) {
                                    Ux.a((Object) t, (long) (d2 & 1048575), yxVar.b(a(g2), twVar));
                                    b(t, g2);
                                    break;
                                } else {
                                    long j3 = (long) (d2 & 1048575);
                                    Ux.a((Object) t, j3, C0209Gw.a(Ux.f(t, j3), yxVar.b(a(g2), twVar)));
                                    break;
                                }
                            case 18:
                                yxVar.p(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 19:
                                yxVar.q(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 20:
                                yxVar.c(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 21:
                                yxVar.f(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 22:
                                yxVar.b(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 23:
                                yxVar.a(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 24:
                                yxVar.e(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 25:
                                yxVar.d(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 26:
                                if (!f(d2)) {
                                    yxVar.m(this.p.a(t, (long) (d2 & 1048575)));
                                    break;
                                } else {
                                    yxVar.l(this.p.a(t, (long) (d2 & 1048575)));
                                    break;
                                }
                            case 27:
                                yxVar.b(this.p.a(t, (long) (d2 & 1048575)), a(g2), twVar);
                                break;
                            case 28:
                                yxVar.k(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 29:
                                yxVar.o(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 30:
                                List a2 = this.p.a(t, (long) (d2 & 1048575));
                                yxVar.n(a2);
                                obj2 = C1919zx.a(c2, a2, c(g2), obj2, nx);
                                break;
                            case 31:
                                yxVar.h(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 32:
                                yxVar.g(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 33:
                                yxVar.j(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 34:
                                yxVar.i(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 35:
                                yxVar.p(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 36:
                                yxVar.q(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 37:
                                yxVar.c(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 38:
                                yxVar.f(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 39:
                                yxVar.b(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 40:
                                yxVar.a(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 41:
                                yxVar.e(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 42:
                                yxVar.d(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 43:
                                yxVar.o(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 44:
                                List a3 = this.p.a(t, (long) (d2 & 1048575));
                                yxVar.n(a3);
                                obj2 = C1919zx.a(c2, a3, c(g2), obj2, nx);
                                break;
                            case 45:
                                yxVar.h(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 46:
                                yxVar.g(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 47:
                                yxVar.j(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 48:
                                yxVar.i(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 49:
                                long j4 = (long) (d2 & 1048575);
                                yxVar.a(this.p.a(t, j4), a(g2), twVar);
                                break;
                            case 50:
                                Object b2 = b(g2);
                                long d3 = (long) (d(g2) & 1048575);
                                Object f2 = Ux.f(t, d3);
                                if (f2 == null) {
                                    f2 = this.s.c(b2);
                                    Ux.a((Object) t, d3, f2);
                                } else if (this.s.d(f2)) {
                                    Object c4 = this.s.c(b2);
                                    this.s.a(c4, f2);
                                    Ux.a((Object) t, d3, c4);
                                    f2 = c4;
                                }
                                this.s.f(f2);
                                this.s.g(b2);
                                throw null;
                            case 51:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Double.valueOf(yxVar.readDouble()));
                                b(t, c2, g2);
                                break;
                            case 52:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Float.valueOf(yxVar.readFloat()));
                                b(t, c2, g2);
                                break;
                            case 53:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(yxVar.d()));
                                b(t, c2, g2);
                                break;
                            case 54:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(yxVar.o()));
                                b(t, c2, g2);
                                break;
                            case 55:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(yxVar.e()));
                                b(t, c2, g2);
                                break;
                            case 56:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(yxVar.a()));
                                b(t, c2, g2);
                                break;
                            case 57:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(yxVar.b()));
                                b(t, c2, g2);
                                break;
                            case 58:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Boolean.valueOf(yxVar.h()));
                                b(t, c2, g2);
                                break;
                            case 59:
                                a((Object) t, d2, yxVar);
                                b(t, c2, g2);
                                break;
                            case 60:
                                if (a(t, c2, g2)) {
                                    long j5 = (long) (d2 & 1048575);
                                    Ux.a((Object) t, j5, C0209Gw.a(Ux.f(t, j5), yxVar.a(a(g2), twVar)));
                                } else {
                                    Ux.a((Object) t, (long) (d2 & 1048575), yxVar.a(a(g2), twVar));
                                    b(t, g2);
                                }
                                b(t, c2, g2);
                                break;
                            case 61:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) yxVar.f());
                                b(t, c2, g2);
                                break;
                            case 62:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(yxVar.g()));
                                b(t, c2, g2);
                                break;
                            case 63:
                                int m3 = yxVar.m();
                                C0217Iw c5 = c(g2);
                                if (c5 != null) {
                                    if (!c5.a(m3)) {
                                        obj2 = C1919zx.a(c2, m3, obj2, nx);
                                        break;
                                    }
                                }
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(m3));
                                b(t, c2, g2);
                                break;
                            case 64:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(yxVar.n()));
                                b(t, c2, g2);
                                break;
                            case 65:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(yxVar.j()));
                                b(t, c2, g2);
                                break;
                            case 66:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(yxVar.k()));
                                b(t, c2, g2);
                                break;
                            case 67:
                                Ux.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(yxVar.p()));
                                b(t, c2, g2);
                                break;
                            case 68:
                                Ux.a((Object) t, (long) (d2 & 1048575), yxVar.b(a(g2), twVar));
                                b(t, c2, g2);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = nx.a();
                                }
                                if (nx.a(obj2, yxVar)) {
                                    break;
                                } else {
                                    for (int i2 = this.m; i2 < this.n; i2++) {
                                        a((Object) t, this.l[i2], (UB) obj2, nx);
                                    }
                                    if (obj2 != null) {
                                        nx.b(t, obj2);
                                    }
                                    return;
                                }
                        }
                    } else if (c2 == Integer.MAX_VALUE) {
                        for (int i3 = this.m; i3 < this.n; i3++) {
                            a((Object) t, this.l[i3], (UB) obj2, nx);
                        }
                        if (obj2 != null) {
                            nx.b(t, obj2);
                        }
                        return;
                    } else {
                        if (!this.h) {
                            obj = null;
                        } else {
                            obj = vwVar.a(twVar, this.g, c2);
                        }
                        if (obj != null) {
                            vwVar.a(yxVar, obj, twVar, vwVar.b(t), obj2, nx);
                            throw null;
                        }
                        nx.a(yxVar);
                        if (obj2 == null) {
                            obj2 = nx.b(t);
                        }
                        if (!nx.a(obj2, yxVar)) {
                            if (obj2 != null) {
                                nx.b(t, obj2);
                            }
                            return;
                        }
                    }
                } finally {
                    for (int i4 = this.m; i4 < this.n; i4++) {
                        a((Object) t, this.l[i4], (UB) obj2, nx);
                    }
                    if (obj2 != null) {
                        nx.b(t, obj2);
                    }
                }
            }
        } else {
            throw new NullPointerException();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:690)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:869)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
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
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0422 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01eb  */
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, defpackage.C0285Yv r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = b
            java.lang.Object r11 = r11.getObject(r1, r9)
            Hw r11 = (defpackage.C0213Hw) r11
            boolean r12 = r11.N()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            Hw r11 = r11.b(r12)
            sun.misc.Unsafe r12 = b
            r12.putObject(r1, r9, r11)
        L_0x0036:
            r9 = 5
            r14 = 0
            r10 = 2
            switch(r27) {
                case 18: goto L_0x03e4;
                case 19: goto L_0x03a6;
                case 20: goto L_0x0365;
                case 21: goto L_0x0365;
                case 22: goto L_0x034b;
                case 23: goto L_0x030c;
                case 24: goto L_0x02cd;
                case 25: goto L_0x0276;
                case 26: goto L_0x01c3;
                case 27: goto L_0x01a9;
                case 28: goto L_0x0151;
                case 29: goto L_0x034b;
                case 30: goto L_0x0119;
                case 31: goto L_0x02cd;
                case 32: goto L_0x030c;
                case 33: goto L_0x00cc;
                case 34: goto L_0x007f;
                case 35: goto L_0x03e4;
                case 36: goto L_0x03a6;
                case 37: goto L_0x0365;
                case 38: goto L_0x0365;
                case 39: goto L_0x034b;
                case 40: goto L_0x030c;
                case 41: goto L_0x02cd;
                case 42: goto L_0x0276;
                case 43: goto L_0x034b;
                case 44: goto L_0x0119;
                case 45: goto L_0x02cd;
                case 46: goto L_0x030c;
                case 47: goto L_0x00cc;
                case 48: goto L_0x007f;
                case 49: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0422
        L_0x003f:
            r1 = 3
            if (r6 != r1) goto L_0x0422
            xx r1 = r0.a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = defpackage.C0270Vv.a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = defpackage.C0270Vv.a(r3, r4, r7)
            int r9 = r7.a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = defpackage.C0270Vv.a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            Yw r11 = (defpackage.Yw) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = defpackage.C0270Vv.b(r3, r1, r7)
            long r4 = r7.b
            long r4 = defpackage.C1433jw.a(r4)
            r11.a(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            Yw r11 = (defpackage.Yw) r11
            int r1 = defpackage.C0270Vv.b(r3, r4, r7)
            long r8 = r7.b
            long r8 = defpackage.C1433jw.a(r8)
            r11.a(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = defpackage.C0270Vv.b(r3, r4, r7)
            long r8 = r7.b
            long r8 = defpackage.C1433jw.a(r8)
            r11.a(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            Ew r11 = (defpackage.C0203Ew) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = defpackage.C0270Vv.a(r3, r1, r7)
            int r4 = r7.a
            int r4 = defpackage.C1433jw.c(r4)
            r11.c(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            Ew r11 = (defpackage.C0203Ew) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = defpackage.C1433jw.c(r4)
            r11.c(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = defpackage.C1433jw.c(r4)
            r11.c(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = defpackage.C0270Vv.a(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = defpackage.C0270Vv.a(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            Cw r1 = (defpackage.C0197Cw) r1
            Rx r3 = r1.zztc
            Rx r4 = defpackage.Rx.b()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            Iw r4 = r0.c(r8)
            Nx<?, ?> r5 = r0.q
            r6 = r22
            java.lang.Object r3 = defpackage.C1919zx.a(r6, r11, r4, r3, r5)
            Rx r3 = (defpackage.Rx) r3
            if (r3 == 0) goto L_0x014e
            r1.zztc = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            Zv r4 = defpackage.C0289Zv.a
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            Zv r6 = defpackage.C0289Zv.a(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            Zv r4 = defpackage.C0289Zv.a
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            Zv r6 = defpackage.C0289Zv.a(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x019a:
            Kw r1 = defpackage.C0225Kw.b()
            throw r1
        L_0x019f:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x01a4:
            Kw r1 = defpackage.C0225Kw.b()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            xx r1 = r0.a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = defpackage.C0270Vv.a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = defpackage.C0270Vv.a(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = defpackage.C0209Gw.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = defpackage.C0270Vv.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = defpackage.C0270Vv.a(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = defpackage.C0209Gw.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            Kw r1 = defpackage.C0225Kw.b()
            throw r1
        L_0x0211:
            Kw r1 = defpackage.C0225Kw.b()
            throw r1
        L_0x0216:
            int r4 = defpackage.C0270Vv.a(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = defpackage.Xx.a(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = defpackage.C0209Gw.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = defpackage.C0270Vv.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = defpackage.C0270Vv.a(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = defpackage.Xx.a(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = defpackage.C0209Gw.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            Kw r1 = defpackage.C0225Kw.i()
            throw r1
        L_0x0267:
            Kw r1 = defpackage.C0225Kw.b()
            throw r1
        L_0x026c:
            Kw r1 = defpackage.C0225Kw.i()
            throw r1
        L_0x0271:
            Kw r1 = defpackage.C0225Kw.b()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            Xv r11 = (defpackage.C0280Xv) r11
            int r2 = defpackage.C0270Vv.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = defpackage.C0270Vv.b(r3, r2, r7)
            long r5 = r7.b
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x0290
            r5 = 1
            goto L_0x0291
        L_0x0290:
            r5 = 0
        L_0x0291:
            r11.a(r5)
            goto L_0x0282
        L_0x0295:
            if (r2 != r4) goto L_0x0299
            goto L_0x014e
        L_0x0299:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            Xv r11 = (defpackage.C0280Xv) r11
            int r4 = defpackage.C0270Vv.b(r3, r4, r7)
            long r8 = r7.b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02ae
            r6 = 1
            goto L_0x02af
        L_0x02ae:
            r6 = 0
        L_0x02af:
            r11.a(r6)
        L_0x02b2:
            if (r4 >= r5) goto L_0x0422
            int r6 = defpackage.C0270Vv.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = defpackage.C0270Vv.b(r3, r6, r7)
            long r8 = r7.b
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02c8
            r6 = 1
            goto L_0x02c9
        L_0x02c8:
            r6 = 0
        L_0x02c9:
            r11.a(r6)
            goto L_0x02b2
        L_0x02cd:
            if (r6 != r10) goto L_0x02ed
            Ew r11 = (defpackage.C0203Ew) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = defpackage.C0270Vv.a(r3, r1)
            r11.c(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            Ew r11 = (defpackage.C0203Ew) r11
            int r1 = defpackage.C0270Vv.a(r18, r19)
            r11.c(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = defpackage.C0270Vv.a(r3, r4)
            r11.c(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            Yw r11 = (defpackage.Yw) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = defpackage.C0270Vv.b(r3, r1)
            r11.a(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            Yw r11 = (defpackage.Yw) r11
            long r8 = defpackage.C0270Vv.b(r18, r19)
            r11.a(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            long r8 = defpackage.C0270Vv.b(r3, r4)
            r11.a(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = defpackage.C0270Vv.a(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = defpackage.C0270Vv.a(r21, r22, r23, r24, r25, r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            Yw r11 = (defpackage.Yw) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = defpackage.C0270Vv.b(r3, r1, r7)
            long r4 = r7.b
            r11.a(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            Yw r11 = (defpackage.Yw) r11
            int r1 = defpackage.C0270Vv.b(r3, r4, r7)
            long r8 = r7.b
            r11.a(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = defpackage.C0270Vv.b(r3, r4, r7)
            long r8 = r7.b
            r11.a(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            Bw r11 = (defpackage.C0194Bw) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = defpackage.C0270Vv.d(r3, r1)
            r11.a(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            Bw r11 = (defpackage.C0194Bw) r11
            float r1 = defpackage.C0270Vv.d(r18, r19)
            r11.a(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            float r1 = defpackage.C0270Vv.d(r3, r4)
            r11.a(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            qw r11 = (defpackage.C1649qw) r11
            int r1 = defpackage.C0270Vv.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = defpackage.C0270Vv.c(r3, r1)
            r11.a(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            Kw r1 = defpackage.C0225Kw.a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            qw r11 = (defpackage.C1649qw) r11
            double r8 = defpackage.C0270Vv.c(r18, r19)
            r11.a(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = defpackage.C0270Vv.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            double r8 = defpackage.C0270Vv.c(r3, r4)
            r11.a(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1496lx.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, Yv):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, C0285Yv yv) throws IOException {
        Unsafe unsafe = b;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.d(object)) {
            Object c2 = this.s.c(b2);
            this.s.a(c2, object);
            unsafe.putObject(t, j2, c2);
        }
        this.s.g(b2);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x018a, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x019b, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x019d, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return r2;
     */
    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, C0285Yv yv) throws IOException {
        int i10;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i11 = i2;
        int i12 = i4;
        int i13 = i5;
        int i14 = i6;
        long j3 = j2;
        int i15 = i9;
        C0285Yv yv2 = yv;
        Unsafe unsafe = b;
        long j4 = (long) (this.c[i15 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t2, j3, Double.valueOf(C0270Vv.c(bArr, i2)));
                    break;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t2, j3, Float.valueOf(C0270Vv.d(bArr, i2)));
                    break;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    i10 = C0270Vv.b(bArr2, i11, yv2);
                    unsafe.putObject(t2, j3, Long.valueOf(yv2.b));
                    break;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    i10 = C0270Vv.a(bArr2, i11, yv2);
                    unsafe.putObject(t2, j3, Integer.valueOf(yv2.a));
                    break;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t2, j3, Long.valueOf(C0270Vv.b(bArr, i2)));
                    break;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t2, j3, Integer.valueOf(C0270Vv.a(bArr, i2)));
                    break;
                }
                break;
            case 58:
                if (i14 == 0) {
                    i10 = C0270Vv.b(bArr2, i11, yv2);
                    unsafe.putObject(t2, j3, Boolean.valueOf(yv2.b != 0));
                    break;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int a2 = C0270Vv.a(bArr2, i11, yv2);
                    int i16 = yv2.a;
                    if (i16 == 0) {
                        unsafe.putObject(t2, j3, "");
                    } else if ((i7 & 536870912) == 0 || Xx.a(bArr2, a2, a2 + i16)) {
                        unsafe.putObject(t2, j3, new String(bArr2, a2, i16, C0209Gw.a));
                        a2 += i16;
                    } else {
                        throw C0225Kw.i();
                    }
                    unsafe.putInt(t2, j4, i13);
                    return a2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int a3 = C0270Vv.a(a(i15), bArr2, i11, i3, yv2);
                    Object object = unsafe.getInt(t2, j4) == i13 ? unsafe.getObject(t2, j3) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j3, yv2.c);
                    } else {
                        unsafe.putObject(t2, j3, C0209Gw.a(object, yv2.c));
                    }
                    unsafe.putInt(t2, j4, i13);
                    return a3;
                }
                break;
            case 61:
                if (i14 == 2) {
                    i10 = C0270Vv.e(bArr2, i11, yv2);
                    unsafe.putObject(t2, j3, yv2.c);
                    break;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int a4 = C0270Vv.a(bArr2, i11, yv2);
                    int i17 = yv2.a;
                    C0217Iw c2 = c(i15);
                    if (c2 == null || c2.a(i17)) {
                        unsafe.putObject(t2, j3, Integer.valueOf(i17));
                        i10 = a4;
                        break;
                    } else {
                        d((Object) t).a(i12, (Object) Long.valueOf((long) i17));
                        return a4;
                    }
                }
                break;
            case 66:
                if (i14 == 0) {
                    i10 = C0270Vv.a(bArr2, i11, yv2);
                    unsafe.putObject(t2, j3, Integer.valueOf(C1433jw.c(yv2.a)));
                    break;
                }
                break;
            case 67:
                if (i14 == 0) {
                    i10 = C0270Vv.b(bArr2, i11, yv2);
                    unsafe.putObject(t2, j3, Long.valueOf(C1433jw.a(yv2.b)));
                    break;
                }
                break;
            case 68:
                if (i14 == 3) {
                    i10 = C0270Vv.a(a(i15), bArr, i2, i3, (i12 & -8) | 4, yv);
                    Object object2 = unsafe.getInt(t2, j4) == i13 ? unsafe.getObject(t2, j3) : null;
                    if (object2 != null) {
                        unsafe.putObject(t2, j3, C0209Gw.a(object2, yv2.c));
                        break;
                    } else {
                        unsafe.putObject(t2, j3, yv2.c);
                        break;
                    }
                }
                break;
        }
    }

    private final C1859xx a(int i2) {
        int i3 = (i2 / 3) << 1;
        C1859xx xxVar = (C1859xx) this.d[i3];
        if (xxVar != null) {
            return xxVar;
        }
        C1859xx a2 = C1739tx.a().a((Class) this.d[i3 + 1]);
        this.d[i3] = a2;
        return a2;
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v13, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r5v1, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v18, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r0v27, types: [int] */
    /* JADX WARNING: type inference failed for: r1v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r8v6 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r26v0 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r26v1 */
    /* JADX WARNING: type inference failed for: r26v2 */
    /* JADX WARNING: type inference failed for: r26v3 */
    /* JADX WARNING: type inference failed for: r2v14, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v8, types: [int] */
    /* JADX WARNING: type inference failed for: r7v10 */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r2v15, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v16, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v11, types: [int] */
    /* JADX WARNING: type inference failed for: r26v4 */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r26v5 */
    /* JADX WARNING: type inference failed for: r1v28, types: [int] */
    /* JADX WARNING: type inference failed for: r2v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v19 */
    /* JADX WARNING: type inference failed for: r8v11 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r12v13 */
    /* JADX WARNING: type inference failed for: r3v20 */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r8v12 */
    /* JADX WARNING: type inference failed for: r3v21 */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r8v13 */
    /* JADX WARNING: type inference failed for: r12v16 */
    /* JADX WARNING: type inference failed for: r8v14 */
    /* JADX WARNING: type inference failed for: r8v15 */
    /* JADX WARNING: type inference failed for: r12v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r12v18, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r12v19, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r3v22 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: type inference failed for: r12v20, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v19 */
    /* JADX WARNING: type inference failed for: r8v20 */
    /* JADX WARNING: type inference failed for: r12v21, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r8v21 */
    /* JADX WARNING: type inference failed for: r3v23 */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v23 */
    /* JADX WARNING: type inference failed for: r12v24, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v24 */
    /* JADX WARNING: type inference failed for: r12v25, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r12v26, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r12v27, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r12v29, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v29, types: [int] */
    /* JADX WARNING: type inference failed for: r12v30, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r12v31, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r12v32 */
    /* JADX WARNING: type inference failed for: r12v33, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r12v34 */
    /* JADX WARNING: type inference failed for: r1v60, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: type inference failed for: r12v35 */
    /* JADX WARNING: type inference failed for: r3v26 */
    /* JADX WARNING: type inference failed for: r8v36 */
    /* JADX WARNING: type inference failed for: r12v36 */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: type inference failed for: r7v32 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r3v27, types: [int] */
    /* JADX WARNING: type inference failed for: r5v31 */
    /* JADX WARNING: type inference failed for: r12v37 */
    /* JADX WARNING: type inference failed for: r3v28 */
    /* JADX WARNING: type inference failed for: r12v38 */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r12v39 */
    /* JADX WARNING: type inference failed for: r3v30 */
    /* JADX WARNING: type inference failed for: r26v6 */
    /* JADX WARNING: type inference failed for: r26v7 */
    /* JADX WARNING: type inference failed for: r12v40 */
    /* JADX WARNING: type inference failed for: r3v31 */
    /* JADX WARNING: type inference failed for: r12v41 */
    /* JADX WARNING: type inference failed for: r12v42 */
    /* JADX WARNING: type inference failed for: r8v39 */
    /* JADX WARNING: type inference failed for: r12v43 */
    /* JADX WARNING: type inference failed for: r8v40 */
    /* JADX WARNING: type inference failed for: r12v44 */
    /* JADX WARNING: type inference failed for: r12v45 */
    /* JADX WARNING: type inference failed for: r12v46 */
    /* JADX WARNING: type inference failed for: r12v47 */
    /* JADX WARNING: type inference failed for: r8v41 */
    /* JADX WARNING: type inference failed for: r12v48 */
    /* JADX WARNING: type inference failed for: r12v49 */
    /* JADX WARNING: type inference failed for: r12v50 */
    /* JADX WARNING: type inference failed for: r8v42 */
    /* JADX WARNING: type inference failed for: r12v51 */
    /* JADX WARNING: type inference failed for: r12v52 */
    /* JADX WARNING: type inference failed for: r12v53 */
    /* JADX WARNING: type inference failed for: r8v43 */
    /* JADX WARNING: type inference failed for: r8v44 */
    /* JADX WARNING: type inference failed for: r8v45 */
    /* JADX WARNING: type inference failed for: r12v54 */
    /* JADX WARNING: type inference failed for: r12v55 */
    /* JADX WARNING: type inference failed for: r12v56 */
    /* JADX WARNING: type inference failed for: r8v46 */
    /* JADX WARNING: type inference failed for: r12v57 */
    /* JADX WARNING: type inference failed for: r12v58 */
    /* JADX WARNING: type inference failed for: r12v59 */
    /* JADX WARNING: type inference failed for: r12v60 */
    /* JADX WARNING: type inference failed for: r8v47 */
    /* JADX WARNING: type inference failed for: r8v48 */
    /* JADX WARNING: type inference failed for: r12v61 */
    /* JADX WARNING: type inference failed for: r8v49 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ce, code lost:
        r18 = r33;
        r20 = r6;
        r2 = r7;
        r7 = r8;
        r19 = r9;
        r27 = r10;
        r25 = r11;
        r6 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0017, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0017, code lost:
        r12 = r12;
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        r7 = r4;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x017c, code lost:
        r6 = r6 | r23;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x021b, code lost:
        r6 = r6 | r23;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x021d, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r11 = r35;
        r13 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0247, code lost:
        r33 = r7;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02be, code lost:
        r0 = r7 + 8;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02c0, code lost:
        r6 = r6 | r23;
        r7 = r33;
        r12 = r12;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02c4, code lost:
        r3 = r8;
        r2 = r9;
        r1 = r11;
        r9 = r13;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02c8, code lost:
        r13 = r34;
        r11 = r35;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v13, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r32v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
  assigns: []
  uses: []
  mth insns count: 602
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
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03e6 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x043d  */
    /* JADX WARNING: Unknown variable types count: 61 */
    public final int a(T t, byte[] r32, int i2, int i3, int i4, C0285Yv yv) throws IOException {
        Unsafe unsafe;
        int i5;
        T t2;
        C1496lx lxVar;
        int i6;
        int i7;
        int i8;
        int i9;
        ? r5;
        int i10;
        int i11;
        ? r12;
        ? r3;
        int i12;
        int i13;
        int i14;
        ? r122;
        int i15;
        C0285Yv yv2;
        ? r33;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        ? r7;
        T t3;
        ? r123;
        ? r34;
        ? r26;
        ? r262;
        int i21;
        ? r263;
        int i22;
        int i23;
        int i24;
        ? r8;
        int i25;
        C0285Yv yv3;
        ? r124;
        int i26;
        ? r125;
        ? r126;
        C0285Yv yv4;
        int i27;
        ? r127;
        ? r128;
        C0285Yv yv5;
        C1496lx lxVar2 = this;
        T t4 = t;
        ? r129 = r32;
        int i28 = i3;
        int i29 = i4;
        C0285Yv yv6 = yv;
        Unsafe unsafe2 = b;
        int i30 = i2;
        int i31 = -1;
        int i32 = 0;
        ? r35 = 0;
        int i33 = 0;
        int i34 = -1;
        while (true) {
            if (i30 < i28) {
                int i35 = i30 + 1;
                ? r0 = r129[i30];
                if (r0 < 0) {
                    i10 = C0270Vv.a((int) r0, (byte[]) r129, i35, yv6);
                    r5 = yv6.a;
                } else {
                    r5 = r0;
                    i10 = i35;
                }
                int i36 = r5 >>> 3;
                int i37 = r5 & 7;
                if (i36 > i31) {
                    i11 = lxVar2.a(i36, i32 / 3);
                } else {
                    i11 = lxVar2.g(i36);
                }
                int i38 = i11;
                if (i38 == -1) {
                    i20 = i36;
                    i6 = i10;
                    i12 = i33;
                    i14 = i34;
                    unsafe = unsafe2;
                    i5 = i29;
                    i13 = 0;
                    r7 = r5;
                    if (r7 == i5 || i5 == 0) {
                        if (this.h) {
                            yv2 = yv;
                            if (yv2.d != C1738tw.a()) {
                                i15 = i20;
                                if (yv2.d.a(this.g, i15) == null) {
                                    i16 = C0270Vv.a((int) r7, (byte[]) r32, i6, i3, d((Object) t), yv);
                                    t4 = t;
                                    r122 = r32;
                                    i28 = i3;
                                    i29 = i5;
                                    r33 = r7;
                                    lxVar2 = this;
                                    i17 = i15;
                                    i34 = i14;
                                    i18 = i13;
                                    i19 = i12;
                                    r123 = r122;
                                    r34 = r33;
                                } else {
                                    d dVar = (d) t;
                                    dVar.g();
                                    C1858xw<Object> xwVar = dVar.zztj;
                                    throw new NoSuchMethodError();
                                }
                            } else {
                                t3 = t;
                            }
                        } else {
                            t3 = t;
                            yv2 = yv;
                        }
                        int i39 = i20;
                        i30 = C0270Vv.a((int) r7, (byte[]) r32, i6, i3, d((Object) t), yv);
                        r12 = r32;
                        i28 = i3;
                        r3 = r7;
                        lxVar2 = this;
                        i31 = i39;
                        t4 = t3;
                        i34 = i14;
                        i32 = i13;
                        unsafe2 = unsafe;
                        i29 = i5;
                        i33 = i12;
                        r129 = r12;
                        r35 = r3;
                    } else {
                        i9 = -1;
                        lxVar = this;
                        t2 = t;
                        r35 = r7;
                        i7 = i14;
                        i8 = i12;
                    }
                } else {
                    int[] iArr = lxVar2.c;
                    int i40 = iArr[i38 + 1];
                    int i41 = (i40 & 267386880) >>> 20;
                    ? r20 = r5;
                    long j2 = (long) (i40 & 1048575);
                    int i42 = i40;
                    if (i41 <= 17) {
                        int i43 = iArr[i38 + 2];
                        int i44 = 1 << (i43 >>> 20);
                        int i45 = i43 & 1048575;
                        if (i45 != i34) {
                            if (i34 != -1) {
                                unsafe2.putInt(t4, (long) i34, i33);
                            }
                            i33 = unsafe2.getInt(t4, (long) i45);
                            i34 = i45;
                        }
                        switch (i41) {
                            case 0:
                                i24 = i38;
                                i23 = i36;
                                i22 = i34;
                                long j3 = j2;
                                r8 = r20;
                                ? r1210 = r32;
                                yv3 = yv;
                                i25 = i10;
                                if (i37 == 1) {
                                    Ux.a((Object) t4, j3, C0270Vv.c(r1210, i25));
                                    r126 = r1210;
                                    break;
                                }
                                break;
                            case 1:
                                i24 = i38;
                                i23 = i36;
                                i22 = i34;
                                long j4 = j2;
                                r8 = r20;
                                ? r1211 = r32;
                                yv3 = yv;
                                i25 = i10;
                                if (i37 == 5) {
                                    Ux.a((Object) t4, j4, C0270Vv.d(r1211, i25));
                                    i26 = i25 + 4;
                                    r125 = r1211;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                i24 = i38;
                                i23 = i36;
                                i22 = i34;
                                long j5 = j2;
                                r8 = r20;
                                ? r1212 = r32;
                                C0285Yv yv7 = yv;
                                i25 = i10;
                                if (i37 == 0) {
                                    int b2 = C0270Vv.b(r1212, i25, yv7);
                                    unsafe2.putLong(t, j5, yv7.b);
                                    i33 |= i44;
                                    i26 = b2;
                                    int i46 = r8;
                                    i32 = i24;
                                    i31 = i23;
                                    yv6 = yv7;
                                    i34 = i22;
                                    ? r1213 = r1212;
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                i24 = i38;
                                i23 = i36;
                                i22 = i34;
                                long j6 = j2;
                                r8 = r20;
                                ? r1214 = r32;
                                yv3 = yv;
                                i25 = i10;
                                if (i37 == 0) {
                                    i26 = C0270Vv.a(r1214, i25, yv3);
                                    unsafe2.putInt(t4, j6, yv3.a);
                                    r125 = r1214;
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                int i47 = i3;
                                i24 = i38;
                                i23 = i36;
                                long j7 = j2;
                                r8 = r20;
                                ? r1215 = r32;
                                yv3 = yv;
                                if (i37 == 1) {
                                    i22 = i34;
                                    i25 = i10;
                                    unsafe2.putLong(t, j7, C0270Vv.b(r1215, i10));
                                    r126 = r1215;
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                i27 = i3;
                                i24 = i38;
                                i23 = i36;
                                long j8 = j2;
                                r8 = r20;
                                ? r1216 = r32;
                                yv4 = yv;
                                if (i37 == 5) {
                                    unsafe2.putInt(t4, j8, C0270Vv.a(r1216, i10));
                                    i30 = i10 + 4;
                                    r127 = r1216;
                                    break;
                                }
                                break;
                            case 7:
                                i27 = i3;
                                i24 = i38;
                                i23 = i36;
                                long j9 = j2;
                                r8 = r20;
                                ? r1217 = r32;
                                yv4 = yv;
                                if (i37 == 0) {
                                    int b3 = C0270Vv.b(r1217, i10, yv4);
                                    Ux.a((Object) t4, j9, yv4.b != 0);
                                    i33 |= i44;
                                    i30 = b3;
                                    ? r1218 = r1217;
                                    break;
                                }
                                break;
                            case 8:
                                i27 = i3;
                                i24 = i38;
                                i23 = i36;
                                long j10 = j2;
                                r8 = r20;
                                ? r1219 = r32;
                                yv4 = yv;
                                if (i37 == 2) {
                                    if ((i42 & 536870912) == 0) {
                                        i30 = C0270Vv.c(r1219, i10, yv4);
                                    } else {
                                        i30 = C0270Vv.d(r1219, i10, yv4);
                                    }
                                    unsafe2.putObject(t4, j10, yv4.c);
                                    r127 = r1219;
                                    break;
                                }
                                break;
                            case 9:
                                i24 = i38;
                                i23 = i36;
                                long j11 = j2;
                                ? r82 = r20;
                                ? r1220 = r32;
                                yv4 = yv;
                                if (i37 != 2) {
                                    int i48 = i3;
                                    r8 = r82;
                                    break;
                                } else {
                                    i27 = i3;
                                    i30 = C0270Vv.a(lxVar2.a(i24), (byte[]) r1220, i10, i27, yv4);
                                    if ((i33 & i44) != 0) {
                                        unsafe2.putObject(t4, j11, C0209Gw.a(unsafe2.getObject(t4, j11), yv4.c));
                                        r8 = r82;
                                        r127 = r1220;
                                        break;
                                    } else {
                                        unsafe2.putObject(t4, j11, yv4.c);
                                        r8 = r82;
                                        r127 = r1220;
                                        break;
                                    }
                                }
                            case 10:
                                i24 = i38;
                                i23 = i36;
                                long j12 = j2;
                                r8 = r20;
                                ? r1221 = r32;
                                yv3 = yv;
                                if (i37 == 2) {
                                    i26 = C0270Vv.e(r1221, i10, yv3);
                                    unsafe2.putObject(t4, j12, yv3.c);
                                    r128 = r1221;
                                    break;
                                }
                                break;
                            case 12:
                                i24 = i38;
                                i23 = i36;
                                long j13 = j2;
                                r8 = r20;
                                ? r1222 = r32;
                                yv3 = yv;
                                if (i37 == 0) {
                                    i26 = C0270Vv.a(r1222, i10, yv3);
                                    int i49 = yv3.a;
                                    C0217Iw c2 = lxVar2.c(i24);
                                    if (c2 != null && !c2.a(i49)) {
                                        d((Object) t).a((int) r8, (Object) Long.valueOf((long) i49));
                                        r124 = r1222;
                                        break;
                                    } else {
                                        unsafe2.putInt(t4, j13, i49);
                                        r128 = r1222;
                                        break;
                                    }
                                }
                                break;
                            case 15:
                                i24 = i38;
                                i23 = i36;
                                long j14 = j2;
                                r8 = r20;
                                ? r1223 = r32;
                                yv3 = yv;
                                if (i37 == 0) {
                                    i26 = C0270Vv.a(r1223, i10, yv3);
                                    unsafe2.putInt(t4, j14, C1433jw.c(yv3.a));
                                    r128 = r1223;
                                    break;
                                }
                                break;
                            case 16:
                                C0285Yv yv8 = yv;
                                i24 = i38;
                                i23 = i36;
                                ? r83 = r20;
                                if (i37 != 0) {
                                    ? r1224 = r32;
                                    C0285Yv yv9 = yv8;
                                    r8 = r83;
                                    break;
                                } else {
                                    long j15 = j2;
                                    ? r1225 = r32;
                                    int b4 = C0270Vv.b(r1225, i10, yv8);
                                    yv3 = yv8;
                                    unsafe2.putLong(t, j15, C1433jw.a(yv8.b));
                                    i33 |= i44;
                                    i26 = b4;
                                    r8 = r83;
                                    r124 = r1225;
                                    break;
                                }
                            case 17:
                                if (i37 != 3) {
                                    i24 = i38;
                                    i23 = i36;
                                    r8 = r20;
                                    ? r1226 = r32;
                                    C0285Yv yv10 = yv;
                                    break;
                                } else {
                                    int i50 = i38;
                                    int i51 = i36;
                                    ? r84 = r20;
                                    i30 = C0270Vv.a(lxVar2.a(i38), (byte[]) r32, i10, i3, (i36 << 3) | 4, yv);
                                    if ((i33 & i44) == 0) {
                                        yv5 = yv;
                                        unsafe2.putObject(t4, j2, yv5.c);
                                    } else {
                                        yv5 = yv;
                                        unsafe2.putObject(t4, j2, C0209Gw.a(unsafe2.getObject(t4, j2), yv5.c));
                                    }
                                    i33 |= i44;
                                    r12 = r32;
                                    i28 = i3;
                                    r3 = r84;
                                    i32 = i50;
                                    i31 = i51;
                                    i29 = i4;
                                    yv6 = yv5;
                                    break;
                                }
                            default:
                                ? r1227 = r32;
                                C0285Yv yv11 = yv;
                                i24 = i38;
                                i23 = i36;
                                i22 = i34;
                                ? r85 = r20;
                                break;
                        }
                    } else {
                        int i52 = i36;
                        i14 = i34;
                        ? r86 = r20;
                        int i53 = i10;
                        long j16 = j2;
                        r12 = r32;
                        C0285Yv yv12 = yv6;
                        int i54 = i38;
                        long j17 = j16;
                        if (i41 != 27) {
                            i12 = i33;
                            int i55 = i52;
                            if (i41 <= 49) {
                                i20 = i55;
                                int i56 = i53;
                                r262 = r86;
                                i13 = i54;
                                unsafe = unsafe2;
                                i16 = a(t, (byte[]) r32, i53, i3, (int) r86, i55, i37, i54, (long) i42, i41, j17, yv);
                                if (i16 != i56) {
                                    lxVar2 = this;
                                    t4 = t;
                                    r123 = r32;
                                    i28 = i3;
                                    i29 = i4;
                                    yv2 = yv;
                                    i34 = i14;
                                    i18 = i13;
                                    i19 = i12;
                                    i17 = i20;
                                    r34 = r262;
                                }
                            } else {
                                int i57 = i37;
                                long j18 = j17;
                                i20 = i55;
                                i21 = i53;
                                r262 = r86;
                                i13 = i54;
                                unsafe = unsafe2;
                                int i58 = i42;
                                if (i41 != 50) {
                                    i16 = a(t, (byte[]) r32, i21, i3, (int) r262, i20, i57, i58, i41, j18, i13, yv);
                                    if (i16 != i21) {
                                        i15 = i20;
                                        lxVar2 = this;
                                        t4 = t;
                                        r122 = r32;
                                        i28 = i3;
                                        i29 = i4;
                                        yv2 = yv;
                                        r33 = r262;
                                        i17 = i15;
                                        i34 = i14;
                                        i18 = i13;
                                        i19 = i12;
                                        r123 = r122;
                                        r34 = r33;
                                    }
                                } else if (i57 == 2) {
                                    a(t, (byte[]) r32, i21, i3, i13, j18, yv);
                                    throw null;
                                }
                            }
                            i5 = i4;
                            i6 = i16;
                            r26 = r263;
                            r7 = r26;
                            if (r7 == i5) {
                            }
                            if (this.h) {
                            }
                            int i392 = i20;
                            i30 = C0270Vv.a((int) r7, (byte[]) r32, i6, i3, d((Object) t), yv);
                            r12 = r32;
                            i28 = i3;
                            r3 = r7;
                            lxVar2 = this;
                            i31 = i392;
                            t4 = t3;
                            i34 = i14;
                            i32 = i13;
                            unsafe2 = unsafe;
                            i29 = i5;
                            i33 = i12;
                            r129 = r12;
                            r35 = r3;
                        } else if (i37 == 2) {
                            C0213Hw hw = (C0213Hw) unsafe2.getObject(t4, j17);
                            if (!hw.N()) {
                                int size = hw.size();
                                hw = hw.b(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j17, hw);
                            }
                            int i59 = i52;
                            int i60 = i33;
                            i30 = C0270Vv.a(lxVar2.a(i54), r86, r32, i53, i3, hw, yv);
                            i29 = i4;
                            i31 = i59;
                            r3 = r86;
                            i32 = i54;
                            yv6 = yv12;
                            i34 = i14;
                            i33 = i60;
                            i28 = i3;
                            r129 = r12;
                            r35 = r3;
                        } else {
                            i12 = i33;
                            i20 = i52;
                            i21 = i53;
                            r262 = r86;
                            i13 = i54;
                            unsafe = unsafe2;
                        }
                        i5 = i4;
                        i6 = i21;
                        r26 = r262;
                        r7 = r26;
                        if (r7 == i5) {
                        }
                        if (this.h) {
                        }
                        int i3922 = i20;
                        i30 = C0270Vv.a((int) r7, (byte[]) r32, i6, i3, d((Object) t), yv);
                        r12 = r32;
                        i28 = i3;
                        r3 = r7;
                        lxVar2 = this;
                        i31 = i3922;
                        t4 = t3;
                        i34 = i14;
                        i32 = i13;
                        unsafe2 = unsafe;
                        i29 = i5;
                        i33 = i12;
                        r129 = r12;
                        r35 = r3;
                    }
                }
                unsafe2 = unsafe;
                r12 = r123;
                r3 = r34;
                r129 = r12;
                r35 = r3;
            } else {
                int i61 = i33;
                unsafe = unsafe2;
                i5 = i29;
                t2 = t4;
                lxVar = lxVar2;
                i6 = i30;
                i7 = i34;
                i8 = i61;
                i9 = -1;
            }
        }
        if (i7 != i9) {
            unsafe.putInt(t2, (long) i7, i8);
        }
        Rx rx = null;
        for (int i62 = lxVar.m; i62 < lxVar.n; i62++) {
            lxVar.a((Object) t2, lxVar.l[i62], (UB) rx, lxVar.q);
            rx = rx;
        }
        if (rx != null) {
            lxVar.q.b(t2, rx);
        }
        if (i5 == 0) {
            if (i6 != i3) {
                throw C0225Kw.h();
            }
        } else if (i6 > i3 || r35 != i5) {
            throw C0225Kw.h();
        }
        return i6;
    }

    /* JADX WARNING: type inference failed for: r29v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r12v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r0v5, types: [int, byte] */
    /* JADX WARNING: type inference failed for: r17v0, types: [int] */
    /* JADX WARNING: type inference failed for: r12v2 */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r0v9, types: [int] */
    /* JADX WARNING: type inference failed for: r1v5, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v8, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v3, types: [int] */
    /* JADX WARNING: type inference failed for: r2v9, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v10, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r5v5, types: [int] */
    /* JADX WARNING: type inference failed for: r1v11, types: [int] */
    /* JADX WARNING: type inference failed for: r2v11, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r17v1 */
    /* JADX WARNING: type inference failed for: r3v13, types: [int] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x024e, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x024e, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010b, code lost:
        r2 = r4;
        r1 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x013d, code lost:
        r0 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        r0 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        r1 = r7;
        r2 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x015f, code lost:
        r24 = r7;
        r15 = r8;
        r18 = r9;
        r19 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e1, code lost:
        if (r0 == r15) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x022b, code lost:
        if (r0 == r15) goto L_0x022d;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r0v5, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r29v0, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r12v2
  assigns: []
  uses: []
  mth insns count: 271
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
    public final void a(T t, byte[] r29, int i2, int i3, C0285Yv yv) throws IOException {
        ? r17;
        int i4;
        int i5;
        ? r12;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int a2;
        int i9;
        int i10;
        int i11;
        int i12;
        C1496lx lxVar = this;
        T t2 = t;
        ? r122 = r29;
        int i13 = i3;
        C0285Yv yv2 = yv;
        if (lxVar.j) {
            Unsafe unsafe2 = b;
            int i14 = -1;
            int i15 = i2;
            int i16 = -1;
            int i17 = 0;
            while (i15 < i13) {
                int i18 = i15 + 1;
                ? r0 = r122[i15];
                if (r0 < 0) {
                    i4 = C0270Vv.a((int) r0, (byte[]) r122, i18, yv2);
                    r17 = yv2.a;
                } else {
                    r17 = r0;
                    i4 = i18;
                }
                int i19 = r17 >>> 3;
                int i20 = r17 & 7;
                if (i19 > i16) {
                    i5 = lxVar.a(i19, i17 / 3);
                } else {
                    i5 = lxVar.g(i19);
                }
                int i21 = i5;
                if (i21 == i14) {
                    i6 = i19;
                    i8 = i4;
                    unsafe = unsafe2;
                    i7 = 0;
                } else {
                    int i22 = lxVar.c[i21 + 1];
                    int i23 = (267386880 & i22) >>> 20;
                    long j2 = (long) (1048575 & i22);
                    if (i23 <= 17) {
                        boolean z = true;
                        switch (i23) {
                            case 0:
                                long j3 = j2;
                                i10 = i21;
                                if (i20 == 1) {
                                    Ux.a((Object) t2, j3, C0270Vv.c(r122, i4));
                                    break;
                                }
                                break;
                            case 1:
                                long j4 = j2;
                                i10 = i21;
                                if (i20 == 5) {
                                    Ux.a((Object) t2, j4, C0270Vv.d(r122, i4));
                                    i11 = i4 + 4;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                long j5 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i12 = C0270Vv.b(r122, i4, yv2);
                                    unsafe2.putLong(t, j5, yv2.b);
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                long j6 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i11 = C0270Vv.a(r122, i4, yv2);
                                    unsafe2.putInt(t2, j6, yv2.a);
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                long j7 = j2;
                                if (i20 == 1) {
                                    i10 = i21;
                                    unsafe2.putLong(t, j7, C0270Vv.b(r122, i4));
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                long j8 = j2;
                                if (i20 == 5) {
                                    unsafe2.putInt(t2, j8, C0270Vv.a(r122, i4));
                                    i15 = i4 + 4;
                                    break;
                                }
                                break;
                            case 7:
                                long j9 = j2;
                                if (i20 == 0) {
                                    int b2 = C0270Vv.b(r122, i4, yv2);
                                    if (yv2.b == 0) {
                                        z = false;
                                    }
                                    Ux.a((Object) t2, j9, z);
                                    i15 = b2;
                                    break;
                                }
                                break;
                            case 8:
                                long j10 = j2;
                                if (i20 == 2) {
                                    if ((536870912 & i22) == 0) {
                                        i15 = C0270Vv.c(r122, i4, yv2);
                                    } else {
                                        i15 = C0270Vv.d(r122, i4, yv2);
                                    }
                                    unsafe2.putObject(t2, j10, yv2.c);
                                    break;
                                }
                                break;
                            case 9:
                                long j11 = j2;
                                if (i20 == 2) {
                                    i15 = C0270Vv.a(lxVar.a(i21), (byte[]) r122, i4, i13, yv2);
                                    Object object = unsafe2.getObject(t2, j11);
                                    if (object != null) {
                                        unsafe2.putObject(t2, j11, C0209Gw.a(object, yv2.c));
                                        break;
                                    } else {
                                        unsafe2.putObject(t2, j11, yv2.c);
                                        break;
                                    }
                                }
                                break;
                            case 10:
                                long j12 = j2;
                                if (i20 == 2) {
                                    i15 = C0270Vv.e(r122, i4, yv2);
                                    unsafe2.putObject(t2, j12, yv2.c);
                                    break;
                                }
                                break;
                            case 12:
                                long j13 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i11 = C0270Vv.a(r122, i4, yv2);
                                    unsafe2.putInt(t2, j13, yv2.a);
                                    break;
                                }
                                break;
                            case 15:
                                long j14 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i11 = C0270Vv.a(r122, i4, yv2);
                                    unsafe2.putInt(t2, j14, C1433jw.c(yv2.a));
                                    break;
                                }
                                break;
                            case 16:
                                if (i20 == 0) {
                                    i12 = C0270Vv.b(r122, i4, yv2);
                                    i10 = i21;
                                    unsafe2.putLong(t, j2, C1433jw.a(yv2.b));
                                    break;
                                }
                                break;
                        }
                    } else if (i23 != 27) {
                        i7 = i21;
                        if (i23 <= 49) {
                            long j15 = (long) i22;
                            int i24 = i20;
                            i6 = i19;
                            int i25 = i4;
                            unsafe = unsafe2;
                            a2 = a(t, (byte[]) r29, i4, i3, (int) r17, i19, i24, i7, j15, i23, j2, yv);
                        } else {
                            long j16 = j2;
                            int i26 = i20;
                            i6 = i19;
                            i9 = i4;
                            unsafe = unsafe2;
                            int i27 = i23;
                            if (i27 == 50) {
                                if (i26 == 2) {
                                    a(t, (byte[]) r29, i9, i3, i7, j16, yv);
                                    throw null;
                                }
                                i8 = i9;
                            } else {
                                a2 = a(t, (byte[]) r29, i9, i3, (int) r17, i6, i26, i22, i27, j16, i7, yv);
                            }
                        }
                        i8 = a2;
                    } else if (i20 == 2) {
                        C0213Hw hw = (C0213Hw) unsafe2.getObject(t2, j2);
                        if (!hw.N()) {
                            int size = hw.size();
                            hw = hw.b(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t2, j2, hw);
                        }
                        int i28 = i21;
                        i15 = C0270Vv.a(lxVar.a(i21), r17, r29, i4, i3, hw, yv);
                        i16 = i19;
                        i17 = i28;
                        r12 = r122;
                        i14 = -1;
                        r122 = r12;
                    }
                    i7 = i21;
                    i6 = i19;
                    i9 = i4;
                    unsafe = unsafe2;
                    i8 = i9;
                }
                a2 = C0270Vv.a((int) r17, (byte[]) r29, i8, i3, d((Object) t), yv);
                lxVar = this;
                t2 = t;
                r12 = r29;
                i13 = i3;
                yv2 = yv;
                unsafe2 = unsafe;
                i17 = i7;
                i16 = i6;
                i14 = -1;
                r122 = r12;
            }
            if (i15 != i13) {
                throw C0225Kw.h();
            }
            return;
        }
        int i29 = i13;
        a(t, (byte[]) r29, i2, i3, 0, yv);
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, Nx<UT, UB> nx) {
        int i3 = this.c[i2];
        Object f2 = Ux.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null) {
            return ub;
        }
        C0217Iw c2 = c(i2);
        if (c2 == null) {
            return ub;
        }
        a(i2, i3, this.s.f(f2), c2, ub, nx);
        throw null;
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, C0217Iw iw, UB ub, Nx<UT, UB> nx) {
        this.s.g(b(i2));
        throw null;
    }

    private static boolean a(Object obj, int i2, C1859xx xxVar) {
        return xxVar.c(Ux.f(obj, (long) (i2 & 1048575)));
    }

    private final void a(Object obj, int i2, C1889yx yxVar) throws IOException {
        if (f(i2)) {
            Ux.a(obj, (long) (i2 & 1048575), (Object) yxVar.i());
        } else if (this.i) {
            Ux.a(obj, (long) (i2 & 1048575), (Object) yxVar.readString());
        } else {
            Ux.a(obj, (long) (i2 & 1048575), (Object) yxVar.f());
        }
    }

    private static <T> double a(T t, long j2) {
        return ((Double) Ux.f(t, j2)).doubleValue();
    }

    private final boolean a(T t, int i2, int i3, int i4) {
        if (this.j) {
            return a(t, i2);
        }
        return (i3 & i4) != 0;
    }

    private final boolean a(T t, int i2) {
        if (this.j) {
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return Ux.e(t, j2) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                case 1:
                    return Ux.d(t, j2) != 0.0f;
                case 2:
                    return Ux.b(t, j2) != 0;
                case 3:
                    return Ux.b(t, j2) != 0;
                case 4:
                    return Ux.a((Object) t, j2) != 0;
                case 5:
                    return Ux.b(t, j2) != 0;
                case 6:
                    return Ux.a((Object) t, j2) != 0;
                case 7:
                    return Ux.c(t, j2);
                case 8:
                    Object f2 = Ux.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof C0289Zv) {
                        return !C0289Zv.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return Ux.f(t, j2) != null;
                case 10:
                    return !C0289Zv.a.equals(Ux.f(t, j2));
                case 11:
                    return Ux.a((Object) t, j2) != 0;
                case 12:
                    return Ux.a((Object) t, j2) != 0;
                case 13:
                    return Ux.a((Object) t, j2) != 0;
                case 14:
                    return Ux.b(t, j2) != 0;
                case 15:
                    return Ux.a((Object) t, j2) != 0;
                case 16:
                    return Ux.b(t, j2) != 0;
                case 17:
                    return Ux.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (Ux.a((Object) t, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return Ux.a((Object) t, (long) (e(i3) & 1048575)) == i2;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, i3);
    }
}
