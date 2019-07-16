package com.google.android.gms.internal.clearcut;

public final class Tb implements Cloneable {
    private static final Ub a = new Ub();
    private boolean b;
    private int[] c;
    private Ub[] d;
    private int e;

    Tb() {
        this(10);
    }

    private Tb(int i) {
        this.b = false;
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
        int i5 = i2 / 4;
        this.c = new int[i5];
        this.d = new Ub[i5];
        this.e = 0;
    }

    /* access modifiers changed from: 0000 */
    public final Ub a(int i) {
        return this.d[i];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i = this.e;
        Tb tb = new Tb(i);
        System.arraycopy(this.c, 0, tb.c, 0, i);
        for (int i2 = 0; i2 < i; i2++) {
            Ub[] ubArr = this.d;
            if (ubArr[i2] != null) {
                tb.d[i2] = (Ub) ubArr[i2].clone();
            }
        }
        tb.e = i;
        return tb;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tb)) {
            return false;
        }
        Tb tb = (Tb) obj;
        int i = this.e;
        if (i != tb.e) {
            return false;
        }
        int[] iArr = this.c;
        int[] iArr2 = tb.c;
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
            Ub[] ubArr = this.d;
            Ub[] ubArr2 = tb.d;
            int i3 = this.e;
            int i4 = 0;
            while (true) {
                if (i4 >= i3) {
                    z2 = true;
                    break;
                } else if (!ubArr[i4].equals(ubArr2[i4])) {
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
}
