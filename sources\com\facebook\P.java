package com.facebook;

import android.net.Uri;
import android.util.Log;
import com.facebook.internal.ia.a;
import org.json.JSONObject;

/* compiled from: Profile */
class P implements a {
    P() {
    }

    public void a(JSONObject jSONObject) {
        String optString = jSONObject.optString("id");
        if (optString != null) {
            String optString2 = jSONObject.optString("link");
            Profile profile = new Profile(optString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), optString2 != null ? Uri.parse(optString2) : null);
            Profile.a(profile);
        }
    }

    public void a(C0594t tVar) {
        String a = Profile.a;
        StringBuilder sb = new StringBuilder();
        sb.append("Got unexpected exception: ");
        sb.append(tVar);
        Log.e(a, sb.toString());
    }
}
