package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C0755ga.e;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.ub reason: case insensitive filesystem */
public final class C0797ub {
    private static final C0797ub a = new C0797ub(0, new int[0], new Object[0], false);
    private int b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    private C0797ub() {
        this(0, new int[8], new Object[8], true);
    }

    private C0797ub(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    static C0797ub a(C0797ub ubVar, C0797ub ubVar2) {
        int i = ubVar.b + ubVar2.b;
        int[] copyOf = Arrays.copyOf(ubVar.c, i);
        System.arraycopy(ubVar2.c, 0, copyOf, ubVar.b, ubVar2.b);
        Object[] copyOf2 = Arrays.copyOf(ubVar.d, i);
        System.arraycopy(ubVar2.d, 0, copyOf2, ubVar.b, ubVar2.b);
        return new C0797ub(i, copyOf, copyOf2, true);
    }

    private static void a(int i, Object obj, Ob ob) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ob.e(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            ob.b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            ob.a(i2, (A) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                ob.b(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(C0773ma.c());
        } else if (ob.a() == e.l) {
            ob.b(i2);
            ((C0797ub) obj).b(ob);
            ob.a(i2);
        } else {
            ob.a(i2);
            ((C0797ub) obj).b(ob);
            ob.b(i2);
        }
    }

    public static C0797ub b() {
        return a;
    }

    static C0797ub c() {
        return new C0797ub();
    }

    public final int a() {
        int i;
        int i2 = this.e;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.b; i4++) {
            int i5 = this.c[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 == 0) {
                i = M.e(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 1) {
                i = M.g(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 2) {
                i = M.c(i6, (A) this.d[i4]);
            } else if (i7 == 3) {
                i = (M.e(i6) << 1) + ((C0797ub) this.d[i4]).a();
            } else if (i7 == 5) {
                i = M.i(i6, ((Integer) this.d[i4]).intValue());
            } else {
                throw new IllegalStateException(C0773ma.c());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, Object obj) {
        if (this.f) {
            int i2 = this.b;
            if (i2 == this.c.length) {
                int i3 = this.b + (i2 < 4 ? 8 : i2 >> 1);
                this.c = Arrays.copyOf(this.c, i3);
                this.d = Arrays.copyOf(this.d, i3);
            }
            int[] iArr = this.c;
            int i4 = this.b;
            iArr[i4] = i;
            this.d[i4] = obj;
            this.b = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: 0000 */
    public final void a(Ob ob) throws IOException {
        if (ob.a() == e.m) {
            for (int i = this.b - 1; i >= 0; i--) {
                ob.a(this.c[i] >>> 3, this.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            ob.a(this.c[i2] >>> 3, this.d[i2]);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            Oa.a(sb, i, String.valueOf(this.c[i2] >>> 3), this.d[i2]);
        }
    }

    public final void b(Ob ob) throws IOException {
        if (this.b != 0) {
            if (ob.a() == e.l) {
                for (int i = 0; i < this.b; i++) {
                    a(this.c[i], this.d[i], ob);
                }
                return;
            }
            for (int i2 = this.b - 1; i2 >= 0; i2--) {
                a(this.c[i2], this.d[i2], ob);
            }
        }
    }

    public final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            i2 += M.d(this.c[i3] >>> 3, (A) this.d[i3]);
        }
        this.e = i2;
        return i2;
    }

    public final void e() {
        this.f = false;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0797ub)) {
            return false;
        }
        C0797ub ubVar = (C0797ub) obj;
        int i = this.b;
        if (i == ubVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = ubVar.c;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                } else if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                Object[] objArr = this.d;
                Object[] objArr2 = ubVar.d;
                int i3 = this.b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        z2 = true;
                        break;
                    } else if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        break;
                    } else {
                        i4++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i + 527) * 31;
        int[] iArr = this.c;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.d;
        for (int i7 = 0; i7 < this.b; i7++) {
            i3 = (i3 * 31) + objArr[i7].hashCode();
        }
        return i6 + i3;
    }
}
