package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.z reason: case insensitive filesystem */
/* compiled from: FetchedAppGateKeepersManager */
public class C0564z {
    private static final Map<String, JSONObject> a = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public static Long b = null;

    /* access modifiers changed from: private */
    public static JSONObject b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("platform", "android");
        bundle.putString("sdk_version", B.q());
        bundle.putString("fields", "gatekeepers");
        GraphRequest a2 = GraphRequest.a((AccessToken) null, String.format("%s/%s", new Object[]{str, "mobile_sdk_gk"}), (b) null);
        a2.a(true);
        a2.a(bundle);
        return a2.b().b();
    }

    public static synchronized void a() {
        synchronized (C0564z.class) {
            if (!b(b)) {
                Context e = B.e();
                String f = B.f();
                B.m().execute(new C0563y(e, String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{f}), f));
            }
        }
    }

    public static JSONObject a(String str, boolean z) {
        if (!z && a.containsKey(str)) {
            return (JSONObject) a.get(str);
        }
        JSONObject b2 = b(str);
        if (b2 == null) {
            return null;
        }
        Context e = B.e();
        e.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", new Object[]{str}), b2.toString()).apply();
        return b(str, b2);
    }

    /* access modifiers changed from: private */
    public static synchronized JSONObject b(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (C0564z.class) {
            if (a.containsKey(str)) {
                jSONObject2 = (JSONObject) a.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException e) {
                        ia.a("FacebookSDK", (Exception) e);
                    }
                }
            }
            a.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    public static boolean a(String str, String str2, boolean z) {
        a();
        return (str2 == null || !a.containsKey(str2)) ? z : ((JSONObject) a.get(str2)).optBoolean(str, z);
    }

    private static boolean b(Long l) {
        boolean z = false;
        if (l == null) {
            return false;
        }
        if (System.currentTimeMillis() - l.longValue() < 3600000) {
            z = true;
        }
        return z;
    }
}
