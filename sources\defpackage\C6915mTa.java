package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableSwitchMap */
public final class C6915mTa<T, R> extends C6642iSa<T, R> {
    final C7118pQa<? super T, ? extends EPa<? extends R>> b;
    final int c;
    final boolean d;

    /* renamed from: mTa$a */
    /* compiled from: ObservableSwitchMap */
    static final class a<T, R> extends AtomicReference<VPa> implements GPa<R> {
        final b<T, R> a;
        final long b;
        final int c;
        volatile NQa<R> d;
        volatile boolean e;

        a(b<T, R> bVar, long j, int i) {
            this.a = bVar;
            this.b = j;
            this.c = i;
        }

        public void a(VPa vPa) {
            if (C7463uQa.c(this, vPa)) {
                if (vPa instanceof IQa) {
                    IQa iQa = (IQa) vPa;
                    int a2 = iQa.a(7);
                    if (a2 == 1) {
                        this.d = iQa;
                        this.e = true;
                        this.a.c();
                        return;
                    } else if (a2 == 2) {
                        this.d = iQa;
                        return;
                    }
                }
                this.d = new ZTa(this.c);
            }
        }

        public void onComplete() {
            if (this.b == this.a.k) {
                this.e = true;
                this.a.c();
            }
        }

        public void a(R r) {
            if (this.b == this.a.k) {
                if (r != null) {
                    this.d.offer(r);
                }
                this.a.c();
            }
        }

        public void a(Throwable th) {
            this.a.a(this, th);
        }

        public void a() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }
    }

    /* renamed from: mTa$b */
    /* compiled from: ObservableSwitchMap */
    static final class b<T, R> extends AtomicInteger implements GPa<T>, VPa {
        static final a<Object, Object> a = new a<>(null, -1, 1);
        final GPa<? super R> b;
        final C7118pQa<? super T, ? extends EPa<? extends R>> c;
        final int d;
        final boolean e;
        final C7743yUa f;
        volatile boolean g;
        volatile boolean h;
        VPa i;
        final AtomicReference<a<T, R>> j = new AtomicReference<>();
        volatile long k;

        static {
            a.a();
        }

        b(GPa<? super R> gPa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i2, boolean z) {
            this.b = gPa;
            this.c = pqa;
            this.d = i2;
            this.e = z;
            this.f = new C7743yUa();
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.i, vPa)) {
                this.i = vPa;
                this.b.a((VPa) this);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            a<Object, Object> aVar = (a) this.j.get();
            a<Object, Object> aVar2 = a;
            if (aVar != aVar2) {
                a<Object, Object> aVar3 = (a) this.j.getAndSet(aVar2);
                if (aVar3 != a && aVar3 != null) {
                    aVar3.a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x000f A[SYNTHETIC] */
        public void c() {
            Object obj;
            if (getAndIncrement() == 0) {
                GPa<? super R> gPa = this.b;
                AtomicReference<a<T, R>> atomicReference = this.j;
                boolean z = this.e;
                int i2 = 1;
                while (!this.h) {
                    if (this.g) {
                        boolean z2 = atomicReference.get() == null;
                        if (z) {
                            if (z2) {
                                Throwable th = (Throwable) this.f.get();
                                if (th != null) {
                                    gPa.a(th);
                                } else {
                                    gPa.onComplete();
                                }
                                return;
                            }
                        } else if (((Throwable) this.f.get()) != null) {
                            gPa.a(this.f.a());
                            return;
                        } else if (z2) {
                            gPa.onComplete();
                            return;
                        }
                    }
                    a aVar = (a) atomicReference.get();
                    if (aVar != null) {
                        NQa<R> nQa = aVar.d;
                        if (nQa != null) {
                            if (aVar.e) {
                                boolean isEmpty = nQa.isEmpty();
                                if (z) {
                                    if (isEmpty) {
                                        atomicReference.compareAndSet(aVar, null);
                                    }
                                } else if (((Throwable) this.f.get()) != null) {
                                    gPa.a(this.f.a());
                                    return;
                                } else if (isEmpty) {
                                    atomicReference.compareAndSet(aVar, null);
                                }
                            }
                            boolean z3 = false;
                            while (!this.h) {
                                if (aVar == atomicReference.get()) {
                                    if (z || ((Throwable) this.f.get()) == null) {
                                        boolean z4 = aVar.e;
                                        try {
                                            obj = nQa.poll();
                                        } catch (Throwable th2) {
                                            _Pa.b(th2);
                                            this.f.a(th2);
                                            atomicReference.compareAndSet(aVar, null);
                                            if (!z) {
                                                b();
                                                this.i.dispose();
                                                this.g = true;
                                            } else {
                                                aVar.a();
                                            }
                                            obj = null;
                                            z3 = true;
                                        }
                                        boolean z5 = obj == null;
                                        if (z4 && z5) {
                                            atomicReference.compareAndSet(aVar, null);
                                        } else if (!z5) {
                                            gPa.a(obj);
                                        } else if (z3) {
                                            continue;
                                        }
                                    } else {
                                        gPa.a(this.f.a());
                                        return;
                                    }
                                }
                                z3 = true;
                                if (z3) {
                                }
                            }
                            return;
                        }
                    }
                    i2 = addAndGet(-i2);
                    if (i2 == 0) {
                        return;
                    }
                }
            }
        }

        public void dispose() {
            if (!this.h) {
                this.h = true;
                this.i.dispose();
                b();
            }
        }

        public void onComplete() {
            if (!this.g) {
                this.g = true;
                c();
            }
        }

        public void a(T t) {
            long j2 = this.k + 1;
            this.k = j2;
            a aVar = (a) this.j.get();
            if (aVar != null) {
                aVar.a();
            }
            try {
                Object apply = this.c.apply(t);
                AQa.a(apply, "The ObservableSource returned is null");
                EPa ePa = (EPa) apply;
                a aVar2 = new a(this, j2, this.d);
                while (true) {
                    a<Object, Object> aVar3 = (a) this.j.get();
                    if (aVar3 != a) {
                        if (this.j.compareAndSet(aVar3, aVar2)) {
                            ePa.a(aVar2);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } catch (Throwable th) {
                _Pa.b(th);
                this.i.dispose();
                a(th);
            }
        }

        public void a(Throwable th) {
            if (this.g || !this.f.a(th)) {
                WUa.b(th);
                return;
            }
            if (!this.e) {
                b();
            }
            this.g = true;
            c();
        }

        public boolean a() {
            return this.h;
        }

        /* access modifiers changed from: 0000 */
        public void a(a<T, R> aVar, Throwable th) {
            if (aVar.b != this.k || !this.f.a(th)) {
                WUa.b(th);
                return;
            }
            if (!this.e) {
                this.i.dispose();
            }
            aVar.e = true;
            c();
        }
    }

    public C6915mTa(EPa<T> ePa, C7118pQa<? super T, ? extends EPa<? extends R>> pqa, int i, boolean z) {
        super(ePa);
        this.b = pqa;
        this.c = i;
        this.d = z;
    }

    public void b(GPa<? super R> gPa) {
        if (!C6371eTa.a(this.a, gPa, this.b)) {
            this.a.a(new b(gPa, this.b, this.c, this.d));
        }
    }
}
