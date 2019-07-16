package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.facebook.O;
import com.facebook.internal.W;

/* renamed from: Ik reason: default package */
/* compiled from: ActivityLifecycleTracker */
class Ik implements ActivityLifecycleCallbacks {
    Ik() {
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        W.a(O.APP_EVENTS, Pk.a, "onActivityCreated");
        Qk.a();
        Pk.b(activity);
    }

    public void onActivityDestroyed(Activity activity) {
        W.a(O.APP_EVENTS, Pk.a, "onActivityDestroyed");
    }

    public void onActivityPaused(Activity activity) {
        W.a(O.APP_EVENTS, Pk.a, "onActivityPaused");
        Qk.a();
        Pk.d(activity);
    }

    public void onActivityResumed(Activity activity) {
        W.a(O.APP_EVENTS, Pk.a, "onActivityResumed");
        Qk.a();
        Pk.c(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        W.a(O.APP_EVENTS, Pk.a, "onActivitySaveInstanceState");
    }

    public void onActivityStarted(Activity activity) {
        Pk.c();
        W.a(O.APP_EVENTS, Pk.a, "onActivityStarted");
    }

    public void onActivityStopped(Activity activity) {
        W.a(O.APP_EVENTS, Pk.a, "onActivityStopped");
        C1237dk.e();
        Pk.d();
    }
}
