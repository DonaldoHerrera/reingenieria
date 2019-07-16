package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: FNa reason: default package and case insensitive filesystem */
/* compiled from: FirebaseInfo */
public class C4900FNa {
    /* access modifiers changed from: 0000 */
    public String a(Context context) {
        int a = C7391tNa.a(context, "google_app_id", "string");
        if (a == 0) {
            return null;
        }
        C5328TMa.e().d("Fabric", "Generating Crashlytics ApiKey from google_app_id in Strings");
        return a(context.getResources().getString(a));
    }

    /* access modifiers changed from: 0000 */
    public boolean b(Context context) {
        if (!TextUtils.isEmpty(new C7184qNa().b(context))) {
            return true;
        }
        return !TextUtils.isEmpty(new C7184qNa().c(context));
    }

    /* access modifiers changed from: 0000 */
    public boolean c(Context context) {
        int a = C7391tNa.a(context, "google_app_id", "string");
        if (a == 0) {
            return false;
        }
        return !TextUtils.isEmpty(context.getResources().getString(a));
    }

    public boolean d(Context context) {
        int a = C7391tNa.a(context, "io.fabric.auto_initialize", "bool");
        if (a == 0) {
            return false;
        }
        boolean z = context.getResources().getBoolean(a);
        if (z) {
            C5328TMa.e().d("Fabric", "Found Fabric auto-initialization flag for joint Firebase/Fabric customers");
        }
        return z;
    }

    public boolean e(Context context) {
        boolean z = false;
        if (C7391tNa.a(context, "com.crashlytics.useFirebaseAppId", false)) {
            return true;
        }
        if (c(context) && !b(context)) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public String a(String str) {
        return C7391tNa.d(str).substring(0, 40);
    }
}
