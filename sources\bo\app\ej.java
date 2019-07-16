package bo.app;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ej implements ei {
    private String a;
    private Set<String> b = new HashSet();

    public ej(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.a = jSONObject2.getString("id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("buttons");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.b.add(optJSONArray.getString(i));
            }
        }
    }

    public boolean a(fb fbVar) {
        boolean z = false;
        if (fbVar instanceof fd) {
            fd fdVar = (fd) fbVar;
            if (!Ng.d(fdVar.a()) && fdVar.a().equals(this.a)) {
                if (this.b.size() <= 0) {
                    return Ng.d(fdVar.f());
                }
                if (!Ng.d(fdVar.f()) && this.b.contains(fdVar.f())) {
                    z = true;
                }
                return z;
            }
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C1325gg.TYPE, "iam_click");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", this.a);
            if (this.b.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (String put : this.b) {
                    jSONArray.put(put);
                }
                jSONObject2.put("buttons", jSONArray);
            }
            jSONObject.put("data", jSONObject2);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
