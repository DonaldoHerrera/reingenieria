package com.facebook.share.internal;

import com.facebook.K;
import com.facebook.K.a;

/* compiled from: LikeActionController */
class r implements m {
    final /* synthetic */ t a;

    r(t tVar) {
        this.a = tVar;
    }

    public void onComplete() {
        i iVar;
        if (g.a[this.a.l.ordinal()] != 1) {
            t tVar = this.a;
            iVar = new f(tVar.s, this.a.l);
        } else {
            t tVar2 = this.a;
            iVar = new h(tVar2.s);
        }
        t tVar3 = this.a;
        d dVar = new d(tVar3.s, this.a.l);
        K k = new K();
        iVar.a(k);
        dVar.a(k);
        k.a((a) new q(this, iVar, dVar));
        k.f();
    }
}
