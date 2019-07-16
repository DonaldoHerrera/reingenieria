package defpackage;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: Mq reason: default package */
/* compiled from: NalUnitUtil */
public final class Mq {
    public static final byte[] a = {0, 0, 0, 1};
    public static final float[] b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object c = new Object();
    private static int[] d = new int[10];

    /* renamed from: Mq$a */
    /* compiled from: NalUnitUtil */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;

        public a(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* renamed from: Mq$b */
    /* compiled from: NalUnitUtil */
    public static final class b {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final float g;
        public final boolean h;
        public final boolean i;
        public final int j;
        public final int k;
        public final int l;
        public final boolean m;

        public b(int i2, int i3, int i4, int i5, int i6, int i7, float f2, boolean z, boolean z2, int i8, int i9, int i10, boolean z3) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = i7;
            this.g = f2;
            this.h = z;
            this.i = z2;
            this.j = i8;
            this.k = i9;
            this.l = i10;
            this.m = z3;
        }
    }

    public static void a(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i + 1;
            if (i3 < position) {
                byte b2 = byteBuffer.get(i) & 255;
                if (i2 == 3) {
                    if (b2 == 1 && (byteBuffer.get(i3) & Ascii.US) == 7) {
                        ByteBuffer duplicate = byteBuffer.duplicate();
                        duplicate.position(i - 3);
                        duplicate.limit(position);
                        byteBuffer.position(0);
                        byteBuffer.put(duplicate);
                        return;
                    }
                } else if (b2 == 0) {
                    i2++;
                }
                if (b2 != 0) {
                    i2 = 0;
                }
                i = i3;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static int b(byte[] bArr, int i) {
        return bArr[i + 3] & Ascii.US;
    }

    public static int c(byte[] bArr, int i) {
        int i2;
        synchronized (c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                try {
                    i3 = c(bArr, i3, i);
                    if (i3 < i) {
                        if (d.length <= i4) {
                            d = Arrays.copyOf(d, d.length * 2);
                        }
                        int i5 = i4 + 1;
                        d[i4] = i3;
                        i3 += 3;
                        i4 = i5;
                    }
                } finally {
                }
            }
            i2 = i - i4;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = d[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i11 + 1;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i2 - i6);
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0145  */
    public static b b(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int i4;
        int b2;
        float f;
        int b3;
        int i5;
        int i6;
        Qq qq = new Qq(bArr, i, i2);
        qq.c(8);
        int b4 = qq.b(8);
        int b5 = qq.b(8);
        int b6 = qq.b(8);
        int d2 = qq.d();
        int i7 = 1;
        if (b4 == 100 || b4 == 110 || b4 == 122 || b4 == 244 || b4 == 44 || b4 == 83 || b4 == 86 || b4 == 118 || b4 == 128 || b4 == 138) {
            i3 = qq.d();
            z = i3 == 3 ? qq.b() : false;
            qq.d();
            qq.d();
            qq.e();
            if (qq.b()) {
                int i8 = i3 != 3 ? 8 : 12;
                int i9 = 0;
                while (i9 < i8) {
                    if (qq.b()) {
                        a(qq, i9 < 6 ? 16 : 64);
                    }
                    i9++;
                }
            }
        } else {
            i3 = 1;
            z = false;
        }
        int d3 = qq.d() + 4;
        int d4 = qq.d();
        if (d4 == 0) {
            i4 = qq.d() + 4;
        } else if (d4 == 1) {
            boolean b7 = qq.b();
            qq.c();
            qq.c();
            long d5 = (long) qq.d();
            for (int i10 = 0; ((long) i10) < d5; i10++) {
                qq.d();
            }
            z2 = b7;
            i4 = 0;
            qq.d();
            qq.e();
            int d6 = qq.d() + 1;
            int d7 = qq.d() + 1;
            b2 = qq.b();
            int i11 = (2 - b2) * d7;
            if (b2 == 0) {
                qq.e();
            }
            qq.e();
            int i12 = d6 * 16;
            int i13 = i11 * 16;
            if (qq.b()) {
                int d8 = qq.d();
                int d9 = qq.d();
                int d10 = qq.d();
                int d11 = qq.d();
                if (i3 == 0) {
                    i5 = 2 - b2;
                    i6 = 1;
                } else {
                    i6 = i3 == 3 ? 1 : 2;
                    if (i3 == 1) {
                        i7 = 2;
                    }
                    i5 = i7 * (2 - b2);
                }
                i12 -= (d8 + d9) * i6;
                i13 -= (d10 + d11) * i5;
            }
            int i14 = i12;
            float f2 = 1.0f;
            if (qq.b() && qq.b()) {
                b3 = qq.b(8);
                if (b3 != 255) {
                    int b8 = qq.b(16);
                    int b9 = qq.b(16);
                    if (!(b8 == 0 || b9 == 0)) {
                        f2 = ((float) b8) / ((float) b9);
                    }
                    f = f2;
                } else {
                    float[] fArr = b;
                    if (b3 < fArr.length) {
                        f = fArr[b3];
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(b3);
                        Iq.d("NalUnitUtil", sb.toString());
                    }
                }
                b bVar = new b(b4, b5, b6, d2, i14, i13, f, z, b2, d3, d4, i4, z2);
                return bVar;
            }
            f = 1.0f;
            b bVar2 = new b(b4, b5, b6, d2, i14, i13, f, z, b2, d3, d4, i4, z2);
            return bVar2;
        } else {
            i4 = 0;
        }
        z2 = false;
        qq.d();
        qq.e();
        int d62 = qq.d() + 1;
        int d72 = qq.d() + 1;
        b2 = qq.b();
        int i112 = (2 - b2) * d72;
        if (b2 == 0) {
        }
        qq.e();
        int i122 = d62 * 16;
        int i132 = i112 * 16;
        if (qq.b()) {
        }
        int i142 = i122;
        float f22 = 1.0f;
        b3 = qq.b(8);
        if (b3 != 255) {
        }
        b bVar22 = new b(b4, b5, b6, d2, i142, i132, f, z, b2, d3, d4, i4, z2);
        return bVar22;
    }

    public static boolean a(String str, byte b2) {
        if ("video/avc".equals(str) && (b2 & Ascii.US) == 6) {
            return true;
        }
        if (!"video/hevc".equals(str) || ((b2 & 126) >> 1) != 39) {
            return false;
        }
        return true;
    }

    public static int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 126) >> 1;
    }

    public static a a(byte[] bArr, int i, int i2) {
        Qq qq = new Qq(bArr, i, i2);
        qq.c(8);
        int d2 = qq.d();
        int d3 = qq.d();
        qq.e();
        return new a(d2, d3, qq.b());
    }

    private static int c(byte[] bArr, int i, int i2) {
        while (i < i2 - 2) {
            if (bArr[i] == 0 && bArr[i + 1] == 0 && bArr[i + 2] == 3) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0097, code lost:
        r8 = true;
     */
    public static int a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        boolean z = false;
        C1852xq.b(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr != null) {
            if (zArr[0]) {
                a(zArr);
                return i - 3;
            } else if (i3 > 1 && zArr[1] && bArr[i] == 1) {
                a(zArr);
                return i - 2;
            } else if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
                a(zArr);
                return i - 1;
            }
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            if ((bArr[i5] & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && bArr[i5] == 1) {
                    if (zArr != null) {
                        a(zArr);
                    }
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        if (zArr != null) {
            if (i3 > 2) {
            }
            boolean z2 = false;
            zArr[0] = z2;
            zArr[1] = i3 <= 1 ? !(!zArr[2] || bArr[i4] != 0) : bArr[i2 + -2] == 0 && bArr[i4] == 0;
            if (bArr[i4] == 0) {
                z = true;
            }
            zArr[2] = z;
        }
        return i2;
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    private static void a(Qq qq, int i) {
        int i2 = 8;
        int i3 = 8;
        for (int i4 = 0; i4 < i; i4++) {
            if (i2 != 0) {
                i2 = ((qq.c() + i3) + 256) % 256;
            }
            if (i2 != 0) {
                i3 = i2;
            }
        }
    }
}
