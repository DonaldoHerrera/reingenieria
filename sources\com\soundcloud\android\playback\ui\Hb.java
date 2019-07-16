package com.soundcloud.android.playback.ui;

import android.content.SharedPreferences;

/* compiled from: PlayerPagerOnboardingStorage_Factory */
public final class Hb implements C4961HMa<Gb> {
    private final C7054oVa<SharedPreferences> a;

    public static Gb a(SharedPreferences sharedPreferences) {
        return new Gb(sharedPreferences);
    }

    public Gb get() {
        return new Gb((SharedPreferences) this.a.get());
    }
}
