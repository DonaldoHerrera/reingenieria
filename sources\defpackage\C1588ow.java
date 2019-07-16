package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ow reason: default package and case insensitive filesystem */
final class C1588ow extends C1433jw {
    private final InputStream f;
    private final byte[] g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private C1557nw n;

    private C1588ow(InputStream inputStream, int i2) {
        super();
        this.m = BaseClientBuilder.API_PRIORITY_OTHER;
        this.n = null;
        C0209Gw.a(inputStream, "input");
        this.f = inputStream;
        this.g = new byte[i2];
        this.h = 0;
        this.j = 0;
        this.l = 0;
    }

    private final byte A() throws IOException {
        if (this.j == this.h) {
            g(1);
        }
        byte[] bArr = this.g;
        int i2 = this.j;
        this.j = i2 + 1;
        return bArr[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    private final int v() throws IOException {
        byte b;
        int i2 = this.j;
        int i3 = this.h;
        if (i3 != i2) {
            byte[] bArr = this.g;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.j = i4;
                return b2;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                byte b3 = b2 ^ (bArr[i4] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i6 = i5 + 1;
                    byte b4 = b3 ^ (bArr[i5] << Ascii.SO);
                    if (b4 >= 0) {
                        b = b4 ^ 16256;
                    } else {
                        i5 = i6 + 1;
                        byte b5 = b4 ^ (bArr[i6] << Ascii.NAK);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            i6 = i5 + 1;
                            byte b6 = bArr[i5];
                            b = (b5 ^ (b6 << Ascii.FS)) ^ 266354560;
                            if (b6 < 0) {
                                i5 = i6 + 1;
                                if (bArr[i6] < 0) {
                                    i6 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i6 + 1;
                                        if (bArr[i6] < 0) {
                                            i6 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i6 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i6;
                }
                this.j = i5;
                return b;
            }
        }
        return (int) u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b4;
     */
    private final long w() throws IOException {
        long j2;
        int i2;
        long j3;
        long j4;
        byte b;
        int i3 = this.j;
        int i4 = this.h;
        if (i4 != i3) {
            byte[] bArr = this.g;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.j = i5;
                return (long) b2;
            } else if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                byte b3 = b2 ^ (bArr[i5] << 7);
                if (b3 < 0) {
                    b = b3 ^ Byte.MIN_VALUE;
                } else {
                    int i7 = i6 + 1;
                    byte b4 = b3 ^ (bArr[i6] << Ascii.SO);
                    if (b4 >= 0) {
                        i2 = i7;
                        j2 = (long) (b4 ^ 16256);
                    } else {
                        i6 = i7 + 1;
                        byte b5 = b4 ^ (bArr[i7] << Ascii.NAK);
                        if (b5 < 0) {
                            b = b5 ^ -2080896;
                        } else {
                            long j5 = (long) b5;
                            int i8 = i6 + 1;
                            long j6 = j5 ^ (((long) bArr[i6]) << 28);
                            if (j6 >= 0) {
                                j4 = 266354560;
                            } else {
                                int i9 = i8 + 1;
                                long j7 = j6 ^ (((long) bArr[i8]) << 35);
                                if (j7 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i8 = i9 + 1;
                                    j6 = j7 ^ (((long) bArr[i9]) << 42);
                                    if (j6 >= 0) {
                                        j4 = 4363953127296L;
                                    } else {
                                        i9 = i8 + 1;
                                        j7 = j6 ^ (((long) bArr[i8]) << 49);
                                        if (j7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            int i10 = i9 + 1;
                                            long j8 = (j7 ^ (((long) bArr[i9]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                i2 = i10 + 1;
                                            } else {
                                                i2 = i10;
                                            }
                                            j2 = j8;
                                        }
                                    }
                                }
                                j2 = j7 ^ j3;
                            }
                            j2 = j6 ^ j4;
                            i2 = i8;
                        }
                    }
                    this.j = i2;
                    return j2;
                }
                j2 = (long) b;
                this.j = i2;
                return j2;
            }
        }
        return u();
    }

    private final int x() throws IOException {
        int i2 = this.j;
        if (this.h - i2 < 4) {
            g(4);
            i2 = this.j;
        }
        byte[] bArr = this.g;
        this.j = i2 + 4;
        return ((bArr[i2 + 3] & 255) << Ascii.CAN) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << Ascii.DLE);
    }

    private final long y() throws IOException {
        int i2 = this.j;
        if (this.h - i2 < 8) {
            g(8);
            i2 = this.j;
        }
        byte[] bArr = this.g;
        this.j = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    private final void z() {
        this.h += this.i;
        int i2 = this.l;
        int i3 = this.h;
        int i4 = i2 + i3;
        int i5 = this.m;
        if (i4 > i5) {
            this.i = i4 - i5;
            this.h = i3 - this.i;
            return;
        }
        this.i = 0;
    }

    public final double a() throws IOException {
        return Double.longBitsToDouble(y());
    }

    public final float b() throws IOException {
        return Float.intBitsToFloat(x());
    }

    public final String c() throws IOException {
        int v = v();
        if (v > 0) {
            int i2 = this.h;
            int i3 = this.j;
            if (v <= i2 - i3) {
                String str = new String(this.g, i3, v, C0209Gw.a);
                this.j += v;
                return str;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v > this.h) {
            return new String(a(v, false), C0209Gw.a);
        }
        g(v);
        String str2 = new String(this.g, this.j, v, C0209Gw.a);
        this.j += v;
        return str2;
    }

    public final int d() throws IOException {
        if (s()) {
            this.k = 0;
            return 0;
        }
        this.k = v();
        int i2 = this.k;
        if ((i2 >>> 3) != 0) {
            return i2;
        }
        throw C0225Kw.d();
    }

    public final boolean e(int i2) throws IOException {
        int d;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.h - this.j >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.g;
                    int i5 = this.j;
                    this.j = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw C0225Kw.c();
            }
            while (i4 < 10) {
                if (A() < 0) {
                    i4++;
                }
            }
            throw C0225Kw.c();
            return true;
        } else if (i3 == 1) {
            f(8);
            return true;
        } else if (i3 == 2) {
            f(v());
            return true;
        } else if (i3 == 3) {
            do {
                d = d();
                if (d == 0) {
                    break;
                }
            } while (e(d));
            d(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                f(4);
                return true;
            }
            throw C0225Kw.f();
        }
    }

    public final long f() throws IOException {
        return w();
    }

    public final int g() throws IOException {
        return v();
    }

    public final long h() throws IOException {
        return y();
    }

    public final int i() throws IOException {
        return x();
    }

    public final boolean j() throws IOException {
        return w() != 0;
    }

    public final String k() throws IOException {
        byte[] bArr;
        int v = v();
        int i2 = this.j;
        int i3 = 0;
        if (v <= this.h - i2 && v > 0) {
            bArr = this.g;
            this.j = i2 + v;
            i3 = i2;
        } else if (v == 0) {
            return "";
        } else {
            if (v <= this.h) {
                g(v);
                bArr = this.g;
                this.j = v;
            } else {
                bArr = a(v, false);
            }
        }
        return Xx.b(bArr, i3, v);
    }

    public final C0289Zv l() throws IOException {
        int v = v();
        int i2 = this.h;
        int i3 = this.j;
        if (v <= i2 - i3 && v > 0) {
            C0289Zv a = C0289Zv.a(this.g, i3, v);
            this.j += v;
            return a;
        } else if (v == 0) {
            return C0289Zv.a;
        } else {
            byte[] i4 = i(v);
            if (i4 != null) {
                return C0289Zv.a(i4);
            }
            int i5 = this.j;
            int i6 = this.h;
            int i7 = i6 - i5;
            this.l += i6;
            this.j = 0;
            this.h = 0;
            List<byte[]> j2 = j(v - i7);
            byte[] bArr = new byte[v];
            System.arraycopy(this.g, i5, bArr, 0, i7);
            for (byte[] bArr2 : j2) {
                System.arraycopy(bArr2, 0, bArr, i7, bArr2.length);
                i7 += bArr2.length;
            }
            return C0289Zv.b(bArr);
        }
    }

    public final int m() throws IOException {
        return v();
    }

    public final int n() throws IOException {
        return v();
    }

    public final int o() throws IOException {
        return x();
    }

    public final long p() throws IOException {
        return y();
    }

    public final int q() throws IOException {
        return C1433jw.c(v());
    }

    public final long r() throws IOException {
        return C1433jw.a(w());
    }

    public final boolean s() throws IOException {
        return this.j == this.h && !h(1);
    }

    public final int t() {
        return this.l + this.j;
    }

    /* access modifiers changed from: 0000 */
    public final long u() throws IOException {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Ascii.DEL)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw C0225Kw.c();
    }

    private final void f(int i2) throws IOException {
        int i3;
        int i4 = this.h;
        int i5 = this.j;
        if (i2 <= i4 - i5 && i2 >= 0) {
            this.j = i5 + i2;
        } else if (i2 >= 0) {
            int i6 = this.l;
            int i7 = this.j;
            int i8 = i6 + i7 + i2;
            int i9 = this.m;
            if (i8 <= i9) {
                this.l = i6 + i7;
                int i10 = this.h - i7;
                this.h = 0;
                this.j = 0;
                while (i10 < i2) {
                    try {
                        long j2 = (long) (i2 - i10);
                        long skip = this.f.skip(j2);
                        int i11 = (skip > 0 ? 1 : (skip == 0 ? 0 : -1));
                        if (i11 >= 0 && skip <= j2) {
                            if (i11 == 0) {
                                break;
                            }
                            i10 += (int) skip;
                        } else {
                            String valueOf = String.valueOf(this.f.getClass());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 92);
                            sb.append(valueOf);
                            sb.append("#skip returned invalid result: ");
                            sb.append(skip);
                            sb.append("\nThe InputStream implementation is buggy.");
                            throw new IllegalStateException(sb.toString());
                        }
                    } catch (Throwable th) {
                        this.l += i10;
                        z();
                        throw th;
                    }
                }
                this.l += i10;
                z();
                if (i10 < i2) {
                    int i12 = this.h;
                    int i13 = i12 - this.j;
                    this.j = i12;
                    g(1);
                    while (true) {
                        i3 = i2 - i13;
                        int i14 = this.h;
                        if (i3 <= i14) {
                            break;
                        }
                        i13 += i14;
                        this.j = i14;
                        g(1);
                    }
                    this.j = i3;
                }
                return;
            }
            f((i9 - i6) - i7);
            throw C0225Kw.a();
        } else {
            throw C0225Kw.b();
        }
    }

    private final void g(int i2) throws IOException {
        if (h(i2)) {
            return;
        }
        if (i2 > (this.c - this.l) - this.j) {
            throw C0225Kw.g();
        }
        throw C0225Kw.a();
    }

    private final boolean h(int i2) throws IOException {
        do {
            int i3 = this.j;
            int i4 = i3 + i2;
            int i5 = this.h;
            if (i4 > i5) {
                int i6 = this.c;
                int i7 = this.l;
                if (i2 > (i6 - i7) - i3 || i7 + i3 + i2 > this.m) {
                    return false;
                }
                if (i3 > 0) {
                    if (i5 > i3) {
                        byte[] bArr = this.g;
                        System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                    }
                    this.l += i3;
                    this.h -= i3;
                    this.j = 0;
                }
                InputStream inputStream = this.f;
                byte[] bArr2 = this.g;
                int i8 = this.h;
                int read = inputStream.read(bArr2, i8, Math.min(bArr2.length - i8, (this.c - this.l) - i8));
                if (read == 0 || read < -1 || read > this.g.length) {
                    String valueOf = String.valueOf(this.f.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91);
                    sb.append(valueOf);
                    sb.append("#read(byte[]) returned invalid result: ");
                    sb.append(read);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                } else if (read <= 0) {
                    return false;
                } else {
                    this.h += read;
                    z();
                }
            } else {
                StringBuilder sb2 = new StringBuilder(77);
                sb2.append("refillBuffer() called when ");
                sb2.append(i2);
                sb2.append(" bytes were already available in buffer");
                throw new IllegalStateException(sb2.toString());
            }
        } while (this.h < i2);
        return true;
    }

    private final byte[] i(int i2) throws IOException {
        if (i2 == 0) {
            return C0209Gw.c;
        }
        if (i2 >= 0) {
            int i3 = this.l;
            int i4 = this.j;
            int i5 = i3 + i4 + i2;
            if (i5 - this.c <= 0) {
                int i6 = this.m;
                if (i5 <= i6) {
                    int i7 = this.h - i4;
                    int i8 = i2 - i7;
                    if (i8 >= 4096 && i8 > this.f.available()) {
                        return null;
                    }
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.g, this.j, bArr, 0, i7);
                    this.l += this.h;
                    this.j = 0;
                    this.h = 0;
                    while (i7 < bArr.length) {
                        int read = this.f.read(bArr, i7, i2 - i7);
                        if (read != -1) {
                            this.l += read;
                            i7 += read;
                        } else {
                            throw C0225Kw.a();
                        }
                    }
                    return bArr;
                }
                f((i6 - i3) - i4);
                throw C0225Kw.a();
            }
            throw C0225Kw.g();
        }
        throw C0225Kw.b();
    }

    private final List<byte[]> j(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            byte[] bArr = new byte[Math.min(i2, 4096)];
            int i3 = 0;
            while (i3 < bArr.length) {
                int read = this.f.read(bArr, i3, bArr.length - i3);
                if (read != -1) {
                    this.l += read;
                    i3 += read;
                } else {
                    throw C0225Kw.a();
                }
            }
            i2 -= bArr.length;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int a(int i2) throws C0225Kw {
        if (i2 >= 0) {
            int i3 = i2 + this.l + this.j;
            int i4 = this.m;
            if (i3 <= i4) {
                this.m = i3;
                z();
                return i4;
            }
            throw C0225Kw.a();
        }
        throw C0225Kw.b();
    }

    public final void b(int i2) {
        this.m = i2;
        z();
    }

    public final void d(int i2) throws C0225Kw {
        if (this.k != i2) {
            throw C0225Kw.e();
        }
    }

    private final byte[] a(int i2, boolean z) throws IOException {
        byte[] i3 = i(i2);
        if (i3 != null) {
            return i3;
        }
        int i4 = this.j;
        int i5 = this.h;
        int i6 = i5 - i4;
        this.l += i5;
        this.j = 0;
        this.h = 0;
        List<byte[]> j2 = j(i2 - i6);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.g, i4, bArr, 0, i6);
        for (byte[] bArr2 : j2) {
            System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
            i6 += bArr2.length;
        }
        return bArr;
    }

    public final long e() throws IOException {
        return w();
    }
}
