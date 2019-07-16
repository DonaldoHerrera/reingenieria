package com.soundcloud.android.properties;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.b;
import androidx.preference.PreferenceCategory;

/* compiled from: AppFeaturesPreferencesFragment.kt */
final class c implements b {
    final /* synthetic */ ListPreference a;
    final /* synthetic */ defpackage.C3821mba.c b;
    final /* synthetic */ h c;
    final /* synthetic */ PreferenceCategory d;

    c(ListPreference listPreference, defpackage.C3821mba.c cVar, h hVar, PreferenceCategory preferenceCategory) {
        this.a = listPreference;
        this.b = cVar;
        this.c = hVar;
        this.d = preferenceCategory;
    }

    public final boolean a(Preference preference, Object obj) {
        C7471uYa.a(obj, "newValue");
        if (obj instanceof String) {
            String str = (String) obj;
            this.c.Sb().edit().putString(this.b.c(), str).apply();
            this.c.a((Preference) this.a, this.b.c(), str);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(obj);
        sb.append(" not of type ");
        sb.append(String.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
