package defpackage;

import java.util.concurrent.Executor;

/* renamed from: _y reason: default package */
final class _y<TResult, TContinuationResult> implements C1560nz<TResult> {
    private final Executor a;
    /* access modifiers changed from: private */
    public final Py<TResult, TContinuationResult> b;
    /* access modifiers changed from: private */
    public final C1652qz<TContinuationResult> c;

    public _y(Executor executor, Py<TResult, TContinuationResult> py, C1652qz<TContinuationResult> qzVar) {
        this.a = executor;
        this.b = py;
        this.c = qzVar;
    }

    public final void onComplete(Wy<TResult> wy) {
        this.a.execute(new C0479az(this, wy));
    }
}
