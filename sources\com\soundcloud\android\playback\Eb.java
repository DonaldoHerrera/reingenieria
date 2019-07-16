package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import com.soundcloud.android.foundation.playqueue.q;
import java.util.List;

/* compiled from: PlaybackInitiator.kt */
final class Eb extends C7540vYa implements _Xa<o, IPa<C4536zc>> {
    final /* synthetic */ Db a;
    final /* synthetic */ int b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ PlaySessionSource d;
    final /* synthetic */ long e;

    Eb(Db db, int i, C3508cda cda, PlaySessionSource playSessionSource, long j) {
        this.a = db;
        this.b = i;
        this.c = cda;
        this.d = playSessionSource;
        this.e = j;
        super(1);
    }

    /* renamed from: a */
    public final IPa<C4536zc> invoke(o oVar) {
        int i;
        C3508cda cda;
        C7471uYa.b(oVar, "playQueue");
        int a2 = Cc.a(oVar, this.b, this.c, this.d, null, 16, null);
        C3508cda cda2 = this.c;
        List k = oVar.k();
        int size = k.size();
        int i2 = a2;
        while (true) {
            if (i2 >= size) {
                i = a2;
                cda = cda2;
                break;
            }
            q qVar = (q) k.get(i2);
            F f = (F) (!(qVar instanceof F) ? null : qVar);
            if (f == null || !f.s()) {
                C7471uYa.a((Object) qVar, "playQueueItem");
                C3508cda c2 = qVar.c();
                C7471uYa.a((Object) c2, "playQueueItem.urn");
                cda = c2;
                i = i2;
            } else {
                i2++;
            }
        }
        return this.a.b.b(oVar, cda, i, this.d, this.e);
    }
}
