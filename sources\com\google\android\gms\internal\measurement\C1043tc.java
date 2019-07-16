package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.b;
import com.google.android.gms.internal.measurement.Gb.d;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.tc reason: case insensitive filesystem */
final class C1043tc<T> implements Ec<T> {
    private static final int[] a = new int[0];
    private static final Unsafe b = C0937cd.c();
    private final int[] c;
    private final Object[] d;
    private final int e;
    private final int f;
    private final C1026qc g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final int[] l;
    private final int m;
    private final int n;
    private final C1067xc o;
    private final C0922ac p;
    private final Xc<?, ?> q;
    private final C1054vb<?> r;
    private final C0984jc s;

    private C1043tc(int[] iArr, Object[] objArr, int i2, int i3, C1026qc qcVar, boolean z, boolean z2, int[] iArr2, int i4, int i5, C1067xc xcVar, C0922ac acVar, Xc<?, ?> xc, C1054vb<?> vbVar, C0984jc jcVar) {
        this.c = iArr;
        this.d = objArr;
        this.e = i2;
        this.f = i3;
        this.i = qcVar instanceof Gb;
        this.j = z;
        this.h = vbVar != null && vbVar.a(qcVar);
        this.k = false;
        this.l = iArr2;
        this.m = i4;
        this.n = i5;
        this.o = xcVar;
        this.p = acVar;
        this.q = xc;
        this.r = vbVar;
        this.g = qcVar;
        this.s = jcVar;
    }

    static <T> C1043tc<T> a(Class<T> cls, C1014oc ocVar, C1067xc xcVar, C0922ac acVar, Xc<?, ?> xc, C1054vb<?> vbVar, C0984jc jcVar) {
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
        C1014oc ocVar2 = ocVar;
        if (ocVar2 instanceof Cc) {
            Cc cc = (Cc) ocVar2;
            char c4 = 0;
            boolean z = cc.c() == d.j;
            String d2 = cc.d();
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
            Object[] e2 = cc.e();
            Class cls3 = cc.a().getClass();
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
            C1043tc tcVar = new C1043tc(iArr2, objArr, i8, i6, cc.a(), z, false, iArr, c4, i66, xcVar, acVar, xc, vbVar, jcVar);
            return tcVar;
        }
        ((Uc) ocVar2).c();
        throw null;
    }

    private static _c e(Object obj) {
        Gb gb = (Gb) obj;
        _c _cVar = gb.zzahz;
        if (_cVar != _c.c()) {
            return _cVar;
        }
        _c d2 = _c.d();
        gb.zzahz = d2;
        return d2;
    }

    private static boolean f(int i2) {
        return (i2 & 536870912) != 0;
    }

    private static <T> boolean f(T t, long j2) {
        return ((Boolean) C0937cd.f(t, j2)).booleanValue();
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
                            C0937cd.a((Object) t, j2, C0937cd.e(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 1:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.d(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 2:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 3:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 4:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 5:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 6:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 7:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.c(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 8:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.f(t2, j2));
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
                            C0937cd.a((Object) t, j2, C0937cd.f(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 11:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 12:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 13:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 14:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.b(t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 15:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.a((Object) t2, j2));
                            b(t, i2);
                            break;
                        }
                    case 16:
                        if (!a(t2, i2)) {
                            break;
                        } else {
                            C0937cd.a((Object) t, j2, C0937cd.b(t2, j2));
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
                        Gc.a(this.s, t, t2, j2);
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
                            C0937cd.a((Object) t, j2, C0937cd.f(t2, j2));
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
                            C0937cd.a((Object) t, j2, C0937cd.f(t2, j2));
                            b(t, i3, i2);
                            break;
                        }
                    case 68:
                        b(t, t2, i2);
                        break;
                }
            }
            if (!this.j) {
                Gc.a(this.q, t, t2);
                if (this.h) {
                    Gc.a(this.r, t, t2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
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
    public final int c(T t) {
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
                int d2 = d(i16);
                int i18 = (d2 & i13) >>> 20;
                int i19 = this.c[i16];
                long j3 = (long) (d2 & 1048575);
                int i20 = (i18 < Bb.DOUBLE_LIST_PACKED.a() || i18 > Bb.SINT64_LIST_PACKED.a()) ? 0 : this.c[i16 + 2] & 1048575;
                switch (i18) {
                    case 0:
                        if (a(t2, i16)) {
                            b3 = C1007nb.b(i19, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        } else {
                            continue;
                        }
                    case 1:
                        if (a(t2, i16)) {
                            b3 = C1007nb.b(i19, 0.0f);
                        } else {
                            continue;
                        }
                    case 2:
                        if (a(t2, i16)) {
                            b3 = C1007nb.d(i19, C0937cd.b(t2, j3));
                        } else {
                            continue;
                        }
                    case 3:
                        if (a(t2, i16)) {
                            b3 = C1007nb.e(i19, C0937cd.b(t2, j3));
                        } else {
                            continue;
                        }
                    case 4:
                        if (a(t2, i16)) {
                            b3 = C1007nb.f(i19, C0937cd.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 5:
                        if (a(t2, i16)) {
                            b3 = C1007nb.g(i19, 0);
                        } else {
                            continue;
                        }
                    case 6:
                        if (a(t2, i16)) {
                            b3 = C1007nb.i(i19, 0);
                        } else {
                            continue;
                        }
                    case 7:
                        if (a(t2, i16)) {
                            b3 = C1007nb.b(i19, true);
                        } else {
                            continue;
                        }
                    case 8:
                        if (a(t2, i16)) {
                            Object f2 = C0937cd.f(t2, j3);
                            if (f2 instanceof Ya) {
                                b3 = C1007nb.c(i19, (Ya) f2);
                            } else {
                                b3 = C1007nb.b(i19, (String) f2);
                            }
                        } else {
                            continue;
                        }
                    case 9:
                        if (a(t2, i16)) {
                            b3 = Gc.a(i19, C0937cd.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                    case 10:
                        if (a(t2, i16)) {
                            b3 = C1007nb.c(i19, (Ya) C0937cd.f(t2, j3));
                        } else {
                            continue;
                        }
                    case 11:
                        if (a(t2, i16)) {
                            b3 = C1007nb.g(i19, C0937cd.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 12:
                        if (a(t2, i16)) {
                            b3 = C1007nb.k(i19, C0937cd.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 13:
                        if (a(t2, i16)) {
                            b3 = C1007nb.j(i19, 0);
                        } else {
                            continue;
                        }
                    case 14:
                        if (a(t2, i16)) {
                            b3 = C1007nb.h(i19, 0);
                        } else {
                            continue;
                        }
                    case 15:
                        if (a(t2, i16)) {
                            b3 = C1007nb.h(i19, C0937cd.a((Object) t2, j3));
                        } else {
                            continue;
                        }
                    case 16:
                        if (a(t2, i16)) {
                            b3 = C1007nb.f(i19, C0937cd.b(t2, j3));
                        } else {
                            continue;
                        }
                    case 17:
                        if (a(t2, i16)) {
                            b3 = C1007nb.c(i19, (C1026qc) C0937cd.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                    case 18:
                        b3 = Gc.i(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 19:
                        b3 = Gc.h(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 20:
                        b3 = Gc.a(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 21:
                        b3 = Gc.b(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 22:
                        b3 = Gc.e(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 23:
                        b3 = Gc.i(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 24:
                        b3 = Gc.h(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 25:
                        b3 = Gc.j(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 26:
                        b3 = Gc.a(i19, a((Object) t2, j3));
                        i17 += b3;
                        break;
                    case 27:
                        b3 = Gc.a(i19, a((Object) t2, j3), a(i16));
                        i17 += b3;
                        break;
                    case 28:
                        b3 = Gc.b(i19, a((Object) t2, j3));
                        i17 += b3;
                        break;
                    case 29:
                        b3 = Gc.f(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 30:
                        b3 = Gc.d(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 31:
                        b3 = Gc.h(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 32:
                        b3 = Gc.i(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 33:
                        b3 = Gc.g(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 34:
                        b3 = Gc.c(i19, a((Object) t2, j3), false);
                        i17 += b3;
                        break;
                    case 35:
                        i11 = Gc.c((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 36:
                        i11 = Gc.b((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 37:
                        i11 = Gc.e((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 38:
                        i11 = Gc.f((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 39:
                        i11 = Gc.i((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 40:
                        i11 = Gc.c((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 41:
                        i11 = Gc.b((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 42:
                        i11 = Gc.d((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 43:
                        i11 = Gc.j((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 44:
                        i11 = Gc.h((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 45:
                        i11 = Gc.b((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 46:
                        i11 = Gc.c((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 47:
                        i11 = Gc.a((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 48:
                        i11 = Gc.g((List) unsafe.getObject(t2, j3));
                        if (i11 > 0) {
                            if (this.k) {
                                unsafe.putInt(t2, (long) i20, i11);
                            }
                            i12 = C1007nb.e(i19);
                            i10 = C1007nb.g(i11);
                            break;
                        } else {
                            continue;
                        }
                    case 49:
                        b3 = Gc.b(i19, a((Object) t2, j3), a(i16));
                        i17 += b3;
                        break;
                    case 50:
                        b3 = this.s.a(i19, C0937cd.f(t2, j3), b(i16));
                        i17 += b3;
                        break;
                    case 51:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.b(i19, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        } else {
                            continue;
                        }
                    case 52:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.b(i19, 0.0f);
                        } else {
                            continue;
                        }
                    case 53:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.d(i19, e(t2, j3));
                        } else {
                            continue;
                        }
                    case 54:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.e(i19, e(t2, j3));
                        } else {
                            continue;
                        }
                    case 55:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.f(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 56:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.g(i19, 0);
                        } else {
                            continue;
                        }
                    case 57:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.i(i19, 0);
                        } else {
                            continue;
                        }
                    case 58:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.b(i19, true);
                        } else {
                            continue;
                        }
                    case 59:
                        if (a(t2, i19, i16)) {
                            Object f3 = C0937cd.f(t2, j3);
                            if (f3 instanceof Ya) {
                                b3 = C1007nb.c(i19, (Ya) f3);
                            } else {
                                b3 = C1007nb.b(i19, (String) f3);
                            }
                        } else {
                            continue;
                        }
                    case 60:
                        if (a(t2, i19, i16)) {
                            b3 = Gc.a(i19, C0937cd.f(t2, j3), a(i16));
                        } else {
                            continue;
                        }
                    case 61:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.c(i19, (Ya) C0937cd.f(t2, j3));
                        } else {
                            continue;
                        }
                    case 62:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.g(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 63:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.k(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 64:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.j(i19, 0);
                        } else {
                            continue;
                        }
                    case 65:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.h(i19, 0);
                        } else {
                            continue;
                        }
                    case 66:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.h(i19, d(t2, j3));
                        } else {
                            continue;
                        }
                    case 67:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.f(i19, e(t2, j3));
                        } else {
                            continue;
                        }
                    case 68:
                        if (a(t2, i19, i16)) {
                            b3 = C1007nb.c(i19, (C1026qc) C0937cd.f(t2, j3), a(i16));
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
            int d3 = d(i21);
            int[] iArr = this.c;
            int i25 = iArr[i21];
            int i26 = (d3 & 267386880) >>> 20;
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
                i3 = (!this.k || i26 < Bb.DOUBLE_LIST_PACKED.a() || i26 > Bb.SINT64_LIST_PACKED.a()) ? 0 : this.c[i21 + 2] & i14;
                i2 = 0;
            }
            long j4 = (long) (d3 & i14);
            switch (i26) {
                case 0:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i22 += C1007nb.b(i25, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                        break;
                    }
                case 1:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i22 += C1007nb.b(i25, 0.0f);
                    }
                    break;
                case 2:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = C1007nb.d(i25, unsafe2.getLong(t2, j4));
                    }
                    break;
                case 3:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = C1007nb.e(i25, unsafe2.getLong(t2, j4));
                    }
                    break;
                case 4:
                    j2 = 0;
                    if ((i24 & i2) != 0) {
                        i4 = C1007nb.f(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 5:
                    if ((i24 & i2) == 0) {
                        j2 = 0;
                        break;
                    } else {
                        j2 = 0;
                        i4 = C1007nb.g(i25, 0);
                    }
                case 6:
                    if ((i24 & i2) == 0) {
                        break;
                    } else {
                        i22 += C1007nb.i(i25, 0);
                        break;
                    }
                case 7:
                    if ((i24 & i2) != 0) {
                        i22 += C1007nb.b(i25, true);
                        break;
                    }
                case 8:
                    if ((i24 & i2) != 0) {
                        Object object = unsafe2.getObject(t2, j4);
                        if (object instanceof Ya) {
                            b2 = C1007nb.c(i25, (Ya) object);
                        } else {
                            b2 = C1007nb.b(i25, (String) object);
                        }
                    }
                    break;
                case 9:
                    if ((i24 & i2) != 0) {
                        b2 = Gc.a(i25, unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
                case 10:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.c(i25, (Ya) unsafe2.getObject(t2, j4));
                    }
                    break;
                case 11:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.g(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 12:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.k(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 13:
                    if ((i24 & i2) != 0) {
                        i5 = C1007nb.j(i25, 0);
                    }
                    break;
                case 14:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.h(i25, 0);
                    }
                    break;
                case 15:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.h(i25, unsafe2.getInt(t2, j4));
                    }
                    break;
                case 16:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.f(i25, unsafe2.getLong(t2, j4));
                    }
                    break;
                case 17:
                    if ((i24 & i2) != 0) {
                        b2 = C1007nb.c(i25, (C1026qc) unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
                case 18:
                    b2 = Gc.i(i25, (List) unsafe2.getObject(t2, j4), false);
                    i22 += b2;
                    break;
                case 19:
                    i6 = Gc.h(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 20:
                    i6 = Gc.a(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 21:
                    i6 = Gc.b(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 22:
                    i6 = Gc.e(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 23:
                    i6 = Gc.i(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 24:
                    i6 = Gc.h(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 25:
                    i6 = Gc.j(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 26:
                    b2 = Gc.a(i25, (List) unsafe2.getObject(t2, j4));
                    i22 += b2;
                    break;
                case 27:
                    b2 = Gc.a(i25, (List) unsafe2.getObject(t2, j4), a(i21));
                    i22 += b2;
                    break;
                case 28:
                    b2 = Gc.b(i25, (List) unsafe2.getObject(t2, j4));
                    i22 += b2;
                    break;
                case 29:
                    b2 = Gc.f(i25, (List) unsafe2.getObject(t2, j4), false);
                    i22 += b2;
                    break;
                case 30:
                    i6 = Gc.d(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 31:
                    i6 = Gc.h(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 32:
                    i6 = Gc.i(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 33:
                    i6 = Gc.g(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 34:
                    i6 = Gc.c(i25, (List) unsafe2.getObject(t2, j4), false);
                    break;
                case 35:
                    i9 = Gc.c((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 36:
                    i9 = Gc.b((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 37:
                    i9 = Gc.e((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 38:
                    i9 = Gc.f((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 39:
                    i9 = Gc.i((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 40:
                    i9 = Gc.c((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 41:
                    i9 = Gc.b((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 42:
                    i9 = Gc.d((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 43:
                    i9 = Gc.j((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 44:
                    i9 = Gc.h((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 45:
                    i9 = Gc.b((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 46:
                    i9 = Gc.c((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 47:
                    i9 = Gc.a((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 48:
                    i9 = Gc.g((List) unsafe2.getObject(t2, j4));
                    if (i9 > 0) {
                        if (this.k) {
                            unsafe2.putInt(t2, (long) i3, i9);
                        }
                        i8 = C1007nb.e(i25);
                        i7 = C1007nb.g(i9);
                        break;
                    }
                    break;
                case 49:
                    b2 = Gc.b(i25, (List) unsafe2.getObject(t2, j4), a(i21));
                    i22 += b2;
                    break;
                case 50:
                    b2 = this.s.a(i25, unsafe2.getObject(t2, j4), b(i21));
                    i22 += b2;
                    break;
                case 51:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.b(i25, (double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    }
                    break;
                case 52:
                    if (a(t2, i25, i21)) {
                        i5 = C1007nb.b(i25, 0.0f);
                    }
                    break;
                case 53:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.d(i25, e(t2, j4));
                    }
                    break;
                case 54:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.e(i25, e(t2, j4));
                    }
                    break;
                case 55:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.f(i25, d(t2, j4));
                    }
                    break;
                case 56:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.g(i25, 0);
                    }
                    break;
                case 57:
                    if (a(t2, i25, i21)) {
                        i5 = C1007nb.i(i25, 0);
                    }
                    break;
                case 58:
                    if (a(t2, i25, i21)) {
                        i5 = C1007nb.b(i25, true);
                    }
                    break;
                case 59:
                    if (a(t2, i25, i21)) {
                        Object object2 = unsafe2.getObject(t2, j4);
                        if (object2 instanceof Ya) {
                            b2 = C1007nb.c(i25, (Ya) object2);
                        } else {
                            b2 = C1007nb.b(i25, (String) object2);
                        }
                    }
                    break;
                case 60:
                    if (a(t2, i25, i21)) {
                        b2 = Gc.a(i25, unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
                case 61:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.c(i25, (Ya) unsafe2.getObject(t2, j4));
                    }
                    break;
                case 62:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.g(i25, d(t2, j4));
                    }
                    break;
                case 63:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.k(i25, d(t2, j4));
                    }
                    break;
                case 64:
                    if (a(t2, i25, i21)) {
                        i5 = C1007nb.j(i25, 0);
                    }
                    break;
                case 65:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.h(i25, 0);
                    }
                    break;
                case 66:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.h(i25, d(t2, j4));
                    }
                    break;
                case 67:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.f(i25, e(t2, j4));
                    }
                    break;
                case 68:
                    if (a(t2, i25, i21)) {
                        b2 = C1007nb.c(i25, (C1026qc) unsafe2.getObject(t2, j4), a(i21));
                    }
                    break;
            }
        }
        int a2 = i22 + a(this.q, t2);
        if (this.h) {
            C1060wb a3 = this.r.a((Object) t2);
            int i28 = 0;
            for (int i29 = 0; i29 < a3.b.c(); i29++) {
                Entry b4 = a3.b.b(i29);
                i28 += C1060wb.a((C1072yb) b4.getKey(), b4.getValue());
            }
            for (Entry entry : a3.b.d()) {
                i28 += C1060wb.a((C1072yb) entry.getKey(), entry.getValue());
            }
            a2 += i28;
        }
        return a2;
    }

    public final boolean d(T t) {
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
                        if (i10 == 50 && !this.s.a(C0937cd.f(t, (long) (d2 & 1048575))).isEmpty()) {
                            this.s.d(b(i6));
                            throw null;
                        }
                    }
                }
                List list = (List) C0937cd.f(t, (long) (d2 & 1048575));
                if (!list.isEmpty()) {
                    Ec a2 = a(i6);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            break;
                        } else if (!a2.d(list.get(i11))) {
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

    public final T newInstance() {
        return this.o.a(this.g);
    }

    private final int e(int i2) {
        return this.c[i2 + 2];
    }

    private static <T> long e(T t, long j2) {
        return ((Long) C0937cd.f(t, j2)).longValue();
    }

    private final int d(int i2) {
        return this.c[i2 + 1];
    }

    private static <T> int d(T t, long j2) {
        return ((Integer) C0937cd.f(t, j2)).intValue();
    }

    private final void b(T t, T t2, int i2) {
        int d2 = d(i2);
        int i3 = this.c[i2];
        long j2 = (long) (d2 & 1048575);
        if (a(t2, i3, i2)) {
            Object f2 = C0937cd.f(t, j2);
            Object f3 = C0937cd.f(t2, j2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    C0937cd.a((Object) t, j2, f3);
                    b(t, i3, i2);
                }
                return;
            }
            C0937cd.a((Object) t, j2, Hb.a(f2, f3));
            b(t, i3, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:167:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030  */
    private final void b(T t, C1050ud udVar) throws IOException {
        Entry entry;
        int length;
        int i2;
        int i3;
        int i4;
        T t2 = t;
        C1050ud udVar2 = udVar;
        if (this.h) {
            C1060wb a2 = this.r.a((Object) t2);
            if (!a2.b.isEmpty()) {
                entry = (Entry) a2.d().next();
                length = this.c.length;
                Unsafe unsafe = b;
                i2 = 0;
                int i5 = -1;
                int i6 = 0;
                while (i2 < length) {
                    int d2 = d(i2);
                    int[] iArr = this.c;
                    int i7 = iArr[i2];
                    int i8 = (267386880 & d2) >>> 20;
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
                        long j2 = (long) (d2 & 1048575);
                        switch (i8) {
                            case 0:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, C0937cd.e(t2, j2));
                                    break;
                                }
                            case 1:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, C0937cd.d(t2, j2));
                                    break;
                                }
                            case 2:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.e(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 3:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.c(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 4:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 5:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.b(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 6:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.b(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 7:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, C0937cd.c(t2, j2));
                                    break;
                                }
                            case 8:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    a(i7, unsafe.getObject(t2, j2), udVar2);
                                    break;
                                }
                            case 9:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                            case 10:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, (Ya) unsafe.getObject(t2, j2));
                                    break;
                                }
                            case 11:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.c(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 12:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.e(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 13:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.f(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 14:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.d(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 15:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.d(i7, unsafe.getInt(t2, j2));
                                    break;
                                }
                            case 16:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.a(i7, unsafe.getLong(t2, j2));
                                    break;
                                }
                            case 17:
                                if ((i6 & i4) == 0) {
                                    break;
                                } else {
                                    udVar2.b(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                            case 18:
                                Gc.a(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 19:
                                Gc.b(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 20:
                                Gc.c(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 21:
                                Gc.d(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 22:
                                Gc.h(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 23:
                                Gc.f(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 24:
                                Gc.k(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 25:
                                Gc.n(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 26:
                                Gc.a(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2);
                                break;
                            case 27:
                                Gc.a(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, a(i2));
                                break;
                            case 28:
                                Gc.b(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2);
                                break;
                            case 29:
                                Gc.i(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 30:
                                Gc.m(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 31:
                                Gc.l(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 32:
                                Gc.g(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 33:
                                Gc.j(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 34:
                                Gc.e(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, false);
                                break;
                            case 35:
                                Gc.a(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 36:
                                Gc.b(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 37:
                                Gc.c(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 38:
                                Gc.d(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 39:
                                Gc.h(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 40:
                                Gc.f(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 41:
                                Gc.k(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 42:
                                Gc.n(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 43:
                                Gc.i(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 44:
                                Gc.m(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 45:
                                Gc.l(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 46:
                                Gc.g(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 47:
                                Gc.j(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 48:
                                Gc.e(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, true);
                                break;
                            case 49:
                                Gc.b(this.c[i2], (List) unsafe.getObject(t2, j2), udVar2, a(i2));
                                break;
                            case 50:
                                a(udVar2, i7, unsafe.getObject(t2, j2), i2);
                                break;
                            case 51:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, b(t2, j2));
                                    break;
                                }
                            case 52:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, c(t2, j2));
                                    break;
                                }
                            case 53:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.e(i7, e(t2, j2));
                                    break;
                                }
                            case 54:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.c(i7, e(t2, j2));
                                    break;
                                }
                            case 55:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, d(t2, j2));
                                    break;
                                }
                            case 56:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.b(i7, e(t2, j2));
                                    break;
                                }
                            case 57:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.b(i7, d(t2, j2));
                                    break;
                                }
                            case 58:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, f(t2, j2));
                                    break;
                                }
                            case 59:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    a(i7, unsafe.getObject(t2, j2), udVar2);
                                    break;
                                }
                            case 60:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, unsafe.getObject(t2, j2), a(i2));
                                    break;
                                }
                            case 61:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, (Ya) unsafe.getObject(t2, j2));
                                    break;
                                }
                            case 62:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.c(i7, d(t2, j2));
                                    break;
                                }
                            case 63:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.e(i7, d(t2, j2));
                                    break;
                                }
                            case 64:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.f(i7, d(t2, j2));
                                    break;
                                }
                            case 65:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.d(i7, e(t2, j2));
                                    break;
                                }
                            case 66:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.d(i7, d(t2, j2));
                                    break;
                                }
                            case 67:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.a(i7, e(t2, j2));
                                    break;
                                }
                            case 68:
                                if (!a(t2, i7, i2)) {
                                    break;
                                } else {
                                    udVar2.b(i7, unsafe.getObject(t2, j2), a(i2));
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
                    a(this.q, t2, udVar2);
                    return;
                } else {
                    this.r.a(udVar2, entry);
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.measurement.Gc.a(com.google.android.gms.internal.measurement.C0937cd.f(r10, r6), com.google.android.gms.internal.measurement.C0937cd.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.b(r10, r6) == com.google.android.gms.internal.measurement.C0937cd.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.b(r10, r6) == com.google.android.gms.internal.measurement.C0937cd.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.measurement.Gc.a(com.google.android.gms.internal.measurement.C0937cd.f(r10, r6), com.google.android.gms.internal.measurement.C0937cd.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.measurement.Gc.a(com.google.android.gms.internal.measurement.C0937cd.f(r10, r6), com.google.android.gms.internal.measurement.C0937cd.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.measurement.Gc.a(com.google.android.gms.internal.measurement.C0937cd.f(r10, r6), com.google.android.gms.internal.measurement.C0937cd.f(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.c(r10, r6) == com.google.android.gms.internal.measurement.C0937cd.c(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.b(r10, r6) == com.google.android.gms.internal.measurement.C0937cd.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r10, r6) == com.google.android.gms.internal.measurement.C0937cd.a((java.lang.Object) r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.b(r10, r6) == com.google.android.gms.internal.measurement.C0937cd.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.measurement.C0937cd.b(r10, r6) == com.google.android.gms.internal.measurement.C0937cd.b(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C0937cd.d(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.measurement.C0937cd.d(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C0937cd.e(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.measurement.C0937cd.e(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.measurement.Gc.a(com.google.android.gms.internal.measurement.C0937cd.f(r10, r6), com.google.android.gms.internal.measurement.C0937cd.f(r11, r6)) != false) goto L_0x01c2;
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
                        z = Gc.a(C0937cd.f(t, j2), C0937cd.f(t2, j2));
                        break;
                    case 50:
                        z = Gc.a(C0937cd.f(t, j2), C0937cd.f(t2, j2));
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
                        if (C0937cd.a((Object) t, e2) == C0937cd.a((Object) t2, e2)) {
                            break;
                        }
                }
                if (!z) {
                    return false;
                }
                i2 += 3;
            } else if (!this.q.d(t).equals(this.q.d(t2))) {
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
            int d2 = d(i4);
            int i6 = this.c[i4];
            long j2 = (long) (1048575 & d2);
            int i7 = 37;
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    i3 = i5 * 53;
                    i2 = Hb.a(Double.doubleToLongBits(C0937cd.e(t, j2)));
                case 1:
                    i3 = i5 * 53;
                    i2 = Float.floatToIntBits(C0937cd.d(t, j2));
                case 2:
                    i3 = i5 * 53;
                    i2 = Hb.a(C0937cd.b(t, j2));
                case 3:
                    i3 = i5 * 53;
                    i2 = Hb.a(C0937cd.b(t, j2));
                case 4:
                    i3 = i5 * 53;
                    i2 = C0937cd.a((Object) t, j2);
                case 5:
                    i3 = i5 * 53;
                    i2 = Hb.a(C0937cd.b(t, j2));
                case 6:
                    i3 = i5 * 53;
                    i2 = C0937cd.a((Object) t, j2);
                case 7:
                    i3 = i5 * 53;
                    i2 = Hb.a(C0937cd.c(t, j2));
                case 8:
                    i3 = i5 * 53;
                    i2 = ((String) C0937cd.f(t, j2)).hashCode();
                case 9:
                    Object f2 = C0937cd.f(t, j2);
                    if (f2 != null) {
                        i7 = f2.hashCode();
                        break;
                    }
                    break;
                case 10:
                    i3 = i5 * 53;
                    i2 = C0937cd.f(t, j2).hashCode();
                case 11:
                    i3 = i5 * 53;
                    i2 = C0937cd.a((Object) t, j2);
                case 12:
                    i3 = i5 * 53;
                    i2 = C0937cd.a((Object) t, j2);
                case 13:
                    i3 = i5 * 53;
                    i2 = C0937cd.a((Object) t, j2);
                case 14:
                    i3 = i5 * 53;
                    i2 = Hb.a(C0937cd.b(t, j2));
                case 15:
                    i3 = i5 * 53;
                    i2 = C0937cd.a((Object) t, j2);
                case 16:
                    i3 = i5 * 53;
                    i2 = Hb.a(C0937cd.b(t, j2));
                case 17:
                    Object f3 = C0937cd.f(t, j2);
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
                    i2 = C0937cd.f(t, j2).hashCode();
                case 50:
                    i3 = i5 * 53;
                    i2 = C0937cd.f(t, j2).hashCode();
                case 51:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Hb.a(Double.doubleToLongBits(b(t, j2)));
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
                        i2 = Hb.a(e(t, j2));
                    }
                case 54:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = Hb.a(e(t, j2));
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
                        i2 = Hb.a(e(t, j2));
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
                        i2 = Hb.a(f(t, j2));
                    }
                case 59:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = ((String) C0937cd.f(t, j2)).hashCode();
                    }
                case 60:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0937cd.f(t, j2).hashCode();
                    }
                case 61:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0937cd.f(t, j2).hashCode();
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
                        i2 = Hb.a(e(t, j2));
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
                        i2 = Hb.a(e(t, j2));
                    }
                case 68:
                    if (!a(t, i6, i4)) {
                        break;
                    } else {
                        i3 = i5 * 53;
                        i2 = C0937cd.f(t, j2).hashCode();
                    }
            }
        }
        int hashCode = (i5 * 53) + this.q.d(t).hashCode();
        return this.h ? (hashCode * 53) + this.r.a((Object) t).hashCode() : hashCode;
    }

    private final void a(T t, T t2, int i2) {
        long d2 = (long) (d(i2) & 1048575);
        if (a(t2, i2)) {
            Object f2 = C0937cd.f(t, d2);
            Object f3 = C0937cd.f(t2, d2);
            if (f2 == null || f3 == null) {
                if (f3 != null) {
                    C0937cd.a((Object) t, d2, f3);
                    b(t, i2);
                }
                return;
            }
            C0937cd.a((Object) t, d2, Hb.a(f2, f3));
            b(t, i2);
        }
    }

    private static <UT, UB> int a(Xc<UT, UB> xc, T t) {
        return xc.c(xc.d(t));
    }

    private static List<?> a(Object obj, long j2) {
        return (List) C0937cd.f(obj, j2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04bc A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04bd  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x04eb  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x096d  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0973  */
    public final void a(T t, C1050ud udVar) throws IOException {
        Entry entry;
        int length;
        int i2;
        Entry entry2;
        int length2;
        if (udVar.a() == d.m) {
            a(this.q, t, udVar);
            if (this.h) {
                C1060wb a2 = this.r.a((Object) t);
                if (!a2.b.isEmpty()) {
                    entry2 = (Entry) a2.a().next();
                    length2 = this.c.length - 3;
                    while (length2 >= 0) {
                        int d2 = d(length2);
                        int[] iArr = this.c;
                        int i3 = iArr[length2];
                        if (entry2 == null) {
                            switch ((d2 & 267386880) >>> 20) {
                                case 0:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.e(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 1:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 2:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.e(i3, C0937cd.b(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 3:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.c(i3, C0937cd.b(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 4:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.a((Object) t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 5:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.b(i3, C0937cd.b(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 6:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.b(i3, C0937cd.a((Object) t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 7:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.c(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 8:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        a(i3, C0937cd.f(t, (long) (d2 & 1048575)), udVar);
                                        break;
                                    }
                                case 9:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.f(t, (long) (d2 & 1048575)), a(length2));
                                        break;
                                    }
                                case 10:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, (Ya) C0937cd.f(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 11:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.c(i3, C0937cd.a((Object) t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 12:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.e(i3, C0937cd.a((Object) t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 13:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.f(i3, C0937cd.a((Object) t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 14:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.d(i3, C0937cd.b(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 15:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.d(i3, C0937cd.a((Object) t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 16:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.b(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 17:
                                    if (!a(t, length2)) {
                                        break;
                                    } else {
                                        udVar.b(i3, C0937cd.f(t, (long) (d2 & 1048575)), a(length2));
                                        break;
                                    }
                                case 18:
                                    Gc.a(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 19:
                                    Gc.b(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 20:
                                    Gc.c(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 21:
                                    Gc.d(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 22:
                                    Gc.h(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 23:
                                    Gc.f(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 24:
                                    Gc.k(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 25:
                                    Gc.n(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 26:
                                    Gc.a(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar);
                                    break;
                                case 27:
                                    Gc.a(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, a(length2));
                                    break;
                                case 28:
                                    Gc.b(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar);
                                    break;
                                case 29:
                                    Gc.i(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 30:
                                    Gc.m(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 31:
                                    Gc.l(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 32:
                                    Gc.g(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 33:
                                    Gc.j(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 34:
                                    Gc.e(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, false);
                                    break;
                                case 35:
                                    Gc.a(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 36:
                                    Gc.b(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 37:
                                    Gc.c(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 38:
                                    Gc.d(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 39:
                                    Gc.h(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 40:
                                    Gc.f(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 41:
                                    Gc.k(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 42:
                                    Gc.n(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 43:
                                    Gc.i(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 44:
                                    Gc.m(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 45:
                                    Gc.l(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 46:
                                    Gc.g(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 47:
                                    Gc.j(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 48:
                                    Gc.e(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, true);
                                    break;
                                case 49:
                                    Gc.b(iArr[length2], (List) C0937cd.f(t, (long) (d2 & 1048575)), udVar, a(length2));
                                    break;
                                case 50:
                                    a(udVar, i3, C0937cd.f(t, (long) (d2 & 1048575)), length2);
                                    break;
                                case 51:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, b(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 52:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, c(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 53:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.e(i3, e(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 54:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.c(i3, e(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 55:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 56:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.b(i3, e(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 57:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.b(i3, d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 58:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, f(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 59:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        a(i3, C0937cd.f(t, (long) (d2 & 1048575)), udVar);
                                        break;
                                    }
                                case 60:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, C0937cd.f(t, (long) (d2 & 1048575)), a(length2));
                                        break;
                                    }
                                case 61:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, (Ya) C0937cd.f(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 62:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.c(i3, d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 63:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.e(i3, d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 64:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.f(i3, d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 65:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.d(i3, e(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 66:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.d(i3, d(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 67:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.a(i3, e(t, (long) (d2 & 1048575)));
                                        break;
                                    }
                                case 68:
                                    if (!a(t, i3, length2)) {
                                        break;
                                    } else {
                                        udVar.b(i3, C0937cd.f(t, (long) (d2 & 1048575)), a(length2));
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
                        this.r.a(udVar, entry2);
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
                C1060wb a3 = this.r.a((Object) t);
                if (!a3.b.isEmpty()) {
                    entry = (Entry) a3.d().next();
                    length = this.c.length;
                    i2 = 0;
                    while (i2 < length) {
                        int d3 = d(i2);
                        int[] iArr2 = this.c;
                        int i4 = iArr2[i2];
                        if (entry == null) {
                            switch ((d3 & 267386880) >>> 20) {
                                case 0:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.e(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 1:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 2:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.e(i4, C0937cd.b(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 3:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.c(i4, C0937cd.b(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 4:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.a((Object) t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 5:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.b(i4, C0937cd.b(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 6:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.b(i4, C0937cd.a((Object) t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 7:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.c(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 8:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        a(i4, C0937cd.f(t, (long) (d3 & 1048575)), udVar);
                                        break;
                                    }
                                case 9:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.f(t, (long) (d3 & 1048575)), a(i2));
                                        break;
                                    }
                                case 10:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, (Ya) C0937cd.f(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 11:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.c(i4, C0937cd.a((Object) t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 12:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.e(i4, C0937cd.a((Object) t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 13:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.f(i4, C0937cd.a((Object) t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 14:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.d(i4, C0937cd.b(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 15:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.d(i4, C0937cd.a((Object) t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 16:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.b(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 17:
                                    if (!a(t, i2)) {
                                        break;
                                    } else {
                                        udVar.b(i4, C0937cd.f(t, (long) (d3 & 1048575)), a(i2));
                                        break;
                                    }
                                case 18:
                                    Gc.a(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 19:
                                    Gc.b(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 20:
                                    Gc.c(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 21:
                                    Gc.d(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 22:
                                    Gc.h(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 23:
                                    Gc.f(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 24:
                                    Gc.k(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 25:
                                    Gc.n(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 26:
                                    Gc.a(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar);
                                    break;
                                case 27:
                                    Gc.a(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, a(i2));
                                    break;
                                case 28:
                                    Gc.b(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar);
                                    break;
                                case 29:
                                    Gc.i(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 30:
                                    Gc.m(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 31:
                                    Gc.l(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 32:
                                    Gc.g(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 33:
                                    Gc.j(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 34:
                                    Gc.e(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, false);
                                    break;
                                case 35:
                                    Gc.a(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 36:
                                    Gc.b(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 37:
                                    Gc.c(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 38:
                                    Gc.d(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 39:
                                    Gc.h(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 40:
                                    Gc.f(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 41:
                                    Gc.k(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 42:
                                    Gc.n(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 43:
                                    Gc.i(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 44:
                                    Gc.m(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 45:
                                    Gc.l(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 46:
                                    Gc.g(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 47:
                                    Gc.j(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 48:
                                    Gc.e(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, true);
                                    break;
                                case 49:
                                    Gc.b(iArr2[i2], (List) C0937cd.f(t, (long) (d3 & 1048575)), udVar, a(i2));
                                    break;
                                case 50:
                                    a(udVar, i4, C0937cd.f(t, (long) (d3 & 1048575)), i2);
                                    break;
                                case 51:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, b(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 52:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, c(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 53:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.e(i4, e(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 54:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.c(i4, e(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 55:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 56:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.b(i4, e(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 57:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.b(i4, d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 58:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, f(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 59:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        a(i4, C0937cd.f(t, (long) (d3 & 1048575)), udVar);
                                        break;
                                    }
                                case 60:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, C0937cd.f(t, (long) (d3 & 1048575)), a(i2));
                                        break;
                                    }
                                case 61:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, (Ya) C0937cd.f(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 62:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.c(i4, d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 63:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.e(i4, d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 64:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.f(i4, d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 65:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.d(i4, e(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 66:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.d(i4, d(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 67:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.a(i4, e(t, (long) (d3 & 1048575)));
                                        break;
                                    }
                                case 68:
                                    if (!a(t, i4, i2)) {
                                        break;
                                    } else {
                                        udVar.b(i4, C0937cd.f(t, (long) (d3 & 1048575)), a(i2));
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
                        a(this.q, t, udVar);
                        return;
                    } else {
                        this.r.a(udVar, entry);
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
            b(t, udVar);
        }
    }

    private final Object b(int i2) {
        return this.d[(i2 / 3) << 1];
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
            Object f2 = C0937cd.f(t, d2);
            if (f2 != null) {
                this.s.f(f2);
                C0937cd.a((Object) t, d2, f2);
            }
            i3++;
        }
        int length = this.l.length;
        while (i2 < length) {
            this.p.b(t, (long) this.l[i2]);
            i2++;
        }
        this.q.a((Object) t);
        if (this.h) {
            this.r.c(t);
        }
    }

    private static <T> double b(T t, long j2) {
        return ((Double) C0937cd.f(t, j2)).doubleValue();
    }

    private final void b(T t, int i2) {
        if (!this.j) {
            int e2 = e(i2);
            long j2 = (long) (e2 & 1048575);
            C0937cd.a((Object) t, j2, C0937cd.a((Object) t, j2) | (1 << (e2 >>> 20)));
        }
    }

    private final void b(T t, int i2, int i3) {
        C0937cd.a((Object) t, (long) (e(i3) & 1048575), i2);
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

    private final Nb c(int i2) {
        return (Nb) this.d[((i2 / 3) << 1) + 1];
    }

    private static <T> float c(T t, long j2) {
        return ((Float) C0937cd.f(t, j2)).floatValue();
    }

    private final boolean c(T t, T t2, int i2) {
        return a(t, i2) == a(t2, i2);
    }

    private final <K, V> void a(C1050ud udVar, int i2, Object obj, int i3) throws IOException {
        if (obj != null) {
            this.s.d(b(i3));
            throw null;
        }
    }

    private static <UT, UB> void a(Xc<UT, UB> xc, T t, C1050ud udVar) throws IOException {
        xc.a(xc.d(t), udVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r7.a(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x058f, code lost:
        if (r9 == null) goto L_0x0591;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0591, code lost:
        r9 = r7.e(r11);
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
        r7.b((java.lang.Object) r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x05b1, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:154:0x058c */
    public final void a(T t, Fc fc, C1042tb tbVar) throws IOException {
        Object obj;
        if (tbVar != null) {
            Xc<?, ?> xc = this.q;
            C1054vb<?> vbVar = this.r;
            Object obj2 = null;
            while (true) {
                try {
                    int o2 = fc.o();
                    int g2 = g(o2);
                    if (g2 >= 0) {
                        int d2 = d(g2);
                        switch ((267386880 & d2) >>> 20) {
                            case 0:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.readDouble());
                                b(t, g2);
                                break;
                            case 1:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.readFloat());
                                b(t, g2);
                                break;
                            case 2:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.n());
                                b(t, g2);
                                break;
                            case 3:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.p());
                                b(t, g2);
                                break;
                            case 4:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.d());
                                b(t, g2);
                                break;
                            case 5:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.c());
                                b(t, g2);
                                break;
                            case 6:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.b());
                                b(t, g2);
                                break;
                            case 7:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.a());
                                b(t, g2);
                                break;
                            case 8:
                                a((Object) t, d2, fc);
                                b(t, g2);
                                break;
                            case 9:
                                if (!a(t, g2)) {
                                    C0937cd.a((Object) t, (long) (d2 & 1048575), fc.b(a(g2), tbVar));
                                    b(t, g2);
                                    break;
                                } else {
                                    long j2 = (long) (d2 & 1048575);
                                    C0937cd.a((Object) t, j2, Hb.a(C0937cd.f(t, j2), fc.b(a(g2), tbVar)));
                                    break;
                                }
                            case 10:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) fc.g());
                                b(t, g2);
                                break;
                            case 11:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.f());
                                b(t, g2);
                                break;
                            case 12:
                                int e2 = fc.e();
                                Nb c2 = c(g2);
                                if (c2 != null) {
                                    if (!c2.a(e2)) {
                                        obj2 = Gc.a(o2, e2, obj2, xc);
                                        break;
                                    }
                                }
                                C0937cd.a((Object) t, (long) (d2 & 1048575), e2);
                                b(t, g2);
                                break;
                            case 13:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.l());
                                b(t, g2);
                                break;
                            case 14:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.k());
                                b(t, g2);
                                break;
                            case 15:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.i());
                                b(t, g2);
                                break;
                            case 16:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.j());
                                b(t, g2);
                                break;
                            case 17:
                                if (!a(t, g2)) {
                                    C0937cd.a((Object) t, (long) (d2 & 1048575), fc.a(a(g2), tbVar));
                                    b(t, g2);
                                    break;
                                } else {
                                    long j3 = (long) (d2 & 1048575);
                                    C0937cd.a((Object) t, j3, Hb.a(C0937cd.f(t, j3), fc.a(a(g2), tbVar)));
                                    break;
                                }
                            case 18:
                                fc.f(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 19:
                                fc.c(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 20:
                                fc.a(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 21:
                                fc.b(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 22:
                                fc.e(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 23:
                                fc.d(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 24:
                                fc.l(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 25:
                                fc.k(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 26:
                                if (!f(d2)) {
                                    fc.m(this.p.a(t, (long) (d2 & 1048575)));
                                    break;
                                } else {
                                    fc.o(this.p.a(t, (long) (d2 & 1048575)));
                                    break;
                                }
                            case 27:
                                fc.a(this.p.a(t, (long) (d2 & 1048575)), a(g2), tbVar);
                                break;
                            case 28:
                                fc.n(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 29:
                                fc.h(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 30:
                                List a2 = this.p.a(t, (long) (d2 & 1048575));
                                fc.g(a2);
                                obj2 = Gc.a(o2, a2, c(g2), obj2, xc);
                                break;
                            case 31:
                                fc.j(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 32:
                                fc.i(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 33:
                                fc.q(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 34:
                                fc.p(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 35:
                                fc.f(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 36:
                                fc.c(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 37:
                                fc.a(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 38:
                                fc.b(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 39:
                                fc.e(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 40:
                                fc.d(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 41:
                                fc.l(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 42:
                                fc.k(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 43:
                                fc.h(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 44:
                                List a3 = this.p.a(t, (long) (d2 & 1048575));
                                fc.g(a3);
                                obj2 = Gc.a(o2, a3, c(g2), obj2, xc);
                                break;
                            case 45:
                                fc.j(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 46:
                                fc.i(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 47:
                                fc.q(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 48:
                                fc.p(this.p.a(t, (long) (d2 & 1048575)));
                                break;
                            case 49:
                                long j4 = (long) (d2 & 1048575);
                                fc.b(this.p.a(t, j4), a(g2), tbVar);
                                break;
                            case 50:
                                Object b2 = b(g2);
                                long d3 = (long) (d(g2) & 1048575);
                                Object f2 = C0937cd.f(t, d3);
                                if (f2 == null) {
                                    f2 = this.s.e(b2);
                                    C0937cd.a((Object) t, d3, f2);
                                } else if (this.s.c(f2)) {
                                    Object e3 = this.s.e(b2);
                                    this.s.a(e3, f2);
                                    C0937cd.a((Object) t, d3, e3);
                                    f2 = e3;
                                }
                                this.s.b(f2);
                                this.s.d(b2);
                                throw null;
                            case 51:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Double.valueOf(fc.readDouble()));
                                b(t, o2, g2);
                                break;
                            case 52:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Float.valueOf(fc.readFloat()));
                                b(t, o2, g2);
                                break;
                            case 53:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(fc.n()));
                                b(t, o2, g2);
                                break;
                            case 54:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(fc.p()));
                                b(t, o2, g2);
                                break;
                            case 55:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(fc.d()));
                                b(t, o2, g2);
                                break;
                            case 56:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(fc.c()));
                                b(t, o2, g2);
                                break;
                            case 57:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(fc.b()));
                                b(t, o2, g2);
                                break;
                            case 58:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Boolean.valueOf(fc.a()));
                                b(t, o2, g2);
                                break;
                            case 59:
                                a((Object) t, d2, fc);
                                b(t, o2, g2);
                                break;
                            case 60:
                                if (a(t, o2, g2)) {
                                    long j5 = (long) (d2 & 1048575);
                                    C0937cd.a((Object) t, j5, Hb.a(C0937cd.f(t, j5), fc.b(a(g2), tbVar)));
                                } else {
                                    C0937cd.a((Object) t, (long) (d2 & 1048575), fc.b(a(g2), tbVar));
                                    b(t, g2);
                                }
                                b(t, o2, g2);
                                break;
                            case 61:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) fc.g());
                                b(t, o2, g2);
                                break;
                            case 62:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(fc.f()));
                                b(t, o2, g2);
                                break;
                            case 63:
                                int e4 = fc.e();
                                Nb c3 = c(g2);
                                if (c3 != null) {
                                    if (!c3.a(e4)) {
                                        obj2 = Gc.a(o2, e4, obj2, xc);
                                        break;
                                    }
                                }
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(e4));
                                b(t, o2, g2);
                                break;
                            case 64:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(fc.l()));
                                b(t, o2, g2);
                                break;
                            case 65:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(fc.k()));
                                b(t, o2, g2);
                                break;
                            case 66:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Integer.valueOf(fc.i()));
                                b(t, o2, g2);
                                break;
                            case 67:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), (Object) Long.valueOf(fc.j()));
                                b(t, o2, g2);
                                break;
                            case 68:
                                C0937cd.a((Object) t, (long) (d2 & 1048575), fc.a(a(g2), tbVar));
                                b(t, o2, g2);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = xc.a();
                                }
                                if (xc.a(obj2, fc)) {
                                    break;
                                } else {
                                    for (int i2 = this.m; i2 < this.n; i2++) {
                                        a((Object) t, this.l[i2], (UB) obj2, xc);
                                    }
                                    if (obj2 != null) {
                                        xc.b((Object) t, obj2);
                                    }
                                    return;
                                }
                        }
                    } else if (o2 == Integer.MAX_VALUE) {
                        for (int i3 = this.m; i3 < this.n; i3++) {
                            a((Object) t, this.l[i3], (UB) obj2, xc);
                        }
                        if (obj2 != null) {
                            xc.b((Object) t, obj2);
                        }
                        return;
                    } else {
                        if (!this.h) {
                            obj = null;
                        } else {
                            obj = vbVar.a(tbVar, this.g, o2);
                        }
                        if (obj != null) {
                            vbVar.a(fc, obj, tbVar, vbVar.b(t), obj2, xc);
                            throw null;
                        }
                        xc.a(fc);
                        if (obj2 == null) {
                            obj2 = xc.e(t);
                        }
                        if (!xc.a(obj2, fc)) {
                            if (obj2 != null) {
                                xc.b((Object) t, obj2);
                            }
                            return;
                        }
                    }
                } finally {
                    for (int i4 = this.m; i4 < this.n; i4++) {
                        a((Object) t, this.l[i4], (UB) obj2, xc);
                    }
                    if (obj2 != null) {
                        xc.b((Object) t, obj2);
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
    private final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, com.google.android.gms.internal.measurement.Ta r30) throws java.io.IOException {
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
            com.google.android.gms.internal.measurement.Ob r11 = (com.google.android.gms.internal.measurement.Ob) r11
            boolean r12 = r11.K()
            r13 = 1
            if (r12 != 0) goto L_0x0036
            int r12 = r11.size()
            if (r12 != 0) goto L_0x002c
            r12 = 10
            goto L_0x002d
        L_0x002c:
            int r12 = r12 << r13
        L_0x002d:
            com.google.android.gms.internal.measurement.Ob r11 = r11.d(r12)
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
            com.google.android.gms.internal.measurement.Ec r1 = r0.a(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
        L_0x005f:
            if (r4 >= r5) goto L_0x0422
            int r8 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r9 = r7.a
            if (r2 != r9) goto L_0x0422
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.c
            r11.add(r8)
            goto L_0x005f
        L_0x007f:
            if (r6 != r10) goto L_0x00a3
            com.google.android.gms.internal.measurement.ec r11 = (com.google.android.gms.internal.measurement.C0950ec) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x008a:
            if (r1 >= r2) goto L_0x009a
            int r1 = com.google.android.gms.internal.measurement.Ua.b(r3, r1, r7)
            long r4 = r7.b
            long r4 = com.google.android.gms.internal.measurement.C0989kb.a(r4)
            r11.h(r4)
            goto L_0x008a
        L_0x009a:
            if (r1 != r2) goto L_0x009e
            goto L_0x0423
        L_0x009e:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x00a3:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.ec r11 = (com.google.android.gms.internal.measurement.C0950ec) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.b(r3, r4, r7)
            long r8 = r7.b
            long r8 = com.google.android.gms.internal.measurement.C0989kb.a(r8)
            r11.h(r8)
        L_0x00b4:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.Ua.b(r3, r4, r7)
            long r8 = r7.b
            long r8 = com.google.android.gms.internal.measurement.C0989kb.a(r8)
            r11.h(r8)
            goto L_0x00b4
        L_0x00cc:
            if (r6 != r10) goto L_0x00f0
            com.google.android.gms.internal.measurement.Jb r11 = (com.google.android.gms.internal.measurement.Jb) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x00d7:
            if (r1 >= r2) goto L_0x00e7
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r4 = r7.a
            int r4 = com.google.android.gms.internal.measurement.C0989kb.g(r4)
            r11.c(r4)
            goto L_0x00d7
        L_0x00e7:
            if (r1 != r2) goto L_0x00eb
            goto L_0x0423
        L_0x00eb:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x00f0:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.Jb r11 = (com.google.android.gms.internal.measurement.Jb) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = com.google.android.gms.internal.measurement.C0989kb.g(r4)
            r11.c(r4)
        L_0x0101:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = com.google.android.gms.internal.measurement.C0989kb.g(r4)
            r11.c(r4)
            goto L_0x0101
        L_0x0119:
            if (r6 != r10) goto L_0x0120
            int r2 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r11, r7)
            goto L_0x0131
        L_0x0120:
            if (r6 != 0) goto L_0x0422
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r11
            r7 = r30
            int r2 = com.google.android.gms.internal.measurement.Ua.a(r2, r3, r4, r5, r6, r7)
        L_0x0131:
            com.google.android.gms.internal.measurement.Gb r1 = (com.google.android.gms.internal.measurement.Gb) r1
            com.google.android.gms.internal.measurement._c r3 = r1.zzahz
            com.google.android.gms.internal.measurement._c r4 = com.google.android.gms.internal.measurement._c.c()
            if (r3 != r4) goto L_0x013c
            r3 = 0
        L_0x013c:
            com.google.android.gms.internal.measurement.Nb r4 = r0.c(r8)
            com.google.android.gms.internal.measurement.Xc<?, ?> r5 = r0.q
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.measurement.Gc.a(r6, r11, r4, r3, r5)
            com.google.android.gms.internal.measurement._c r3 = (com.google.android.gms.internal.measurement._c) r3
            if (r3 == 0) goto L_0x014e
            r1.zzahz = r3
        L_0x014e:
            r1 = r2
            goto L_0x0423
        L_0x0151:
            if (r6 != r10) goto L_0x0422
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x01a4
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x019f
            if (r4 != 0) goto L_0x0167
            com.google.android.gms.internal.measurement.Ya r4 = com.google.android.gms.internal.measurement.Ya.a
            r11.add(r4)
            goto L_0x016f
        L_0x0167:
            com.google.android.gms.internal.measurement.Ya r6 = com.google.android.gms.internal.measurement.Ya.a(r3, r1, r4)
            r11.add(r6)
        L_0x016e:
            int r1 = r1 + r4
        L_0x016f:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r4 = r7.a
            if (r4 < 0) goto L_0x019a
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0195
            if (r4 != 0) goto L_0x018d
            com.google.android.gms.internal.measurement.Ya r4 = com.google.android.gms.internal.measurement.Ya.a
            r11.add(r4)
            goto L_0x016f
        L_0x018d:
            com.google.android.gms.internal.measurement.Ya r6 = com.google.android.gms.internal.measurement.Ya.a(r3, r1, r4)
            r11.add(r6)
            goto L_0x016e
        L_0x0195:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x019a:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.b()
            throw r1
        L_0x019f:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x01a4:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.b()
            throw r1
        L_0x01a9:
            if (r6 != r10) goto L_0x0422
            com.google.android.gms.internal.measurement.Ec r1 = r0.a(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r11
            r28 = r30
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0423
        L_0x01c3:
            if (r6 != r10) goto L_0x0422
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x0216
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0211
            if (r6 != 0) goto L_0x01de
            r11.add(r1)
            goto L_0x01e9
        L_0x01de:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.Hb.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
        L_0x01e8:
            int r4 = r4 + r6
        L_0x01e9:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x020c
            if (r6 != 0) goto L_0x0201
            r11.add(r1)
            goto L_0x01e9
        L_0x0201:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.google.android.gms.internal.measurement.Hb.a
            r8.<init>(r3, r4, r6, r9)
            r11.add(r8)
            goto L_0x01e8
        L_0x020c:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.b()
            throw r1
        L_0x0211:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.b()
            throw r1
        L_0x0216:
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0271
            if (r6 != 0) goto L_0x0224
            r11.add(r1)
            goto L_0x0237
        L_0x0224:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C0958fd.a(r3, r4, r8)
            if (r9 == 0) goto L_0x026c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.Hb.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
        L_0x0236:
            r4 = r8
        L_0x0237:
            if (r4 >= r5) goto L_0x0422
            int r6 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r6, r7)
            int r6 = r7.a
            if (r6 < 0) goto L_0x0267
            if (r6 != 0) goto L_0x024f
            r11.add(r1)
            goto L_0x0237
        L_0x024f:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.measurement.C0958fd.a(r3, r4, r8)
            if (r9 == 0) goto L_0x0262
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.google.android.gms.internal.measurement.Hb.a
            r9.<init>(r3, r4, r6, r10)
            r11.add(r9)
            goto L_0x0236
        L_0x0262:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.i()
            throw r1
        L_0x0267:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.b()
            throw r1
        L_0x026c:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.i()
            throw r1
        L_0x0271:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.b()
            throw r1
        L_0x0276:
            r1 = 0
            if (r6 != r10) goto L_0x029e
            com.google.android.gms.internal.measurement.Wa r11 = (com.google.android.gms.internal.measurement.Wa) r11
            int r2 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r4 = r7.a
            int r4 = r4 + r2
        L_0x0282:
            if (r2 >= r4) goto L_0x0295
            int r2 = com.google.android.gms.internal.measurement.Ua.b(r3, r2, r7)
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
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x029e:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.Wa r11 = (com.google.android.gms.internal.measurement.Wa) r11
            int r4 = com.google.android.gms.internal.measurement.Ua.b(r3, r4, r7)
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
            int r6 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r8 = r7.a
            if (r2 != r8) goto L_0x0422
            int r4 = com.google.android.gms.internal.measurement.Ua.b(r3, r6, r7)
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
            com.google.android.gms.internal.measurement.Jb r11 = (com.google.android.gms.internal.measurement.Jb) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x02d8:
            if (r1 >= r2) goto L_0x02e4
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1)
            r11.c(r4)
            int r1 = r1 + 4
            goto L_0x02d8
        L_0x02e4:
            if (r1 != r2) goto L_0x02e8
            goto L_0x0423
        L_0x02e8:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x02ed:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.Jb r11 = (com.google.android.gms.internal.measurement.Jb) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r18, r19)
            r11.c(r1)
        L_0x02f8:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4)
            r11.c(r1)
            goto L_0x02f8
        L_0x030c:
            if (r6 != r10) goto L_0x032c
            com.google.android.gms.internal.measurement.ec r11 = (com.google.android.gms.internal.measurement.C0950ec) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0317:
            if (r1 >= r2) goto L_0x0323
            long r4 = com.google.android.gms.internal.measurement.Ua.b(r3, r1)
            r11.h(r4)
            int r1 = r1 + 8
            goto L_0x0317
        L_0x0323:
            if (r1 != r2) goto L_0x0327
            goto L_0x0423
        L_0x0327:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x032c:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.ec r11 = (com.google.android.gms.internal.measurement.C0950ec) r11
            long r8 = com.google.android.gms.internal.measurement.Ua.b(r18, r19)
            r11.h(r8)
        L_0x0337:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            long r8 = com.google.android.gms.internal.measurement.Ua.b(r3, r4)
            r11.h(r8)
            goto L_0x0337
        L_0x034b:
            if (r6 != r10) goto L_0x0353
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r11, r7)
            goto L_0x0423
        L_0x0353:
            if (r6 != 0) goto L_0x0422
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r11
            r26 = r30
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r21, r22, r23, r24, r25, r26)
            goto L_0x0423
        L_0x0365:
            if (r6 != r10) goto L_0x0385
            com.google.android.gms.internal.measurement.ec r11 = (com.google.android.gms.internal.measurement.C0950ec) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x0370:
            if (r1 >= r2) goto L_0x037c
            int r1 = com.google.android.gms.internal.measurement.Ua.b(r3, r1, r7)
            long r4 = r7.b
            r11.h(r4)
            goto L_0x0370
        L_0x037c:
            if (r1 != r2) goto L_0x0380
            goto L_0x0423
        L_0x0380:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x0385:
            if (r6 != 0) goto L_0x0422
            com.google.android.gms.internal.measurement.ec r11 = (com.google.android.gms.internal.measurement.C0950ec) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.b(r3, r4, r7)
            long r8 = r7.b
            r11.h(r8)
        L_0x0392:
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            int r1 = com.google.android.gms.internal.measurement.Ua.b(r3, r4, r7)
            long r8 = r7.b
            r11.h(r8)
            goto L_0x0392
        L_0x03a6:
            if (r6 != r10) goto L_0x03c5
            com.google.android.gms.internal.measurement.Cb r11 = (com.google.android.gms.internal.measurement.Cb) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03b1:
            if (r1 >= r2) goto L_0x03bd
            float r4 = com.google.android.gms.internal.measurement.Ua.d(r3, r1)
            r11.a(r4)
            int r1 = r1 + 4
            goto L_0x03b1
        L_0x03bd:
            if (r1 != r2) goto L_0x03c0
            goto L_0x0423
        L_0x03c0:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x03c5:
            if (r6 != r9) goto L_0x0422
            com.google.android.gms.internal.measurement.Cb r11 = (com.google.android.gms.internal.measurement.Cb) r11
            float r1 = com.google.android.gms.internal.measurement.Ua.d(r18, r19)
            r11.a(r1)
        L_0x03d0:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            float r1 = com.google.android.gms.internal.measurement.Ua.d(r3, r4)
            r11.a(r1)
            goto L_0x03d0
        L_0x03e4:
            if (r6 != r10) goto L_0x0403
            com.google.android.gms.internal.measurement.pb r11 = (com.google.android.gms.internal.measurement.C1019pb) r11
            int r1 = com.google.android.gms.internal.measurement.Ua.a(r3, r4, r7)
            int r2 = r7.a
            int r2 = r2 + r1
        L_0x03ef:
            if (r1 >= r2) goto L_0x03fb
            double r4 = com.google.android.gms.internal.measurement.Ua.c(r3, r1)
            r11.a(r4)
            int r1 = r1 + 8
            goto L_0x03ef
        L_0x03fb:
            if (r1 != r2) goto L_0x03fe
            goto L_0x0423
        L_0x03fe:
            com.google.android.gms.internal.measurement.Rb r1 = com.google.android.gms.internal.measurement.Rb.a()
            throw r1
        L_0x0403:
            if (r6 != r13) goto L_0x0422
            com.google.android.gms.internal.measurement.pb r11 = (com.google.android.gms.internal.measurement.C1019pb) r11
            double r8 = com.google.android.gms.internal.measurement.Ua.c(r18, r19)
            r11.a(r8)
        L_0x040e:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0423
            int r4 = com.google.android.gms.internal.measurement.Ua.a(r3, r1, r7)
            int r6 = r7.a
            if (r2 != r6) goto L_0x0423
            double r8 = com.google.android.gms.internal.measurement.Ua.c(r3, r4)
            r11.a(r8)
            goto L_0x040e
        L_0x0422:
            r1 = r4
        L_0x0423:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C1043tc.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.measurement.Ta):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i2, int i3, int i4, long j2, Ta ta) throws IOException {
        Unsafe unsafe = b;
        Object b2 = b(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.s.c(object)) {
            Object e2 = this.s.e(b2);
            this.s.a(e2, object);
            unsafe.putObject(t, j2, e2);
        }
        this.s.d(b2);
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
    private final int a(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, Ta ta) throws IOException {
        int i10;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i11 = i2;
        int i12 = i4;
        int i13 = i5;
        int i14 = i6;
        long j3 = j2;
        int i15 = i9;
        Ta ta2 = ta;
        Unsafe unsafe = b;
        long j4 = (long) (this.c[i15 + 2] & 1048575);
        switch (i8) {
            case 51:
                if (i14 == 1) {
                    unsafe.putObject(t2, j3, Double.valueOf(Ua.c(bArr, i2)));
                    break;
                }
                break;
            case 52:
                if (i14 == 5) {
                    unsafe.putObject(t2, j3, Float.valueOf(Ua.d(bArr, i2)));
                    break;
                }
                break;
            case 53:
            case 54:
                if (i14 == 0) {
                    i10 = Ua.b(bArr2, i11, ta2);
                    unsafe.putObject(t2, j3, Long.valueOf(ta2.b));
                    break;
                }
                break;
            case 55:
            case 62:
                if (i14 == 0) {
                    i10 = Ua.a(bArr2, i11, ta2);
                    unsafe.putObject(t2, j3, Integer.valueOf(ta2.a));
                    break;
                }
                break;
            case 56:
            case 65:
                if (i14 == 1) {
                    unsafe.putObject(t2, j3, Long.valueOf(Ua.b(bArr, i2)));
                    break;
                }
                break;
            case 57:
            case 64:
                if (i14 == 5) {
                    unsafe.putObject(t2, j3, Integer.valueOf(Ua.a(bArr, i2)));
                    break;
                }
                break;
            case 58:
                if (i14 == 0) {
                    i10 = Ua.b(bArr2, i11, ta2);
                    unsafe.putObject(t2, j3, Boolean.valueOf(ta2.b != 0));
                    break;
                }
                break;
            case 59:
                if (i14 == 2) {
                    int a2 = Ua.a(bArr2, i11, ta2);
                    int i16 = ta2.a;
                    if (i16 == 0) {
                        unsafe.putObject(t2, j3, "");
                    } else if ((i7 & 536870912) == 0 || C0958fd.a(bArr2, a2, a2 + i16)) {
                        unsafe.putObject(t2, j3, new String(bArr2, a2, i16, Hb.a));
                        a2 += i16;
                    } else {
                        throw Rb.i();
                    }
                    unsafe.putInt(t2, j4, i13);
                    return a2;
                }
                break;
            case 60:
                if (i14 == 2) {
                    int a3 = Ua.a(a(i15), bArr2, i11, i3, ta2);
                    Object object = unsafe.getInt(t2, j4) == i13 ? unsafe.getObject(t2, j3) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j3, ta2.c);
                    } else {
                        unsafe.putObject(t2, j3, Hb.a(object, ta2.c));
                    }
                    unsafe.putInt(t2, j4, i13);
                    return a3;
                }
                break;
            case 61:
                if (i14 == 2) {
                    i10 = Ua.e(bArr2, i11, ta2);
                    unsafe.putObject(t2, j3, ta2.c);
                    break;
                }
                break;
            case 63:
                if (i14 == 0) {
                    int a4 = Ua.a(bArr2, i11, ta2);
                    int i17 = ta2.a;
                    Nb c2 = c(i15);
                    if (c2 == null || c2.a(i17)) {
                        unsafe.putObject(t2, j3, Integer.valueOf(i17));
                        i10 = a4;
                        break;
                    } else {
                        e((Object) t).a(i12, (Object) Long.valueOf((long) i17));
                        return a4;
                    }
                }
                break;
            case 66:
                if (i14 == 0) {
                    i10 = Ua.a(bArr2, i11, ta2);
                    unsafe.putObject(t2, j3, Integer.valueOf(C0989kb.g(ta2.a)));
                    break;
                }
                break;
            case 67:
                if (i14 == 0) {
                    i10 = Ua.b(bArr2, i11, ta2);
                    unsafe.putObject(t2, j3, Long.valueOf(C0989kb.a(ta2.b)));
                    break;
                }
                break;
            case 68:
                if (i14 == 3) {
                    i10 = Ua.a(a(i15), bArr, i2, i3, (i12 & -8) | 4, ta);
                    Object object2 = unsafe.getInt(t2, j4) == i13 ? unsafe.getObject(t2, j3) : null;
                    if (object2 != null) {
                        unsafe.putObject(t2, j3, Hb.a(object2, ta2.c));
                        break;
                    } else {
                        unsafe.putObject(t2, j3, ta2.c);
                        break;
                    }
                }
                break;
        }
    }

    private final Ec a(int i2) {
        int i3 = (i2 / 3) << 1;
        Ec ec = (Ec) this.d[i3];
        if (ec != null) {
            return ec;
        }
        Ec a2 = Ac.a().a((Class) this.d[i3 + 1]);
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
    public final int a(T t, byte[] r32, int i2, int i3, int i4, Ta ta) throws IOException {
        Unsafe unsafe;
        int i5;
        T t2;
        C1043tc tcVar;
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
        Ta ta2;
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
        Ta ta3;
        ? r124;
        int i26;
        ? r125;
        ? r126;
        Ta ta4;
        int i27;
        ? r127;
        ? r128;
        Ta ta5;
        C1043tc tcVar2 = this;
        T t4 = t;
        ? r129 = r32;
        int i28 = i3;
        int i29 = i4;
        Ta ta6 = ta;
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
                    i10 = Ua.a((int) r0, (byte[]) r129, i35, ta6);
                    r5 = ta6.a;
                } else {
                    r5 = r0;
                    i10 = i35;
                }
                int i36 = r5 >>> 3;
                int i37 = r5 & 7;
                if (i36 > i31) {
                    i11 = tcVar2.a(i36, i32 / 3);
                } else {
                    i11 = tcVar2.g(i36);
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
                            ta2 = ta;
                            if (ta2.d != C1042tb.b()) {
                                i15 = i20;
                                if (ta2.d.a(this.g, i15) == null) {
                                    i16 = Ua.a((int) r7, (byte[]) r32, i6, i3, e((Object) t), ta);
                                    t4 = t;
                                    r122 = r32;
                                    i28 = i3;
                                    i29 = i5;
                                    r33 = r7;
                                    tcVar2 = this;
                                    i17 = i15;
                                    i34 = i14;
                                    i18 = i13;
                                    i19 = i12;
                                    r123 = r122;
                                    r34 = r33;
                                } else {
                                    b bVar = (b) t;
                                    bVar.p();
                                    C1060wb<Object> wbVar = bVar.zzaic;
                                    throw new NoSuchMethodError();
                                }
                            } else {
                                t3 = t;
                            }
                        } else {
                            t3 = t;
                            ta2 = ta;
                        }
                        int i39 = i20;
                        i30 = Ua.a((int) r7, (byte[]) r32, i6, i3, e((Object) t), ta);
                        r12 = r32;
                        i28 = i3;
                        r3 = r7;
                        tcVar2 = this;
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
                        tcVar = this;
                        t2 = t;
                        r35 = r7;
                        i7 = i14;
                        i8 = i12;
                    }
                } else {
                    int[] iArr = tcVar2.c;
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
                                ta3 = ta;
                                i25 = i10;
                                if (i37 == 1) {
                                    C0937cd.a((Object) t4, j3, Ua.c(r1210, i25));
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
                                ta3 = ta;
                                i25 = i10;
                                if (i37 == 5) {
                                    C0937cd.a((Object) t4, j4, Ua.d(r1211, i25));
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
                                Ta ta7 = ta;
                                i25 = i10;
                                if (i37 == 0) {
                                    int b2 = Ua.b(r1212, i25, ta7);
                                    unsafe2.putLong(t, j5, ta7.b);
                                    i33 |= i44;
                                    i26 = b2;
                                    int i46 = r8;
                                    i32 = i24;
                                    i31 = i23;
                                    ta6 = ta7;
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
                                ta3 = ta;
                                i25 = i10;
                                if (i37 == 0) {
                                    i26 = Ua.a(r1214, i25, ta3);
                                    unsafe2.putInt(t4, j6, ta3.a);
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
                                ta3 = ta;
                                if (i37 == 1) {
                                    i22 = i34;
                                    i25 = i10;
                                    unsafe2.putLong(t, j7, Ua.b(r1215, i10));
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
                                ta4 = ta;
                                if (i37 == 5) {
                                    unsafe2.putInt(t4, j8, Ua.a(r1216, i10));
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
                                ta4 = ta;
                                if (i37 == 0) {
                                    int b3 = Ua.b(r1217, i10, ta4);
                                    C0937cd.a((Object) t4, j9, ta4.b != 0);
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
                                ta4 = ta;
                                if (i37 == 2) {
                                    if ((i42 & 536870912) == 0) {
                                        i30 = Ua.c(r1219, i10, ta4);
                                    } else {
                                        i30 = Ua.d(r1219, i10, ta4);
                                    }
                                    unsafe2.putObject(t4, j10, ta4.c);
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
                                ta4 = ta;
                                if (i37 != 2) {
                                    int i48 = i3;
                                    r8 = r82;
                                    break;
                                } else {
                                    i27 = i3;
                                    i30 = Ua.a(tcVar2.a(i24), (byte[]) r1220, i10, i27, ta4);
                                    if ((i33 & i44) != 0) {
                                        unsafe2.putObject(t4, j11, Hb.a(unsafe2.getObject(t4, j11), ta4.c));
                                        r8 = r82;
                                        r127 = r1220;
                                        break;
                                    } else {
                                        unsafe2.putObject(t4, j11, ta4.c);
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
                                ta3 = ta;
                                if (i37 == 2) {
                                    i26 = Ua.e(r1221, i10, ta3);
                                    unsafe2.putObject(t4, j12, ta3.c);
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
                                ta3 = ta;
                                if (i37 == 0) {
                                    i26 = Ua.a(r1222, i10, ta3);
                                    int i49 = ta3.a;
                                    Nb c2 = tcVar2.c(i24);
                                    if (c2 != null && !c2.a(i49)) {
                                        e((Object) t).a((int) r8, (Object) Long.valueOf((long) i49));
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
                                ta3 = ta;
                                if (i37 == 0) {
                                    i26 = Ua.a(r1223, i10, ta3);
                                    unsafe2.putInt(t4, j14, C0989kb.g(ta3.a));
                                    r128 = r1223;
                                    break;
                                }
                                break;
                            case 16:
                                Ta ta8 = ta;
                                i24 = i38;
                                i23 = i36;
                                ? r83 = r20;
                                if (i37 != 0) {
                                    ? r1224 = r32;
                                    Ta ta9 = ta8;
                                    r8 = r83;
                                    break;
                                } else {
                                    long j15 = j2;
                                    ? r1225 = r32;
                                    int b4 = Ua.b(r1225, i10, ta8);
                                    ta3 = ta8;
                                    unsafe2.putLong(t, j15, C0989kb.a(ta8.b));
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
                                    Ta ta10 = ta;
                                    break;
                                } else {
                                    int i50 = i38;
                                    int i51 = i36;
                                    ? r84 = r20;
                                    i30 = Ua.a(tcVar2.a(i38), (byte[]) r32, i10, i3, (i36 << 3) | 4, ta);
                                    if ((i33 & i44) == 0) {
                                        ta5 = ta;
                                        unsafe2.putObject(t4, j2, ta5.c);
                                    } else {
                                        ta5 = ta;
                                        unsafe2.putObject(t4, j2, Hb.a(unsafe2.getObject(t4, j2), ta5.c));
                                    }
                                    i33 |= i44;
                                    r12 = r32;
                                    i28 = i3;
                                    r3 = r84;
                                    i32 = i50;
                                    i31 = i51;
                                    i29 = i4;
                                    ta6 = ta5;
                                    break;
                                }
                            default:
                                ? r1227 = r32;
                                Ta ta11 = ta;
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
                        Ta ta12 = ta6;
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
                                i16 = a(t, (byte[]) r32, i53, i3, (int) r86, i55, i37, i54, (long) i42, i41, j17, ta);
                                if (i16 != i56) {
                                    tcVar2 = this;
                                    t4 = t;
                                    r123 = r32;
                                    i28 = i3;
                                    i29 = i4;
                                    ta2 = ta;
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
                                    i16 = a(t, (byte[]) r32, i21, i3, (int) r262, i20, i57, i58, i41, j18, i13, ta);
                                    if (i16 != i21) {
                                        i15 = i20;
                                        tcVar2 = this;
                                        t4 = t;
                                        r122 = r32;
                                        i28 = i3;
                                        i29 = i4;
                                        ta2 = ta;
                                        r33 = r262;
                                        i17 = i15;
                                        i34 = i14;
                                        i18 = i13;
                                        i19 = i12;
                                        r123 = r122;
                                        r34 = r33;
                                    }
                                } else if (i57 == 2) {
                                    a(t, (byte[]) r32, i21, i3, i13, j18, ta);
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
                            i30 = Ua.a((int) r7, (byte[]) r32, i6, i3, e((Object) t), ta);
                            r12 = r32;
                            i28 = i3;
                            r3 = r7;
                            tcVar2 = this;
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
                            Ob ob = (Ob) unsafe2.getObject(t4, j17);
                            if (!ob.K()) {
                                int size = ob.size();
                                ob = ob.d(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t4, j17, ob);
                            }
                            int i59 = i52;
                            int i60 = i33;
                            i30 = Ua.a(tcVar2.a(i54), r86, r32, i53, i3, ob, ta);
                            i29 = i4;
                            i31 = i59;
                            r3 = r86;
                            i32 = i54;
                            ta6 = ta12;
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
                        i30 = Ua.a((int) r7, (byte[]) r32, i6, i3, e((Object) t), ta);
                        r12 = r32;
                        i28 = i3;
                        r3 = r7;
                        tcVar2 = this;
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
                tcVar = tcVar2;
                i6 = i30;
                i7 = i34;
                i8 = i61;
                i9 = -1;
            }
        }
        if (i7 != i9) {
            unsafe.putInt(t2, (long) i7, i8);
        }
        _c _cVar = null;
        for (int i62 = tcVar.m; i62 < tcVar.n; i62++) {
            tcVar.a((Object) t2, tcVar.l[i62], (UB) _cVar, tcVar.q);
            _cVar = _cVar;
        }
        if (_cVar != null) {
            tcVar.q.b((Object) t2, _cVar);
        }
        if (i5 == 0) {
            if (i6 != i3) {
                throw Rb.h();
            }
        } else if (i6 > i3 || r35 != i5) {
            throw Rb.h();
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
    public final void a(T t, byte[] r29, int i2, int i3, Ta ta) throws IOException {
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
        C1043tc tcVar = this;
        T t2 = t;
        ? r122 = r29;
        int i13 = i3;
        Ta ta2 = ta;
        if (tcVar.j) {
            Unsafe unsafe2 = b;
            int i14 = -1;
            int i15 = i2;
            int i16 = -1;
            int i17 = 0;
            while (i15 < i13) {
                int i18 = i15 + 1;
                ? r0 = r122[i15];
                if (r0 < 0) {
                    i4 = Ua.a((int) r0, (byte[]) r122, i18, ta2);
                    r17 = ta2.a;
                } else {
                    r17 = r0;
                    i4 = i18;
                }
                int i19 = r17 >>> 3;
                int i20 = r17 & 7;
                if (i19 > i16) {
                    i5 = tcVar.a(i19, i17 / 3);
                } else {
                    i5 = tcVar.g(i19);
                }
                int i21 = i5;
                if (i21 == i14) {
                    i6 = i19;
                    i8 = i4;
                    unsafe = unsafe2;
                    i7 = 0;
                } else {
                    int i22 = tcVar.c[i21 + 1];
                    int i23 = (267386880 & i22) >>> 20;
                    long j2 = (long) (1048575 & i22);
                    if (i23 <= 17) {
                        boolean z = true;
                        switch (i23) {
                            case 0:
                                long j3 = j2;
                                i10 = i21;
                                if (i20 == 1) {
                                    C0937cd.a((Object) t2, j3, Ua.c(r122, i4));
                                    break;
                                }
                                break;
                            case 1:
                                long j4 = j2;
                                i10 = i21;
                                if (i20 == 5) {
                                    C0937cd.a((Object) t2, j4, Ua.d(r122, i4));
                                    i11 = i4 + 4;
                                    break;
                                }
                                break;
                            case 2:
                            case 3:
                                long j5 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i12 = Ua.b(r122, i4, ta2);
                                    unsafe2.putLong(t, j5, ta2.b);
                                    break;
                                }
                                break;
                            case 4:
                            case 11:
                                long j6 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i11 = Ua.a(r122, i4, ta2);
                                    unsafe2.putInt(t2, j6, ta2.a);
                                    break;
                                }
                                break;
                            case 5:
                            case 14:
                                long j7 = j2;
                                if (i20 == 1) {
                                    i10 = i21;
                                    unsafe2.putLong(t, j7, Ua.b(r122, i4));
                                    break;
                                }
                                break;
                            case 6:
                            case 13:
                                long j8 = j2;
                                if (i20 == 5) {
                                    unsafe2.putInt(t2, j8, Ua.a(r122, i4));
                                    i15 = i4 + 4;
                                    break;
                                }
                                break;
                            case 7:
                                long j9 = j2;
                                if (i20 == 0) {
                                    int b2 = Ua.b(r122, i4, ta2);
                                    if (ta2.b == 0) {
                                        z = false;
                                    }
                                    C0937cd.a((Object) t2, j9, z);
                                    i15 = b2;
                                    break;
                                }
                                break;
                            case 8:
                                long j10 = j2;
                                if (i20 == 2) {
                                    if ((536870912 & i22) == 0) {
                                        i15 = Ua.c(r122, i4, ta2);
                                    } else {
                                        i15 = Ua.d(r122, i4, ta2);
                                    }
                                    unsafe2.putObject(t2, j10, ta2.c);
                                    break;
                                }
                                break;
                            case 9:
                                long j11 = j2;
                                if (i20 == 2) {
                                    i15 = Ua.a(tcVar.a(i21), (byte[]) r122, i4, i13, ta2);
                                    Object object = unsafe2.getObject(t2, j11);
                                    if (object != null) {
                                        unsafe2.putObject(t2, j11, Hb.a(object, ta2.c));
                                        break;
                                    } else {
                                        unsafe2.putObject(t2, j11, ta2.c);
                                        break;
                                    }
                                }
                                break;
                            case 10:
                                long j12 = j2;
                                if (i20 == 2) {
                                    i15 = Ua.e(r122, i4, ta2);
                                    unsafe2.putObject(t2, j12, ta2.c);
                                    break;
                                }
                                break;
                            case 12:
                                long j13 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i11 = Ua.a(r122, i4, ta2);
                                    unsafe2.putInt(t2, j13, ta2.a);
                                    break;
                                }
                                break;
                            case 15:
                                long j14 = j2;
                                i10 = i21;
                                if (i20 == 0) {
                                    i11 = Ua.a(r122, i4, ta2);
                                    unsafe2.putInt(t2, j14, C0989kb.g(ta2.a));
                                    break;
                                }
                                break;
                            case 16:
                                if (i20 == 0) {
                                    i12 = Ua.b(r122, i4, ta2);
                                    i10 = i21;
                                    unsafe2.putLong(t, j2, C0989kb.a(ta2.b));
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
                            a2 = a(t, (byte[]) r29, i4, i3, (int) r17, i19, i24, i7, j15, i23, j2, ta);
                        } else {
                            long j16 = j2;
                            int i26 = i20;
                            i6 = i19;
                            i9 = i4;
                            unsafe = unsafe2;
                            int i27 = i23;
                            if (i27 == 50) {
                                if (i26 == 2) {
                                    a(t, (byte[]) r29, i9, i3, i7, j16, ta);
                                    throw null;
                                }
                                i8 = i9;
                            } else {
                                a2 = a(t, (byte[]) r29, i9, i3, (int) r17, i6, i26, i22, i27, j16, i7, ta);
                            }
                        }
                        i8 = a2;
                    } else if (i20 == 2) {
                        Ob ob = (Ob) unsafe2.getObject(t2, j2);
                        if (!ob.K()) {
                            int size = ob.size();
                            ob = ob.d(size == 0 ? 10 : size << 1);
                            unsafe2.putObject(t2, j2, ob);
                        }
                        int i28 = i21;
                        i15 = Ua.a(tcVar.a(i21), r17, r29, i4, i3, ob, ta);
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
                a2 = Ua.a((int) r17, (byte[]) r29, i8, i3, e((Object) t), ta);
                tcVar = this;
                t2 = t;
                r12 = r29;
                i13 = i3;
                ta2 = ta;
                unsafe2 = unsafe;
                i17 = i7;
                i16 = i6;
                i14 = -1;
                r122 = r12;
            }
            if (i15 != i13) {
                throw Rb.h();
            }
            return;
        }
        int i29 = i13;
        a(t, (byte[]) r29, i2, i3, 0, ta);
    }

    private final <UT, UB> UB a(Object obj, int i2, UB ub, Xc<UT, UB> xc) {
        int i3 = this.c[i2];
        Object f2 = C0937cd.f(obj, (long) (d(i2) & 1048575));
        if (f2 == null) {
            return ub;
        }
        Nb c2 = c(i2);
        if (c2 == null) {
            return ub;
        }
        a(i2, i3, this.s.b(f2), c2, ub, xc);
        throw null;
    }

    private final <K, V, UT, UB> UB a(int i2, int i3, Map<K, V> map, Nb nb, UB ub, Xc<UT, UB> xc) {
        this.s.d(b(i2));
        throw null;
    }

    private static boolean a(Object obj, int i2, Ec ec) {
        return ec.d(C0937cd.f(obj, (long) (i2 & 1048575)));
    }

    private static void a(int i2, Object obj, C1050ud udVar) throws IOException {
        if (obj instanceof String) {
            udVar.a(i2, (String) obj);
        } else {
            udVar.a(i2, (Ya) obj);
        }
    }

    private final void a(Object obj, int i2, Fc fc) throws IOException {
        if (f(i2)) {
            C0937cd.a(obj, (long) (i2 & 1048575), (Object) fc.h());
        } else if (this.i) {
            C0937cd.a(obj, (long) (i2 & 1048575), (Object) fc.readString());
        } else {
            C0937cd.a(obj, (long) (i2 & 1048575), (Object) fc.g());
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
            int d2 = d(i2);
            long j2 = (long) (d2 & 1048575);
            switch ((d2 & 267386880) >>> 20) {
                case 0:
                    return C0937cd.e(t, j2) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                case 1:
                    return C0937cd.d(t, j2) != 0.0f;
                case 2:
                    return C0937cd.b(t, j2) != 0;
                case 3:
                    return C0937cd.b(t, j2) != 0;
                case 4:
                    return C0937cd.a((Object) t, j2) != 0;
                case 5:
                    return C0937cd.b(t, j2) != 0;
                case 6:
                    return C0937cd.a((Object) t, j2) != 0;
                case 7:
                    return C0937cd.c(t, j2);
                case 8:
                    Object f2 = C0937cd.f(t, j2);
                    if (f2 instanceof String) {
                        return !((String) f2).isEmpty();
                    }
                    if (f2 instanceof Ya) {
                        return !Ya.a.equals(f2);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return C0937cd.f(t, j2) != null;
                case 10:
                    return !Ya.a.equals(C0937cd.f(t, j2));
                case 11:
                    return C0937cd.a((Object) t, j2) != 0;
                case 12:
                    return C0937cd.a((Object) t, j2) != 0;
                case 13:
                    return C0937cd.a((Object) t, j2) != 0;
                case 14:
                    return C0937cd.b(t, j2) != 0;
                case 15:
                    return C0937cd.a((Object) t, j2) != 0;
                case 16:
                    return C0937cd.b(t, j2) != 0;
                case 17:
                    return C0937cd.f(t, j2) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int e2 = e(i2);
            return (C0937cd.a((Object) t, (long) (e2 & 1048575)) & (1 << (e2 >>> 20))) != 0;
        }
    }

    private final boolean a(T t, int i2, int i3) {
        return C0937cd.a((Object) t, (long) (e(i3) & 1048575)) == i2;
    }

    private final int a(int i2, int i3) {
        if (i2 < this.e || i2 > this.f) {
            return -1;
        }
        return b(i2, i3);
    }
}
