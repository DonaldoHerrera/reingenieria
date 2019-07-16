package defpackage;

/* renamed from: Xx reason: default package */
final class Xx {
    private static final Yx a;

    static {
        Yx yx;
        if (!(Ux.a() && Ux.b()) || C0275Wv.a()) {
            yx = new _x();
        } else {
            yx = new C0509by();
        }
        a = yx;
    }

    public static boolean a(byte[] bArr) {
        return a.a(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: private */
    public static int b(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* access modifiers changed from: private */
    public static int b(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static String b(byte[] bArr, int i, int i2) throws C0225Kw {
        return a.b(bArr, i, i2);
    }

    /* access modifiers changed from: private */
    public static int d(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return b(b);
        }
        if (i3 == 1) {
            return b(b, bArr[i]);
        }
        if (i3 == 2) {
            return b((int) b, (int) bArr[i], (int) bArr[i + 1]);
        }
        throw new AssertionError();
    }

    public static boolean a(byte[] bArr, int i, int i2) {
        return a.a(bArr, i, i2);
    }
}
