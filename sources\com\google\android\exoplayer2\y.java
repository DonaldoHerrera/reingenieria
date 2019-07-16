package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.q;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.x;
import com.google.android.exoplayer2.trackselection.l;
import com.google.android.exoplayer2.trackselection.o;
import com.google.android.exoplayer2.trackselection.p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ExoPlayerImplInternal */
final class y implements Callback, com.google.android.exoplayer2.source.q.a, com.google.android.exoplayer2.trackselection.o.a, com.google.android.exoplayer2.source.r.b, com.google.android.exoplayer2.C0617q.a, com.google.android.exoplayer2.M.a {
    private boolean A;
    private boolean B;
    private int C;
    private d D;
    private long E;
    private int F;
    private final O[] a;
    private final P[] b;
    private final o c;
    private final p d;
    private final D e;
    private final Up f;
    private final Hq g;
    private final HandlerThread h;
    private final Handler i;
    private final com.google.android.exoplayer2.X.b j;
    private final com.google.android.exoplayer2.X.a k;
    private final long l;
    private final boolean m;
    private final C0617q n;
    private final c o;
    private final ArrayList<b> p;
    private final C1882yq q;
    private final G r = new G();
    private T s;
    private I t;
    private r u;
    private O[] v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;

    /* compiled from: ExoPlayerImplInternal */
    private static final class a {
        public final r a;
        public final X b;
        public final Object c;

        public a(r rVar, X x, Object obj) {
            this.a = rVar;
            this.b = x;
            this.c = obj;
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class b implements Comparable<b> {
        public final M a;
        public int b;
        public long c;
        public Object d;

        public b(M m) {
            this.a = m;
        }

        public void a(int i, long j, Object obj) {
            this.b = i;
            this.c = j;
            this.d = obj;
        }

        /* renamed from: a */
        public int compareTo(b bVar) {
            int i = 1;
            if ((this.d == null) != (bVar.d == null)) {
                if (this.d != null) {
                    i = -1;
                }
                return i;
            } else if (this.d == null) {
                return 0;
            } else {
                int i2 = this.b - bVar.b;
                if (i2 != 0) {
                    return i2;
                }
                return C0471ar.a(this.c, bVar.c);
            }
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class c {
        private I a;
        /* access modifiers changed from: private */
        public int b;
        /* access modifiers changed from: private */
        public boolean c;
        /* access modifiers changed from: private */
        public int d;

        private c() {
        }

        public boolean a(I i) {
            return i != this.a || this.b > 0 || this.c;
        }

        public void b(I i) {
            this.a = i;
            this.b = 0;
            this.c = false;
        }

        public void a(int i) {
            this.b += i;
        }

        public void b(int i) {
            boolean z = true;
            if (!this.c || this.d == 4) {
                this.c = true;
                this.d = i;
                return;
            }
            if (i != 4) {
                z = false;
            }
            C1852xq.a(z);
        }
    }

    /* compiled from: ExoPlayerImplInternal */
    private static final class d {
        public final X a;
        public final int b;
        public final long c;

        public d(X x, int i, long j) {
            this.a = x;
            this.b = i;
            this.c = j;
        }
    }

    public y(O[] oArr, o oVar, p pVar, D d2, Up up, boolean z2, int i2, boolean z3, Handler handler, C1882yq yqVar) {
        this.a = oArr;
        this.c = oVar;
        this.d = pVar;
        this.e = d2;
        this.f = up;
        this.x = z2;
        this.z = i2;
        this.A = z3;
        this.i = handler;
        this.q = yqVar;
        this.l = d2.b();
        this.m = d2.a();
        this.s = T.e;
        this.t = I.a(-9223372036854775807L, pVar);
        this.o = new c();
        this.b = new P[oArr.length];
        for (int i3 = 0; i3 < oArr.length; i3++) {
            oArr[i3].setIndex(i3);
            this.b[i3] = oArr[i3].k();
        }
        this.n = new C0617q(this, yqVar);
        this.p = new ArrayList<>();
        this.v = new O[0];
        this.j = new com.google.android.exoplayer2.X.b();
        this.k = new com.google.android.exoplayer2.X.a();
        oVar.a(this, up);
        this.h = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.h.start();
        this.g = yqVar.a(this.h.getLooper(), this);
    }

    private void c() throws C0618s, IOException {
        O[] oArr;
        long a2 = this.q.a();
        s();
        if (!this.r.g()) {
            j();
            b(a2, 10);
            return;
        }
        E e2 = this.r.e();
        _q.a("doSomeWork");
        t();
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        e2.a.a(this.t.n - this.l, this.m);
        boolean z2 = true;
        boolean z3 = true;
        for (O o2 : this.v) {
            o2.a(this.E, elapsedRealtime);
            z3 = z3 && o2.a();
            boolean z4 = o2.b() || o2.a() || c(o2);
            if (!z4) {
                o2.i();
            }
            z2 = z2 && z4;
        }
        if (!z2) {
            j();
        }
        long j2 = e2.f.e;
        if (z3 && ((j2 == -9223372036854775807L || j2 <= this.t.n) && e2.f.g)) {
            b(4);
            r();
        } else if (this.t.g == 2 && h(z2)) {
            b(3);
            if (this.x) {
                q();
            }
        } else if (this.t.g == 3 && (this.v.length != 0 ? !z2 : !g())) {
            this.y = this.x;
            b(2);
            r();
        }
        if (this.t.g == 2) {
            for (O i2 : this.v) {
                i2.i();
            }
        }
        if (!this.x || this.t.g != 3) {
            int i3 = this.t.g;
            if (i3 != 2) {
                if (this.v.length == 0 || i3 == 4) {
                    this.g.b(2);
                } else {
                    b(a2, 1000);
                }
                _q.a();
            }
        }
        b(a2, 10);
        _q.a();
    }

    private void d(boolean z2) throws C0618s {
        com.google.android.exoplayer2.source.r.a aVar = this.r.e().f.a;
        long a2 = a(aVar, this.t.n, true);
        if (a2 != this.t.n) {
            I i2 = this.t;
            this.t = i2.a(aVar, a2, i2.f, e());
            if (z2) {
                this.o.b(4);
            }
        }
    }

    private void e(boolean z2) {
        I i2 = this.t;
        if (i2.h != z2) {
            this.t = i2.a(z2);
        }
    }

    private void f(boolean z2) throws C0618s {
        this.y = false;
        this.x = z2;
        if (!z2) {
            r();
            t();
            return;
        }
        int i2 = this.t.g;
        if (i2 == 3) {
            q();
            this.g.a(2);
        } else if (i2 == 2) {
            this.g.a(2);
        }
    }

    private void g(boolean z2) throws C0618s {
        this.A = z2;
        if (!this.r.b(z2)) {
            d(true);
        }
        c(false);
    }

    private boolean h(boolean z2) {
        if (this.v.length == 0) {
            return g();
        }
        boolean z3 = false;
        if (!z2) {
            return false;
        }
        if (!this.t.h) {
            return true;
        }
        E d2 = this.r.d();
        if ((d2.h() && d2.f.g) || this.e.a(e(), this.n.c().b, this.y)) {
            z3 = true;
        }
        return z3;
    }

    private void i() {
        if (this.o.a(this.t)) {
            this.i.obtainMessage(0, this.o.b, this.o.c ? this.o.d : -1, this.t).sendToTarget();
            this.o.b(this.t);
        }
    }

    private void j() throws IOException {
        E d2 = this.r.d();
        E f2 = this.r.f();
        if (d2 != null && !d2.d && (f2 == null || f2.b() == d2)) {
            O[] oArr = this.v;
            int length = oArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (oArr[i2].g()) {
                    i2++;
                } else {
                    return;
                }
            }
            d2.a.c();
        }
    }

    private void k() throws IOException {
        if (this.r.d() != null) {
            O[] oArr = this.v;
            int length = oArr.length;
            int i2 = 0;
            while (i2 < length) {
                if (oArr[i2].g()) {
                    i2++;
                } else {
                    return;
                }
            }
        }
        this.u.a();
    }

    private void l() throws IOException {
        this.r.a(this.E);
        if (this.r.h()) {
            F a2 = this.r.a(this.E, this.t);
            if (a2 == null) {
                k();
                return;
            }
            this.r.a(this.b, this.c, this.e.d(), this.u, a2).a((com.google.android.exoplayer2.source.q.a) this, a2.b);
            e(true);
            c(false);
        }
    }

    private void m() {
        l[] a2;
        for (E c2 = this.r.c(); c2 != null; c2 = c2.b()) {
            p g2 = c2.g();
            if (g2 != null) {
                for (l lVar : g2.c.a()) {
                    if (lVar != null) {
                        lVar.b();
                    }
                }
            }
        }
    }

    private void n() {
        a(true, true, true, true);
        this.e.f();
        b(1);
        this.h.quit();
        synchronized (this) {
            this.w = true;
            notifyAll();
        }
    }

    private void o() throws C0618s {
        if (this.r.g()) {
            float f2 = this.n.c().b;
            E e2 = this.r.e();
            E f3 = this.r.f();
            boolean z2 = true;
            while (e2 != null && e2.d) {
                p b2 = e2.b(f2, this.t.b);
                if (b2 != null) {
                    if (z2) {
                        E e3 = this.r.e();
                        boolean[] zArr = new boolean[this.a.length];
                        long a2 = e3.a(b2, this.t.n, this.r.a(e3), zArr);
                        I i2 = this.t;
                        if (!(i2.g == 4 || a2 == i2.n)) {
                            I i3 = this.t;
                            this.t = i3.a(i3.d, a2, i3.f, e());
                            this.o.b(4);
                            b(a2);
                        }
                        boolean[] zArr2 = new boolean[this.a.length];
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            O[] oArr = this.a;
                            if (i4 >= oArr.length) {
                                break;
                            }
                            O o2 = oArr[i4];
                            zArr2[i4] = o2.getState() != 0;
                            x xVar = e3.c[i4];
                            if (xVar != null) {
                                i5++;
                            }
                            if (zArr2[i4]) {
                                if (xVar != o2.l()) {
                                    a(o2);
                                } else if (zArr[i4]) {
                                    o2.a(this.E);
                                }
                            }
                            i4++;
                        }
                        this.t = this.t.a(e3.f(), e3.g());
                        a(zArr2, i5);
                    } else {
                        this.r.a(e2);
                        if (e2.d) {
                            e2.a(b2, Math.max(e2.f.b, e2.c(this.E)), false);
                        }
                    }
                    c(true);
                    if (this.t.g != 4) {
                        h();
                        t();
                        this.g.a(2);
                    }
                    return;
                }
                if (e2 == f3) {
                    z2 = false;
                }
                e2 = e2.b();
            }
        }
    }

    private void p() {
        for (int size = this.p.size() - 1; size >= 0; size--) {
            if (!a((b) this.p.get(size))) {
                ((b) this.p.get(size)).a.a(false);
                this.p.remove(size);
            }
        }
        Collections.sort(this.p);
    }

    private void q() throws C0618s {
        this.y = false;
        this.n.a();
        for (O start : this.v) {
            start.start();
        }
    }

    private void r() throws C0618s {
        this.n.b();
        for (O b2 : this.v) {
            b(b2);
        }
    }

    private void s() throws C0618s, IOException {
        r rVar = this.u;
        if (rVar != null) {
            if (this.C > 0) {
                rVar.a();
                return;
            }
            l();
            E d2 = this.r.d();
            int i2 = 0;
            if (d2 == null || d2.h()) {
                e(false);
            } else if (!this.t.h) {
                h();
            }
            if (this.r.g()) {
                E e2 = this.r.e();
                E f2 = this.r.f();
                boolean z2 = false;
                while (this.x && e2 != f2 && this.E >= e2.b().e()) {
                    if (z2) {
                        i();
                    }
                    int i3 = e2.f.f ? 0 : 3;
                    E a2 = this.r.a();
                    a(e2);
                    I i4 = this.t;
                    F f3 = a2.f;
                    this.t = i4.a(f3.a, f3.b, f3.c, e());
                    this.o.b(i3);
                    t();
                    e2 = a2;
                    z2 = true;
                }
                if (f2.f.g) {
                    while (true) {
                        O[] oArr = this.a;
                        if (i2 < oArr.length) {
                            O o2 = oArr[i2];
                            x xVar = f2.c[i2];
                            if (xVar != null && o2.l() == xVar && o2.g()) {
                                o2.h();
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else if (f2.b() != null) {
                    int i5 = 0;
                    while (true) {
                        O[] oArr2 = this.a;
                        if (i5 < oArr2.length) {
                            O o3 = oArr2[i5];
                            x xVar2 = f2.c[i5];
                            if (o3.l() == xVar2 && (xVar2 == null || o3.g())) {
                                i5++;
                            }
                        } else if (!f2.b().d) {
                            j();
                            return;
                        } else {
                            p g2 = f2.g();
                            E b2 = this.r.b();
                            p g3 = b2.g();
                            boolean z3 = b2.a.b() != -9223372036854775807L;
                            int i6 = 0;
                            while (true) {
                                O[] oArr3 = this.a;
                                if (i6 < oArr3.length) {
                                    O o4 = oArr3[i6];
                                    if (g2.a(i6)) {
                                        if (z3) {
                                            o4.h();
                                        } else if (!o4.j()) {
                                            l a3 = g3.c.a(i6);
                                            boolean a4 = g3.a(i6);
                                            boolean z4 = this.b[i6].e() == 6;
                                            Q q2 = g2.b[i6];
                                            Q q3 = g3.b[i6];
                                            if (!a4 || !q3.equals(q2) || z4) {
                                                o4.h();
                                            } else {
                                                o4.a(a(a3), b2.c[i6], b2.d());
                                            }
                                        }
                                    }
                                    i6++;
                                } else {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void t() throws C0618s {
        if (this.r.g()) {
            E e2 = this.r.e();
            long b2 = e2.a.b();
            if (b2 != -9223372036854775807L) {
                b(b2);
                if (b2 != this.t.n) {
                    I i2 = this.t;
                    this.t = i2.a(i2.d, b2, i2.f, e());
                    this.o.b(4);
                }
            } else {
                this.E = this.n.d();
                long c2 = e2.c(this.E);
                a(this.t.n, c2);
                this.t.n = c2;
            }
            E d2 = this.r.d();
            this.t.l = d2.a();
            this.t.m = e();
        }
    }

    public void b(boolean z2) {
        this.g.a(6, z2 ? 1 : 0, 0).sendToTarget();
    }

    public boolean handleMessage(Message message) {
        C0618s sVar;
        String str = "ExoPlayerImplInternal";
        try {
            switch (message.what) {
                case 0:
                    b((r) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    f(message.arg1 != 0);
                    break;
                case 2:
                    c();
                    break;
                case 3:
                    a((d) message.obj);
                    break;
                case 4:
                    c((J) message.obj);
                    break;
                case 5:
                    a((T) message.obj);
                    break;
                case 6:
                    a(false, message.arg1 != 0, true);
                    break;
                case 7:
                    n();
                    return true;
                case 8:
                    a((a) message.obj);
                    break;
                case 9:
                    d((q) message.obj);
                    break;
                case 10:
                    c((q) message.obj);
                    break;
                case 11:
                    o();
                    break;
                case 12:
                    a(message.arg1);
                    break;
                case 13:
                    g(message.arg1 != 0);
                    break;
                case 14:
                    a(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 15:
                    d((M) message.obj);
                    break;
                case 16:
                    f((M) message.obj);
                    break;
                case 17:
                    b((J) message.obj);
                    break;
                default:
                    return false;
            }
            i();
        } catch (C0618s e2) {
            Iq.a(str, "Playback error.", e2);
            this.i.obtainMessage(2, e2).sendToTarget();
            a(true, false, false);
            i();
        } catch (IOException e3) {
            Iq.a(str, "Source error.", e3);
            this.i.obtainMessage(2, C0618s.a(e3)).sendToTarget();
            a(false, false, false);
            i();
        } catch (OutOfMemoryError | RuntimeException e4) {
            Iq.a(str, "Internal runtime error.", e4);
            if (e4 instanceof OutOfMemoryError) {
                sVar = C0618s.a((OutOfMemoryError) e4);
            } else {
                sVar = C0618s.a((RuntimeException) e4);
            }
            this.i.obtainMessage(2, sVar).sendToTarget();
            a(true, false, false);
            i();
        }
        return true;
    }

    public void a(r rVar, boolean z2, boolean z3) {
        this.g.a(0, z2 ? 1 : 0, z3 ? 1 : 0, rVar).sendToTarget();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        return;
     */
    public synchronized void b() {
        if (!this.w) {
            this.g.a(7);
            boolean z2 = false;
            while (!this.w) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void e(M m2) throws C0618s {
        if (m2.c().getLooper() == this.g.a()) {
            c(m2);
            int i2 = this.t.g;
            if (i2 == 3 || i2 == 2) {
                this.g.a(2);
                return;
            }
            return;
        }
        this.g.a(16, (Object) m2).sendToTarget();
    }

    private boolean g() {
        E e2 = this.r.e();
        E b2 = e2.b();
        long j2 = e2.f.e;
        return j2 == -9223372036854775807L || this.t.n < j2 || (b2 != null && (b2.d || b2.f.a.a()));
    }

    public void a(boolean z2) {
        this.g.a(1, z2 ? 1 : 0, 0).sendToTarget();
    }

    public void a(X x2, int i2, long j2) {
        this.g.a(3, (Object) new d(x2, i2, j2)).sendToTarget();
    }

    private long e() {
        return a(this.t.l);
    }

    public synchronized void a(M m2) {
        if (this.w) {
            Iq.d("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            m2.a(false);
            return;
        }
        this.g.a(15, (Object) m2).sendToTarget();
    }

    private void d(M m2) throws C0618s {
        if (m2.e() == -9223372036854775807L) {
            e(m2);
        } else if (this.u == null || this.C > 0) {
            this.p.add(new b(m2));
        } else {
            b bVar = new b(m2);
            if (a(bVar)) {
                this.p.add(bVar);
                Collections.sort(this.p);
                return;
            }
            m2.a(false);
        }
    }

    private void f(M m2) {
        m2.c().post(new C0612l(this, m2));
    }

    private void h() {
        E d2 = this.r.d();
        long c2 = d2.c();
        if (c2 == Long.MIN_VALUE) {
            e(false);
            return;
        }
        boolean a2 = this.e.a(a(c2), this.n.c().b);
        e(a2);
        if (a2) {
            d2.a(this.E);
        }
    }

    /* renamed from: b */
    public void a(q qVar) {
        this.g.a(10, (Object) qVar).sendToTarget();
    }

    private void b(int i2) {
        I i3 = this.t;
        if (i3.g != i2) {
            this.t = i3.a(i2);
        }
    }

    private void f() {
        b(4);
        a(false, false, true, false);
    }

    private void b(r rVar, boolean z2, boolean z3) {
        this.C++;
        a(false, true, z2, z3);
        this.e.c();
        this.u = rVar;
        b(2);
        rVar.a((com.google.android.exoplayer2.source.r.b) this, this.f.a());
        this.g.a(2);
    }

    public Looper a() {
        return this.h.getLooper();
    }

    public void a(r rVar, X x2, Object obj) {
        this.g.a(8, (Object) new a(rVar, x2, obj)).sendToTarget();
    }

    public void a(q qVar) {
        this.g.a(9, (Object) qVar).sendToTarget();
    }

    private long d() {
        E f2 = this.r.f();
        if (f2 == null) {
            return 0;
        }
        long d2 = f2.d();
        int i2 = 0;
        while (true) {
            O[] oArr = this.a;
            if (i2 >= oArr.length) {
                return d2;
            }
            if (oArr[i2].getState() != 0 && this.a[i2].l() == f2.c[i2]) {
                long m2 = this.a[i2].m();
                if (m2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                d2 = Math.max(m2, d2);
            }
            i2++;
        }
    }

    public void a(J j2) {
        this.g.a(17, (Object) j2).sendToTarget();
    }

    private void b(long j2, long j3) {
        this.g.b(2);
        this.g.a(2, j2 + j3);
    }

    private void a(int i2) throws C0618s {
        this.z = i2;
        if (!this.r.a(i2)) {
            d(true);
        }
        c(false);
    }

    private void b(long j2) throws C0618s {
        if (this.r.g()) {
            j2 = this.r.e().d(j2);
        }
        this.E = j2;
        this.n.a(this.E);
        for (O a2 : this.v) {
            a2.a(this.E);
        }
        m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c A[Catch:{ all -> 0x00de }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8  */
    private void a(d dVar) throws C0618s {
        long j2;
        com.google.android.exoplayer2.source.r.a aVar;
        long j3;
        boolean z2;
        long j4;
        long j5;
        d dVar2 = dVar;
        boolean z3 = true;
        this.o.a(1);
        Pair a2 = a(dVar2, true);
        if (a2 == null) {
            aVar = this.t.a(this.A, this.j);
            j3 = -9223372036854775807L;
            j2 = -9223372036854775807L;
        } else {
            Object obj = a2.first;
            long longValue = ((Long) a2.second).longValue();
            com.google.android.exoplayer2.source.r.a a3 = this.r.a(obj, longValue);
            if (a3.a()) {
                j3 = 0;
                aVar = a3;
                j2 = longValue;
            } else {
                j3 = ((Long) a2.second).longValue();
                z2 = dVar2.c == -9223372036854775807L;
                aVar = a3;
                j2 = longValue;
                if (this.u != null) {
                    if (this.C <= 0) {
                        if (j3 == -9223372036854775807L) {
                            b(4);
                            a(false, false, true, false);
                            j4 = j3;
                            this.t = this.t.a(aVar, j4, j2, e());
                            if (z2) {
                                this.o.b(2);
                            }
                        }
                        if (aVar.equals(this.t.d)) {
                            E e2 = this.r.e();
                            j5 = (e2 == null || j3 == 0) ? j3 : e2.a.a(j3, this.s);
                            if (C0615o.b(j5) == C0615o.b(this.t.n)) {
                                j3 = this.t.n;
                                return;
                            }
                        } else {
                            j5 = j3;
                        }
                        long a4 = a(aVar, j5);
                        if (j3 == a4) {
                            z3 = false;
                        }
                        z2 |= z3;
                        j4 = a4;
                        this.t = this.t.a(aVar, j4, j2, e());
                        if (z2) {
                        }
                    }
                }
                this.D = dVar2;
                j4 = j3;
                this.t = this.t.a(aVar, j4, j2, e());
                if (z2) {
                }
            }
        }
        z2 = true;
        try {
            if (this.u != null) {
            }
            this.D = dVar2;
            j4 = j3;
            this.t = this.t.a(aVar, j4, j2, e());
            if (z2) {
            }
        } finally {
            this.t = this.t.a(aVar, j3, j2, e());
            if (z2) {
                this.o.b(2);
            }
        }
    }

    private void d(q qVar) throws C0618s {
        if (this.r.a(qVar)) {
            E d2 = this.r.d();
            d2.a(this.n.c().b, this.t.b);
            a(d2.f(), d2.g());
            if (!this.r.g()) {
                b(this.r.a().f.b);
                a((E) null);
            }
            h();
        }
    }

    public /* synthetic */ void b(M m2) {
        try {
            c(m2);
        } catch (C0618s e2) {
            Iq.a("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
            throw new RuntimeException(e2);
        }
    }

    private void b(O o2) throws C0618s {
        if (o2.getState() == 2) {
            o2.stop();
        }
    }

    private Pair<Object, Long> b(X x2, int i2, long j2) {
        return x2.a(this.j, this.k, i2, j2);
    }

    private void b(J j2) throws C0618s {
        O[] oArr;
        this.i.obtainMessage(1, j2).sendToTarget();
        a(j2.b);
        for (O o2 : this.a) {
            if (o2 != null) {
                o2.a(j2.b);
            }
        }
    }

    private void c(J j2) {
        this.n.a(j2);
    }

    private void c(M m2) throws C0618s {
        if (!m2.j()) {
            try {
                m2.f().a(m2.h(), m2.d());
            } finally {
                m2.a(true);
            }
        }
    }

    private void c(q qVar) {
        if (this.r.a(qVar)) {
            this.r.a(this.E);
            h();
        }
    }

    private boolean c(O o2) {
        E b2 = this.r.f().b();
        return b2 != null && b2.d && o2.g();
    }

    private void c(boolean z2) {
        long j2;
        E d2 = this.r.d();
        com.google.android.exoplayer2.source.r.a aVar = d2 == null ? this.t.d : d2.f.a;
        boolean z3 = !this.t.k.equals(aVar);
        if (z3) {
            this.t = this.t.a(aVar);
        }
        I i2 = this.t;
        if (d2 == null) {
            j2 = i2.n;
        } else {
            j2 = d2.a();
        }
        i2.l = j2;
        this.t.m = e();
        if ((z3 || z2) && d2 != null && d2.d) {
            a(d2.f(), d2.g());
        }
    }

    private long a(com.google.android.exoplayer2.source.r.a aVar, long j2) throws C0618s {
        return a(aVar, j2, this.r.e() != this.r.f());
    }

    private long a(com.google.android.exoplayer2.source.r.a aVar, long j2, boolean z2) throws C0618s {
        r();
        this.y = false;
        b(2);
        E e2 = this.r.e();
        E e3 = e2;
        while (true) {
            if (e3 != null) {
                if (aVar.equals(e3.f.a) && e3.d) {
                    this.r.a(e3);
                    break;
                }
                e3 = this.r.a();
            } else {
                break;
            }
        }
        if (e2 != e3 || z2) {
            for (O a2 : this.v) {
                a(a2);
            }
            this.v = new O[0];
            e2 = null;
        }
        if (e3 != null) {
            a(e2);
            if (e3.e) {
                long a3 = e3.a.a(j2);
                e3.a.a(a3 - this.l, this.m);
                j2 = a3;
            }
            b(j2);
            h();
        } else {
            this.r.a(true);
            this.t = this.t.a(TrackGroupArray.a, this.d);
            b(j2);
        }
        c(false);
        this.g.a(2);
        return j2;
    }

    private void a(T t2) {
        this.s = t2;
    }

    private void a(boolean z2, AtomicBoolean atomicBoolean) {
        O[] oArr;
        if (this.B != z2) {
            this.B = z2;
            if (!z2) {
                for (O o2 : this.a) {
                    if (o2.getState() == 0) {
                        o2.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void a(boolean z2, boolean z3, boolean z4) {
        a(z2 || !this.B, true, z3, z3);
        this.o.a(this.C + (z4 ? 1 : 0));
        this.C = 0;
        this.e.e();
        b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    private void a(boolean z2, boolean z3, boolean z4, boolean z5) {
        String str;
        boolean z6;
        long j2;
        this.g.b(2);
        this.y = false;
        this.n.b();
        this.E = 0;
        O[] oArr = this.v;
        int length = oArr.length;
        int i2 = 0;
        while (true) {
            str = "ExoPlayerImplInternal";
            if (i2 >= length) {
                break;
            }
            try {
                a(oArr[i2]);
            } catch (C0618s | RuntimeException e2) {
                Iq.a(str, "Disable failed.", e2);
            }
            i2++;
        }
        if (z2) {
            for (O reset : this.a) {
                try {
                    reset.reset();
                } catch (RuntimeException e3) {
                    Iq.a(str, "Reset failed.", e3);
                }
            }
        }
        this.v = new O[0];
        boolean z7 = true;
        if (z4) {
            this.D = null;
        } else if (z5) {
            if (this.D == null && !this.t.b.c()) {
                I i3 = this.t;
                i3.b.a(i3.d.a, this.k);
                this.D = new d(X.a, this.k.c, this.t.n + this.k.e());
            }
            z6 = true;
            G g2 = this.r;
            if (z6) {
                z7 = false;
            }
            g2.a(z7);
            e(false);
            if (z5) {
                this.r.a(X.a);
                Iterator it = this.p.iterator();
                while (it.hasNext()) {
                    ((b) it.next()).a.a(false);
                }
                this.p.clear();
                this.F = 0;
            }
            com.google.android.exoplayer2.source.r.a a2 = !z6 ? this.t.a(this.A, this.j) : this.t.d;
            long j3 = -9223372036854775807L;
            if (!z6) {
                j2 = -9223372036854775807L;
            } else {
                j2 = this.t.n;
            }
            if (!z6) {
                j3 = this.t.f;
            }
            long j4 = j3;
            X x2 = !z5 ? X.a : this.t.b;
            Object obj = !z5 ? null : this.t.c;
            I i4 = this.t;
            I i5 = new I(x2, obj, a2, j2, j4, i4.g, false, !z5 ? TrackGroupArray.a : i4.i, !z5 ? this.d : this.t.j, a2, j2, 0, j2);
            this.t = i5;
            if (!z3) {
                r rVar = this.u;
                if (rVar != null) {
                    rVar.a((com.google.android.exoplayer2.source.r.b) this);
                    this.u = null;
                    return;
                }
                return;
            }
            return;
        }
        z6 = z4;
        G g22 = this.r;
        if (z6) {
        }
        g22.a(z7);
        e(false);
        if (z5) {
        }
        com.google.android.exoplayer2.source.r.a a22 = !z6 ? this.t.a(this.A, this.j) : this.t.d;
        long j32 = -9223372036854775807L;
        if (!z6) {
        }
        if (!z6) {
        }
        long j42 = j32;
        X x22 = !z5 ? X.a : this.t.b;
        if (!z5) {
        }
        I i42 = this.t;
        I i52 = new I(x22, obj, a22, j2, j42, i42.g, false, !z5 ? TrackGroupArray.a : i42.i, !z5 ? this.d : this.t.j, a22, j2, 0, j2);
        this.t = i52;
        if (!z3) {
        }
    }

    private boolean a(b bVar) {
        Object obj = bVar.d;
        if (obj == null) {
            Pair a2 = a(new d(bVar.a.g(), bVar.a.i(), C0615o.a(bVar.a.e())), false);
            if (a2 == null) {
                return false;
            }
            bVar.a(this.t.b.a(a2.first), ((Long) a2.second).longValue(), a2.first);
        } else {
            int a3 = this.t.b.a(obj);
            if (a3 == -1) {
                return false;
            }
            bVar.b = a3;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0097 A[LOOP:1: B:24:0x0075->B:34:0x0097, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x005f A[EDGE_INSN: B:67:0x005f->B:20:0x005f ?: BREAK  
EDGE_INSN: B:67:0x005f->B:20:0x005f ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0074 A[EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  
EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  
EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0074 A[EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  
EDGE_INSN: B:70:0x0074->B:23:0x0074 ?: BREAK  , SYNTHETIC] */
    private void a(long j2, long j3) throws C0618s {
        b bVar;
        b bVar2;
        long j4;
        if (!this.p.isEmpty() && !this.t.d.a()) {
            if (this.t.e == j2) {
                j2--;
            }
            I i2 = this.t;
            int a2 = i2.b.a(i2.d.a);
            int i3 = this.F;
            if (i3 > 0) {
                bVar = (b) this.p.get(i3 - 1);
                while (true) {
                    if (bVar != null) {
                        break;
                    }
                    int i4 = bVar.b;
                    if (i4 <= a2 && (i4 != a2 || bVar.c <= j2)) {
                        break;
                    }
                    this.F--;
                    int i5 = this.F;
                    if (i5 <= 0) {
                        break;
                    }
                    bVar = (b) this.p.get(i5 - 1);
                    bVar = (b) this.p.get(i5 - 1);
                }
                if (this.F < this.p.size()) {
                    bVar2 = (b) this.p.get(this.F);
                    while (true) {
                        if (bVar2 != null && bVar2.d != null) {
                            int i6 = bVar2.b;
                            if (i6 >= a2 && (i6 != a2 || bVar2.c > j2)) {
                                break;
                            }
                            this.F++;
                            if (this.F >= this.p.size()) {
                                break;
                            }
                            bVar2 = (b) this.p.get(this.F);
                            bVar2 = (b) this.p.get(this.F);
                        } else {
                            break;
                        }
                    }
                    while (bVar2 != null && bVar2.d != null && bVar2.b == a2) {
                        j4 = bVar2.c;
                        if (j4 > j2 && j4 <= j3) {
                            try {
                                e(bVar2.a);
                                bVar2 = this.F < this.p.size() ? (b) this.p.get(this.F) : null;
                            } finally {
                                if (bVar2.a.b() || bVar2.a.j()) {
                                    this.p.remove(this.F);
                                } else {
                                    this.F++;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    return;
                }
                bVar2 = null;
                while (true) {
                    int i62 = bVar2.b;
                    this.F++;
                    if (this.F >= this.p.size()) {
                    }
                    bVar2 = (b) this.p.get(this.F);
                }
                while (bVar2 != null) {
                    j4 = bVar2.c;
                    if (j4 > j2) {
                        return;
                    }
                    return;
                }
            }
            bVar = null;
            while (true) {
                if (bVar != null) {
                }
                bVar = (b) this.p.get(i5 - 1);
            }
            if (this.F < this.p.size()) {
            }
            bVar2 = null;
            while (true) {
                int i622 = bVar2.b;
                this.F++;
                if (this.F >= this.p.size()) {
                }
                bVar2 = (b) this.p.get(this.F);
            }
            while (bVar2 != null) {
            }
        }
    }

    private void a(O o2) throws C0618s {
        this.n.a(o2);
        b(o2);
        o2.d();
    }

    private void a(float f2) {
        l[] a2;
        E c2 = this.r.c();
        while (c2 != null && c2.d) {
            for (l lVar : c2.g().c.a()) {
                if (lVar != null) {
                    lVar.a(f2);
                }
            }
            c2 = c2.b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f5 A[LOOP:0: B:40:0x00f5->B:52:0x00f5, LOOP_START, PHI: r14 
  PHI: (r14v12 com.google.android.exoplayer2.E) = (r14v9 com.google.android.exoplayer2.E), (r14v13 com.google.android.exoplayer2.E) binds: [B:39:0x00f3, B:52:0x00f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x011d  */
    private void a(a aVar) throws C0618s {
        long j2;
        com.google.android.exoplayer2.source.r.a aVar2;
        E c2;
        long longValue;
        com.google.android.exoplayer2.source.r.a a2;
        if (aVar.a == this.u) {
            this.o.a(this.C);
            this.C = 0;
            X x2 = this.t.b;
            X x3 = aVar.b;
            Object obj = aVar.c;
            this.r.a(x3);
            this.t = this.t.a(x3, obj);
            p();
            com.google.android.exoplayer2.source.r.a aVar3 = this.t.d;
            long j3 = aVar3.a() ? this.t.f : this.t.n;
            d dVar = this.D;
            if (dVar != null) {
                Pair a3 = a(dVar, true);
                this.D = null;
                if (a3 == null) {
                    f();
                    return;
                } else {
                    longValue = ((Long) a3.second).longValue();
                    a2 = this.r.a(a3.first, longValue);
                }
            } else if (j3 == -9223372036854775807L && !x3.c()) {
                Pair b2 = b(x3, x3.a(this.A), -9223372036854775807L);
                longValue = ((Long) b2.second).longValue();
                a2 = this.r.a(b2.first, longValue);
            } else if (x3.a(aVar3.a) == -1) {
                Object a4 = a(aVar3.a, x2, x3);
                if (a4 == null) {
                    f();
                    return;
                }
                Pair b3 = b(x3, x3.a(a4, this.k).c, -9223372036854775807L);
                longValue = ((Long) b3.second).longValue();
                a2 = this.r.a(b3.first, longValue);
            } else {
                if (aVar3.a()) {
                    aVar3 = this.r.a(aVar3.a, j3);
                }
                aVar2 = aVar3;
                j2 = j3;
                if (this.t.d.equals(aVar2) || j3 != j2) {
                    c2 = this.r.c();
                    if (c2 != null) {
                        while (c2.b() != null) {
                            c2 = c2.b();
                            if (c2.f.a.equals(aVar2)) {
                                c2.f = this.r.a(c2.f);
                            }
                        }
                    }
                    this.t = this.t.a(aVar2, a(aVar2, !aVar2.a() ? 0 : j2), j2, e());
                } else if (!this.r.a(this.E, d())) {
                    d(false);
                }
                c(false);
            }
            aVar2 = a2;
            j2 = longValue;
            if (this.t.d.equals(aVar2)) {
            }
            c2 = this.r.c();
            if (c2 != null) {
            }
            this.t = this.t.a(aVar2, a(aVar2, !aVar2.a() ? 0 : j2), j2, e());
            c(false);
        }
    }

    private Object a(Object obj, X x2, X x3) {
        int a2 = x2.a(obj);
        int a3 = x2.a();
        int i2 = a2;
        int i3 = -1;
        for (int i4 = 0; i4 < a3 && i3 == -1; i4++) {
            i2 = x2.a(i2, this.k, this.j, this.z, this.A);
            if (i2 == -1) {
                break;
            }
            i3 = x3.a(x2.a(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return x3.a(i3);
    }

    private Pair<Object, Long> a(d dVar, boolean z2) {
        X x2 = this.t.b;
        X x3 = dVar.a;
        if (x2.c()) {
            return null;
        }
        if (x3.c()) {
            x3 = x2;
        }
        try {
            Pair<Object, Long> a2 = x3.a(this.j, this.k, dVar.b, dVar.c);
            if (x2 == x3) {
                return a2;
            }
            int a3 = x2.a(a2.first);
            if (a3 != -1) {
                return a2;
            }
            if (z2 && a(a2.first, x3, x2) != null) {
                return b(x2, x2.a(a3, this.k).c, -9223372036854775807L);
            }
            return null;
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    private void a(E e2) throws C0618s {
        E e3 = this.r.e();
        if (e3 != null && e2 != e3) {
            boolean[] zArr = new boolean[this.a.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                O[] oArr = this.a;
                if (i2 < oArr.length) {
                    O o2 = oArr[i2];
                    zArr[i2] = o2.getState() != 0;
                    if (e3.g().a(i2)) {
                        i3++;
                    }
                    if (zArr[i2] && (!e3.g().a(i2) || (o2.j() && o2.l() == e2.c[i2]))) {
                        a(o2);
                    }
                    i2++;
                } else {
                    this.t = this.t.a(e3.f(), e3.g());
                    a(zArr, i3);
                    return;
                }
            }
        }
    }

    private void a(boolean[] zArr, int i2) throws C0618s {
        this.v = new O[i2];
        p g2 = this.r.e().g();
        for (int i3 = 0; i3 < this.a.length; i3++) {
            if (!g2.a(i3)) {
                this.a[i3].reset();
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a.length; i5++) {
            if (g2.a(i5)) {
                int i6 = i4 + 1;
                a(i5, zArr[i5], i4);
                i4 = i6;
            }
        }
    }

    private void a(int i2, boolean z2, int i3) throws C0618s {
        E e2 = this.r.e();
        O o2 = this.a[i2];
        this.v[i3] = o2;
        if (o2.getState() == 0) {
            p g2 = e2.g();
            Q q2 = g2.b[i2];
            Format[] a2 = a(g2.c.a(i2));
            boolean z3 = this.x && this.t.g == 3;
            o2.a(q2, a2, e2.c[i2], this.E, !z2 && z3, e2.d());
            this.n.b(o2);
            if (z3) {
                o2.start();
            }
        }
    }

    private long a(long j2) {
        E d2 = this.r.d();
        if (d2 == null) {
            return 0;
        }
        return j2 - d2.c(this.E);
    }

    private void a(TrackGroupArray trackGroupArray, p pVar) {
        this.e.a(this.a, trackGroupArray, pVar.c);
    }

    private static Format[] a(l lVar) {
        int length = lVar != null ? lVar.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            formatArr[i2] = lVar.a(i2);
        }
        return formatArr;
    }
}
