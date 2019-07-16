package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* compiled from: PlaybackInitiator.kt */
final class Gb<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ Db a;
    final /* synthetic */ PlaySessionSource b;

    Gb(Db db, PlaySessionSource playSessionSource) {
        this.a = db;
        this.b = playSessionSource;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(o oVar) {
        C7471uYa.b(oVar, "playQueue");
        C4412qb a2 = this.a.b;
        C3508cda m = oVar.m(0);
        C7471uYa.a((Object) m, "playQueue.getUrn(0)");
        return a2.b(oVar, m, 0, this.b, 0);
    }
}
