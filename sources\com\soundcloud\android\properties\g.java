package com.soundcloud.android.properties;

import androidx.preference.Preference;
import androidx.preference.Preference.c;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceScreen;

/* compiled from: AppFeaturesPreferencesFragment.kt */
final class g implements c {
    final /* synthetic */ Preference a;
    final /* synthetic */ h b;
    final /* synthetic */ PreferenceCategory c;
    final /* synthetic */ PreferenceCategory d;
    final /* synthetic */ PreferenceCategory e;
    final /* synthetic */ PreferenceScreen f;

    g(Preference preference, h hVar, PreferenceCategory preferenceCategory, PreferenceCategory preferenceCategory2, PreferenceCategory preferenceCategory3, PreferenceScreen preferenceScreen) {
        this.a = preference;
        this.b = hVar;
        this.c = preferenceCategory;
        this.d = preferenceCategory2;
        this.e = preferenceCategory3;
        this.f = preferenceScreen;
    }

    public final boolean a(Preference preference) {
        this.b.b(this.a);
        h hVar = this.b;
        VPa d2 = hVar.Rb().a().d((C6776kQa<? super T>) new f<Object>(this));
        C7471uYa.a((Object) d2, "appConfiguration.forceUp…      }\n                }");
        hVar.a(d2);
        return true;
    }
}
