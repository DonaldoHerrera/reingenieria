package com.soundcloud.android.properties;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.Preference.c;
import androidx.preference.PreferenceScreen;

/* compiled from: AppFeaturesPreferencesFragment.kt */
final class d implements c {
    final /* synthetic */ Preference a;
    final /* synthetic */ h b;
    final /* synthetic */ PreferenceScreen c;

    d(Preference preference, h hVar, PreferenceScreen preferenceScreen) {
        this.a = preference;
        this.b = hVar;
        this.c = preferenceScreen;
    }

    public final boolean a(Preference preference) {
        C4581ija Tb = this.b.Tb();
        Context b2 = this.a.b();
        C7471uYa.a((Object) b2, "context");
        Tb.f(b2);
        return true;
    }
}
