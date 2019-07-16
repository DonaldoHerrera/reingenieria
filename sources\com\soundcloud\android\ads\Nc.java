package com.soundcloud.android.ads;

import com.soundcloud.android.ads.data.g;
import com.soundcloud.android.ads.data.g.a;
import com.soundcloud.android.ads.data.g.b;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;

/* compiled from: PlayerVideoAdsController.kt */
final class Nc<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Oc a;
    final /* synthetic */ o b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ int d;

    Nc(Oc oc, o oVar, C3508cda cda, int i) {
        this.a = oc;
        this.b = oVar;
        this.c = cda;
        this.d = i;
    }

    /* renamed from: a */
    public final o apply(C4928GKa<g> gKa) {
        List list;
        C7471uYa.b(gKa, "optionalAd");
        if (!gKa.c()) {
            return this.b;
        }
        g gVar = (g) gKa.b();
        if (gVar instanceof a) {
            list = this.a.a(this.b, this.c, this.d, (a) gVar);
        } else if (gVar instanceof b) {
            list = this.a.a(this.b, this.c, this.d, (b) gVar);
        } else {
            throw new FVa();
        }
        Oc oc = this.a;
        o oVar = this.b;
        oc.a(oVar, this.d, list);
        return oVar;
    }
}
