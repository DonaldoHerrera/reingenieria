package com.soundcloud.android.settings;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.s;

/* renamed from: com.soundcloud.android.settings.s reason: case insensitive filesystem */
/* compiled from: LicensesFragment */
public class C5986s extends PreferenceFragment {
    public C5986s() {
        SoundCloudApplication.f().a(this);
    }

    public static C5986s a() {
        return new C5986s();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(s.licenses);
    }
}
