package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class ek implements ei {
    public boolean a(fb fbVar) {
        return fbVar instanceof fe;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1325gg.TYPE, "open");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
