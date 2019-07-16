package com.soundcloud.android.playback.ui;

import android.content.SharedPreferences;

/* compiled from: PlayerPagerOnboardingStorage */
public class Gb {
    private final SharedPreferences a;

    Gb(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.a.edit().putInt("NUMBER_OF_ONBOARDING_RUN", b() + 1).apply();
    }

    /* access modifiers changed from: 0000 */
    public int b() {
        return this.a.getInt("NUMBER_OF_ONBOARDING_RUN", 0);
    }
}
