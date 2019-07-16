package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.h reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0547h implements a {
    C0547h() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        bundle.putString(str, (String) obj);
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        jSONObject.put(str, obj);
    }
}
