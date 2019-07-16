package defpackage;

import com.google.common.base.Ascii;
import java.nio.charset.Charset;

/* renamed from: Pq reason: default package */
/* compiled from: ParsableByteArray */
public final class Pq {
    public byte[] a;
    private int b;
    private int c;

    public Pq() {
        this.a = C0471ar.f;
    }

    public long A() {
        int i;
        int i2;
        long j = (long) this.a[this.b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b2 = this.a[this.b + i];
                if ((b2 & 192) == 128) {
                    j = (j << 6) | ((long) (b2 & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    public void B() {
        this.b = 0;
        this.c = 0;
    }

    public void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public int b() {
        return this.a.length;
    }

    public void c(int i) {
        a(b() < i ? new byte[i] : this.a, i);
    }

    public int d() {
        return this.c;
    }

    public void e(int i) {
        C1852xq.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void f(int i) {
        e(this.b + i);
    }

    public double g() {
        return Double.longBitsToDouble(p());
    }

    public int h() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << Ascii.CAN;
        int i3 = this.b;
        this.b = i3 + 1;
        byte b2 = i2 | ((bArr[i3] & 255) << Ascii.DLE);
        int i4 = this.b;
        this.b = i4 + 1;
        byte b3 = b2 | ((bArr[i4] & 255) << 8);
        int i5 = this.b;
        this.b = i5 + 1;
        return (bArr[i5] & 255) | b3;
    }

    public int i() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = ((bArr[i] & 255) << Ascii.CAN) >> 8;
        int i3 = this.b;
        this.b = i3 + 1;
        byte b2 = i2 | ((bArr[i3] & 255) << 8);
        int i4 = this.b;
        this.b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public String j() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !C0471ar.g((int) this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.b;
        String a2 = C0471ar.a(bArr2, i3, i - i3);
        this.b = i;
        int i4 = this.b;
        int i5 = this.c;
        if (i4 == i5) {
            return a2;
        }
        if (this.a[i4] == 13) {
            this.b = i4 + 1;
            if (this.b == i5) {
                return a2;
            }
        }
        byte[] bArr3 = this.a;
        int i6 = this.b;
        if (bArr3[i6] == 10) {
            this.b = i6 + 1;
        }
        return a2;
    }

    public int k() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        byte b2 = bArr[i] & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        byte b3 = b2 | ((bArr[i2] & 255) << 8);
        int i3 = this.b;
        this.b = i3 + 1;
        byte b4 = b3 | ((bArr[i3] & 255) << Ascii.DLE);
        int i4 = this.b;
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | b4;
    }

    public long l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.b;
        this.b = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i5 = this.b;
        this.b = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i6 = this.b;
        this.b = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i7 = this.b;
        this.b = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        int i8 = this.b;
        this.b = i8 + 1;
        return j7 | ((255 & ((long) bArr[i8])) << 56);
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.b;
        this.b = i4 + 1;
        return j3 | ((255 & ((long) bArr[i4])) << 24);
    }

    public int n() {
        int k = k();
        if (k >= 0) {
            return k;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }

    public int o() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        byte b2 = bArr[i] & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | b2;
    }

    public long p() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.b;
        this.b = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.b;
        this.b = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.b;
        this.b = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.b;
        this.b = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.b;
        this.b = i8 + 1;
        return j7 | (255 & ((long) bArr[i8]));
    }

    public String q() {
        if (a() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String a2 = C0471ar.a(bArr, i2, i - i2);
        this.b = i;
        int i3 = this.b;
        if (i3 < this.c) {
            this.b = i3 + 1;
        }
        return a2;
    }

    public short r() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.b;
        this.b = i3 + 1;
        return (short) ((bArr[i3] & 255) | i2);
    }

    public int s() {
        return (t() << 21) | (t() << 14) | (t() << 7) | t();
    }

    public int t() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public int u() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.b;
        this.b = i3 + 1;
        byte b2 = (bArr[i3] & 255) | i2;
        this.b += 2;
        return b2;
    }

    public long v() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.b;
        this.b = i4 + 1;
        return j3 | (255 & ((long) bArr[i4]));
    }

    public int w() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << Ascii.DLE;
        int i3 = this.b;
        this.b = i3 + 1;
        byte b2 = i2 | ((bArr[i3] & 255) << 8);
        int i4 = this.b;
        this.b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public int x() {
        int h = h();
        if (h >= 0) {
            return h;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(h);
        throw new IllegalStateException(sb.toString());
    }

    public long y() {
        long p = p();
        if (p >= 0) {
            return p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Top bit not zero: ");
        sb.append(p);
        throw new IllegalStateException(sb.toString());
    }

    public int z() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.b;
        this.b = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }

    public void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public String b(int i) {
        return a(i, Charset.forName("UTF-8"));
    }

    public int c() {
        return this.b;
    }

    public void d(int i) {
        C1852xq.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public int f() {
        return this.a[this.b] & 255;
    }

    public Pq(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public char e() {
        byte[] bArr = this.a;
        int i = this.b;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public int a() {
        return this.c - this.b;
    }

    public Pq(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public void a(Oq oq, int i) {
        a(oq.a, 0, i);
        oq.b(0);
    }

    public void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public Pq(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public String a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.b + i) - 1;
        String a2 = C0471ar.a(this.a, this.b, (i2 >= this.c || this.a[i2] != 0) ? i : i - 1);
        this.b += i;
        return a2;
    }
}
