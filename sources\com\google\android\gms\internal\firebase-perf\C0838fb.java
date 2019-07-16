package com.google.android.gms.internal.firebase-perf;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-perf.fb reason: case insensitive filesystem */
public abstract class C0838fb extends Pa {
    private static final Logger a = Logger.getLogger(C0838fb.class.getName());
    /* access modifiers changed from: private */
    public static final boolean b = Qc.a();
    C0846hb c = this;

    /* renamed from: com.google.android.gms.internal.firebase-perf.fb$a */
    public static class a extends IOException {
        a(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        a(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    /* renamed from: com.google.android.gms.internal.firebase-perf.fb$b */
    static class b extends C0838fb {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.d = bArr;
                    this.e = 0;
                    this.g = 0;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(0), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void a(int i, int i2) throws IOException {
            i((i << 3) | i2);
        }

        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            h(i2);
        }

        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            i(i2);
        }

        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            k(i2);
        }

        public final void h(int i) throws IOException {
            if (i >= 0) {
                i(i);
            } else {
                a((long) i);
            }
        }

        public final void i(int i) throws IOException {
            if (!C0838fb.b || Ma.a() || a() < 5) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                Qc.a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                Qc.a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    Qc.a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                Qc.a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    Qc.a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.g;
                this.g = i11 + 1;
                Qc.a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    Qc.a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.g;
                this.g = i14 + 1;
                Qc.a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.d;
                int i16 = this.g;
                this.g = i16 + 1;
                Qc.a(bArr11, (long) i16, (byte) i15);
            }
        }

        public final void k(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        public final void b(byte[] bArr, int i, int i2) throws IOException {
            i(i2);
            c(bArr, 0, i2);
        }

        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void b(int i, Oa oa) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, oa);
            a(1, 4);
        }

        public final void c(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.d;
                int i6 = this.g;
                this.g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.d;
                int i7 = this.g;
                this.g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i, String str) throws IOException {
            a(i, 2);
            a(str);
        }

        public final void a(int i, Oa oa) throws IOException {
            a(i, 2);
            a(oa);
        }

        public final void a(Oa oa) throws IOException {
            i(oa.size());
            oa.a((Pa) this);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, C0835ec ecVar, C0886rc rcVar) throws IOException {
            a(i, 2);
            Ja ja = (Ja) ecVar;
            int j = ja.j();
            if (j == -1) {
                j = rcVar.b(ja);
                ja.a(j);
            }
            i(j);
            rcVar.a(ecVar, (dd) this.c);
        }

        private final void c(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)}), e2);
            }
        }

        public final void a(int i, C0835ec ecVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(ecVar);
            a(1, 4);
        }

        public final void a(C0835ec ecVar) throws IOException {
            i(ecVar.g());
            ecVar.a(this);
        }

        public final void a(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(long j) throws IOException {
            if (!C0838fb.b || a() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e2) {
                    throw new a(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    Qc.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                Qc.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            c(bArr, i, i2);
        }

        public final void a(String str) throws IOException {
            int i = this.g;
            try {
                int a = C0838fb.a(str.length() * 3);
                int a2 = C0838fb.a(str.length());
                if (a2 == a) {
                    this.g = i + a2;
                    int a3 = Tc.a(str, this.d, this.g, a());
                    this.g = i;
                    i((a3 - i) - a2);
                    this.g = a3;
                    return;
                }
                i(Tc.a((CharSequence) str));
                this.g = Tc.a(str, this.d, this.g, a());
            } catch (Xc e2) {
                this.g = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new a(e3);
            }
        }

        public final int a() {
            return this.f - this.g;
        }
    }

    private C0838fb() {
    }

    public static int a(int i) {
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

    public static C0838fb a(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int b(double d) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(int i) {
        return 4;
    }

    public static int c(int i, Oa oa) {
        int l = l(i);
        int size = oa.size();
        return l + a(size) + size;
    }

    public static int d(int i) {
        return 4;
    }

    public static int e(int i, long j) {
        return l(i) + e(j);
    }

    public static int e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    public static int f(int i, int i2) {
        return l(i) + m(i2);
    }

    public static int g(int i, int i2) {
        return l(i) + a(i2);
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i, int i2) {
        return l(i) + a(n(i2));
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i, int i2) {
        return l(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int k(int i, int i2) {
        return l(i) + m(i2);
    }

    public static int l(int i) {
        return a(i << 3);
    }

    public static int m(int i) {
        if (i >= 0) {
            return a(i);
        }
        return 10;
    }

    private static int n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int a();

    public abstract void a(byte b2) throws IOException;

    public abstract void a(int i, int i2) throws IOException;

    public abstract void a(int i, long j) throws IOException;

    public abstract void a(int i, Oa oa) throws IOException;

    public abstract void a(int i, C0835ec ecVar) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract void a(int i, C0835ec ecVar, C0886rc rcVar) throws IOException;

    public abstract void a(int i, String str) throws IOException;

    public abstract void a(int i, boolean z) throws IOException;

    public abstract void a(long j) throws IOException;

    public abstract void a(Oa oa) throws IOException;

    public abstract void a(C0835ec ecVar) throws IOException;

    public abstract void a(String str) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public final void b(int i, long j) throws IOException {
        a(i, i(j));
    }

    public abstract void b(int i, Oa oa) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public abstract void c(int i, int i2) throws IOException;

    public abstract void c(int i, long j) throws IOException;

    public abstract void c(long j) throws IOException;

    public final void d(int i, int i2) throws IOException {
        c(i, n(i2));
    }

    public abstract void e(int i, int i2) throws IOException;

    public abstract void h(int i) throws IOException;

    public abstract void i(int i) throws IOException;

    public final void j(int i) throws IOException {
        i(n(i));
    }

    public abstract void k(int i) throws IOException;

    public static int d(int i, long j) {
        return l(i) + e(j);
    }

    public static int e(int i) {
        return m(i);
    }

    public static int f(int i, long j) {
        return l(i) + e(i(j));
    }

    public static int g(int i, long j) {
        return l(i) + 8;
    }

    public static int j(int i, int i2) {
        return l(i) + 4;
    }

    public final void b(long j) throws IOException {
        a(i(j));
    }

    public static int b(int i, float f) {
        return l(i) + 4;
    }

    @Deprecated
    public static int g(int i) {
        return a(i);
    }

    public static int h(int i, long j) {
        return l(i) + 8;
    }

    public final void a(int i, float f) throws IOException {
        e(i, Float.floatToRawIntBits(f));
    }

    public static int b(int i, double d) {
        return l(i) + 8;
    }

    @Deprecated
    static int c(int i, C0835ec ecVar, C0886rc rcVar) {
        int l = l(i) << 1;
        Ja ja = (Ja) ecVar;
        int j = ja.j();
        if (j == -1) {
            j = rcVar.b(ja);
            ja.a(j);
        }
        return l + j;
    }

    public static int d(int i, Oa oa) {
        return (l(1) << 1) + g(2, i) + c(3, oa);
    }

    public static int f(long j) {
        return e(i(j));
    }

    public final void a(int i, double d) throws IOException {
        c(i, Double.doubleToRawLongBits(d));
    }

    public static int b(int i, boolean z) {
        return l(i) + 1;
    }

    static int f(int i) {
        return a(i) + i;
    }

    public final void a(float f) throws IOException {
        k(Float.floatToRawIntBits(f));
    }

    public static int b(int i, String str) {
        return l(i) + b(str);
    }

    public final void a(double d) throws IOException {
        c(Double.doubleToRawLongBits(d));
    }

    static int b(int i, C0835ec ecVar, C0886rc rcVar) {
        return l(i) + a(ecVar, rcVar);
    }

    public static int d(long j) {
        return e(j);
    }

    public final void a(boolean z) throws IOException {
        a(z ? (byte) 1 : 0);
    }

    public static int a(int i, Jb jb) {
        int l = l(i);
        int b2 = jb.b();
        return l + a(b2) + b2;
    }

    public static int b(int i, C0835ec ecVar) {
        return (l(1) << 1) + g(2, i) + l(3) + b(ecVar);
    }

    @Deprecated
    public static int c(C0835ec ecVar) {
        return ecVar.g();
    }

    public static int a(Jb jb) {
        int b2 = jb.b();
        return a(b2) + b2;
    }

    public static int b(int i, Jb jb) {
        return (l(1) << 1) + g(2, i) + a(3, jb);
    }

    static int a(C0835ec ecVar, C0886rc rcVar) {
        Ja ja = (Ja) ecVar;
        int j = ja.j();
        if (j == -1) {
            j = rcVar.b(ja);
            ja.a(j);
        }
        return a(j) + j;
    }

    public static int b(int i) {
        return a(n(i));
    }

    public static int b(String str) {
        int i;
        try {
            i = Tc.a((CharSequence) str);
        } catch (Xc unused) {
            i = str.getBytes(C0897ub.a).length;
        }
        return a(i) + i;
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, Xc xc) throws IOException {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", xc);
        byte[] bytes = str.getBytes(C0897ub.a);
        try {
            i(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new a(e);
        } catch (a e2) {
            throw e2;
        }
    }

    public static int b(Oa oa) {
        int size = oa.size();
        return a(size) + size;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return a(length) + length;
    }

    public static int b(C0835ec ecVar) {
        int g = ecVar.g();
        return a(g) + g;
    }

    public final void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }
}
