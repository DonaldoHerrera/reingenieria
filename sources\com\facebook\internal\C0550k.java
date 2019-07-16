package com.facebook.internal;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.k reason: case insensitive filesystem */
/* compiled from: BundleJSONConverter */
public class C0550k {
    private static final Map<Class<?>, a> a = new HashMap();

    /* renamed from: com.facebook.internal.k$a */
    /* compiled from: BundleJSONConverter */
    public interface a {
        void a(Bundle bundle, String str, Object obj) throws JSONException;

        void a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        a.put(Boolean.class, new C0543d());
        a.put(Integer.class, new C0544e());
        a.put(Long.class, new C0545f());
        a.put(Double.class, new C0546g());
        a.put(String.class, new C0547h());
        a.put(String[].class, new C0548i());
        a.put(JSONArray.class, new C0549j());
    }

    public static JSONObject a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, a((Bundle) obj));
                } else {
                    a aVar = (a) a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.a(jSONObject, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return jSONObject;
    }

    public static Bundle a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, a((JSONObject) obj));
                } else {
                    a aVar = (a) a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.a(bundle, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle;
    }
}
