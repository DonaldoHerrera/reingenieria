package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class ef implements ei {
    private String a;

    public ef(JSONObject jSONObject) {
        this.a = jSONObject.getJSONObject("data").getString("event_name");
    }

    public boolean a(fb fbVar) {
        if (fbVar instanceof fa) {
            fa faVar = (fa) fbVar;
            if (!Ng.d(faVar.a()) && faVar.a().equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1325gg.TYPE, "custom_event");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("event_name", this.a);
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
