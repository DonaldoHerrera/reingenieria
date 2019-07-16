package com.crashlytics.android;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.crashlytics.android.ndk.c;

public class CrashlyticsInitProvider extends ContentProvider {

    interface a {
        boolean a(Context context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032 A[SYNTHETIC, Splitter:B:12:0x0032] */
    private C5531_Ma[] a(Context context) {
        boolean z;
        String str = "Fabric";
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null && bundle.getBoolean("firebase_crashlytics_ndk_enabled", false)) {
                z = true;
                a aVar = new a();
                if (z) {
                    try {
                        C5328TMa.e().i(str, "Crashlytics is initializing NDK crash reporter.");
                        return new C5531_Ma[]{aVar, new c()};
                    } catch (Throwable th) {
                        C5328TMa.e().e(str, "Crashlytics failed to initialize NDK crash reporting. Attempting to intialize SDK...", th);
                    }
                }
                return new C5531_Ma[]{aVar};
            }
        } catch (NameNotFoundException e) {
            C5328TMa.e().a(str, "Unable to get PackageManager while determining if Crashlytics NDK should be initialized", e);
        }
        z = false;
        a aVar2 = new a();
        if (z) {
        }
        return new C5531_Ma[]{aVar2};
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        Context context = getContext();
        boolean a2 = a(context, new C4900FNa(), new b());
        String str = "CrashlyticsInitProvider";
        if (a2) {
            try {
                C5328TMa.a(context, a(context.getApplicationContext()));
                C5328TMa.e().i(str, "CrashlyticsInitProvider initialization successful");
            } catch (IllegalStateException unused) {
                C5328TMa.e().i(str, "CrashlyticsInitProvider initialization unsuccessful");
                return false;
            }
        } else {
            C5328TMa.e().i(str, "CrashlyticsInitProvider skipping initialization");
        }
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Context context, C4900FNa fNa, a aVar) {
        if (fNa.e(context)) {
            return aVar.a(context);
        }
        return fNa.d(context);
    }
}
