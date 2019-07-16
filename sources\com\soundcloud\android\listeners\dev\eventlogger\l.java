package com.soundcloud.android.listeners.dev.eventlogger;

import com.soundcloud.android.view.SmoothScrollLinearLayoutManager;

/* compiled from: DevEventLoggerMonitorPresenter_Factory */
public final class l implements C4961HMa<k> {
    private final C7054oVa<SmoothScrollLinearLayoutManager> a;
    private final C7054oVa<C1953BN> b;
    private final C7054oVa<m> c;
    private final C7054oVa<HPa> d;

    public static k a(SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager, C1953BN bn, Object obj, HPa hPa) {
        return new k(smoothScrollLinearLayoutManager, bn, (m) obj, hPa);
    }

    public k get() {
        return new k((SmoothScrollLinearLayoutManager) this.a.get(), (C1953BN) this.b.get(), (m) this.c.get(), (HPa) this.d.get());
    }
}
