package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.stations._a.c;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.gb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final class C6010gb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6016ib a;
    final /* synthetic */ c b;

    C6010gb(C6016ib ibVar, c cVar) {
        this.a = ibVar;
        this.b = cVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(Sda sda) {
        C7471uYa.b(sda, "it");
        Db b2 = this.a.a.n;
        C3508cda a2 = sda.a();
        List e = sda.e();
        C7471uYa.a((Object) e, "it.tracks");
        PlaySessionSource a3 = PlaySessionSource.a(this.a.a.q.a(), sda.a(), this.b.a());
        C7471uYa.a((Object) a3, "forStation(screenProvide…ckParams.discoverySource)");
        return b2.a(a2, e, a3, ((Tda) sda.e().get(this.b.c())).b(), this.b.c());
    }
}
