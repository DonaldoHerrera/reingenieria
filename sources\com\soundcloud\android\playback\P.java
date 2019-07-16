package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;
import java.util.concurrent.Callable;

/* compiled from: CurrentPlayQueueProvider.kt */
public class P {
    private final C6979nPa a;
    private final C3814lca b;

    public P(C3814lca lca) {
        C7471uYa.b(lca, "playQueueManager");
        this.b = lca;
        C6979nPa d = b().z().f(O.a).b(RVa.a).e().d().d();
        C7471uYa.a((Object) d, "playQueueManager.loadPla…lement()\n        .cache()");
        this.a = d;
    }

    public IPa<q> a() {
        IPa<q> b2 = this.a.b((Callable<? extends T>) new N<Object>(this));
        C7471uYa.a((Object) b2, "initialQueueLoad.toSingl…er.currentPlayQueueItem }");
        return b2;
    }

    public C3814lca b() {
        return this.b;
    }
}
