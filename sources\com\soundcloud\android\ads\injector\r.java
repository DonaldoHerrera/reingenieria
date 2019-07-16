package com.soundcloud.android.ads.injector;

import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.Preference.b;

/* compiled from: AdInjectionPreferencesFragment.kt */
final class r implements b {
    final /* synthetic */ EditTextPreference a;

    r(EditTextPreference editTextPreference) {
        this.a = editTextPreference;
    }

    public final boolean a(Preference preference, Object obj) {
        EditTextPreference editTextPreference = this.a;
        C7471uYa.a(obj, "newValue");
        if (obj != null ? obj instanceof CharSequence : true) {
            editTextPreference.a((CharSequence) obj);
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(obj);
        sb.append(" not of type ");
        sb.append(CharSequence.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
