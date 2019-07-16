package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.facebook.internal.ia;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserSettingsManager */
final class ba {
    private static final String a = "com.facebook.ba";
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static a c = new a(true, "com.facebook.sdk.AutoInitEnabled");
    private static a d = new a(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    /* access modifiers changed from: private */
    public static a e = new a(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    /* access modifiers changed from: private */
    public static a f = new a(false, "auto_event_setup_enabled");
    private static SharedPreferences g;
    private static Editor h;

    /* compiled from: UserSettingsManager */
    private static class a {
        String a;
        Boolean b;
        boolean c;
        long d;

        a(boolean z, String str) {
            this.c = z;
            this.a = str;
        }

        /* access modifiers changed from: 0000 */
        public boolean a() {
            Boolean bool = this.b;
            return bool == null ? this.c : bool.booleanValue();
        }
    }

    private static void c(a aVar) {
        k();
        try {
            String string = g.getString(aVar.a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                aVar.b = Boolean.valueOf(jSONObject.getBoolean("value"));
                aVar.d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException e2) {
            ia.a(a, (Exception) e2);
        }
    }

    /* access modifiers changed from: private */
    public static void d(a aVar) {
        k();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", aVar.b);
            jSONObject.put("last_timestamp", aVar.d);
            h.putString(aVar.a, jSONObject.toString()).commit();
            i();
        } catch (JSONException e2) {
            ia.a(a, (Exception) e2);
        }
    }

    public static boolean e() {
        g();
        return d.a();
    }

    public static boolean f() {
        g();
        return f.a();
    }

    public static void g() {
        if (B.t() && b.compareAndSet(false, true)) {
            g = B.e().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
            h = g.edit();
            a(d, e, c);
            h();
            j();
            i();
        }
    }

    private static void h() {
        c(f);
        long currentTimeMillis = System.currentTimeMillis();
        a aVar = f;
        if (aVar.b == null || currentTimeMillis - aVar.d >= 604800000) {
            a aVar2 = f;
            aVar2.b = null;
            aVar2.d = 0;
            B.m().execute(new aa(currentTimeMillis));
        }
    }

    private static void i() {
        int i;
        if (b.get() && B.t()) {
            Context e2 = B.e();
            int i2 = 0;
            int i3 = ((c.a() ? 1 : 0) << false) | 0 | ((d.a() ? 1 : 0) << true) | ((e.a() ? 1 : 0) << true);
            String str = "com.facebook.sdk.USER_SETTINGS_BITMASK";
            int i4 = g.getInt(str, 0);
            if (i4 != i3) {
                h.putInt(str, i3).commit();
                try {
                    ApplicationInfo applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled"};
                        boolean[] zArr = {true, true, true};
                        int i5 = 0;
                        int i6 = 0;
                        i = 0;
                        while (i5 < strArr.length) {
                            try {
                                i6 |= (applicationInfo.metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                i |= (applicationInfo.metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                                i5++;
                            } catch (NameNotFoundException unused) {
                            }
                        }
                        i2 = i6;
                        C1452kk kkVar = new C1452kk(e2);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i2);
                        bundle.putInt("initial", i);
                        bundle.putInt("previous", i4);
                        bundle.putInt("current", i3);
                        kkVar.b("fb_sdk_settings_changed", bundle);
                    }
                } catch (NameNotFoundException unused2) {
                }
                i = 0;
                C1452kk kkVar2 = new C1452kk(e2);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i2);
                bundle2.putInt("initial", i);
                bundle2.putInt("previous", i4);
                bundle2.putInt("current", i3);
                kkVar2.b("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    private static void j() {
        try {
            Context e2 = B.e();
            ApplicationInfo applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled")) {
                    Log.w(a, "Please set a value for AutoLogAppEventsEnabled. Set the flag to TRUE if you want to collect app install, app launch and in-app purchase events automatically. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!applicationInfo.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled")) {
                    Log.w(a, "You haven't set a value for AdvertiserIDCollectionEnabled. Set the flag to TRUE if you want to collect Advertiser ID for better advertising and analytics results. To request user consent before collecting data, set the flag value to FALSE, then change to TRUE once user consent is received. Learn more: https://developers.facebook.com/docs/app-events/getting-started-app-events-android#disable-auto-events.");
                }
                if (!c()) {
                    Log.w(a, "The value for AdvertiserIDCollectionEnabled is currently set to FALSE so you're sending app events without collecting Advertiser ID. This can affect the quality of your advertising and analytics results.");
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    private static void k() {
        if (!b.get()) {
            throw new C("The UserSettingManager has not been initialized successfully");
        }
    }

    private static void b(a aVar) {
        k();
        try {
            Context e2 = B.e();
            ApplicationInfo applicationInfo = e2.getPackageManager().getApplicationInfo(e2.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey(aVar.a)) {
                aVar.b = Boolean.valueOf(applicationInfo.metaData.getBoolean(aVar.a, aVar.c));
            }
        } catch (NameNotFoundException e3) {
            ia.a(a, (Exception) e3);
        }
    }

    private static void a(a... aVarArr) {
        for (a aVar : aVarArr) {
            if (aVar == f) {
                h();
            } else if (aVar.b == null) {
                c(aVar);
                if (aVar.b == null) {
                    b(aVar);
                }
            } else {
                d(aVar);
            }
        }
    }

    public static boolean c() {
        g();
        return e.a();
    }

    public static boolean d() {
        g();
        return c.a();
    }
}
