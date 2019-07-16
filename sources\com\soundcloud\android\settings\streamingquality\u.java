package com.soundcloud.android.settings.streamingquality;

import android.content.SharedPreferences;

/* compiled from: StreamingQualityStorage_Factory */
public final class u implements C4961HMa<t> {
    private final C7054oVa<SharedPreferences> a;

    public u(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static u a(C7054oVa<SharedPreferences> ova) {
        return new u(ova);
    }

    public t get() {
        return new t((SharedPreferences) this.a.get());
    }
}
