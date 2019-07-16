package com.soundcloud.android.offline;

import android.content.Context;

/* compiled from: OfflineServiceInitiator_Factory */
public final class Zd implements C4961HMa<Yd> {
    private final C7054oVa<Context> a;

    public Zd(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static Zd a(C7054oVa<Context> ova) {
        return new Zd(ova);
    }

    public Yd get() {
        return new Yd((Context) this.a.get());
    }
}
