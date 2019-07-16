package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: OTa reason: default package */
/* compiled from: SingleObserveOn */
public final class OTa<T> extends IPa<T> {
    final MPa<T> a;
    final HPa b;

    /* renamed from: OTa$a */
    /* compiled from: SingleObserveOn */
    static final class a<T> extends AtomicReference<VPa> implements KPa<T>, VPa, Runnable {
        final KPa<? super T> a;
        final HPa b;
        T c;
        Throwable d;

        a(KPa<? super T> kPa, HPa hPa) {
            this.a = kPa;
            this.b = hPa;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void onSuccess(T t) {
            this.c = t;
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }

        public void run() {
            Throwable th = this.d;
            if (th != null) {
                this.a.a(th);
            } else {
                this.a.onSuccess(this.c);
            }
        }

        public void a(Throwable th) {
            this.d = th;
            C7463uQa.a((AtomicReference<VPa>) this, this.b.a(this));
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public OTa(MPa<T> mPa, HPa hPa) {
        this.a = mPa;
        this.b = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        this.a.a(new a(kPa, this.b));
    }
}
