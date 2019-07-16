package com.google.android.gms.internal.firebase-perf;

import com.google.android.gms.internal.firebase-perf.C0889sb.c;
import java.io.IOException;
import java.util.Arrays;

public final class Nc {
    private static final Nc a = new Nc(0, new int[0], new Object[0], false);
    private int b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    private Nc() {
        this(0, new int[8], new Object[8], true);
    }

    static Nc a(Nc nc, Nc nc2) {
        int i = nc.b + nc2.b;
        int[] copyOf = Arrays.copyOf(nc.c, i);
        System.arraycopy(nc2.c, 0, copyOf, nc.b, nc2.b);
        Object[] copyOf2 = Arrays.copyOf(nc.d, i);
        System.arraycopy(nc2.d, 0, copyOf2, nc.b, nc2.b);
        return new Nc(i, copyOf, copyOf2, true);
    }

    public static Nc c() {
        return a;
    }

    public final void b(dd ddVar) throws IOException {
        if (this.b != 0) {
            if (ddVar.a() == c.l) {
                for (int i = 0; i < this.b; i++) {
                    a(this.c[i], this.d[i], ddVar);
                }
                return;
            }
            for (int i2 = this.b - 1; i2 >= 0; i2--) {
                a(this.c[i2], this.d[i2], ddVar);
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
            i2 += C0838fb.d(this.c[i3] >>> 3, (Oa) this.d[i3]);
        }
        this.e = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Nc)) {
            return false;
        }
        Nc nc = (Nc) obj;
        int i = this.b;
        if (i == nc.b) {
            int[] iArr = this.c;
            int[] iArr2 = nc.c;
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
                Object[] objArr2 = nc.d;
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

    private Nc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void a() {
        this.f = false;
    }

    public final int b() {
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
                i = C0838fb.e(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 1) {
                i = C0838fb.g(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 2) {
                i = C0838fb.c(i6, (Oa) this.d[i4]);
            } else if (i7 == 3) {
                i = (C0838fb.l(i6) << 1) + ((Nc) this.d[i4]).b();
            } else if (i7 == 5) {
                i = C0838fb.i(i6, ((Integer) this.d[i4]).intValue());
            } else {
                throw new IllegalStateException(Eb.a());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(dd ddVar) throws IOException {
        if (ddVar.a() == c.m) {
            for (int i = this.b - 1; i >= 0; i--) {
                ddVar.a(this.c[i] >>> 3, this.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            ddVar.a(this.c[i2] >>> 3, this.d[i2]);
        }
    }

    private static void a(int i, Object obj, dd ddVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            ddVar.e(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            ddVar.b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            ddVar.a(i2, (Oa) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                ddVar.d(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(Eb.a());
        } else if (ddVar.a() == c.l) {
            ddVar.a(i2);
            ((Nc) obj).b(ddVar);
            ddVar.b(i2);
        } else {
            ddVar.b(i2);
            ((Nc) obj).b(ddVar);
            ddVar.a(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            C0839fc.a(sb, i, String.valueOf(this.c[i2] >>> 3), this.d[i2]);
        }
    }
}
