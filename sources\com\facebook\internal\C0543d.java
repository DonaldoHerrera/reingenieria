package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.d reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0543d implements a {
    C0543d() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jSONObject.put(str, obj);
    }
}
