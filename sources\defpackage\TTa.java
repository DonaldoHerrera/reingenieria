package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: TTa reason: default package */
/* compiled from: SingleTimer */
public final class TTa extends IPa<Long> {
    final long a;
    final TimeUnit b;
    final HPa c;

    /* renamed from: TTa$a */
    /* compiled from: SingleTimer */
    static final class a extends AtomicReference<VPa> implements VPa, Runnable {
        final KPa<? super Long> a;

        a(KPa<? super Long> kPa) {
            this.a = kPa;
        }

        public boolean a() {
            return C7463uQa.a((VPa) get());
        }

        public void dispose() {
            C7463uQa.a((AtomicReference<VPa>) this);
        }

        public void run() {
            this.a.onSuccess(Long.valueOf(0));
        }

        /* access modifiers changed from: 0000 */
        public void a(VPa vPa) {
            C7463uQa.a((AtomicReference<VPa>) this, vPa);
        }
    }

    public TTa(long j, TimeUnit timeUnit, HPa hPa) {
        this.a = j;
        this.b = timeUnit;
        this.c = hPa;
    }

    /* access modifiers changed from: protected */
    public void b(KPa<? super Long> kPa) {
        a aVar = new a(kPa);
        kPa.a((VPa) aVar);
        aVar.a(this.c.a(aVar, this.a, this.b));
    }
}
