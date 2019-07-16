package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: AdaptiveTrackSelection */
public class c extends e {
    private final a g;
    private final long h;
    private final long i;
    private final long j;
    private final float k;
    private final long l;
    private final C1882yq m;
    private final Format[] n;
    private final int[] o;
    private final int[] p;
    private j q;
    private float r;
    private int s;
    private int t;
    private long u;

    /* compiled from: AdaptiveTrackSelection */
    private interface a {
    }

    /* compiled from: AdaptiveTrackSelection */
    private static final class b implements a {
        private final Up a;
        private final float b;
        private long c;
        private long[][] d;

        b(Up up, float f) {
            this.a = up;
            this.b = f;
        }

        /* access modifiers changed from: 0000 */
        public void a(long j) {
            this.c = j;
        }

        /* access modifiers changed from: 0000 */
        public void a(long[][] jArr) {
            C1852xq.a(jArr.length >= 2);
            this.d = jArr;
        }
    }

    /* renamed from: com.google.android.exoplayer2.trackselection.c$c reason: collision with other inner class name */
    /* compiled from: AdaptiveTrackSelection */
    public static class C0035c implements com.google.android.exoplayer2.trackselection.l.b {
        private final Up a;
        private final int b;
        private final int c;
        private final int d;
        private final float e;
        private final float f;
        private final long g;
        private final C1882yq h;
        private j i;
        private boolean j;

        @Deprecated
        public C0035c(Up up) {
            this(up, 10000, 25000, 25000, 0.75f, 0.75f, 2000, C1882yq.a);
        }

        public final l[] a(com.google.android.exoplayer2.trackselection.l.a[] aVarArr, Up up) {
            Up up2 = this.a;
            if (up2 != null) {
                up = up2;
            }
            l[] lVarArr = new l[aVarArr.length];
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < aVarArr.length; i3++) {
                com.google.android.exoplayer2.trackselection.l.a aVar = aVarArr[i3];
                if (aVar != null) {
                    int[] iArr = aVar.b;
                    if (iArr.length > 1) {
                        c a2 = a(aVar.a, up, iArr);
                        a2.a(this.i);
                        arrayList.add(a2);
                        lVarArr[i3] = a2;
                    } else {
                        lVarArr[i3] = new h(aVar.a, iArr[0], aVar.c, aVar.d);
                        int i4 = aVar.a.a(aVar.b[0]).e;
                        if (i4 != -1) {
                            i2 += i4;
                        }
                    }
                }
            }
            if (this.j) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    ((c) arrayList.get(i5)).a((long) i2);
                }
            }
            if (arrayList.size() > 1) {
                long[][] jArr = new long[arrayList.size()][];
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    c cVar = (c) arrayList.get(i6);
                    jArr[i6] = new long[cVar.length()];
                    for (int i7 = 0; i7 < cVar.length(); i7++) {
                        jArr[i6][i7] = (long) cVar.a((cVar.length() - i7) - 1).e;
                    }
                }
                long[][][] a3 = c.c(jArr);
                for (int i8 = 0; i8 < arrayList.size(); i8++) {
                    ((c) arrayList.get(i8)).b(a3[i8]);
                }
            }
            return lVarArr;
        }

        @Deprecated
        public C0035c(Up up, int i2, int i3, int i4, float f2, float f3, long j2, C1882yq yqVar) {
            this.a = up;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = f2;
            this.f = f3;
            this.g = j2;
            this.h = yqVar;
            this.i = j.a;
        }

        /* access modifiers changed from: protected */
        public c a(TrackGroup trackGroup, Up up, int[] iArr) {
            TrackGroup trackGroup2 = trackGroup;
            int[] iArr2 = iArr;
            c cVar = new c(trackGroup2, iArr2, new b(up, this.e), (long) this.b, (long) this.c, (long) this.d, this.f, this.g, this.h);
            return cVar;
        }
    }

    /* access modifiers changed from: private */
    public static long[][][] c(long[][] jArr) {
        int i2;
        double[][] d = d(jArr);
        double[][] b2 = b(d);
        int a2 = a(b2) + 3;
        long[][][] jArr2 = (long[][][]) Array.newInstance(long.class, new int[]{d.length, a2, 2});
        int[] iArr = new int[d.length];
        a(jArr2, 1, jArr, iArr);
        int i3 = 2;
        while (true) {
            i2 = a2 - 1;
            if (i3 >= i2) {
                break;
            }
            double d2 = Double.MAX_VALUE;
            int i4 = 0;
            for (int i5 = 0; i5 < d.length; i5++) {
                if (iArr[i5] + 1 != d[i5].length) {
                    double d3 = b2[i5][iArr[i5]];
                    if (d3 < d2) {
                        i4 = i5;
                        d2 = d3;
                    }
                }
            }
            iArr[i4] = iArr[i4] + 1;
            a(jArr2, i3, jArr, iArr);
            i3++;
        }
        for (long[][] jArr3 : jArr2) {
            int i6 = a2 - 2;
            jArr3[i2][0] = jArr3[i6][0] * 2;
            jArr3[i2][1] = jArr3[i6][1] * 2;
        }
        return jArr2;
    }

    private static double[][] d(long[][] jArr) {
        double[][] dArr = new double[jArr.length][];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            dArr[i2] = new double[jArr[i2].length];
            for (int i3 = 0; i3 < jArr[i2].length; i3++) {
                dArr[i2][i3] = Math.log((double) jArr[i2][i3]);
            }
        }
        return dArr;
    }

    public void b(long[][] jArr) {
        ((b) this.g).a(jArr);
    }

    public void e() {
        this.u = -9223372036854775807L;
    }

    private c(TrackGroup trackGroup, int[] iArr, a aVar, long j2, long j3, long j4, float f, long j5, C1882yq yqVar) {
        super(trackGroup, iArr);
        this.g = aVar;
        this.h = j2 * 1000;
        this.i = j3 * 1000;
        this.j = j4 * 1000;
        this.k = f;
        this.l = j5;
        this.m = yqVar;
        this.r = 1.0f;
        this.t = 0;
        this.u = -9223372036854775807L;
        this.q = j.a;
        int i2 = this.b;
        this.n = new Format[i2];
        this.o = new int[i2];
        this.p = new int[i2];
        for (int i3 = 0; i3 < this.b; i3++) {
            Format a2 = a(i3);
            Format[] formatArr = this.n;
            formatArr[i3] = a2;
            this.o[i3] = formatArr[i3].e;
        }
    }

    public void a(j jVar) {
        this.q = jVar;
    }

    private static double[][] b(double[][] dArr) {
        double[][] dArr2 = new double[dArr.length][];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = new double[(dArr[i2].length - 1)];
            if (dArr2[i2].length != 0) {
                double d = dArr[i2][dArr[i2].length - 1] - dArr[i2][0];
                int i3 = 0;
                while (i3 < dArr[i2].length - 1) {
                    int i4 = i3 + 1;
                    dArr2[i2][i3] = (((dArr[i2][i3] + dArr[i2][i4]) * 0.5d) - dArr[i2][0]) / d;
                    i3 = i4;
                }
            }
        }
        return dArr2;
    }

    public void a(long j2) {
        ((b) this.g).a(j2);
    }

    public void a(float f) {
        this.r = f;
    }

    public int a() {
        return this.s;
    }

    private static int a(double[][] dArr) {
        int i2 = 0;
        for (double[] length : dArr) {
            i2 += length.length;
        }
        return i2;
    }

    private static void a(long[][][] jArr, int i2, long[][] jArr2, int[] iArr) {
        long j2 = 0;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            jArr[i3][i2][1] = jArr2[i3][iArr[i3]];
            j2 += jArr[i3][i2][1];
        }
        for (long[][] jArr3 : jArr) {
            jArr3[i2][0] = j2;
        }
    }
}
