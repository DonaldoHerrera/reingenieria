package com.facebook.internal;

import android.os.Bundle;
import com.facebook.internal.C0550k.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
class C0549j implements a {
    C0549j() {
    }

    public void a(Bundle bundle, String str, Object obj) throws JSONException {
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList();
        if (jSONArray.length() == 0) {
            bundle.putStringArrayList(str, arrayList);
            return;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            Object obj2 = jSONArray.get(i);
            if (obj2 instanceof String) {
                arrayList.add((String) obj2);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected type in an array: ");
                sb.append(obj2.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        bundle.putStringArrayList(str, arrayList);
    }

    public void a(JSONObject jSONObject, String str, Object obj) throws JSONException {
        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
    }
}
