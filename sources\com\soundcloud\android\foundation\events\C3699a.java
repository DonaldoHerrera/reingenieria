package com.soundcloud.android.foundation.events;

import android.app.Activity;

/* renamed from: com.soundcloud.android.foundation.events.a reason: case insensitive filesystem */
/* compiled from: ActivityLifeCycleEvent */
public final class C3699a {
    private final Class<? extends Activity> a;
    private final int b;

    private C3699a(int i, Activity activity) {
        this.a = activity.getClass();
        this.b = i;
    }

    public static C3699a a(Activity activity) {
        return new C3699a(1, activity);
    }

    public static C3699a b(Activity activity) {
        return new C3699a(2, activity);
    }

    public static C3699a c(Activity activity) {
        return new C3699a(0, activity);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.getSimpleName());
        sb.append("#");
        sb.append(c());
        return sb.toString();
    }

    private String c() {
        int i = this.b;
        if (i == 0) {
            return "onResume";
        }
        if (i == 1) {
            return "onCreate";
        }
        if (i == 2) {
            return "onPause";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Attempting to get name of unknown lifecycle method code: ");
        sb.append(this.b);
        throw new IllegalStateException(sb.toString());
    }

    public int a() {
        return this.b;
    }

    public boolean b() {
        return a() == 0;
    }
}
