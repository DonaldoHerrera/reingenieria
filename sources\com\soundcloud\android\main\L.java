package com.soundcloud.android.main;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: ForegroundTracker_Factory */
public final class L implements C4961HMa<ForegroundTracker> {
    private final C7054oVa<C3700b> a;

    public static ForegroundTracker a(C3700b bVar) {
        return new ForegroundTracker(bVar);
    }

    public ForegroundTracker get() {
        return new ForegroundTracker((C3700b) this.a.get());
    }
}
