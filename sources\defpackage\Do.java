package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.H;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: Do reason: default package */
/* compiled from: TsExtractor */
public final class Do implements _m {
    public static final C0529cn a = _n.a;
    /* access modifiers changed from: private */
    public static final long b = ((long) C0471ar.b("AC-3"));
    /* access modifiers changed from: private */
    public static final long c = ((long) C0471ar.b("EAC3"));
    /* access modifiers changed from: private */
    public static final long d = ((long) C0471ar.b("AC-4"));
    /* access modifiers changed from: private */
    public static final long e = ((long) C0471ar.b("HEVC"));
    /* access modifiers changed from: private */
    public final int f;
    /* access modifiers changed from: private */
    public final List<Zq> g;
    private final Pq h;
    private final SparseIntArray i;
    /* access modifiers changed from: private */
    public final c j;
    /* access modifiers changed from: private */
    public final SparseArray<Eo> k;
    /* access modifiers changed from: private */
    public final SparseBooleanArray l;
    /* access modifiers changed from: private */
    public final SparseBooleanArray m;
    private final Co n;
    private Bo o;
    /* access modifiers changed from: private */
    public C0498bn p;
    /* access modifiers changed from: private */
    public int q;
    /* access modifiers changed from: private */
    public boolean r;
    private boolean s;
    private boolean t;
    /* access modifiers changed from: private */
    public Eo u;
    private int v;
    /* access modifiers changed from: private */
    public int w;

    /* renamed from: Do$a */
    /* compiled from: TsExtractor */
    private class a implements C1850xo {
        private final Oq a = new Oq(new byte[4]);

        public a() {
        }

        public void a(Pq pq) {
            if (pq.t() == 0) {
                pq.f(7);
                int a2 = pq.a() / 4;
                for (int i = 0; i < a2; i++) {
                    pq.a(this.a, 4);
                    int a3 = this.a.a(16);
                    this.a.c(3);
                    if (a3 == 0) {
                        this.a.c(13);
                    } else {
                        int a4 = this.a.a(13);
                        Do.this.k.put(a4, new C1880yo(new b(a4)));
                        Do.this.q = Do.this.q + 1;
                    }
                }
                if (Do.this.f != 2) {
                    Do.this.k.remove(0);
                }
            }
        }

        public void a(Zq zq, C0498bn bnVar, d dVar) {
        }
    }

    /* renamed from: Do$b */
    /* compiled from: TsExtractor */
    private class b implements C1850xo {
        private final Oq a = new Oq(new byte[5]);
        private final SparseArray<Eo> b = new SparseArray<>();
        private final SparseIntArray c = new SparseIntArray();
        private final int d;

        public b(int i) {
            this.d = i;
        }

        public void a(Pq pq) {
            Zq zq;
            Eo eo;
            Pq pq2 = pq;
            if (pq.t() == 2) {
                int i = 0;
                if (Do.this.f == 1 || Do.this.f == 2 || Do.this.q == 1) {
                    zq = (Zq) Do.this.g.get(0);
                } else {
                    zq = new Zq(((Zq) Do.this.g.get(0)).a());
                    Do.this.g.add(zq);
                }
                pq2.f(2);
                int z = pq.z();
                int i2 = 3;
                pq2.f(3);
                pq2.a(this.a, 2);
                this.a.c(3);
                int i3 = 13;
                Do.this.w = this.a.a(13);
                pq2.a(this.a, 2);
                int i4 = 4;
                this.a.c(4);
                pq2.f(this.a.a(12));
                if (Do.this.f == 2 && Do.this.u == null) {
                    defpackage.Eo.b bVar = new defpackage.Eo.b(21, null, null, C0471ar.f);
                    Do doR = Do.this;
                    doR.u = doR.j.a(21, bVar);
                    Do.this.u.a(zq, Do.this.p, new d(z, 21, 8192));
                }
                this.b.clear();
                this.c.clear();
                int a2 = pq.a();
                while (a2 > 0) {
                    pq2.a(this.a, 5);
                    int a3 = this.a.a(8);
                    this.a.c(i2);
                    int a4 = this.a.a(i3);
                    this.a.c(i4);
                    int a5 = this.a.a(12);
                    defpackage.Eo.b a6 = a(pq2, a5);
                    if (a3 == 6) {
                        a3 = a6.a;
                    }
                    a2 -= a5 + 5;
                    int i5 = Do.this.f == 2 ? a3 : a4;
                    if (!Do.this.l.get(i5)) {
                        if (Do.this.f == 2 && a3 == 21) {
                            eo = Do.this.u;
                        } else {
                            eo = Do.this.j.a(a3, a6);
                        }
                        if (Do.this.f != 2 || a4 < this.c.get(i5, 8192)) {
                            this.c.put(i5, a4);
                            this.b.put(i5, eo);
                        }
                    }
                    i2 = 3;
                    i4 = 4;
                    i3 = 13;
                }
                int size = this.c.size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = this.c.keyAt(i6);
                    int valueAt = this.c.valueAt(i6);
                    Do.this.l.put(keyAt, true);
                    Do.this.m.put(valueAt, true);
                    Eo eo2 = (Eo) this.b.valueAt(i6);
                    if (eo2 != null) {
                        if (eo2 != Do.this.u) {
                            eo2.a(zq, Do.this.p, new d(z, keyAt, 8192));
                        }
                        Do.this.k.put(valueAt, eo2);
                    }
                }
                if (Do.this.f != 2) {
                    Do.this.k.remove(this.d);
                    Do doR2 = Do.this;
                    if (doR2.f != 1) {
                        i = Do.this.q - 1;
                    }
                    doR2.q = i;
                    if (Do.this.q == 0) {
                        Do.this.p.g();
                        Do.this.r = true;
                    }
                } else if (!Do.this.r) {
                    Do.this.p.g();
                    Do.this.q = 0;
                    Do.this.r = true;
                }
            }
        }

        public void a(Zq zq, C0498bn bnVar, d dVar) {
        }

        private defpackage.Eo.b a(Pq pq, int i) {
            int c2 = pq.c();
            int i2 = i + c2;
            String str = null;
            int i3 = -1;
            List list = null;
            while (pq.c() < i2) {
                int t = pq.t();
                int c3 = pq.c() + pq.t();
                if (t == 5) {
                    long v = pq.v();
                    if (v != Do.b) {
                        if (v != Do.c) {
                            if (v != Do.d) {
                                if (v == Do.e) {
                                    i3 = 36;
                                }
                                pq.f(c3 - pq.c());
                            }
                        }
                        i3 = 135;
                        pq.f(c3 - pq.c());
                    }
                    i3 = 129;
                    pq.f(c3 - pq.c());
                } else {
                    if (t != 106) {
                        if (t != 122) {
                            if (t == 127) {
                                if (pq.t() != 21) {
                                }
                            } else if (t == 123) {
                                i3 = 138;
                            } else if (t == 10) {
                                str = pq.b(3).trim();
                            } else if (t == 89) {
                                ArrayList arrayList = new ArrayList();
                                while (pq.c() < c3) {
                                    String trim = pq.b(3).trim();
                                    int t2 = pq.t();
                                    byte[] bArr = new byte[4];
                                    pq.a(bArr, 0, 4);
                                    arrayList.add(new defpackage.Eo.a(trim, t2, bArr));
                                }
                                list = arrayList;
                                i3 = 89;
                            }
                            pq.f(c3 - pq.c());
                        }
                        i3 = 135;
                        pq.f(c3 - pq.c());
                    }
                    i3 = 129;
                    pq.f(c3 - pq.c());
                }
                i3 = 172;
                pq.f(c3 - pq.c());
            }
            pq.e(i2);
            return new defpackage.Eo.b(i3, str, list, Arrays.copyOfRange(pq.a, c2, i2));
        }
    }

    public Do() {
        this(0);
    }

    public void release() {
    }

    public Do(int i2) {
        this(1, i2);
    }

    static /* synthetic */ _m[] e() {
        return new _m[]{new Do()};
    }

    private int f() throws H {
        int c2 = this.h.c();
        int d2 = this.h.d();
        int a2 = Fo.a(this.h.a, c2, d2);
        this.h.e(a2);
        int i2 = a2 + 188;
        if (i2 > d2) {
            this.v += a2 - c2;
            if (this.f == 2 && this.v > 376) {
                throw new H("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.v = 0;
        }
        return i2;
    }

    private void g() {
        this.l.clear();
        this.k.clear();
        SparseArray a2 = this.j.a();
        int size = a2.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.k.put(a2.keyAt(i2), a2.valueAt(i2));
        }
        this.k.put(0, new C1880yo(new a()));
        this.u = null;
    }

    public Do(int i2, int i3) {
        this(i2, new Zq(0), new C1333go(i3));
    }

    public Do(int i2, Zq zq, c cVar) {
        C1852xq.a(cVar);
        this.j = cVar;
        this.f = i2;
        if (i2 == 1 || i2 == 2) {
            this.g = Collections.singletonList(zq);
        } else {
            this.g = new ArrayList();
            this.g.add(zq);
        }
        this.h = new Pq(new byte[9400], 0);
        this.l = new SparseBooleanArray();
        this.m = new SparseBooleanArray();
        this.k = new SparseArray<>();
        this.i = new SparseIntArray();
        this.n = new Co();
        this.w = -1;
        g();
    }

    private boolean b(C0313an anVar) throws IOException, InterruptedException {
        Pq pq = this.h;
        byte[] bArr = pq.a;
        if (9400 - pq.c() < 188) {
            int a2 = this.h.a();
            if (a2 > 0) {
                System.arraycopy(bArr, this.h.c(), bArr, 0, a2);
            }
            this.h.a(bArr, a2);
        }
        while (this.h.a() < 188) {
            int d2 = this.h.d();
            int read = anVar.read(bArr, d2, 9400 - d2);
            if (read == -1) {
                return false;
            }
            this.h.d(d2 + read);
        }
        return true;
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        boolean z;
        byte[] bArr = this.h.a;
        anVar.a(bArr, 0, 940);
        for (int i2 = 0; i2 < 188; i2++) {
            int i3 = 0;
            while (true) {
                if (i3 >= 5) {
                    z = true;
                    break;
                } else if (bArr[(i3 * 188) + i2] != 71) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                anVar.c(i2);
                return true;
            }
        }
        return false;
    }

    public void a(C0498bn bnVar) {
        this.p = bnVar;
    }

    public void a(long j2, long j3) {
        C1852xq.b(this.f != 2);
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            Zq zq = (Zq) this.g.get(i2);
            if ((zq.c() == -9223372036854775807L) || !(zq.c() == 0 || zq.a() == j3)) {
                zq.d();
                zq.d(j3);
            }
        }
        if (j3 != 0) {
            Bo bo2 = this.o;
            if (bo2 != null) {
                bo2.b(j3);
            }
        }
        this.h.B();
        this.i.clear();
        for (int i3 = 0; i3 < this.k.size(); i3++) {
            ((Eo) this.k.valueAt(i3)).a();
        }
        this.v = 0;
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        C0313an anVar2 = anVar;
        C1332gn gnVar2 = gnVar;
        long length = anVar.getLength();
        Eo eo = null;
        if (this.r) {
            if (((length == -1 || this.f == 2) ? false : true) && !this.n.c()) {
                return this.n.a(anVar2, gnVar2, this.w);
            }
            a(length);
            if (this.t) {
                this.t = false;
                a(0, 0);
                if (anVar.getPosition() != 0) {
                    gnVar2.a = 0;
                    return 1;
                }
            }
            Bo bo2 = this.o;
            if (bo2 != null && bo2.b()) {
                return this.o.a(anVar2, gnVar2, (c) null);
            }
        }
        if (!b(anVar)) {
            return -1;
        }
        int f2 = f();
        int d2 = this.h.d();
        if (f2 > d2) {
            return 0;
        }
        int h2 = this.h.h();
        if ((8388608 & h2) != 0) {
            this.h.e(f2);
            return 0;
        }
        int i2 = ((4194304 & h2) != 0 ? 1 : 0) | 0;
        int i3 = (2096896 & h2) >> 8;
        boolean z = (h2 & 32) != 0;
        if ((h2 & 16) != 0) {
            eo = (Eo) this.k.get(i3);
        }
        if (eo == null) {
            this.h.e(f2);
            return 0;
        }
        if (this.f != 2) {
            int i4 = h2 & 15;
            int i5 = this.i.get(i3, i4 - 1);
            this.i.put(i3, i4);
            if (i5 == i4) {
                this.h.e(f2);
                return 0;
            } else if (i4 != ((i5 + 1) & 15)) {
                eo.a();
            }
        }
        if (z) {
            i2 |= (this.h.t() & 64) != 0 ? 2 : 0;
            this.h.f(this.h.t() - 1);
        }
        boolean z2 = this.r;
        if (a(i3)) {
            this.h.d(f2);
            eo.a(this.h, i2);
            this.h.d(d2);
        }
        if (this.f != 2 && !z2 && this.r && length != -1) {
            this.t = true;
        }
        this.h.e(f2);
        return 0;
    }

    private void a(long j2) {
        if (!this.s) {
            this.s = true;
            if (this.n.a() != -9223372036854775807L) {
                Bo bo2 = new Bo(this.n.b(), this.n.a(), j2, this.w);
                this.o = bo2;
                this.p.a(this.o.a());
                return;
            }
            this.p.a(new defpackage.C1363hn.b(this.n.a()));
        }
    }

    private boolean a(int i2) {
        if (this.f == 2 || this.r || !this.m.get(i2, false)) {
            return true;
        }
        return false;
    }
}
