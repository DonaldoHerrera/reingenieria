package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.Format;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: SampleQueue */
public class w implements C1424jn {
    private final Sp a;
    private final int b;
    private final v c = new v();
    private final com.google.android.exoplayer2.source.v.a d = new com.google.android.exoplayer2.source.v.a();
    private final Pq e = new Pq(32);
    private a f = new a(0, this.b);
    private a g;
    private a h;
    private Format i;
    private boolean j;
    private Format k;
    private long l;
    private long m;
    private boolean n;
    private b o;

    /* compiled from: SampleQueue */
    private static final class a {
        public final long a;
        public final long b;
        public boolean c;
        public Rp d;
        public a e;

        public a(long j, int i) {
            this.a = j;
            this.b = j + ((long) i);
        }

        public void a(Rp rp, a aVar) {
            this.d = rp;
            this.e = aVar;
            this.c = true;
        }

        public int a(long j) {
            return ((int) (j - this.a)) + this.d.b;
        }

        public a a() {
            this.d = null;
            a aVar = this.e;
            this.e = null;
            return aVar;
        }
    }

    /* compiled from: SampleQueue */
    public interface b {
        void a(Format format);
    }

    public w(Sp sp) {
        this.a = sp;
        this.b = sp.c();
        a aVar = this.f;
        this.g = aVar;
        this.h = aVar;
    }

    public void a(boolean z) {
        this.c.a(z);
        a(this.f);
        this.f = new a(0, this.b);
        a aVar = this.f;
        this.g = aVar;
        this.h = aVar;
        this.m = 0;
        this.a.b();
    }

    public void b(long j2, boolean z, boolean z2) {
        b(this.c.b(j2, z, z2));
    }

    public long c() {
        return this.c.c();
    }

    public int d() {
        return this.c.d();
    }

    public Format e() {
        return this.c.e();
    }

    public int f() {
        return this.c.f();
    }

    public boolean g() {
        return this.c.g();
    }

    public boolean h() {
        return this.c.h();
    }

    public void i() {
        a(false);
    }

    public void j() {
        this.c.i();
        this.g = this.f;
    }

    public void b() {
        b(this.c.b());
    }

    private void b(long j2) {
        a aVar;
        if (j2 != -1) {
            while (true) {
                aVar = this.f;
                if (j2 < aVar.b) {
                    break;
                }
                this.a.a(aVar.d);
                this.f = this.f.a();
            }
            if (this.g.a < aVar.a) {
                this.g = aVar;
            }
        }
    }

    private int b(int i2) {
        a aVar = this.h;
        if (!aVar.c) {
            aVar.a(this.a.a(), new a(this.h.b, this.b));
        }
        return Math.min(i2, (int) (this.h.b - this.m));
    }

    public int a() {
        return this.c.a();
    }

    public int a(long j2, boolean z, boolean z2) {
        return this.c.a(j2, z, z2);
    }

    public int a(B b2, Qm qm, boolean z, boolean z2, long j2) {
        int a2 = this.c.a(b2, qm, z, z2, this.i, this.d);
        if (a2 == -5) {
            this.i = b2.a;
            return -5;
        } else if (a2 == -4) {
            if (!qm.d()) {
                if (qm.d < j2) {
                    qm.b(Integer.MIN_VALUE);
                }
                if (!qm.u()) {
                    if (qm.g()) {
                        a(qm, this.d);
                    }
                    qm.f(this.d.a);
                    com.google.android.exoplayer2.source.v.a aVar = this.d;
                    a(aVar.b, qm.c, aVar.a);
                }
            }
            return -4;
        } else if (a2 == -3) {
            return -3;
        } else {
            throw new IllegalStateException();
        }
    }

    private void a(Qm qm, com.google.android.exoplayer2.source.v.a aVar) {
        int i2;
        Qm qm2 = qm;
        com.google.android.exoplayer2.source.v.a aVar2 = aVar;
        long j2 = aVar2.b;
        this.e.c(1);
        a(j2, this.e.a, 1);
        long j3 = j2 + 1;
        byte b2 = this.e.a[0];
        boolean z = (b2 & 128) != 0;
        byte b3 = b2 & Ascii.DEL;
        Nm nm = qm2.b;
        if (nm.a == null) {
            nm.a = new byte[16];
        }
        a(j3, qm2.b.a, (int) b3);
        long j4 = j3 + ((long) b3);
        if (z) {
            this.e.c(2);
            a(j4, this.e.a, 2);
            j4 += 2;
            i2 = this.e.z();
        } else {
            i2 = 1;
        }
        int[] iArr = qm2.b.d;
        if (iArr == null || iArr.length < i2) {
            iArr = new int[i2];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = qm2.b.e;
        if (iArr3 == null || iArr3.length < i2) {
            iArr3 = new int[i2];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i2 * 6;
            this.e.c(i3);
            a(j4, this.e.a, i3);
            j4 += (long) i3;
            this.e.e(0);
            for (int i4 = 0; i4 < i2; i4++) {
                iArr2[i4] = this.e.z();
                iArr4[i4] = this.e.x();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.a - ((int) (j4 - aVar2.b));
        }
        defpackage.C1424jn.a aVar3 = aVar2.c;
        Nm nm2 = qm2.b;
        nm2.a(i2, iArr2, iArr4, aVar3.b, nm2.a, aVar3.a, aVar3.c, aVar3.d);
        long j5 = aVar2.b;
        int i5 = (int) (j4 - j5);
        aVar2.b = j5 + ((long) i5);
        aVar2.a -= i5;
    }

    private void a(long j2, ByteBuffer byteBuffer, int i2) {
        a(j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.g.b - j2));
            a aVar = this.g;
            byteBuffer.put(aVar.d.a, aVar.a(j2), min);
            i2 -= min;
            j2 += (long) min;
            a aVar2 = this.g;
            if (j2 == aVar2.b) {
                this.g = aVar2.e;
            }
        }
    }

    private void a(long j2, byte[] bArr, int i2) {
        a(j2);
        long j3 = j2;
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (this.g.b - j3));
            a aVar = this.g;
            System.arraycopy(aVar.d.a, aVar.a(j3), bArr, i2 - i3, min);
            i3 -= min;
            j3 += (long) min;
            a aVar2 = this.g;
            if (j3 == aVar2.b) {
                this.g = aVar2.e;
            }
        }
    }

    private void a(long j2) {
        while (true) {
            a aVar = this.g;
            if (j2 >= aVar.b) {
                this.g = aVar.e;
            } else {
                return;
            }
        }
    }

    public void a(b bVar) {
        this.o = bVar;
    }

    public void a(Format format) {
        Format a2 = a(format, this.l);
        boolean a3 = this.c.a(a2);
        this.k = format;
        this.j = false;
        b bVar = this.o;
        if (bVar != null && a3) {
            bVar.a(a2);
        }
    }

    public int a(C0313an anVar, int i2, boolean z) throws IOException, InterruptedException {
        int b2 = b(i2);
        a aVar = this.h;
        int read = anVar.read(aVar.d.a, aVar.a(this.m), b2);
        if (read != -1) {
            a(read);
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void a(Pq pq, int i2) {
        while (i2 > 0) {
            int b2 = b(i2);
            a aVar = this.h;
            pq.a(aVar.d.a, aVar.a(this.m), b2);
            i2 -= b2;
            a(b2);
        }
    }

    public void a(long j2, int i2, int i3, int i4, defpackage.C1424jn.a aVar) {
        if (this.j) {
            a(this.k);
        }
        long j3 = j2 + this.l;
        if (this.n) {
            if ((i2 & 1) != 0 && this.c.a(j3)) {
                this.n = false;
            } else {
                return;
            }
        }
        int i5 = i3;
        this.c.a(j3, i2, (this.m - ((long) i5)) - ((long) i4), i5, aVar);
    }

    private void a(a aVar) {
        if (aVar.c) {
            a aVar2 = this.h;
            boolean z = aVar2.c;
            Rp[] rpArr = new Rp[((z ? 1 : 0) + (((int) (aVar2.a - aVar.a)) / this.b))];
            for (int i2 = 0; i2 < rpArr.length; i2++) {
                rpArr[i2] = aVar.d;
                aVar = aVar.a();
            }
            this.a.a(rpArr);
        }
    }

    private void a(int i2) {
        this.m += (long) i2;
        long j2 = this.m;
        a aVar = this.h;
        if (j2 == aVar.b) {
            this.h = aVar.e;
        }
    }

    private static Format a(Format format, long j2) {
        if (format == null) {
            return null;
        }
        if (j2 != 0) {
            long j3 = format.m;
            if (j3 != Long.MAX_VALUE) {
                format = format.a(j3 + j2);
            }
        }
        return format;
    }
}
