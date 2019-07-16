package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class M extends C0810z {
    private static final Logger a = Logger.getLogger(M.class.getName());
    /* access modifiers changed from: private */
    public static final boolean b = Ab.b();
    O c = this;

    static class a extends M {
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

        public final void a(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        public final void a(int i, A a) throws IOException {
            a(i, 2);
            b(a);
        }

        public final void a(int i, La la) throws IOException {
            a(i, 2);
            c(la);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, La la, C0741bb bbVar) throws IOException {
            a(i, 2);
            C0784q qVar = (C0784q) la;
            int e2 = qVar.e();
            if (e2 == -1) {
                e2 = bbVar.b(qVar);
                qVar.a(e2);
            }
            b(e2);
            bbVar.a(la, (Ob) this.c);
        }

        public final void a(int i, String str) throws IOException {
            a(i, 2);
            b(str);
        }

        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(long j) throws IOException {
            if (!M.b || b() < 10) {
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
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    Ab.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                Ab.a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        public final int b() {
            return this.f - this.g;
        }

        public final void b(int i) throws IOException {
            if (!M.b || b() < 10) {
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
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.g;
                    this.g = i4 + 1;
                    Ab.a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                Ab.a(bArr4, (long) i5, (byte) i);
            }
        }

        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        public final void b(int i, A a) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, a);
            a(1, 4);
        }

        public final void b(int i, La la) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, la);
            a(1, 4);
        }

        public final void b(A a) throws IOException {
            b(a.size());
            a.a((C0810z) this);
        }

        public final void b(String str) throws IOException {
            int i = this.g;
            try {
                int g2 = M.g(str.length() * 3);
                int g3 = M.g(str.length());
                if (g3 == g2) {
                    this.g = i + g3;
                    int a = Cb.a(str, this.d, this.g, b());
                    this.g = i;
                    b((a - i) - g3);
                    this.g = a;
                    return;
                }
                b(Cb.a((CharSequence) str));
                this.g = Cb.a(str, this.d, this.g, b());
            } catch (Fb e2) {
                this.g = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new c((Throwable) e3);
            }
        }

        public final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)}), e2);
            }
        }

        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
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
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void c(La la) throws IOException {
            b(la.d());
            la.a(this);
        }

        public final int d() {
            return this.g - this.e;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r5v2, types: [int, byte] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v4, types: [byte[]] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r5v2, types: [int, byte] */
        /* JADX WARNING: Unknown variable types count: 2 */
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
                ? r0 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                r0[i5] = i >> 24;
            } catch (IndexOutOfBoundsException e2) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(1)}), e2);
            }
        }

        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }
    }

    static final class b extends a {
        private final ByteBuffer h;
        private int i;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.h = byteBuffer;
            this.i = byteBuffer.position();
        }

        public final void a() {
            this.h.position(this.i + d());
        }
    }

    public static class c extends IOException {
        c(String str) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        c(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    static final class d extends M {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final int f;

        d(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f = byteBuffer.position();
        }

        private final void c(String str) throws IOException {
            try {
                Cb.a((CharSequence) str, this.e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c((Throwable) e2);
            }
        }

        public final void a() {
            this.d.position(this.e.position());
        }

        public final void a(byte b) throws IOException {
            try {
                this.e.put(b);
            } catch (BufferOverflowException e2) {
                throw new c((Throwable) e2);
            }
        }

        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a((long) i);
            }
        }

        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        public final void a(int i, A a) throws IOException {
            a(i, 2);
            b(a);
        }

        public final void a(int i, La la) throws IOException {
            a(i, 2);
            c(la);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i, La la, C0741bb bbVar) throws IOException {
            a(i, 2);
            b(la, bbVar);
        }

        public final void a(int i, String str) throws IOException {
            a(i, 2);
            b(str);
        }

        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.e.put((byte) ((int) j));
            } catch (BufferOverflowException e2) {
                throw new c((Throwable) e2);
            }
        }

        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        public final int b() {
            return this.e.remaining();
        }

        public final void b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.e.put((byte) i);
            } catch (BufferOverflowException e2) {
                throw new c((Throwable) e2);
            }
        }

        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        public final void b(int i, A a) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, a);
            a(1, 4);
        }

        public final void b(int i, La la) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, la);
            a(1, 4);
        }

        public final void b(A a) throws IOException {
            b(a.size());
            a.a((C0810z) this);
        }

        /* access modifiers changed from: 0000 */
        public final void b(La la, C0741bb bbVar) throws IOException {
            C0784q qVar = (C0784q) la;
            int e2 = qVar.e();
            if (e2 == -1) {
                e2 = bbVar.b(qVar);
                qVar.a(e2);
            }
            b(e2);
            bbVar.a(la, (Ob) this.c);
        }

        public final void b(String str) throws IOException {
            int position = this.e.position();
            try {
                int g = M.g(str.length() * 3);
                int g2 = M.g(str.length());
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
                b(Cb.a((CharSequence) str));
                c(str);
            } catch (Fb e2) {
                this.e.position(position);
                a(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new c((Throwable) e3);
            }
        }

        public final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e2) {
                throw new c((Throwable) e2);
            } catch (BufferOverflowException e3) {
                throw new c((Throwable) e3);
            }
        }

        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        public final void c(long j) throws IOException {
            try {
                this.e.putLong(j);
            } catch (BufferOverflowException e2) {
                throw new c((Throwable) e2);
            }
        }

        public final void c(La la) throws IOException {
            b(la.d());
            la.a(this);
        }

        public final void d(int i) throws IOException {
            try {
                this.e.putInt(i);
            } catch (BufferOverflowException e2) {
                throw new c((Throwable) e2);
            }
        }

        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }
    }

    static final class e extends M {
        private final ByteBuffer d;
        private final ByteBuffer e;
        private final long f;
        private final long g;
        private final long h;
        private final long i = (this.h - 10);
        private long j = this.g;

        e(ByteBuffer byteBuffer) {
            super();
            this.d = byteBuffer;
            this.e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f = Ab.a(byteBuffer);
            this.g = this.f + ((long) byteBuffer.position());
            this.h = this.f + ((long) byteBuffer.limit());
        }

        private final void j(long j2) {
            this.e.position((int) (j2 - this.f));
        }

        public final void a() {
            this.d.position((int) (this.j - this.f));
        }

        public final void a(byte b) throws IOException {
            long j2 = this.j;
            if (j2 < this.h) {
                this.j = 1 + j2;
                Ab.a(j2, b);
                return;
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.h), Integer.valueOf(1)}));
        }

        public final void a(int i2) throws IOException {
            if (i2 >= 0) {
                b(i2);
            } else {
                a((long) i2);
            }
        }

        public final void a(int i2, int i3) throws IOException {
            b((i2 << 3) | i3);
        }

        public final void a(int i2, long j2) throws IOException {
            a(i2, 0);
            a(j2);
        }

        public final void a(int i2, A a) throws IOException {
            a(i2, 2);
            b(a);
        }

        public final void a(int i2, La la) throws IOException {
            a(i2, 2);
            c(la);
        }

        /* access modifiers changed from: 0000 */
        public final void a(int i2, La la, C0741bb bbVar) throws IOException {
            a(i2, 2);
            b(la, bbVar);
        }

        public final void a(int i2, String str) throws IOException {
            a(i2, 2);
            b(str);
        }

        public final void a(int i2, boolean z) throws IOException {
            a(i2, 0);
            a(z ? (byte) 1 : 0);
        }

        public final void a(long j2) throws IOException {
            long j3;
            if (this.j <= this.i) {
                while ((j2 & -128) != 0) {
                    long j4 = this.j;
                    this.j = j4 + 1;
                    Ab.a(j4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                j3 = this.j;
            } else {
                while (true) {
                    j3 = this.j;
                    if (j3 >= this.h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j3), Long.valueOf(this.h), Integer.valueOf(1)}));
                    } else if ((j2 & -128) == 0) {
                        break;
                    } else {
                        this.j = j3 + 1;
                        Ab.a(j3, (byte) ((((int) j2) & 127) | 128));
                        j2 >>>= 7;
                    }
                }
            }
            this.j = 1 + j3;
            Ab.a(j3, (byte) ((int) j2));
        }

        public final void a(byte[] bArr, int i2, int i3) throws IOException {
            b(bArr, i2, i3);
        }

        public final int b() {
            return (int) (this.h - this.j);
        }

        public final void b(int i2) throws IOException {
            long j2;
            if (this.j <= this.i) {
                while ((i2 & -128) != 0) {
                    long j3 = this.j;
                    this.j = j3 + 1;
                    Ab.a(j3, (byte) ((i2 & 127) | 128));
                    i2 >>>= 7;
                }
                j2 = this.j;
            } else {
                while (true) {
                    j2 = this.j;
                    if (j2 >= this.h) {
                        throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.h), Integer.valueOf(1)}));
                    } else if ((i2 & -128) == 0) {
                        break;
                    } else {
                        this.j = j2 + 1;
                        Ab.a(j2, (byte) ((i2 & 127) | 128));
                        i2 >>>= 7;
                    }
                }
            }
            this.j = 1 + j2;
            Ab.a(j2, (byte) i2);
        }

        public final void b(int i2, int i3) throws IOException {
            a(i2, 0);
            a(i3);
        }

        public final void b(int i2, A a) throws IOException {
            a(1, 3);
            c(2, i2);
            a(3, a);
            a(1, 4);
        }

        public final void b(int i2, La la) throws IOException {
            a(1, 3);
            c(2, i2);
            a(3, la);
            a(1, 4);
        }

        public final void b(A a) throws IOException {
            b(a.size());
            a.a((C0810z) this);
        }

        /* access modifiers changed from: 0000 */
        public final void b(La la, C0741bb bbVar) throws IOException {
            C0784q qVar = (C0784q) la;
            int e2 = qVar.e();
            if (e2 == -1) {
                e2 = bbVar.b(qVar);
                qVar.a(e2);
            }
            b(e2);
            bbVar.a(la, (Ob) this.c);
        }

        public final void b(String str) throws IOException {
            long j2 = this.j;
            try {
                int g2 = M.g(str.length() * 3);
                int g3 = M.g(str.length());
                if (g3 == g2) {
                    int i2 = ((int) (this.j - this.f)) + g3;
                    this.e.position(i2);
                    Cb.a((CharSequence) str, this.e);
                    int position = this.e.position() - i2;
                    b(position);
                    this.j += (long) position;
                    return;
                }
                int a = Cb.a((CharSequence) str);
                b(a);
                j(this.j);
                Cb.a((CharSequence) str, this.e);
                this.j += (long) a;
            } catch (Fb e2) {
                this.j = j2;
                j(this.j);
                a(str, e2);
            } catch (IllegalArgumentException e3) {
                throw new c((Throwable) e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new c((Throwable) e4);
            }
        }

        public final void b(byte[] bArr, int i2, int i3) throws IOException {
            if (bArr != null && i2 >= 0 && i3 >= 0 && bArr.length - i3 >= i2) {
                long j2 = (long) i3;
                long j3 = this.h - j2;
                long j4 = this.j;
                if (j3 >= j4) {
                    Ab.a(bArr, (long) i2, j4, j2);
                    this.j += j2;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new c(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.j), Long.valueOf(this.h), Integer.valueOf(i3)}));
        }

        public final void c(int i2, int i3) throws IOException {
            a(i2, 0);
            b(i3);
        }

        public final void c(int i2, long j2) throws IOException {
            a(i2, 1);
            c(j2);
        }

        public final void c(long j2) throws IOException {
            this.e.putLong((int) (this.j - this.f), j2);
            this.j += 8;
        }

        public final void c(La la) throws IOException {
            b(la.d());
            la.a(this);
        }

        public final void d(int i2) throws IOException {
            this.e.putInt((int) (this.j - this.f), i2);
            this.j += 4;
        }

        public final void e(int i2, int i3) throws IOException {
            a(i2, 5);
            d(i3);
        }
    }

    private M() {
    }

    public static int a(int i, C0793ta taVar) {
        int e2 = e(i);
        int a2 = taVar.a();
        return e2 + g(a2) + a2;
    }

    public static int a(A a2) {
        int size = a2.size();
        return g(size) + size;
    }

    public static int a(La la) {
        int d2 = la.d();
        return g(d2) + d2;
    }

    static int a(La la, C0741bb bbVar) {
        C0784q qVar = (C0784q) la;
        int e2 = qVar.e();
        if (e2 == -1) {
            e2 = bbVar.b(qVar);
            qVar.a(e2);
        }
        return g(e2) + e2;
    }

    public static int a(C0793ta taVar) {
        int a2 = taVar.a();
        return g(a2) + a2;
    }

    public static int a(String str) {
        int i;
        try {
            i = Cb.a((CharSequence) str);
        } catch (Fb unused) {
            i = str.getBytes(C0761ia.a).length;
        }
        return g(i) + i;
    }

    public static M a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return Ab.c() ? new e(byteBuffer) : new d(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    public static M a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d2) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(int i, double d2) {
        return e(i) + 8;
    }

    public static int b(int i, float f) {
        return e(i) + 4;
    }

    static int b(int i, La la, C0741bb bbVar) {
        return e(i) + a(la, bbVar);
    }

    public static int b(int i, C0793ta taVar) {
        return (e(1) << 1) + g(2, i) + a(3, taVar);
    }

    public static int b(int i, String str) {
        return e(i) + a(str);
    }

    public static int b(int i, boolean z) {
        return e(i) + 1;
    }

    @Deprecated
    public static int b(La la) {
        return la.d();
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return g(length) + length;
    }

    public static int c(int i, A a2) {
        int e2 = e(i);
        int size = a2.size();
        return e2 + g(size) + size;
    }

    public static int c(int i, La la) {
        return e(i) + a(la);
    }

    @Deprecated
    static int c(int i, La la, C0741bb bbVar) {
        int e2 = e(i) << 1;
        C0784q qVar = (C0784q) la;
        int e3 = qVar.e();
        if (e3 == -1) {
            e3 = bbVar.b(qVar);
            qVar.a(e3);
        }
        return e2 + e3;
    }

    public static int d(int i, long j) {
        return e(i) + e(j);
    }

    public static int d(int i, A a2) {
        return (e(1) << 1) + g(2, i) + c(3, a2);
    }

    public static int d(int i, La la) {
        return (e(1) << 1) + g(2, i) + c(3, la);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return g(i << 3);
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

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int f(int i, int i2) {
        return e(i) + f(i2);
    }

    public static int f(int i, long j) {
        return e(i) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
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

    public static int g(int i, long j) {
        return e(i) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return g(m(i));
    }

    public static int h(int i, int i2) {
        return e(i) + g(m(i2));
    }

    public static int h(int i, long j) {
        return e(i) + 8;
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

    public static int k(int i) {
        return f(i);
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

    public final void a(double d2) throws IOException {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(float f) throws IOException {
        d(Float.floatToRawIntBits(f));
    }

    public abstract void a(int i) throws IOException;

    public final void a(int i, double d2) throws IOException {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void a(int i, float f) throws IOException {
        e(i, Float.floatToRawIntBits(f));
    }

    public abstract void a(int i, int i2) throws IOException;

    public abstract void a(int i, long j) throws IOException;

    public abstract void a(int i, A a2) throws IOException;

    public abstract void a(int i, La la) throws IOException;

    /* access modifiers changed from: 0000 */
    public abstract void a(int i, La la, C0741bb bbVar) throws IOException;

    public abstract void a(int i, String str) throws IOException;

    public abstract void a(int i, boolean z) throws IOException;

    public abstract void a(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    public final void a(String str, Fb fb) throws IOException {
        a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", fb);
        byte[] bytes = str.getBytes(C0761ia.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e2) {
            throw new c((Throwable) e2);
        } catch (c e3) {
            throw e3;
        }
    }

    public final void a(boolean z) throws IOException {
        a(z ? (byte) 1 : 0);
    }

    public abstract int b();

    public abstract void b(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public final void b(int i, long j) throws IOException {
        a(i, i(j));
    }

    public abstract void b(int i, A a2) throws IOException;

    public abstract void b(int i, La la) throws IOException;

    public final void b(long j) throws IOException {
        a(i(j));
    }

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
}
