package defpackage;

import com.google.common.base.Ascii;

/* renamed from: Zx reason: default package */
final class Zx {
    /* access modifiers changed from: private */
    public static void b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* access modifiers changed from: private */
    public static boolean d(byte b) {
        return b >= 0;
    }

    /* access modifiers changed from: private */
    public static boolean e(byte b) {
        return b < -32;
    }

    /* access modifiers changed from: private */
    public static boolean f(byte b) {
        return b < -16;
    }

    private static boolean g(byte b) {
        return b > -65;
    }

    /* access modifiers changed from: private */
    public static void b(byte b, byte b2, char[] cArr, int i) throws C0225Kw {
        if (b < -62 || g(b2)) {
            throw C0225Kw.i();
        }
        cArr[i] = (char) (((b & Ascii.US) << 6) | (b2 & 63));
    }

    /* access modifiers changed from: private */
    public static void b(byte b, byte b2, byte b3, char[] cArr, int i) throws C0225Kw {
        if (g(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || g(b3)))) {
            throw C0225Kw.i();
        }
        cArr[i] = (char) (((b & Ascii.SI) << Ascii.FF) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* access modifiers changed from: private */
    public static void b(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C0225Kw {
        if (g(b2) || (((b << Ascii.FS) + (b2 + 112)) >> 30) != 0 || g(b3) || g(b4)) {
            throw C0225Kw.i();
        }
        byte b5 = ((b & 7) << Ascii.DC2) | ((b2 & 63) << Ascii.FF) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((b5 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b5 & 1023) + Ascii.NUL);
    }
}
