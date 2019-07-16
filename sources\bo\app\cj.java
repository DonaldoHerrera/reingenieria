package bo.app;

import org.json.JSONObject;

public final class cj {
    private final String a;

    public cj(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.a = jSONObject.optString("piqid", null);
        } else {
            this.a = null;
        }
    }

    public boolean a() {
        return this.a != null;
    }

    public String b() {
        return this.a;
    }
}
