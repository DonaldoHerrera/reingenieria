package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.image.N;
import com.soundcloud.android.stations.C6063yb;

/* compiled from: RecentlyPlayedStationRenderer.kt */
public class Aa {
    private final N a;
    private final C6063yb b;

    public Aa(N n, C6063yb ybVar) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(ybVar, "stationMenuPresenter");
        this.a = n;
        this.b = ybVar;
    }

    public za a(boolean z) {
        return new za(z, this.a, this.b);
    }
}
