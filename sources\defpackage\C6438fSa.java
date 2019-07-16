package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSwitchMapSingle */
public final class C6438fSa<T, R> extends APa<R> {
    final APa<T> a;
    final C7118pQa<? super T, ? extends MPa<? extends R>> b;
    final boolean c;

    /* renamed from: fSa$a */
    /* compiled from: ObservableSwitchMapSingle */
    static final class a<T, R> extends AtomicInteger implements GPa<T>, VPa {
        static final C0181a<Object> a = new C0181a<>(null);
        final GPa<? super R> b;
        final C7118pQa<? super T, ? extends MPa<? extends R>> c;
        final boolean d;
        final C7743yUa e = new C7743yUa();
        final AtomicReference<C0181a<R>> f = new AtomicReference<>();
        VPa g;
        volatile boolean h;
        volatile boolean i;

        /* renamed from: fSa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableSwitchMapSingle */
        static final class C0181a<R> extends AtomicReference<VPa> implements KPa<R> {
            final a<?, R> a;
            volatile R b;

            C0181a(a<?, R> aVar) {
                this.a = aVar;
            }

            public void a(VPa vPa) {
                C7463uQa.c(this, vPa);
            }

            public void onSuccess(R r) {
                this.b = r;
                this.a.c();
            }

            public void a(Throwable th) {
                this.a.a(this, th);
            }

            /* access modifiers changed from: 0000 */
            public void a() {
                C7463uQa.a((AtomicReference<VPa>) this);
            }
        }

        a(GPa<? super R> gPa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa, boolean z) {
            this.b = gPa;
            this.c = pqa;
            this.d = z;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.g, vPa)) {
                this.g = vPa;
                this.b.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            C0181a<Object> aVar = (C0181a) this.f.getAndSet(a);
            if (aVar != null && aVar != a) {
                aVar.a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            if (getAndIncrement() == 0) {
                GPa<? super R> gPa = this.b;
                C7743yUa yua = this.e;
                AtomicReference<C0181a<R>> atomicReference = this.f;
                int i2 = 1;
                while (!this.i) {
                    if (yua.get() == null || this.d) {
                        boolean z = this.h;
                        C0181a aVar = (C0181a) atomicReference.get();
                        boolean z2 = aVar == null;
                        if (z && z2) {
                            Throwable a2 = yua.a();
                            if (a2 != null) {
                                gPa.a(a2);
                            } else {
                                gPa.onComplete();
                            }
                            return;
                        } else if (z2 || aVar.b == null) {
                            i2 = addAndGet(-i2);
                            if (i2 == 0) {
                                return;
                            }
                        } else {
                            atomicReference.compareAndSet(aVar, null);
                            gPa.a(aVar.b);
                        }
                    } else {
                        gPa.a(yua.a());
                        return;
                    }
                }
            }
        }

        public void dispose() {
            this.i = true;
            this.g.dispose();
            b();
        }

        public void onComplete() {
            this.h = true;
            c();
        }

        public void a(T t) {
            C0181a aVar = (C0181a) this.f.get();
            if (aVar != null) {
                aVar.a();
            }
            try {
                Object apply = this.c.apply(t);
                AQa.a(apply, "The mapper returned a null SingleSource");
                MPa mPa = (MPa) apply;
                C0181a aVar2 = new C0181a(this);
                while (true) {
                    C0181a<Object> aVar3 = (C0181a) this.f.get();
                    if (aVar3 != a) {
                        if (this.f.compareAndSet(aVar3, aVar2)) {
                            mPa.a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                _Pa.b(th);
                this.g.dispose();
                this.f.getAndSet(a);
                a(th);
            }
        }

        public void a(Throwable th) {
            if (this.e.a(th)) {
                if (!this.d) {
                    b();
                }
                this.h = true;
                c();
                return;
            }
            WUa.b(th);
        }

        public boolean a() {
            return this.i;
        }

        /* access modifiers changed from: 0000 */
        public void a(C0181a<R> aVar, Throwable th) {
            if (!this.f.compareAndSet(aVar, null) || !this.e.a(th)) {
                WUa.b(th);
                return;
            }
            if (!this.d) {
                this.g.dispose();
                b();
            }
            c();
        }
    }

    public C6438fSa(APa<T> aPa, C7118pQa<? super T, ? extends MPa<? extends R>> pqa, boolean z) {
        this.a = aPa;
        this.b = pqa;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super R> gPa) {
        if (!C6506gSa.a((Object) this.a, this.b, gPa)) {
            this.a.a((GPa<? super T>) new a<Object>(gPa, this.b, this.c));
        }
    }
}
