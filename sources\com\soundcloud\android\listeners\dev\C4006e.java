package com.soundcloud.android.listeners.dev;

import androidx.preference.CheckBoxPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.c;

/* renamed from: com.soundcloud.android.listeners.dev.e reason: case insensitive filesystem */
/* compiled from: DevDrawerFragment.kt */
final class C4006e implements c {
    final /* synthetic */ b a;

    C4006e(b bVar) {
        this.a = bVar;
    }

    public final boolean a(Preference preference) {
        Fea a2 = this.a.U;
        String b = this.a.V;
        if (preference != null) {
            a2.a(b, ((CheckBoxPreference) preference).ca());
            return true;
        }
        throw new OVa("null cannot be cast to non-null type androidx.preference.CheckBoxPreference");
    }
}
