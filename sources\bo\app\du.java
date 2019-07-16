package bo.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class du extends JSONObject {
    private static final String a = Hg.a(du.class);

    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum a(JSONObject jSONObject, String str, Class<TargetEnum> cls) {
        return Enum.valueOf(cls, jSONObject.getString(str).toUpperCase(Locale.US));
    }

    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum a(JSONObject jSONObject, String str, Class<TargetEnum> cls, TargetEnum targetenum) {
        try {
            return a(jSONObject, str, cls);
        } catch (Exception unused) {
            return targetenum;
        }
    }

    public static <T> JSONArray a(Collection<? extends C1294fg<T>> collection) {
        JSONArray jSONArray = new JSONArray();
        for (C1294fg forJsonPut : collection) {
            jSONArray.put(forJsonPut.forJsonPut());
        }
        return jSONArray;
    }

    public static <T> JSONArray a(T[] tArr) {
        JSONArray jSONArray = new JSONArray();
        for (T put : tArr) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static String a(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str, null);
    }

    public static Map<String, String> a(JSONObject jSONObject, Map<String, String> map) {
        if (jSONObject != null) {
            HashMap hashMap = new HashMap();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                hashMap.put(str, jSONObject.getString(str));
            }
            return hashMap;
        } else if (map != null) {
            Hg.a(a, "Cannot convert JSONObject to Map because JSONObject is null. Returning default Map.");
            return map;
        } else {
            String str2 = "Cannot convert JSONObject to Map because JSONObject is null and no default was provided.";
            Hg.a(a, str2);
            throw new JSONException(str2);
        }
    }

    public static JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONObject jSONObject3 = new JSONObject();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                jSONObject3.put(str, jSONObject.get(str));
            }
            Iterator keys2 = jSONObject2.keys();
            while (keys2.hasNext()) {
                String str2 = (String) keys2.next();
                jSONObject3.put(str2, jSONObject2.get(str2));
            }
            return jSONObject3;
        } catch (JSONException e) {
            Hg.b(a, "Caught exception merging Json objects.", e);
            return null;
        }
    }
}
