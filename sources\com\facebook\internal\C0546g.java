package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.g reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0546g implements a {
    C0546g() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        bundle.putDouble(str, ((Double) obj).doubleValue());
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jSONObject.put(str, obj);
    }
}
