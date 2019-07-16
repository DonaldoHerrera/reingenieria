package com.moat.analytics.mobile.scl;

import android.app.Application;
import com.moat.analytics.mobile.scl.t.a;

public abstract class MoatAnalytics {
    private static MoatAnalytics a;

    public static synchronized MoatAnalytics getInstance() {
        MoatAnalytics moatAnalytics;
        synchronized (MoatAnalytics.class) {
            if (a == null) {
                try {
                    a = new j();
                } catch (Exception e) {
                    l.a(e);
                    a = new a();
                }
            }
            moatAnalytics = a;
        }
        return moatAnalytics;
    }

    public abstract void prepareNativeDisplayTracking(String str);

    public abstract void start(Application application);

    public abstract void start(MoatOptions moatOptions, Application application);
}
