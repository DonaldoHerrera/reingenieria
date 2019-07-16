package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.K.b;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.trackselection.l;
import com.google.android.exoplayer2.trackselection.o;
import com.google.android.exoplayer2.trackselection.p;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.w reason: case insensitive filesystem */
/* compiled from: ExoPlayerImpl */
final class C0625w extends C0613m implements C0622t {
    final p b;
    private final O[] c;
    private final o d;
    private final Handler e;
    private final y f;
    private final Handler g;
    private final CopyOnWriteArrayList<a> h;
    private final com.google.android.exoplayer2.X.a i;
    private final ArrayDeque<Runnable> j;
    private r k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private int p;
    private boolean q;
    private boolean r;
    private J s;
    private T t;
    private C0618s u;
    private I v;
    private int w;
    private int x;
    private long y;

    /* renamed from: com.google.android.exoplayer2.w$a */
    /* compiled from: ExoPlayerImpl */
    private static final class a implements Runnable {
        private final I a;
        private final CopyOnWriteArrayList<a> b;
        private final o c;
        private final boolean d;
        private final int e;
        private final int f;
        private final boolean g;
        private final boolean h;
        private final boolean i;
        private final boolean j;
        private final boolean k;
        private final boolean l;

        public a(I i2, I i3, CopyOnWriteArrayList<a> copyOnWriteArrayList, o oVar, boolean z, int i4, int i5, boolean z2, boolean z3) {
            this.a = i2;
            this.b = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
            this.c = oVar;
            this.d = z;
            this.e = i4;
            this.f = i5;
            this.g = z2;
            this.l = z3;
            boolean z4 = true;
            this.h = i3.g != i2.g;
            this.i = (i3.b == i2.b && i3.c == i2.c) ? false : true;
            this.j = i3.h != i2.h;
            if (i3.j == i2.j) {
                z4 = false;
            }
            this.k = z4;
        }

        public /* synthetic */ void a(b bVar) {
            I i2 = this.a;
            bVar.a(i2.b, i2.c, this.f);
        }

        public /* synthetic */ void b(b bVar) {
            bVar.b(this.e);
        }

        public /* synthetic */ void c(b bVar) {
            I i2 = this.a;
            bVar.a(i2.i, i2.j.c);
        }

        public /* synthetic */ void d(b bVar) {
            bVar.a(this.a.h);
        }

        public /* synthetic */ void e(b bVar) {
            bVar.a(this.l, this.a.g);
        }

        public void run() {
            if (this.i || this.f == 0) {
                C0625w.c(this.b, new C0607g(this));
            }
            if (this.d) {
                C0625w.c(this.b, new C0606f(this));
            }
            if (this.k) {
                this.c.a(this.a.j.d);
                C0625w.c(this.b, new C0609i(this));
            }
            if (this.j) {
                C0625w.c(this.b, new C0608h(this));
            }
            if (this.h) {
                C0625w.c(this.b, new C0610j(this));
            }
            if (this.g) {
                C0625w.c(this.b, C0601a.a);
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    public C0625w(O[] oArr, o oVar, D d2, Up up, C1882yq yqVar, Looper looper) {
        O[] oArr2 = oArr;
        StringBuilder sb = new StringBuilder();
        sb.append("Init ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.10.1");
        sb.append("] [");
        sb.append(C0471ar.e);
        sb.append("]");
        Iq.c("ExoPlayerImpl", sb.toString());
        C1852xq.b(oArr2.length > 0);
        C1852xq.a(oArr);
        this.c = oArr2;
        C1852xq.a(oVar);
        this.d = oVar;
        this.l = false;
        this.n = 0;
        this.o = false;
        this.h = new CopyOnWriteArrayList<>();
        this.b = new p(new Q[oArr2.length], new l[oArr2.length], null);
        this.i = new com.google.android.exoplayer2.X.a();
        this.s = J.a;
        this.t = T.e;
        this.e = new C0624v(this, looper);
        this.v = I.a(0, this.b);
        this.j = new ArrayDeque<>();
        y yVar = new y(oArr, oVar, this.b, d2, up, this.l, this.n, this.o, this.e, yqVar);
        this.f = yVar;
        this.g = new Handler(this.f.a());
    }

    private boolean r() {
        return this.v.b.c() || this.p > 0;
    }

    public void c(b bVar) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a.equals(bVar)) {
                aVar.a();
                this.h.remove(aVar);
            }
        }
    }

    public X d() {
        return this.v.b;
    }

    public int e() {
        if (p()) {
            return this.v.d.c;
        }
        return -1;
    }

    public long f() {
        if (!p()) {
            return getCurrentPosition();
        }
        I i2 = this.v;
        i2.b.a(i2.d.a, this.i);
        return this.i.d() + C0615o.b(this.v.f);
    }

    public long getCurrentPosition() {
        if (r()) {
            return this.y;
        }
        if (this.v.d.a()) {
            return C0615o.b(this.v.n);
        }
        I i2 = this.v;
        return a(i2.d, i2.n);
    }

    public Looper j() {
        return this.e.getLooper();
    }

    public int k() {
        if (r()) {
            return this.x;
        }
        I i2 = this.v;
        return i2.b.a(i2.d.a);
    }

    public long l() {
        if (!p()) {
            return g();
        }
        I i2 = this.v;
        com.google.android.exoplayer2.source.r.a aVar = i2.d;
        i2.b.a(aVar.a, this.i);
        return C0615o.b(this.i.a(aVar.b, aVar.c));
    }

    public boolean m() {
        return this.l;
    }

    public C0618s n() {
        return this.u;
    }

    public int o() {
        return this.v.g;
    }

    public boolean p() {
        return !r() && this.v.d.a();
    }

    public void q() {
        StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.10.1");
        String str = "] [";
        sb.append(str);
        sb.append(C0471ar.e);
        sb.append(str);
        sb.append(z.a());
        sb.append("]");
        Iq.c("ExoPlayerImpl", sb.toString());
        this.k = null;
        this.f.b();
        this.e.removeCallbacksAndMessages(null);
        this.v = a(false, false, 1);
    }

    public void a(b bVar) {
        this.h.addIfAbsent(new a(bVar));
    }

    public int b() {
        if (r()) {
            return this.w;
        }
        I i2 = this.v;
        return i2.b.a(i2.d.a, this.i).c;
    }

    public void a(r rVar, boolean z, boolean z2) {
        this.u = null;
        this.k = rVar;
        I a2 = a(z, z2, 2);
        this.q = true;
        this.p++;
        this.f.a(rVar, z, z2);
        a(a2, false, 4, 1, false);
    }

    public int c() {
        if (p()) {
            return this.v.d.b;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public static void c(CopyOnWriteArrayList<a> copyOnWriteArrayList, b bVar) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(bVar);
        }
    }

    public void a(boolean z, boolean z2) {
        boolean z3 = z && !z2;
        if (this.m != z3) {
            this.m = z3;
            this.f.a(z3);
        }
        if (this.l != z) {
            this.l = z;
            a((b) new C0603c(z, this.v.g));
        }
    }

    public void a(int i2, long j2) {
        X x2 = this.v.b;
        if (i2 < 0 || (!x2.c() && i2 >= x2.b())) {
            throw new C(x2, i2, j2);
        }
        this.r = true;
        this.p++;
        if (p()) {
            Iq.d("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.e.obtainMessage(0, 1, -1, this.v).sendToTarget();
            return;
        }
        this.w = i2;
        if (x2.c()) {
            this.y = j2 == -9223372036854775807L ? 0 : j2;
            this.x = 0;
        } else {
            long b2 = j2 == -9223372036854775807L ? x2.a(i2, this.a).b() : C0615o.a(j2);
            Pair a2 = x2.a(this.a, this.i, i2, b2);
            this.y = C0615o.b(b2);
            this.x = x2.a(a2.first);
        }
        this.f.a(x2, i2, C0615o.a(j2));
        a((b) C0604d.a);
    }

    public void a(boolean z) {
        if (z) {
            this.u = null;
            this.k = null;
        }
        I a2 = a(z, z, 1);
        this.p++;
        this.f.b(z);
        a(a2, false, 4, 1, false);
    }

    public M a(M.b bVar) {
        M m2 = new M(this.f, bVar, this.v.b, b(), this.g);
        return m2;
    }

    public long a() {
        return Math.max(0, C0615o.b(this.v.m));
    }

    /* access modifiers changed from: 0000 */
    public void a(Message message) {
        int i2 = message.what;
        boolean z = true;
        if (i2 == 0) {
            I i3 = (I) message.obj;
            int i4 = message.arg1;
            if (message.arg2 == -1) {
                z = false;
            }
            a(i3, i4, z, message.arg2);
        } else if (i2 == 1) {
            J j2 = (J) message.obj;
            if (!this.s.equals(j2)) {
                this.s = j2;
                a((b) new C0605e(j2));
            }
        } else if (i2 == 2) {
            C0618s sVar = (C0618s) message.obj;
            this.u = sVar;
            a((b) new C0611k(sVar));
        } else {
            throw new IllegalStateException();
        }
    }

    private void a(I i2, int i3, boolean z, int i4) {
        this.p -= i3;
        if (this.p == 0) {
            if (i2.e == -9223372036854775807L) {
                i2 = i2.a(i2.d, 0, i2.f);
            }
            I i5 = i2;
            if (!this.v.b.c() && i5.b.c()) {
                this.x = 0;
                this.w = 0;
                this.y = 0;
            }
            int i6 = this.q ? 0 : 2;
            boolean z2 = this.r;
            this.q = false;
            this.r = false;
            a(i5, z, i4, i6, z2);
        }
    }

    private I a(boolean z, boolean z2, int i2) {
        long j2;
        long j3 = 0;
        boolean z3 = false;
        if (z) {
            this.w = 0;
            this.x = 0;
            this.y = 0;
        } else {
            this.w = b();
            this.x = k();
            this.y = getCurrentPosition();
        }
        if (z || z2) {
            z3 = true;
        }
        com.google.android.exoplayer2.source.r.a a2 = z3 ? this.v.a(this.o, this.a) : this.v.d;
        if (!z3) {
            j3 = this.v.n;
        }
        long j4 = j3;
        if (z3) {
            j2 = -9223372036854775807L;
        } else {
            j2 = this.v.f;
        }
        I i3 = new I(z2 ? X.a : this.v.b, z2 ? null : this.v.c, a2, j4, j2, i2, false, z2 ? TrackGroupArray.a : this.v.i, z2 ? this.b : this.v.j, a2, j4, 0, j4);
        return i3;
    }

    private void a(I i2, boolean z, int i3, int i4, boolean z2) {
        I i5 = this.v;
        I i6 = i2;
        this.v = i6;
        a aVar = new a(i6, i5, this.h, this.d, z, i3, i4, z2, this.l);
        a((Runnable) aVar);
    }

    private void a(b bVar) {
        a((Runnable) new C0602b(new CopyOnWriteArrayList(this.h), bVar));
    }

    private void a(Runnable runnable) {
        boolean z = !this.j.isEmpty();
        this.j.addLast(runnable);
        if (!z) {
            while (!this.j.isEmpty()) {
                ((Runnable) this.j.peekFirst()).run();
                this.j.removeFirst();
            }
        }
    }

    private long a(com.google.android.exoplayer2.source.r.a aVar, long j2) {
        long b2 = C0615o.b(j2);
        this.v.b.a(aVar.a, this.i);
        return b2 + this.i.d();
    }
}
