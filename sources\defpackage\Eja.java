package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.b.a;
import com.soundcloud.android.ia.f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Eja reason: default package */
/* compiled from: CustomTabsHelper */
public final class Eja {
    private static final List<String> a = C2063HD.a((E[]) new String[]{"j7xelte", "on7xelte", "j7e3g", "j7elte", "shieldtablet"});
    private static String b;

    private Eja() {
    }

    private static boolean a() {
        return a.contains(Build.DEVICE);
    }

    public static boolean b(Context context) {
        return a(context) != null && !a();
    }

    public static Fja a(Context context, Uri uri) {
        a aVar = new a();
        aVar.a(androidx.core.content.a.a(context, f.soundcloudOrange));
        return new Fja(aVar.a(), uri);
    }

    public static void a(Activity activity, b bVar, Uri uri) {
        if (b(activity)) {
            bVar.a.setPackage(a(activity));
            bVar.a(activity, uri);
            return;
        }
        throw new IllegalAccessError("A Chrome Custom Tabs handler is not available.");
    }

    static String a(Context context) {
        String str = b;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            b = null;
        } else if (arrayList.size() == 1) {
            b = (String) arrayList.get(0);
        } else if (TextUtils.isEmpty(str2) || a(context, intent) || !arrayList.contains(str2)) {
            String str3 = "com.android.chrome";
            if (arrayList.contains(str3)) {
                b = str3;
            } else {
                String str4 = "com.chrome.beta";
                if (arrayList.contains(str4)) {
                    b = str4;
                } else {
                    String str5 = "com.chrome.dev";
                    if (arrayList.contains(str5)) {
                        b = str5;
                    } else {
                        String str6 = "com.google.android.apps.chrome";
                        if (arrayList.contains(str6)) {
                            b = str6;
                        }
                    }
                }
            }
        } else {
            b = str2;
        }
        return b;
    }

    private static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            if (queryIntentActivities != null) {
                if (!queryIntentActivities.isEmpty()) {
                    for (ResolveInfo resolveInfo : queryIntentActivities) {
                        IntentFilter intentFilter = resolveInfo.filter;
                        if (intentFilter != null) {
                            if (intentFilter.countDataAuthorities() == 0) {
                                continue;
                            } else if (intentFilter.countDataPaths() != 0) {
                                if (resolveInfo.activityInfo != null) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            SDb.a("CustomTabsHelper").b("Runtime exception while getting specialized handlers", new Object[0]);
        }
    }
}
