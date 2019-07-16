package defpackage;

/* renamed from: vF reason: default package and case insensitive filesystem */
/* compiled from: GenericGF */
public final class C3308vF {
    public static final C3308vF a = new C3308vF(4201, 4096, 1);
    public static final C3308vF b = new C3308vF(1033, 1024, 1);
    public static final C3308vF c = new C3308vF(67, 64, 1);
    public static final C3308vF d = new C3308vF(19, 16, 1);
    public static final C3308vF e = new C3308vF(285, 256, 0);
    public static final C3308vF f;
    public static final C3308vF g;
    public static final C3308vF h = c;
    private final int[] i;
    private final int[] j;
    private final C3328wF k;
    private final C3328wF l;
    private final int m;
    private final int n;
    private final int o;

    static {
        C3308vF vFVar = new C3308vF(301, 256, 1);
        f = vFVar;
        g = vFVar;
    }

    public C3308vF(int i2, int i3, int i4) {
        this.n = i2;
        this.m = i3;
        this.o = i4;
        this.i = new int[i3];
        this.j = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.i[i6] = i5;
            i5 <<= 1;
            if (i5 >= i3) {
                i5 = (i5 ^ i2) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.j[this.i[i7]] = i7;
        }
        this.k = new C3328wF(this, new int[]{0});
        this.l = new C3328wF(this, new int[]{1});
    }

    static int a(int i2, int i3) {
        return i2 ^ i3;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2) {
        return this.i[i2];
    }

    /* access modifiers changed from: 0000 */
    public C3328wF b() {
        return this.k;
    }

    /* access modifiers changed from: 0000 */
    public int c(int i2) {
        if (i2 != 0) {
            return this.j[i2];
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.n));
        sb.append(',');
        sb.append(this.m);
        sb.append(')');
        return sb.toString();
    }

    public int a() {
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public C3328wF b(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        } else if (i3 == 0) {
            return this.k;
        } else {
            int[] iArr = new int[(i2 + 1)];
            iArr[0] = i3;
            return new C3328wF(this, iArr);
        }
    }

    /* access modifiers changed from: 0000 */
    public int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        return iArr[(iArr2[i2] + iArr2[i3]) % (this.m - 1)];
    }

    /* access modifiers changed from: 0000 */
    public int b(int i2) {
        if (i2 != 0) {
            return this.i[(this.m - this.j[i2]) - 1];
        }
        throw new ArithmeticException();
    }
}
