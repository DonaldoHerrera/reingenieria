package com.facebook.internal;

import com.facebook.B;
import java.util.concurrent.Executor;

/* compiled from: WorkQueue */
public class ra {
    /* access modifiers changed from: private */
    public final Object a;
    /* access modifiers changed from: private */
    public b b;
    private final int c;
    private final Executor d;
    private b e;
    private int f;

    /* compiled from: WorkQueue */
    public interface a {
        void a();

        boolean cancel();
    }

    /* compiled from: WorkQueue */
    private class b implements a {
        private final Runnable a;
        private b b;
        private b c;
        private boolean d;

        b(Runnable runnable) {
            this.a = runnable;
        }

        public void a() {
            synchronized (ra.this.a) {
                if (!c()) {
                    ra.this.b = a(ra.this.b);
                    ra.this.b = a(ra.this.b, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public Runnable b() {
            return this.a;
        }

        public boolean c() {
            return this.d;
        }

        public boolean cancel() {
            synchronized (ra.this.a) {
                if (c()) {
                    return false;
                }
                ra.this.b = a(ra.this.b);
                return true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(boolean z) {
            this.d = z;
        }

        /* access modifiers changed from: 0000 */
        public b a(b bVar, boolean z) {
            if (bVar == null) {
                this.c = this;
                this.b = this;
                bVar = this;
            } else {
                this.b = bVar;
                this.c = bVar.c;
                b bVar2 = this.b;
                this.c.b = this;
                bVar2.c = this;
            }
            return z ? this : bVar;
        }

        /* access modifiers changed from: 0000 */
        public b a(b bVar) {
            if (bVar == this) {
                bVar = this.b;
                if (bVar == this) {
                    bVar = null;
                }
            }
            b bVar2 = this.b;
            bVar2.c = this.c;
            this.c.b = bVar2;
            this.c = null;
            this.b = null;
            return bVar;
        }
    }

    public ra(int i) {
        this(i, B.m());
    }

    public ra(int i, Executor executor) {
        this.a = new Object();
        this.e = null;
        this.f = 0;
        this.c = i;
        this.d = executor;
    }

    /* access modifiers changed from: private */
    public void b(b bVar) {
        b bVar2;
        synchronized (this.a) {
            if (bVar != null) {
                this.e = bVar.a(this.e);
                this.f--;
            }
            if (this.f < this.c) {
                bVar2 = this.b;
                if (bVar2 != null) {
                    this.b = bVar2.a(this.b);
                    this.e = bVar2.a(this.e, false);
                    this.f++;
                    bVar2.a(true);
                }
            } else {
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            a(bVar2);
        }
    }

    public a a(Runnable runnable) {
        return a(runnable, true);
    }

    public a a(Runnable runnable, boolean z) {
        b bVar = new b(runnable);
        synchronized (this.a) {
            this.b = bVar.a(this.b, z);
        }
        a();
        return bVar;
    }

    private void a() {
        b((b) null);
    }

    private void a(b bVar) {
        this.d.execute(new qa(this, bVar));
    }
}
