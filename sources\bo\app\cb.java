package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public class cb implements C1294fg<JSONObject> {
    private final Integer a;
    private final Boolean b;

    public cb() {
        this(Integer.valueOf(1), null);
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.a != null) {
                jSONObject.put("count", this.a);
            }
            if (this.b != null) {
                jSONObject.put("all", this.b);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public cb(Integer num, Boolean bool) {
        this.a = num;
        this.b = bool;
    }
}
