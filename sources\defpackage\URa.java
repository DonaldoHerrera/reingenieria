package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: URa reason: default package */
/* compiled from: MaybeObserveOn */
public final class URa<T> extends BRa<T, T> {
    final HPa b;

    /* renamed from: URa$a */
    /* compiled from: MaybeObserveOn */
    static final class a<T> extends AtomicReference<VPa> implements C7600wPa<T>, VPa, Runnable {
        final C7600wPa<? super T> a;
        final HPa b;
        T c;
        Throwable d;

        a(C7600wPa<? super T> wpa, HPa hPa) {
            this.a = wpa;
            this.b = hPa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onComplete() {
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }

        public void onSuccess(T t) {
            this.c = t;
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }

        public void run() {
            Throwable th = this.d;
            if (th != null) {
                this.d = null;
                this.a.a(th);
                return;
            }
            T t = this.c;
            if (t != null) {
                this.c = null;
                this.a.onSuccess(t);
                return;
            }
            this.a.onComplete();
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void a(Throwable th) {
            this.d = th;
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }
    }

    public URa(C7669xPa<T> xpa, HPa hPa) {
        super(xpa);
        this.b = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(C7600wPa<? super T> wpa) {
        this.a.a(new a(wpa, this.b));
    }
}
