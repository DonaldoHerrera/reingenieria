package defpackage;

import bo.app.bg;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jg reason: default package and case insensitive filesystem */
public class C1417jg extends C1386ig {
    public C1417jg() {
    }

    public C1417jg(JSONObject jSONObject, bg bgVar) {
        super(jSONObject, bgVar);
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.put(C1325gg.TYPE, Tf.HTML_FULL.name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }
}
