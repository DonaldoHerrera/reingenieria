package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class ep implements ei {
    public boolean a(fb fbVar) {
        return fbVar instanceof fh;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1325gg.TYPE, "test");
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
