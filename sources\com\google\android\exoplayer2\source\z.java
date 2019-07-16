package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.X;
import com.google.android.exoplayer2.X.a;
import com.google.android.exoplayer2.X.b;

/* compiled from: SinglePeriodTimeline */
public final class z extends X {
    private static final Object b = new Object();
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final boolean i;
    private final boolean j;
    private final Object k;

    public z(long j2, boolean z, boolean z2, Object obj) {
        this(j2, j2, 0, 0, z, z2, obj);
    }

    public int a() {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r1 > r7) goto L_0x0027;
     */
    public b a(int i2, b bVar, boolean z, long j2) {
        long j3;
        C1852xq.a(i2, 0, 1);
        Object obj = z ? this.k : null;
        long j4 = this.h;
        if (this.j && j2 != 0) {
            long j5 = this.f;
            if (j5 != -9223372036854775807L) {
                j4 += j2;
            }
            j3 = -9223372036854775807L;
            bVar.a(obj, this.c, this.d, this.i, this.j, j3, this.f, 0, 0, this.g);
            return bVar;
        }
        j3 = j4;
        bVar.a(obj, this.c, this.d, this.i, this.j, j3, this.f, 0, 0, this.g);
        return bVar;
    }

    public int b() {
        return 1;
    }

    public z(long j2, long j3, long j4, long j5, boolean z, boolean z2, Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2, obj);
    }

    public z(long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj) {
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.i = z;
        this.j = z2;
        this.k = obj;
    }

    public a a(int i2, a aVar, boolean z) {
        C1852xq.a(i2, 0, 1);
        aVar.a(null, z ? b : null, 0, this.e, -this.g);
        return aVar;
    }

    public int a(Object obj) {
        return b.equals(obj) ? 0 : -1;
    }

    public Object a(int i2) {
        C1852xq.a(i2, 0, 1);
        return b;
    }
}
