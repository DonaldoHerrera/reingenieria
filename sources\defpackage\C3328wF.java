package defpackage;

/* renamed from: wF reason: default package and case insensitive filesystem */
/* compiled from: GenericGFPoly */
final class C3328wF {
    private final C3308vF a;
    private final int[] b;

    C3328wF(C3308vF vFVar, int[] iArr) {
        if (iArr.length != 0) {
            this.a = vFVar;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.b = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.b = new int[]{0};
                return;
            }
            this.b = new int[(length - i)];
            int[] iArr2 = this.b;
            System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    public int[] a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.b.length - 1;
    }

    /* access modifiers changed from: 0000 */
    public boolean c() {
        return this.b[0] == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(b() * 8);
        for (int b2 = b(); b2 >= 0; b2--) {
            int a2 = a(b2);
            if (a2 != 0) {
                if (a2 < 0) {
                    sb.append(" - ");
                    a2 = -a2;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (b2 == 0 || a2 != 1) {
                    int c = this.a.c(a2);
                    if (c == 0) {
                        sb.append('1');
                    } else if (c == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(c);
                    }
                }
                if (b2 != 0) {
                    if (b2 == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(b2);
                    }
                }
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public int a(int i) {
        int[] iArr = this.b;
        return iArr[(iArr.length - 1) - i];
    }

    /* access modifiers changed from: 0000 */
    public C3328wF[] b(C3328wF wFVar) {
        if (!this.a.equals(wFVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!wFVar.c()) {
            C3328wF b2 = this.a.b();
            int b3 = this.a.b(wFVar.a(wFVar.b()));
            C3328wF wFVar2 = b2;
            C3328wF wFVar3 = this;
            while (wFVar3.b() >= wFVar.b() && !wFVar3.c()) {
                int b4 = wFVar3.b() - wFVar.b();
                int c = this.a.c(wFVar3.a(wFVar3.b()), b3);
                C3328wF a2 = wFVar.a(b4, c);
                wFVar2 = wFVar2.a(this.a.b(b4, c));
                wFVar3 = wFVar3.a(a2);
            }
            return new C3328wF[]{wFVar2, wFVar3};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: 0000 */
    public C3328wF c(C3328wF wFVar) {
        if (!this.a.equals(wFVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (c() || wFVar.c()) {
            return this.a.b();
        } else {
            int[] iArr = this.b;
            int length = iArr.length;
            int[] iArr2 = wFVar.b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i = 0; i < length; i++) {
                int i2 = iArr[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    int i4 = i + i3;
                    iArr3[i4] = C3308vF.a(iArr3[i4], this.a.c(i2, iArr2[i3]));
                }
            }
            return new C3328wF(this.a, iArr3);
        }
    }

    /* access modifiers changed from: 0000 */
    public C3328wF a(C3328wF wFVar) {
        if (!this.a.equals(wFVar.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (c()) {
            return wFVar;
        } else {
            if (wFVar.c()) {
                return this;
            }
            int[] iArr = this.b;
            int[] iArr2 = wFVar.b;
            if (iArr.length > iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr2.length];
            int length = iArr2.length - iArr.length;
            System.arraycopy(iArr2, 0, iArr4, 0, length);
            for (int i = length; i < iArr2.length; i++) {
                iArr4[i] = C3308vF.a(iArr[i - length], iArr2[i]);
            }
            return new C3328wF(this.a, iArr4);
        }
    }

    /* access modifiers changed from: 0000 */
    public C3328wF a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.a.b();
        } else {
            int length = this.b.length;
            int[] iArr = new int[(i + length)];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.c(this.b[i3], i2);
            }
            return new C3328wF(this.a, iArr);
        }
    }
}
