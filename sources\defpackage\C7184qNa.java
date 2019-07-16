package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: qNa reason: default package and case insensitive filesystem */
/* compiled from: ApiKey */
public class C7184qNa {
    /* access modifiers changed from: protected */
    public String a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    /* access modifiers changed from: protected */
    public String a(Context context) {
        return new C4900FNa().a(context);
    }

    /* access modifiers changed from: protected */
    public String b(Context context) {
        String str = "Fabric";
        String str2 = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if ("@string/twitter_consumer_secret".equals(string)) {
                    C5328TMa.e().d(str, "Ignoring bad default value for Fabric ApiKey set by FirebaseUI-Auth");
                } else {
                    str2 = string;
                }
                if (str2 != null) {
                    return str2;
                }
                C5328TMa.e().d(str, "Falling back to Crashlytics key lookup from Manifest");
                return bundle.getString("com.crashlytics.ApiKey");
            } catch (Exception e) {
                e = e;
                str2 = string;
                C5701cNa e2 = C5328TMa.e();
                StringBuilder sb = new StringBuilder();
                sb.append("Caught non-fatal exception while retrieving apiKey: ");
                sb.append(e);
                e2.d(str, sb.toString());
                return str2;
            }
        } catch (Exception e3) {
            e = e3;
            C5701cNa e22 = C5328TMa.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Caught non-fatal exception while retrieving apiKey: ");
            sb2.append(e);
            e22.d(str, sb2.toString());
            return str2;
        }
    }

    /* access modifiers changed from: protected */
    public String c(Context context) {
        String str = "string";
        int a = C7391tNa.a(context, "io.fabric.ApiKey", str);
        if (a == 0) {
            C5328TMa.e().d("Fabric", "Falling back to Crashlytics key lookup from Strings");
            a = C7391tNa.a(context, "com.crashlytics.ApiKey", str);
        }
        if (a != 0) {
            return context.getResources().getString(a);
        }
        return null;
    }

    public String d(Context context) {
        String b = b(context);
        if (TextUtils.isEmpty(b)) {
            b = c(context);
        }
        if (TextUtils.isEmpty(b)) {
            b = a(context);
        }
        if (TextUtils.isEmpty(b)) {
            e(context);
        }
        return b;
    }

    /* access modifiers changed from: protected */
    public void e(Context context) {
        if (C5328TMa.g() || C7391tNa.j(context)) {
            throw new IllegalArgumentException(a());
        }
        C5328TMa.e().e("Fabric", a());
    }
}
