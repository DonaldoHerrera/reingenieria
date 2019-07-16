package com.google.android.gms.internal.clearcut;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.reflect.Field;
import java.util.Arrays;

final class _a {
    private int A;
    private int B;
    private Field C;
    private Object D;
    private Object E;
    private Object F;
    private final C0738ab a;
    private final Object[] b;
    private Class<?> c;
    /* access modifiers changed from: private */
    public final int d;
    /* access modifiers changed from: private */
    public final int e;
    private final int f;
    private final int g;
    /* access modifiers changed from: private */
    public final int h;
    /* access modifiers changed from: private */
    public final int i;
    /* access modifiers changed from: private */
    public final int j;
    /* access modifiers changed from: private */
    public final int k;
    /* access modifiers changed from: private */
    public final int l;
    /* access modifiers changed from: private */
    public final int m;
    /* access modifiers changed from: private */
    public final int[] n;
    private int o;
    private int p;
    private int q = BaseClientBuilder.API_PRIORITY_OTHER;
    private int r = Integer.MIN_VALUE;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private int x;
    private int y;
    private int z;

    _a(Class<?> cls, String str, Object[] objArr) {
        this.c = cls;
        this.a = new C0738ab(str);
        this.b = objArr;
        this.d = this.a.b();
        this.e = this.a.b();
        int[] iArr = null;
        if (this.e == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.l = 0;
            this.k = 0;
            this.m = 0;
            this.n = null;
            return;
        }
        this.f = this.a.b();
        this.g = this.a.b();
        this.h = this.a.b();
        this.i = this.a.b();
        this.l = this.a.b();
        this.k = this.a.b();
        this.j = this.a.b();
        this.m = this.a.b();
        int b2 = this.a.b();
        if (b2 != 0) {
            iArr = new int[b2];
        }
        this.n = iArr;
        this.o = (this.f << 1) + this.g;
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

    private final Object p() {
        Object[] objArr = this.b;
        int i2 = this.o;
        this.o = i2 + 1;
        return objArr[i2];
    }

    private final boolean q() {
        return (this.d & 1) == 1;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d0, code lost:
        if (q() != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015e, code lost:
        if (r1 != false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        if (q() != false) goto L_0x00d2;
     */
    public final boolean a() {
        int i2;
        Object type;
        boolean z2 = false;
        if (!this.a.a()) {
            return false;
        }
        this.x = this.a.b();
        this.y = this.a.b();
        this.z = this.y & 255;
        int i3 = this.x;
        if (i3 < this.q) {
            this.q = i3;
        }
        int i4 = this.x;
        if (i4 > this.r) {
            this.r = i4;
        }
        if (this.z == C0740ba.MAP.a()) {
            this.s++;
        } else if (this.z >= C0740ba.DOUBLE_LIST.a() && this.z <= C0740ba.GROUP_LIST.a()) {
            this.t++;
        }
        this.w++;
        if (C0747db.a(this.q, this.x, this.w)) {
            this.v = this.x + 1;
            i2 = this.v - this.q;
        } else {
            i2 = this.u + 1;
        }
        this.u = i2;
        if ((this.y & 1024) != 0) {
            int[] iArr = this.n;
            int i5 = this.p;
            this.p = i5 + 1;
            iArr[i5] = this.x;
        }
        this.D = null;
        this.E = null;
        this.F = null;
        if (d()) {
            this.A = this.a.b();
            if (!(this.z == C0740ba.MESSAGE.a() + 51 || this.z == C0740ba.GROUP.a() + 51)) {
                if (this.z == C0740ba.ENUM.a() + 51) {
                }
                return true;
            }
            type = p();
            this.D = type;
            return true;
        }
        this.C = a(this.c, (String) p());
        if (h()) {
            this.B = this.a.b();
        }
        if (this.z == C0740ba.MESSAGE.a() || this.z == C0740ba.GROUP.a()) {
            type = this.C.getType();
            this.D = type;
            return true;
        }
        if (!(this.z == C0740ba.MESSAGE_LIST.a() || this.z == C0740ba.GROUP_LIST.a())) {
            if (this.z != C0740ba.ENUM.a() && this.z != C0740ba.ENUM_LIST.a() && this.z != C0740ba.ENUM_LIST_PACKED.a()) {
                if (this.z == C0740ba.MAP.a()) {
                    this.F = p();
                    if ((this.y & 2048) != 0) {
                        z2 = true;
                    }
                }
                return true;
            }
        }
        type = p();
        this.D = type;
        return true;
        this.E = p();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final int b() {
        return this.x;
    }

    /* access modifiers changed from: 0000 */
    public final int c() {
        return this.z;
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        return this.z > C0740ba.MAP.a();
    }

    /* access modifiers changed from: 0000 */
    public final Field e() {
        int i2 = this.A << 1;
        Object obj = this.b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a2 = a(this.c, (String) obj);
        this.b[i2] = a2;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final Field f() {
        int i2 = (this.A << 1) + 1;
        Object obj = this.b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a2 = a(this.c, (String) obj);
        this.b[i2] = a2;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final Field g() {
        return this.C;
    }

    /* access modifiers changed from: 0000 */
    public final boolean h() {
        return q() && this.z <= C0740ba.GROUP.a();
    }

    /* access modifiers changed from: 0000 */
    public final Field i() {
        int i2 = (this.f << 1) + (this.B / 32);
        Object obj = this.b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field a2 = a(this.c, (String) obj);
        this.b[i2] = a2;
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public final int j() {
        return this.B % 32;
    }

    /* access modifiers changed from: 0000 */
    public final boolean k() {
        return (this.y & 256) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        return (this.y & 512) != 0;
    }

    /* access modifiers changed from: 0000 */
    public final Object m() {
        return this.D;
    }

    /* access modifiers changed from: 0000 */
    public final Object n() {
        return this.E;
    }

    /* access modifiers changed from: 0000 */
    public final Object o() {
        return this.F;
    }
}
