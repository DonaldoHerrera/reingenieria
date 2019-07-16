package com.soundcloud.android.upgrade;

import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class GoOnboardingActivity extends LoggedInActivity {
    @LightCycle
    h x;

    public final class LightCycleBinder {
        public static void bind(GoOnboardingActivity goOnboardingActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(goOnboardingActivity);
            goOnboardingActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) goOnboardingActivity.x));
        }
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.go_onboarding);
    }

    public Yca x() {
        return Yca.OFFLINE_ONBOARDING;
    }

    /* access modifiers changed from: protected */
    public boolean y() {
        return false;
    }
}
