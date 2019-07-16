package bo.app;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class ed extends ee implements eb {
    private static final String a = Hg.a(ed.class);
    private bg b;
    private String c;
    private String d;
    private String e;
    private String f;
    private long g = -1;

    public ed(JSONObject jSONObject, bg bgVar) {
        super(jSONObject);
        String str = a;
        StringBuilder sb = new StringBuilder();
        sb.append("Parsing templated triggered action with JSON: ");
        sb.append(jSONObject.toString());
        Hg.a(str, sb.toString());
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        this.c = jSONObject2.getString("trigger_id");
        JSONArray optJSONArray = jSONObject2.optJSONArray("prefetch_image_urls");
        if (optJSONArray != null) {
            this.d = optJSONArray.getString(0);
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("prefetch_zip_urls");
        if (optJSONArray2 != null) {
            this.e = optJSONArray2.getString(0);
        }
        this.b = bgVar;
    }

    public void a(String str) {
        this.f = str;
    }

    public fr d() {
        if (!Ng.d(this.d)) {
            return new fr(ez.IMAGE, this.d);
        }
        if (!Ng.d(this.e)) {
            return new fr(ez.ZIP, this.e);
        }
        return null;
    }

    /* renamed from: e */
    public JSONObject forJsonPut() {
        try {
            JSONObject e2 = super.forJsonPut();
            e2.put(C1325gg.TYPE, "templated_iam");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("trigger_id", this.c);
            JSONArray jSONArray = new JSONArray();
            if (!Ng.d(this.d)) {
                jSONArray.put(this.d);
                jSONObject.put("prefetch_image_urls", jSONArray);
            }
            JSONArray jSONArray2 = new JSONArray();
            if (!Ng.d(this.e)) {
                jSONArray2.put(this.e);
                jSONObject.put("prefetch_zip_urls", jSONArray2);
            }
            e2.put("data", jSONObject);
            return e2;
        } catch (JSONException unused) {
            return null;
        }
    }

    public long f() {
        return this.g;
    }

    public String g() {
        return this.c;
    }

    public String h() {
        return this.f;
    }

    public void a(Context context, ab abVar, fb fbVar, long j) {
        if (this.b != null) {
            this.g = j;
            String str = a;
            StringBuilder sb = new StringBuilder();
            sb.append("Posting templating request after delay of ");
            sb.append(c().d());
            sb.append(" seconds.");
            Hg.a(str, sb.toString());
            this.b.a(this, fbVar);
        }
    }
}
