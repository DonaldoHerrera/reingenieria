package com.soundcloud.android.discovery.systemplaylist;

import java.util.List;

/* compiled from: SystemPlaylistOperations */
public class E {
    private final efa a;
    private final HPa b;
    private final C3898wY c;
    private final C3874tY d;
    private final C3760eea e;
    private final C3768fea f;

    E(efa efa, HPa hPa, C3898wY wYVar, C3874tY tYVar, C3760eea eea, C3768fea fea) {
        this.a = efa;
        this.b = hPa;
        this.c = wYVar;
        this.d = tYVar;
        this.e = eea;
        this.f = fea;
    }

    public /* synthetic */ C7669xPa a(C3524o oVar) throws Exception {
        return b(oVar).f(new C3511b(oVar));
    }

    public C7531vPa<C3520k> b(C3508cda cda) {
        return this.d.a(cda).a((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new C3510a<Object,Object>(this)).a((C7669xPa<? extends T>) a(cda));
    }

    private C7531vPa<List<C3509cea>> b(C3524o oVar) {
        return QV.a(this.e.a(oVar.f(), a.SYNC_MISSING)).f();
    }

    public C7531vPa<C3520k> a(C3508cda cda) {
        return this.a.a(hfa.b(C2226PO.SYSTEM_PLAYLISTS.a(cda)).c().b(), C3515f.class).b(this.b).c((C6776kQa<? super T>) new C3512c<Object>(this)).e(C3514e.a).i();
    }

    public C7531vPa<C3520k> a(String str) {
        return this.a.a(hfa.b(C2226PO.SYSTEM_PLAYLISTS_RESOLVE.a()).a("permalink", str).c().b(), C3515f.class).b(this.b).c((C6776kQa<? super T>) new C3512c<Object>(this)).e(C3514e.a).i();
    }

    /* access modifiers changed from: private */
    public void a(C3515f fVar) {
        this.f.a(fVar.g());
        this.c.b(fVar);
    }
}
