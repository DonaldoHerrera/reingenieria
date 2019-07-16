package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aC reason: default package and case insensitive filesystem */
final class C0297aC<TResult> extends RB<TResult> {
    private final Object a = new Object();
    private final ZB<TResult> b = new ZB<>();
    private boolean c;
    private TResult d;
    private Exception e;

    C0297aC() {
    }

    private final void d() {
        XA.a(this.c, (Object) "Task is not yet complete");
    }

    private final void e() {
        synchronized (this.a) {
            if (this.c) {
                this.b.a((RB<TResult>) this);
            }
        }
    }

    public final RB<TResult> a(OB ob) {
        a(SB.a, ob);
        return this;
    }

    public final RB<TResult> a(PB<? super TResult> pb) {
        a(SB.a, pb);
        return this;
    }

    public final RB<TResult> a(Executor executor, OB ob) {
        this.b.a((XB<TResult>) new TB<TResult>(executor, ob));
        e();
        return this;
    }

    public final RB<TResult> a(Executor executor, PB<? super TResult> pb) {
        this.b.a((XB<TResult>) new WB<TResult>(executor, pb));
        e();
        return this;
    }

    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    public final boolean a(Exception exc) {
        XA.a(exc, (Object) "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = exc;
            this.b.a((RB<TResult>) this);
            return true;
        }
    }

    public final boolean a(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = tresult;
            this.b.a((RB<TResult>) this);
            return true;
        }
    }

    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            d();
            if (this.e == null) {
                tresult = this.d;
            } else {
                throw new QB(this.e);
            }
        }
        return tresult;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }
}
