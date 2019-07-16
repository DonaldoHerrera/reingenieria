package com.soundcloud.lightcycle;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Method;

public final class LightCycles {
    private static final String ANDROID_PREFIX = "android.";
    private static final String JAVA_PREFIX = "java.";
    private static final String TAG = "LightCycles";
    private static boolean debugLoggingEnabled = false;

    static final class LiftedActivityLightCycle<Source, Target extends Source> implements ActivityLightCycle<Target> {
        private final ActivityLightCycle<Source> lightCycle;

        LiftedActivityLightCycle(ActivityLightCycle<Source> activityLightCycle) {
            this.lightCycle = activityLightCycle;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || LiftedActivityLightCycle.class != obj.getClass()) {
                return false;
            }
            LiftedActivityLightCycle liftedActivityLightCycle = (LiftedActivityLightCycle) obj;
            ActivityLightCycle<Source> activityLightCycle = this.lightCycle;
            if (activityLightCycle != null) {
                z = activityLightCycle.equals(liftedActivityLightCycle.lightCycle);
            } else if (liftedActivityLightCycle.lightCycle != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            ActivityLightCycle<Source> activityLightCycle = this.lightCycle;
            if (activityLightCycle != null) {
                return activityLightCycle.hashCode();
            }
            return 0;
        }

        public void onCreate(Target target, Bundle bundle) {
            this.lightCycle.onCreate(target, bundle);
        }

        public void onDestroy(Target target) {
            this.lightCycle.onDestroy(target);
        }

        public void onNewIntent(Target target, Intent intent) {
            this.lightCycle.onNewIntent(target, intent);
        }

        public boolean onOptionsItemSelected(Target target, MenuItem menuItem) {
            return this.lightCycle.onOptionsItemSelected(target, menuItem);
        }

        public void onPause(Target target) {
            this.lightCycle.onPause(target);
        }

        public void onRestoreInstanceState(Target target, Bundle bundle) {
            this.lightCycle.onRestoreInstanceState(target, bundle);
        }

        public void onResume(Target target) {
            this.lightCycle.onResume(target);
        }

        public void onSaveInstanceState(Target target, Bundle bundle) {
            this.lightCycle.onSaveInstanceState(target, bundle);
        }

        public void onStart(Target target) {
            this.lightCycle.onStart(target);
        }

        public void onStop(Target target) {
            this.lightCycle.onStop(target);
        }
    }

    @TargetApi(11)
    static final class LiftedFragmentLightCycle<Source, Target extends Source> implements FragmentLightCycle<Target> {
        private final FragmentLightCycle<Source> lightCycle;

        LiftedFragmentLightCycle(FragmentLightCycle<Source> fragmentLightCycle) {
            this.lightCycle = fragmentLightCycle;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || LiftedFragmentLightCycle.class != obj.getClass()) {
                return false;
            }
            LiftedFragmentLightCycle liftedFragmentLightCycle = (LiftedFragmentLightCycle) obj;
            FragmentLightCycle<Source> fragmentLightCycle = this.lightCycle;
            if (fragmentLightCycle != null) {
                z = fragmentLightCycle.equals(liftedFragmentLightCycle.lightCycle);
            } else if (liftedFragmentLightCycle.lightCycle != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            FragmentLightCycle<Source> fragmentLightCycle = this.lightCycle;
            if (fragmentLightCycle != null) {
                return fragmentLightCycle.hashCode();
            }
            return 0;
        }

        public void onActivityCreated(Target target, Bundle bundle) {
            this.lightCycle.onActivityCreated(target, bundle);
        }

        public void onAttach(Target target, Activity activity) {
            this.lightCycle.onAttach(target, activity);
        }

        public void onCreate(Target target, Bundle bundle) {
            this.lightCycle.onCreate(target, bundle);
        }

        public void onDestroy(Target target) {
            this.lightCycle.onDestroy(target);
        }

        public void onDestroyView(Target target) {
            this.lightCycle.onDestroyView(target);
        }

        public void onDetach(Target target) {
            this.lightCycle.onDetach(target);
        }

        public boolean onOptionsItemSelected(Target target, MenuItem menuItem) {
            return this.lightCycle.onOptionsItemSelected(target, menuItem);
        }

        public void onPause(Target target) {
            this.lightCycle.onPause(target);
        }

        public void onResume(Target target) {
            this.lightCycle.onResume(target);
        }

        public void onSaveInstanceState(Target target, Bundle bundle) {
            this.lightCycle.onSaveInstanceState(target, bundle);
        }

        public void onStart(Target target) {
            this.lightCycle.onStart(target);
        }

        public void onStop(Target target) {
            this.lightCycle.onStop(target);
        }

        public void onViewCreated(Target target, View view, Bundle bundle) {
            this.lightCycle.onViewCreated(target, view, bundle);
        }

        public void onAttach(Target target, Context context) {
            this.lightCycle.onAttach(target, context);
        }
    }

    static final class LiftedSupportFragmentLightCycle<Source, Target extends Source> implements SupportFragmentLightCycle<Target> {
        private final SupportFragmentLightCycle<Source> lightCycle;

        LiftedSupportFragmentLightCycle(SupportFragmentLightCycle<Source> supportFragmentLightCycle) {
            this.lightCycle = supportFragmentLightCycle;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || LiftedSupportFragmentLightCycle.class != obj.getClass()) {
                return false;
            }
            LiftedSupportFragmentLightCycle liftedSupportFragmentLightCycle = (LiftedSupportFragmentLightCycle) obj;
            SupportFragmentLightCycle<Source> supportFragmentLightCycle = this.lightCycle;
            if (supportFragmentLightCycle != null) {
                z = supportFragmentLightCycle.equals(liftedSupportFragmentLightCycle.lightCycle);
            } else if (liftedSupportFragmentLightCycle.lightCycle != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            SupportFragmentLightCycle<Source> supportFragmentLightCycle = this.lightCycle;
            if (supportFragmentLightCycle != null) {
                return supportFragmentLightCycle.hashCode();
            }
            return 0;
        }

        public void onActivityCreated(Target target, Bundle bundle) {
            this.lightCycle.onActivityCreated(target, bundle);
        }

        public void onAttach(Target target, Activity activity) {
            this.lightCycle.onAttach(target, activity);
        }

        public void onCreate(Target target, Bundle bundle) {
            this.lightCycle.onCreate(target, bundle);
        }

        public void onDestroy(Target target) {
            this.lightCycle.onDestroy(target);
        }

        public void onDestroyView(Target target) {
            this.lightCycle.onDestroyView(target);
        }

        public void onDetach(Target target) {
            this.lightCycle.onDetach(target);
        }

        public boolean onOptionsItemSelected(Target target, MenuItem menuItem) {
            return this.lightCycle.onOptionsItemSelected(target, menuItem);
        }

        public void onPause(Target target) {
            this.lightCycle.onPause(target);
        }

        public void onResume(Target target) {
            this.lightCycle.onResume(target);
        }

        public void onSaveInstanceState(Target target, Bundle bundle) {
            this.lightCycle.onSaveInstanceState(target, bundle);
        }

        public void onStart(Target target) {
            this.lightCycle.onStart(target);
        }

        public void onStop(Target target) {
            this.lightCycle.onStop(target);
        }

        public void onViewCreated(Target target, View view, Bundle bundle) {
            this.lightCycle.onViewCreated(target, view, bundle);
        }
    }

    public static void bind(LightCycleDispatcher<?> lightCycleDispatcher) {
        try {
            Method findBinderForClass = findBinderForClass(lightCycleDispatcher.getClass());
            if (findBinderForClass != null) {
                findBinderForClass.invoke(null, new Object[]{lightCycleDispatcher});
            }
        } catch (Exception unused) {
        }
    }

    private static void debugLog(String str, Object... objArr) {
        if (debugLoggingEnabled) {
            Log.d(TAG, String.format(str, objArr));
        }
    }

    public static void enableDebugLogging(boolean z) {
        debugLoggingEnabled = z;
    }

    private static Method findBinderForClass(Class<?> cls) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
        Method method;
        String name = cls.getName();
        if (name.startsWith(ANDROID_PREFIX) || name.startsWith(JAVA_PREFIX)) {
            debugLog("MISS: Reached framework class. Abandoning search.", new Object[0]);
            return null;
        }
        try {
            method = Class.forName(getInjectorClassName(name)).getMethod("bind", new Class[]{cls});
            debugLog("HIT: Loaded LightCycle binder class.", new Object[0]);
        } catch (ClassNotFoundException unused) {
            debugLog("Not found. Trying superclass %s", cls.getSuperclass().getName());
            method = findBinderForClass(cls.getSuperclass());
        }
        return method;
    }

    private static String getInjectorClassName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("$LightCycleBinder");
        return sb.toString();
    }

    public static <Source, Target extends Source> ActivityLightCycle<Target> lift(ActivityLightCycle<Source> activityLightCycle) {
        return new LiftedActivityLightCycle(activityLightCycle);
    }

    @TargetApi(11)
    public static <Source, Target extends Source> FragmentLightCycle<Target> lift(FragmentLightCycle<Source> fragmentLightCycle) {
        return new LiftedFragmentLightCycle(fragmentLightCycle);
    }

    public static <Source, Target extends Source> SupportFragmentLightCycle<Target> lift(SupportFragmentLightCycle<Source> supportFragmentLightCycle) {
        return new LiftedSupportFragmentLightCycle(supportFragmentLightCycle);
    }
}
