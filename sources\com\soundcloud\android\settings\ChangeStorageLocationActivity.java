package com.soundcloud.android.settings;

import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.lightcycle.ActivityLightCycle;
import com.soundcloud.lightcycle.LightCycle;
import com.soundcloud.lightcycle.LightCycles;

public class ChangeStorageLocationActivity extends LoggedInActivity {
    C4834DJa x;
    @LightCycle
    C5947d y;

    public final class LightCycleBinder {
        public static void bind(ChangeStorageLocationActivity changeStorageLocationActivity) {
            com.soundcloud.android.main.LoggedInActivity.LightCycleBinder.bind(changeStorageLocationActivity);
            changeStorageLocationActivity.bind(LightCycles.lift((ActivityLightCycle<Source>) changeStorageLocationActivity.y));
        }
    }

    public boolean onNavigateUp() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.change_storage_location_activity);
        this.x.f(this);
    }

    public Yca x() {
        return Yca.SETTINGS_OFFLINE_STORAGE_LOCATION;
    }
}
