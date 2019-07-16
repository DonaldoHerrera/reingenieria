package com.facebook.share.internal;

import com.facebook.FacebookRequestError;
import com.facebook.K;
import com.facebook.K.a;
import com.facebook.O;
import com.facebook.internal.W;
import com.facebook.internal.ia;

/* compiled from: LikeActionController */
class f implements a {
    final /* synthetic */ e a;
    final /* synthetic */ g b;
    final /* synthetic */ m c;
    final /* synthetic */ t d;

    f(t tVar, e eVar, g gVar, m mVar) {
        this.d = tVar;
        this.a = eVar;
        this.b = gVar;
        this.c = mVar;
    }

    public void a(K k) {
        FacebookRequestError facebookRequestError;
        this.d.s = this.a.f;
        if (ia.b(this.d.s)) {
            this.d.s = this.b.f;
            this.d.t = this.b.g;
        }
        if (ia.b(this.d.s)) {
            W.a(O.DEVELOPER_ERRORS, t.a, "Unable to verify the FB id for '%s'. Verify that it is a valid FB object or page", this.d.k);
            t tVar = this.d;
            if (this.b.a() != null) {
                facebookRequestError = this.b.a();
            } else {
                facebookRequestError = this.a.a();
            }
            tVar.a("get_verified_id", facebookRequestError);
        }
        m mVar = this.c;
        if (mVar != null) {
            mVar.onComplete();
        }
    }
}
