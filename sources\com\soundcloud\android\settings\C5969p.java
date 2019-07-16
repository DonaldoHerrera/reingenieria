package com.soundcloud.android.settings;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceFragment;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.ia.s;

/* renamed from: com.soundcloud.android.settings.p reason: case insensitive filesystem */
/* compiled from: LegalFragment */
public class C5969p extends PreferenceFragment implements OnPreferenceClickListener {
    C2436_U a;
    C4655rja b;

    public C5969p() {
        SoundCloudApplication.f().a(this);
    }

    public static C5969p a() {
        return new C5969p();
    }

    private void b() {
        if (this.a.q().equals(C2455aV.FREE_TIER)) {
            getPreferenceScreen().removePreference(findPreference("go_terms"));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(s.legal);
        findPreference("terms_of_service").setOnPreferenceClickListener(this);
        findPreference("privacy_policy").setOnPreferenceClickListener(this);
        findPreference("imprint").setOnPreferenceClickListener(this);
        findPreference("copyright_information").setOnPreferenceClickListener(this);
        b();
    }

    public boolean onPreferenceClick(Preference preference) {
        if (preference.getKey().equals("copyright_information")) {
            this.b.a(C4621nja.p());
            return true;
        }
        this.b.a(C4621nja.e(preference.getIntent().getData().toString()));
        return true;
    }
}
