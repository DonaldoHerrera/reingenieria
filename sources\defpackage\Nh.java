package defpackage;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: Nh reason: default package */
/* compiled from: CodedOutputStream */
final class Nh implements Flushable {
    private final byte[] a;
    private final int b;
    private int c = 0;
    private final OutputStream d;

    /* renamed from: Nh$a */
    /* compiled from: CodedOutputStream */
    static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private Nh(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
        this.b = bArr.length;
    }

    public static int a(float f) {
        return 4;
    }

    public static int a(boolean z) {
        return 1;
    }

    public static Nh a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static int c(int i) {
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

    public static int c(int i, int i2) {
        return e(i) + f(i2);
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

    public static int g(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public void b(int i, float f) throws IOException {
        f(i, 5);
        b(f);
    }

    public void d(int i, int i2) throws IOException {
        f(i, 0);
        h(i2);
    }

    public void e(int i, int i2) throws IOException {
        f(i, 0);
        m(i2);
    }

    public void f(long j) throws IOException {
        e(j);
    }

    public void flush() throws IOException {
        if (this.d != null) {
            a();
        }
    }

    public void g(int i, int i2) throws IOException {
        f(i, 0);
        n(i2);
    }

    public void h(int i) throws IOException {
        i(i);
    }

    public void i(int i) throws IOException {
        if (i >= 0) {
            l(i);
        } else {
            e((long) i);
        }
    }

    public void j(int i) throws IOException {
        a((byte) i);
    }

    public void k(int i) throws IOException {
        j(i & 255);
        j((i >> 8) & 255);
        j((i >> 16) & 255);
        j((i >> 24) & 255);
    }

    public void l(int i) throws IOException {
        while ((i & -128) != 0) {
            j((i & 127) | 128);
            i >>>= 7;
        }
        j(i);
    }

    public void m(int i) throws IOException {
        l(g(i));
    }

    public void n(int i) throws IOException {
        l(i);
    }

    public static Nh a(OutputStream outputStream, int i) {
        return new Nh(outputStream, new byte[i]);
    }

    public static int f(int i) {
        return c(i);
    }

    public void c(Jh jh) throws IOException {
        a(jh, 0, jh.b());
    }

    public static int a(int i, float f) {
        return e(i) + a(f);
    }

    public static int d(long j) {
        return c(j);
    }

    public static int e(int i) {
        return c(C1875yj.a(i, 0));
    }

    public void b(int i, long j) throws IOException {
        f(i, 0);
        f(j);
    }

    public void f(int i, int i2) throws IOException {
        l(C1875yj.a(i, i2));
    }

    public static int a(int i, long j) {
        return e(i) + d(j);
    }

    public static int d(int i) {
        return c(g(i));
    }

    public void e(long j) throws IOException {
        while ((-128 & j) != 0) {
            j((((int) j) & 127) | 128);
            j >>>= 7;
        }
        j((int) j);
    }

    public static int a(int i, boolean z) {
        return e(i) + a(z);
    }

    public void b(int i, boolean z) throws IOException {
        f(i, 0);
        b(z);
    }

    public static int a(int i, Jh jh) {
        return e(i) + a(jh);
    }

    public static int a(int i, int i2) {
        return e(i) + a(i2);
    }

    public void b(int i, Jh jh) throws IOException {
        f(i, 2);
        b(jh);
    }

    public static int a(Jh jh) {
        return c(jh.b()) + jh.b();
    }

    public void b(float f) throws IOException {
        k(Float.floatToRawIntBits(f));
    }

    public static int a(int i) {
        return b(i);
    }

    public void b(boolean z) throws IOException {
        j(z ? 1 : 0);
    }

    private void a() throws IOException {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new a();
    }

    public void b(Jh jh) throws IOException {
        l(jh.b());
        c(jh);
    }

    public static int b(int i, int i2) {
        return e(i) + d(i2);
    }

    public static int b(int i) {
        if (i >= 0) {
            return c(i);
        }
        return 10;
    }

    public void a(byte b2) throws IOException {
        if (this.c == this.b) {
            a();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b2;
    }

    public void a(byte[] bArr) throws IOException {
        a(bArr, 0, bArr.length);
    }

    public void a(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.a, i4, i2);
            this.c += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        a();
        if (i7 <= this.b) {
            System.arraycopy(bArr, i6, this.a, 0, i7);
            this.c = i7;
            return;
        }
        this.d.write(bArr, i6, i7);
    }

    public void a(Jh jh, int i, int i2) throws IOException {
        int i3 = this.b;
        int i4 = this.c;
        if (i3 - i4 >= i2) {
            jh.a(this.a, i, i4, i2);
            this.c += i2;
            return;
        }
        int i5 = i3 - i4;
        jh.a(this.a, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.c = this.b;
        a();
        if (i7 <= this.b) {
            jh.a(this.a, i6, 0, i7);
            this.c = i7;
            return;
        }
        InputStream a2 = jh.a();
        long j = (long) i6;
        if (j == a2.skip(j)) {
            while (i7 > 0) {
                int min = Math.min(i7, this.b);
                int read = a2.read(this.a, 0, min);
                if (read == min) {
                    this.d.write(this.a, 0, read);
                    i7 -= read;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }
}
