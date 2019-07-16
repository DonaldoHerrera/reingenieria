package defpackage;

import bo.app.bg;
import bo.app.du;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: lg reason: default package and case insensitive filesystem */
public class C1479lg extends C1448kg {
    public C1479lg() {
    }

    public C1479lg(JSONObject jSONObject, bg bgVar) {
        super(jSONObject, bgVar);
        String str = "crop_type";
        if (this.j.equals(Sf.GRAPHIC)) {
            this.e = (Qf) du.a(jSONObject, str, Qf.class, Qf.CENTER_CROP);
        } else {
            this.e = (Qf) du.a(jSONObject, str, Qf.class, Qf.FIT_CENTER);
        }
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.put(C1325gg.TYPE, Tf.MODAL.name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }
}
