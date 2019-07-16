package defpackage;

import android.text.TextUtils;
import com.google.common.base.Function;
import com.soundcloud.android.ads._c;
import com.soundcloud.android.discovery.systemplaylist.C3515f;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* renamed from: wY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryWritableStorage */
public class C3898wY {
    private final C3826nY a;
    private final _c b;

    C3898wY(C3826nY nYVar, _c _cVar) {
        this.a = nYVar;
        this.b = _cVar;
    }

    private void c(C3508cda cda) {
        c cVar = new c(this.a.a(), h.b);
        cVar.a(cda);
        this.a.c("system_playlists_tracks", (Yd) cVar);
    }

    public void a() {
        this.a.b();
        this.b.a();
    }

    public void b(C3515f fVar) {
        this.a.a((Runnable) new C3889vX(this, fVar));
    }

    private void b(C3508cda cda) {
        c cVar = new c(this.a.a(), g.b);
        cVar.a(cda);
        this.a.c("system_playlists_tracks", (Yd) cVar);
    }

    public void a(C3508cda cda) {
        this.b.a(cda);
    }

    private void c(C3515f fVar) {
        e eVar = new e(this.a.a(), g.b);
        eVar.a(fVar.h(), (C3508cda) fVar.g().j().d(), (String) fVar.d().d(), (String) fVar.b().d(), (String) fVar.a().d(), (String) fVar.f().d(), (Date) fVar.c().d());
        this.a.a("system_playlist", (Yd) eVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(Pca<C3435KX> pca) {
        a();
        Pca b2 = b(pca);
        a(b2.f(), b2.j());
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<KX>, for r7v0, types: [java.util.List, java.util.List<KX>] */
    public /* synthetic */ void b(List<C3435KX> list, C4928GKa gKa) {
        ArrayList a2 = C2063HD.a();
        for (C3435KX kx : list) {
            d dVar = new d(this.a.a());
            C4928GKa b2 = kx.c().b((Function<? super T, V>) new C3897wX<Object,V>(this, gKa));
            C4928GKa b3 = kx.a().b((Function<? super T, V>) new C3881uX<Object,V>(this, gKa));
            if (kx.b().c()) {
                kx.b().b((Function<? super T, V>) new C3905xX<Object,V>(this));
            } else {
                dVar.a((Long) b2.d(), (Long) b3.d());
                a2.add(dVar);
            }
        }
        this.a.a("discovery_card", (List<? extends Yd>) a2);
    }

    public /* synthetic */ void a(C3515f fVar) {
        c(fVar.h());
        b(fVar.h());
        c(fVar);
        a(fVar.h(), fVar.g());
    }

    private void a(C3508cda cda, Pca<Yda> pca) {
        ArrayList a2 = C2063HD.a();
        for (int i = 0; i < pca.f().size(); i++) {
            e eVar = new e(this.a.a(), h.b);
            eVar.a(cda, ((Yda) pca.f().get(i)).w(), (long) i);
            a2.add(eVar);
        }
        this.a.a("system_playlists_tracks", (List<? extends Yd>) a2);
    }

    private Pca<C3435KX> b(Pca<C3435KX> pca) {
        return pca.a((List<O>) C2063HD.a(C1943BD.b(pca.f(), new C3873tX(this))));
    }

    /* access modifiers changed from: 0000 */
    public void a(List<C3435KX> list, C4928GKa<C3508cda> gKa) {
        this.a.a((Runnable) new C3865sX(this, list, gKa));
    }

    public /* synthetic */ Long a(C4928GKa gKa, C3447OX ox) {
        return Long.valueOf(a(ox, gKa));
    }

    public /* synthetic */ Long a(C4928GKa gKa, C3438LX lx) {
        return Long.valueOf(a(lx, gKa));
    }

    private long a(C3447OX ox, C4928GKa<C3508cda> gKa) {
        d dVar = new d(this.a.a(), f.b);
        dVar.a(ox.d(), (C3508cda) ox.b().d(), (C3508cda) gKa.d(), (String) ox.g().d(), (String) ox.h().d(), (String) ox.a().d(), (String) ox.i().d(), (String) ox.e().d(), ox.f());
        long a2 = this.a.a("single_content_selection_card", (Yd) dVar);
        a(ox.c(), ox.d());
        return a2;
    }

    private long a(C3438LX lx, C4928GKa<C3508cda> gKa) {
        d dVar = new d(this.a.a(), c.b);
        dVar.a(lx.c(), (C3508cda) lx.b().j().d(), (C3508cda) gKa.d(), (String) lx.d().d(), (String) lx.e().d(), (String) lx.a().d(), (String) lx.f().d());
        long a2 = this.a.a("multiple_content_selection_card", (Yd) dVar);
        for (C3444NX a3 : lx.b().f()) {
            a(a3, lx.c());
        }
        return a2;
    }

    /* access modifiers changed from: 0000 */
    public long a(C3444NX nx, C3508cda cda) {
        d dVar = new d(this.a.a(), e.b);
        dVar.a((C3508cda) nx.g().d(), cda, (String) nx.c().d(), (String) nx.b().b((Function<? super T, V>) C3417EX.a).d(), (Long) nx.d().b((Function<? super T, V>) C3408BX.a).d(), (String) nx.f().d(), (String) nx.e().d(), (String) nx.h().d(), (String) nx.a().d());
        return this.a.a("selection_item", (Yd) dVar);
    }

    /* access modifiers changed from: private */
    public long a(C3441MX mx) {
        C3378yP a2 = mx.a();
        C3508cda l = a2.d() != null ? a2.d().l() : null;
        d dVar = new d(this.a.a(), d.b);
        String str = ",";
        dVar.a(a2.c().getTime(), a2.b().w(), l, new C3508cda(a2.a()), TextUtils.join(str, a2.g()), TextUtils.join(str, a2.e()), TextUtils.join(str, a2.f()), TextUtils.join(str, a2.i()), TextUtils.join(str, a2.h()), "promoted");
        return this.a.a("promoted_track_card", (Yd) dVar);
    }

    /* access modifiers changed from: private */
    public boolean a(C3435KX kx) {
        return kx.a().c() || kx.c().c() || kx.b().c();
    }
}
