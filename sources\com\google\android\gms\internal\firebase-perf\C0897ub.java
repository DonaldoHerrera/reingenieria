package com.google.android.gms.internal.firebase-perf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.firebase-perf.ub reason: case insensitive filesystem */
public final class C0897ub {
    static final Charset a = Charset.forName("UTF-8");
    private static final Charset b = Charset.forName("ISO-8859-1");
    public static final byte[] c;
    private static final ByteBuffer d;
    private static final _a e;

    static {
        byte[] bArr = new byte[0];
        c = bArr;
        d = ByteBuffer.wrap(bArr);
        byte[] bArr2 = c;
        e = _a.a(bArr2, 0, bArr2.length, false);
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    static <T> T a(T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    static boolean a(C0835ec ecVar) {
        return false;
    }

    public static boolean b(byte[] bArr) {
        return Tc.a(bArr);
    }

    public static String c(byte[] bArr) {
        return new String(bArr, a);
    }

    static <T> T a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static int a(byte[] bArr) {
        int length = bArr.length;
        int a2 = a(length, bArr, 0, length);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    static Object a(Object obj, Object obj2) {
        C0826cc f = ((C0835ec) obj).f();
        f.a((C0835ec) obj2);
        return f.a();
    }
}
