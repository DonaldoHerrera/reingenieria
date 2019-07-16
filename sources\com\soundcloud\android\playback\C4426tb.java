package com.soundcloud.android.playback;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.playback.tb reason: case insensitive filesystem */
/* compiled from: PlaySessionStateStorage_Factory */
public final class C4426tb implements C4961HMa<C4421sb> {
    private final C7054oVa<SharedPreferences> a;

    public C4426tb(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C4426tb a(C7054oVa<SharedPreferences> ova) {
        return new C4426tb(ova);
    }

    public C4421sb get() {
        return new C4421sb((SharedPreferences) this.a.get());
    }
}
