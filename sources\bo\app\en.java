package bo.app;

import org.json.JSONException;
import org.json.JSONObject;

public final class en extends eq {
    private static final String b = Hg.a(en.class);
    private String c;

    public en(JSONObject jSONObject) {
        super(jSONObject);
        this.c = jSONObject.getJSONObject("data").getString("product_id");
    }

    public boolean a(fb fbVar) {
        if (!(fbVar instanceof ff) || Ng.d(this.c)) {
            return false;
        }
        ff ffVar = (ff) fbVar;
        if (!Ng.d(ffVar.a()) && ffVar.a().equals(this.c)) {
            return super.a(fbVar);
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject forJsonPut() {
        String str = "data";
        JSONObject a = super.forJsonPut();
        try {
            a.put(C1325gg.TYPE, "purchase_property");
            JSONObject jSONObject = a.getJSONObject(str);
            jSONObject.put("product_id", this.c);
            a.put(str, jSONObject);
        } catch (JSONException e) {
            Hg.b(b, "Caught exception creating Json.", e);
        }
        return a;
    }
}
