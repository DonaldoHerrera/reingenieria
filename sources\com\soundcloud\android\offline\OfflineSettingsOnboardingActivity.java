package com.soundcloud.android.offline;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.soundcloud.android.ia.i;
import com.soundcloud.android.ia.l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class OfflineSettingsOnboardingActivity extends LoggedInActivity {
    @LightCycle
    C4058ae x;

    public final class LightCycleBinder {
        public static void bind(OfflineSettingsOnboardingActivity offlineSettingsOnboardingActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(offlineSettingsOnboardingActivity);
            offlineSettingsOnboardingActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) offlineSettingsOnboardingActivity.x));
        }
    }

    public /* synthetic */ void a(View view) {
        this.x.x();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((TextView) findViewById(i.subtext)).setText(p.go_onboarding_offline_settings_subtext);
        findViewById(i.btn_continue).setOnClickListener(new Da(this));
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.go_onboarding_settings);
    }

    public Yca x() {
        return Yca.SETTINGS_AUTOMATIC_SYNC_ONBOARDING;
    }
}
