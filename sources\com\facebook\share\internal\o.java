package com.facebook.share.internal;

import android.os.Bundle;
import com.facebook.K;
import com.facebook.K.a;
import com.facebook.internal.ia;

/* compiled from: LikeActionController */
class o implements m {
    final /* synthetic */ Bundle a;
    final /* synthetic */ t b;

    o(t tVar, Bundle bundle) {
        this.b = tVar;
        this.a = bundle;
    }

    public void onComplete() {
        if (ia.b(this.b.s)) {
            Bundle bundle = new Bundle();
            bundle.putString("com.facebook.platform.status.ERROR_DESCRIPTION", "Invalid Object Id");
            t.b(this.b, "com.facebook.sdk.LikeActionController.DID_ERROR", bundle);
            return;
        }
        K k = new K();
        t tVar = this.b;
        k kVar = new k(tVar.s, this.b.l);
        kVar.a(k);
        k.a((a) new n(this, kVar));
        k.f();
    }
}
