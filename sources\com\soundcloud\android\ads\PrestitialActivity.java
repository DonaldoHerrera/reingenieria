package com.soundcloud.android.ads;

import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class PrestitialActivity extends LoggedInActivity {
    @LightCycle
    Xc x;

    public final class LightCycleBinder {
        public static void bind(PrestitialActivity prestitialActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(prestitialActivity);
            prestitialActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) prestitialActivity.x));
        }
    }

    private void C() {
        getWindow().getDecorView().setSystemUiVisibility(4);
    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.sponsored_session_prestitial);
    }

    public Yca x() {
        return Yca.PRESTITIAL;
    }
}
