package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.C0594t;

/* renamed from: ek reason: default package and case insensitive filesystem */
/* compiled from: AppEventsLoggerImpl */
class C1267ek implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ C1329gk b;

    C1267ek(Context context, C1329gk gkVar) {
        this.a = context;
        this.b = gkVar;
    }

    public void run() {
        Bundle bundle = new Bundle();
        String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
        String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
        if (strArr.length == strArr2.length) {
            int i = 0;
            for (int i2 = 0; i2 < strArr.length; i2++) {
                String str = strArr[i2];
                String str2 = strArr2[i2];
                try {
                    Class.forName(str);
                    bundle.putInt(str2, 1);
                    i |= 1 << i2;
                } catch (ClassNotFoundException unused) {
                }
            }
            SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String str3 = "kitsBitmask";
            if (sharedPreferences.getInt(str3, 0) != i) {
                sharedPreferences.edit().putInt(str3, i).apply();
                this.b.a("fb_sdk_initialize", (Double) null, bundle);
                return;
            }
            return;
        }
        throw new C0594t("Number of class names and key names should match");
    }
}
