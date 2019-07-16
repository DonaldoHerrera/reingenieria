package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qSa reason: default package and case insensitive filesystem */
/* compiled from: ObservableDebounceTimed */
public final class C7189qSa<T> extends C6642iSa<T, T> {
    final long b;
    final TimeUnit c;
    final HPa d;

    /* renamed from: qSa$a */
    /* compiled from: ObservableDebounceTimed */
    static final class a<T> extends AtomicReference<VPa> implements Runnable, VPa {
        final T a;
        final long b;
        final b<T> c;
        final AtomicBoolean d = new AtomicBoolean();

        a(T t, long j, b<T> bVar) {
            this.a = t;
            this.b = j;
            this.c = bVar;
        }

        public boolean a() {
            return get() == C7463uQa.DISPOSED;
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void run() {
            if (this.d.compareAndSet(false, true)) {
                this.c.a(this.b, this.a, this);
            }
        }

        public void a(VPa vPa) {
            C7463uQa.a((AtomicReference<VPa>) this, vPa);
        }
    }

    /* renamed from: qSa$b */
    /* compiled from: ObservableDebounceTimed */
    static final class b<T> implements GPa<T>, VPa {
        final GPa<? super T> a;
        final long b;
        final TimeUnit c;
        final c d;
        VPa e;
        VPa f;
        volatile long g;
        boolean h;

        b(GPa<? super T> gPa, long j, TimeUnit timeUnit, c cVar) {
            this.a = gPa;
            this.b = j;
            this.c = timeUnit;
            this.d = cVar;
        }

        public void a(VPa vPa) {
            if (C7463uQa.a(this.e, vPa)) {
                this.e = vPa;
                this.a.a((VPa) this);
            }
        }

        public void dispose() {
            this.e.dispose();
            this.d.dispose();
        }

        public void onComplete() {
            if (!this.h) {
                this.h = true;
                VPa vPa = this.f;
                if (vPa != null) {
                    vPa.dispose();
                }
                a aVar = (a) vPa;
                if (aVar != null) {
                    aVar.run();
                }
                this.a.onComplete();
                this.d.dispose();
            }
        }

        public void a(T t) {
            if (!this.h) {
                long j = this.g + 1;
                this.g = j;
                VPa vPa = this.f;
                if (vPa != null) {
                    vPa.dispose();
                }
                a aVar = new a(t, j, this);
                this.f = aVar;
                aVar.a(this.d.a(aVar, this.b, this.c));
            }
        }

        public void a(Throwable th) {
            if (this.h) {
                WUa.b(th);
                return;
            }
            VPa vPa = this.f;
            if (vPa != null) {
                vPa.dispose();
            }
            this.h = true;
            this.a.a(th);
            this.d.dispose();
        }

        public boolean a() {
            return this.d.a();
        }

        /* access modifiers changed from: 0000 */
        public void a(long j, T t, a<T> aVar) {
            if (j == this.g) {
                this.a.a(t);
                aVar.dispose();
            }
        }
    }

    public C7189qSa(EPa<T> ePa, long j, TimeUnit timeUnit, HPa hPa) {
        super(ePa);
        this.b = j;
        this.c = timeUnit;
        this.d = hPa;
    }

    public void b(GPa<? super T> gPa) {
        EPa<T> ePa = this.a;
        b bVar = new b(new UUa(gPa), this.b, this.c, this.d.a());
        ePa.a(bVar);
    }
}
