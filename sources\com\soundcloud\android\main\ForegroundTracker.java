package com.soundcloud.android.main;

import android.content.Intent;
import android.os.Bundle;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3713o;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.lightcycle.ActivityLightCycleDispatcher;

public class ForegroundTracker extends ActivityLightCycleDispatcher<RootActivity> {
    private final C3700b a;

    ForegroundTracker(C3700b bVar) {
        this.a = bVar;
    }

    private void b(Intent intent) {
        String str = "hasTrackedForeground";
        if (!intent.getBooleanExtra(str, false) && C3235rM.c(intent) && ha.b(intent)) {
            this.a.a((J) C3713o.a(ha.a(intent), C3235rM.b(intent).a()));
            intent.putExtra(str, true);
        }
    }

    /* renamed from: a */
    public void onCreate(RootActivity rootActivity, Bundle bundle) {
        super.onCreate(rootActivity, bundle);
        b(rootActivity.getIntent());
    }

    /* renamed from: a */
    public void onNewIntent(RootActivity rootActivity, Intent intent) {
        super.onNewIntent(rootActivity, intent);
        b(intent);
    }
}
