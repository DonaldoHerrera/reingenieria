package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: Hnb reason: default package */
/* compiled from: CodedOutputStream */
public final class Hnb {
    private final byte[] a;
    private final int b;
    private int c;
    private int d = 0;
    private final OutputStream e;

    /* renamed from: Hnb$a */
    /* compiled from: CodedOutputStream */
    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private Hnb(OutputStream outputStream, byte[] bArr) {
        this.e = outputStream;
        this.a = bArr;
        this.c = 0;
        this.b = bArr.length;
    }

    public static int a(double d2) {
        return 8;
    }

    public static int a(float f) {
        return 4;
    }

    public static int a(long j) {
        return 8;
    }

    public static int a(boolean z) {
        return 1;
    }

    public static Hnb a(OutputStream outputStream, int i) {
        return new Hnb(outputStream, new byte[i]);
    }

    public static int b(int i) {
        return 4;
    }

    public static int c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    static int d(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int d(long j) {
        return 8;
    }

    public static int e(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public static int e(long j) {
        return c(g(j));
    }

    public static int f(int i) {
        return 4;
    }

    public static int g(int i) {
        return e(j(i));
    }

    public static long g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public void b(int i, double d2) throws IOException {
        e(i, 1);
        b(d2);
    }

    public void c(int i, Wnb wnb) throws IOException {
        e(i, 2);
        d(wnb);
    }

    public void d(int i, int i2) throws IOException {
        e(i, 0);
        m(i2);
    }

    public void f(int i, int i2) throws IOException {
        e(i, 0);
        s(i2);
    }

    public void h(long j) throws IOException {
        j(j);
    }

    public void i(long j) throws IOException {
        k(j);
    }

    public void j(long j) throws IOException {
        n(((int) j) & 255);
        n(((int) (j >> 8)) & 255);
        n(((int) (j >> 16)) & 255);
        n(((int) (j >> 24)) & 255);
        n(((int) (j >> 32)) & 255);
        n(((int) (j >> 40)) & 255);
        n(((int) (j >> 48)) & 255);
        n(((int) (j >> 56)) & 255);
    }

    public void k(int i) throws IOException {
        m(i);
    }

    public void l(int i) throws IOException {
        o(i);
    }

    public void m(int i) throws IOException {
        if (i >= 0) {
            p(i);
        } else {
            k((long) i);
        }
    }

    public void n(long j) throws IOException {
        k(j);
    }

    public void o(int i) throws IOException {
        n(i & 255);
        n((i >> 8) & 255);
        n((i >> 16) & 255);
        n((i >> 24) & 255);
    }

    public void p(int i) throws IOException {
        while ((i & -128) != 0) {
            n((i & 127) | 128);
            i >>>= 7;
        }
        n(i);
    }

    public void q(int i) throws IOException {
        o(i);
    }

    public void r(int i) throws IOException {
        p(j(i));
    }

    public void s(int i) throws IOException {
        p(i);
    }

    public static int a(int i, double d2) {
        return h(i) + a(d2);
    }

    public static int h(int i) {
        return e(C7144pob.a(i, 0));
    }

    public static int i(int i) {
        return e(i);
    }

    public void e(int i, int i2) throws IOException {
        p(C7144pob.a(i, i2));
    }

    public void k(long j) throws IOException {
        while ((-128 & j) != 0) {
            n((((int) j) & 127) | 128);
            j >>>= 7;
        }
        n((int) j);
    }

    public void l(long j) throws IOException {
        j(j);
    }

    public void n(int i) throws IOException {
        a((byte) i);
    }

    public static int a(int i, float f) {
        return h(i) + a(f);
    }

    public static int f(long j) {
        return c(j);
    }

    public void b(int i, float f) throws IOException {
        e(i, 5);
        b(f);
    }

    public void c(int i, int i2) throws IOException {
        e(i, 0);
        k(i2);
    }

    public void d(int i, Wnb wnb) throws IOException {
        e(1, 3);
        f(2, i);
        c(3, wnb);
        e(1, 4);
    }

    public void m(long j) throws IOException {
        k(g(j));
    }

    public static int a(int i, boolean z) {
        return h(i) + a(z);
    }

    public static int a(int i, Wnb wnb) {
        return h(i) + b(wnb);
    }

    public void b(int i, boolean z) throws IOException {
        e(i, 0);
        b(z);
    }

    public void c(Wnb wnb) throws IOException {
        wnb.a(this);
    }

    public static int a(int i, Fnb fnb) {
        return h(i) + a(fnb);
    }

    public static int c(int i) {
        if (i >= 0) {
            return e(i);
        }
        return 10;
    }

    public static int a(int i, int i2) {
        return h(i) + a(i2);
    }

    public void b(int i, Wnb wnb) throws IOException {
        e(i, 3);
        c(wnb);
        e(i, 4);
    }

    public void c(Fnb fnb) throws IOException {
        a(fnb, 0, fnb.size());
    }

    public void d(Wnb wnb) throws IOException {
        p(wnb.c());
        wnb.a(this);
    }

    public static int a(int i, long j) {
        return h(i) + e(j);
    }

    public void c(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return e(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported.", e2);
        }
    }

    public void b(int i, Fnb fnb) throws IOException {
        e(i, 2);
        b(fnb);
    }

    public static int a(Wnb wnb) {
        return wnb.c();
    }

    public void b(int i, long j) throws IOException {
        e(i, 0);
        m(j);
    }

    public static int a(Rnb rnb) {
        int a2 = rnb.a();
        return e(a2) + a2;
    }

    public void b(double d2) throws IOException {
        j(Double.doubleToRawLongBits(d2));
    }

    public static int a(Fnb fnb) {
        return e(fnb.size()) + fnb.size();
    }

    public void b(float f) throws IOException {
        o(Float.floatToRawIntBits(f));
    }

    public static int a(byte[] bArr) {
        return e(bArr.length) + bArr.length;
    }

    public void b(boolean z) throws IOException {
        n(z ? 1 : 0);
    }

    public static int a(int i) {
        return c(i);
    }

    public void b(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        p(bytes.length);
        c(bytes);
    }

    public void a() throws IOException {
        if (this.e != null) {
            b();
        }
    }

    public void a(byte b2) throws IOException {
        if (this.c == this.b) {
            b();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
        this.d++;
    }

    public void b(Fnb fnb) throws IOException {
        p(fnb.size());
        c(fnb);
    }

    public void b(byte[] bArr) throws IOException {
        p(bArr.length);
        c(bArr);
    }

    public static int b(int i, int i2) {
        return h(i) + c(i2);
    }

    public void a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        b();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
        } else {
            this.e.write(bArr, i6, i7);
        }
        this.d += i7;
    }

    public static int b(long j) {
        return c(j);
    }

    public static int b(Wnb wnb) {
        int c2 = wnb.c();
        return e(c2) + c2;
    }

    private void b() throws IOException {
        OutputStream outputStream = this.e;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }

    public void a(Fnb fnb, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            fnb.a(this.a, i, i4, i2);
            this.c += i2;
            this.d += i2;
            return;
        }
        int i5 = i3 - i4;
        fnb.a(this.a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        this.d += i5;
        b();
        if (i7 <= this.b) {
            fnb.a(this.a, i6, 0, i7);
            this.c = i7;
        } else {
            fnb.a(this.e, i6, i7);
        }
        this.d += i7;
    }
}
