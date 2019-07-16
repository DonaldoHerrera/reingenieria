package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public class br extends C1325gg {
    private boolean j = false;

    public br(JSONObject jSONObject, bg bgVar) {
        super(jSONObject, bgVar);
    }

    public boolean a() {
        if (Ng.e(this.d)) {
            Hg.e(C1325gg.a, "Trigger Id not found. Not logging in-app message control impression.");
            return false;
        } else if (this.j) {
            Hg.c(C1325gg.a, "Control impression already logged for this in-app message. Ignoring.");
            return false;
        } else if (this.i == null) {
            Hg.b(C1325gg.a, "Cannot log an in-app message control impression because the AppboyManager is null.");
            return false;
        } else {
            try {
                this.i.a((bo) bx.a(this.b, this.c, this.d));
                this.j = true;
                return true;
            } catch (JSONException e) {
                this.i.a((Throwable) e);
                return false;
            }
        }
    }

    public JSONObject forJsonPut() {
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.put("is_control", true);
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }
}
