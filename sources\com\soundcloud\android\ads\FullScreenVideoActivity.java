package com.soundcloud.android.ads;

import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class FullScreenVideoActivity extends LoggedInActivity {
    @LightCycle
    Hb x;

    public final class LightCycleBinder {
        public static void bind(FullScreenVideoActivity fullScreenVideoActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(fullScreenVideoActivity);
            fullScreenVideoActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) fullScreenVideoActivity.x));
        }
    }

    private void C() {
        getWindow().getDecorView().setSystemUiVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        C();
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.fullscreen_video);
    }

    public Yca x() {
        return Yca.VIDEO_FULLSCREEN;
    }
}
