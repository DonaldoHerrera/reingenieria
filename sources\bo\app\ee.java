package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class ee implements eb {
    private static final String a = Hg.a(ee.class);
    private final String b;
    private final ev c;
    private final List<ei> d = new ArrayList();
    private boolean e;

    protected ee(JSONObject jSONObject) {
        this.b = jSONObject.getString("id");
        this.c = new ex(jSONObject);
        JSONArray jSONArray = jSONObject.getJSONArray("trigger_condition");
        if (jSONArray != null && jSONArray.length() > 0) {
            this.d.addAll(fs.a(jSONArray));
        }
        this.e = jSONObject.optBoolean("prefetch", true);
    }

    public boolean a(fb fbVar) {
        if (!i()) {
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Triggered action ");
            sb.append(this.b);
            sb.append("not eligible to be triggered by ");
            sb.append(fbVar.b());
            sb.append(" event. Current device time outside triggered action time window.");
            Hg.a(str, sb.toString());
            return false;
        }
        for (ei a2 : this.d) {
            if (a2.a(fbVar)) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        return this.b;
    }

    public ev c() {
        return this.c;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject jSONObject = (JSONObject) this.c.forJsonPut();
            jSONObject.put("id", this.b);
            if (this.d != null) {
                JSONArray jSONArray = new JSONArray();
                for (ei forJsonPut : this.d) {
                    jSONArray.put(forJsonPut.forJsonPut());
                }
                jSONObject.put("trigger_condition", jSONArray);
                jSONObject.put("prefetch", this.e);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean i() {
        return j() && k();
    }

    /* access modifiers changed from: 0000 */
    public boolean j() {
        return this.c.a() == -1 || dn.a() > this.c.a();
    }

    /* access modifiers changed from: 0000 */
    public boolean k() {
        return this.c.b() == -1 || dn.a() < this.c.b();
    }

    public boolean a() {
        return this.e;
    }
}
