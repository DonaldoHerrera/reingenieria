package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* compiled from: SyncModule_ActivitiesSyncStorageFactory */
public final class Z implements C4961HMa<C5622bDa> {
    private final C7054oVa<SharedPreferences> a;

    public Z(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static Z a(C7054oVa<SharedPreferences> ova) {
        return new Z(ova);
    }

    public static C5622bDa a(SharedPreferences sharedPreferences) {
        C5622bDa a2 = Y.a(sharedPreferences);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C5622bDa get() {
        return a((SharedPreferences) this.a.get());
    }
}
