package com.soundcloud.android.ui.visualplayer;

import com.soundcloud.android.tracks.Ca;
import java.util.List;

/* compiled from: VisualPlayerPresenter.kt */
public final class t extends C7318sJa<List<? extends c>, RVa, RVa, d> {
    private final HPa l;
    /* access modifiers changed from: private */
    public final C3814lca m;
    /* access modifiers changed from: private */
    public final Ca n;

    public t(HPa hPa, C3814lca lca, Ca ca) {
        C7471uYa.b(hPa, "mainThreadScheduler");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(ca, "trackItemRepository");
        super(hPa);
        this.l = hPa;
        this.m = lca;
        this.n = ca;
    }

    /* renamed from: a */
    public APa<List<c>> f(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<List<c>> k = this.m.b().k(new s(this));
        C7471uYa.a((Object) k, "playQueueManager.playQue…        }\n        }\n    }");
        return k;
    }

    /* renamed from: b */
    public APa<List<c>> g(RVa rVa) {
        C7471uYa.b(rVa, "pageParams");
        APa<List<c>> e = APa.e();
        C7471uYa.a((Object) e, "Observable.empty()");
        return e;
    }
}
