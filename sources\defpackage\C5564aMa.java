package defpackage;

import java.util.Set;

/* renamed from: aMa reason: default package and case insensitive filesystem */
/* compiled from: BriteDatabase */
class C5564aMa implements c {
    final /* synthetic */ C5700cMa a;

    C5564aMa(C5700cMa cma) {
        this.a = cma;
    }

    public void D() {
        if (this.a.i) {
            C5700cMa cma = this.a;
            cma.a("TXN SUCCESS %s", cma.d.get());
        }
        this.a.b().B();
    }

    public void close() {
        end();
    }

    public void end() {
        b bVar = (b) this.a.d.get();
        if (bVar != null) {
            this.a.d.set(bVar.a);
            if (this.a.i) {
                this.a.a("TXN END %s", bVar);
            }
            this.a.b().C();
            if (bVar.b) {
                this.a.a((Set<String>) bVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Not in transaction.");
    }
}
