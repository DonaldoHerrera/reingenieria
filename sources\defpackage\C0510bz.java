package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bz reason: default package and case insensitive filesystem */
final class C0510bz<TResult, TContinuationResult> implements Qy, Sy, Ty<TContinuationResult>, C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Py<TResult, Wy<TContinuationResult>> b;
    /* access modifiers changed from: private */
    public final C1652qz<TContinuationResult> c;

    public C0510bz(Executor executor, Py<TResult, Wy<TContinuationResult>> py, C1652qz<TContinuationResult> qzVar) {
        this.a = executor;
        this.b = py;
        this.c = qzVar;
    }

    public final void a(Exception exc) {
        this.c.a(exc);
    }

    public final void onComplete(Wy<TResult> wy) {
        this.a.execute(new C1221cz(this, wy));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.a(tcontinuationresult);
    }

    public final void a() {
        this.c.f();
    }
}
