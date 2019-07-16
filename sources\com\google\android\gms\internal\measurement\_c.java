package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.Gb.d;
import java.io.IOException;
import java.util.Arrays;

public final class _c {
    private static final _c a = new _c(0, new int[0], new Object[0], false);
    private int b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    private _c() {
        this(0, new int[8], new Object[8], true);
    }

    static _c a(_c _cVar, _c _cVar2) {
        int i = _cVar.b + _cVar2.b;
        int[] copyOf = Arrays.copyOf(_cVar.c, i);
        System.arraycopy(_cVar2.c, 0, copyOf, _cVar.b, _cVar2.b);
        Object[] copyOf2 = Arrays.copyOf(_cVar.d, i);
        System.arraycopy(_cVar2.d, 0, copyOf2, _cVar.b, _cVar2.b);
        return new _c(i, copyOf, copyOf2, true);
    }

    public static _c c() {
        return a;
    }

    static _c d() {
        return new _c();
    }

    public final void b(C1050ud udVar) throws IOException {
        if (this.b != 0) {
            if (udVar.a() == d.l) {
                for (int i = 0; i < this.b; i++) {
                    a(this.c[i], this.d[i], udVar);
                }
                return;
            }
            for (int i2 = this.b - 1; i2 >= 0; i2--) {
                a(this.c[i2], this.d[i2], udVar);
            }
        }
    }

    public final int e() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            i2 += C1007nb.d(this.c[i3] >>> 3, (Ya) this.d[i3]);
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
        if (obj == null || !(obj instanceof _c)) {
            return false;
        }
        _c _cVar = (_c) obj;
        int i = this.b;
        if (i == _cVar.b) {
            int[] iArr = this.c;
            int[] iArr2 = _cVar.c;
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
                Object[] objArr2 = _cVar.d;
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

    private _c(int i, int[] iArr, Object[] objArr, boolean z) {
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
                i = C1007nb.e(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 1) {
                i = C1007nb.g(i6, ((Long) this.d[i4]).longValue());
            } else if (i7 == 2) {
                i = C1007nb.c(i6, (Ya) this.d[i4]);
            } else if (i7 == 3) {
                i = (C1007nb.e(i6) << 1) + ((_c) this.d[i4]).b();
            } else if (i7 == 5) {
                i = C1007nb.i(i6, ((Integer) this.d[i4]).intValue());
            } else {
                throw new IllegalStateException(Rb.f());
            }
            i3 += i;
        }
        this.e = i3;
        return i3;
    }

    /* access modifiers changed from: 0000 */
    public final void a(C1050ud udVar) throws IOException {
        if (udVar.a() == d.m) {
            for (int i = this.b - 1; i >= 0; i--) {
                udVar.a(this.c[i] >>> 3, this.d[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            udVar.a(this.c[i2] >>> 3, this.d[i2]);
        }
    }

    private static void a(int i, Object obj, C1050ud udVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            udVar.e(i2, ((Long) obj).longValue());
        } else if (i3 == 1) {
            udVar.b(i2, ((Long) obj).longValue());
        } else if (i3 == 2) {
            udVar.a(i2, (Ya) obj);
        } else if (i3 != 3) {
            if (i3 == 5) {
                udVar.b(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(Rb.f());
        } else if (udVar.a() == d.l) {
            udVar.a(i2);
            ((_c) obj).b(udVar);
            udVar.b(i2);
        } else {
            udVar.b(i2);
            ((_c) obj).b(udVar);
            udVar.a(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            C1031rc.a(sb, i, String.valueOf(this.c[i2] >>> 3), this.d[i2]);
        }
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
}
