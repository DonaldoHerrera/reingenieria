package defpackage;

import java.util.Arrays;

/* renamed from: FAb reason: default package */
/* compiled from: SegmentedByteString */
final class FAb extends C7030oAb {
    final transient byte[][] f;
    final transient int[] g;

    FAb(C6825lAb lab, int i) {
        super(null);
        KAb.a(lab.c, 0, (long) i);
        int i2 = 0;
        DAb dAb = lab.b;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = dAb.c;
            int i6 = dAb.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                dAb = dAb.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f = new byte[i4][];
        this.g = new int[(i4 * 2)];
        DAb dAb2 = lab.b;
        int i7 = 0;
        while (i2 < i) {
            this.f[i7] = dAb2.a;
            i2 += dAb2.c - dAb2.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[this.f.length + i7] = dAb2.b;
            dAb2.d = true;
            i7++;
            dAb2 = dAb2.f;
        }
    }

    private C7030oAb w() {
        return new C7030oAb(u());
    }

    private Object writeReplace() {
        return w();
    }

    public String a() {
        return w().a();
    }

    public String b() {
        return w().b();
    }

    public C7030oAb c() {
        return w().c();
    }

    public C7030oAb d() {
        return w().d();
    }

    public C7030oAb e() {
        return w().e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (a(0, r5, 0, f()) != false) goto L_0x0021;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7030oAb) {
            C7030oAb oab = (C7030oAb) obj;
            if (oab.f() == f()) {
            }
        }
        z = false;
        return z;
    }

    public int f() {
        return this.g[this.f.length - 1];
    }

    public C7030oAb g() {
        return w().g();
    }

    public int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int length = this.f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.d = i3;
        return i3;
    }

    public String toString() {
        return w().toString();
    }

    public byte[] u() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    public String v() {
        return w().v();
    }

    private int b(int i) {
        int binarySearch = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    public C7030oAb a(int i, int i2) {
        return w().a(i, i2);
    }

    public byte a(int i) {
        int i2;
        KAb.a((long) this.g[this.f.length - 1], (long) i, 1);
        int b = b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.g[b - 1];
        }
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* access modifiers changed from: 0000 */
    public void a(C6825lAb lab) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            DAb dAb = new DAb(this.f[i], i3, (i3 + i4) - i2, true, false);
            DAb dAb2 = lab.b;
            if (dAb2 == null) {
                dAb.g = dAb;
                dAb.f = dAb;
                lab.b = dAb;
            } else {
                dAb2.g.a(dAb);
            }
            i++;
            i2 = i4;
        }
        lab.c += (long) i2;
    }

    public boolean a(int i, C7030oAb oab, int i2, int i3) {
        int i4;
        if (i < 0 || i > f() - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.g[b - 1];
            }
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!oab.a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > f() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.g[b - 1];
            }
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr2 = this.f;
            if (!KAb.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }
}
