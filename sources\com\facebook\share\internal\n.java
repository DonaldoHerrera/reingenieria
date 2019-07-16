package com.facebook.share.internal;

import com.facebook.K;
import com.facebook.K.a;
import com.facebook.internal.ia;

/* compiled from: LikeActionController */
class n implements a {
    final /* synthetic */ k a;
    final /* synthetic */ o b;

    n(o oVar, k kVar) {
        this.b = oVar;
        this.a = kVar;
    }

    public void a(K k) {
        this.b.b.v = false;
        if (this.a.a() != null) {
            this.b.b.a(false);
            return;
        }
        this.b.b.r = ia.a(this.a.f, (String) null);
        this.b.b.u = true;
        this.b.b.l().a("fb_like_control_did_like", (Double) null, this.b.a);
        o oVar = this.b;
        oVar.b.b(oVar.a);
    }
}
