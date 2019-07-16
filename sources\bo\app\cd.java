package bo.app;

import org.json.JSONArray;
import org.json.JSONObject;

public class cd implements bp, C1294fg<JSONArray> {
    private final JSONObject a;
    private final JSONArray b = new JSONArray();

    public cd(JSONObject jSONObject) {
        this.a = jSONObject;
        this.b.put(this.a);
    }

    public JSONObject a() {
        return this.a;
    }

    public boolean b() {
        JSONObject jSONObject = this.a;
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        if (this.a.length() != 1 || !this.a.has("user_id")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public JSONArray forJsonPut() {
        return this.b;
    }
}
