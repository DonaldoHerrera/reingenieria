package com.moat.analytics.mobile.scl;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

class a {
    static WeakReference<Activity> a = null;
    private static boolean b = false;
    private static Application c;

    /* renamed from: com.moat.analytics.mobile.scl.a$a reason: collision with other inner class name */
    private static class C0055a implements ActivityLifecycleCallbacks {
        C0055a() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            String str = "MoatActivityState";
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Activity destroyed: ");
                sb.append(activity.getClass());
                sb.append("@");
                sb.append(activity.hashCode());
                n.a(3, str, (Object) this, sb.toString());
                if (a.b(activity)) {
                    a.a = new WeakReference<>(null);
                }
            } catch (Exception e) {
                l.a(e);
            }
        }

        public void onActivityPaused(Activity activity) {
            try {
                if (a.b(activity)) {
                    a.a = new WeakReference<>(null);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Activity paused: ");
                sb.append(activity.getClass());
                sb.append("@");
                sb.append(activity.hashCode());
                n.a(3, "MoatActivityState", (Object) this, sb.toString());
            } catch (Exception e) {
                l.a(e);
            }
        }

        public void onActivityResumed(Activity activity) {
            try {
                a.a = new WeakReference<>(activity);
                u.d().f();
                StringBuilder sb = new StringBuilder();
                sb.append("Activity resumed: ");
                sb.append(activity.getClass());
                sb.append("@");
                sb.append(activity.hashCode());
                n.a(3, "MoatActivityState", (Object) this, sb.toString());
            } catch (Exception e) {
                l.a(e);
            }
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
            try {
                a.a = new WeakReference<>(activity);
                StringBuilder sb = new StringBuilder();
                sb.append("Activity started: ");
                sb.append(activity.getClass());
                sb.append("@");
                sb.append(activity.hashCode());
                n.a(3, "MoatActivityState", (Object) this, sb.toString());
            } catch (Exception e) {
                l.a(e);
            }
        }

        public void onActivityStopped(Activity activity) {
            try {
                if (a.b(activity)) {
                    a.a = new WeakReference<>(null);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Activity stopped: ");
                sb.append(activity.getClass());
                sb.append("@");
                sb.append(activity.hashCode());
                n.a(3, "MoatActivityState", (Object) this, sb.toString());
            } catch (Exception e) {
                l.a(e);
            }
        }
    }

    a() {
    }

    static Application a() {
        return c;
    }

    static void a(Application application) {
        c = application;
        if (!b) {
            b = true;
            c.registerActivityLifecycleCallbacks(new C0055a());
        }
    }

    /* access modifiers changed from: private */
    public static boolean b(Activity activity) {
        WeakReference<Activity> weakReference = a;
        return weakReference != null && weakReference.get() == activity;
    }
}
