package com.google.android.play.core.missingsplits;

import android.app.Application;

public class MissingSplitsDetectingApplication extends Application {
    private boolean a = false;

    public void a() {
    }

    public final void onCreate() {
        if (!this.a) {
            this.a = true;
            if (!b.a(this).a()) {
                super.onCreate();
                a();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
