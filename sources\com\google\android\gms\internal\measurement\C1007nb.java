package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.measurement.nb reason: case insensitive filesystem */
public abstract class C1007nb extends Va {
    private static final Logger a = Logger.getLogger(C1007nb.class.getName());
    /* access modifiers changed from: private */
    public static final boolean b = C0937cd.a();
    C1025qb c = this;

    /* renamed from: com.google.android.gms.internal.measurement.nb$a */
    static class a extends C1007nb {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.d = bArr;
                    this.e = i;
                    this.g = i;
                    this.f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public void a() {
        }

        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        public final void d(int i) throws IOException {
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        public final void b(Ya ya) throws IOException {
            b(ya.size());
            ya.a((Va) this);
        }

        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        public final int e() {
            return this.g - this.e;
        }

        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void b(int i, C1026qc qcVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, qcVar);
            a(1, 4);
        }

        public final void c(C1026qc qcVar) throws IOException {
            b(qcVar.d());
            qcVar.a(this);
        }

        public final void a(int i, String str) throws IOException {
            a(i, 2);
            b(str);
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
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i, Ya ya) throws IOException {
            a(i, 2);
            b(ya);
        }

        public final void b(int i, Ya ya) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, ya);
            a(1, 4);
        }

        public final void a(int i, C1026qc qcVar) throws IOException {
            a(i, 2);
            c(qcVar);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, C1026qc qcVar, Ec ec) throws IOException {
            a(i, 2);
            Oa oa = (Oa) qcVar;
            int h = oa.h();
            if (h == -1) {
                h = ec.c(oa);
                oa.a(h);
            }
            b(h);
            ec.a(qcVar, (C1050ud) this.c);
        }

        public final void b(int i) throws IOException {
            if (!C1007nb.b || Ra.a() || b() < 5) {
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
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else if ((i & -128) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                C0937cd.a(bArr3, (long) i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                C0937cd.a(bArr4, (long) i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    C0937cd.a(bArr5, (long) i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                C0937cd.a(bArr6, (long) i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    C0937cd.a(bArr7, (long) i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.g;
                this.g = i11 + 1;
                C0937cd.a(bArr8, (long) i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    C0937cd.a(bArr9, (long) i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.g;
                this.g = i14 + 1;
                C0937cd.a(bArr10, (long) i14, (byte) (i12 | 128));
                int i15 = i12 >>> 7;
                byte[] bArr11 = this.d;
                int i16 = this.g;
                this.g = i16 + 1;
                C0937cd.a(bArr11, (long) i16, (byte) i15);
            }
        }

        public final void a(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void a(long j) throws IOException {
            if (!C1007nb.b || b() < 10) {
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
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    C0937cd.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                C0937cd.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)}), e2);
            }
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        public final void b(String str) throws IOException {
            int i = this.g;
            try {
                int g2 = C1007nb.g(str.length() * 3);
                int g3 = C1007nb.g(str.length());
                if (g3 == g2) {
                    this.g = i + g3;
                    int a = C0958fd.a(str, this.d, this.g, b());
                    this.g = i;
                    b((a - i) - g3);
                    this.g = a;
                    return;
                }
                b(C0958fd.a((CharSequence) str));
                this.g = C0958fd.a(str, this.d, this.g, b());
            } catch (C0985jd e2) {
                this.g = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b((Throwable) e3);
            }
        }

        public final int b() {
            return this.f - this.g;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.nb$b */
    public static class b extends IOException {
        b(String str) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        b(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.nb$c */
    static final class c extends a {
        private final ByteBuffer h;
        private int i;

        c(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.h = byteBuffer;
            this.i = byteBuffer.position();
        }

        public final void a() {
            this.h.position(this.i + e());
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.nb$d */
    static final class d extends C1007nb {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final long f;
        private final long g;
        private final long h;
        private final long i = (this.h - 10);
        private long j = this.g;

        d(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f = C0937cd.a(byteBuffer);
            this.g = this.f + ((long) byteBuffer.position());
            this.h = this.f + ((long) byteBuffer.limit());
        }

        private final void j(long j2) {
            this.e.position((int) (j2 - this.f));
        }

        public final void a(int i2, int i3) throws IOException {
            b((i2 << 3) | i3);
        }

        public final void b(int i2, int i3) throws IOException {
            a(i2, 0);
            a(i3);
        }

        public final void c(int i2, int i3) throws IOException {
            a(i2, 0);
            b(i3);
        }

        public final void d(int i2) throws IOException {
            this.e.putInt((int) (this.j - this.f), i2);
            this.j += 4;
        }

        public final void e(int i2, int i3) throws IOException {
            a(i2, 5);
            d(i3);
        }

        public final void a(int i2, long j2) throws IOException {
            a(i2, 0);
            a(j2);
        }

        public final void b(int i2, C1026qc qcVar) throws IOException {
            a(1, 3);
            c(2, i2);
            a(3, qcVar);
            a(1, 4);
        }

        public final void c(int i2, long j2) throws IOException {
            a(i2, 1);
            c(j2);
        }

        public final void a(int i2, boolean z) throws IOException {
            a(i2, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void c(C1026qc qcVar) throws IOException {
            b(qcVar.d());
            qcVar.a(this);
        }

        public final void a(int i2, String str) throws IOException {
            a(i2, 2);
            b(str);
        }

        public final void b(int i2, Ya ya) throws IOException {
            a(1, 3);
            c(2, i2);
            a(3, ya);
            a(1, 4);
        }

        public final void c(long j2) throws IOException {
            this.e.putLong((int) (this.j - this.f), j2);
            this.j += 8;
        }

        public final void a(int i2, Ya ya) throws IOException {
            a(i2, 2);
            b(ya);
        }

        public final void a(int i2, C1026qc qcVar) throws IOException {
            a(i2, 2);
            c(qcVar);
        }

        /* access modifiers changed from: 0000 */
        public final void b(C1026qc qcVar, Ec ec) throws IOException {
            Oa oa = (Oa) qcVar;
            int h2 = oa.h();
            if (h2 == -1) {
                h2 = ec.c(oa);
                oa.a(h2);
            }
            b(h2);
            ec.a(qcVar, (C1050ud) this.c);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, C1026qc qcVar, Ec ec) throws IOException {
            a(i2, 2);
            b(qcVar, ec);
        }

        public final void a(byte b) throws IOException {
            long j2 = this.j;
            if (j2 < this.h) {
                this.j = 1 + j2;
                C0937cd.a(j2, b);
                return;
            }
            throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.h), Integer.valueOf(1)}));
        }

        public final void b(Ya ya) throws IOException {
            b(ya.size());
            ya.a((Va) this);
        }

        public final void a(int i2) throws IOException {
            if (i2 >= 0) {
                b(i2);
            } else {
                a((long) i2);
            }
        }

        public final void b(int i2) throws IOException {
            if (this.j <= this.i) {
                while ((i2 & -128) != 0) {
                    long j2 = this.j;
                    this.j = j2 + 1;
                    C0937cd.a(j2, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                long j3 = this.j;
                this.j = 1 + j3;
                C0937cd.a(j3, (byte) i2);
                return;
            }
            while (true) {
                long j4 = this.j;
                if (j4 >= this.h) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j4), Long.valueOf(this.h), Integer.valueOf(1)}));
                } else if ((i2 & -128) == 0) {
                    this.j = 1 + j4;
                    C0937cd.a(j4, (byte) i2);
                    return;
                } else {
                    this.j = j4 + 1;
                    C0937cd.a(j4, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
            }
        }

        public final void a(long j2) throws IOException {
            if (this.j <= this.i) {
                while ((j2 & -128) != 0) {
                    long j3 = this.j;
                    this.j = j3 + 1;
                    C0937cd.a(j3, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                long j4 = this.j;
                this.j = 1 + j4;
                C0937cd.a(j4, (byte) ((int) j2));
                return;
            }
            while (true) {
                long j5 = this.j;
                if (j5 >= this.h) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j5), Long.valueOf(this.h), Integer.valueOf(1)}));
                } else if ((j2 & -128) == 0) {
                    this.j = 1 + j5;
                    C0937cd.a(j5, (byte) ((int) j2));
                    return;
                } else {
                    this.j = j5 + 1;
                    C0937cd.a(j5, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
            }
        }

        public final void b(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.h - j2;
                long j4 = this.j;
                if (j3 >= j4) {
                    C0937cd.a(bArr, (long) i2, j4, j2);
                    this.j += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new b(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(i3)}));
        }

        public final void a(byte[] bArr, int i2, int i3) throws IOException {
            b(bArr, i2, i3);
        }

        public final void a() {
            this.d.position((int) (this.j - this.f));
        }

        public final void b(String str) throws IOException {
            long j2 = this.j;
            try {
                int g2 = C1007nb.g(str.length() * 3);
                int g3 = C1007nb.g(str.length());
                if (g3 == g2) {
                    int i2 = ((int) (this.j - this.f)) + g3;
                    this.e.position(i2);
                    C0958fd.a((CharSequence) str, this.e);
                    int position = this.e.position() - i2;
                    b(position);
                    this.j += (long) position;
                    return;
                }
                int a = C0958fd.a((CharSequence) str);
                b(a);
                j(this.j);
                C0958fd.a((CharSequence) str, this.e);
                this.j += (long) a;
            } catch (C0985jd e2) {
                this.j = j2;
                j(this.j);
                a(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new b((Throwable) e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new b((Throwable) e4);
            }
        }

        public final int b() {
            return (int) (this.h - this.j);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.nb$e */
    static final class e extends C1007nb {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final int f;

        e(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f = byteBuffer.position();
        }

        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        public final void d(int i) throws IOException {
            try {
                this.e.putInt(i);
            } catch (BufferOverflowException e2) {
                throw new b((Throwable) e2);
            }
        }

        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        public final void b(int i, C1026qc qcVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, qcVar);
            a(1, 4);
        }

        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void c(C1026qc qcVar) throws IOException {
            b(qcVar.d());
            qcVar.a(this);
        }

        public final void a(int i, String str) throws IOException {
            a(i, 2);
            b(str);
        }

        public final void b(int i, Ya ya) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, ya);
            a(1, 4);
        }

        public final void c(long j) throws IOException {
            try {
                this.e.putLong(j);
            } catch (BufferOverflowException e2) {
                throw new b((Throwable) e2);
            }
        }

        public final void a(int i, Ya ya) throws IOException {
            a(i, 2);
            b(ya);
        }

        private final void c(String str) throws IOException {
            try {
                C0958fd.a((CharSequence) str, this.e);
            } catch (IndexOutOfBoundsException e2) {
                throw new b((Throwable) e2);
            }
        }

        public final void a(int i, C1026qc qcVar) throws IOException {
            a(i, 2);
            c(qcVar);
        }

        /* access modifiers changed from: 0000 */
        public final void b(C1026qc qcVar, Ec ec) throws IOException {
            Oa oa = (Oa) qcVar;
            int h = oa.h();
            if (h == -1) {
                h = ec.c(oa);
                oa.a(h);
            }
            b(h);
            ec.a(qcVar, (C1050ud) this.c);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, C1026qc qcVar, Ec ec) throws IOException {
            a(i, 2);
            b(qcVar, ec);
        }

        public final void a(byte b) throws IOException {
            try {
                this.e.put(b);
            } catch (BufferOverflowException e2) {
                throw new b((Throwable) e2);
            }
        }

        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void b(Ya ya) throws IOException {
            b(ya.size());
            ya.a((Va) this);
        }

        public final void a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.e.put((byte) ((int) j));
            } catch (BufferOverflowException e2) {
                throw new b((Throwable) e2);
            }
        }

        public final void b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.e.put((byte) i);
            } catch (BufferOverflowException e2) {
                throw new b((Throwable) e2);
            }
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        public final void a() {
            this.d.position(this.e.position());
        }

        public final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e2) {
                throw new b((Throwable) e2);
            } catch (BufferOverflowException e3) {
                throw new b((Throwable) e3);
            }
        }

        public final void b(String str) throws IOException {
            int position = this.e.position();
            try {
                int g = C1007nb.g(str.length() * 3);
                int g2 = C1007nb.g(str.length());
                if (g2 == g) {
                    int position2 = this.e.position() + g2;
                    this.e.position(position2);
                    c(str);
                    int position3 = this.e.position();
                    this.e.position(position);
                    b(position3 - position2);
                    this.e.position(position3);
                    return;
                }
                b(C0958fd.a((CharSequence) str));
                c(str);
            } catch (C0985jd e2) {
                this.e.position(position);
                a(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new b((Throwable) e3);
            }
        }

        public final int b() {
            return this.e.remaining();
        }
    }

    private C1007nb() {
    }

    public static C1007nb a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d2) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int e(int i, long j) {
        return e(i) + e(j);
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
        return e(i) + f(i2);
    }

    public static int g(int i) {
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

    public static int g(int i, int i2) {
        return e(i) + g(i2);
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i, int i2) {
        return e(i) + g(m(i2));
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return 4;
    }

    public static int i(int i, int i2) {
        return e(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return 4;
    }

    public static int j(int i, int i2) {
        return e(i) + 4;
    }

    public static int k(int i, int i2) {
        return e(i) + f(i2);
    }

    @Deprecated
    public static int l(int i) {
        return g(i);
    }

    private static int m(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a() throws IOException;

    public abstract void a(byte b2) throws IOException;

    public abstract void a(int i) throws IOException;

    public abstract void a(int i, int i2) throws IOException;

    public abstract void a(int i, long j) throws IOException;

    public abstract void a(int i, Ya ya) throws IOException;

    public abstract void a(int i, C1026qc qcVar) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract void a(int i, C1026qc qcVar, Ec ec) throws IOException;

    public abstract void a(int i, String str) throws IOException;

    public abstract void a(int i, boolean z) throws IOException;

    public abstract void a(long j) throws IOException;

    public abstract int b();

    public abstract void b(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public final void b(int i, long j) throws IOException {
        a(i, i(j));
    }

    public abstract void b(int i, Ya ya) throws IOException;

    public abstract void b(int i, C1026qc qcVar) throws IOException;

    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public final void c(int i) throws IOException {
        b(m(i));
    }

    public abstract void c(int i, int i2) throws IOException;

    public abstract void c(int i, long j) throws IOException;

    public abstract void c(long j) throws IOException;

    public abstract void d(int i) throws IOException;

    public final void d(int i, int i2) throws IOException {
        c(i, m(i2));
    }

    public abstract void e(int i, int i2) throws IOException;

    public static int c(int i, Ya ya) {
        int e2 = e(i);
        int size = ya.size();
        return e2 + g(size) + size;
    }

    public static int d(int i, long j) {
        return e(i) + e(j);
    }

    public static int e(int i) {
        return g(i << 3);
    }

    public static int f(int i, long j) {
        return e(i) + e(i(j));
    }

    public static int g(int i, long j) {
        return e(i) + 8;
    }

    public final void b(long j) throws IOException {
        a(i(j));
    }

    public static C1007nb a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new c(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        } else if (C0937cd.b()) {
            return new d(byteBuffer);
        } else {
            return new e(byteBuffer);
        }
    }

    public static int b(int i, float f) {
        return e(i) + 4;
    }

    public static int h(int i, long j) {
        return e(i) + 8;
    }

    public static int k(int i) {
        return f(i);
    }

    public static int b(int i, double d2) {
        return e(i) + 8;
    }

    public static int d(int i, C1026qc qcVar) {
        return (e(1) << 1) + g(2, i) + c(3, qcVar);
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int h(int i) {
        return g(m(i));
    }

    public static int b(int i, boolean z) {
        return e(i) + 1;
    }

    public static int c(int i, C1026qc qcVar) {
        return e(i) + a(qcVar);
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int b(int i, String str) {
        return e(i) + a(str);
    }

    public final void c() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    static int b(int i, C1026qc qcVar, Ec ec) {
        return e(i) + a(qcVar, ec);
    }

    public static int d(int i, Ya ya) {
        return (e(1) << 1) + g(2, i) + c(3, ya);
    }

    public static int b(int i, Wb wb) {
        return (e(1) << 1) + g(2, i) + a(3, wb);
    }

    @Deprecated
    static int c(int i, C1026qc qcVar, Ec ec) {
        int e2 = e(i) << 1;
        Oa oa = (Oa) qcVar;
        int h = oa.h();
        if (h == -1) {
            h = ec.c(oa);
            oa.a(h);
        }
        return e2 + h;
    }

    public static int d(long j) {
        return e(j);
    }

    public final void a(int i, float f) throws IOException {
        e(i, Float.floatToRawIntBits(f));
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return g(length) + length;
    }

    public final void a(int i, double d2) throws IOException {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void a(float f) throws IOException {
        d(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public static int b(C1026qc qcVar) {
        return qcVar.d();
    }

    public final void a(double d2) throws IOException {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(boolean z) throws IOException {
        a(z ? (byte) 1 : 0);
    }

    public static int a(int i, Wb wb) {
        int e2 = e(i);
        int b2 = wb.b();
        return e2 + g(b2) + b2;
    }

    public static int a(String str) {
        int i;
        try {
            i = C0958fd.a((CharSequence) str);
        } catch (C0985jd unused) {
            i = str.getBytes(Hb.a).length;
        }
        return g(i) + i;
    }

    public static int a(Wb wb) {
        int b2 = wb.b();
        return g(b2) + b2;
    }

    public static int a(Ya ya) {
        int size = ya.size();
        return g(size) + size;
    }

    public static int a(C1026qc qcVar) {
        int d2 = qcVar.d();
        return g(d2) + d2;
    }

    static int a(C1026qc qcVar, Ec ec) {
        Oa oa = (Oa) qcVar;
        int h = oa.h();
        if (h == -1) {
            h = ec.c(oa);
            oa.a(h);
        }
        return g(h) + h;
    }

    /* access modifiers changed from: 0000 */
    public final void a(String str, C0985jd jdVar) throws IOException {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", jdVar);
        byte[] bytes = str.getBytes(Hb.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new b((Throwable) e2);
        } catch (b e3) {
            throw e3;
        }
    }
}
