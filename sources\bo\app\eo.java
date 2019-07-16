package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class eo implements ei {
    private String a;

    eo() {
    }

    public boolean a(fb fbVar) {
        if (fbVar instanceof fg) {
            if (Ng.d(this.a)) {
                return true;
            }
            fg fgVar = (fg) fbVar;
            if (!Ng.d(fgVar.a()) && fgVar.a().equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public eo(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            String str = "campaign_id";
            if (!optJSONObject.isNull(str)) {
                this.a = optJSONObject.optString(str, null);
            }
        }
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1325gg.TYPE, "push_click");
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("campaign_id", this.a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
