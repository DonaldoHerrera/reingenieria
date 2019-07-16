package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class em implements ei {
    String a;

    em() {
    }

    public boolean a(fb fbVar) {
        if (fbVar instanceof ff) {
            if (Ng.d(this.a)) {
                return true;
            }
            ff ffVar = (ff) fbVar;
            if (!Ng.d(ffVar.a()) && ffVar.a().equals(this.a)) {
                return true;
            }
        }
        return false;
    }

    public em(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject != null) {
            String str = "product_id";
            if (!optJSONObject.isNull(str)) {
                this.a = optJSONObject.optString(str, null);
            }
        }
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1325gg.TYPE, "purchase");
            if (this.a != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("product_id", this.a);
                jSONObject.putOpt("data", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
