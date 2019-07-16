package com.google.android.exoplayer2.extractor.mp4;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.C0615o;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmInitData.SchemeData;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: FragmentedMp4Extractor */
public class h implements _m {
    public static final C0529cn a = a.a;
    private static final int b = C0471ar.b("seig");
    private static final byte[] c = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final Format d = Format.a(null, "application/x-emsg", Long.MAX_VALUE);
    private long A;
    private long B;
    private long C;
    private b D;
    private int E;
    private int F;
    private int G;
    private boolean H;
    private boolean I;
    private C0498bn J;
    private C1424jn[] K;
    private C1424jn[] L;
    private boolean M;
    private final int e;
    private final n f;
    private final List<Format> g;
    private final DrmInitData h;
    private final SparseArray<b> i;
    private final Pq j;
    private final Pq k;
    private final Pq l;
    private final byte[] m;
    private final Pq n;
    private final Zq o;
    private final Pq p;
    private final ArrayDeque<a> q;
    private final ArrayDeque<a> r;
    private final C1424jn s;
    private int t;
    private int u;
    private long v;
    private int w;
    private Pq x;
    private long y;
    private int z;

    /* compiled from: FragmentedMp4Extractor */
    private static final class a {
        public final long a;
        public final int b;

        public a(long j, int i) {
            this.a = j;
            this.b = i;
        }
    }

    /* compiled from: FragmentedMp4Extractor */
    private static final class b {
        public final C1424jn a;
        public final p b = new p();
        public n c;
        public e d;
        public int e;
        public int f;
        public int g;
        public int h;
        private final Pq i = new Pq(1);
        private final Pq j = new Pq();

        public b(C1424jn jnVar) {
            this.a = jnVar;
        }

        /* access modifiers changed from: private */
        public o d() {
            p pVar = this.b;
            int i2 = pVar.a.a;
            o oVar = pVar.o;
            if (oVar == null) {
                oVar = this.c.a(i2);
            }
            if (oVar == null || !oVar.a) {
                return null;
            }
            return oVar;
        }

        /* access modifiers changed from: private */
        public void e() {
            o d2 = d();
            if (d2 != null) {
                Pq pq = this.b.q;
                int i2 = d2.d;
                if (i2 != 0) {
                    pq.f(i2);
                }
                if (this.b.c(this.e)) {
                    pq.f(pq.z() * 6);
                }
            }
        }

        public void c() {
            this.b.a();
            this.e = 0;
            this.g = 0;
            this.f = 0;
            this.h = 0;
        }

        public void a(n nVar, e eVar) {
            C1852xq.a(nVar);
            this.c = nVar;
            C1852xq.a(eVar);
            this.d = eVar;
            this.a.a(nVar.f);
            c();
        }

        public int b() {
            Pq pq;
            int i2;
            o d2 = d();
            if (d2 == null) {
                return 0;
            }
            int i3 = d2.d;
            if (i3 != 0) {
                int i4 = i3;
                pq = this.b.q;
                i2 = i4;
            } else {
                byte[] bArr = d2.e;
                this.j.a(bArr, bArr.length);
                pq = this.j;
                i2 = bArr.length;
            }
            boolean c2 = this.b.c(this.e);
            this.i.a[0] = (byte) ((c2 ? 128 : 0) | i2);
            this.i.e(0);
            this.a.a(this.i, 1);
            this.a.a(pq, i2);
            if (!c2) {
                return i2 + 1;
            }
            Pq pq2 = this.b.q;
            int z = pq2.z();
            pq2.f(-2);
            int i5 = (z * 6) + 2;
            this.a.a(pq2, i5);
            return i2 + 1 + i5;
        }

        public void a(DrmInitData drmInitData) {
            o a2 = this.c.a(this.b.a.a);
            this.a.a(this.c.f.a(drmInitData.a(a2 != null ? a2.b : null)));
        }

        public void a(long j2) {
            long b2 = C0615o.b(j2);
            int i2 = this.e;
            while (true) {
                p pVar = this.b;
                if (i2 < pVar.f && pVar.a(i2) < b2) {
                    if (this.b.l[i2]) {
                        this.h = i2;
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }

        public boolean a() {
            this.e++;
            this.f++;
            int i2 = this.f;
            int[] iArr = this.b.h;
            int i3 = this.g;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.g = i3 + 1;
            this.f = 0;
            return false;
        }
    }

    public h() {
        this(0);
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new h()};
    }

    private void b() {
        this.t = 0;
        this.w = 0;
    }

    private void c(C0313an anVar) throws IOException, InterruptedException {
        int i2 = ((int) this.v) - this.w;
        Pq pq = this.x;
        if (pq != null) {
            anVar.readFully(pq.a, 8, i2);
            a(new b(this.u, this.x), anVar.getPosition());
        } else {
            anVar.c(i2);
        }
        b(anVar.getPosition());
    }

    private static Pair<Integer, e> d(Pq pq) {
        pq.e(12);
        return Pair.create(Integer.valueOf(pq.h()), new e(pq.x() - 1, pq.x(), pq.x(), pq.h()));
    }

    private boolean e(C0313an anVar) throws IOException, InterruptedException {
        defpackage.C1424jn.a aVar;
        boolean z2;
        boolean z3;
        int i2;
        C0313an anVar2 = anVar;
        int i3 = 4;
        int i4 = 1;
        int i5 = 0;
        if (this.t == 3) {
            if (this.D == null) {
                b a2 = a(this.i);
                if (a2 == null) {
                    int position = (int) (this.y - anVar.getPosition());
                    if (position >= 0) {
                        anVar2.c(position);
                        b();
                        return false;
                    }
                    throw new H("Offset to end of mdat was negative.");
                }
                int position2 = (int) (a2.b.g[a2.g] - anVar.getPosition());
                if (position2 < 0) {
                    Iq.d("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                    position2 = 0;
                }
                anVar2.c(position2);
                this.D = a2;
            }
            b bVar = this.D;
            int[] iArr = bVar.b.i;
            int i6 = bVar.e;
            this.E = iArr[i6];
            if (i6 < bVar.h) {
                anVar2.c(this.E);
                this.D.e();
                if (!this.D.a()) {
                    this.D = null;
                }
                this.t = 3;
                return true;
            }
            if (bVar.c.g == 1) {
                this.E -= 8;
                anVar2.c(8);
            }
            this.F = this.D.b();
            this.E += this.F;
            this.t = 4;
            this.G = 0;
            this.I = "audio/ac4".equals(this.D.c.f.i);
        }
        b bVar2 = this.D;
        p pVar = bVar2.b;
        n nVar = bVar2.c;
        C1424jn jnVar = bVar2.a;
        int i7 = bVar2.e;
        long a3 = pVar.a(i7) * 1000;
        Zq zq = this.o;
        if (zq != null) {
            a3 = zq.a(a3);
        }
        long j2 = a3;
        int i8 = nVar.j;
        if (i8 == 0) {
            if (this.I) {
                C1423jm.a(this.E, this.n);
                int d2 = this.n.d();
                jnVar.a(this.n, d2);
                this.E += d2;
                this.F += d2;
                z3 = false;
                this.I = false;
            } else {
                z3 = false;
            }
            while (true) {
                int i9 = this.F;
                int i10 = this.E;
                if (i9 >= i10) {
                    break;
                }
                this.F += jnVar.a(anVar2, i10 - i9, z3);
            }
        } else {
            byte[] bArr = this.k.a;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i11 = i8 + 1;
            int i12 = 4 - i8;
            while (this.F < this.E) {
                int i13 = this.G;
                if (i13 == 0) {
                    anVar2.readFully(bArr, i12, i11);
                    this.k.e(i5);
                    int h2 = this.k.h();
                    if (h2 >= i4) {
                        this.G = h2 - 1;
                        this.j.e(i5);
                        jnVar.a(this.j, i3);
                        jnVar.a(this.k, i4);
                        this.H = this.L.length > 0 && Mq.a(nVar.f.i, bArr[i3]);
                        this.F += 5;
                        this.E += i12;
                    } else {
                        throw new H("Invalid NAL length");
                    }
                } else {
                    if (this.H) {
                        this.l.c(i13);
                        anVar2.readFully(this.l.a, i5, this.G);
                        jnVar.a(this.l, this.G);
                        i2 = this.G;
                        Pq pq = this.l;
                        int c2 = Mq.c(pq.a, pq.d());
                        this.l.e("video/hevc".equals(nVar.f.i) ? 1 : 0);
                        this.l.d(c2);
                        C1519mp.a(j2, this.l, this.L);
                    } else {
                        i2 = jnVar.a(anVar2, i13, false);
                    }
                    this.F += i2;
                    this.G -= i2;
                    i3 = 4;
                    i4 = 1;
                    i5 = 0;
                }
            }
        }
        boolean z4 = pVar.l[i7];
        o b2 = this.D.d();
        if (b2 != null) {
            z2 = z4 | true;
            aVar = b2.c;
        } else {
            z2 = z4;
            aVar = null;
        }
        long j3 = j2;
        jnVar.a(j2, z2 ? 1 : 0, this.E, 0, aVar);
        a(j3);
        if (!this.D.a()) {
            this.D = null;
        }
        this.t = 3;
        return true;
    }

    /* access modifiers changed from: protected */
    public n a(n nVar) {
        return nVar;
    }

    public void release() {
    }

    public h(int i2) {
        this(i2, null);
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        return m.a(anVar);
    }

    public h(int i2, Zq zq) {
        this(i2, zq, null, null);
    }

    private boolean b(C0313an anVar) throws IOException, InterruptedException {
        if (this.w == 0) {
            if (!anVar.b(this.p.a, 0, 8, true)) {
                return false;
            }
            this.w = 8;
            this.p.e(0);
            this.v = this.p.v();
            this.u = this.p.h();
        }
        long j2 = this.v;
        if (j2 == 1) {
            anVar.readFully(this.p.a, 8, 8);
            this.w += 8;
            this.v = this.p.y();
        } else if (j2 == 0) {
            long length = anVar.getLength();
            if (length == -1 && !this.q.isEmpty()) {
                length = ((a) this.q.peek()).gb;
            }
            if (length != -1) {
                this.v = (length - anVar.getPosition()) + ((long) this.w);
            }
        }
        if (this.v >= ((long) this.w)) {
            long position = anVar.getPosition() - ((long) this.w);
            if (this.u == c.X) {
                int size = this.i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p pVar = ((b) this.i.valueAt(i2)).b;
                    pVar.b = position;
                    pVar.d = position;
                    pVar.c = position;
                }
            }
            int i3 = this.u;
            if (i3 == c.u) {
                this.D = null;
                this.y = this.v + position;
                if (!this.M) {
                    this.J.a(new defpackage.C1363hn.b(this.B, position));
                    this.M = true;
                }
                this.t = 2;
                return true;
            }
            if (a(i3)) {
                long position2 = (anVar.getPosition() + this.v) - 8;
                this.q.push(new a(this.u, position2));
                if (this.v == ((long) this.w)) {
                    b(position2);
                } else {
                    b();
                }
            } else if (b(this.u)) {
                if (this.w == 8) {
                    long j3 = this.v;
                    if (j3 <= 2147483647L) {
                        this.x = new Pq((int) j3);
                        System.arraycopy(this.p.a, 0, this.x.a, 0, 8);
                        this.t = 1;
                    } else {
                        throw new H("Leaf atom with length > 2147483647 (unsupported).");
                    }
                } else {
                    throw new H("Leaf atom defines extended atom size (unsupported).");
                }
            } else if (this.v <= 2147483647L) {
                this.x = null;
                this.t = 1;
            } else {
                throw new H("Skipping atom with length > 2147483647 (unsupported).");
            }
            return true;
        }
        throw new H("Atom size less than header length (unsupported).");
    }

    public void a(C0498bn bnVar) {
        this.J = bnVar;
        n nVar = this.f;
        if (nVar != null) {
            b bVar = new b(bnVar.a(0, nVar.b));
            bVar.a(this.f, new e(0, 0, 0, 0));
            this.i.put(0, bVar);
            c();
            this.J.g();
        }
    }

    public h(int i2, Zq zq, n nVar, DrmInitData drmInitData) {
        this(i2, zq, nVar, drmInitData, Collections.emptyList());
    }

    public h(int i2, Zq zq, n nVar, DrmInitData drmInitData, List<Format> list) {
        this(i2, zq, nVar, drmInitData, list, null);
    }

    public h(int i2, Zq zq, n nVar, DrmInitData drmInitData, List<Format> list, C1424jn jnVar) {
        this.e = i2 | (nVar != null ? 8 : 0);
        this.o = zq;
        this.f = nVar;
        this.h = drmInitData;
        this.g = Collections.unmodifiableList(list);
        this.s = jnVar;
        this.p = new Pq(16);
        this.j = new Pq(Mq.a);
        this.k = new Pq(5);
        this.l = new Pq();
        this.m = new byte[16];
        this.n = new Pq(this.m);
        this.q = new ArrayDeque<>();
        this.r = new ArrayDeque<>();
        this.i = new SparseArray<>();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = -9223372036854775807L;
        b();
    }

    private void c(a aVar) throws H {
        int i2;
        int i3;
        a aVar2 = aVar;
        boolean z2 = true;
        int i4 = 0;
        C1852xq.b(this.f == null, "Unexpected moov box.");
        DrmInitData drmInitData = this.h;
        if (drmInitData == null) {
            drmInitData = a(aVar2.hb);
        }
        a d2 = aVar2.d(c.Z);
        SparseArray sparseArray = new SparseArray();
        int size = d2.hb.size();
        long j2 = -9223372036854775807L;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar = (b) d2.hb.get(i5);
            int i6 = bVar.fb;
            if (i6 == c.N) {
                Pair d3 = d(bVar.gb);
                sparseArray.put(((Integer) d3.first).intValue(), d3.second);
            } else if (i6 == c.aa) {
                j2 = b(bVar.gb);
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = aVar2.ib.size();
        int i7 = 0;
        while (i7 < size2) {
            a aVar3 = (a) aVar2.ib.get(i7);
            if (aVar3.fb == c.S) {
                i2 = i7;
                i3 = size2;
                n a2 = d.a(aVar3, aVar2.e(c.R), j2, drmInitData, (this.e & 16) != 0, false);
                a(a2);
                if (a2 != null) {
                    sparseArray2.put(a2.a, a2);
                }
            } else {
                i2 = i7;
                i3 = size2;
            }
            i7 = i2 + 1;
            size2 = i3;
        }
        int size3 = sparseArray2.size();
        if (this.i.size() == 0) {
            while (i4 < size3) {
                n nVar = (n) sparseArray2.valueAt(i4);
                b bVar2 = new b(this.J.a(i4, nVar.b));
                bVar2.a(nVar, a(sparseArray, nVar.a));
                this.i.put(nVar.a, bVar2);
                this.B = Math.max(this.B, nVar.e);
                i4++;
            }
            c();
            this.J.g();
            return;
        }
        if (this.i.size() != size3) {
            z2 = false;
        }
        C1852xq.b(z2);
        while (i4 < size3) {
            n nVar2 = (n) sparseArray2.valueAt(i4);
            ((b) this.i.get(nVar2.a)).a(nVar2, a(sparseArray, nVar2.a));
            i4++;
        }
    }

    private void d(C0313an anVar) throws IOException, InterruptedException {
        int size = this.i.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            p pVar = ((b) this.i.valueAt(i2)).b;
            if (pVar.r) {
                long j3 = pVar.d;
                if (j3 < j2) {
                    bVar = (b) this.i.valueAt(i2);
                    j2 = j3;
                }
            }
        }
        if (bVar == null) {
            this.t = 3;
            return;
        }
        int position = (int) (j2 - anVar.getPosition());
        if (position >= 0) {
            anVar.c(position);
            bVar.b.a(anVar);
            return;
        }
        throw new H("Offset to encryption data was negative.");
    }

    public void a(long j2, long j3) {
        int size = this.i.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((b) this.i.valueAt(i2)).c();
        }
        this.r.clear();
        this.z = 0;
        this.A = j3;
        this.q.clear();
        this.I = false;
        b();
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        while (true) {
            int i2 = this.t;
            if (i2 != 0) {
                if (i2 == 1) {
                    c(anVar);
                } else if (i2 == 2) {
                    d(anVar);
                } else if (e(anVar)) {
                    return 0;
                }
            } else if (!b(anVar)) {
                return -1;
            }
        }
    }

    private void a(b bVar, long j2) throws H {
        if (!this.q.isEmpty()) {
            ((a) this.q.peek()).a(bVar);
            return;
        }
        int i2 = bVar.fb;
        if (i2 == c.P) {
            Pair a2 = a(bVar.gb, j2);
            this.C = ((Long) a2.first).longValue();
            this.J.a((C1363hn) a2.second);
            this.M = true;
        } else if (i2 == c.Ua) {
            a(bVar.gb);
        }
    }

    private void a(a aVar) throws H {
        int i2 = aVar.fb;
        if (i2 == c.Q) {
            c(aVar);
        } else if (i2 == c.X) {
            b(aVar);
        } else if (!this.q.isEmpty()) {
            ((a) this.q.peek()).a(aVar);
        }
    }

    private e a(SparseArray<e> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (e) sparseArray.valueAt(0);
        }
        Object obj = sparseArray.get(i2);
        C1852xq.a(obj);
        return (e) obj;
    }

    private void a(Pq pq) {
        C1424jn[] jnVarArr;
        C1424jn[] jnVarArr2 = this.K;
        if (jnVarArr2 != null && jnVarArr2.length != 0) {
            pq.e(12);
            int a2 = pq.a();
            pq.q();
            pq.q();
            long c2 = C0471ar.c(pq.v(), 1000000, pq.v());
            int c3 = pq.c();
            byte[] bArr = pq.a;
            bArr[c3 - 4] = 0;
            bArr[c3 - 3] = 0;
            bArr[c3 - 2] = 0;
            bArr[c3 - 1] = 0;
            for (C1424jn jnVar : this.K) {
                pq.e(12);
                jnVar.a(pq, a2);
            }
            long j2 = this.C;
            if (j2 != -9223372036854775807L) {
                long j3 = j2 + c2;
                Zq zq = this.o;
                long a3 = zq != null ? zq.a(j3) : j3;
                for (C1424jn a4 : this.K) {
                    a4.a(a3, 1, a2, 0, null);
                }
                return;
            }
            this.r.addLast(new a(c2, a2));
            this.z += a2;
        }
    }

    private void c() {
        int i2;
        if (this.K == null) {
            this.K = new C1424jn[2];
            C1424jn jnVar = this.s;
            if (jnVar != null) {
                this.K[0] = jnVar;
                i2 = 1;
            } else {
                i2 = 0;
            }
            if ((this.e & 4) != 0) {
                int i3 = i2 + 1;
                this.K[i2] = this.J.a(this.i.size(), 4);
                i2 = i3;
            }
            this.K = (C1424jn[]) Arrays.copyOf(this.K, i2);
            for (C1424jn a2 : this.K) {
                a2.a(d);
            }
        }
        if (this.L == null) {
            this.L = new C1424jn[this.g.size()];
            for (int i4 = 0; i4 < this.L.length; i4++) {
                C1424jn a3 = this.J.a(this.i.size() + 1 + i4, 3);
                a3.a((Format) this.g.get(i4));
                this.L[i4] = a3;
            }
        }
    }

    private void b(long j2) throws H {
        while (!this.q.isEmpty() && ((a) this.q.peek()).gb == j2) {
            a((a) this.q.pop());
        }
        b();
    }

    private void b(a aVar) throws H {
        DrmInitData drmInitData;
        a(aVar, this.i, this.e, this.m);
        if (this.h != null) {
            drmInitData = null;
        } else {
            drmInitData = a(aVar.hb);
        }
        if (drmInitData != null) {
            int size = this.i.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((b) this.i.valueAt(i2)).a(drmInitData);
            }
        }
        if (this.A != -9223372036854775807L) {
            int size2 = this.i.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((b) this.i.valueAt(i3)).a(this.A);
            }
            this.A = -9223372036854775807L;
        }
    }

    private static long c(Pq pq) {
        pq.e(8);
        return c.c(pq.h()) == 1 ? pq.y() : pq.v();
    }

    private static void a(a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) throws H {
        int size = aVar.ib.size();
        for (int i3 = 0; i3 < size; i3++) {
            a aVar2 = (a) aVar.ib.get(i3);
            if (aVar2.fb == c.Y) {
                b(aVar2, sparseArray, i2, bArr);
            }
        }
    }

    private static long b(Pq pq) {
        pq.e(8);
        return c.c(pq.h()) == 0 ? pq.v() : pq.y();
    }

    private static void a(a aVar, b bVar, long j2, int i2) {
        List<b> list = aVar.hb;
        int size = list.size();
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            b bVar2 = (b) list.get(i5);
            if (bVar2.fb == c.O) {
                Pq pq = bVar2.gb;
                pq.e(12);
                int x2 = pq.x();
                if (x2 > 0) {
                    i4 += x2;
                    i3++;
                }
            }
        }
        bVar.g = 0;
        bVar.f = 0;
        bVar.e = 0;
        bVar.b.a(i3, i4);
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            b bVar3 = (b) list.get(i8);
            if (bVar3.fb == c.O) {
                int i9 = i6 + 1;
                i7 = a(bVar, i6, j2, i2, bVar3.gb, i7);
                i6 = i9;
            }
        }
    }

    private static void b(a aVar, SparseArray<b> sparseArray, int i2, byte[] bArr) throws H {
        b a2 = a(aVar.e(c.M).gb, sparseArray);
        if (a2 != null) {
            p pVar = a2.b;
            long j2 = pVar.s;
            a2.c();
            if (aVar.e(c.L) != null && (i2 & 2) == 0) {
                j2 = c(aVar.e(c.L).gb);
            }
            a(aVar, a2, j2, i2);
            o a3 = a2.c.a(pVar.a.a);
            b e2 = aVar.e(c.pa);
            if (e2 != null) {
                a(a3, e2.gb, pVar);
            }
            b e3 = aVar.e(c.qa);
            if (e3 != null) {
                a(e3.gb, pVar);
            }
            b e4 = aVar.e(c.ua);
            if (e4 != null) {
                b(e4.gb, pVar);
            }
            b e5 = aVar.e(c.ra);
            b e6 = aVar.e(c.sa);
            if (!(e5 == null || e6 == null)) {
                a(e5.gb, e6.gb, a3 != null ? a3.b : null, pVar);
            }
            int size = aVar.hb.size();
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = (b) aVar.hb.get(i3);
                if (bVar.fb == c.ta) {
                    a(bVar.gb, pVar, bArr);
                }
            }
        }
    }

    private static void a(o oVar, Pq pq, p pVar) throws H {
        int i2;
        int i3 = oVar.d;
        pq.e(8);
        boolean z2 = true;
        if ((c.b(pq.h()) & 1) == 1) {
            pq.f(8);
        }
        int t2 = pq.t();
        int x2 = pq.x();
        if (x2 == pVar.f) {
            if (t2 == 0) {
                boolean[] zArr = pVar.n;
                i2 = 0;
                for (int i4 = 0; i4 < x2; i4++) {
                    int t3 = pq.t();
                    i2 += t3;
                    zArr[i4] = t3 > i3;
                }
            } else {
                if (t2 <= i3) {
                    z2 = false;
                }
                i2 = (t2 * x2) + 0;
                Arrays.fill(pVar.n, 0, x2, z2);
            }
            pVar.b(i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Length mismatch: ");
        sb.append(x2);
        sb.append(", ");
        sb.append(pVar.f);
        throw new H(sb.toString());
    }

    private static b b(SparseArray<b> sparseArray, int i2) {
        if (sparseArray.size() == 1) {
            return (b) sparseArray.valueAt(0);
        }
        return (b) sparseArray.get(i2);
    }

    private static void b(Pq pq, p pVar) throws H {
        a(pq, 0, pVar);
    }

    private static boolean b(int i2) {
        return i2 == c.fa || i2 == c.ea || i2 == c.R || i2 == c.P || i2 == c.ga || i2 == c.L || i2 == c.M || i2 == c.ba || i2 == c.N || i2 == c.O || i2 == c.ha || i2 == c.pa || i2 == c.qa || i2 == c.ua || i2 == c.ta || i2 == c.ra || i2 == c.sa || i2 == c.da || i2 == c.aa || i2 == c.Ua;
    }

    private static void a(Pq pq, p pVar) throws H {
        pq.e(8);
        int h2 = pq.h();
        if ((c.b(h2) & 1) == 1) {
            pq.f(8);
        }
        int x2 = pq.x();
        if (x2 == 1) {
            pVar.d += c.c(h2) == 0 ? pq.v() : pq.y();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected saio entry count: ");
        sb.append(x2);
        throw new H(sb.toString());
    }

    private static b a(Pq pq, SparseArray<b> sparseArray) {
        pq.e(8);
        int b2 = c.b(pq.h());
        b b3 = b(sparseArray, pq.h());
        if (b3 == null) {
            return null;
        }
        if ((b2 & 1) != 0) {
            long y2 = pq.y();
            p pVar = b3.b;
            pVar.c = y2;
            pVar.d = y2;
        }
        e eVar = b3.d;
        b3.b.a = new e((b2 & 2) != 0 ? pq.x() - 1 : eVar.a, (b2 & 8) != 0 ? pq.x() : eVar.b, (b2 & 16) != 0 ? pq.x() : eVar.c, (b2 & 32) != 0 ? pq.x() : eVar.d);
        return b3;
    }

    private static int a(b bVar, int i2, long j2, int i3, Pq pq, int i4) {
        boolean[] zArr;
        long j3;
        long[] jArr;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        b bVar2 = bVar;
        pq.e(8);
        int b2 = c.b(pq.h());
        n nVar = bVar2.c;
        p pVar = bVar2.b;
        e eVar = pVar.a;
        pVar.h[i2] = pq.x();
        long[] jArr2 = pVar.g;
        jArr2[i2] = pVar.c;
        if ((b2 & 1) != 0) {
            jArr2[i2] = jArr2[i2] + ((long) pq.h());
        }
        boolean z7 = (b2 & 4) != 0;
        int i7 = eVar.d;
        if (z7) {
            i7 = pq.x();
        }
        boolean z8 = (b2 & 256) != 0;
        boolean z9 = (b2 & 512) != 0;
        boolean z10 = (b2 & 1024) != 0;
        boolean z11 = (b2 & 2048) != 0;
        long[] jArr3 = nVar.h;
        long j4 = 0;
        if (jArr3 != null && jArr3.length == 1 && jArr3[0] == 0) {
            j4 = C0471ar.c(nVar.i[0], 1000, nVar.c);
        }
        int[] iArr = pVar.i;
        int[] iArr2 = pVar.j;
        long[] jArr4 = pVar.k;
        boolean[] zArr2 = pVar.l;
        int i8 = i7;
        boolean z12 = nVar.b == 2 && (i3 & 1) != 0;
        int i9 = i4 + pVar.h[i2];
        long j5 = j4;
        boolean[] zArr3 = zArr2;
        long j6 = nVar.c;
        if (i2 > 0) {
            zArr = zArr3;
            jArr = jArr4;
            j3 = pVar.s;
        } else {
            zArr = zArr3;
            jArr = jArr4;
            j3 = j2;
        }
        long j7 = j3;
        int i10 = i4;
        while (i10 < i9) {
            int x2 = z8 ? pq.x() : eVar.b;
            if (z9) {
                z2 = z8;
                i5 = pq.x();
            } else {
                z2 = z8;
                i5 = eVar.c;
            }
            if (i10 == 0 && z7) {
                z3 = z7;
                i6 = i8;
            } else if (z10) {
                z3 = z7;
                i6 = pq.h();
            } else {
                z3 = z7;
                i6 = eVar.d;
            }
            if (z11) {
                z6 = z11;
                z5 = z9;
                z4 = z10;
                iArr2[i10] = (int) ((((long) pq.h()) * 1000) / j6);
            } else {
                z6 = z11;
                z5 = z9;
                z4 = z10;
                iArr2[i10] = 0;
            }
            jArr[i10] = C0471ar.c(j7, 1000, j6) - j5;
            iArr[i10] = i5;
            zArr[i10] = ((i6 >> 16) & 1) == 0 && (!z12 || i10 == 0);
            i10++;
            j7 += (long) x2;
            z8 = z2;
            z7 = z3;
            z11 = z6;
            z9 = z5;
            z10 = z4;
            i9 = i9;
        }
        int i11 = i9;
        pVar.s = j7;
        return i11;
    }

    private static void a(Pq pq, p pVar, byte[] bArr) throws H {
        pq.e(8);
        pq.a(bArr, 0, 16);
        if (Arrays.equals(bArr, c)) {
            a(pq, 16, pVar);
        }
    }

    private static void a(Pq pq, int i2, p pVar) throws H {
        pq.e(i2 + 8);
        int b2 = c.b(pq.h());
        if ((b2 & 1) == 0) {
            boolean z2 = (b2 & 2) != 0;
            int x2 = pq.x();
            if (x2 == pVar.f) {
                Arrays.fill(pVar.n, 0, x2, z2);
                pVar.b(pq.a());
                pVar.a(pq);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Length mismatch: ");
            sb.append(x2);
            sb.append(", ");
            sb.append(pVar.f);
            throw new H(sb.toString());
        }
        throw new H("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private static void a(Pq pq, Pq pq2, String str, p pVar) throws H {
        byte[] bArr;
        pq.e(8);
        int h2 = pq.h();
        if (pq.h() == b) {
            if (c.c(h2) == 1) {
                pq.f(4);
            }
            if (pq.h() == 1) {
                pq2.e(8);
                int h3 = pq2.h();
                if (pq2.h() == b) {
                    int c2 = c.c(h3);
                    if (c2 == 1) {
                        if (pq2.v() == 0) {
                            throw new H("Variable length description in sgpd found (unsupported)");
                        }
                    } else if (c2 >= 2) {
                        pq2.f(4);
                    }
                    if (pq2.v() == 1) {
                        pq2.f(1);
                        int t2 = pq2.t();
                        int i2 = (t2 & 240) >> 4;
                        int i3 = t2 & 15;
                        boolean z2 = pq2.t() == 1;
                        if (z2) {
                            int t3 = pq2.t();
                            byte[] bArr2 = new byte[16];
                            pq2.a(bArr2, 0, bArr2.length);
                            if (t3 == 0) {
                                int t4 = pq2.t();
                                byte[] bArr3 = new byte[t4];
                                pq2.a(bArr3, 0, t4);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            pVar.m = true;
                            o oVar = new o(z2, str, t3, bArr2, i2, i3, bArr);
                            pVar.o = oVar;
                            return;
                        }
                        return;
                    }
                    throw new H("Entry count in sgpd != 1 (unsupported).");
                }
                return;
            }
            throw new H("Entry count in sbgp != 1 (unsupported).");
        }
    }

    private static Pair<Long, Vm> a(Pq pq, long j2) throws H {
        long j3;
        long j4;
        Pq pq2 = pq;
        pq2.e(8);
        int c2 = c.c(pq.h());
        pq2.f(4);
        long v2 = pq.v();
        if (c2 == 0) {
            j4 = pq.v();
            j3 = pq.v();
        } else {
            j4 = pq.y();
            j3 = pq.y();
        }
        long j5 = j4;
        long j6 = j2 + j3;
        long c3 = C0471ar.c(j5, 1000000, v2);
        pq2.f(2);
        int z2 = pq.z();
        int[] iArr = new int[z2];
        long[] jArr = new long[z2];
        long[] jArr2 = new long[z2];
        long[] jArr3 = new long[z2];
        long j7 = j5;
        long j8 = c3;
        int i2 = 0;
        while (i2 < z2) {
            int h2 = pq.h();
            if ((h2 & Integer.MIN_VALUE) == 0) {
                long v3 = pq.v();
                iArr[i2] = h2 & BaseClientBuilder.API_PRIORITY_OTHER;
                jArr[i2] = j6;
                jArr3[i2] = j8;
                j7 += v3;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                int i3 = z2;
                int[] iArr2 = iArr;
                long[] jArr6 = jArr;
                j8 = C0471ar.c(j7, 1000000, v2);
                jArr4[i2] = j8 - jArr5[i2];
                pq2.f(4);
                j6 += (long) iArr2[i2];
                i2++;
                iArr = iArr2;
                jArr3 = jArr5;
                jArr2 = jArr4;
                jArr = jArr6;
                z2 = i3;
            } else {
                throw new H("Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(c3), new Vm(iArr, jArr, jArr2, jArr3));
    }

    private void a(long j2) {
        while (!this.r.isEmpty()) {
            a aVar = (a) this.r.removeFirst();
            this.z -= aVar.b;
            long j3 = aVar.a + j2;
            Zq zq = this.o;
            if (zq != null) {
                j3 = zq.a(j3);
            }
            for (C1424jn a2 : this.K) {
                a2.a(j3, 1, aVar.b, this.z, null);
            }
        }
    }

    private static b a(SparseArray<b> sparseArray) {
        int size = sparseArray.size();
        b bVar = null;
        long j2 = Long.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar2 = (b) sparseArray.valueAt(i2);
            int i3 = bVar2.g;
            p pVar = bVar2.b;
            if (i3 != pVar.e) {
                long j3 = pVar.g[i3];
                if (j3 < j2) {
                    bVar = bVar2;
                    j2 = j3;
                }
            }
        }
        return bVar;
    }

    private static DrmInitData a(List<b> list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) list.get(i2);
            if (bVar.fb == c.ha) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = bVar.gb.a;
                UUID a2 = l.a(bArr);
                if (a2 == null) {
                    Iq.d("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new SchemeData(a2, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData((List<SchemeData>) arrayList);
    }

    private static boolean a(int i2) {
        return i2 == c.Q || i2 == c.S || i2 == c.T || i2 == c.U || i2 == c.V || i2 == c.X || i2 == c.Y || i2 == c.Z || i2 == c.ca;
    }
}
