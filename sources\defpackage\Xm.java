package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: Xm reason: default package */
/* compiled from: DefaultExtractorInput */
public final class Xm implements C0313an {
    private final byte[] a = new byte[4096];
    private final Zp b;
    private final long c;
    private long d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public Xm(Zp zp, long j, long j2) {
        this.b = zp;
        this.d = j;
        this.c = j2;
    }

    private void d(int i) {
        if (i != -1) {
            this.d += (long) i;
        }
    }

    private void e(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, C0471ar.a(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int f(int i) {
        int min = Math.min(this.g, i);
        g(min);
        return min;
    }

    private void g(int i) {
        this.g -= i;
        this.f = 0;
        byte[] bArr = this.e;
        int i2 = this.g;
        if (i2 < bArr.length - 524288) {
            bArr = new byte[(i2 + 65536)];
        }
        System.arraycopy(this.e, i, bArr, 0, this.g);
        this.e = bArr;
    }

    public boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int b2 = b(bArr, i, i2);
        while (b2 < i2 && b2 != -1) {
            b2 = a(bArr, i, i2, b2, z);
        }
        d(b2);
        return b2 != -1;
    }

    public void c(int i) throws IOException, InterruptedException {
        b(i, false);
    }

    public long getLength() {
        return this.c;
    }

    public long getPosition() {
        return this.d;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int b2 = b(bArr, i, i2);
        if (b2 == 0) {
            b2 = a(bArr, i, i2, 0, true);
        }
        d(b2);
        return b2;
    }

    public void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        b(bArr, i, i2, false);
    }

    public void a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        a(bArr, i, i2, false);
    }

    public boolean a(int i, boolean z) throws IOException, InterruptedException {
        e(i);
        int i2 = this.g - this.f;
        while (i2 < i) {
            i2 = a(this.e, this.f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.g = this.f + i2;
        }
        this.f += i;
        return true;
    }

    public int b(int i) throws IOException, InterruptedException {
        int f2 = f(i);
        if (f2 == 0) {
            byte[] bArr = this.a;
            f2 = a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        d(f2);
        return f2;
    }

    public boolean b(int i, boolean z) throws IOException, InterruptedException {
        int f2 = f(i);
        while (f2 < i && f2 != -1) {
            f2 = a(this.a, -f2, Math.min(i, this.a.length + f2), f2, z);
        }
        d(f2);
        return f2 != -1;
    }

    public void a(int i) throws IOException, InterruptedException {
        a(i, false);
    }

    public void a() {
        this.f = 0;
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    public long b() {
        return this.d + ((long) this.f);
    }

    private int b(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        g(min);
        return min;
    }
}
