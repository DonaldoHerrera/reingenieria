package com.facebook.share.internal;

import com.facebook.K;
import com.facebook.K.a;
import com.facebook.O;
import com.facebook.internal.W;

/* compiled from: LikeActionController */
class q implements a {
    final /* synthetic */ i a;
    final /* synthetic */ d b;
    final /* synthetic */ r c;

    q(r rVar, i iVar, d dVar) {
        this.c = rVar;
        this.a = iVar;
        this.b = dVar;
    }

    public void a(K k) {
        if (this.a.a() == null && this.b.a() == null) {
            t tVar = this.c.a;
            boolean b2 = this.a.b();
            d dVar = this.b;
            tVar.a(b2, dVar.f, dVar.g, dVar.h, dVar.i, this.a.c());
            return;
        }
        W.a(O.REQUESTS, t.a, "Unable to refresh like state for id: '%s'", this.c.a.k);
    }
}
