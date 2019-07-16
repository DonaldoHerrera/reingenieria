package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.e reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0544e implements a {
    C0544e() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        bundle.putInt(str, ((Integer) obj).intValue());
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jSONObject.put(str, obj);
    }
}
