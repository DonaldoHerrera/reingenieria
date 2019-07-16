package com.soundcloud.android.search;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: SearchTracker_Factory */
public final class Ka implements C4961HMa<Ja> {
    private final C7054oVa<C3700b> a;

    public Ka(C7054oVa<C3700b> ova) {
        this.a = ova;
    }

    public static Ka a(C7054oVa<C3700b> ova) {
        return new Ka(ova);
    }

    public Ja get() {
        return new Ja((C3700b) this.a.get());
    }
}
