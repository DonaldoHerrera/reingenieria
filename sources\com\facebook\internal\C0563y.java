package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.y reason: case insensitive filesystem */
/* compiled from: FetchedAppGateKeepersManager */
class C0563y implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    C0563y(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public void run() {
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0);
        JSONObject jSONObject = null;
        String string = sharedPreferences.getString(this.b, null);
        if (!ia.b(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                ia.a("FacebookSDK", (Exception) e);
            }
            if (jSONObject != null) {
                C0564z.b(this.c, jSONObject);
            }
        }
        JSONObject a2 = C0564z.b(this.c);
        if (a2 != null) {
            C0564z.b = Long.valueOf(System.currentTimeMillis());
            C0564z.b(this.c, a2);
            sharedPreferences.edit().putString(this.b, a2.toString()).apply();
        }
    }
}
