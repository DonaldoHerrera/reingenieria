package com.soundcloud.android.properties;

import androidx.preference.Preference;
import androidx.preference.Preference.c;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;

/* compiled from: AppFeaturesPreferencesFragment.kt */
final class e implements c {
    final /* synthetic */ h a;
    final /* synthetic */ PreferenceCategory b;
    final /* synthetic */ PreferenceCategory c;
    final /* synthetic */ PreferenceCategory d;
    final /* synthetic */ PreferenceScreen e;

    e(h hVar, PreferenceCategory preferenceCategory, PreferenceCategory preferenceCategory2, PreferenceCategory preferenceCategory3, PreferenceScreen preferenceScreen) {
        this.a = hVar;
        this.b = preferenceCategory;
        this.c = preferenceCategory2;
        this.d = preferenceCategory3;
        this.e = preferenceScreen;
    }

    public final boolean a(Preference preference) {
        this.a.Sb().edit().clear().apply();
        this.a.a(this.b, this.c, this.d);
        return true;
    }
}
