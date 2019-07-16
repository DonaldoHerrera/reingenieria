package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.ads.P.a;
import com.soundcloud.android.foundation.playqueue.q;

/* compiled from: PlayerAdsController.kt */
final class _b<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Yb a;
    final /* synthetic */ q b;

    _b(Yb yb, q qVar) {
        this.a = yb;
        this.b = qVar;
    }

    /* renamed from: a */
    public final IPa<a> apply(Fa fa) {
        C7471uYa.b(fa, "adRequestData");
        C3508cda f = fa.f();
        if (f == null) {
            return null;
        }
        this.a.d.put(f, fa.h());
        return this.a.p.b(this.b, fa, this.a.i, this.a.h);
    }
}
