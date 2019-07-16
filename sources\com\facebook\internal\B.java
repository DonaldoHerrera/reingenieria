package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FetchedAppSettingsManager */
class B implements Runnable {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;

    B(Context context, String str, String str2) {
        this.a = context;
        this.b = str;
        this.c = str2;
    }

    public void run() {
        JSONObject jSONObject;
        SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        A a2 = null;
        String string = sharedPreferences.getString(this.b, null);
        if (!ia.b(string)) {
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e) {
                ia.a("FacebookSDK", (Exception) e);
                jSONObject = null;
            }
            if (jSONObject != null) {
                a2 = E.b(this.c, jSONObject);
            }
        }
        JSONObject a3 = E.c(this.c);
        if (a3 != null) {
            E.b(this.c, a3);
            sharedPreferences.edit().putString(this.b, a3.toString()).apply();
        }
        if (a2 != null) {
            String i = a2.i();
            if (!E.f && i != null && i.length() > 0) {
                E.f = true;
                Log.w(E.a, i);
            }
        }
        C0564z.a(this.c, true);
        Uk.b();
        _k.c();
        E.d.set(E.c.containsKey(this.c) ? a.SUCCESS : a.ERROR);
        E.g();
    }
}
