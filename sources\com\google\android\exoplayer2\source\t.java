package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.B;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.T;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.trackselection.l;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: ProgressiveMediaPeriod */
final class t implements q, C0498bn, defpackage.C1582oq.a<a>, defpackage.C1582oq.e, com.google.android.exoplayer2.source.w.b {
    /* access modifiers changed from: private */
    public static final Format a = Format.a("icy", "application/x-icy", Long.MAX_VALUE);
    private boolean A;
    private boolean B;
    private int C;
    private long D;
    private long E;
    private long F;
    private long G;
    private boolean H;
    private int I;
    private boolean J;
    private boolean K;
    private final Uri b;
    private final Zp c;
    private final C1520mq d;
    private final com.google.android.exoplayer2.source.s.a e;
    private final c f;
    private final Sp g;
    /* access modifiers changed from: private */
    public final String h;
    /* access modifiers changed from: private */
    public final long i;
    private final C1582oq j = new C1582oq("Loader:ProgressiveMediaPeriod");
    private final b k;
    private final Bq l;
    private final Runnable m;
    /* access modifiers changed from: private */
    public final Runnable n;
    /* access modifiers changed from: private */
    public final Handler o;
    private com.google.android.exoplayer2.source.q.a p;
    private C1363hn q;
    /* access modifiers changed from: private */
    public IcyHeaders r;
    private w[] s;
    private f[] t;
    private boolean u;
    private boolean v;
    private d w;
    private boolean x;
    private int y;
    private boolean z;

    /* compiled from: ProgressiveMediaPeriod */
    final class a implements defpackage.C1582oq.d, com.google.android.exoplayer2.source.p.a {
        private final Uri a;
        /* access modifiers changed from: private */
        public final C1672rq b;
        private final b c;
        private final C0498bn d;
        private final Bq e;
        private final C1332gn f = new C1332gn();
        private volatile boolean g;
        private boolean h = true;
        /* access modifiers changed from: private */
        public long i;
        /* access modifiers changed from: private */
        public C0470aq j = a(0);
        /* access modifiers changed from: private */
        public long k = -1;
        private C1424jn l;
        private boolean m;

        public a(Uri uri, Zp zp, b bVar, C0498bn bnVar, Bq bq) {
            this.a = uri;
            this.b = new C1672rq(zp);
            this.c = bVar;
            this.d = bnVar;
            this.e = bq;
        }

        public void b() {
            this.g = true;
        }

        public void a() throws IOException, InterruptedException {
            int i2 = 0;
            while (i2 == 0 && !this.g) {
                Xm xm = null;
                try {
                    long j2 = this.f.a;
                    this.j = a(j2);
                    this.k = this.b.a(this.j);
                    if (this.k != -1) {
                        this.k += j2;
                    }
                    Uri uri = this.b.getUri();
                    C1852xq.a(uri);
                    Uri uri2 = uri;
                    t.this.r = IcyHeaders.a(this.b.a());
                    Zp zp = this.b;
                    if (!(t.this.r == null || t.this.r.f == -1)) {
                        zp = new p(this.b, t.this.r.f, this);
                        this.l = t.this.i();
                        this.l.a(t.a);
                    }
                    Xm xm2 = new Xm(zp, j2, this.k);
                    try {
                        _m a2 = this.c.a(xm2, this.d, uri2);
                        if (this.h) {
                            a2.a(j2, this.i);
                            this.h = false;
                        }
                        while (i2 == 0 && !this.g) {
                            this.e.a();
                            i2 = a2.a((C0313an) xm2, this.f);
                            if (xm2.getPosition() > t.this.i + j2) {
                                j2 = xm2.getPosition();
                                this.e.b();
                                t.this.o.post(t.this.n);
                            }
                        }
                        if (i2 == 1) {
                            i2 = 0;
                        } else {
                            this.f.a = xm2.getPosition();
                        }
                        C0471ar.a((Zp) this.b);
                    } catch (Throwable th) {
                        th = th;
                        xm = xm2;
                        if (!(i2 == 1 || xm == null)) {
                            this.f.a = xm.getPosition();
                        }
                        C0471ar.a((Zp) this.b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f.a = xm.getPosition();
                    C0471ar.a((Zp) this.b);
                    throw th;
                }
            }
        }

        public void a(Pq pq) {
            long j2;
            if (!this.m) {
                j2 = this.i;
            } else {
                j2 = Math.max(t.this.n(), this.i);
            }
            long j3 = j2;
            int a2 = pq.a();
            C1424jn jnVar = this.l;
            C1852xq.a(jnVar);
            C1424jn jnVar2 = jnVar;
            jnVar2.a(pq, a2);
            jnVar2.a(j3, 1, a2, 0, null);
            this.m = true;
        }

        private C0470aq a(long j2) {
            C0470aq aqVar = new C0470aq(this.a, j2, -1, t.this.h, 22);
            return aqVar;
        }

        /* access modifiers changed from: private */
        public void a(long j2, long j3) {
            this.f.a = j2;
            this.i = j3;
            this.h = true;
            this.m = false;
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class b {
        private final _m[] a;
        private _m b;

        public b(_m[] _mVarArr) {
            this.a = _mVarArr;
        }

        public _m a(C0313an anVar, C0498bn bnVar, Uri uri) throws IOException, InterruptedException {
            _m _mVar = this.b;
            if (_mVar != null) {
                return _mVar;
            }
            _m[] _mVarArr = this.a;
            int length = _mVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                _m _mVar2 = _mVarArr[i];
                try {
                    if (_mVar2.a(anVar)) {
                        this.b = _mVar2;
                        anVar.a();
                        break;
                    }
                    anVar.a();
                    i++;
                } catch (EOFException unused) {
                } catch (Throwable th) {
                    anVar.a();
                    throw th;
                }
            }
            _m _mVar3 = this.b;
            if (_mVar3 != null) {
                _mVar3.a(bnVar);
                return this.b;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("None of the available extractors (");
            sb.append(C0471ar.b((Object[]) this.a));
            sb.append(") could read the stream.");
            throw new C(sb.toString(), uri);
        }

        public void a() {
            _m _mVar = this.b;
            if (_mVar != null) {
                _mVar.release();
                this.b = null;
            }
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    interface c {
        void a(long j, boolean z);
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class d {
        public final C1363hn a;
        public final TrackGroupArray b;
        public final boolean[] c;
        public final boolean[] d;
        public final boolean[] e;

        public d(C1363hn hnVar, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.a = hnVar;
            this.b = trackGroupArray;
            this.c = zArr;
            int i = trackGroupArray.b;
            this.d = new boolean[i];
            this.e = new boolean[i];
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private final class e implements x {
        /* access modifiers changed from: private */
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public boolean b() {
            return t.this.a(this.a);
        }

        public void a() throws IOException {
            t.this.k();
        }

        public int a(B b2, Qm qm, boolean z) {
            return t.this.a(this.a, b2, qm, z);
        }

        public int a(long j) {
            return t.this.a(this.a, j);
        }
    }

    /* compiled from: ProgressiveMediaPeriod */
    private static final class f {
        public final int a;
        public final boolean b;

        public f(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || f.class != obj.getClass()) {
                return false;
            }
            f fVar = (f) obj;
            if (!(this.a == fVar.a && this.b == fVar.b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.a * 31) + (this.b ? 1 : 0);
        }
    }

    public t(Uri uri, Zp zp, _m[] _mVarArr, C1520mq mqVar, com.google.android.exoplayer2.source.s.a aVar, c cVar, Sp sp, String str, int i2) {
        this.b = uri;
        this.c = zp;
        this.d = mqVar;
        this.e = aVar;
        this.f = cVar;
        this.g = sp;
        this.h = str;
        this.i = (long) i2;
        this.k = new b(_mVarArr);
        this.l = new Bq();
        this.m = new j(this);
        this.n = new i(this);
        this.o = new Handler();
        this.t = new f[0];
        this.s = new w[0];
        this.G = -9223372036854775807L;
        this.E = -1;
        this.D = -9223372036854775807L;
        this.y = 1;
        aVar.a();
    }

    private int m() {
        int i2 = 0;
        for (w f2 : this.s) {
            i2 += f2.f();
        }
        return i2;
    }

    /* access modifiers changed from: private */
    public long n() {
        long j2 = Long.MIN_VALUE;
        for (w c2 : this.s) {
            j2 = Math.max(j2, c2.c());
        }
        return j2;
    }

    private d o() {
        d dVar = this.w;
        C1852xq.a(dVar);
        return dVar;
    }

    private boolean p() {
        return this.G != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public void q() {
        Metadata metadata;
        C1363hn hnVar = this.q;
        if (!this.K && !this.v && this.u && hnVar != null) {
            w[] wVarArr = this.s;
            int length = wVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (wVarArr[i2].e() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.l.b();
            int length2 = this.s.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length2];
            boolean[] zArr = new boolean[length2];
            this.D = hnVar.c();
            for (int i3 = 0; i3 < length2; i3++) {
                Format e2 = this.s[i3].e();
                String str = e2.i;
                boolean d2 = Lq.d(str);
                boolean z2 = d2 || Lq.f(str);
                zArr[i3] = z2;
                this.x = z2 | this.x;
                IcyHeaders icyHeaders = this.r;
                if (icyHeaders != null) {
                    if (d2 || this.t[i3].b) {
                        Metadata metadata2 = e2.g;
                        if (metadata2 == null) {
                            metadata = new Metadata(icyHeaders);
                        } else {
                            metadata = metadata2.a(icyHeaders);
                        }
                        e2 = e2.a(metadata);
                    }
                    if (d2 && e2.e == -1) {
                        int i4 = icyHeaders.a;
                        if (i4 != -1) {
                            e2 = e2.a(i4);
                        }
                    }
                }
                trackGroupArr[i3] = new TrackGroup(e2);
            }
            this.y = (this.E == -1 && hnVar.c() == -9223372036854775807L) ? 7 : 1;
            this.w = new d(hnVar, new TrackGroupArray(trackGroupArr), zArr);
            this.v = true;
            this.f.a(this.D, hnVar.b());
            com.google.android.exoplayer2.source.q.a aVar = this.p;
            C1852xq.a(aVar);
            aVar.a(this);
        }
    }

    private void r() {
        a aVar = new a(this.b, this.c, this.k, this, this.l);
        if (this.v) {
            C1363hn hnVar = o().a;
            C1852xq.b(p());
            long j2 = this.D;
            if (j2 == -9223372036854775807L || this.G < j2) {
                aVar.a(hnVar.a(this.G).a.c, this.G);
                this.G = -9223372036854775807L;
            } else {
                this.J = true;
                this.G = -9223372036854775807L;
                return;
            }
        }
        this.I = m();
        this.e.a(aVar.j, 1, -1, null, 0, null, aVar.i, this.D, this.j.a(aVar, this, this.d.a(this.y)));
    }

    private boolean s() {
        return this.A || p();
    }

    public void c(long j2) {
    }

    public void g() {
        this.u = true;
        this.o.post(this.m);
    }

    /* access modifiers changed from: 0000 */
    public C1424jn i() {
        return a(new f(0, true));
    }

    public /* synthetic */ void j() {
        if (!this.K) {
            com.google.android.exoplayer2.source.q.a aVar = this.p;
            C1852xq.a(aVar);
            aVar.a(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void k() throws IOException {
        this.j.a(this.d.a(this.y));
    }

    public void l() {
        if (this.v) {
            for (w b2 : this.s) {
                b2.b();
            }
        }
        this.j.a((defpackage.C1582oq.e) this);
        this.o.removeCallbacksAndMessages(null);
        this.p = null;
        this.K = true;
        this.e.b();
    }

    public boolean b(long j2) {
        if (this.J || this.H || (this.v && this.C == 0)) {
            return false;
        }
        boolean c2 = this.l.c();
        if (!this.j.b()) {
            r();
            c2 = true;
        }
        return c2;
    }

    public void c() throws IOException {
        k();
        if (this.J && !this.v) {
            throw new H("Loading finished before preparation is complete.");
        }
    }

    public TrackGroupArray d() {
        return o().b;
    }

    public long e() {
        long j2;
        boolean[] zArr = o().c;
        if (this.J) {
            return Long.MIN_VALUE;
        }
        if (p()) {
            return this.G;
        }
        if (this.x) {
            int length = this.s.length;
            j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.s[i2].h()) {
                    j2 = Math.min(j2, this.s[i2].c());
                }
            }
        } else {
            j2 = Long.MAX_VALUE;
        }
        if (j2 == Long.MAX_VALUE) {
            j2 = n();
        }
        if (j2 == Long.MIN_VALUE) {
            j2 = this.F;
        }
        return j2;
    }

    public void f() {
        for (w i2 : this.s) {
            i2.i();
        }
        this.k.a();
    }

    private void c(int i2) {
        boolean[] zArr = o().c;
        if (this.H && zArr[i2] && !this.s[i2].g()) {
            this.G = 0;
            this.H = false;
            this.A = true;
            this.F = 0;
            this.I = 0;
            for (w i3 : this.s) {
                i3.i();
            }
            com.google.android.exoplayer2.source.q.a aVar = this.p;
            C1852xq.a(aVar);
            aVar.a(this);
        }
    }

    public void a(com.google.android.exoplayer2.source.q.a aVar, long j2) {
        this.p = aVar;
        this.l.c();
        r();
    }

    public long b() {
        if (!this.B) {
            this.e.c();
            this.B = true;
        }
        if (!this.A || (!this.J && m() <= this.I)) {
            return -9223372036854775807L;
        }
        this.A = false;
        return this.F;
    }

    public long a(l[] lVarArr, boolean[] zArr, x[] xVarArr, boolean[] zArr2, long j2) {
        d o2 = o();
        TrackGroupArray trackGroupArray = o2.b;
        boolean[] zArr3 = o2.d;
        int i2 = this.C;
        int i3 = 0;
        for (int i4 = 0; i4 < lVarArr.length; i4++) {
            if (xVarArr[i4] != null && (lVarArr[i4] == null || !zArr[i4])) {
                int a2 = xVarArr[i4].a;
                C1852xq.b(zArr3[a2]);
                this.C--;
                zArr3[a2] = false;
                xVarArr[i4] = null;
            }
        }
        boolean z2 = !this.z ? j2 != 0 : i2 == 0;
        for (int i5 = 0; i5 < lVarArr.length; i5++) {
            if (xVarArr[i5] == null && lVarArr[i5] != null) {
                l lVar = lVarArr[i5];
                C1852xq.b(lVar.length() == 1);
                C1852xq.b(lVar.b(0) == 0);
                int a3 = trackGroupArray.a(lVar.c());
                C1852xq.b(!zArr3[a3]);
                this.C++;
                zArr3[a3] = true;
                xVarArr[i5] = new e(a3);
                zArr2[i5] = true;
                if (!z2) {
                    w wVar = this.s[a3];
                    wVar.j();
                    z2 = wVar.a(j2, true, true) == -1 && wVar.d() != 0;
                }
            }
        }
        if (this.C == 0) {
            this.H = false;
            this.A = false;
            if (this.j.b()) {
                w[] wVarArr = this.s;
                int length = wVarArr.length;
                while (i3 < length) {
                    wVarArr[i3].b();
                    i3++;
                }
                this.j.a();
            } else {
                w[] wVarArr2 = this.s;
                int length2 = wVarArr2.length;
                while (i3 < length2) {
                    wVarArr2[i3].i();
                    i3++;
                }
            }
        } else if (z2) {
            j2 = a(j2);
            while (i3 < xVarArr.length) {
                if (xVarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.z = true;
        return j2;
    }

    private void b(int i2) {
        d o2 = o();
        boolean[] zArr = o2.e;
        if (!zArr[i2]) {
            Format a2 = o2.b.a(i2).a(0);
            this.e.a(Lq.c(a2.i), a2, 0, (Object) null, this.F);
            zArr[i2] = true;
        }
    }

    public void a(long j2, boolean z2) {
        if (!p()) {
            boolean[] zArr = o().d;
            int length = this.s.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.s[i2].b(j2, z2, zArr[i2]);
            }
        }
    }

    public long a() {
        if (this.C == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    public long a(long j2) {
        d o2 = o();
        C1363hn hnVar = o2.a;
        boolean[] zArr = o2.c;
        if (!hnVar.b()) {
            j2 = 0;
        }
        this.A = false;
        this.F = j2;
        if (p()) {
            this.G = j2;
            return j2;
        } else if (this.y != 7 && a(zArr, j2)) {
            return j2;
        } else {
            this.H = false;
            this.G = j2;
            this.J = false;
            if (this.j.b()) {
                this.j.a();
            } else {
                for (w i2 : this.s) {
                    i2.i();
                }
            }
            return j2;
        }
    }

    public long a(long j2, T t2) {
        C1363hn hnVar = o().a;
        if (!hnVar.b()) {
            return 0;
        }
        defpackage.C1363hn.a a2 = hnVar.a(j2);
        return C0471ar.a(j2, t2, a2.a.b, a2.b.b);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(int i2) {
        return !s() && (this.J || this.s[i2].g());
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, B b2, Qm qm, boolean z2) {
        if (s()) {
            return -3;
        }
        b(i2);
        int a2 = this.s[i2].a(b2, qm, z2, this.J, this.F);
        if (a2 == -3) {
            c(i2);
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public int a(int i2, long j2) {
        int i3 = 0;
        if (s()) {
            return 0;
        }
        b(i2);
        w wVar = this.s[i2];
        if (!this.J || j2 <= wVar.c()) {
            int a2 = wVar.a(j2, true, true);
            if (a2 != -1) {
                i3 = a2;
            }
        } else {
            i3 = wVar.a();
        }
        if (i3 == 0) {
            c(i2);
        }
        return i3;
    }

    public void a(a aVar, long j2, long j3) {
        if (this.D == -9223372036854775807L) {
            C1363hn hnVar = this.q;
            if (hnVar != null) {
                boolean b2 = hnVar.b();
                long n2 = n();
                this.D = n2 == Long.MIN_VALUE ? 0 : n2 + 10000;
                this.f.a(this.D, b2);
            }
        }
        this.e.b(aVar.j, aVar.b.c(), aVar.b.d(), 1, -1, null, 0, null, aVar.i, this.D, j2, j3, aVar.b.b());
        a(aVar);
        this.J = true;
        com.google.android.exoplayer2.source.q.a aVar2 = this.p;
        C1852xq.a(aVar2);
        aVar2.a(this);
    }

    public void a(a aVar, long j2, long j3, boolean z2) {
        this.e.a(aVar.j, aVar.b.c(), aVar.b.d(), 1, -1, null, 0, null, aVar.i, this.D, j2, j3, aVar.b.b());
        if (!z2) {
            a(aVar);
            for (w i2 : this.s) {
                i2.i();
            }
            if (this.C > 0) {
                com.google.android.exoplayer2.source.q.a aVar2 = this.p;
                C1852xq.a(aVar2);
                aVar2.a(this);
            }
        }
    }

    public defpackage.C1582oq.b a(a aVar, long j2, long j3, IOException iOException, int i2) {
        defpackage.C1582oq.b bVar;
        boolean z2;
        a aVar2;
        a(aVar);
        long a2 = this.d.a(this.y, j3, iOException, i2);
        if (a2 == -9223372036854775807L) {
            bVar = C1582oq.d;
            a aVar3 = aVar;
        } else {
            int m2 = m();
            if (m2 > this.I) {
                aVar2 = aVar;
                z2 = true;
            } else {
                aVar2 = aVar;
                z2 = false;
            }
            bVar = a(aVar2, m2) ? C1582oq.a(z2, a2) : C1582oq.c;
        }
        this.e.a(aVar.j, aVar.b.c(), aVar.b.d(), 1, -1, null, 0, null, aVar.i, this.D, j2, j3, aVar.b.b(), iOException, !bVar.a());
        return bVar;
    }

    public C1424jn a(int i2, int i3) {
        return a(new f(i2, false));
    }

    public void a(C1363hn hnVar) {
        if (this.r != null) {
            hnVar = new defpackage.C1363hn.b(-9223372036854775807L);
        }
        this.q = hnVar;
        this.o.post(this.m);
    }

    public void a(Format format) {
        this.o.post(this.m);
    }

    private C1424jn a(f fVar) {
        int length = this.s.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (fVar.equals(this.t[i2])) {
                return this.s[i2];
            }
        }
        w wVar = new w(this.g);
        wVar.a((com.google.android.exoplayer2.source.w.b) this);
        int i3 = length + 1;
        f[] fVarArr = (f[]) Arrays.copyOf(this.t, i3);
        fVarArr[length] = fVar;
        C0471ar.a((T[]) fVarArr);
        this.t = fVarArr;
        w[] wVarArr = (w[]) Arrays.copyOf(this.s, i3);
        wVarArr[length] = wVar;
        C0471ar.a((T[]) wVarArr);
        this.s = wVarArr;
        return wVar;
    }

    private void a(a aVar) {
        if (this.E == -1) {
            this.E = aVar.k;
        }
    }

    private boolean a(a aVar, int i2) {
        if (this.E == -1) {
            C1363hn hnVar = this.q;
            if (hnVar == null || hnVar.c() == -9223372036854775807L) {
                if (!this.v || s()) {
                    this.A = this.v;
                    this.F = 0;
                    this.I = 0;
                    for (w i3 : this.s) {
                        i3.i();
                    }
                    aVar.a(0, 0);
                    return true;
                }
                this.H = true;
                return false;
            }
        }
        this.I = i2;
        return true;
    }

    private boolean a(boolean[] zArr, long j2) {
        int length = this.s.length;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= length) {
                return true;
            }
            w wVar = this.s[i2];
            wVar.j();
            if (wVar.a(j2, true, false) == -1) {
                z2 = false;
            }
            if (z2 || (!zArr[i2] && this.x)) {
                i2++;
            }
        }
        return false;
    }
}
