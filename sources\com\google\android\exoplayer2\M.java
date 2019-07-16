package com.google.android.exoplayer2;

import android.os.Handler;

/* compiled from: PlayerMessage */
public final class M {
    private final b a;
    private final a b;
    private final X c;
    private int d;
    private Object e;
    private Handler f;
    private int g;
    private long h = -9223372036854775807L;
    private boolean i = true;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;

    /* compiled from: PlayerMessage */
    public interface a {
        void a(M m);
    }

    /* compiled from: PlayerMessage */
    public interface b {
        void a(int i, Object obj) throws C0618s;
    }

    public M(a aVar, b bVar, X x, int i2, Handler handler) {
        this.b = aVar;
        this.a = bVar;
        this.c = x;
        this.f = handler;
        this.g = i2;
    }

    public M a(int i2) {
        C1852xq.b(!this.j);
        this.d = i2;
        return this;
    }

    public boolean b() {
        return this.i;
    }

    public Handler c() {
        return this.f;
    }

    public Object d() {
        return this.e;
    }

    public long e() {
        return this.h;
    }

    public b f() {
        return this.a;
    }

    public X g() {
        return this.c;
    }

    public int h() {
        return this.d;
    }

    public int i() {
        return this.g;
    }

    public synchronized boolean j() {
        return this.m;
    }

    public M k() {
        C1852xq.b(!this.j);
        if (this.h == -9223372036854775807L) {
            C1852xq.a(this.i);
        }
        this.j = true;
        this.b.a(this);
        return this;
    }

    public M a(Object obj) {
        C1852xq.b(!this.j);
        this.e = obj;
        return this;
    }

    public synchronized boolean a() throws InterruptedException {
        C1852xq.b(this.j);
        C1852xq.b(this.f.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public synchronized void a(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }
}
