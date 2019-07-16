package com.soundcloud.android.listeners.dev.eventlogger;

import com.soundcloud.android.ia.l;
import com.soundcloud.android.main.LoggedInActivity;
import com.soundcloud.lightcycle.LightCycle;

public class DevEventLoggerMonitorActivity extends LoggedInActivity {
    C4834DJa x;
    @LightCycle
    k y;

    public boolean onNavigateUp() {
        finish();
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActivityContentView() {
        super.setContentView(l.dev_event_logger_monitor_activity);
        this.x.f(this);
    }
}
