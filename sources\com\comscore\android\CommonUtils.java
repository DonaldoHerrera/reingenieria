package com.comscore.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Locale;

public class CommonUtils {
    private static final String a = "persist.sys.dalvik.vm.lib";
    private static final String b = "libdvm.so";
    private static final String c = "libart.so";
    private static final String d = "libartd.so";

    private CommonUtils() {
    }

    private static boolean a() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    private static boolean b() {
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String getApplicationName(Context context) {
        String str = "unknown";
        if (context == null) {
            return str;
        }
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        try {
            CharSequence applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(packageName, 0));
            return applicationLabel != null ? applicationLabel.toString() : str;
        } catch (NameNotFoundException unused) {
            return str;
        }
    }

    public static String getApplicationResolution(Context context) {
        Point applicationSize = getApplicationSize(context);
        int i = applicationSize.x;
        int i2 = applicationSize.y;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(i));
        sb.append("x");
        sb.append(Integer.toString(i2));
        return sb.toString();
    }

    public static Point getApplicationSize(Context context) {
        Point point = new Point();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (VERSION.SDK_INT >= 13) {
            a.a(defaultDisplay, point);
            return point;
        }
        point.x = defaultDisplay.getWidth();
        point.y = defaultDisplay.getHeight();
        return point;
    }

    public static String getApplicationVersion(Context context) {
        String str = "unknown";
        if (context == null) {
            return str;
        }
        try {
            str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
        }
        return str;
    }

    public static int getConnectivityType(Context context) {
        if (context == null || !b.a(context, "android.permission.ACCESS_NETWORK_STATE").booleanValue()) {
            return ConnectivityType.UNKNOWN;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return ConnectivityType.DISCONNECTED;
        }
        if (activeNetworkInfo.getType() == 1) {
            return ConnectivityType.WIFI;
        }
        if (activeNetworkInfo.getType() == 0) {
            return ConnectivityType.WWAN;
        }
        if (VERSION.SDK_INT >= 8 && (activeNetworkInfo.getType() == 4 || activeNetworkInfo.getType() == 5 || activeNetworkInfo.getType() == 2 || activeNetworkInfo.getType() == 3)) {
            return ConnectivityType.WWAN;
        }
        if (VERSION.SDK_INT >= 13) {
            if (activeNetworkInfo.getType() == 9) {
                return ConnectivityType.ETHERNET;
            }
            if (activeNetworkInfo.getType() == 7) {
                return ConnectivityType.BLUETOOTH;
            }
        }
        return ConnectivityType.CONNECTED;
    }

    public static String getDeviceArchitecture() {
        return System.getProperty("os.arch");
    }

    public static String getDeviceModel() {
        return Build.DEVICE;
    }

    public static String getDisplayResolution(Context context) {
        Point displaySize = getDisplaySize(context);
        int i = displaySize.x;
        int i2 = displaySize.y;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(i));
        sb.append("x");
        sb.append(Integer.toString(i2));
        return sb.toString();
    }

    @SuppressLint({"NewApi"})
    public static Point getDisplaySize(Context context) {
        int i;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        int i2 = VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 17) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            i3 = point.x;
            i = point.y;
        } else if (i2 >= 14) {
            try {
                Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                int intValue = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                i = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                i3 = intValue;
            } catch (Exception unused) {
                i = 0;
            }
        } else {
            i3 = defaultDisplay.getWidth();
            i = defaultDisplay.getHeight();
        }
        return new Point(i3, i);
    }

    public static String getLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static String getOsName() {
        return "android";
    }

    public static String getOsVersion() {
        return VERSION.RELEASE;
    }

    public static String getPackageName(Context context) {
        return context == null ? "unknown" : context.getPackageName();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: ClassNotFoundException (unused java.lang.ClassNotFoundException), SYNTHETIC, Splitter:B:12:0x0037] */
    public static String getRuntime() {
        String lowerCase = System.getProperty("java.vm.name").toLowerCase(Locale.US);
        String str = "Dalvik";
        if (VERSION.SDK_INT < 19) {
            return str.toLowerCase(Locale.US);
        }
        Class cls = Class.forName("android.os.SystemProperties");
        Method method = cls.getMethod("get", new Class[]{String.class, String.class});
        if (method == null) {
            return lowerCase;
        }
        try {
            String str2 = (String) method.invoke(cls, new Object[]{a, str});
            if (b.equals(str2)) {
                return str.toLowerCase(Locale.US);
            }
            if (c.equals(str2)) {
                return "ART".toLowerCase(Locale.US);
            }
            if (d.equals(str2)) {
                return "ART_Debug".toLowerCase(Locale.US);
            }
            lowerCase = str2.toLowerCase(Locale.US);
            return lowerCase;
        } catch (ClassNotFoundException unused) {
        }
    }

    public static boolean isDeviceRooted() {
        return a() || b();
    }
}
