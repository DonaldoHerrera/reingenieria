package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: Gnb reason: default package */
/* compiled from: CodedInputStream */
public final class Gnb {
    private final byte[] a;
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private a n;

    /* renamed from: Gnb$a */
    /* compiled from: CodedInputStream */
    private interface a {
        void a();
    }

    private Gnb(InputStream inputStream) {
        this.h = false;
        this.j = BaseClientBuilder.API_PRIORITY_OTHER;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = new byte[4096];
        this.c = 0;
        this.e = 0;
        this.i = 0;
        this.f = inputStream;
        this.b = false;
    }

    private void A() {
        this.c += this.d;
        int i2 = this.i;
        int i3 = this.c;
        int i4 = i2 + i3;
        int i5 = this.j;
        if (i4 > i5) {
            this.d = i4 - i5;
            this.c = i3 - this.d;
            return;
        }
        this.d = 0;
    }

    public static long a(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    public static Gnb a(InputStream inputStream) {
        return new Gnb(inputStream);
    }

    public static int b(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    public boolean b() throws IOException {
        return this.e == this.c && !j(1);
    }

    public boolean c() throws IOException {
        return p() != 0;
    }

    public Fnb d() throws IOException {
        int o = o();
        int i2 = this.c;
        int i3 = this.e;
        if (o <= i2 - i3 && o > 0) {
            Fnb a2 = (!this.b || !this.h) ? Fnb.a(this.a, this.e, o) : new Enb(this.a, i3, o);
            this.e += o;
            return a2;
        } else if (o == 0) {
            return Fnb.a;
        } else {
            return new Vnb(g(o));
        }
    }

    public double e() throws IOException {
        return Double.longBitsToDouble(n());
    }

    public int f() throws IOException {
        return o();
    }

    public int g() throws IOException {
        return m();
    }

    public long h() throws IOException {
        return n();
    }

    public float i() throws IOException {
        return Float.intBitsToFloat(m());
    }

    public int j() throws IOException {
        return o();
    }

    public long k() throws IOException {
        return p();
    }

    public byte l() throws IOException {
        if (this.e == this.c) {
            h(1);
        }
        byte[] bArr = this.a;
        int i2 = this.e;
        this.e = i2 + 1;
        return bArr[i2];
    }

    public int m() throws IOException {
        int i2 = this.e;
        if (this.c - i2 < 4) {
            h(4);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 4;
        return ((bArr[i2 + 3] & 255) << Ascii.CAN) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << Ascii.DLE);
    }

    public long n() throws IOException {
        int i2 = this.e;
        if (this.c - i2 < 8) {
            h(8);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        if (r2[r3] < 0) goto L_0x007c;
     */
    public int o() throws IOException {
        int i2;
        long j2;
        int i3 = this.e;
        int i4 = this.c;
        if (i4 != i3) {
            byte[] bArr = this.a;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.e = i5;
                return b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                byte b3 = b2 ^ (bArr[i5] << 7);
                long j3 = (long) b3;
                if (j3 < 0) {
                    j2 = -128;
                } else {
                    int i7 = i6 + 1;
                    byte b4 = b3 ^ (bArr[i6] << Ascii.SO);
                    long j4 = (long) b4;
                    if (j4 >= 0) {
                        i2 = (int) (16256 ^ j4);
                    } else {
                        i6 = i7 + 1;
                        byte b5 = b4 ^ (bArr[i7] << Ascii.NAK);
                        j3 = (long) b5;
                        if (j3 < 0) {
                            j2 = -2080896;
                        } else {
                            i7 = i6 + 1;
                            byte b6 = bArr[i6];
                            i2 = (int) (((long) (b5 ^ (b6 << Ascii.FS))) ^ 266354560);
                            if (b6 < 0) {
                                i6 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i6 + 1;
                                    if (bArr[i6] < 0) {
                                        i6 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i6 + 1;
                                            if (bArr[i6] < 0) {
                                                i6 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                                this.e = i6;
                                return i2;
                            }
                        }
                    }
                    i6 = i7;
                    this.e = i6;
                    return i2;
                }
                i2 = (int) (j3 ^ j2);
                this.e = i6;
                return i2;
            }
        }
        return (int) q();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b8;
     */
    public long p() throws IOException {
        long j2;
        int i2;
        long j3;
        long j4;
        int i3 = this.e;
        int i4 = this.c;
        if (i4 != i3) {
            byte[] bArr = this.a;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.e = i5;
                return (long) b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                long j5 = (long) (b2 ^ (bArr[i5] << 7));
                if (j5 < 0) {
                    j3 = -128;
                } else {
                    int i7 = i6 + 1;
                    long j6 = j5 ^ ((long) (bArr[i6] << Ascii.SO));
                    if (j6 >= 0) {
                        j4 = 16256;
                    } else {
                        i6 = i7 + 1;
                        j5 = j6 ^ ((long) (bArr[i7] << Ascii.NAK));
                        if (j5 < 0) {
                            j3 = -2080896;
                        } else {
                            i7 = i6 + 1;
                            j6 = j5 ^ (((long) bArr[i6]) << 28);
                            if (j6 >= 0) {
                                j4 = 266354560;
                            } else {
                                i6 = i7 + 1;
                                j5 = j6 ^ (((long) bArr[i7]) << 35);
                                if (j5 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i6 + 1;
                                    j6 = j5 ^ (((long) bArr[i6]) << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i6 = i7 + 1;
                                        j5 = j6 ^ (((long) bArr[i7]) << 49);
                                        if (j5 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            int i8 = i6 + 1;
                                            long j7 = (j5 ^ (((long) bArr[i6]) << 56)) ^ 71499008037633920L;
                                            if (j7 < 0) {
                                                i2 = i8 + 1;
                                            } else {
                                                i2 = i8;
                                            }
                                            j2 = j7;
                                            this.e = i2;
                                            return j2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    j2 = j6 ^ j4;
                    i2 = i7;
                    this.e = i2;
                    return j2;
                }
                j2 = j5 ^ j3;
                this.e = i2;
                return j2;
            }
        }
        return q();
    }

    /* access modifiers changed from: 0000 */
    public long q() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte l2 = l();
            j2 |= ((long) (l2 & Ascii.DEL)) << i2;
            if ((l2 & 128) == 0) {
                return j2;
            }
        }
        throw Onb.f();
    }

    public int r() throws IOException {
        return m();
    }

    public long s() throws IOException {
        return n();
    }

    public int t() throws IOException {
        return b(o());
    }

    public long u() throws IOException {
        return a(p());
    }

    public String v() throws IOException {
        int o = o();
        int i2 = this.c;
        int i3 = this.e;
        String str = "UTF-8";
        if (o <= i2 - i3 && o > 0) {
            String str2 = new String(this.a, i3, o, str);
            this.e += o;
            return str2;
        } else if (o == 0) {
            return "";
        } else {
            return new String(g(o), str);
        }
    }

    public String w() throws IOException {
        byte[] bArr;
        int o = o();
        int i2 = this.e;
        if (o <= this.c - i2 && o > 0) {
            bArr = this.a;
            this.e = i2 + o;
        } else if (o == 0) {
            return "";
        } else {
            bArr = g(o);
            i2 = 0;
        }
        if (C6733job.a(bArr, i2, i2 + o)) {
            return new String(bArr, i2, o, "UTF-8");
        }
        throw Onb.d();
    }

    public int x() throws IOException {
        if (b()) {
            this.g = 0;
            return 0;
        }
        this.g = o();
        if (C7144pob.a(this.g) != 0) {
            return this.g;
        }
        throw Onb.c();
    }

    public int y() throws IOException {
        return o();
    }

    public long z() throws IOException {
        return p();
    }

    static Gnb a(Vnb vnb) {
        Gnb gnb = new Gnb(vnb);
        try {
            gnb.d(vnb.size());
            return gnb;
        } catch (Onb e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private void f(int i2) throws IOException {
        if (this.c - this.e < i2) {
            h(i2);
        }
    }

    private byte[] g(int i2) throws IOException {
        if (i2 > 0) {
            int i3 = this.i;
            int i4 = this.e;
            int i5 = i3 + i4 + i2;
            int i6 = this.j;
            if (i5 > i6) {
                e((i6 - i3) - i4);
                throw Onb.j();
            } else if (i2 < 4096) {
                byte[] bArr = new byte[i2];
                int i7 = this.c - i4;
                System.arraycopy(this.a, i4, bArr, 0, i7);
                this.e = this.c;
                int i8 = i2 - i7;
                f(i8);
                System.arraycopy(this.a, 0, bArr, i7, i8);
                this.e = i8;
                return bArr;
            } else {
                int i9 = this.c;
                this.i = i3 + i9;
                this.e = 0;
                this.c = 0;
                int i10 = i9 - i4;
                int i11 = i2 - i10;
                ArrayList<byte[]> arrayList = new ArrayList<>();
                while (i11 > 0) {
                    byte[] bArr2 = new byte[Math.min(i11, 4096)];
                    int i12 = 0;
                    while (i12 < bArr2.length) {
                        InputStream inputStream = this.f;
                        int read = inputStream == null ? -1 : inputStream.read(bArr2, i12, bArr2.length - i12);
                        if (read != -1) {
                            this.i += read;
                            i12 += read;
                        } else {
                            throw Onb.j();
                        }
                    }
                    i11 -= bArr2.length;
                    arrayList.add(bArr2);
                }
                byte[] bArr3 = new byte[i2];
                System.arraycopy(this.a, i4, bArr3, 0, i10);
                for (byte[] bArr4 : arrayList) {
                    System.arraycopy(bArr4, 0, bArr3, i10, bArr4.length);
                    i10 += bArr4.length;
                }
                return bArr3;
            }
        } else if (i2 == 0) {
            return Nnb.a;
        } else {
            throw Onb.g();
        }
    }

    private void h(int i2) throws IOException {
        if (!j(i2)) {
            throw Onb.j();
        }
    }

    private void i(int i2) throws IOException {
        if (i2 >= 0) {
            int i3 = this.i;
            int i4 = this.e;
            int i5 = i3 + i4 + i2;
            int i6 = this.j;
            if (i5 <= i6) {
                int i7 = this.c;
                int i8 = i7 - i4;
                this.e = i7;
                h(1);
                while (true) {
                    int i9 = i2 - i8;
                    int i10 = this.c;
                    if (i9 > i10) {
                        i8 += i10;
                        this.e = i10;
                        h(1);
                    } else {
                        this.e = i9;
                        return;
                    }
                }
            } else {
                e((i6 - i3) - i4);
                throw Onb.j();
            }
        } else {
            throw Onb.g();
        }
    }

    private boolean j(int i2) throws IOException {
        int i3 = this.e;
        if (i3 + i2 <= this.c) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        } else if (this.i + i3 + i2 > this.j) {
            return false;
        } else {
            a aVar = this.n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f != null) {
                int i4 = this.e;
                if (i4 > 0) {
                    int i5 = this.c;
                    if (i5 > i4) {
                        byte[] bArr = this.a;
                        System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                    }
                    this.i += i4;
                    this.c -= i4;
                    this.e = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.a;
                int i6 = this.c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.a.length) {
                    StringBuilder sb2 = new StringBuilder(102);
                    sb2.append("InputStream#read(byte[]) returned invalid result: ");
                    sb2.append(read);
                    sb2.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb2.toString());
                } else if (read > 0) {
                    this.c += read;
                    if ((this.i + i2) - this.m <= 0) {
                        A();
                        return this.c >= i2 ? true : j(i2);
                    }
                    throw Onb.i();
                }
            }
            return false;
        }
    }

    public void c(int i2) {
        this.j = i2;
        A();
    }

    public void e(int i2) throws IOException {
        int i3 = this.c;
        int i4 = this.e;
        if (i2 > i3 - i4 || i2 < 0) {
            i(i2);
        } else {
            this.e = i4 + i2;
        }
    }

    public void a(int i2) throws Onb {
        if (this.g != i2) {
            throw Onb.b();
        }
    }

    public boolean a(int i2, Hnb hnb) throws IOException {
        int b2 = C7144pob.b(i2);
        if (b2 == 0) {
            long k2 = k();
            hnb.p(i2);
            hnb.n(k2);
            return true;
        } else if (b2 == 1) {
            long n2 = n();
            hnb.p(i2);
            hnb.h(n2);
            return true;
        } else if (b2 == 2) {
            Fnb d2 = d();
            hnb.p(i2);
            hnb.b(d2);
            return true;
        } else if (b2 == 3) {
            hnb.p(i2);
            a(hnb);
            int a2 = C7144pob.a(C7144pob.a(i2), 4);
            a(a2);
            hnb.p(a2);
            return true;
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                int m2 = m();
                hnb.p(i2);
                hnb.l(m2);
                return true;
            }
            throw Onb.e();
        }
    }

    public int d(int i2) throws Onb {
        if (i2 >= 0) {
            int i3 = i2 + this.i + this.e;
            int i4 = this.j;
            if (i3 <= i4) {
                this.j = i3;
                A();
                return i4;
            }
            throw Onb.j();
        }
        throw Onb.g();
    }

    private Gnb(Vnb vnb) {
        this.h = false;
        this.j = BaseClientBuilder.API_PRIORITY_OTHER;
        this.l = 64;
        this.m = 67108864;
        this.n = null;
        this.a = vnb.b;
        this.e = vnb.n();
        this.c = this.e + vnb.size();
        this.i = -this.e;
        this.f = null;
        this.b = true;
    }

    public void a(Hnb hnb) throws IOException {
        int x;
        do {
            x = x();
            if (x == 0) {
                return;
            }
        } while (a(x, hnb));
    }

    public void a(int i2, defpackage.Wnb.a aVar, Inb inb) throws IOException {
        int i3 = this.k;
        if (i3 < this.l) {
            this.k = i3 + 1;
            aVar.a(this, inb);
            a(C7144pob.a(i2, 4));
            this.k--;
            return;
        }
        throw Onb.h();
    }

    public void a(defpackage.Wnb.a aVar, Inb inb) throws IOException {
        int o = o();
        if (this.k < this.l) {
            int d2 = d(o);
            this.k++;
            aVar.a(this, inb);
            a(0);
            this.k--;
            c(d2);
            return;
        }
        throw Onb.h();
    }

    public <T extends Wnb> T a(Ynb<T> ynb, Inb inb) throws IOException {
        int o = o();
        if (this.k < this.l) {
            int d2 = d(o);
            this.k++;
            T t = (Wnb) ynb.a(this, inb);
            a(0);
            this.k--;
            c(d2);
            return t;
        }
        throw Onb.h();
    }

    public static int a(int i2, InputStream inputStream) throws IOException {
        if ((i2 & 128) == 0) {
            return i2;
        }
        int i3 = i2 & 127;
        int i4 = 7;
        while (i4 < 32) {
            int read = inputStream.read();
            if (read != -1) {
                i3 |= (read & 127) << i4;
                if ((read & 128) == 0) {
                    return i3;
                }
                i4 += 7;
            } else {
                throw Onb.j();
            }
        }
        while (i4 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw Onb.j();
            } else if ((read2 & 128) == 0) {
                return i3;
            } else {
                i4 += 7;
            }
        }
        throw Onb.f();
    }

    public int a() {
        int i2 = this.j;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.i + this.e);
    }
}
