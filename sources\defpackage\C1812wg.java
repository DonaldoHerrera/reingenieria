package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: wg reason: default package and case insensitive filesystem */
public class C1812wg implements C1294fg<JSONObject> {
    private static final String a = Hg.a(C1812wg.class);
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public C1812wg(String str, String str2, String str3, String str4) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public JSONObject forJsonPut() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!Ng.d(this.b)) {
                jSONObject.put("source", this.b);
            }
            if (!Ng.d(this.c)) {
                jSONObject.put("campaign", this.c);
            }
            if (!Ng.d(this.d)) {
                jSONObject.put("adgroup", this.d);
            }
            if (!Ng.d(this.e)) {
                jSONObject.put("ad", this.e);
            }
        } catch (JSONException e2) {
            Hg.b(a, "Caught exception creating AttributionData Json.", e2);
        }
        return jSONObject;
    }
}
