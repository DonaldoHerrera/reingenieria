package com.soundcloud.android.listeners.dev;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.b;
import androidx.preference.PreferenceScreen;

/* renamed from: com.soundcloud.android.listeners.dev.c reason: case insensitive filesystem */
/* compiled from: DevDrawerExperimentsHelper.kt */
final class C4004c implements b {
    final /* synthetic */ C4003b a;
    final /* synthetic */ C2118JU b;
    final /* synthetic */ PreferenceScreen c;

    C4004c(C4003b bVar, C2118JU ju, PreferenceScreen preferenceScreen) {
        this.a = bVar;
        this.b = ju;
        this.c = preferenceScreen;
    }

    public final boolean a(Preference preference, Object obj) {
        this.a.a(this.c, this.b.c());
        C2137KU a2 = this.a.d;
        C4003b bVar = this.a;
        C2118JU ju = this.b;
        if (obj != null) {
            a2.a(bVar.a(ju, (String) obj));
            C4003b bVar2 = this.a;
            if (preference != null) {
                bVar2.b((ListPreference) preference, this.b);
                return true;
            }
            throw new OVa("null cannot be cast to non-null type androidx.preference.ListPreference");
        }
        throw new OVa("null cannot be cast to non-null type kotlin.String");
    }
}
