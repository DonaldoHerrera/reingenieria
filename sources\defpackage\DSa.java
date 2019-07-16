package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: DSa reason: default package */
/* compiled from: ObservableFlatMapCompletable */
public final class DSa<T> extends C6642iSa<T, T> {
    final C7118pQa<? super T, ? extends C7255rPa> b;
    final boolean c;

    /* renamed from: DSa$a */
    /* compiled from: ObservableFlatMapCompletable */
    static final class a<T> extends PQa<T> implements GPa<T> {
        final GPa<? super T> a;
        final C7743yUa b = new C7743yUa();
        final C7118pQa<? super T, ? extends C7255rPa> c;
        final boolean d;
        final UPa e = new UPa();
        VPa f;
        volatile boolean g;

        /* renamed from: DSa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapCompletable */
        final class C0141a extends AtomicReference<VPa> implements C7117pPa, VPa {
            C0141a() {
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

        a(GPa<? super T> gPa, C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
            this.a = gPa;
            this.c = pqa;
            this.d = z;
            lazySet(1);
        }

        public int a(int i) {
            return i & 2;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.f, vPa)) {
                this.f = vPa;
                this.a.a((VPa) this);
            }
        }

        public void clear() {
        }

        public void dispose() {
            this.g = true;
            this.f.dispose();
            this.e.dispose();
        }

        public boolean isEmpty() {
            return true;
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

        public T poll() throws Exception {
            return null;
        }

        public void a(T t) {
            try {
                Object apply = this.c.apply(t);
                AQa.a(apply, "The mapper returned a null CompletableSource");
                C7255rPa rpa = (C7255rPa) apply;
                getAndIncrement();
                C0141a aVar = new C0141a();
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
        public void a(C0141a aVar) {
            this.e.c(aVar);
            onComplete();
        }

        /* access modifiers changed from: 0000 */
        public void a(C0141a aVar, Throwable th) {
            this.e.c(aVar);
            a(th);
        }
    }

    public DSa(EPa<T> ePa, C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
        super(ePa);
        this.b = pqa;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        this.a.a(new a(gPa, this.b, this.c));
    }
}
