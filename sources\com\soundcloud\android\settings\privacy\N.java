package com.soundcloud.android.settings.privacy;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/* compiled from: PrivacySettingsToggleLayout.kt */
final class N implements OnCheckedChangeListener {
    final /* synthetic */ PrivacySettingsToggleLayout a;

    N(PrivacySettingsToggleLayout privacySettingsToggleLayout) {
        this.a = privacySettingsToggleLayout;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.a.a.a(Boolean.valueOf(z));
    }
}
