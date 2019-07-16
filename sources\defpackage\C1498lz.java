package defpackage;

import java.util.concurrent.Executor;

/* renamed from: lz reason: default package and case insensitive filesystem */
final class C1498lz<TResult, TContinuationResult> implements Qy, Sy, Ty<TContinuationResult>, C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Vy<TResult, TContinuationResult> b;
    private final C1652qz<TContinuationResult> c;

    public C1498lz(Executor executor, Vy<TResult, TContinuationResult> vy, C1652qz<TContinuationResult> qzVar) {
        this.a = executor;
        this.b = vy;
        this.c = qzVar;
    }

    public final void a(Exception exc) {
        this.c.a(exc);
    }

    public final void onComplete(Wy<TResult> wy) {
        this.a.execute(new C1529mz(this, wy));
    }

    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.a(tcontinuationresult);
    }

    public final void a() {
        this.c.f();
    }
}
