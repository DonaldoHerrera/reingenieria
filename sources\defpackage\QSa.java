package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: QSa reason: default package */
/* compiled from: ObservableInterval */
public final class QSa extends APa<Long> {
    final HPa a;
    final long b;
    final long c;
    final TimeUnit d;

    /* renamed from: QSa$a */
    /* compiled from: ObservableInterval */
    static final class a extends AtomicReference<VPa> implements VPa, Runnable {
        final GPa<? super Long> a;
        long b;

        a(GPa<? super Long> gPa) {
            this.a = gPa;
        }

        public boolean a() {
            return get() == C7463uQa.DISPOSED;
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void run() {
            if (get() != C7463uQa.DISPOSED) {
                GPa<? super Long> gPa = this.a;
                long j = this.b;
                this.b = 1 + j;
                gPa.a(Long.valueOf(j));
            }
        }

        public void a(VPa vPa) {
            C7463uQa.c(this, vPa);
        }
    }

    public QSa(long j, long j2, TimeUnit timeUnit, HPa hPa) {
        this.b = j;
        this.c = j2;
        this.d = timeUnit;
        this.a = hPa;
    }

    public void b(GPa<? super Long> gPa) {
        a aVar = new a(gPa);
        gPa.a((VPa) aVar);
        HPa hPa = this.a;
        if (hPa instanceof C7122pUa) {
            c a2 = hPa.a();
            aVar.a(a2);
            a2.a(aVar, this.b, this.c, this.d);
            return;
        }
        aVar.a(hPa.a(aVar, this.b, this.c, this.d));
    }
}
