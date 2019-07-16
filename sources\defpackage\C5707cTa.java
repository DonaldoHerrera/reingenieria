package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cTa reason: default package and case insensitive filesystem */
/* compiled from: ObservableRefCount */
public final class C5707cTa<T> extends APa<T> {
    final LUa<T> a;
    final int b;
    final long c;
    final TimeUnit d;
    final HPa e;
    a f;

    /* renamed from: cTa$a */
    /* compiled from: ObservableRefCount */
    static final class a extends AtomicReference<VPa> implements Runnable, C6776kQa<VPa> {
        final C5707cTa<?> a;
        VPa b;
        long c;
        boolean d;
        boolean e;

        a(C5707cTa<?> cta) {
            this.a = cta;
        }

        /* renamed from: a */
        public void accept(VPa vPa) throws Exception {
            C7463uQa.a((AtomicReference<VPa>) this, vPa);
            synchronized (this.a) {
                if (this.e) {
                    ((C7670xQa) this.a.a).b(vPa);
                }
            }
        }

        public void run() {
            this.a.c(this);
        }
    }

    /* renamed from: cTa$b */
    /* compiled from: ObservableRefCount */
    static final class b<T> extends AtomicBoolean implements GPa<T>, VPa {
        final GPa<? super T> a;
        final C5707cTa<T> b;
        final a c;
        VPa d;

        b(GPa<? super T> gPa, C5707cTa<T> cta, a aVar) {
            this.a = gPa;
            this.b = cta;
            this.c = aVar;
        }

        public void a(T t) {
            this.a.a(t);
        }

        public void dispose() {
            this.d.dispose();
            if (compareAndSet(false, true)) {
                this.b.a(this.c);
            }
        }

        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.b.b(this.c);
                this.a.onComplete();
            }
        }

        public void a(Throwable th) {
            if (compareAndSet(false, true)) {
                this.b.b(this.c);
                this.a.a(th);
                return;
            }
            WUa.b(th);
        }

        public boolean a() {
            return this.d.a();
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.d, vPa)) {
                this.d = vPa;
                this.a.a((VPa) this);
            }
        }
    }

    public C5707cTa(LUa<T> lUa) {
        this(lUa, 1, 0, TimeUnit.NANOSECONDS, null);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        return;
     */
    public void a(a aVar) {
        synchronized (this) {
            if (this.f != null) {
                if (this.f == aVar) {
                    long j = aVar.c - 1;
                    aVar.c = j;
                    if (j == 0) {
                        if (aVar.d) {
                            if (this.c == 0) {
                                c(aVar);
                                return;
                            }
                            C7739yQa yqa = new C7739yQa();
                            aVar.b = yqa;
                            yqa.a(this.e.a(aVar, this.c, this.d));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void b(GPa<? super T> gPa) {
        a aVar;
        boolean z;
        synchronized (this) {
            aVar = this.f;
            if (aVar == null) {
                aVar = new a(this);
                this.f = aVar;
            }
            long j = aVar.c;
            if (j == 0 && aVar.b != null) {
                aVar.b.dispose();
            }
            long j2 = j + 1;
            aVar.c = j2;
            z = true;
            if (aVar.d || j2 != ((long) this.b)) {
                z = false;
            } else {
                aVar.d = true;
            }
        }
        this.a.a((GPa<? super T>) new b<Object>(gPa, this, aVar));
        if (z) {
            this.a.g(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(a aVar) {
        synchronized (this) {
            if (aVar.c == 0 && aVar == this.f) {
                this.f = null;
                VPa vPa = (VPa) aVar.get();
                C7463uQa.a((AtomicReference<VPa>) aVar);
                if (this.a instanceof VPa) {
                    ((VPa) this.a).dispose();
                } else if (this.a instanceof C7670xQa) {
                    if (vPa == null) {
                        aVar.e = true;
                    } else {
                        ((C7670xQa) this.a).b(vPa);
                    }
                }
            }
        }
    }

    public C5707cTa(LUa<T> lUa, int i, long j, TimeUnit timeUnit, HPa hPa) {
        this.a = lUa;
        this.b = i;
        this.c = j;
        this.d = timeUnit;
        this.e = hPa;
    }

    /* access modifiers changed from: 0000 */
    public void b(a aVar) {
        synchronized (this) {
            if (this.f != null && this.f == aVar) {
                this.f = null;
                if (aVar.b != null) {
                    aVar.b.dispose();
                }
            }
            long j = aVar.c - 1;
            aVar.c = j;
            if (j == 0) {
                if (this.a instanceof VPa) {
                    ((VPa) this.a).dispose();
                } else if (this.a instanceof C7670xQa) {
                    ((C7670xQa) this.a).b((VPa) aVar.get());
                }
            }
        }
    }
}
