package com.google.android.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* compiled from: Mp4Extractor */
public final class k implements _m, C1363hn {
    public static final C0529cn a = b.a;
    private static final int b = C0471ar.b("qt  ");
    private final int c;
    private final Pq d;
    private final Pq e;
    private final Pq f;
    private final Pq g;
    private final ArrayDeque<a> h;
    private int i;
    private int j;
    private long k;
    private int l;
    private Pq m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private C0498bn r;
    private a[] s;
    private long[][] t;
    private int u;
    private long v;
    private boolean w;

    /* compiled from: Mp4Extractor */
    private static final class a {
        public final n a;
        public final q b;
        public final C1424jn c;
        public int d;

        public a(n nVar, q qVar, C1424jn jnVar) {
            this.a = nVar;
            this.b = qVar;
            this.c = jnVar;
        }
    }

    public k() {
        this(0);
    }

    private boolean b(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        boolean z;
        long j2 = this.k - ((long) this.l);
        long position = anVar.getPosition() + j2;
        Pq pq = this.m;
        if (pq != null) {
            anVar.readFully(pq.a, this.l, (int) j2);
            if (this.j == c.a) {
                this.w = a(this.m);
            } else if (!this.h.isEmpty()) {
                ((a) this.h.peek()).a(new b(this.j, this.m));
            }
        } else if (j2 < PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            anVar.c((int) j2);
        } else {
            gnVar.a = anVar.getPosition() + j2;
            z = true;
            d(position);
            if (z || this.i == 2) {
                return false;
            }
            return true;
        }
        z = false;
        d(position);
        if (z) {
        }
        return false;
    }

    static /* synthetic */ _m[] d() {
        return new _m[]{new k()};
    }

    private void e() {
        this.i = 0;
        this.l = 0;
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        return m.b(anVar);
    }

    public boolean b() {
        return true;
    }

    public long c() {
        return this.v;
    }

    public void release() {
    }

    public k(int i2) {
        this.c = i2;
        this.g = new Pq(16);
        this.h = new ArrayDeque<>();
        this.d = new Pq(Mq.a);
        this.e = new Pq(4);
        this.f = new Pq();
        this.n = -1;
    }

    private boolean c(C0313an anVar) throws IOException, InterruptedException {
        if (this.l == 0) {
            if (!anVar.b(this.g.a, 0, 8, true)) {
                return false;
            }
            this.l = 8;
            this.g.e(0);
            this.k = this.g.v();
            this.j = this.g.h();
        }
        long j2 = this.k;
        if (j2 == 1) {
            anVar.readFully(this.g.a, 8, 8);
            this.l += 8;
            this.k = this.g.y();
        } else if (j2 == 0) {
            long length = anVar.getLength();
            if (length == -1 && !this.h.isEmpty()) {
                length = ((a) this.h.peek()).gb;
            }
            if (length != -1) {
                this.k = (length - anVar.getPosition()) + ((long) this.l);
            }
        }
        if (this.k >= ((long) this.l)) {
            if (a(this.j)) {
                long position = (anVar.getPosition() + this.k) - ((long) this.l);
                this.h.push(new a(this.j, position));
                if (this.k == ((long) this.l)) {
                    d(position);
                } else {
                    if (this.j == c.Oa) {
                        b(anVar);
                    }
                    e();
                }
            } else if (b(this.j)) {
                C1852xq.b(this.l == 8);
                C1852xq.b(this.k <= 2147483647L);
                this.m = new Pq((int) this.k);
                System.arraycopy(this.g.a, 0, this.m.a, 0, 8);
                this.i = 1;
            } else {
                this.m = null;
                this.i = 1;
            }
            return true;
        }
        throw new H("Atom size less than header length (unsupported).");
    }

    private void d(long j2) throws H {
        while (!this.h.isEmpty() && ((a) this.h.peek()).gb == j2) {
            a aVar = (a) this.h.pop();
            if (aVar.fb == c.Q) {
                a(aVar);
                this.h.clear();
                this.i = 2;
            } else if (!this.h.isEmpty()) {
                ((a) this.h.peek()).a(aVar);
            }
        }
        if (this.i != 2) {
            e();
        }
    }

    public void a(C0498bn bnVar) {
        this.r = bnVar;
    }

    private void e(long j2) {
        a[] aVarArr;
        for (a aVar : this.s) {
            q qVar = aVar.b;
            int a2 = qVar.a(j2);
            if (a2 == -1) {
                a2 = qVar.b(j2);
            }
            aVar.d = a2;
        }
    }

    public void a(long j2, long j3) {
        this.h.clear();
        this.l = 0;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        this.q = false;
        if (j2 == 0) {
            e();
        } else if (this.s != null) {
            e(j3);
        }
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        while (true) {
            int i2 = this.i;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return c(anVar, gnVar);
                    }
                    throw new IllegalStateException();
                } else if (b(anVar, gnVar)) {
                    return 1;
                }
            } else if (!c(anVar)) {
                return -1;
            }
        }
    }

    private void b(C0313an anVar) throws IOException, InterruptedException {
        this.f.c(8);
        anVar.a(this.f.a, 0, 8);
        this.f.f(4);
        if (this.f.h() == c.fa) {
            anVar.a();
        } else {
            anVar.c(4);
        }
    }

    public defpackage.C1363hn.a a(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        a[] aVarArr = this.s;
        if (aVarArr.length == 0) {
            return new defpackage.C1363hn.a(C1393in.a);
        }
        int i2 = this.u;
        if (i2 != -1) {
            q qVar = aVarArr[i2].b;
            int a2 = a(qVar, j2);
            if (a2 == -1) {
                return new defpackage.C1363hn.a(C1393in.a);
            }
            long j7 = qVar.f[a2];
            j3 = qVar.c[a2];
            if (j7 < j2 && a2 < qVar.b - 1) {
                int b2 = qVar.b(j2);
                if (!(b2 == -1 || b2 == a2)) {
                    j5 = qVar.f[b2];
                    j6 = qVar.c[b2];
                    j4 = j6;
                    j2 = j7;
                }
            }
            j6 = -1;
            j5 = -9223372036854775807L;
            j4 = j6;
            j2 = j7;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr2 = this.s;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.u) {
                q qVar2 = aVarArr2[i3].b;
                long a3 = a(qVar2, j2, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = a(qVar2, j5, j4);
                }
                j3 = a3;
            }
            i3++;
        }
        C1393in inVar = new C1393in(j2, j3);
        if (j5 == -9223372036854775807L) {
            return new defpackage.C1363hn.a(inVar);
        }
        return new defpackage.C1363hn.a(inVar, new C1393in(j5, j4));
    }

    private static boolean b(int i2) {
        return i2 == c.ea || i2 == c.R || i2 == c.fa || i2 == c.ga || i2 == c.za || i2 == c.Aa || i2 == c.Ba || i2 == c.da || i2 == c.Ca || i2 == c.Da || i2 == c.Ea || i2 == c.Fa || i2 == c.Ga || i2 == c.ba || i2 == c.a || i2 == c.Na || i2 == c.Pa || i2 == c.Qa;
    }

    private int c(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        long position = anVar.getPosition();
        if (this.n == -1) {
            this.n = c(position);
            int i2 = this.n;
            if (i2 == -1) {
                return -1;
            }
            this.q = "audio/ac4".equals(this.s[i2].a.f.i);
        }
        a aVar = this.s[this.n];
        C1424jn jnVar = aVar.c;
        int i3 = aVar.d;
        q qVar = aVar.b;
        long j2 = qVar.c[i3];
        int i4 = qVar.d[i3];
        long j3 = (j2 - position) + ((long) this.o);
        if (j3 < 0 || j3 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            gnVar.a = j2;
            return 1;
        }
        if (aVar.a.g == 1) {
            j3 += 8;
            i4 -= 8;
        }
        anVar.c((int) j3);
        int i5 = aVar.a.j;
        if (i5 == 0) {
            if (this.q) {
                C1423jm.a(i4, this.f);
                int d2 = this.f.d();
                jnVar.a(this.f, d2);
                i4 += d2;
                this.o += d2;
                this.q = false;
            }
            while (true) {
                int i6 = this.o;
                if (i6 >= i4) {
                    break;
                }
                int a2 = jnVar.a(anVar, i4 - i6, false);
                this.o += a2;
                this.p -= a2;
            }
        } else {
            byte[] bArr = this.e.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i7 = 4 - i5;
            while (this.o < i4) {
                int i8 = this.p;
                if (i8 == 0) {
                    anVar.readFully(bArr, i7, i5);
                    this.e.e(0);
                    int h2 = this.e.h();
                    if (h2 >= 0) {
                        this.p = h2;
                        this.d.e(0);
                        jnVar.a(this.d, 4);
                        this.o += 4;
                        i4 += i7;
                    } else {
                        throw new H("Invalid NAL length");
                    }
                } else {
                    int a3 = jnVar.a(anVar, i8, false);
                    this.o += a3;
                    this.p -= a3;
                }
            }
        }
        int i9 = i4;
        q qVar2 = aVar.b;
        jnVar.a(qVar2.f[i3], qVar2.g[i3], i9, 0, null);
        aVar.d++;
        this.n = -1;
        this.o = 0;
        this.p = 0;
        return 0;
    }

    private void a(a aVar) throws H {
        Metadata metadata;
        long j2;
        q qVar;
        a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        C1240dn dnVar = new C1240dn();
        b e2 = aVar2.e(c.Na);
        Metadata metadata2 = null;
        if (e2 != null) {
            metadata = d.a(e2, this.w);
            if (metadata != null) {
                dnVar.a(metadata);
            }
        } else {
            metadata = null;
        }
        a d2 = aVar2.d(c.Oa);
        if (d2 != null) {
            metadata2 = d.a(d2);
        }
        ArrayList a2 = a(aVar2, dnVar, (this.c & 1) != 0);
        int size = a2.size();
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        int i2 = 0;
        int i3 = -1;
        while (i2 < size) {
            q qVar2 = (q) a2.get(i2);
            n nVar = qVar2.a;
            q qVar3 = qVar2;
            long j5 = nVar.e;
            if (j5 != j3) {
                j2 = j5;
                qVar = qVar3;
            } else {
                qVar = qVar3;
                j2 = qVar.h;
            }
            long max = Math.max(j4, j2);
            ArrayList arrayList2 = a2;
            int i4 = size;
            a aVar3 = new a(nVar, qVar, this.r.a(i2, nVar.b));
            Format b2 = nVar.f.b(qVar.e + 30);
            long j6 = max;
            if (nVar.b == 2 && j2 > 0) {
                int i5 = qVar.b;
                if (i5 > 1) {
                    b2 = b2.a(((float) i5) / (((float) j2) / 1000000.0f));
                }
            }
            aVar3.c.a(j.a(nVar.b, b2, metadata, metadata2, dnVar));
            if (nVar.b == 2) {
                if (i3 == -1) {
                    i3 = arrayList.size();
                }
            }
            arrayList.add(aVar3);
            i2++;
            a2 = arrayList2;
            size = i4;
            j4 = j6;
            j3 = -9223372036854775807L;
        }
        this.u = i3;
        this.v = j4;
        this.s = (a[]) arrayList.toArray(new a[0]);
        this.t = a(this.s);
        this.r.g();
        this.r.a(this);
    }

    private ArrayList<q> a(a aVar, C1240dn dnVar, boolean z) throws H {
        ArrayList<q> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < aVar.ib.size(); i2++) {
            a aVar2 = (a) aVar.ib.get(i2);
            if (aVar2.fb == c.S) {
                n a2 = d.a(aVar2, aVar.e(c.R), -9223372036854775807L, (DrmInitData) null, z, this.w);
                if (a2 != null) {
                    q a3 = d.a(a2, aVar2.d(c.T).d(c.U).d(c.V), dnVar);
                    if (a3.b != 0) {
                        arrayList.add(a3);
                    }
                }
            }
        }
        return arrayList;
    }

    private int c(long j2) {
        int i2 = 0;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        long j4 = Long.MAX_VALUE;
        int i3 = -1;
        int i4 = -1;
        boolean z2 = true;
        long j5 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.s;
            if (i2 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i2];
            int i5 = aVar.d;
            q qVar = aVar.b;
            if (i5 != qVar.b) {
                long j6 = qVar.c[i5];
                long j7 = this.t[i2][i5];
                long j8 = j6 - j2;
                boolean z3 = j8 < 0 || j8 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j8 < j5)) {
                    z2 = z3;
                    i4 = i2;
                    j5 = j8;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z = z3;
                    i3 = i2;
                    j3 = j7;
                }
            }
            i2++;
        }
        return (j3 == Long.MAX_VALUE || !z || j4 < j3 + 10485760) ? i4 : i3;
    }

    private static long[][] a(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].b.b];
            jArr2[i2] = aVarArr[i2].b.f[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            int i4 = -1;
            long j3 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j3) {
                    j3 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j2;
            j2 += (long) aVarArr[i4].b.d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].b.f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    private static long a(q qVar, long j2, long j3) {
        int a2 = a(qVar, j2);
        if (a2 == -1) {
            return j3;
        }
        return Math.min(qVar.c[a2], j3);
    }

    private static int a(q qVar, long j2) {
        int a2 = qVar.a(j2);
        return a2 == -1 ? qVar.b(j2) : a2;
    }

    private static boolean a(Pq pq) {
        pq.e(8);
        if (pq.h() == b) {
            return true;
        }
        pq.f(4);
        while (pq.a() > 0) {
            if (pq.h() == b) {
                return true;
            }
        }
        return false;
    }

    private static boolean a(int i2) {
        return i2 == c.Q || i2 == c.S || i2 == c.T || i2 == c.U || i2 == c.V || i2 == c.ca || i2 == c.Oa;
    }
}
