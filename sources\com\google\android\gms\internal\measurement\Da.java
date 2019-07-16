package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;

final /* synthetic */ class Da implements OnSharedPreferenceChangeListener {
    private final Aa a;

    Da(Aa aa) {
        this.a = aa;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.a.a(sharedPreferences, str);
    }
}
