package com.soundcloud.android.ads;

import com.soundcloud.android.foundation.playqueue.o;

/* compiled from: PlayerVideoAdsController.kt */
final class Mc<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Oc a;
    final /* synthetic */ o b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ int d;

    Mc(Oc oc, o oVar, C3508cda cda, int i) {
        this.a = oc;
        this.b = oVar;
        this.c = cda;
        this.d = i;
    }

    /* renamed from: a */
    public final IPa<o> apply(Boolean bool) {
        C7471uYa.b(bool, "shouldPrepend");
        if (bool.booleanValue()) {
            return this.a.a(this.b, this.c, this.d);
        }
        IPa<o> a2 = IPa.a(this.b);
        C7471uYa.a((Object) a2, "Single.just(playQueue)");
        return a2;
    }
}
