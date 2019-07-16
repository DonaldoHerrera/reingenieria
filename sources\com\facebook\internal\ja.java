package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.util.Log;
import com.facebook.B;
import com.facebook.C;
import java.util.Collection;
import java.util.List;

/* compiled from: Validate */
public final class ja {
    private static final String a = "com.facebook.internal.ja";

    public static void a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument '");
            sb.append(str);
            sb.append("' cannot be null");
            throw new NullPointerException(sb.toString());
        }
    }

    public static <T> void b(Collection<T> collection, String str) {
        if (collection.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Container '");
            sb.append(str);
            sb.append("' cannot be empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static <T> void c(Collection<T> collection, String str) {
        a(collection, str);
        b(collection, str);
    }

    public static <T> void a(Collection<T> collection, String str) {
        a((Object) collection, str);
        for (T t : collection) {
            if (t == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Container '");
                sb.append(str);
                sb.append("' cannot contain null values");
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static String b() {
        String k = B.k();
        if (k != null) {
            return k;
        }
        throw new IllegalStateException("No Client Token found, please set the Client Token.");
    }

    public static void c() {
        if (!B.t()) {
            throw new C("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    public static void a(String str, String str2) {
        if (ia.b(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Argument '");
            sb.append(str2);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static void b(Context context, boolean z) {
        a((Object) context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1) {
            String str = "No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.";
            if (!z) {
                Log.w(a, str);
                return;
            }
            throw new IllegalStateException(str);
        }
    }

    public static String a() {
        String f = B.f();
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b  */
    public static void a(Context context, boolean z) {
        ActivityInfo activityInfo;
        a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (NameNotFoundException unused) {
            }
            if (activityInfo != null) {
                String str = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.";
                if (!z) {
                    Log.w(a, str);
                    return;
                }
                throw new IllegalStateException(str);
            }
            return;
        }
        activityInfo = null;
        if (activityInfo != null) {
        }
    }

    public static boolean a(Context context) {
        List<ResolveInfo> list;
        a((Object) context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            StringBuilder sb = new StringBuilder();
            sb.append("fb");
            sb.append(B.f());
            sb.append("://authorize");
            intent.setData(Uri.parse(sb.toString()));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        boolean z = false;
        if (list != null) {
            boolean z2 = false;
            for (ResolveInfo resolveInfo : list) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                    return false;
                }
                z2 = true;
            }
            z = z2;
        }
        return z;
    }
}
