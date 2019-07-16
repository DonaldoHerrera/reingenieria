package com.google.android.exoplayer2.extractor.mp4;

/* compiled from: TrackSampleTable */
final class q {
    public final n a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public q(n nVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        C1852xq.a(iArr.length == jArr2.length);
        C1852xq.a(jArr.length == jArr2.length);
        if (iArr2.length == jArr2.length) {
            z = true;
        }
        C1852xq.a(z);
        this.a = nVar;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int b2 = C0471ar.b(this.f, j, true, false); b2 >= 0; b2--) {
            if ((this.g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int a2 = C0471ar.a(this.f, j, true, false); a2 < this.f.length; a2++) {
            if ((this.g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }
}
