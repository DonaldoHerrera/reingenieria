package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: STa reason: default package */
/* compiled from: SingleTimeout */
public final class STa<T> extends IPa<T> {
    final MPa<T> a;
    final long b;
    final TimeUnit c;
    final HPa d;
    final MPa<? extends T> e;

    /* renamed from: STa$a */
    /* compiled from: SingleTimeout */
    static final class a<T> extends AtomicReference<VPa> implements KPa<T>, Runnable, VPa {
        final KPa<? super T> a;
        final AtomicReference<VPa> b = new AtomicReference<>();
        final C0152a<T> c;
        MPa<? extends T> d;
        final long e;
        final TimeUnit f;

        /* renamed from: STa$a$a reason: collision with other inner class name */
        /* compiled from: SingleTimeout */
        static final class C0152a<T> extends AtomicReference<VPa> implements KPa<T> {
            final KPa<? super T> a;

            C0152a(KPa<? super T> kPa) {
                this.a = kPa;
            }

            public void a(VPa vPa) {
                C7463uQa.c(this, vPa);
            }

            public void onSuccess(T t) {
                this.a.onSuccess(t);
            }

            public void a(Throwable th) {
                this.a.a(th);
            }
        }

        a(KPa<? super T> kPa, MPa<? extends T> mPa, long j, TimeUnit timeUnit) {
            this.a = kPa;
            this.d = mPa;
            this.e = j;
            this.f = timeUnit;
            if (mPa != null) {
                this.c = new C0152a<>(kPa);
            } else {
                this.c = null;
            }
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
            C7463uQa.a(this.b);
            C0152a<T> aVar = this.c;
            if (aVar != null) {
                C7463uQa.a((AtomicReference<VPa>) aVar);
            }
        }

        public void onSuccess(T t) {
            VPa vPa = (VPa) get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (vPa != uqa && compareAndSet(vPa, uqa)) {
                C7463uQa.a(this.b);
                this.a.onSuccess(t);
            }
        }

        public void run() {
            VPa vPa = (VPa) get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (vPa != uqa && compareAndSet(vPa, uqa)) {
                if (vPa != null) {
                    vPa.dispose();
                }
                MPa<? extends T> mPa = this.d;
                if (mPa == null) {
                    this.a.a((Throwable) new TimeoutException(EUa.a(this.e, this.f)));
                    return;
                }
                this.d = null;
                mPa.a(this.c);
            }
        }

        public void a(Throwable th) {
            VPa vPa = (VPa) get();
            C7463uQa uqa = C7463uQa.DISPOSED;
            if (vPa == uqa || !compareAndSet(vPa, uqa)) {
                WUa.b(th);
                return;
            }
            C7463uQa.a(this.b);
            this.a.a(th);
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }
    }

    public STa(MPa<T> mPa, long j, TimeUnit timeUnit, HPa hPa, MPa<? extends T> mPa2) {
        this.a = mPa;
        this.b = j;
        this.c = timeUnit;
        this.d = hPa;
        this.e = mPa2;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super T> kPa) {
        a aVar = new a(kPa, this.e, this.b, this.c);
        kPa.a((VPa) aVar);
        C7463uQa.a(aVar.b, this.d.a(aVar, this.b, this.c));
        this.a.a(aVar);
    }
}
