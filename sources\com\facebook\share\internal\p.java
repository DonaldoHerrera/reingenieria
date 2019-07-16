package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.K;
import com.facebook.K.a;

/* compiled from: LikeActionController */
class p implements a {
    final /* synthetic */ l a;
    final /* synthetic */ Bundle b;
    final /* synthetic */ t c;

    p(t tVar, l lVar, Bundle bundle) {
        this.c = tVar;
        this.a = lVar;
        this.b = bundle;
    }

    public void a(K k) {
        this.c.v = false;
        if (this.a.a() != null) {
            this.c.a(true);
            return;
        }
        this.c.r = null;
        this.c.u = false;
        this.c.l().a("fb_like_control_did_unlike", (Double) null, this.b);
        this.c.b(this.b);
    }
}
