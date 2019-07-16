package defpackage;

import java.util.concurrent.Executor;

/* renamed from: Wy reason: default package */
public abstract class Wy<TResult> {
    public Wy<TResult> a(Ry<TResult> ry) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Wy<TResult> a(Executor executor, Sy sy);

    public abstract Wy<TResult> a(Executor executor, Ty<? super TResult> ty);

    public abstract Exception a();

    public abstract <X extends Throwable> TResult a(Class<X> cls) throws Throwable;

    public <TContinuationResult> Wy<TContinuationResult> b(Py<TResult, Wy<TContinuationResult>> py) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract TResult b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public Wy<TResult> a(Executor executor, Ry<TResult> ry) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> Wy<TContinuationResult> b(Executor executor, Py<TResult, Wy<TContinuationResult>> py) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public Wy<TResult> a(Executor executor, Qy qy) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public <TContinuationResult> Wy<TContinuationResult> a(Py<TResult, TContinuationResult> py) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Wy<TContinuationResult> a(Executor executor, Py<TResult, TContinuationResult> py) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Wy<TContinuationResult> a(Vy<TResult, TContinuationResult> vy) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> Wy<TContinuationResult> a(Executor executor, Vy<TResult, TContinuationResult> vy) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
