package com.soundcloud.android.sync;

import android.content.SharedPreferences;

/* compiled from: SyncModule_SoundStreamSyncStorageFactory */
public final class ba implements C4961HMa<C5622bDa> {
    private final C7054oVa<SharedPreferences> a;

    public ba(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static ba a(C7054oVa<SharedPreferences> ova) {
        return new ba(ova);
    }

    public static C5622bDa a(SharedPreferences sharedPreferences) {
        C5622bDa b = Y.b(sharedPreferences);
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public C5622bDa get() {
        return a((SharedPreferences) this.a.get());
    }
}
