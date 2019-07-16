package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.C2839u;

/* compiled from: RecentlyPlayedStorage_Factory */
public final class Ha implements C4961HMa<Ga> {
    private final C7054oVa<C2839u> a;

    public Ha(C7054oVa<C2839u> ova) {
        this.a = ova;
    }

    public static Ha a(C7054oVa<C2839u> ova) {
        return new Ha(ova);
    }

    public Ga get() {
        return new Ga((C2839u) this.a.get());
    }
}
