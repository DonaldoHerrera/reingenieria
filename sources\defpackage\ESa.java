package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ESa reason: default package */
/* compiled from: ObservableFlatMapCompletableCompletable */
public final class ESa<T> extends C6979nPa implements DQa<T> {
    final EPa<T> a;
    final C7118pQa<? super T, ? extends C7255rPa> b;
    final boolean c;

    /* renamed from: ESa$a */
    /* compiled from: ObservableFlatMapCompletableCompletable */
    static final class a<T> extends AtomicInteger implements VPa, GPa<T> {
        final C7117pPa a;
        final C7743yUa b = new C7743yUa();
        final C7118pQa<? super T, ? extends C7255rPa> c;
        final boolean d;
        final UPa e = new UPa();
        VPa f;
        volatile boolean g;

        /* renamed from: ESa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapCompletableCompletable */
        final class C0142a extends AtomicReference<VPa> implements C7117pPa, VPa {
            C0142a() {
            }

            public void a(VPa vPa) {
                C7463uQa.c(this, vPa);
            }

            public void dispose() {
                C7463uQa.a((AtomicReference<VPa>) this);
            }

            public void onComplete() {
                a.this.a(this);
            }

            public void a(Throwable th) {
                a.this.a(this, th);
            }

            public boolean a() {
                return C7463uQa.a((VPa) get());
            }
        }

        a(C7117pPa ppa, C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
            this.a = ppa;
            this.c = pqa;
            this.d = z;
            lazySet(1);
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.f, vPa)) {
                this.f = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.g = true;
            this.f.dispose();
            this.e.dispose();
        }

        public void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable a2 = this.b.a();
                if (a2 != null) {
                    this.a.a(a2);
                } else {
                    this.a.onComplete();
                }
            }
        }

        public void a(T t) {
            try {
                Object apply = this.c.apply(t);
                AQa.a(apply, "The mapper returned a null CompletableSource");
                C7255rPa rpa = (C7255rPa) apply;
                getAndIncrement();
                C0142a aVar = new C0142a();
                if (!this.g && this.e.b(aVar)) {
                    rpa.a(aVar);
                }
            } catch (Throwable th) {
                _Pa.b(th);
                this.f.dispose();
                a(th);
            }
        }

        public void a(Throwable th) {
            if (!this.b.a(th)) {
                WUa.b(th);
            } else if (!this.d) {
                dispose();
                if (getAndSet(0) > 0) {
                    this.a.a(this.b.a());
                }
            } else if (decrementAndGet() == 0) {
                this.a.a(this.b.a());
            }
        }

        public boolean a() {
            return this.f.a();
        }

        /* access modifiers changed from: 0000 */
        public void a(C0142a aVar) {
            this.e.c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        public void a(C0142a aVar, Throwable th) {
            this.e.c(aVar);
            a(th);
        }
    }

    public ESa(EPa<T> ePa, C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
        this.a = ePa;
        this.b = pqa;
        this.c = z;
    }

    public APa<T> a() {
        return WUa.a((APa<T>) new DSa<T>(this.a, this.b, this.c));
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        this.a.a(new a(ppa, this.b, this.c));
    }
}
