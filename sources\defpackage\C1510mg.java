package defpackage;

import bo.app.bg;
import bo.app.du;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mg reason: default package and case insensitive filesystem */
public class C1510mg extends C1325gg {
    private Vf j;
    private int k;

    public C1510mg() {
        this.j = Vf.BOTTOM;
        this.f = Wf.START;
    }

    public int b() {
        return this.k;
    }

    public Vf c() {
        return this.j;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = this.h;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            JSONObject forJsonPut = super.forJsonPut();
            forJsonPut.putOpt("slide_from", this.j.toString());
            forJsonPut.put("close_btn_color", this.k);
            forJsonPut.put(C1325gg.TYPE, Tf.SLIDEUP.name());
            return forJsonPut;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C1510mg(JSONObject jSONObject, bg bgVar) {
        this(jSONObject, bgVar, (Vf) du.a(jSONObject, "slide_from", Vf.class, Vf.BOTTOM), jSONObject.optInt("close_btn_color"));
    }

    private C1510mg(JSONObject jSONObject, bg bgVar, Vf vf, int i) {
        super(jSONObject, bgVar);
        Vf vf2 = Vf.BOTTOM;
        this.j = vf2;
        this.j = vf;
        if (this.j == null) {
            this.j = vf2;
        }
        this.k = i;
        this.e = (Qf) du.a(jSONObject, "crop_type", Qf.class, Qf.FIT_CENTER);
        this.f = (Wf) du.a(jSONObject, "text_align_message", Wf.class, Wf.START);
    }
}
