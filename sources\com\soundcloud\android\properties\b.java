package com.soundcloud.android.properties;

import android.content.SharedPreferences.Editor;
import androidx.preference.Preference;

/* compiled from: AppFeaturesPreferencesFragment.kt */
final class b implements androidx.preference.Preference.b {
    final /* synthetic */ h a;
    final /* synthetic */ a b;

    b(h hVar, a aVar) {
        this.a = hVar;
        this.b = aVar;
    }

    public final boolean a(Preference preference, Object obj) {
        Editor edit = this.a.Sb().edit();
        String c = this.b.c();
        C7471uYa.a(obj, "newValue");
        if (obj instanceof Boolean) {
            edit.putBoolean(c, ((Boolean) obj).booleanValue()).apply();
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(obj);
        sb.append(" not of type ");
        sb.append(Boolean.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
