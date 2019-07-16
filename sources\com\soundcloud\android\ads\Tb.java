package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.C3692t;
import com.soundcloud.android.foundation.ads.aa;
import com.soundcloud.android.foundation.events.C3700b;
import java.lang.ref.WeakReference;
import java.util.Date;

/* compiled from: InlayAdOperations */
class Tb {
    private final C5327TLa a;
    private final C3700b b;
    private final C4806CMa<C2645ya> c;
    private final Yaa d;

    /* compiled from: InlayAdOperations */
    static class a implements C7256rQa<d> {
        final WeakReference<Qb> a;

        a(Qb qb) {
            this.a = new WeakReference<>(qb);
        }

        private C3692t b(d dVar) {
            return (C3692t) dVar.i();
        }

        private Boolean c(d dVar) {
            if (dVar.f()) {
                return e(dVar);
            }
            if (dVar.e()) {
                return d(dVar);
            }
            return Boolean.valueOf(false);
        }

        private Boolean d(d dVar) {
            Qb qb = (Qb) this.a.get();
            return Boolean.valueOf(qb != null && qb.a(dVar.k()));
        }

        private Boolean e(d dVar) {
            C4928GKa q = b(dVar).q();
            return Boolean.valueOf(q.c() && ((Date) q.b()).before(dVar.j()));
        }

        /* renamed from: a */
        public boolean test(d dVar) {
            return !b(dVar).p() && c(dVar).booleanValue();
        }
    }

    /* compiled from: InlayAdOperations */
    private static class b extends C5037Jua<C3431IZ> {
        private final C2645ya d;

        b(C2645ya yaVar) {
            this.d = yaVar;
        }

        public void a(C3431IZ iz) {
            if (iz.f()) {
                this.d.a((aa) ((d) iz).i());
            } else if ((iz instanceof e) && this.d.b()) {
                this.d.a(((e) iz).j());
            } else if (iz.h()) {
                this.d.e();
            } else if (iz.g()) {
                this.d.c((aa) ((d) iz).i());
            }
        }
    }

    Tb(C5327TLa tLa, C3700b bVar, Yaa yaa, C4806CMa<C2645ya> cMa) {
        this.a = tLa;
        this.b = bVar;
        this.d = yaa;
        this.c = cMa;
    }

    private VPa b(Qb qb) {
        APa h = this.a.a(C3876taa.h).a((C7256rQa<? super T>) C2574ga.a).a(d.class).a((C7256rQa<? super T>) new a<Object>(qb)).h(new C2644y(this));
        C3700b bVar = this.b;
        bVar.getClass();
        return (VPa) h.c(C5220Pua.a((C6776kQa<T>) new C2547b<T>(bVar)));
    }

    /* access modifiers changed from: 0000 */
    public VPa a(Qb qb) {
        return new UPa(b(qb), a());
    }

    public /* synthetic */ C3916yaa a(d dVar) throws Exception {
        long time = dVar.j().getTime();
        C3692t tVar = (C3692t) dVar.i();
        tVar.w();
        return C3916yaa.a(tVar, this.d, dVar.k(), time);
    }

    private VPa a() {
        return (VPa) this.a.a(C3876taa.h).a((C7256rQa<? super T>) C2582ia.a).a(RPa.a()).c(new b((C2645ya) this.c.get()));
    }
}
