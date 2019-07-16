package defpackage;

import java.io.IOException;

/* renamed from: Co reason: default package */
/* compiled from: TsDurationReader */
final class Co {
    private final Zq a = new Zq(0);
    private final Pq b = new Pq();
    private boolean c;
    private boolean d;
    private boolean e;
    private long f = -9223372036854775807L;
    private long g = -9223372036854775807L;
    private long h = -9223372036854775807L;

    Co() {
    }

    public int a(C0313an anVar, C1332gn gnVar, int i) throws IOException, InterruptedException {
        if (i <= 0) {
            return a(anVar);
        }
        if (!this.e) {
            return c(anVar, gnVar, i);
        }
        if (this.g == -9223372036854775807L) {
            return a(anVar);
        }
        if (!this.d) {
            return b(anVar, gnVar, i);
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

    private int b(C0313an anVar, C1332gn gnVar, int i) throws IOException, InterruptedException {
        int min = (int) Math.min(112800, anVar.getLength());
        long j = (long) 0;
        if (anVar.getPosition() != j) {
            gnVar.a = j;
            return 1;
        }
        this.b.c(min);
        anVar.a();
        anVar.a(this.b.a, 0, min);
        this.f = a(this.b, i);
        this.d = true;
        return 0;
    }

    private int c(C0313an anVar, C1332gn gnVar, int i) throws IOException, InterruptedException {
        long length = anVar.getLength();
        int min = (int) Math.min(112800, length);
        long j = length - ((long) min);
        if (anVar.getPosition() != j) {
            gnVar.a = j;
            return 1;
        }
        this.b.c(min);
        anVar.a();
        anVar.a(this.b.a, 0, min);
        this.g = b(this.b, i);
        this.e = true;
        return 0;
    }

    private long b(Pq pq, int i) {
        int c2 = pq.c();
        int d2 = pq.d();
        while (true) {
            d2--;
            if (d2 < c2) {
                return -9223372036854775807L;
            }
            if (pq.a[d2] == 71) {
                long a2 = Fo.a(pq, d2, i);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
    }

    public long a() {
        return this.h;
    }

    private int a(C0313an anVar) {
        this.b.a(C0471ar.f);
        this.c = true;
        anVar.a();
        return 0;
    }

    private long a(Pq pq, int i) {
        int d2 = pq.d();
        for (int c2 = pq.c(); c2 < d2; c2++) {
            if (pq.a[c2] == 71) {
                long a2 = Fo.a(pq, c2, i);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }
}
