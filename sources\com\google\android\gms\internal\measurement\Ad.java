package com.google.android.gms.internal.measurement;

public final class Ad implements Cloneable {
    private static final C1080zd a = new C1080zd();
    private boolean b;
    private int[] c;
    private C1080zd[] d;
    private int e;

    Ad() {
        this(10);
    }

    private static int c(int i) {
        int i2 = i << 2;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        return i2 / 4;
    }

    private final int d(int i) {
        int i2 = this.e - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = this.c[i4];
            if (i5 < i) {
                i3 = i4 + 1;
            } else if (i5 <= i) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* access modifiers changed from: 0000 */
    public final C1080zd a(int i) {
        int d2 = d(i);
        if (d2 >= 0) {
            C1080zd[] zdVarArr = this.d;
            if (zdVarArr[d2] != a) {
                return zdVarArr[d2];
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final C1080zd b(int i) {
        return this.d[i];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.e;
        Ad ad = new Ad(i);
        System.arraycopy(this.c, 0, ad.c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            C1080zd[] zdVarArr = this.d;
            if (zdVarArr[i2] != null) {
                ad.d[i2] = (C1080zd) zdVarArr[i2].clone();
            }
        }
        ad.e = i;
        return ad;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Ad)) {
            return false;
        }
        Ad ad = (Ad) obj;
        int i = this.e;
        if (i != ad.e) {
            return false;
        }
        int[] iArr = this.c;
        int[] iArr2 = ad.c;
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
            C1080zd[] zdVarArr = this.d;
            C1080zd[] zdVarArr2 = ad.d;
            int i3 = this.e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!zdVarArr[i4].equals(zdVarArr2[i4])) {
                    z2 = false;
                    break;
                } else {
                    i4++;
                }
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (int i2 = 0; i2 < this.e; i2++) {
            i = (((i * 31) + this.c[i2]) * 31) + this.d[i2].hashCode();
        }
        return i;
    }

    public final boolean i() {
        return this.e == 0;
    }

    /* access modifiers changed from: 0000 */
    public final int j() {
        return this.e;
    }

    private Ad(int i) {
        this.b = false;
        int c2 = c(i);
        this.c = new int[c2];
        this.d = new C1080zd[c2];
        this.e = 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(int i, C1080zd zdVar) {
        int d2 = d(i);
        if (d2 >= 0) {
            this.d[d2] = zdVar;
            return;
        }
        int i2 = ~d2;
        if (i2 < this.e) {
            C1080zd[] zdVarArr = this.d;
            if (zdVarArr[i2] == a) {
                this.c[i2] = i;
                zdVarArr[i2] = zdVar;
                return;
            }
        }
        int i3 = this.e;
        if (i3 >= this.c.length) {
            int c2 = c(i3 + 1);
            int[] iArr = new int[c2];
            C1080zd[] zdVarArr2 = new C1080zd[c2];
            int[] iArr2 = this.c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            C1080zd[] zdVarArr3 = this.d;
            System.arraycopy(zdVarArr3, 0, zdVarArr2, 0, zdVarArr3.length);
            this.c = iArr;
            this.d = zdVarArr2;
        }
        int i4 = this.e;
        if (i4 - i2 != 0) {
            int[] iArr3 = this.c;
            int i5 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i5, i4 - i2);
            C1080zd[] zdVarArr4 = this.d;
            System.arraycopy(zdVarArr4, i2, zdVarArr4, i5, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = zdVar;
        this.e++;
    }
}
