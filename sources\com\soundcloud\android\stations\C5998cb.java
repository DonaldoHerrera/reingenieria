package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.stations._a.b;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.cb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
final class C5998cb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C6004eb a;
    final /* synthetic */ b b;

    C5998cb(C6004eb ebVar, b bVar) {
        this.a = ebVar;
        this.b = bVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(Sda sda) {
        C3508cda cda;
        C7471uYa.b(sda, "it");
        boolean z = sda.c() != -1;
        if (z) {
            cda = ((Tda) sda.e().get(sda.c())).b();
        } else {
            cda = C3508cda.a;
            C7471uYa.a((Object) cda, "Urn.NOT_SET");
        }
        C3508cda cda2 = cda;
        int c = z ? (sda.c() + 1) % sda.e().size() : 0;
        Db b2 = this.a.a.n;
        C3508cda a2 = sda.a();
        List e = sda.e();
        C7471uYa.a((Object) e, "it.tracks");
        PlaySessionSource a3 = PlaySessionSource.a(this.a.a.q.a(), sda.a(), this.b.a());
        C7471uYa.a((Object) a3, "forStation(screenProvide…ckParams.discoverySource)");
        return b2.a(a2, e, a3, cda2, c);
    }
}
