package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: FSa reason: default package */
/* compiled from: ObservableFlatMapMaybe */
public final class FSa<T, R> extends C6642iSa<T, R> {
    final C7118pQa<? super T, ? extends C7669xPa<? extends R>> b;
    final boolean c;

    /* renamed from: FSa$a */
    /* compiled from: ObservableFlatMapMaybe */
    static final class a<T, R> extends AtomicInteger implements GPa<T>, VPa {
        final GPa<? super R> a;
        final boolean b;
        final UPa c = new UPa();
        final AtomicInteger d = new AtomicInteger(1);
        final C7743yUa e = new C7743yUa();
        final C7118pQa<? super T, ? extends C7669xPa<? extends R>> f;
        final AtomicReference<ZTa<R>> g = new AtomicReference<>();
        VPa h;
        volatile boolean i;

        /* renamed from: FSa$a$a reason: collision with other inner class name */
        /* compiled from: ObservableFlatMapMaybe */
        final class C0145a extends AtomicReference<VPa> implements C7600wPa<R>, VPa {
            C0145a() {
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

            public void onSuccess(R r) {
                a.this.a(this, r);
            }

            public void a(Throwable th) {
                a.this.a(this, th);
            }

            public boolean a() {
                return C7463uQa.a((VPa) get());
            }
        }

        a(GPa<? super R> gPa, C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa, boolean z) {
            this.a = gPa;
            this.f = pqa;
            this.b = z;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.h, vPa)) {
                this.h = vPa;
                this.a.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            ZTa zTa = (ZTa) this.g.get();
            if (zTa != null) {
                zTa.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            if (getAndIncrement() == 0) {
                d();
            }
        }

        /* access modifiers changed from: 0000 */
        public void d() {
            GPa<? super R> gPa = this.a;
            AtomicInteger atomicInteger = this.d;
            AtomicReference<ZTa<R>> atomicReference = this.g;
            int i2 = 1;
            while (!this.i) {
                if (this.b || ((Throwable) this.e.get()) == null) {
                    boolean z = false;
                    boolean z2 = atomicInteger.get() == 0;
                    ZTa zTa = (ZTa) atomicReference.get();
                    Object poll = zTa != null ? zTa.poll() : null;
                    if (poll == null) {
                        z = true;
                    }
                    if (z2 && z) {
                        Throwable a2 = this.e.a();
                        if (a2 != null) {
                            gPa.a(a2);
                        } else {
                            gPa.onComplete();
                        }
                        return;
                    } else if (z) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else {
                        gPa.a(poll);
                    }
                } else {
                    Throwable a3 = this.e.a();
                    b();
                    gPa.a(a3);
                    return;
                }
            }
            b();
        }

        public void dispose() {
            this.i = true;
            this.h.dispose();
            this.c.dispose();
        }

        /* access modifiers changed from: 0000 */
        public ZTa<R> e() {
            ZTa<R> zTa;
            do {
                ZTa<R> zTa2 = (ZTa) this.g.get();
                if (zTa2 != null) {
                    return zTa2;
                }
                zTa = new ZTa<>(APa.b());
            } while (!this.g.compareAndSet(null, zTa));
            return zTa;
        }

        public void onComplete() {
            this.d.decrementAndGet();
            c();
        }

        public void a(T t) {
            try {
                Object apply = this.f.apply(t);
                AQa.a(apply, "The mapper returned a null MaybeSource");
                C7669xPa xpa = (C7669xPa) apply;
                this.d.getAndIncrement();
                C0145a aVar = new C0145a();
                if (!this.i && this.c.b(aVar)) {
                    xpa.a(aVar);
                }
            } catch (Throwable th) {
                _Pa.b(th);
                this.h.dispose();
                a(th);
            }
        }

        public void a(Throwable th) {
            this.d.decrementAndGet();
            if (this.e.a(th)) {
                if (!this.b) {
                    this.c.dispose();
                }
                c();
                return;
            }
            WUa.b(th);
        }

        public boolean a() {
            return this.i;
        }

        /* access modifiers changed from: 0000 */
        public void a(C0145a aVar, R r) {
            this.c.c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    this.a.a(r);
                    if (this.d.decrementAndGet() != 0) {
                        z = false;
                    }
                    ZTa zTa = (ZTa) this.g.get();
                    if (!z || (zTa != null && !zTa.isEmpty())) {
                        if (decrementAndGet() == 0) {
                            return;
                        }
                        d();
                    }
                    Throwable a2 = this.e.a();
                    if (a2 != null) {
                        this.a.a(a2);
                    } else {
                        this.a.onComplete();
                    }
                    return;
                }
            }
            ZTa e2 = e();
            synchronized (e2) {
                e2.offer(r);
            }
            this.d.decrementAndGet();
            if (getAndIncrement() != 0) {
                return;
            }
            d();
        }

        /* access modifiers changed from: 0000 */
        public void a(C0145a aVar, Throwable th) {
            this.c.c(aVar);
            if (this.e.a(th)) {
                if (!this.b) {
                    this.h.dispose();
                    this.c.dispose();
                }
                this.d.decrementAndGet();
                c();
                return;
            }
            WUa.b(th);
        }

        /* access modifiers changed from: 0000 */
        public void a(C0145a aVar) {
            this.c.c(aVar);
            if (get() == 0) {
                boolean z = true;
                if (compareAndSet(0, 1)) {
                    if (this.d.decrementAndGet() != 0) {
                        z = false;
                    }
                    ZTa zTa = (ZTa) this.g.get();
                    if (z && (zTa == null || zTa.isEmpty())) {
                        Throwable a2 = this.e.a();
                        if (a2 != null) {
                            this.a.a(a2);
                        } else {
                            this.a.onComplete();
                        }
                        return;
                    } else if (decrementAndGet() != 0) {
                        d();
                    } else {
                        return;
                    }
                }
            }
            this.d.decrementAndGet();
            c();
        }
    }

    public FSa(EPa<T> ePa, C7118pQa<? super T, ? extends C7669xPa<? extends R>> pqa, boolean z) {
        super(ePa);
        this.b = pqa;
        this.c = z;
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super R> gPa) {
        this.a.a(new a(gPa, this.b, this.c));
    }
}
