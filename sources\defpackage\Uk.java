package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.B;
import com.facebook.internal.A;
import com.facebook.internal.C0564z;
import com.facebook.internal.E;
import com.facebook.internal.ja;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Uk reason: default package */
/* compiled from: AutomaticAnalyticsLogger */
public class Uk {
    private static final String a = "Uk";
    private static final C1452kk b = new C1452kk(B.e());

    /* renamed from: Uk$a */
    /* compiled from: AutomaticAnalyticsLogger */
    private static class a {
        BigDecimal a;
        Currency b;
        Bundle c;

        a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.a = bigDecimal;
            this.b = currency;
            this.c = bundle;
        }
    }

    public static void a(String str, long j) {
        Context e = B.e();
        String f = B.f();
        ja.a((Object) e, "context");
        A a2 = E.a(f, false);
        if (a2 != null && a2.a() && j > 0) {
            C1452kk kkVar = new C1452kk(e);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_aa_time_spent_view_name", str);
            kkVar.a("fb_aa_time_spent_on_view", (double) j, bundle);
        }
    }

    public static void b() {
        Context e = B.e();
        String f = B.f();
        boolean h = B.h();
        ja.a((Object) e, "context");
        if (!h) {
            return;
        }
        if (e instanceof Application) {
            C1237dk.a((Application) e, f);
        } else {
            Log.w(a, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
        }
    }

    private static a b(String str, String str2) {
        return a(str, str2, new HashMap());
    }

    public static void a(String str, String str2) {
        if (a()) {
            a b2 = b(str, str2);
            if (b2 != null) {
                b.a(b2.a, b2.b, b2.c);
            }
        }
    }

    public static void a(C1268el elVar, String str, String str2, Map<String, String> map) {
        String str3;
        if (a()) {
            boolean a2 = C0564z.a("app_events_if_auto_log_subs", B.f(), false);
            switch (Tk.a[elVar.ordinal()]) {
                case 1:
                    if (a2) {
                        str3 = "Subscribe";
                        break;
                    } else {
                        a(str, str2);
                        return;
                    }
                case 2:
                    if (a2) {
                        str3 = "StartTrial";
                        break;
                    } else {
                        a(str, str2);
                        return;
                    }
                case 3:
                    str3 = "SubscriptionRestore";
                    break;
                case 4:
                    str3 = "SubscriptionCancel";
                    break;
                case 5:
                    str3 = "SubscriptionHeartbeat";
                    break;
                case 6:
                    str3 = "SubscriptionExpire";
                    break;
                default:
                    return;
            }
            a a3 = a(str, str2, map);
            if (a3 != null) {
                b.a(str3, a3.a, a3.b, a3.c);
            }
        }
    }

    public static boolean a() {
        A b2 = E.b(B.f());
        return b2 != null && B.h() && b2.f();
    }

    private static a a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString(C1325gg.TYPE);
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, (CharSequence) map.get(str3));
            }
            return new a(new BigDecimal(((double) jSONObject2.getLong("price_amount_micros")) / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException e) {
            Log.e(a, "Error parsing in-app subscription data.", e);
            return null;
        }
    }
}
