package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

public final class hx {
    private static id a(hy hyVar) {
        return new ic(hyVar);
    }

    public static hz a(String str, String str2, id idVar) {
        Object a = ia.a(str);
        Object a2 = ia.a(str2);
        boolean z = a instanceof JSONObject;
        if (z && (a2 instanceof JSONObject)) {
            return a((JSONObject) a, (JSONObject) a2, idVar);
        }
        if ((a instanceof JSONArray) && (a2 instanceof JSONArray)) {
            return a((JSONArray) a, (JSONArray) a2, idVar);
        }
        if ((a instanceof hu) && (a2 instanceof hu)) {
            return a((hu) a, (hu) a2);
        }
        String str3 = "";
        if (z) {
            return new hz().a(str3, a, a2);
        }
        return new hz().a(str3, a, a2);
    }

    public static hz a(JSONObject jSONObject, JSONObject jSONObject2, id idVar) {
        return idVar.a(jSONObject, jSONObject2);
    }

    public static hz a(JSONArray jSONArray, JSONArray jSONArray2, id idVar) {
        return idVar.a(jSONArray, jSONArray2);
    }

    public static hz a(hu huVar, hu huVar2) {
        hz hzVar = new hz();
        if (!huVar.a().equals(huVar2.a())) {
            hzVar.a("");
        }
        return hzVar;
    }

    public static hz a(String str, String str2, hy hyVar) {
        return a(str, str2, a(hyVar));
    }

    public static hz a(JSONObject jSONObject, JSONObject jSONObject2, hy hyVar) {
        return a(jSONObject, jSONObject2, a(hyVar));
    }
}
