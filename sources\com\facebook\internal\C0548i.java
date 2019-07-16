package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.i reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0548i implements a {
    C0548i() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        throw new IllegalArgumentException("Unexpected type from JSON");
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : (String[]) obj) {
            jSONArray.put(put);
        }
        jSONObject.put(str, jSONArray);
    }
}
