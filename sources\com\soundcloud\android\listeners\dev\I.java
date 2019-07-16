package com.soundcloud.android.listeners.dev;

import androidx.preference.Preference;
import androidx.preference.Preference.c;

/* compiled from: DevDrawerFragment.kt */
final class I implements c {
    final /* synthetic */ DevDrawerFragment a;

    I(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
    }

    public final boolean a(Preference preference) {
        DevDrawerFragment devDrawerFragment = this.a;
        C7471uYa.a((Object) preference, "it");
        devDrawerFragment.b(preference);
        return true;
    }
}
