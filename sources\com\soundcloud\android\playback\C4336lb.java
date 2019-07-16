package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;

/* renamed from: com.soundcloud.android.playback.lb reason: case insensitive filesystem */
/* compiled from: PlayQueueFactory.kt */
public class C4336lb {
    private final C3814lca a;
    /* access modifiers changed from: private */
    public final C6334dta b;

    public C4336lb(C3814lca lca, C6334dta dta) {
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(dta, "policyOperations");
        this.a = lca;
        this.b = dta;
    }

    private IPa<o> b(IPa<List<C3508cda>> iPa, PlaySessionSource playSessionSource) {
        IPa<o> a2 = iPa.a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C4326jb<Object,Object>(this, playSessionSource));
        C7471uYa.a((Object) a2, "tracksEmitter.flatMap {\n…              }\n        }");
        return a2;
    }

    public IPa<o> a(IPa<List<C3508cda>> iPa, PlaySessionSource playSessionSource, int i, C3508cda cda) {
        C7471uYa.b(iPa, "tracksEmitter");
        C7471uYa.b(playSessionSource, "playSessionSource");
        C7471uYa.b(cda, "initialTrack");
        IPa<o> e = b(iPa, playSessionSource).e(new C4316hb(this, i, cda, playSessionSource));
        C7471uYa.a((Object) e, "createPlayQueue(tracksEm…ack, playSessionSource) }");
        return e;
    }

    public IPa<o> a(IPa<List<C3508cda>> iPa, PlaySessionSource playSessionSource) {
        C7471uYa.b(iPa, "tracksEmitter");
        C7471uYa.b(playSessionSource, "playSessionSource");
        IPa<o> e = b(iPa, playSessionSource).e(C4331kb.a);
        C7471uYa.a((Object) e, "createPlayQueue(tracksEm….from(it, 0, it.size()) }");
        return e;
    }

    /* access modifiers changed from: private */
    public o a(o oVar, int i, C3508cda cda, PlaySessionSource playSessionSource) {
        List s = this.a.s();
        int a2 = Cc.a(oVar, i, cda, playSessionSource, null, 16, null);
        if (oVar.size() <= a2) {
            oVar.a(a2, s);
        } else {
            oVar.a(a2 + 1, s);
        }
        return oVar;
    }
}
