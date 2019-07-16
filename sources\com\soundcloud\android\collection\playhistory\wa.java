package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.C2839u;

/* compiled from: PlayHistoryStorage_Factory */
public final class wa implements C4961HMa<va> {
    private final C7054oVa<C2839u> a;

    public wa(C7054oVa<C2839u> ova) {
        this.a = ova;
    }

    public static wa a(C7054oVa<C2839u> ova) {
        return new wa(ova);
    }

    public va get() {
        return new va((C2839u) this.a.get());
    }
}
