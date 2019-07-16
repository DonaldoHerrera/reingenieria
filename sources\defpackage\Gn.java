package defpackage;

/* renamed from: Gn reason: default package */
/* compiled from: VbriSeeker */
final class Gn implements a {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;

    private Gn(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    public static Gn a(long j, long j2, C1301fn fnVar, Pq pq) {
        int i;
        long j3 = j;
        C1301fn fnVar2 = fnVar;
        Pq pq2 = pq;
        pq2.f(10);
        int h = pq.h();
        if (h <= 0) {
            return null;
        }
        int i2 = fnVar2.k;
        long c2 = C0471ar.c((long) h, 1000000 * ((long) (i2 >= 32000 ? 1152 : 576)), (long) i2);
        int z = pq.z();
        int z2 = pq.z();
        int z3 = pq.z();
        pq2.f(2);
        long j4 = j2 + ((long) fnVar2.j);
        long[] jArr = new long[z];
        long[] jArr2 = new long[z];
        int i3 = 0;
        long j5 = j2;
        while (i3 < z) {
            int i4 = z2;
            long j6 = j4;
            jArr[i3] = (((long) i3) * c2) / ((long) z);
            long j7 = j6;
            jArr2[i3] = Math.max(j5, j7);
            if (z3 == 1) {
                i = pq.t();
            } else if (z3 == 2) {
                i = pq.z();
            } else if (z3 == 3) {
                i = pq.w();
            } else if (z3 != 4) {
                return null;
            } else {
                i = pq.x();
            }
            j5 += (long) (i * i4);
            i3++;
            j4 = j7;
            z2 = i4;
        }
        if (!(j3 == -1 || j3 == j5)) {
            StringBuilder sb = new StringBuilder();
            sb.append("VBRI data size mismatch: ");
            sb.append(j3);
            sb.append(", ");
            sb.append(j5);
            Iq.d("VbriSeeker", sb.toString());
        }
        Gn gn = new Gn(jArr, jArr2, c2, j5);
        return gn;
    }

    public long b(long j) {
        return this.a[C0471ar.b(this.b, j, true, true)];
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.c;
    }

    public a a(long j) {
        int b2 = C0471ar.b(this.a, j, true, true);
        C1393in inVar = new C1393in(this.a[b2], this.b[b2]);
        if (inVar.b < j) {
            long[] jArr = this.a;
            if (b2 != jArr.length - 1) {
                int i = b2 + 1;
                return new a(inVar, new C1393in(jArr[i], this.b[i]));
            }
        }
        return new a(inVar);
    }

    public long a() {
        return this.d;
    }
}
