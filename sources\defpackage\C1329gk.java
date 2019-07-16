package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.C0594t;
import com.facebook.O;
import com.facebook.internal.C0564z;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import com.facebook.internal.ja;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: gk reason: default package and case insensitive filesystem */
/* compiled from: AppEventsLoggerImpl */
class C1329gk {
    private static final String a = "gk";
    private static ScheduledThreadPoolExecutor b;
    private static a c = a.AUTO;
    private static Object d = new Object();
    private static String e;
    private static boolean f;
    private static String g;
    private final String h;
    private final Qj i;

    C1329gk(Context context, String str, AccessToken accessToken) {
        this(ia.b(context), str, accessToken);
    }

    static void a(Application application, String str) {
        if (B.t()) {
            Sj.c();
            C1576ok.b();
            if (str == null) {
                str = B.f();
            }
            B.b(application, str);
            Pk.a(application, str);
            return;
        }
        throw new C0594t("The Facebook sdk must be initialized before calling activateApp");
    }

    static Executor c() {
        if (b == null) {
            h();
        }
        return b;
    }

    static a d() {
        a aVar;
        synchronized (d) {
            aVar = c;
        }
        return aVar;
    }

    static String e() {
        return B.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString(Constants.INSTALL_REFERRER, null);
    }

    static String f() {
        String str;
        synchronized (d) {
            str = g;
        }
        return str;
    }

    static void g() {
        C0495bk.f();
    }

    private static void h() {
        synchronized (d) {
            if (b == null) {
                b = new ScheduledThreadPoolExecutor(1);
                b.scheduleAtFixedRate(new C1298fk(), 0, 86400, TimeUnit.SECONDS);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        C0495bk.a(C1360hk.EXPLICIT);
    }

    private static void b(String str) {
        W.a(O.DEVELOPER_ERRORS, "AppEvents", str);
    }

    C1329gk(String str, String str2, AccessToken accessToken) {
        ja.c();
        this.h = str;
        if (accessToken == null) {
            accessToken = AccessToken.c();
        }
        if (!AccessToken.m() || (str2 != null && !str2.equals(accessToken.b()))) {
            if (str2 == null) {
                str2 = ia.c(B.e());
            }
            this.i = new Qj(null, str2);
        } else {
            this.i = new Qj(accessToken);
        }
        h();
    }

    static void a(Context context, String str) {
        if (B.h()) {
            b.execute(new C1267ek(context, new C1329gk(context, str, (AccessToken) null)));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Bundle bundle) {
        a(str, null, bundle, false, Pk.n());
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, double d2, Bundle bundle) {
        a(str, Double.valueOf(d2), bundle, false, Pk.n());
    }

    /* access modifiers changed from: 0000 */
    public void a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        a(bigDecimal, currency, bundle, true);
    }

    /* access modifiers changed from: 0000 */
    public void a(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (bigDecimal == null) {
            b("purchaseAmount cannot be null");
        } else if (currency == null) {
            b("currency cannot be null");
        } else {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = bundle;
            bundle2.putString("fb_currency", currency.getCurrencyCode());
            a("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle2, z, Pk.n());
            a();
        }
    }

    static void a(String str) {
        SharedPreferences sharedPreferences = B.e().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
        if (str != null) {
            sharedPreferences.edit().putString(Constants.INSTALL_REFERRER, str).apply();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Double d2, Bundle bundle) {
        a(str, d2, bundle, true, Pk.n());
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (bigDecimal == null || currency == null) {
            ia.b(a, "purchaseAmount and currency cannot be null");
            return;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        bundle2.putString("fb_currency", currency.getCurrencyCode());
        a(str, Double.valueOf(bigDecimal.doubleValue()), bundle2, true, Pk.n());
    }

    /* access modifiers changed from: 0000 */
    public void a(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        String str2 = "AppEvents";
        if (C0564z.a("app_events_killswitch", B.f(), false)) {
            W.a(O.APP_EVENTS, str2, "KillSwitch is enabled and fail to log app event: %s", str);
            return;
        }
        try {
            Uj uj = new Uj(this.h, str, d2, bundle, z, Pk.p(), uuid);
            a(uj, this.i);
        } catch (JSONException e2) {
            W.a(O.APP_EVENTS, str2, "JSON encoding for app event failed: '%s'", e2.toString());
        } catch (C0594t e3) {
            W.a(O.APP_EVENTS, str2, "Invalid app event: %s", e3.toString());
        }
    }

    private static void a(Uj uj, Qj qj) {
        C0495bk.a(qj, uj);
        if (!uj.a() && !f) {
            if (uj.c().equals("fb_mobile_activate_app")) {
                f = true;
            } else {
                W.a(O.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            }
        }
    }

    static void a() {
        if (d() != a.EXPLICIT_ONLY) {
            C0495bk.a(C1360hk.EAGER_FLUSHING_EVENT);
        }
    }

    static String a(Context context) {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (e == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("XZ");
                        sb.append(UUID.randomUUID().toString());
                        e = sb.toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", e).apply();
                    }
                }
            }
        }
        return e;
    }
}
