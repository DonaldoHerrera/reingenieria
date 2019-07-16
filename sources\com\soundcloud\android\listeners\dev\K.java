package com.soundcloud.android.listeners.dev;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import androidx.preference.Preference;

/* compiled from: DevDrawerFragment.kt */
final class K implements OnSharedPreferenceChangeListener {
    final /* synthetic */ DevDrawerFragment a;
    final /* synthetic */ Preference b;

    K(DevDrawerFragment devDrawerFragment, Preference preference) {
        this.a = devDrawerFragment;
        this.b = preference;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (C7471uYa.a((Object) "last_config_check_time", (Object) str)) {
            DevDrawerFragment devDrawerFragment = this.a;
            Preference preference = this.b;
            C7471uYa.a((Object) sharedPreferences, "sharedPreferences");
            devDrawerFragment.a(preference, sharedPreferences);
        }
    }
}
