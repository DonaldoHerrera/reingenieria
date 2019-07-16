package com.google.android.exoplayer2.extractor.mp4;

import java.io.IOException;

/* compiled from: TrackFragment */
final class p {
    public e a;
    public long b;
    public long c;
    public long d;
    public int e;
    public int f;
    public long[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public long[] k;
    public boolean[] l;
    public boolean m;
    public boolean[] n;
    public o o;
    public int p;
    public Pq q;
    public boolean r;
    public long s;

    p() {
    }

    public void a() {
        this.e = 0;
        this.s = 0;
        this.m = false;
        this.r = false;
        this.o = null;
    }

    public void b(int i2) {
        Pq pq = this.q;
        if (pq == null || pq.d() < i2) {
            this.q = new Pq(i2);
        }
        this.p = i2;
        this.m = true;
        this.r = true;
    }

    public boolean c(int i2) {
        return this.m && this.n[i2];
    }

    public void a(int i2, int i3) {
        this.e = i2;
        this.f = i3;
        int[] iArr = this.h;
        if (iArr == null || iArr.length < i2) {
            this.g = new long[i2];
            this.h = new int[i2];
        }
        int[] iArr2 = this.i;
        if (iArr2 == null || iArr2.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.i = new int[i4];
            this.j = new int[i4];
            this.k = new long[i4];
            this.l = new boolean[i4];
            this.n = new boolean[i4];
        }
    }

    public void a(C0313an anVar) throws IOException, InterruptedException {
        anVar.readFully(this.q.a, 0, this.p);
        this.q.e(0);
        this.r = false;
    }

    public void a(Pq pq) {
        pq.a(this.q.a, 0, this.p);
        this.q.e(0);
        this.r = false;
    }

    public long a(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }
}
