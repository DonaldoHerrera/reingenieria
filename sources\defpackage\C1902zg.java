package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: zg reason: default package and case insensitive filesystem */
public class C1902zg implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1902zg.class);
    private final Integer b;
    private final String c;
    private final String d;
    private final String e;
    private final Integer f;
    private final Integer g;
    private final Integer h;
    private final String i;

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!Ng.d(this.c)) {
                jSONObject.put("screen_name", this.c);
            }
            if (!Ng.d(this.d)) {
                jSONObject.put("name", this.d);
            }
            if (!Ng.d(this.e)) {
                jSONObject.put("description", this.e);
            }
            if (!Ng.d(this.i)) {
                jSONObject.put("profile_image_url", this.i);
            }
            jSONObject.put("id", this.b);
            jSONObject.put("followers_count", this.f);
            jSONObject.put("friends_count", this.g);
            jSONObject.put("statuses_count", this.h);
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating twitter user Json.", e2);
        }
        return jSONObject;
    }
}
