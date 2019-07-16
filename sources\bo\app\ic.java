package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

public class ic extends ib {
    hy a;

    public ic(hy hyVar) {
        this.a = hyVar;
    }

    public void a(String str, Object obj, Object obj2, hz hzVar) {
        if (!(obj instanceof Number) || !(obj2 instanceof Number)) {
            if (!obj.getClass().isAssignableFrom(obj2.getClass())) {
                hzVar.a(str, obj, obj2);
            } else if (obj instanceof JSONArray) {
                e(str, (JSONArray) obj, (JSONArray) obj2, hzVar);
            } else if (obj instanceof JSONObject) {
                c(str, (JSONObject) obj, (JSONObject) obj2, hzVar);
            } else if (!obj.equals(obj2)) {
                hzVar.a(str, obj, obj2);
            }
        } else if (((Number) obj).doubleValue() != ((Number) obj2).doubleValue()) {
            hzVar.a(str, obj, obj2);
        }
    }

    public void c(String str, JSONObject jSONObject, JSONObject jSONObject2, hz hzVar) {
        b(str, jSONObject, jSONObject2, hzVar);
        if (!this.a.a()) {
            a(str, jSONObject, jSONObject2, hzVar);
        }
    }

    public void e(String str, JSONArray jSONArray, JSONArray jSONArray2, hz hzVar) {
        if (jSONArray.length() != jSONArray2.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[]: Expected ");
            sb.append(jSONArray.length());
            sb.append(" values but got ");
            sb.append(jSONArray2.length());
            hzVar.a(sb.toString());
        } else if (jSONArray.length() != 0) {
            if (this.a.b()) {
                c(str, jSONArray, jSONArray2, hzVar);
            } else if (ie.c(jSONArray)) {
                b(str, jSONArray, jSONArray2, hzVar);
            } else if (ie.d(jSONArray)) {
                a(str, jSONArray, jSONArray2, hzVar);
            } else {
                d(str, jSONArray, jSONArray2, hzVar);
            }
        }
    }
}
