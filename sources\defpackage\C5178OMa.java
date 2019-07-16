package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: OMa reason: default package and case insensitive filesystem */
/* compiled from: ActivityLifecycleManager */
class C5178OMa implements ActivityLifecycleCallbacks {
    final /* synthetic */ b a;
    final /* synthetic */ a b;

    C5178OMa(a aVar, b bVar) {
        this.b = aVar;
        this.a = bVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(activity, bundle);
    }

    public void onActivityDestroyed(Activity activity) {
        this.a.a(activity);
    }

    public void onActivityPaused(Activity activity) {
        this.a.b(activity);
    }

    public void onActivityResumed(Activity activity) {
        this.a.c(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.a.b(activity, bundle);
    }

    public void onActivityStarted(Activity activity) {
        this.a.d(activity);
    }

    public void onActivityStopped(Activity activity) {
        this.a.e(activity);
    }
}
