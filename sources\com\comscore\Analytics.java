package com.comscore;

import android.content.Context;
import android.os.Looper;
import com.comscore.activation.Activation;
import com.comscore.activation.Activation.ActivationListener;
import com.comscore.android.util.jni.AndroidJniHelper;
import com.comscore.android.vce.Vce;
import com.comscore.util.MapUtils;
import com.comscore.util.jni.JniComScoreHelper;
import com.comscore.util.log.Logger;
import com.comscore.util.setup.Setup;
import java.util.HashMap;
import java.util.Map;

public class Analytics {
    private static Configuration a = new Configuration();
    private static int b = 0;

    static {
        Setup.setUp();
    }

    private Analytics() {
    }

    private static void a(Throwable th) {
        b++;
        Logger.e("Error using the native library: ", th);
    }

    public static void aggregate(EventInfo eventInfo) {
        try {
            aggregateEventInfoNative(eventInfo.a());
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void aggregate(Map<String, String> map) {
        try {
            aggregateNative(MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void aggregateEventInfoNative(long j);

    private static native void aggregateNative(Map<String, String> map);

    public static void clearInternalData() {
        try {
            clearInternalDataNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void clearInternalDataNative();

    public static void clearOfflineCache() {
        try {
            clearOfflineCacheNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void clearOfflineCacheNative();

    public static void flushOfflineCache() {
        try {
            flushOfflineCacheNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void flushOfflineCacheNative();

    public static void getActivationCategories(String str, String str2, PublisherConfiguration publisherConfiguration, ActivationListener activationListener) {
        Activation.getCategories(str, str2, publisherConfiguration, activationListener);
    }

    public static Configuration getConfiguration() {
        return a;
    }

    protected static int getExceptionCounter() {
        return b;
    }

    public static int getLogLevel() {
        return Logger.getLogLevel();
    }

    private static native int getLogLevelNative();

    public static Vce getSharedVceInstance(Context context) {
        return Vce.getSharedInstance(context);
    }

    public static Map<String, String> getTrackingProperties() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                return getTrackingPropertiesNative();
            } catch (UnsatisfiedLinkError e) {
                a(e);
                return new HashMap();
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    private static native Map<String, String> getTrackingPropertiesNative();

    public static String getVceVersion() {
        return Vce.getSdkVersion();
    }

    public static String getVersion() {
        try {
            return getVersionNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
            return null;
        }
    }

    private static native String getVersionNative();

    public static boolean isInitialized() {
        try {
            return isInitializedNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
            return false;
        }
    }

    private static native boolean isInitializedNative();

    public static void notifyEnterForeground() {
        try {
            notifyEnterForegroundNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyEnterForegroundNative();

    public static void notifyExitForeground() {
        try {
            notifyExitForegroundNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyExitForegroundNative();

    public static void notifyHiddenEvent() {
        try {
            notifyHiddenEventNative(null);
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyHiddenEvent(EventInfo eventInfo) {
        try {
            notifyHiddenEventEventInfoNative(eventInfo.a());
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyHiddenEvent(Map<String, String> map) {
        try {
            notifyHiddenEventNative(map);
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyHiddenEventEventInfoNative(long j);

    private static native void notifyHiddenEventNative(Map<String, String> map);

    public static void notifyUserInteraction() {
        try {
            notifyUserInteractionNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyUserInteractionNative();

    public static void notifyUxActive() {
        try {
            notifyUxActiveNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyUxActiveNative();

    public static void notifyUxInactive() {
        try {
            notifyUxInactiveNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyUxInactiveNative();

    public static void notifyViewEvent() {
        try {
            notifyViewEventNative(null);
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyViewEvent(EventInfo eventInfo) {
        try {
            notifyViewEventEventInfoNative(eventInfo.a());
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    public static void notifyViewEvent(Map<String, String> map) {
        try {
            notifyViewEventNative(MapUtils.mapOfStrings(map));
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void notifyViewEventEventInfoNative(long j);

    private static native void notifyViewEventNative(Map<String, String> map);

    public static void setLogLevel(int i) {
        Logger.setLogLevel(i);
    }

    private static native void setLogLevelNative(int i);

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    public static void start(Context context) {
        JniComScoreHelper jniComScoreHelper;
        try {
            jniComScoreHelper = Setup.getJniComScoreHelper();
            if (jniComScoreHelper != null) {
                try {
                    ((AndroidJniHelper) jniComScoreHelper).setContext(context);
                    startNative(Setup.getJniComScoreHelper().getAppDataDir());
                } catch (UnsatisfiedLinkError e) {
                    e = e;
                    a(e);
                    if (jniComScoreHelper != null) {
                    }
                }
                if (jniComScoreHelper != null) {
                    jniComScoreHelper.start();
                    return;
                }
                return;
            }
            throw new NullPointerException("The class JniComScoreHelper has not been initialised.");
        } catch (UnsatisfiedLinkError e2) {
            e = e2;
            jniComScoreHelper = null;
            a(e);
            if (jniComScoreHelper != null) {
            }
        }
    }

    private static native void startNative(String str);

    public static void updateUsageProperties() {
        try {
            updateUsagePropertiesNative();
        } catch (UnsatisfiedLinkError e) {
            a(e);
        }
    }

    private static native void updateUsagePropertiesNative();
}
