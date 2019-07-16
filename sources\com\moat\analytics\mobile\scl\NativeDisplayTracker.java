package com.moat.analytics.mobile.scl;

import android.app.Activity;

public interface NativeDisplayTracker {
    @Deprecated
    void setActivity(Activity activity);

    void startTracking();

    void stopTracking();
}
