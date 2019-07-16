package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.image.N;

/* compiled from: RecentlyPlayedProfileRenderer.kt */
public class va {
    private final N a;
    private final F b;
    private final C5231QFa c;

    public va(N n, F f, C5231QFa qFa) {
        C7471uYa.b(n, "imageOperations");
        C7471uYa.b(f, "screenProvider");
        C7471uYa.b(qFa, "userMenuPresenter");
        this.a = n;
        this.b = f;
        this.c = qFa;
    }

    public ua a(boolean z) {
        return new ua(z, this.a, this.b, this.c);
    }
}
