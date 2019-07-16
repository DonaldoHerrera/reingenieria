package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.f reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0545f implements a {
    C0545f() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        bundle.putLong(str, ((Long) obj).longValue());
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jSONObject.put(str, obj);
    }
}
