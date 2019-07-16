package com.google.android.exoplayer2;

/* renamed from: com.google.android.exoplayer2.q reason: case insensitive filesystem */
/* compiled from: DefaultMediaClock */
final class C0617q implements Kq {
    private final Vq a;
    private final a b;
    private O c;
    private Kq d;

    /* renamed from: com.google.android.exoplayer2.q$a */
    /* compiled from: DefaultMediaClock */
    public interface a {
        void a(J j);
    }

    public C0617q(a aVar, C1882yq yqVar) {
        this.b = aVar;
        this.a = new Vq(yqVar);
    }

    private void e() {
        this.a.a(this.d.f());
        J c2 = this.d.c();
        if (!c2.equals(this.a.c())) {
            this.a.a(c2);
            this.b.a(c2);
        }
    }

    private boolean g() {
        O o = this.c;
        return o != null && !o.a() && (this.c.b() || !this.c.g());
    }

    public void a() {
        this.a.a();
    }

    public void b() {
        this.a.b();
    }

    public J c() {
        Kq kq = this.d;
        if (kq != null) {
            return kq.c();
        }
        return this.a.c();
    }

    public long d() {
        if (!g()) {
            return this.a.f();
        }
        e();
        return this.d.f();
    }

    public long f() {
        if (g()) {
            return this.d.f();
        }
        return this.a.f();
    }

    public void a(long j) {
        this.a.a(j);
    }

    public void b(O o) throws C0618s {
        Kq n = o.n();
        if (n != null) {
            Kq kq = this.d;
            if (n == kq) {
                return;
            }
            if (kq == null) {
                this.d = n;
                this.c = o;
                this.d.a(this.a.c());
                e();
                return;
            }
            throw C0618s.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
        }
    }

    public void a(O o) {
        if (o == this.c) {
            this.d = null;
            this.c = null;
        }
    }

    public J a(J j) {
        Kq kq = this.d;
        if (kq != null) {
            j = kq.a(j);
        }
        this.a.a(j);
        this.b.a(j);
        return j;
    }
}
