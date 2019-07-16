package com.google.firebase.perf;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.firebase-perf.C0915z;
import com.google.firebase.FirebaseApp;
import com.google.firebase.perf.internal.FeatureControl;
import com.google.firebase.perf.internal.GaugeManager;
import com.google.firebase.perf.internal.RemoteConfigManager;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class a {
    private static volatile a a;
    private final Map<String, String> b;
    private final C0915z c;
    private Boolean d;

    a(FirebaseApp firebaseApp, FirebaseRemoteConfig firebaseRemoteConfig) {
        this(firebaseApp, firebaseRemoteConfig, RemoteConfigManager.zzbz(), FeatureControl.zzao(), GaugeManager.zzbf());
    }

    public static a b() {
        if (a == null) {
            synchronized (a.class) {
                if (a == null) {
                    a = (a) FirebaseApp.getInstance().a(a.class);
                }
            }
        }
        return a;
    }

    private final boolean d() {
        return this.c.a("firebase_performance_collection_deactivated", false);
    }

    public void a(boolean z) {
        try {
            FirebaseApp.getInstance();
            SharedPreferences sharedPreferences = FirebaseApp.getInstance().b().getSharedPreferences("FirebasePerfSharedPrefs", 0);
            String str = "FirebasePerformance";
            if (!d()) {
                sharedPreferences.edit().putBoolean("isEnabled", z).apply();
                this.d = Boolean.valueOf(z);
                if (z) {
                    Log.i(str, "Firebase Performance is Enabled");
                } else {
                    Log.i(str, "Firebase Performance is Disabled");
                }
            } else {
                Log.i(str, "Firebase Performance is permanently disabled");
            }
        } catch (IllegalStateException unused) {
        }
    }

    public boolean c() {
        Boolean bool = this.d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return FirebaseApp.getInstance().isDataCollectionDefaultEnabled();
    }

    private a(FirebaseApp firebaseApp, FirebaseRemoteConfig firebaseRemoteConfig, RemoteConfigManager remoteConfigManager, FeatureControl featureControl, GaugeManager gaugeManager) {
        this.b = new ConcurrentHashMap();
        this.d = null;
        if (firebaseApp == null) {
            this.d = Boolean.valueOf(false);
            this.c = new C0915z(new Bundle());
            return;
        }
        Context b2 = firebaseApp.b();
        this.c = b(b2);
        this.d = a(b2);
        remoteConfigManager.zza(firebaseRemoteConfig);
        remoteConfigManager.zza(firebaseApp);
        featureControl.zza(this.c);
        gaugeManager.zze(b2);
    }

    private static C0915z b(Context context) {
        Bundle bundle;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (NameNotFoundException | NullPointerException e) {
            String str = "No perf enable meta data found ";
            String valueOf = String.valueOf(e.getMessage());
            Log.d("isEnabled", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            bundle = null;
        }
        return bundle != null ? new C0915z(bundle) : new C0915z();
    }

    public final Map<String, String> a() {
        return new HashMap(this.b);
    }

    private final Boolean a(Context context) {
        String str = "isEnabled";
        if (d()) {
            return Boolean.valueOf(false);
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        try {
            if (sharedPreferences.contains(str)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, true));
            }
        } catch (ClassCastException e) {
            String str2 = "Unable to access enable value: ";
            String valueOf = String.valueOf(e.getMessage());
            Log.d("FirebasePerformance", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        String str3 = "firebase_performance_collection_enabled";
        if (this.c.a(str3)) {
            return Boolean.valueOf(this.c.a(str3, true));
        }
        Log.d(str, "No perf enable meta data found in manifest.");
        return null;
    }

    public Trace a(String str) {
        return Trace.a(str);
    }
}
