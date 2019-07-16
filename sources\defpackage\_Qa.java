package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: _Qa reason: default package */
/* compiled from: ResumeSingleObserver */
public final class _Qa<T> implements KPa<T> {
    final AtomicReference<VPa> a;
    final KPa<? super T> b;

    public _Qa(AtomicReference<VPa> atomicReference, KPa<? super T> kPa) {
        this.a = atomicReference;
        this.b = kPa;
    }

    public void a(VPa vPa) {
        C7463uQa.a(this.a, vPa);
    }

    public void onSuccess(T t) {
        this.b.onSuccess(t);
    }

    public void a(Throwable th) {
        this.b.a(th);
    }
}
