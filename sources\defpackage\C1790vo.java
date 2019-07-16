package defpackage;

import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: vo reason: default package and case insensitive filesystem */
/* compiled from: PsDurationReader */
final class C1790vo {
    private final Zq a = new Zq(0);
    private final Pq b = new Pq();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    C1790vo() {
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        if (!this.e) {
            return c(anVar, gnVar);
        }
        if (this.g == -9223372036854775807L) {
            return a(anVar);
        }
        if (!this.d) {
            return b(anVar, gnVar);
        }
        long j = this.f;
        if (j == -9223372036854775807L) {
            return a(anVar);
        }
        this.h = this.a.b(this.g) - this.a.b(j);
        return a(anVar);
    }

    public Zq b() {
        return this.a;
    }

    public boolean c() {
        return this.c;
    }

    private int b(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        int min = (int) Math.min(20000, anVar.getLength());
        long j = (long) 0;
        if (anVar.getPosition() != j) {
            gnVar.a = j;
            return 1;
        }
        this.b.c(min);
        anVar.a();
        anVar.a(this.b.a, 0, min);
        this.f = b(this.b);
        this.d = true;
        return 0;
    }

    private int c(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        long length = anVar.getLength();
        int min = (int) Math.min(20000, length);
        long j = length - ((long) min);
        if (anVar.getPosition() != j) {
            gnVar.a = j;
            return 1;
        }
        this.b.c(min);
        anVar.a();
        anVar.a(this.b.a, 0, min);
        this.g = c(this.b);
        this.e = true;
        return 0;
    }

    private long b(Pq pq) {
        int d2 = pq.d();
        for (int c2 = pq.c(); c2 < d2 - 3; c2++) {
            if (a(pq.a, c2) == 442) {
                pq.e(c2 + 4);
                long a2 = a(pq);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    private long c(Pq pq) {
        int c2 = pq.c();
        for (int d2 = pq.d() - 4; d2 >= c2; d2--) {
            if (a(pq.a, d2) == 442) {
                pq.e(d2 + 4);
                long a2 = a(pq);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    public long a() {
        return this.h;
    }

    public static long a(Pq pq) {
        int c2 = pq.c();
        if (pq.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        pq.a(bArr, 0, bArr.length);
        pq.e(c2);
        if (!a(bArr)) {
            return -9223372036854775807L;
        }
        return b(bArr);
    }

    private static long b(byte[] bArr) {
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    private int a(C0313an anVar) {
        this.b.a(C0471ar.f);
        this.c = true;
        anVar.a();
        return 0;
    }

    private int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }

    private static boolean a(byte[] bArr) {
        boolean z = false;
        if ((bArr[0] & 196) != 68 || (bArr[2] & 4) != 4 || (bArr[4] & 4) != 4 || (bArr[5] & 1) != 1) {
            return false;
        }
        if ((bArr[8] & 3) == 3) {
            z = true;
        }
        return z;
    }
}
