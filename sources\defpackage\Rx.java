package defpackage;

import java.util.Arrays;

/* renamed from: Rx reason: default package */
public final class Rx {
    private static final Rx a = new Rx(0, new int[0], new Object[0], false);
    private int b;
    private int[] c;
    private Object[] d;
    private int e;
    private boolean f;

    private Rx() {
        this(0, new int[8], new Object[8], true);
    }

    static Rx a(Rx rx, Rx rx2) {
        int i = rx.b + rx2.b;
        int[] copyOf = Arrays.copyOf(rx.c, i);
        System.arraycopy(rx2.c, 0, copyOf, rx.b, rx2.b);
        Object[] copyOf2 = Arrays.copyOf(rx.d, i);
        System.arraycopy(rx2.d, 0, copyOf2, rx.b, rx2.b);
        return new Rx(i, copyOf, copyOf2, true);
    }

    public static Rx b() {
        return a;
    }

    static Rx c() {
        return new Rx();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Rx)) {
            return false;
        }
        Rx rx = (Rx) obj;
        int i = this.b;
        if (i == rx.b) {
            int[] iArr = this.c;
            int[] iArr2 = rx.c;
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
                Object[] objArr2 = rx.d;
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

    private Rx(int i, int[] iArr, Object[] objArr, boolean z) {
        this.e = -1;
        this.b = i;
        this.c = iArr;
        this.d = objArr;
        this.f = z;
    }

    public final void a() {
        this.f = false;
    }

    /* access modifiers changed from: 0000 */
    public final void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            C1434jx.a(sb, i, String.valueOf(this.c[i2] >>> 3), this.d[i2]);
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
