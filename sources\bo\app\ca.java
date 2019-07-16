package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public class ca implements C1294fg<JSONObject> {
    private static final String a = Hg.a(ca.class);
    private final long b;

    public ca(long j) {
        this.b = j;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("config_time", this.b);
            return jSONObject;
        } catch (JSONException e) {
            Hg.a(a, "Caught exception creating config params json.", e);
            return null;
        }
    }
}
