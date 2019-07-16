package defpackage;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* renamed from: Hn reason: default package */
/* compiled from: XingSeeker */
final class Hn implements a {
    private final long a;
    private final int b;
    private final long c;
    private final long d;
    private final long e;
    private final long[] f;

    private Hn(long j, int i, long j2) {
        this(j, i, j2, -1, null);
    }

    public static Hn a(long j, long j2, C1301fn fnVar, Pq pq) {
        long j3 = j;
        C1301fn fnVar2 = fnVar;
        int i = fnVar2.n;
        int i2 = fnVar2.k;
        int h = pq.h();
        if ((h & 1) == 1) {
            int x = pq.x();
            if (x != 0) {
                long c2 = C0471ar.c((long) x, ((long) i) * 1000000, (long) i2);
                if ((h & 6) != 6) {
                    Hn hn = new Hn(j2, fnVar2.j, c2);
                    return hn;
                }
                long x2 = (long) pq.x();
                long[] jArr = new long[100];
                for (int i3 = 0; i3 < 100; i3++) {
                    jArr[i3] = (long) pq.t();
                }
                if (j3 != -1) {
                    long j4 = j2 + x2;
                    if (j3 != j4) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XING data size mismatch: ");
                        sb.append(j3);
                        sb.append(", ");
                        sb.append(j4);
                        Iq.d("XingSeeker", sb.toString());
                    }
                }
                Hn hn2 = new Hn(j2, fnVar2.j, c2, x2, jArr);
                return hn2;
            }
        }
        return null;
    }

    public boolean b() {
        return this.f != null;
    }

    public long c() {
        return this.c;
    }

    private Hn(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        long j4 = -1;
        if (j3 != -1) {
            j4 = j + j3;
        }
        this.e = j4;
    }

    public long b(long j) {
        long j2;
        long j3 = j - this.a;
        if (!b() || j3 <= ((long) this.b)) {
            return 0;
        }
        long[] jArr = this.f;
        C1852xq.a(jArr);
        long[] jArr2 = jArr;
        double d2 = (((double) j3) * 256.0d) / ((double) this.d);
        int b2 = C0471ar.b(jArr2, (long) d2, true, true);
        long a2 = a(b2);
        long j4 = jArr2[b2];
        int i = b2 + 1;
        long a3 = a(i);
        if (b2 == 99) {
            j2 = 256;
        } else {
            j2 = jArr2[i];
        }
        return a2 + Math.round((j4 == j2 ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : (d2 - ((double) j4)) / ((double) (j2 - j4))) * ((double) (a3 - a2)));
    }

    public a a(long j) {
        double d2;
        if (!b()) {
            return new a(new C1393in(0, this.a + ((long) this.b)));
        }
        long b2 = C0471ar.b(j, 0, this.c);
        double d3 = (((double) b2) * 100.0d) / ((double) this.c);
        double d4 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        if (d3 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            if (d3 >= 100.0d) {
                d4 = 256.0d;
            } else {
                int i = (int) d3;
                long[] jArr = this.f;
                C1852xq.a(jArr);
                long[] jArr2 = jArr;
                double d5 = (double) jArr2[i];
                if (i == 99) {
                    d2 = 256.0d;
                } else {
                    d2 = (double) jArr2[i + 1];
                }
                d4 = d5 + ((d3 - ((double) i)) * (d2 - d5));
            }
        }
        return new a(new C1393in(b2, this.a + C0471ar.b(Math.round((d4 / 256.0d) * ((double) this.d)), (long) this.b, this.d - 1)));
    }

    public long a() {
        return this.e;
    }

    private long a(int i) {
        return (this.c * ((long) i)) / 100;
    }
}
