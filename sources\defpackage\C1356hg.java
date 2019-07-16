package defpackage;

import bo.app.bg;
import bo.app.du;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hg reason: default package and case insensitive filesystem */
public class C1356hg extends C1448kg {
    public C1356hg() {
        this.e = Qf.CENTER_CROP;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.put(C1325gg.TYPE, Tf.FULL.name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1356hg(JSONObject jSONObject, bg bgVar) {
        super(jSONObject, bgVar);
        this.e = (Qf) du.a(jSONObject, "crop_type", Qf.class, Qf.CENTER_CROP);
    }
}
