package com.soundcloud.android.playback;

import com.soundcloud.android.cast.C2732f;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.p;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.stations.ic;

/* compiled from: PlayQueueExtender */
public class Ya {
    private final C3814lca a;
    private final C4281ab b;
    private final ic c;
    private final C2732f d;
    private VPa e = C4881Eua.b();
    private boolean f;

    Ya(C3814lca lca, C4281ab abVar, ic icVar, C2732f fVar) {
        this.a = lca;
        this.b = abVar;
        this.c = icVar;
        this.d = fVar;
    }

    private void b(C3508cda cda) {
        if (!this.d.e() && !this.a.x() && this.a.w()) {
            q m = this.a.m();
            if (!this.a.e().v() && m.j()) {
                IPa a2 = this.b.a(m.c(), c(), this.a.i()).b((C6776kQa<? super VPa>) new C4309g<Object>(this)).a(RPa.a()).a((C6368eQa) new C4314h(this));
                C3814lca lca = this.a;
                lca.getClass();
                C5250Qua a3 = C5250Qua.a(new C4284b(lca));
                a2.c(a3);
                this.e = a3;
            } else if (cda.v()) {
                IPa a4 = this.c.a(cda, this.a.p(), this.a.i()).b((C6776kQa<? super VPa>) new C4299e<Object>(this)).a(RPa.a()).a((C6368eQa) new C4304f(this));
                C3814lca lca2 = this.a;
                lca2.getClass();
                C5250Qua a5 = C5250Qua.a(new C4284b(lca2));
                a4.c(a5);
                this.e = a5;
            }
        }
    }

    private boolean c() {
        PlaySessionSource i = this.a.i();
        return !i.p() && !i.q();
    }

    private boolean d() {
        return this.a.o() <= 5;
    }

    /* access modifiers changed from: 0000 */
    public void a(p pVar) {
        if (pVar.e()) {
            this.f = false;
            this.e.dispose();
            b(pVar.a());
        } else if (pVar.c()) {
            a(pVar.a());
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C3508cda cda) {
        if (!this.f && d()) {
            b(cda);
        }
    }

    public /* synthetic */ void a(VPa vPa) throws Exception {
        this.f = true;
    }

    public /* synthetic */ void a() throws Exception {
        this.f = false;
    }

    public /* synthetic */ void b(VPa vPa) throws Exception {
        this.f = true;
    }

    public /* synthetic */ void b() throws Exception {
        this.f = false;
    }
}
