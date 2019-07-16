package defpackage;

import defpackage.Qm;
import defpackage.Rm;
import java.lang.Exception;
import java.util.ArrayDeque;

/* renamed from: Tm reason: default package */
/* compiled from: SimpleDecoder */
public abstract class Tm<I extends Qm, O extends Rm, E extends Exception> implements Om<I, O, E> {
    private final Thread a;
    private final Object b = new Object();
    private final ArrayDeque<I> c = new ArrayDeque<>();
    private final ArrayDeque<O> d = new ArrayDeque<>();
    private final I[] e;
    private final O[] f;
    private int g;
    private int h;
    private I i;
    private E j;
    private boolean k;
    private boolean l;
    private int m;

    protected Tm(I[] iArr, O[] oArr) {
        this.e = iArr;
        this.g = iArr.length;
        for (int i2 = 0; i2 < this.g; i2++) {
            this.e[i2] = c();
        }
        this.f = oArr;
        this.h = oArr.length;
        for (int i3 = 0; i3 < this.h; i3++) {
            this.f[i3] = d();
        }
        this.a = new Sm(this);
        this.a.start();
    }

    private boolean e() {
        return !this.c.isEmpty() && this.h > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        if (r1.d() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r3.b(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r1.c() == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r3.b(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6.j = a(r1, r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        r6.j = a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        r6.j = a((java.lang.Throwable) r0);
     */
    private boolean f() throws InterruptedException {
        Qm qm;
        O o;
        synchronized (this.b) {
            while (!this.l && !e()) {
                this.b.wait();
            }
            if (this.l) {
                return false;
            }
            qm = (Qm) this.c.removeFirst();
            O[] oArr = this.f;
            int i2 = this.h - 1;
            this.h = i2;
            o = oArr[i2];
            boolean z = this.k;
            this.k = false;
        }
        if (this.j != null) {
            synchronized (this.b) {
            }
            return false;
        }
        synchronized (this.b) {
            if (this.k) {
                o.f();
            } else if (o.c()) {
                this.m++;
                o.f();
            } else {
                o.c = this.m;
                this.m = 0;
                this.d.addLast(o);
            }
            b((I) qm);
        }
        return true;
    }

    private void g() {
        if (e()) {
            this.b.notify();
        }
    }

    private void h() throws Exception {
        E e2 = this.j;
        if (e2 != null) {
            throw e2;
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (f());
    }

    /* access modifiers changed from: protected */
    public abstract E a(I i2, O o, boolean z);

    /* access modifiers changed from: protected */
    public abstract E a(Throwable th);

    /* access modifiers changed from: protected */
    public abstract I c();

    /* access modifiers changed from: protected */
    public abstract O d();

    public final void flush() {
        synchronized (this.b) {
            this.k = true;
            this.m = 0;
            if (this.i != null) {
                b(this.i);
                this.i = null;
            }
            while (!this.c.isEmpty()) {
                b((I) (Qm) this.c.removeFirst());
            }
            while (!this.d.isEmpty()) {
                ((Rm) this.d.removeFirst()).f();
            }
        }
    }

    public void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public final I b() throws Exception {
        I i2;
        I i3;
        synchronized (this.b) {
            h();
            C1852xq.b(this.i == null);
            if (this.g == 0) {
                i2 = null;
            } else {
                I[] iArr = this.e;
                int i4 = this.g - 1;
                this.g = i4;
                i2 = iArr[i4];
            }
            this.i = i2;
            i3 = this.i;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        C1852xq.b(this.g == this.e.length);
        for (I f2 : this.e) {
            f2.f(i2);
        }
    }

    public final void a(I i2) throws Exception {
        synchronized (this.b) {
            h();
            C1852xq.a(i2 == this.i);
            this.c.addLast(i2);
            g();
            this.i = null;
        }
    }

    private void b(I i2) {
        i2.b();
        I[] iArr = this.e;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr[i3] = i2;
    }

    private void b(O o) {
        o.b();
        O[] oArr = this.f;
        int i2 = this.h;
        this.h = i2 + 1;
        oArr[i2] = o;
    }

    public final O a() throws Exception {
        synchronized (this.b) {
            h();
            if (this.d.isEmpty()) {
                return null;
            }
            O o = (Rm) this.d.removeFirst();
            return o;
        }
    }

    /* access modifiers changed from: protected */
    public void a(O o) {
        synchronized (this.b) {
            b(o);
            g();
        }
    }
}
