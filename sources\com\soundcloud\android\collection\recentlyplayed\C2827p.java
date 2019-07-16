package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.recentlyplayed.C2821l.a;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.p reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedBucketRenderer_Factory */
public final class C2827p implements C4961HMa<C2826o> {
    private final C7054oVa<a> a;
    private final C7054oVa<C4581ija> b;
    private final C7054oVa<C2014EO> c;

    public static C2826o a(a aVar, C4581ija ija, C2014EO eo) {
        return new C2826o(aVar, ija, eo);
    }

    public C2826o get() {
        return new C2826o((a) this.a.get(), (C4581ija) this.b.get(), (C2014EO) this.c.get());
    }
}
