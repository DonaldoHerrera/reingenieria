package defpackage;

import android.content.Context;
import com.facebook.O;
import com.facebook.internal.C0542c;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Sk reason: default package */
/* compiled from: AppEventsLoggerUtility */
public class Sk {
    private static final Map<a, String> a = new Rk();

    /* renamed from: Sk$a */
    /* compiled from: AppEventsLoggerUtility */
    public enum a {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    public static JSONObject a(a aVar, C0542c cVar, String str, boolean z, Context context) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", a.get(aVar));
        String d = C1237dk.d();
        if (d != null) {
            jSONObject.put("app_user_id", d);
        }
        String c = C1237dk.c();
        if (!c.isEmpty()) {
            jSONObject.put("ud", c);
        }
        ia.a(jSONObject, cVar, str, z);
        try {
            ia.a(jSONObject, context);
        } catch (Exception e) {
            W.a(O.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
