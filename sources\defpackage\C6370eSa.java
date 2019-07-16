package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: eSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSwitchMapCompletable */
public final class C6370eSa<T> extends C6979nPa {
    final APa<T> a;
    final C7118pQa<? super T, ? extends C7255rPa> b;
    final boolean c;

    /* renamed from: eSa$a */
    /* compiled from: ObservableSwitchMapCompletable */
    static final class a<T> implements GPa<T>, VPa {
        static final C0180a a = new C0180a(null);
        final C7117pPa b;
        final C7118pQa<? super T, ? extends C7255rPa> c;
        final boolean d;
        final C7743yUa e = new C7743yUa();
        final AtomicReference<C0180a> f = new AtomicReference<>();
        volatile boolean g;
        VPa h;

        /* renamed from: eSa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapCompletable */
        static final class C0180a extends AtomicReference<VPa> implements C7117pPa {
            final a<?> a;

            C0180a(a<?> aVar) {
                this.a = aVar;
            }

            public void a(VPa vPa) {
                C7463uQa.c(this, vPa);
            }

            public void onComplete() {
                this.a.a(this);
            }

            public void a(Throwable th) {
                this.a.a(this, th);
            }

            /* access modifiers changed from: 0000 */
            public void a() {
                C7463uQa.a((AtomicReference<VPa>) this);
            }
        }

        a(C7117pPa ppa, C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
            this.b = ppa;
            this.c = pqa;
            this.d = z;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.h, vPa)) {
                this.h = vPa;
                this.b.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            C0180a aVar = (C0180a) this.f.getAndSet(a);
            if (aVar != null && aVar != a) {
                aVar.a();
            }
        }

        public void dispose() {
            this.h.dispose();
            b();
        }

        public void onComplete() {
            this.g = true;
            if (this.f.get() == null) {
                Throwable a2 = this.e.a();
                if (a2 == null) {
                    this.b.onComplete();
                } else {
                    this.b.a(a2);
                }
            }
        }

        public void a(T t) {
            try {
                Object apply = this.c.apply(t);
                AQa.a(apply, "The mapper returned a null CompletableSource");
                C7255rPa rpa = (C7255rPa) apply;
                C0180a aVar = new C0180a(this);
                while (true) {
                    C0180a aVar2 = (C0180a) this.f.get();
                    if (aVar2 == a) {
                        break;
                    } else if (this.f.compareAndSet(aVar2, aVar)) {
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        rpa.a(aVar);
                    }
                }
            } catch (Throwable th) {
                _Pa.b(th);
                this.h.dispose();
                a(th);
            }
        }

        public void a(Throwable th) {
            if (!this.e.a(th)) {
                WUa.b(th);
            } else if (this.d) {
                onComplete();
            } else {
                b();
                Throwable a2 = this.e.a();
                if (a2 != EUa.a) {
                    this.b.a(a2);
                }
            }
        }

        public boolean a() {
            return this.f.get() == a;
        }

        /* access modifiers changed from: 0000 */
        public void a(C0180a aVar, Throwable th) {
            if (!this.f.compareAndSet(aVar, null) || !this.e.a(th)) {
                WUa.b(th);
                return;
            }
            if (!this.d) {
                dispose();
                Throwable a2 = this.e.a();
                if (a2 != EUa.a) {
                    this.b.a(a2);
                }
            } else if (this.g) {
                this.b.a(this.e.a());
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(C0180a aVar) {
            if (this.f.compareAndSet(aVar, null) && this.g) {
                Throwable a2 = this.e.a();
                if (a2 == null) {
                    this.b.onComplete();
                } else {
                    this.b.a(a2);
                }
            }
        }
    }

    public C6370eSa(APa<T> aPa, C7118pQa<? super T, ? extends C7255rPa> pqa, boolean z) {
        this.a = aPa;
        this.b = pqa;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public void b(C7117pPa ppa) {
        if (!C6506gSa.a((Object) this.a, this.b, ppa)) {
            this.a.a((GPa<? super T>) new a<Object>(ppa, this.b, this.c));
        }
    }
}
