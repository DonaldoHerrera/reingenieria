package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: qz reason: default package and case insensitive filesystem */
final class C1652qz<TResult> extends Wy<TResult> {
    private final Object a = new Object();
    private final C1591oz<TResult> b = new C1591oz<>();
    private boolean c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    C1652qz() {
    }

    private final void g() {
        Preconditions.checkState(this.c, "Task is not yet complete");
    }

    private final void h() {
        Preconditions.checkState(!this.c, "Task is already complete");
    }

    private final void i() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void j() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((Wy<TResult>) this);
            }
        }
    }

    public final <X extends Throwable> TResult a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (cls.isInstance(this.f)) {
                throw ((Throwable) cls.cast(this.f));
            } else if (this.f == null) {
                tresult = this.e;
            } else {
                throw new Uy(this.f);
            }
        }
        return tresult;
    }

    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            g();
            i();
            if (this.f == null) {
                tresult = this.e;
            } else {
                throw new Uy(this.f);
            }
        }
        return tresult;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = this.c && !this.d && this.f == null;
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a((Wy<TResult>) this);
            return true;
        }
    }

    public final <TContinuationResult> Wy<TContinuationResult> b(Py<TResult, Wy<TContinuationResult>> py) {
        return b(Yy.a, py);
    }

    public final <TContinuationResult> Wy<TContinuationResult> b(Executor executor, Py<TResult, Wy<TContinuationResult>> py) {
        C1652qz qzVar = new C1652qz();
        this.b.a((C1560nz<TResult>) new C0510bz<TResult>(executor, py, qzVar));
        j();
        return qzVar;
    }

    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a((Wy<TResult>) this);
            return true;
        }
    }

    public final Wy<TResult> a(Executor executor, Ty<? super TResult> ty) {
        this.b.a((C1560nz<TResult>) new C1436jz<TResult>(executor, ty));
        j();
        return this;
    }

    public final Wy<TResult> a(Executor executor, Sy sy) {
        this.b.a((C1560nz<TResult>) new C1375hz<TResult>(executor, sy));
        j();
        return this;
    }

    public final Wy<TResult> a(Ry<TResult> ry) {
        a(Yy.a, ry);
        return this;
    }

    public final Wy<TResult> a(Executor executor, Ry<TResult> ry) {
        this.b.a((C1560nz<TResult>) new C1313fz<TResult>(executor, ry));
        j();
        return this;
    }

    public final <TContinuationResult> Wy<TContinuationResult> a(Py<TResult, TContinuationResult> py) {
        return a(Yy.a, py);
    }

    public final boolean b(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a((Wy<TResult>) this);
            return true;
        }
    }

    public final <TContinuationResult> Wy<TContinuationResult> a(Executor executor, Py<TResult, TContinuationResult> py) {
        C1652qz qzVar = new C1652qz();
        this.b.a((C1560nz<TResult>) new _y<TResult>(executor, py, qzVar));
        j();
        return qzVar;
    }

    public final Wy<TResult> a(Executor executor, Qy qy) {
        this.b.a((C1560nz<TResult>) new C1251dz<TResult>(executor, qy));
        j();
        return this;
    }

    public final <TContinuationResult> Wy<TContinuationResult> a(Executor executor, Vy<TResult, TContinuationResult> vy) {
        C1652qz qzVar = new C1652qz();
        this.b.a((C1560nz<TResult>) new C1498lz<TResult>(executor, vy, qzVar));
        j();
        return qzVar;
    }

    public final <TContinuationResult> Wy<TContinuationResult> a(Vy<TResult, TContinuationResult> vy) {
        return a(Yy.a, vy);
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            h();
            this.c = true;
            this.e = tresult;
        }
        this.b.a((Wy<TResult>) this);
    }

    public final void a(Exception exc) {
        Preconditions.checkNotNull(exc, "Exception must not be null");
        synchronized (this.a) {
            h();
            this.c = true;
            this.f = exc;
        }
        this.b.a((Wy<TResult>) this);
    }
}
