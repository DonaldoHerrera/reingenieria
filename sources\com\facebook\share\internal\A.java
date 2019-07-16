package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OpenGraphJSONUtility */
public final class A {

    /* compiled from: OpenGraphJSONUtility */
    public interface a {
        JSONObject a(SharePhoto sharePhoto);
    }

    public static JSONObject a(ShareOpenGraphAction shareOpenGraphAction, a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.b()) {
            jSONObject.put(str, a(shareOpenGraphAction.a(str), aVar));
        }
        return jSONObject;
    }

    private static JSONObject a(ShareOpenGraphObject shareOpenGraphObject, a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.b()) {
            jSONObject.put(str, a(shareOpenGraphObject.a(str), aVar));
        }
        return jSONObject;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    private static JSONArray a(List<Object> list, a aVar) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (Object a2 : list) {
            jSONArray.put(a(a2, aVar));
        }
        return jSONArray;
    }

    public static Object a(Object obj, a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return a((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
