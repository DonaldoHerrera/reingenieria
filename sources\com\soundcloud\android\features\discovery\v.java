package com.soundcloud.android.features.discovery;

import com.soundcloud.android.foundation.events.PromotedSourceInfo;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import com.soundcloud.android.playback.Db;

/* compiled from: DiscoveryPresenter.kt */
final class v<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ C3551i a;

    v(C3551i iVar) {
        this.a = iVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(PromotedSourceInfo promotedSourceInfo) {
        C7471uYa.b(promotedSourceInfo, "it");
        Db d = this.a.q;
        C3508cda b = promotedSourceInfo.b();
        PlaySessionSource playSessionSource = new PlaySessionSource(Yca.DISCOVER);
        playSessionSource.a(promotedSourceInfo);
        return Db.a(d, b, playSessionSource, 0, 4, (Object) null);
    }
}
